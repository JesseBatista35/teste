package br.gov.caixa.gitecsa.arquitetura.filter;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RateLimitFilter implements Filter {


    private static final int LIMITE = 100; 			// menor e mais controlado
    private static final long JANELA_MS = 60_000;	// 60 segundos

    private final Map<String, RequestCounter> counters = new ConcurrentHashMap<>();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // ✅ Ignorar recursos JSF e estáticos
        String uri = req.getRequestURI();
        if (isRecursoEstatico(uri)) {
            chain.doFilter(request, response);
            return;
        }

        // ✅ Limitar apenas requisições POST (evita F5)
        if (!"POST".equalsIgnoreCase(req.getMethod())) {
            chain.doFilter(request, response);
            return;
        }

        String chave = getChave(req);
        long now = System.currentTimeMillis();

        RequestCounter counter = counters.computeIfAbsent(chave, k -> new RequestCounter(now));

        // ✅ sem synchronized (melhor performance)
        if (now - counter.startTime > JANELA_MS) {
            counter.reset(now);
        }

        int total = counter.increment();

        if (total > LIMITE) {
            bloquear(res);
            return;
        }

        limparCacheAntigo(now);

        chain.doFilter(request, response);
    }

    // ✅ Ignora requisições que não devem contar
    private boolean isRecursoEstatico(String uri) {
        return uri.contains("javax.faces.resource")
                || uri.endsWith(".css")
                || uri.endsWith(".js")
                || uri.endsWith(".png")
                || uri.endsWith(".jpg")
                || uri.endsWith(".gif")
                || uri.endsWith(".ico");
    }

    // ✅ Melhor identificação do usuário
    private String getChave(HttpServletRequest req) {
        HttpSession session = req.getSession(false);

        if (session != null && session.getAttribute("usuarioLogado") != null) {
            return "USER_" + session.getAttribute("usuarioLogado");
        }

        return "IP_" + req.getRemoteAddr();
    }

    // ✅ Resposta HTTP correta
    private void bloquear(HttpServletResponse res) throws IOException {
        res.setStatus(429); // padrão correto
        res.setContentType("text/plain;charset=UTF-8");
        res.getWriter().write("Muitas requisições. Aguarde alguns segundos.");
    }

    // ✅ Evita vazamento de memória
    private void limparCacheAntigo(long now) {
        counters.entrySet().removeIf(e ->
                (now - e.getValue().startTime) > JANELA_MS);
    }

    // ✅ Classe eficiente
    static class RequestCounter {

        volatile long startTime;
        private final AtomicInteger count = new AtomicInteger(0);

        RequestCounter(long startTime) {
            this.startTime = startTime;
        }

        int increment() {
            return count.incrementAndGet();
        }

        void reset(long now) {
            this.startTime = now;
            this.count.set(0);
        }
    }

}



===========================


package br.gov.caixa.gitecsa.arquitetura.listener;

import br.gov.caixa.gitecsa.arquitetura.util.Constantes;
import br.gov.caixa.gitecsa.arquitetura.util.JSFUtil;
import br.gov.caixa.gitecsa.arquitetura.util.MensagemUtil;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

public class AuthorizationListener implements PhaseListener {

	private static final long serialVersionUID = 1L;
	private static final String STR_LOGIN = "login.xhtml";
	private static final String STR_LOGIN_PAGE = "loginPage";

	/**
	 * Implementação do afterPhase.
	 */
	@Override
	public void afterPhase(PhaseEvent arg0) {
		FacesContext facesContext = arg0.getFacesContext();
		
	    // EVITA NPE NA FASE RESTORE_VIEW
	    if (facesContext == null || facesContext.getViewRoot() == null) {
	        return;
	    }		

		String currentPage = facesContext.getViewRoot().getViewId();
		
	    if (currentPage == null) {
	        return;
	    }			

		boolean isLoginPage = (currentPage.lastIndexOf(STR_LOGIN) > -1);
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);

		if (session == null) {
			if (!isLoginPage) {
				NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
				if (currentPage.lastIndexOf(STR_LOGIN) == -1) {
					JSFUtil.addErrorMessage(MensagemUtil.obterMensagem("geral.login.sessaoExpirada"));
				}
				nh.handleNavigation(facesContext, null, STR_LOGIN_PAGE);
			}
			RequestContext.getCurrentInstance().execute("hideStatus();");
		} else {
			Object currentUser = session.getAttribute("loggedUser");

			if (!isLoginPage && (currentUser == null || currentUser == "") && session.isNew()) {
				NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
				if (currentPage.lastIndexOf(STR_LOGIN) == -1) {
					JSFUtil.addErrorMessage(MensagemUtil.obterMensagem("geral.login.sessaoExpirada"));
				}
				nh.handleNavigation(facesContext, null, STR_LOGIN_PAGE);
			} else if (!isLoginPage && (currentUser == null || currentUser == "")) {
				NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
				nh.handleNavigation(facesContext, null, STR_LOGIN_PAGE);
			}

			// Login Page: Reset "callbackUrl"
			// Page other than "/demanda/inclusao/inclusao": Set "callbackUrl"
			if (currentPage.lastIndexOf("login") != -1) {
				session.setAttribute(Constantes.CALLBACK_URL, "");
			} else if (currentPage.lastIndexOf(Constantes.VIEW_ID_INCLUSAO_DEMANDA) == -1) {
				session.setAttribute(Constantes.CALLBACK_URL, currentPage);
			}
		}
	}

	/**
	 * Implementação vazia.
	 */
	@Override
	public void beforePhase(PhaseEvent arg0) {
	    // Método obrigatório da interface, 
	    // não há necessidade de implementação		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}


======================================

nao achei 

structure



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIARG-interno
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIARG-interno

.metadata
src
main
java
resources
webapp
META-INF
paginas
resources
WEB-INF
errorpages
404.xhtml
500.xhtml
bug.xhtml
database.xhtml
expired.xhtml
templates
template_error.xhtml
template_login.xhtml
template_relatorio.xhtml
template_sem_menu.xhtml
template.xhtml
beans.xml

faces-config.xml
jboss-deployment-structure.xml
jboss-web.xml
web.xml
home.xhtml
index.xhtml
login.xhtml
selecionarCaixaPostal.xhtml
test

develop

/
src
/
main
/
webapp
/
WEB-INF
/
errorpages
errorpages

New

Contents
History

404.xhtml
25 de mar.
5f7b1eaf
Migração inicial para JBoss 7.4 com java 1.8 c643020
500.xhtml
25 de mar.
5f7b1eaf
Migração inicial para JBoss 7.4 com java 1.8 c643020
bug.xhtml
25 de mar.
5f7b1eaf
Migração inicial para JBoss 7.4 com java 1.8 c643020
database.xhtml
25 de mar.
5f7b1eaf
Migração inicial para JBoss 7.4 com java 1.8 c643020
expired.xhtml
25 de mar.
5f7b1eaf
Migração inicial para JBoss 7.4 com java 1.8 c643020


e tem esse outro repo de config



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIARG-interno-config
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIARG-interno-config

configuration
certificado
des
tqs
vault-des
vault-hmp
vault-prd
vault-tqs
httpd
00-mpm.conf
httpd.conf
vhost.conf
jboss

jboss-custom.cli
jboss-deployments
jboss-modules-custom
standalone-full-ha.xml
standalone.conf
README.md

master

/
configuration
/
certificado
certificado

New

Contents
History

des
22 de abr.
3ce438f7
Deleted d Murilo Silva Andrade Souza
tqs
24 de abr.
fc66702b
Deleted 1 Murilo Silva Andrade Souza
