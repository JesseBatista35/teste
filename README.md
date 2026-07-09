Segue nota pronta pra colar na WO0000080963432:

Prezados,
Em atendimento à solicitação, foi identificada a causa raiz do erro de inicialização relatado: o módulo JBoss com.dinamonetworks — necessário para carregar o Provider JCA da Dinamo — não estava presente na instância JBoss EAP da aplicação SIABM-autenticacao-api, gerando a falha ModuleNotFoundException: com.dinamonetworks durante o boot (WFLYSRV0179: Failed to load module).
Ação realizada:
Seguindo a documentação oficial da Dinamo (Integração → JCA/JCE → Instalação Manual), foi criado o módulo com.dinamonetworks em $JBOSS_HOME/modules/system/layers/base/com/dinamonetworks/main/, contendo o pacote dinamo-hsm-4.16.0.jar e o respectivo module.xml referenciando o provider br.com.trueaccess.provider.netdfence.ND já parametrizado via -Djava.security.provider.6.
Evidência de correção:
Novo deploy do pod (siabm-autenticacao-api-sandbox-des-13-rg72f) subiu sem o erro anteriormente registrado. Os EJBs dependentes do provider criptográfico (HsmServiceImpl, JcaCryptoService) realizaram bind no JNDI normalmente, e o boot completou sem falhas de módulo (Started 1096 of 1317 services, nenhum serviço com falha).
Solicitamos a validação funcional do responsável f531246 — especificamente exercitando uma chamada real de autenticação/biometria que dependa do HSM — para confirmar que o provider está operacional em runtime, e não apenas carregado, antes do fechamento definitivo desta WO.
Atenciosamente,
Esteira DEVOPS DES TQS - NPRD
