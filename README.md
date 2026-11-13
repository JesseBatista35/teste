package br.gov.caixa.sigec.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.negocio.EmpregadoService;
import br.gov.caixa.arqrefservices.negocio.UserProfile;
import br.gov.caixa.sifec.componentes.seguranca.sso.rest.AbstractSecurityRest;

@PermitAll
@RequestScoped
@Path("/userprofile")
public class UserProfileRest extends AbstractSecurityRest {

	private static final Logger LOG = Logger.getLogger(UserProfileRest.class.getSimpleName());
	private static final Properties GRUPOS_LDAP = new Properties();
	static {
		try {
			UserProfileRest.GRUPOS_LDAP
					.load(UserProfileRest.class.getClassLoader().getResourceAsStream("ldap_groups.properties"));
		} catch (IOException ioe) {
			LOG.log(Level.SEVERE, ioe.getMessage(), ioe);
		}
	}

	@Inject
	private EmpregadoService empregadoService;

	@POST
	@Path("/load")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public UserProfile loadUserProfile(@Context final HttpServletRequest request) {
		final UserProfile user = new UserProfile();
		final Empregado empregado = this.empregadoService.getEmpregadoPorMatricula(super.getUsuarioLogado());
		if (empregado == null) {
			throw new SystemException("Funcionário não encontrado no SICLI");
		}
		user.setEmpregado(empregado);
		user.getEmpregado().setNumeroIP(user.getNumeroIP(request));
		// user.setGrupoUsuarioList( this.loadgroups() );
		return user;
	}

	@POST
	@Path("/loadgroups")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> loadgroups() {
		final Set<String> roles = new TreeSet<>();
		for (Object key : UserProfileRest.GRUPOS_LDAP.keySet()) {
			if (super.possuiFuncao((String) key)) {
				roles.add(UserProfileRest.GRUPOS_LDAP.getProperty((String) key));
			}
		}
		return new ArrayList<>(roles);
	}

	@POST
	@Path("/carregarGrupos")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> carregarGrupos() {
		final Set<String> roles = new TreeSet<>();
		for (Object value : UserProfileRest.GRUPOS_LDAP.values()) {
			roles.add((String) value);
		}
		return new ArrayList<>(roles);
	}

	/**
	 * @param role
	 * @return
	 */
	@POST
	@Path("/hasRole/{role}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean hasRole(final @PathParam("role") String role) {
		return this.loadgroups().contains(role);
	}

	/**
	 * @param role
	 * @throws BusinessException
	 */
	void validarRole(final String role) throws BusinessException {
		if (!this.hasRole(role)) {
			throw new BusinessException(
					"Usu\u00E1rio logado n\u00E3o possui permiss\u00E3o para efetuar opera\u00E7\u00E3o desejada.");
		}
	}

	@GET
	@Path("/grupos")
	public String grupos() {
		final StringBuilder buffer = new StringBuilder();
		final List<String> grupos = this.loadgroups();
		if (grupos != null && !grupos.isEmpty()) {
			for (String grupo : grupos) {
				buffer.append(grupo);
				buffer.append("<br/>");
			}
		}
		return buffer.toString();
	}

}
