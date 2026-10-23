A esteira do SICOW-penhor-okd (DES) foi regularizada. O módulo Penhor está disponível pelo portal: o login é feito no SICOW-portal-okd e o acesso ao módulo carrega normalmente a tela “SICOW Módulo Penhor”.

Causas e ajustes realizados:

Timeout na release: o JBoss não iniciava por erros no standalone-okd.xml, porque faltava a extensão messaging-activemq e o handler de log SICOWPENHOR não estava definido. Corrigidos a extensão, o handler e as filas DLQ/ExpiryQueue.
Deploy do .war falhando (ModuleNotFoundException: br.gov.caixa.siusr): o script assemble da imagem S2I remove a primeira linha da jboss-modules duas vezes, e o módulo não era baixado. A linha do siusr-loginModule foi duplicada, no mesmo padrão do SICOW-portal-okd.
Parâmetros ausentes (Parametro sicowportalURL veio sem valor): incluídas as system-properties no standalone-okd.xml (sicowportalURL e as URLs dos módulos).
URLs incorretas nas Libraries: SICOWPORTALURL corrigida para /sicow-portal-okd/pages/home.cef (Penhor e portal) e SICOWPENHOR_WAR corrigida no portal para https://sicow-penhor-okd-des.apps.nprd.caixa/sicowpenhor.
Falha de autenticação no módulo (Login ou Senha Invalido no SIUSR): o sicowPenhorSecurityDomain validava no des.siusr, enquanto o portal autentica no hmp.autentica. O endpoint passou a usar a variável SIUSR_END_POINT, igual ao portal.
Vinculado o grupo SICOW-BT-VAULT-SECRET-DES à release do Penhor.

Pendências para o time de desenvolvimento/SICOW:

Senha do scowdb01: o SICOW-portal-okd e o SICOW-penhor-okd registram password authentication failed no cowdb001 (10.116.92.41:5116). A senha no vault (VAULT::SICOW::SCOWDB01::1) precisa ser validada com o DBA.
Truststore com caminho duplicado no JAVA_OPTS (variável JKS_FILE).
Agente do Application Insights localizado em standalone/deployments (é implantado como aplicação). Há também retorno 402 (cota diária excedida) no recurso do App Insights.
Aplicar os ajustes nos repositórios oficiais: a jboss-modules foi alterada na branch de teste Cesti-teste. O standalone-okd.xml também precisa estar no repositório de config do Penhor, e é necessário gerar uma nova tag.
