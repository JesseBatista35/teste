

Run 'oc --help' for usage.
-sh-4.2$ oc project siinp-des
Now using project "siinp-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami
p585600@corp.caixa.gov.br
-sh-4.2$ oc get dc siinp-nucleo-des -n siinp-des
NAME               REVISION   DESIRED   CURRENT   TRIGGERED BY
siinp-nucleo-des   291        3         3
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment -n siinp-des | grep -i siinp-nucleo
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment -n siinp-des | grep -i siinp-nucleo
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siinp-nucleo-des -n siinp-des -o jsonpath='{.spec.template.spec.containers[*].name}{"\n"}'
siinp-nucleo-des
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des --list -c "siinp-nucleo-des"
# deploymentconfigs/siinp-nucleo-des, container siinp-nucleo-des
TZ=America/Sao_Paulo
-sh-4.2$
