Boa correção, isso muda a nota. Vou ajustar pra não afirmar uma ação que a esteira não fez:

Prezados,
Em atendimento à solicitação, foi identificado o erro relatado na inicialização: falha ModuleNotFoundException: com.dinamonetworks durante o boot do JBoss EAP, indicando ausência do módulo que carrega o Provider JCA da Dinamo (br.com.trueaccess.provider.netdfence.ND, já parametrizado via -Djava.security.provider.6 na JVM).
Ação realizada:
Foi executado um novo deploy da aplicação SIABM-autenticacao-api (pod siabm-autenticacao-api-sandbox-des-13-rg72f), sem alteração manual de configuração por parte da esteira.
Resultado:
O novo pod subiu sem o erro anteriormente registrado. Os EJBs dependentes do provider criptográfico (HsmServiceImpl, JcaCryptoService) realizaram bind no JNDI normalmente, e o boot completou sem falhas de módulo (Started 1096 of 1317 services, nenhum serviço com falha).
Observação: a esteira não aplicou nenhuma alteração de módulo/classpath na imagem; a resolução ocorreu a partir de um redeploy simples. Recomendamos que a equipe de desenvolvimento confirme se houve atualização no artefato/build entre os deploys anteriores e o atual (ex: inclusão do jar da Dinamo no pacote ou no jboss-deployment-structure.xml), para documentar a causa raiz definitiva e garantir que a correção seja estável em builds futuros.
Solicitamos a validação funcional do responsável f531246 — exercitando uma chamada real de autenticação/biometria que dependa do HSM — antes do fechamento definitivo desta WO.
Atenciosamente,
Esteira DEVOPS DES TQS - NPRD
