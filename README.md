RELATORIO - Migracao SIGEC Portabilidade (Java 17 / JBoss EAP 7.4)
Jesse e Jeferson | 18/11/2026 | Continuidade: Fabio

============================================================
ONLINE  (branch Cesti-test-001, profile -Ponline, host caddeapllx2871)
============================================================
Status: JBoss de pe. framework.jar, framework_sisgd.jar e wmq.jmsra.rar OK.
        gec-ear.ear ainda falha (ELY01148 nos WARs gec-web e gec-api).
        Sem URL disponivel por enquanto (qualquer URL daria 404).

Alteracoes feitas

1) Repo de config (SIGEC-portabilidade-config / jboss)
 - standalone-full-ha.xml migrado para Elytron (seguranca legada removida;
   boot OK no EAP 7.4.18 / JDK 17), com datasources DB2, filas e connection
   factories remoteJMS e adaptador wmq.jmsra.rar.
 - Credenciais removidas do arquivo (uso de vault).

2) gec-web / pom.xml
 - arqref-web, arqref-services, poi e poi-ooxml estavam "provided" (herdado do
   dependencyManagement do pom raiz) e nao iam para o WEB-INF/lib.
   Passaram a scope compile somente neste modulo.
 - Corrigiu: ClassNotFoundException arqrefweb.controle.AppServlet e
   Weld XSSFWorkbook (ExportaArquivoUtil).

3) gec-ear / jboss-deployment-structure.xml
 - sub-deployment gec-web.war com dependencias em deployment.framework.jar e
   deployment.framework_sisgd.jar (confirmado no EAR implantado).

4) gec-ejb (Sonar - S1948)
 - "transient" em CamposRetornados, PedidoPortabilidade e Portabilidade
   (campos List nao serializaveis). Sem mudanca de comportamento.

5) gec-web / rest/dev/ProcessadorDevRest
 - Injecao do TransferenciaEletronicaLegacyCallNCR trocada para Instance<>
   (resolucao tardia), evitando WELD-001408 que derrubava o EAR inteiro.
 - Incluido ProcessadorDevRestTest (4 testes) para cobertura de codigo novo
   no Quality Gate (>= 80%). Os testes sao aditivos e podem ser mantidos ou
   removidos conforme a decisao sobre cobertura.

PENDENCIAS ONLINE

 a) ELY01148 (gec-web e gec-api) - causa provavel identificada:
    No standalone do 2871, o application-security-domain "other" do Undertow
    aponta para keycloak-http-authentication e o subsistema keycloak legado
    (secure-deployment de gec-web.war e gec-api.war) continua ativo. Os dois
    registram o dominio de seguranca no mesmo classloader.
    Teste proposto (jboss-cli no 2871):
      A) "other" -> security-domain ApplicationDomain (preserva o SSO);
      B) se persistir, remover tambem o subsistema keycloak (como o Jeferson
         fez no batch/2884; desliga o SSO Keycloak, a tratar depois).
    Fix permanente: no repo SIGEC-portabilidade-config, via branch/PR,
    comparando com o master atual; depois recriar o artifact "config" da
    release do online com a versao nova do commit.

 b) NoClassDefFoundError org.apache.commons.lang3.StringUtils (gec-ejb):
    commons-lang3 esta "provided" no pom raiz e nao vai para o lib/ do EAR.
    Fix pronto: gec-ear/pom.xml com scope compile para commons-lang3,
    commons-collections, commons-codec, guava, reflections e swagger-*
    (arquivo gec-ear_pom.xml). AINDA NAO COMMITADO / NAO VALIDADO.

 c) Timeout para sb-credito-des.servicebus.windows.net (Azure Service Bus,
    "not active within PT30S"): rede/proxy da VM. Nao bloqueia o deploy.

 d) Confirmar se TransferenciaEletronicaLegacyCallNCR tem implementacao
    visivel no online (pode existir apenas no gec-batch).

 e) URL: depois do deploy OK, criar VIP + certificado (HTTPS).
    O nome "sigec" so sera usado quando o legado for desligado.

============================================================
BATCH  (host caddeapllx2884)  - informado pelo Jeferson
============================================================
 - Standalone com datasources DB2 (Siemp, Sigec, Sifec), filas remoteJMS e
   wmq.jmsra.rar; Weld com require-bean-descriptor=false.
 - ELY01148 resolvido: subsistema keycloak legado removido e dominio "other"
   vinculado ao ApplicationDomain.
 - beans.xml do gec-ejb com bean-discovery-mode="all" (WELD-001408 nos DAOs).
   >> DECISAO DO FABIO: ele prefere manter "annotated". Avaliar.
 - jboss-deployment-structure (batch): remover
   <resource-root path="gec-ejb.jar"/> (duplo carregamento de ClassLoader).
 - Implementar getNomeFluxo() em AcatamentoAutomaticoIndependenteContaSalario-
   Bean e TEDSolicitacaoExternaBean (AbstractMethodError).
 - 293 classes duplicadas entre gec-ejb.jar e gec-batch.jar: gec-batch deve
   depender do gec-ejb com scope provided. Validar: "Classes duplicadas: 0".

============================================================
ESTEIRA
============================================================
 - Release do batch recriada com os artifacts corretos (batch, config na
   versao do commit do repo de config, esteira-jboss-vm-v2, terraform-esteira).

============================================================
DECISOES / ALINHAMENTOS
============================================================
 - Fabio segue com o BATCH e depois o ONLINE. Logs pedidos na sala (ele nao
   tem acesso ao servidor).
 - Sonar: cobertura de codigo novo >= 80% reprova o Quality Gate. Fabio avalia
   desligar/ajustar com o time de Sonar.
 - Rename do "online" na esteira: ficara para depois do online verde, como
   mudanca isolada (risco de nova VM / segunda instancia na mesma VM).
 - Rotacionar senhas que ficaram expostas no standalone antigo.
