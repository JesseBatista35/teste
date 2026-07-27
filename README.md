p585600@10.122.155.62's password:
Last login: Fri Jul 24 14:04:42 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~Hm_vS9A_CmP7kOYA_n38SiKIHdusJLNEIcz6uIASuCc --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 974 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "siavl-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n openshift-image-registry oc exec -n openshift-image-registry -- df -h /registry
error: there is no need to specify a resource type as a separate argument when passing arguments in resource/name form (e.g. 'oc get resource/<resource_name>' instead of 'oc get resource resource/<resource_name>'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc adm prune images --confirm
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-image-registry -- registry garbage-collect /etc/registry/config.yml
error: expected 'exec POD_NAME COMMAND [ARG1] [ARG2] ... [ARGN]'.
POD_NAME and COMMAND are required arguments for the exec command
See 'oc exec -h' for help and examples.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
