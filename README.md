Bom dia, Sandra! Tudo bem?

Traduzindo: o JBoss subiu sem o datasource do banco (sihdgDS), por isso a aplicação não inicializa. Não é falha de conexão com o banco, a configuração do datasource nem chegou ao servidor.

É o mesmo erro que tivemos em HMP. O stage de PRD ainda usa a task antiga de ConfigMap, que gera o arquivo com o nome standalone-okd.xml. O pod procura standalone.xml, não encontra e sobe com a configuração padrão da imagem, sem datasource.

O que precisa ser ajustado no stage EC PRD, igual ao que foi feito em HMP:
1. ConfigMap jboss-config gerado a partir do standalone.xml, com a chave standalone.xml (resolve este erro).
2. Probes do DeploymentConfig como HTTP em /sihdg-api/health (porta 8080), no lugar dos scripts /opt/jboss/bin/*Probe.sh, que não existem na imagem EAP 8.
3. Conexão SSL com o SQL Server: importar a CA do certificado do banco de PRD no truststore, ou usar trustServerCertificate=true na URL, se a Segurança aceitar. Sem isso, o próximo erro será PKIX.

Um ponto para confirmar: rodaram a release 3.22.0.5 (ear 3.22.0.4), mas a versão validada em HMP foi a 3.24.0.1. Vale confirmar qual versão deve ir para PRD.

O ideal é o time de PRD comparar o stage EC PRD com o EC HMP, que está funcionando. Fico à disposição!
