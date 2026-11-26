
Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIISF
Janela de atendimento:*:	26/11/2026 14:31:00
Prazo final da janela de atendimento:*:	26/11/2026 14:31:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	c159025 - TEAMS
c160442 - TEAMS
Descrição da solicitação:*:	Prezados,

Tentamos rodar a pipeline SIISF-api. O job, entretanto, falhou na task "Executando Build S2I Binary" com o erro:

I1126 14:22:46.816606   46063 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siisf-api/instantiatebinary?name=siisf-api&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF

Pedimos por gentileza verificar a pipeline, tendo em vista que a build do jar ocorreu corretamente.
Informar formas de contato:*:	TEAMS




+ set -o errexit
+ set -o pipefail
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siisf-api
+ oc start-build siisf-api --from-dir=/opt/ads-agent/_work/17/a --follow --wait=true -n build-images-ads -v=5
I1126 14:20:45.559501   46027 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I1126 14:20:45.562331   46027 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/17/a" as binary input for the build ...
I1126 14:20:45.562462   46027 tar.go:238] Adding "/opt/ads-agent/_work/17/a" to tar ...
I1126 14:20:45.562738   46027 tar.go:336] Adding to tar: /opt/ads-agent/_work/17/a/siisf-api-0.0.1-SNAPSHOT.jar as siisf-api-0.0.1-SNAPSHOT.jar
............
Uploading finished
I1126 14:21:45.595558   46027 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siisf-api/instantiatebinary?name=siisf-api&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/c2847161-a1b8-4146-8e3b-cfc440cb0569.sh
+ set -o errexit
+ set -o pipefail
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siisf-api
+ oc start-build siisf-api --from-dir=/opt/ads-agent/_work/17/a --follow --wait=true -n build-images-ads -v=5
I1126 14:21:46.778416   46063 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I1126 14:21:46.781329   46063 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/17/a" as binary input for the build ...
I1126 14:21:46.781507   46063 tar.go:238] Adding "/opt/ads-agent/_work/17/a" to tar ...
I1126 14:21:46.781868   46063 tar.go:336] Adding to tar: /opt/ads-agent/_work/17/a/siisf-api-0.0.1-SNAPSHOT.jar as siisf-api-0.0.1-SNAPSHOT.jar
............
Uploading finished
I1126 14:22:46.816606   46063 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siisf-api/instantiatebinary?name=siisf-api&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary




