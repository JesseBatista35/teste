Veja a sequência com as URLs (no 473; o comando agrupa as linhas repetidas):

LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
sudo grep -E "^15:17:" $LOG | grep "org.keycloak" | grep -v "Policy enforcement" | sed -E 's/^[0-9:,]+ //' | uniq -c | tail -80

Interessa o que vem logo depois das linhas invoke https://.../workflow-credito-pj-web/api/perfil-acesso-usuario:

Aparece checking whether to refresh depois do PJ: o PJ tem token na sessão, e o problema está no código ao ler as roles.
checking whether to refresh só depois de URLs do /fec-web/: confirma que só o fec-web está autenticado e o PJ não.

E desligue o TRACE (se ainda não fez), porque ele gera muita linha:

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=INFO)




[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -E "^15:17:" $LOG | grep "org.keycloak" | grep -v "Policy enforcement" | sed -E 's/^[0-9:,]+ //' | uniq -c | tail -80
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/backbone-relational.js
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/usuario.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/usuario.js
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/unidade.js
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/empregado.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/unidade.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/empregado.js
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/municipio.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/municipio.js
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages.properties?_=1793902628596
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages.properties?_=1793902628596
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html?_=1793902628596
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages_pt.properties?_=1793902628597
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages_pt.properties?_=1793902628597
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/userprofile/loadgroups
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/userprofile/loadgroups
    122 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/userprofile/load
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/userprofile/load
    245 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/fec-web/dashboard.html
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/version
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/dashboard.html
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/version
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/dashboard/dashboard.js?_=1793902628598
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/dashboard/dashboard.js?_=1793902628598
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/menu/fec
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/menu/fec
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/fec-web/require/lib/require.js?_=1793902628599
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/token/json
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/token/json
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/require/lib/require.js?_=1793902628599
      1 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/require/main.js?_=1793902628600
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/require/main.js?_=1793902628600
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902628602
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902628602
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902628603
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902628603
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902628604
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902628604
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902628605
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902628605
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902628606
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902628606
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902628607
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902628607
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902628608
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902628608
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631246
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631246
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902631276
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902631275
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902631275
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902631276
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902631275
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902631275
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902631291
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902631291
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902631292
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902631292
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-13) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631293
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-13) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631293
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631293
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631293
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
      1 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-14) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
      1 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-14) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902631294
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$




[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=INFO)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /]

