Fabio, causa do gec-ear.ear.failed no batch (caddeapllx2884):

O gec-api.war não sobe. O JaxRsActivator (linha 58) chama io.swagger.jaxrs.config.BeanConfig.setScan, que usa org.apache.commons.lang3.StringUtils e dá NoClassDefFoundError. Conferi o EAR (unzip -l gec-ear.ear | grep lang3) e não tem commons-lang3 empacotado.
Correção: no gec-ear/pom.xml, dependência commons-lang3 com scope compile, para entrar no lib/ do EAR, e novo build.
Já deixo um aviso: no mesmo boot aparecem vários WELD-000119 no gec-api.war porque org.keycloak.KeycloakPrincipal também não é encontrado. Os REST de PessoasFisicas e Portabilidade ficam sem bean. Provavelmente é o adapter Keycloak, que o EAP 7.4 não traz.
Os demais deployments estão OK. Só o gec-ear.ear fica FAILED, e por isso a task Check Deployments faz 2 loops de 60 tentativas (~11 min).

Segue o server.log (boot das 12:06) e o gec-ear.ear.failed.
