Oi Sandra, tudo bem?

O deploy do SIHDG-jboss8 em HMP foi normalizado. A release 3.24.0.1 rodou com sucesso no stage EC HMP e a aplicação subiu sem erros (datasource sihdgDS conectado, health respondendo 200 e login via login.hmp.caixa).

Ajustes realizados:

1. Secure file / truststore: o script "Exportando as variáveis do arquivo Trust Store" não reconhecia o secure file baixado com o reference name caCertificate e gravava o caminho vazio, o que quebrava a task "Adicionando Multiplas Secrets". O script foi ajustado para reconhecer esse nome e validar o arquivo antes de seguir.

2. ConfigMap jboss-config: o stage HMP procurava o arquivo standalone-okd.xml, que não existe na branch jboss-8.0 do SIHDG-jboss8-config. Ajustado para usar o standalone.xml com a mesma chave usada em DES/TQS.

3. Probes do DeploymentConfig: as probes de HMP apontavam para /opt/jboss/bin/livenessProbe.sh e readinessProbe.sh (padrão da imagem JBoss 7), que não existem na imagem EAP 8. Foram alteradas para probe HTTP em /sihdg-api/health (porta 8080), igual ao DES.

4. Conexão com o banco: a DATASOURCE_CONNECTION_URL do grupo SIHDG-JBOSS8-HMP recebeu encrypt=true;trustServerCertificate=true, no mesmo padrão de DES/TQS. O driver SQL Server 12.6 exige SSL por padrão e falhava com erro PKIX.

Pode, por favor, validar o funcionamento da aplicação em HMP? Se notar qualquer comportamento diferente, me avisa.

Obrigado!
