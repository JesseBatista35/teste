Vamos liberar temporariamente (CLI do 471, sem restart):

1. Confira o nível geral (root). O esperado é INFO:

/profile=full-ha-sifec-intranet/subsystem=logging/root-logger=ROOT:read-attribute(name=level)

Se vier INFO, pode seguir. Se vier DEBUG ou ALL, pare e me avise, porque o log ia explodir.

2. Garanta que o Keycloak está em DEBUG e libere o arquivo:

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=DEBUG)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=DEBUG)

Com o root em INFO, só os três loggers que ligamos (org.keycloak, br.gov.caixa.wpj, br.gov.caixa.intgr) vão gravar DEBUG. O resto continua igual.

3. Peça o teste (login novo na InPrivate e abrir o PJ) e rode no 473:

LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
sudo grep -nE "DEBUG \[(org\.keycloak|br\.gov\.caixa)" $LOG | tail -80

Pode me mandar a saída. Agora deve aparecer o fluxo do Keycloak e o que o PJ faz ao montar o perfil.

Quando terminarmos, desfaça com:

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)




sudo grep -nE "DEBUG \[(org\.keycloak|br\.gov\.caixa)" $LOG | tail -80

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
281743:15:12:31,427 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
281744:15:12:31,428 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
281745:15:12:31,428 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281795:15:12:31,447 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
281796:15:12:31,447 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
281797:15:12:31,447 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281798:15:12:31,468 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/init/load-angular-helper.js
281799:15:12:31,469 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/init/load-angular-helper.js
281800:15:12:31,469 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281801:15:12:31,477 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/init/page-config.json
281802:15:12:31,477 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/init/page-config.json
281803:15:12:31,477 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281804:15:12:31,487 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/ng-root.html
281805:15:12:31,487 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/ng-root.html
281806:15:12:31,487 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281807:15:12:31,513 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902155406
281808:15:12:31,513 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902155406
281809:15:12:31,513 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281810:15:12:31,522 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902155407
281811:15:12:31,522 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902155407
281812:15:12:31,522 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281813:15:12:31,537 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902155408
281814:15:12:31,537 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902155408
281815:15:12:31,537 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281816:15:12:31,551 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902155409
281817:15:12:31,552 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902155409
281818:15:12:31,552 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281819:15:12:31,910 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
281820:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
281821:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281822:15:12:31,910 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902155410
281823:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902155410
281824:15:12:31,911 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281825:15:12:31,921 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902155411
281826:15:12:31,922 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902155411
281827:15:12:31,922 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281828:15:12:31,970 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902155412
281829:15:12:31,970 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902155412
281830:15:12:31,970 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281831:15:12:32,049 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902351999
281832:15:12:32,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902351999
281833:15:12:32,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281834:15:12:32,072 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902352021
281835:15:12:32,072 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902352021
281836:15:12:32,072 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281837:15:12:32,073 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902352022
281838:15:12:32,073 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902352022
281839:15:12:32,073 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281840:15:12:32,074 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902352020
281841:15:12:32,074 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902352020
281842:15:12:32,074 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281843:15:12:32,088 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/fec-web/layout/img/glyphicons-halflings.png
281844:15:12:32,088 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/img/glyphicons-halflings.png
281845:15:12:32,088 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281846:15:12:32,089 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902352037
281895:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902352037
281896:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281897:15:12:32,089 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902352040
281898:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902352040
281899:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281900:15:12:32,091 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352041
281901:15:12:32,091 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352041
281902:15:12:32,091 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281903:15:12:32,091 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352043
281904:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352043
281905:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
281906:15:12:32,092 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352044
281907:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352044
281908:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281909:15:12:32,094 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352045
281910:15:12:32,094 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352045
281911:15:12:32,094 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281912:15:12:32,095 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352046
281913:15:12:32,095 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352046
281914:15:12:32,095 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281915:15:12:32,100 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
281916:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
281917:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281918:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html
281919:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -nE "DEBUG \[(org\.keycloak|br\.gov\.caixa)" $LOG | tail -80
281743:15:12:31,427 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
281744:15:12:31,428 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/login/workflow-credito-pj-web
281745:15:12:31,428 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281795:15:12:31,447 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
281796:15:12:31,447 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/dashboard.json
281797:15:12:31,447 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281798:15:12:31,468 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/init/load-angular-helper.js
281799:15:12:31,469 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/init/load-angular-helper.js
281800:15:12:31,469 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281801:15:12:31,477 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/init/page-config.json
281802:15:12:31,477 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/init/page-config.json
281803:15:12:31,477 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281804:15:12:31,487 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/ng-root.html
281805:15:12:31,487 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/ng-root.html
281806:15:12:31,487 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281807:15:12:31,513 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902155406
281808:15:12:31,513 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/runtime.743195ed2393be22126b.js?_=1793902155406
281809:15:12:31,513 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281810:15:12:31,522 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902155407
281811:15:12:31,522 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/polyfills.e557f33003cd5b65e2f6.js?_=1793902155407
281812:15:12:31,522 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281813:15:12:31,537 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902155408
281814:15:12:31,537 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/styles.9a6ec27774eb77a4ad4a.js?_=1793902155408
281815:15:12:31,537 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281816:15:12:31,551 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902155409
281817:15:12:31,552 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/main.b31f313a7a47b2127d52.js?_=1793902155409
281818:15:12:31,552 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281819:15:12:31,910 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
281820:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/0.d8efdd927a62d3fff389.js
281821:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281822:15:12:31,910 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902155410
281823:15:12:31,910 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/bootstrap-collapse.js?_=1793902155410
281824:15:12:31,911 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281825:15:12:31,921 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902155411
281826:15:12:31,922 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/ckeditor/ckeditor.js?_=1793902155411
281827:15:12:31,922 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281828:15:12:31,970 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902155412
281829:15:12:31,970 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/ng/assets/js/gzip-support-helper.js?_=1793902155412
281830:15:12:31,970 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281831:15:12:32,049 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902351999
281832:15:12:32,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902351999
281833:15:12:32,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281834:15:12:32,072 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902352021
281835:15:12:32,072 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/natureza-juridica?z=1793902352021
281836:15:12:32,072 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281837:15:12:32,073 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902352022
281838:15:12:32,073 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/motivo-situacoes/verifica-rejeicao-mtr?z=1793902352022
281839:15:12:32,073 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281840:15:12:32,074 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902352020
281841:15:12:32,074 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/favoritos?paginaAtual=1&itensPorPagina=10&ordenarPor=razaoSocial&ordenarOrdem=ASC&filtroPesquisa=&z=1793902352020
281842:15:12:32,074 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281843:15:12:32,088 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/fec-web/layout/img/glyphicons-halflings.png
281844:15:12:32,088 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/img/glyphicons-halflings.png
281845:15:12:32,088 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281846:15:12:32,089 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902352037
281895:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/novidade/destaque?z=1793902352037
281896:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
281897:15:12:32,089 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902352040
281898:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/quadro-comunicacao/tipos-comunicacao?z=1793902352040
281899:15:12:32,089 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
281900:15:12:32,091 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352041
281901:15:12:32,091 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352041
281902:15:12:32,091 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281903:15:12:32,091 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352043
281904:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352043
281905:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
281906:15:12:32,092 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352044
281907:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352044
281908:15:12:32,092 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281909:15:12:32,094 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352045
281910:15:12:32,094 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352045
281911:15:12:32,094 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281912:15:12:32,095 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352046
281913:15:12:32,095 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793902352046
281914:15:12:32,095 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281915:15:12:32,100 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-11) adminRequest https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
281916:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/assets/img/loading.gif
281917:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
281918:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html
281919:15:12:32,100 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-11) Policy enforcement is disabled.
[p585600@cbrdeapllx473 ~]$ LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -nE "DEBUG \[(org\.keycloak|br\.gov\.caixa)" $LOG | tail -80
289916:15:13:26,237 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
289967:15:13:26,237 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/resources/js/comp/ui-controls.js
289968:15:13:26,237 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/js/comp/ui-controls.js
289969:15:13:26,237 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290020:15:13:26,239 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/resources/js/comp/userProfile.js
290021:15:13:26,240 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/js/comp/userProfile.js
290022:15:13:26,240 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290073:15:13:26,247 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/resources/js/global.js
290074:15:13:26,247 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/js/global.js
290075:15:13:26,247 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
290076:15:13:26,247 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/js/backbone-relational.js
290125:15:13:26,247 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/backbone-relational.js
290126:15:13:26,247 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290180:15:13:26,248 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/resources/js/global-services.js
290181:15:13:26,248 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/js/global-services.js
290182:15:13:26,248 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
290233:15:13:26,257 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/usuario.js
290234:15:13:26,258 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-10) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/unidade.js
290235:15:13:26,258 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/municipio.js
290236:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/unidade.js
290237:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-10) Policy enforcement is disabled.
290238:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/municipio.js
290239:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/usuario.js
290240:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290241:15:13:26,258 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
290401:15:13:26,259 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/js/util/modelo/empregado.js
290402:15:13:26,259 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/js/util/modelo/empregado.js
290403:15:13:26,259 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290457:15:13:26,263 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/layout/js/scripts.js
290458:15:13:26,263 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/js/scripts.js
290459:15:13:26,263 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290510:15:13:26,278 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages.properties?_=1793902406112
290511:15:13:26,278 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages.properties?_=1793902406112
290512:15:13:26,278 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290513:15:13:26,278 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html?_=1793902406112
290514:15:13:26,278 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290568:15:13:26,281 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/layout/js/moment.min.js.map
290569:15:13:26,281 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/js/moment.min.js.map
290570:15:13:26,281 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290571:15:13:26,281 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/error404.html
290572:15:13:26,281 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290618:15:13:26,289 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages_pt.properties?_=1793902406113
290619:15:13:26,289 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/resources/bundle/Messages_pt.properties?_=1793902406113
290620:15:13:26,289 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290674:15:13:26,309 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/userprofile/loadgroups
290675:15:13:26,309 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/userprofile/loadgroups
290676:15:13:26,309 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290732:15:13:26,872 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/userprofile/load
290733:15:13:26,872 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/userprofile/load
290734:15:13:26,872 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290807:15:13:26,904 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/version
290808:15:13:26,904 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/dashboard.html
290809:15:13:26,904 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/dashboard.html
290810:15:13:26,904 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
290811:15:13:26,904 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/version
290812:15:13:26,904 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
290867:15:13:26,905 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/layout/img/ico/favicon.png
290868:15:13:26,905 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/img/ico/favicon.png
290869:15:13:26,905 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
290967:15:13:26,916 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/dashboard/dashboard.js?_=1793902406114
290968:15:13:26,916 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/dashboard/dashboard.js?_=1793902406114
290969:15:13:26,916 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
291025:15:13:26,941 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/menu/fec
291026:15:13:26,941 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/menu/fec
291027:15:13:26,942 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
291076:15:13:26,991 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/layout/css/font-awesome/fonts/fontawesome-webfont.woff2?v=4.6.3
291077:15:13:26,991 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/layout/css/font-awesome/fonts/fontawesome-webfont.woff2?v=4.6.3
291078:15:13:26,991 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
291131:15:13:27,033 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/emprest/app/token/json
291132:15:13:27,033 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/emprest/app/token/json
291133:15:13:27,033 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
291134:15:13:27,034 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-9) adminRequest https://migracaosifec.des.caixa/fec-web/require/lib/require.js?_=1793902406115
291135:15:13:27,034 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/require/lib/require.js?_=1793902406115
291136:15:13:27,034 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-9) Policy enforcement is disabled.
291241:15:13:27,049 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/fec-web/require/main.js?_=1793902406116
291242:15:13:27,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/fec-web/require/main.js?_=1793902406116
291243:15:13:27,049 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
291299:15:13:33,081 DEBUG [org.keycloak.adapters.PreAuthActionsHandler] (default task-12) adminRequest https://migracaosifec.des.caixa/workflow-credito-pj-web/api/cliente/cnpj/03756362000103?z=1793902412888
291300:15:13:33,081 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) AuthenticatedActionsValve.invoke https://migracaosifec.des.caixa/workflow-credito-pj-web/api/cliente/cnpj/03756362000103?z=1793902412888
291301:15:13:33,081 DEBUG [org.keycloak.adapters.AuthenticatedActionsHandler] (default task-12) Policy enforcement is disabled.
[p585600@cbrdeapllx473 ~]$
