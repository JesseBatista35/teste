
[root@caddeapllx1369 p585600]# curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=raw" -o /tmp/raw.json
[root@caddeapllx1369 p585600]# grep -oiE "jdk[^\"]*|temurin[^\"]*" /tmp/raw.json | sort -u
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# curl -s "http://binario.caixa:8081/service/rest/v1/repositories" | grep -oE '"name" *: *"[^"]*"'
"name" : "nuget-hosted"
"name" : "maven-snapshots"
"name" : "apache-snapshots"
"name" : "caixa-repo"
"name" : "central"
"name" : "releases"
"name" : "SIGAL-UI"
"name" : "jCenter"
"name" : "npm-registry"
"name" : "mvnrepository.com"
"name" : "pypi-repo"
"name" : "docker-proxy"
"name" : "rubygem-group"
"name" : "curso-openshift"
"name" : "SIBOT-motor-oracle"
"name" : "node-sass"
"name" : "node-sass-group"
"name" : "habitacao"
"name" : "npm-internal2"
"name" : "cepem2"
"name" : "caixa-group-br"
"name" : "teste"
"name" : "caixa-cartoes-maven-releases"
"name" : "caixa-php-releases"
"name" : "caixa-adapters-zip"
"name" : "caixa-npm-releases"
"name" : "AppAuth-Android"
"name" : "gradle-android-dist"
"name" : "releases-pdgo"
"name" : "Financeiro"
"name" : "caixa-raw-thirdparty"
"name" : "SISRH-MAP-PWC"
"name" : "caixa-qa-evidencia"
"name" : "caixa-qa-produtos"
"name" : "caixa-repo-conda-forge"
"name" : "quay.io"
"name" : "nodejs"
"name" : "registry-http-npmjs"
"name" : "ibm-mobile-sdk"
"name" : "caixa-repo-topaz"
"name" : "artefato-prd-snapshot"
"name" : "caixa-repo-dma-maven-releases"
"name" : "caixa-raw-evidence"
"name" : "nuget.org-proxy"
"name" : "maven-central"
"name" : "Arquitetura_TI"
"name" : "sp"
"name" : "jboss-repo"
"name" : "snapshots"
"name" : "public"
"name" : "SIGAL-REQUEST"
"name" : "Google"
"name" : "microblink"
"name" : "caixa-adapters"
"name" : "docker-hosted"
"name" : "loterias"
"name" : "cepem"
"name" : "caixa-repo-anaconda"
"name" : "siavl"
"name" : "maven-fabric"
"name" : "caixa-cartoes-maven-snapshots"
"name" : "caixa-php-snapshots"
"name" : "IBM"
"name" : "caixa-npm-snapshots"
"name" : "caixa-componentes-android"
"name" : "caixa-dotnet-snapshots"
"name" : "jaspersoft-third-party-ce-artifacts"
"name" : "caixa-qa"
"name" : "caixa-repo-conda"
"name" : "mcr.microsoft.com"
"name" : "https-npmjs-org"
"name" : "cocoapods-proxy"
"name" : "caixa-componentes-topaz-android"
"name" : "topaz-mobile-artifacts"
"name" : "artefato-prd"
"name" : "yum-internal"
"name" : "caixa-repo-dma-maven-snapshots"
"name" : "analytics-artifacts"
"name" : "nuget-group"
"name" : "maven-public"
"name" : "br"
"name" : "thirdparty"
"name" : "Jasper"
"name" : "Hortonworks_HDP"
"name" : "npm-all"
"name" : "SIGAL-TASK"
"name" : "CEPTIBR"
"name" : "npm-registry-https"
"name" : "gradle-dist"
"name" : "google-dl"
"name" : "caixa-apps"
"name" : "docker-group"
"name" : "s3-releases"
"name" : "caixa-libs"
"name" : "dll-internal"
"name" : "caixa-loterias"
"name" : "caixa-cedesbr"
"name" : "pub.dev"
"name" : "caixa-habitacao-maven-releases"
"name" : "caixa-raw-releases"
"name" : "s3-smisdk"
"name" : "docker-openshift-proxy"
"name" : "design_system_caixa"
"name" : "caixa-ios-releases"
"name" : "caixa-dotnet-releases"
"name" : "caixa-componentes-topaz-ios"
"name" : "internet-banking"
"name" : "nuget-release"
"name" : "yum-all"
"name" : "npmjs-2"
"name" : "pip-hosted"
"name" : "maven-releases"
"name" : "sa"
"name" : "jboss-product-repository-GA"
"name" : "npm-internal"
"name" : "caixa-group"
"name" : "Hortonworks_Jetty"
"name" : "jitpack"
"name" : "gradle-plugins"
"name" : "caixa-mobilidade"
"name" : "teste-openshift"
"name" : "rubygem"
"name" : "s3-snapshots"
"name" : "maven-google"
"name" : "caixa-habitacao-maven-snapshots"
"name" : "caixa-raw-snapshots"
"name" : "SIFRS-MAP-PWC"
"name" : "caixa-ios-snapshots"
"name" : "caixa-topaz"
"name" : "nuget-snapshot"
"name" : "yum-sitdf"
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# find / -iname "*.jsl" -o -iname "*.ctm" 2>/dev/null | grep -v proc
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# find / -path "*controlm*" -iname "*.sh" 2>/dev/null
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# systemctl cat controlm_agent.service 2>/dev/null | grep -i exec
ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start
ExecStop=/opt/ctmage/ctm/scripts/rc.agent_user stop
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
