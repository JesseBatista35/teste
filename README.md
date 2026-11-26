bom dia Jesse
 
bom dia....Mas pelo que identifiquei  agora está estourando outro problema que nao peguei no ambiente local...Ao abrir a página inicial de bem vindo o sistema executa a transação GJ4D (Transações Favoritas) e quebra com StringIndexOutOfBoundsException:  String index out of range: 1978 dentro da biblioteca interna do SIROT
 
mas parece q consegui contrar o problema 
 
 
@Jesse, está dando erro quando chama o convivência, pelo log no ambiente ,  é banco de dados . O JBoss não conseguiu obter uma conexão com o banco de dados....
 
vc consegue ver? no meu local funciona normalmente a comunicação com o banco de dados, pode ser alguma configuração 
 
Jesse?
 
rs
 
Gisele Cristina Dias, oi bom dia
 
desculp so finalizar uma sala aqui ja vejo
 
consegui resolver um problema , agora esta funcionando...agora tem outros kkk
 
kkkkk. jaja eu dou uma olhada 
é, acho que esse agora vou precisar de vc rs
 
jaja te chamo, estou em uma sala do pix
 
assim que finalizar eu vejo ai



 o jeferson disse isso

Mexi em um monte de coisa la ate chegar essa conclusão, se rodar novo deploy vai bagunçar tudo. então eles vão ter que arrumar o código deles 
 
 
 
 
 
 
 
 
 
 
[SIGSJ Internet - JBoss EAP 7.4] Diagnóstico e Correção da Comunicação SIROT / Mainframe
 
1. Resumo Executivo
O erro NullPointerException em SIROTTrans.getResponse(SIROTTrans.java:191) no ambiente DES (caddeapllx2854) não era falha de rede/firewall (a CHG00022105 já está ativa e a conexão com 10.116.89.101:8111 funciona normalmente), mas sim incompatibilidade de bibliotecas legadas do JBoss EAP 6 (sirotcon-ejb-lib-2.3.0.2-farm.jar e CeflogEAP-2.5.0.0.jar) rodando no JBoss EAP 7.4:
 
CeflogEAP-2.5.0.0.jar (LogFactory): Por isolamento de classloader no EAR e ausência de declaração explícita do módulo org.apache.log4j, LogFactory.getLog(SIROTTrans.class) retornava null, estourando NullPointerException na linha 191 (log.isDebugEnabled()).
sirotcon-ejb-lib-2.3.0.2-farm.jar (EJBLookup): A varredura JNDI em java:global espera "javax.naming.Context", mas no JBoss EAP 7.4 os contextos retornam "org.jboss.as.naming.NamingContext", deixando SIROTTrans.con = null.
 
 
2. Alterações Necessárias no Código-Fonte (Git / Esteira CI/CD)
Para que as próximas releases já subam compatíveis com o JBoss EAP 7.4 (sem precisar alterar bibliotecas de terceiros no Nexus), incluir os 2 arquivos abaixo no repositório:
 
 
Arquivo 1 — No módulo EAR (src/main/application/META-INF/jboss-deployment-structure.xml)
Desativa o isolamento entre subdeployments (WAR/EJB) e exporta o módulo org.apache.log4j:
 
xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-deployment-structure>
    <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
    <deployment>
        <dependencies>
            <module name="org.apache.log4j" export="true"/>
        </dependencies>
    </deployment>
</jboss-deployment-structure>
 
 
 
Arquivo 2 — No módulo WAR (src/main/java/br/gov/caixa/sigsj/internet/config/SirotStartupListener.java)
Listener executado no startup do contexto web (após todos os EJBs estarem UP) para garantir a inicialização de SIROTTrans.log e injetar o SIROTConBean via java:app:
 
 
package br.gov.caixa.sigsj.internet.config;
import java.lang.reflect.Field;import java.lang.reflect.Modifier;import javax.naming.InitialContext;import javax.naming.NameClassPair;import javax.naming.NamingEnumeration;import javax.servlet.ServletContextEvent;import javax.servlet.ServletContextListener;import javax.servlet.annotation.WebListener;import br.gov.caixa.log.Log;import br.gov.caixa.sirot.ejb.SIROTCon;import br.gov.caixa.sirot.transacoes.SIROTTrans;
@WebListenerpublic class SirotStartupListener implements ServletContextListener {
    @Overridepublic void contextInitialized(ServletContextEvent sce) {
        try {
            // 1. Garante que SIROTTrans.log nao fique null no JBoss EAP 7.4Field logField = SIROTTrans.class.getDeclaredField("log");
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(logField, logField.getModifiers() & ~Modifier.FINAL);
            logField.setAccessible(true);
            if (logField.get(null) == null) {
                Class<?> loggerClass = Class.forName("org.apache.log4j.Logger");
                Object logger = loggerClass.getMethod("getLogger", Class.class).invoke(null, SIROTTrans.class);
                Log cefLog = Log.class.getConstructor(loggerClass).newInstance(logger);
                logField.set(null, cefLog);
            }
            // 2. Injeta SIROTConBean direto via java:app (contorna falha do EJBLookup no JBoss 7.4)InitialContext ctx = new InitialContext();
            String jndiSirot = null;
            NamingEnumeration<NameClassPair> apps = ctx.list("java:app");
            while (apps.hasMoreElements()) {
                String mod = apps.next().getName();
                if (mod.contains("sirotcon-ejb")) {
                    jndiSirot = "java:app/" + mod + "/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon";
                    break;
                }
            }
            if (jndiSirot != null) {
                SIROTCon con = InitialContext.doLookup(jndiSirot);
                Field conField = SIROTTrans.class.getDeclaredField("con");
                conField.setAccessible(true);
                conField.set(null, con);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Overridepublic void contextDestroyed(ServletContextEvent sce) {
    }
}
 
 
 
3. Evidência de Validação e Observação de Massa de Dados (DES)
Status na VM caddeapllx2854: Patch validado em execução com os JARs originais intocados (backup do EAR original preservado em /root/bkp_sigsj/).
Comunicação Mainframe validada: A consulta de usuário (LoginDAOSiperImpl) e a transação GJXC (código 042085) passaram a trafegar normalmente.
Ponto funcional para análise dos devs (Massa de dados / Book COBOL em DES):
Na segunda chamada da transação GJXC durante o detalhamento de convênios do usuário de teste (0000003154995100598 — 8ª REGIÃO - PARÁ E AMAPÁ), o Mainframe retornou a mensagem truncada na posição 103 (omitindo os 14 bytes finais do campo CO-DCMTO-COL X(14)):(Verificar se o XML de mapeamento GJXC precisa de ajuste ou se é apenas cadastro incompleto desse convênio na base de DES).
text
EXECUTANDO TRANSACAO: GJXC (Cód. Proc: 042085 | Subida: 0000003154995100598)
Descida [62] [ Rajada: 1 ]: 01000000000000000000000008028ª REGIÃO - PARÁ E AMAPÁ                                              S0100
SystemException: Tamanho dos dados recebidos incorreto no RecordSet [pos=103]
 
 
 
 
 
