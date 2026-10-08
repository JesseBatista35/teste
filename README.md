
-sh-4.2$
-sh-4.2$ oc exec siacc-pixautomatico-api-controle-requisicoes-tqs-69-d4nls -n siacc-tqs -c siacc-pixautomatico-api-controle-requisicoes-tqs -- ls -la /usr/src/app/secrets_files/siacc_tqs/
ls: cannot access '/usr/src/app/secrets_files/siacc_tqs/': No such file or directory
command terminated with exit code 2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siacc-pixautomatico-api-simulador-tqs-63-n5cv9 -n siacc-tqs -c siacc-pixautomatico-api-simulador-tqs -- ls -la /usr/src/app/secrets_files/siacc_tqs/
ls: cannot access '/usr/src/app/secrets_files/siacc_tqs/': No such file or directory
command terminated with exit code 2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --list | grep -iE 'DATASOURCE|SMALLRYE'
QUARKUS_DATASOURCE_JDBC_URL=jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))
QUARKUS_DATASOURCE_PASSWORD=${saccts01_oracle}
QUARKUS_DATASOURCE_USERNAME=SACCTS01
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/siacc_tqs/
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs --list | grep -iE 'DATASOURCE|SMALLRYE'
QUARKUS_DATASOURCE_JDBC_URL=jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))
# QUARKUS_DATASOURCE_PASSWORD from secret siacc-pixautomatico-api-controle-requisicoes-tqs, key QUARKUS_DATASOURCE_PASSWORD
QUARKUS_DATASOURCE_USERNAME=SACCTS01
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/siacc_tqs/
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs
deploymentconfigs "siacc-pixautomatico-api-simulador-tqs"
REVISION        STATUS          CAUSE
62              Complete        manual change
63              Complete        manual change
64              Failed          manual change
65              Failed          manual change

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --revision=65 | grep -iE 'DATASOURCE|SMALLRYE|image'
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siacc-pixautomatico-api-simulador:1.3.2.2
      QUARKUS_DATASOURCE_JDBC_URL:      jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))
      QUARKUS_DATASOURCE_PASSWORD:      ${saccts01_oracle}
      QUARKUS_DATASOURCE_USERNAME:      SACCTS01
      SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:    /usr/src/app/secrets_files/siacc_tqs/
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs --revision=63 | grep -iE 'DATASOURCE|SMALLRYE|image'
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siacc-pixautomatico-api-simulador:1.3.2.2
      QUARKUS_DATASOURCE_JDBC_URL:      jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))
      QUARKUS_DATASOURCE_USERNAME:      SACCTS01
      QUARKUS_DATASOURCE_PASSWORD:      <set to the key 'QUARKUS_DATASOURCE_PASSWORD' in secret 'siacc-pixautomatico-api-simulador-tqs'>        Optional: false
-sh-4.2$
-sh-4.2$
-sh-4.2$
