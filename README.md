Pessoal, atualização do SIGSJ-intranet (DES):

✅ Release SIGSJ-intranet-38 concluída com sucesso, com todas as etapas verdes, incluindo o Check Deployments, na caddeapllx955. A aplicação está no ar no contexto /sigsj_intranet (e /sigsjintrastatic para os conteúdos estáticos).

O que foi ajustado hoje:

SIROT: a aplicação passou a levar o sirotcon-ejb empacotado no EAR, junto com as libs de que ele depende (CeflogEAP e ceflib). Com isso, o deploy externo do SIROT pela esteira (jboss-deployments) foi retirado. Os dois juntos geravam conflito no JBoss (WFLYEE0047 ... java:global/SERVER), e esse era o motivo do FAILED de hoje.
Datasource SIGSJ04 (Oracle): configurada e conectando normalmente.
Release: voltou a apontar para a branch feature/ajustes-standalone-eap74, onde estão os ajustes do standalone.

Pontos para o PR da feature/ajustes-standalone-eap74 para a master:

SIROT: manter o jboss-deployments sem a linha do sirotcon-ejb externo (fica só o driver Oracle, se for usado).
Credenciais: levar o usuário e a senha do banco do standalone-full-ha.xml para variáveis da Library, com a senha como secreta, em vez de ficarem no arquivo.
Driver Oracle: usar um único caminho, ou o módulo oracle ou o ojdbc8.jar implantado pela esteira. Hoje os dois estão ativos.
log4j externo: o arquivo /log_jboss/config-log4j/sigsj_intranet.xml, que a aplicação usa, foi criado manualmente no servidor. Ele precisa ser incluído no repositório de config para a esteira criá-lo automaticamente.

Quando o PR estiver pronto, nos avisem que acompanhamos a release a partir da master.
