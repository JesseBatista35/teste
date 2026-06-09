
-sh-4.2$ oc project sifof-des
Now using project "sifof-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami
p585600@corp.caixa.gov.br
-sh-4.2$ oc start-build sifof-api-aplicacao
Error from server (Forbidden): buildconfigs.build.openshift.io "sifof-api-aplicacao" is forbidden: buildconfigs.build.openshift.io "sifof-api-aplicacao" not found
-sh-4.2$ --from-dir=/opt/ads-agent/_work/61/a
-sh: --from-dir=/opt/ads-agent/_work/61/a: Arquivo ou diretório não encontrado
-sh-4.2$ --follow
-sh: --follow: comando não encontrado
-sh-4.2$ --wait=true
-sh: --wait=true: comando não encontrado
-sh-4.2$ -n build-images-ads
-sh: -n: comando não encontrado
-sh-4.2$ -v=5
-sh: -v=5: comando não encontrado
-sh-4.2$ --request-timeout=5m
-sh: --request-timeout=5m: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n openshift-kube-apiserver -l component=kube-apiserver
error: You must provide one or more resources by argument or filename.
Example resource specifications include:
   '-f rsrc.yaml'
   '--filename=rsrc.json'
   '<resource> <name>'
   '<resource>'
-sh-4.2$ oc describe buildconfig sifof-api-aplicacao -n build-images-ads
Error from server (NotFound): buildconfigs.build.openshift.io "sifof-api-aplicacao" not found
-sh-4.2$
