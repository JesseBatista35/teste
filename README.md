Pelos ajustes que fizemos em HMP, o stage EC PRD precisa do mesmo tratamento. Pelo print da release, o grupo SIHDG-JBOSS8-PRD tem só 1 variável, então provavelmente falta quase tudo. Como você não tem acesso a PRD, esta é a lista para repassar ao time responsável:

1. Grupo de variáveis SIHDG-JBOSS8-PRD

Cadastrar o mesmo conjunto do HMP, com valores de produção:

DATASOURCE_CONNECTION_URL, DATASOURCE_USER_NAME, DATASOURCE_PASSWORD (banco de PRD)
JKS_FILE, PASSWORD_TRUSTSTORE e _ENV.JAVA_OPTS_APPEND, apontando para o truststore de produção, e não para o caixa-truststore-acteste-nprd.jks
SSO_URL e _ENV.SEC_URL_SERV_AUTH com o login de produção, além de SSO_REALM e SSO_RESOURCE
SIHDG-path.arquivo.sinaf, PATH_DESTINO, NFS e as propriedades SIHDG-* (e-mails, SMTP de produção etc.)

2. Secure file do truststore

O secure file de produção precisa estar na Library e autorizado para a release. A task Download Secure File do PRD deve usar um reference name que o script reconheça: padrão, DownloadSecureFile1 ou caCertificate. O script “Exportando as variáveis do arquivo Trust Store” precisa ser a versão corrigida.

3. ConfigMap jboss-config

Gerar a partir do standalone.xml, com chave standalone.xml, igual a DES/TQS/HMP. Não usar o ConfigMap_JBOSS antigo, que procura o standalone-okd.xml. O artifact de config deve apontar para a branch ou tag aprovada para produção.

4. Probes do DeploymentConfig

Probes HTTP em /sihdg-api/health, porta 8080, e não exec em /opt/jboss/bin/*Probe.sh, que não existe na imagem EAP 8:

liveness: delay 60, period 10, timeout 5, failure 6
readiness: delay 30, period 10, timeout 5, failure 5

5. SSL do SQL Server

O driver 12.6 exige SSL. Há duas opções:

Recomendado para PRD: importar a CA do certificado do SQL Server de produção no truststore, mantendo encrypt=true sem trustServerCertificate.
Paliativo: encrypt=true;trustServerCertificate=true, como em NPRD. Vale confirmar com a Segurança se é aceito em produção.

6. Rede

Liberar firewall a partir do egress IP do namespace de PRD para o banco (porta 1433), para o login de produção e para o NFS, se for usado.

A forma mais segura de não esquecer nada é comparar, task a task, o stage EC PRD com o EC HMP que agora funciona.


