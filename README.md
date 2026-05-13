
-sh-4.2$ oc exec -it -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter -- sh
error: unable to upgrade connection: container not found ("sitop-frontend-des-exporter")
-sh-4.2$ pwd ls -la / ls -la /opt find / -name ".js" 2>/dev/null | head -100 find / -name "main.js" 2>/dev/null | head -50
-sh-4.2$ oc logs -n sitop-des sitop-frontend-des-5-mzzkd --previous
error: the server doesn't have a resource type "pods"
-sh-4.2$ oc logs -n sitop-des sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter --previous
error: the server doesn't have a resource type "pods"
-sh-4.2$ oc describe pod sitop-frontend-des-5-mzzkd -n sitop-des
error: the server doesn't have a resource type "pod"
-sh-4.2$


ada disso ta funcionado
