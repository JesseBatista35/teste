
-sh-4.2$ which oc oc version oc whoami oc config current-context oc config view --minify
/usr/bin/which: unrecognized option '--minify'
/usr/local/bin/oc
/usr/local/bin/oc
/usr/bin/which: no version in (/opt/apache-maven/apache-maven-3.5.3/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/puppetlabs/bin)
/usr/local/bin/oc
/usr/bin/whoami
/usr/local/bin/oc
/usr/bin/which: no config in (/opt/apache-maven/apache-maven-3.5.3/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/puppetlabs/bin)
/usr/bin/which: no current-context in (/opt/apache-maven/apache-maven-3.5.3/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/puppetlabs/bin)
/usr/local/bin/oc
/usr/bin/which: no config in (/opt/apache-maven/apache-maven-3.5.3/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/puppetlabs/bin)
/usr/bin/view
-sh-4.2$ oc api-resources | head -50
error: You must be logged in to the server (Unauthorized)
-sh-4.2$ oc get namespaces
error: the server doesn't have a resource type "namespaces"
-sh-4.2$ oc get pod sitop-frontend-des-5-mzzkd -n sitop-des -o yaml
error: the server doesn't have a resource type "pod"
-sh-4.2$ oc config view --minify
apiVersion: v1
clusters:
- cluster:
    insecure-skip-tls-verify: true
    server: https://api.nprd.caixa:6443
  name: api-nprd-caixa:6443
contexts:
- context:
    cluster: api-nprd-caixa:6443
    namespace: sitop-des
    user: p585600@corp.caixa.gov.br/api-nprd-caixa:6443
  name: sitop-des/api-nprd-caixa:6443/p585600@corp.caixa.gov.br
current-context: sitop-des/api-nprd-caixa:6443/p585600@corp.caixa.gov.br
kind: Config
preferences: {}
users:
- name: p585600@corp.caixa.gov.br/api-nprd-caixa:6443
  user:
    token: sha256~OmpNeSRnDSJdzfY9hLlHOvc8m6MEgrFrXK2o63xLEDI
-sh-4.2$
