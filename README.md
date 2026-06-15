RELATORIO TECNICO - WO SIGMS MOTOR DECISAO

Aplicacao: sigms-motor-decisao-des
Ambiente: Desenvolvimento (DES)
Cluster: aks-push-nprd
Data: 15/06/2026

RESUMO

A aplicacao sigms-motor-decisao-des estava com pods em estado Degraded e Progressing. O problema foi diagnosticado e resolvido em duas fases.

PROBLEMA 1 - RESOLVIDO

O arquivo config.yaml tinha a toleracao configurada com valor vazio:

tolerations:
  - key: nuvem.caixa/nodepoolname
    effect: NoSchedule
    operator: Equal
    value: ""

Isso impedia que o pod fosse alocado em qualquer no do cluster, pois nenhum no tinha um taint correspondente com valor vazio.

Resolucao: Preenchimento do valor vazio com o node pool correto identificado no Azure Portal: appsigms

tolerations:
  - key: nuvem.caixa/nodepoolname
    effect: NoSchedule
    operator: Equal
    value: appsigms

Resultado: Pod foi alocado com sucesso no node aks-appsigms-38096017-vmss00008v e esta sendo criado corretamente.

Status: RESOLVIDO

PROBLEMA 2 - ACAO NECESSARIA PARA TIME DESENVOLVIMENTO

Apos o primeiro problema ser resolvido, o pod iniciou mas os health checks comecaram a falhar com erro 404 nos endpoints de liveness e readiness probe.

Analise dos logs da aplicacao revelou:

ERROR Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc

Causa: O driver Oracle JDBC nao esta incluido na imagem Docker. A aplicacao esta tentando usar oracle.jdbc.driver.OracleDriver mas o JAR nao existe dentro do container.

Configuracao do banco de dados foi validada e esta correta no ConfigMap cm-sigms-motor-decisao:

QUARKUS_DATASOURCE_DRIVER: oracle.jdbc.driver.OracleDriver
QUARKUS_DATASOURCE_URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
QUARKUS_DATASOURCE_USERNAME: SGMSDS01
QUARKUS_DATASOURCE_PASSWORD: npjJW4

Proxy esta configurado corretamente. O unico problema e a ausencia do driver Oracle JDBC na imagem.

Status: PENDENTE - REQUER ACAO DO TIME DESENVOLVIMENTO

O QUE O TIME DE DESENVOLVIMENTO PRECISA FAZER

1. Adicionar dependencia Oracle JDBC ao pom.xml do projeto sigms-motor-decisao-infranprd:

<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc11</artifactId>
    <version>23.2.0.0</version>
</dependency>

2. Fazer rebuild da imagem Docker com a nova dependencia

3. Push da nova imagem para o Azure Container Registry

4. Atualizar a tag da imagem no config.yaml do repositorio

5. Fazer commit e push das alteracoes para o Git

6. Validar sincronizacao no Argo CD e confirmar que os health checks estao passando

RESUMO DAS ACOES REALIZADAS PELO DEVOPS

- Verificou node pools no Azure Portal
- Identificou appsigms como node pool correto
- Atualizou config.yaml com a toleracao preenchida
- Argo CD sincronizou automaticamente
- Pod foi alocado com sucesso
- Diagnosticou problema do driver Oracle JDBC ausente

PROXIMA ETAPA

Aguardar que o time de desenvolvimento implemente as acoes descritas acima para incluir o driver Oracle JDBC na imagem Docker. Apos isso, a aplicacao devera iniciar corretamente e os health checks comecaram a funcionar.

CONCLUSAO

Problema inicial foi resolvido no escopo de DevSecOps. O pod agora esta sendo alocado corretamente no node pool apropriado. O novo problema encontrado e de escopo de desenvolvimento e requer inclusao de dependencia no pom.xml e rebuild da imagem Docker.
