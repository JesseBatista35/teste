mano tá dando um timeout chatinho com o openshift
 
https://devops.caixa/projetos/Caixa/_build?definitionId=4196
 
parece que não está conseguindo criar a imagem lá no POD
 
desde ontem 
 
se puder dar um help ai iria ajudar muito, está impactando a entrega da sprint aqui 
 I1127 10:15:26.813490 3619382 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I1127 10:15:26.815302 3619382 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/536/a" as binary input for the build ...
I1127 10:15:26.815389 3619382 tar.go:238] Adding "/opt/ads-agent/_work/536/a" to tar ...
I1127 10:15:26.815589 3619382 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i as .s2i
I1127 10:15:26.815882 3619382 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin as .s2i/bin
I1127 10:15:26.815947 3619382 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin/assemble as .s2i/bin/assemble
I1127 10:15:26.816008 3619382 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin/run as .s2i/bin/run
I1127 10:15:26.816076 3619382 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/siavl-atddigital-frontend.zip as siavl-atddigital-frontend.zip
............
Uploading finished
I1127 10:16:26.832183 3619382 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siavl-atddigital-frontend/instantiatebinary?name=siavl-atddigital-frontend&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/f923899a-9674-498a-86e5-dfde7901be11.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siavl-atddigital-frontend
+ oc start-build siavl-atddigital-frontend --from-dir=/opt/ads-agent/_work/536/a --follow --wait=true -n build-images-ads -v=5
I1127 10:16:28.006161 3619418 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I1127 10:16:28.007925 3619418 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/536/a" as binary input for the build ...
I1127 10:16:28.008038 3619418 tar.go:238] Adding "/opt/ads-agent/_work/536/a" to tar ...
I1127 10:16:28.008247 3619418 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i as .s2i
I1127 10:16:28.008514 3619418 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin as .s2i/bin
I1127 10:16:28.008558 3619418 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin/assemble as .s2i/bin/assemble
I1127 10:16:28.008635 3619418 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/.s2i/bin/run as .s2i/bin/run
I1127 10:16:28.008697 3619418 tar.go:336] Adding to tar: /opt/ads-agent/_work/536/a/siavl-atddigital-frontend.zip as siavl-atddigital-frontend.zip
............
Uploading finished
I1127 10:17:28.028657 3619418 helpers.go:237] Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/siavl-atddigital-frontend/instantiatebinary?name=siavl-atddigital-frontend&namespace=build-images-ads: unexpected EOF
Unable to connect to the server: unexpected EOF
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary
