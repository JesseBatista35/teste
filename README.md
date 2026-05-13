
-sh-4.2$ oc exec -it -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter -- sh
error: unable to upgrade connection: container not found ("sitop-frontend-des-exporter")
-sh-4.2$ pwd ls -la / ls -la /opt find / -name ".js" 2>/dev/null | head -100 find / -name "main.js" 2>/dev/null | head -50
-sh-4.2$ oc logs -n sitop-des sitop-frontend-des-5-mzzkd --previous
error: the server doesn't have a resource type "pods"
-sh-4.2$ oc logs -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter --previous
error: the server doesn't have a resource type "pods"
-sh-4.2$ oc describe pod sitop-frontend-des-5-mzzkd -n sitop-des
error: the server doesn't have a resource type "pod"
-sh-4.2$ ^C
-sh-4.2$ oc version oc whoami oc whoami --show-server oc project
Error: unknown flag: --show-server


Usage:
  oc version [flags]

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ oc get projects | grep -i sitop
error: the server doesn't have a resource type "projects"
-sh-4.2$ oc get all -n sitop-des
error: the server doesn't have a resource type "all"
-sh-4.2$ oc get po -n sitop-des
error: the server doesn't have a resource type "po"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get po sitop-frontend-des-5-mzzkd -n sitop-des -o jsonpath='{.spec.containers[*].name}{"\n"}'
error: the server doesn't have a resource type "po"
-sh-4.2$


como que vou ter calma todos comados esta danto errado

