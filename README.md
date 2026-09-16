
-sh-4.2$
-sh-4.2$ oc logs sicfd-monitoramento-des-90-deploy -n sicfd-des
--> Scaling up sicfd-monitoramento-des-90 from 0 to 1, scaling down sicfd-monitoramento-des-88 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sicfd-monitoramento-des-90 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sicfd-des --sort-by='.lastTimestamp' | grep -i monitoramento | tail -40
F0916 15:24:54.975541   37997 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sicfd-des | grep sicfd-monitoramento-des-91
sicfd-monitoramento-des-91-deploy               0/1       Error       0                18m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sicfd-monitoramento-des-91-<sufixo> -c secrets-agent-sidecar -n sicfd-des
-sh: sufixo: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/sicfd-monitoramento-des -n sicfd-des
Defaulting container name to sicfd-monitoramento-des.
Use 'oc describe pod/sicfd-monitoramento-des-debug -n sicfd-des' to see all of the containers in this pod.

Debugging with pod/sicfd-monitoramento-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$
