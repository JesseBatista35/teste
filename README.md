
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get all,cm,secret,route,hpa,pdb,sa 2>/dev/null | grep -E 'mapsfeeder|maps-feeder'
service/sicql-maps-feeder-tqs                        ClusterIP   25.128.93.210    <none>        8080/TCP   2d19h
service/sicql-maps-feeder-tqs-metrics                ClusterIP   25.128.230.78    <none>        8080/TCP   2d19h
service/sicql-mapsfeeder-tqs                         ClusterIP   25.128.213.152   <none>        8080/TCP   2d18h
service/sicql-mapsfeeder-tqs-metrics                 ClusterIP   25.128.237.221   <none>        8080/TCP   2d18h
imagestream.image.openshift.io/sicql-maps-feeder-tqs                image-registry.openshift-image-registry.svc:5000/sicql-tqs/sicql-maps-feeder-tqs
imagestream.image.openshift.io/sicql-mapsfeeder-tqs                 image-registry.openshift-image-registry.svc:5000/sicql-tqs/sicql-mapsfeeder-tqs
route.route.openshift.io/sicql-maps-feeder-tqs                sicql-maps-feeder-tqs.apps.nprd.caixa                          sicql-maps-feeder-tqs                web       edge/Redirect   None
route.route.openshift.io/sicql-mapsfeeder-tqs                 sicql-mapsfeeder-tqs.apps.nprd.caixa                           sicql-mapsfeeder-tqs                 web       edge/Redirect   None
secret/sicql-maps-feeder-tqs                Opaque                                2         2d19h
secret/sicql-mapsfeeder-tqs                 Opaque                                0         5m52s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete svc sicql-mapsfeeder-tqs sicql-mapsfeeder-tqs-metrics
service "sicql-mapsfeeder-tqs" deleted
service "sicql-mapsfeeder-tqs-metrics" deleted
-sh-4.2$ oc delete route sicql-mapsfeeder-tqs
route.route.openshift.io "sicql-mapsfeeder-tqs" deleted
-sh-4.2$ oc delete secret sicql-mapsfeeder-tqs
secret "sicql-mapsfeeder-tqs" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete svc sicql-maps-feeder-tqs sicql-maps-feeder-tqs-metrics
service "sicql-maps-feeder-tqs" deleted
service "sicql-maps-feeder-tqs-metrics" deleted
-sh-4.2$ oc delete route sicql-maps-feeder-tqs
route.route.openshift.io "sicql-maps-feeder-tqs" deleted
-sh-4.2$ oc delete secret sicql-maps-feeder-tqs
secret "sicql-maps-feeder-tqs" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicql-mapsfeeder-tqs
No resources found.
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sicql-mapsfeeder-tqs" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret sicql-mapsfeeder-tqs
No resources found.
Error from server (NotFound): secrets "sicql-mapsfeeder-tqs" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ -sh-4.2$ oc get dc,rc,pod,svc,route,secret | grep -E 'mapsfeeder|maps-feeder'
service/sicql-maps-feeder-tqs-metrics                ClusterIP   25.128.230.78    <none>        8080/TCP   2d19h
service/sicql-mapsfeeder-tqs                         ClusterIP   25.128.213.152   <none>        8080/TCP   2d18h
service/sicql-mapsfeeder-tqs-metrics                 ClusterIP   25.128.237.221   <none>        8080/TCP   2d18h
route.route.openshift.io/sicql-maps-feeder-tqs                sicql-maps-feeder-tqs.apps.nprd.caixa                          sicql-maps-feeder-tqs                web       edge/Redirect   None
route.route.openshift.io/sicql-mapsfeeder-tqs                 sicql-mapsfeeder-tqs.apps.nprd.caixa                           sicql-mapsfeeder-tqs                 web       edge/Redirect   None

secret/sicql-maps-feeder-tqs                Opaque                                2         2d19h
secret/sicql-mapsfeeder-tqs                 Opaque                                0         3m43s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicql-mapsfeeder-tqs oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi
Error: unknown flag: --limits


Usage:
  oc get [(-o|--output=)json|yaml|wide|custom-columns=...|custom-columns-file=...|go-template=...|go-template-file=...|jsonpath=...|jsonpath-file=...] (TYPE[.VERSION][.GROUP] [NAME | -l label] | TYPE[.VERSION][.GROUP]/NAME ...) [flags]

Examples:
  # List all pods in ps output format.
  oc get pods

  # List a single replication controller with specified ID in ps output format.
  oc get rc redis

  # List all pods and show more details about them.
  oc get -o wide pods

  # List a single pod in JSON output format.
  oc get -o json pod redis-pod

  # Return only the status value of the specified pod.
  oc get -o template pod redis-pod --template={{.currentState.status}}

Options:
      --all-namespaces=false: If present, list the requested object(s) across all namespaces. Namespace in current context is ignored even if specified with --namespace.
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --chunk-size=500: Return large lists in chunks rather than all at once. Pass 0 to disable. This flag is beta and may change in the future.
      --export-sh: -sh-4.2$: comando não encontrado
=false: If true, use 'export' for the resources.  Exported resources are stripped of cluster-specific information.
      --field-selector='': Selector (field query) to filter on, supports '=', '==', and '!='.(e.g. --field-selector key1=value1,key2=value2). The server only supports a limited number of field queries per type.
  -f, --filename=[]: Filename, directory, or URL to files identifying the resource to get from a server.
      --ignore-not-found=false: If the requested object does not exist the command will return exit code 0.
      --include-uninitialized=false: If true, the kubectl command applies to uninitialized objects. If explicitly set to false, this flag overrides other flags that make the kubectl commands apply to uninitialized objects, e.g., "--all". Objects with empty metadata.initializers are regarded as initialized.
  -L, --label-columns=[]: Accepts a comma separated list of labels that are going to be presented as columns. Names are case-sensitive. You can also use multiple flag options like -L label1 -L label2...
      --no-headers=false: When using the default or custom-column output format, don't print headers (default print headers).
  -o, --output='': Output format. One of: json|yaml|wide|name|custom-columns=...|custom-columns-file=...|go-template=...|go-template-file=...|jsonpath=...|jsonpath-file=... See custom columns [http://kubernetes.io/docs/user-guide/kubectl-overview/#custom-columns], golang template [http://golang.org/pkg/text/template/#pkg-overview] and jsonpath template [http://kubernetes.io/docs/user-guide/jsonpath].
      --raw='': Raw URI to request from the server.  Uses the transport spe-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ service/sicql-maps-feeder-tqs                        ClusterIP   25.128.93.210    <none>        8080/TCP   2d19h
e
-sh: none: Arquivo ou diretório não encontrado
-sh-4.2$ service/sicql-maps-feeder-tqs-metrics                ClusterIP   25.128.230.78    <none>        8080/TCP   2d19h
2
-sh: none: Arquivo ou diretório não encontrado
-sh-4.2$ service/sicql-mapsfeeder-tqs                         ClusterIP   25.128.213.152   <none>        8080/TCP   2d18h
s
-sh: none: Arquivo ou diretório não encontrado
-sh-4.2$ service/sicql-mapsfeeder-tqs-metrics                 ClusterIP   25.128.237.221   <none>        8080/TCP   2d18h
l
-sh: none: Arquivo ou diretório não encontrado
-sh-4.2$ route.route.openshift.io/sicql-maps-feeder-tqs                sicql-maps-feeder-tqs.apps.nprd.caixa                          sicql-maps-feeder-tqs                web       edge/Redirect   None
I
-sh: route.route.openshift.io/sicql-maps-feeder-tqs: Arquivo ou diretório não encontrado
-sh-4.2$ route.route.openshift.io/sicql-mapsfeeder-tqs                 sicql-mapsfeeder-tqs.apps.nprd.caixa                           sicql-mapsfeeder-tqs                 web       edge/Redirect   None
g
-sh: route.route.openshift.io/sicql-mapsfeeder-tqs: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$ secret/sicql-maps-feeder-tqs                Opaque                                2         2d19h
e
-sh: secret/sicql-maps-feeder-tqs: Arquivo ou diretório não encontrado
-sh-4.2$ secret/sicql-mapsfeeder-tqs                 Opaque                                0         3m43s
d
-sh: secret/sicql-mapsfeeder-tqs: Arquivo ou diretório não encontrado
-sh-4.2$ -sh-4.2$
-
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
c
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
2
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ oc get dc sicql-mapsfeeder-tqs oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ Error: unknown flag: --limits
-sh: Error:: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ Usage:
-sh: Usage:: comando não encontrado
-sh-4.2$   oc get [(-o|--output=)json|yaml|wide|custom-columns=...|custom-columns-file=...|go-template=...|go-template-file=...|jsonpath=...|jsonpath-file=...] (TYPE[.VERSION][.GROUP] [NAME | -l label] | TYPE[.VERSION][.GROUP]/NAME ...) [flags]
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$
-sh-4.2$ Examples:
-sh: Examples:: comando não encontrado
-sh-4.2$   # List all pods in ps output format.
-sh-4.2$   oc get pods
NAME                                           READY     STATUS      RESTARTS       AGE
sicql-mapspegasusenquadramento-tqs-52-deploy   0/1       Completed   0              74d
sicql-mapspegasusenquadramento-tqs-53-bzzt5    1/1       Running     0              20d
sicql-mapspegasusenquadramento-tqs-53-deploy   0/1       Completed   0              20d
sicql-mapspegasusgestorescef-tqs-57-deploy     0/1       Completed   0              74d
sicql-mapspegasusgestorescef-tqs-58-deploy     0/1       Completed   0              20d
sicql-mapspegasusgestorescef-tqs-58-h9lpn      1/1       Running     0              20d
sicql-mapspegasusgestorescef-tqs-58-wpzvt      1/1       Running     0              20d
sicql-mapspricing-tqs-45-deploy                0/1       Completed   0              41d
sicql-mapspricing-tqs-46-deploy                0/1       Completed   0              20d
sicql-mapspricing-tqs-46-s4xrh                 1/1       Running     1 (3d9h ago)   20d
-sh-4.2$
-sh-4.2$   # List a single replication controller with specified ID in ps output format.
-sh-4.2$   oc get rc redis
No resources found.
Error from server (NotFound): replicationcontrollers "redis" not found
-sh-4.2$
-sh-4.2$   # List all pods and show more details about them.
-sh-4.2$   oc get -o wide pods
NAME                                           READY     STATUS      RESTARTS       AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sicql-mapspegasusenquadramento-tqs-52-deploy   0/1       Completed   0              74d       25.1.9.178    ceadecldlx027.nprd.caixa   <none>           <none>
sicql-mapspegasusenquadramento-tqs-53-bzzt5    1/1       Running     0              20d       25.1.21.128   ceadecldlx046.nprd.caixa   <none>           <none>
sicql-mapspegasusenquadramento-tqs-53-deploy   0/1       Completed   0              20d       25.0.31.13    ceadecldlx065.nprd.caixa   <none>           <none>
sicql-mapspegasusgestorescef-tqs-57-deploy     0/1       Completed   0              74d       25.1.34.206   ceadecldlx071.nprd.caixa   <none>           <none>
sicql-mapspegasusgestorescef-tqs-58-deploy     0/1       Completed   0              20d       25.1.21.126   ceadecldlx046.nprd.caixa   <none>           <none>
sicql-mapspegasusgestorescef-tqs-58-h9lpn      1/1       Running     0              20d       25.0.31.12    ceadecldlx065.nprd.caixa   <none>           <none>
sicql-mapspegasusgestorescef-tqs-58-wpzvt      1/1       Running     0              20d       25.1.11.155   ceadecldlx028.nprd.caixa   <none>           <none>
sicql-mapspricing-tqs-45-deploy                0/1       Completed   0              41d       25.3.14.142   ceadecldlx035.nprd.caixa   <none>           <none>
sicql-mapspricing-tqs-46-deploy                0/1       Completed   0              20d       25.0.31.14    ceadecldlx065.nprd.caixa   <none>           <none>
sicql-mapspricing-tqs-46-s4xrh                 1/1       Running     1 (3d9h ago)   20d       25.1.21.127   ceadecldlx046.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$   # List a single pod in JSON output format.
-sh-4.2$   oc get -o json pod redis-pod
Error from server (NotFound): pods "redis-pod" not found
-sh-4.2$
-sh-4.2$   # Return only the status value of the specified pod.
-sh-4.2$   oc get -o template pod redis-pod --template={{.currentState.status}}
Error from server (NotFound): pods "redis-pod" not found
-sh-4.2$
-sh-4.2$ Options:
-sh: Options:: comando não encontrado
-sh-4.2$       --all-namespaces=false: If present, list the requested object(s) across all namespaces. Namespace in current context is ignored even if specified with --namespace.
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$       --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
-sh: --allow-missing-template-keys=true:: comando não encontrado
-sh-4.2$       --chunk-size=500: Return large lists in chunks rather than all at once. Pass 0 to disable. This flag is beta and may change in the future.
-sh: --chunk-size=500:: comando não encontrado
-sh-4.2$       --export=false: If true, use 'export' for the resources.  Exported resources are stripped of cluster-specific information.
-sh: --export=false:: comando não encontrado
-sh-4.2$       --field-selector='': Selector (field query) to filter on, supports '=', '==', and '!='.(e.g. --field-selector key1=value1,key2=value2). The server only supports a limited number of field queries per type.
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$   -f, --filename=[]: Filename, directory, or URL to files identifying the resource to get from a server.
-sh: -f,: comando não encontrado
-sh-4.2$       --ignore-not-found=false: If the requested object does not exist the command will return exit code 0.
-sh: --ignore-not-found=false:: comando não encontrado
-sh-4.2$       --include-uninitialized=false: If true, the kubectl command applies to uninitialized objects. If explicitly set to false, this flag overrides other flags that make the kubectl commands apply to uninitialized objects, e.g., "--all". Objects with empty metadata.initializers are regarded as initialized.
-sh: --include-uninitialized=false:: comando não encontrado
-sh-4.2$   -L, --label-columns=[]: Accepts a comma separated list of labels that are going to be presented as columns. Names are case-sensitive. You can also use multiple flag options like -L label1 -L label2...
-sh: -L,: comando não encontrado
-sh-4.2$       --no-headers=false: When using the default or custom-column output format, don't print headers (default print headers).
>   -o, --output='': Output format. One of: json|yaml|wide|name|custom-columns=...|custom-columns-file=...|go-template=...|go-template-file=...|jsonpath=...|jsonpath-file=... See custom columns [http://kubernetes.io/docs/user-guide/kubectl-overview/#custom-columns], golang template [http://golang.org/pkg/text/template/#pkg-overview] and jsonpath template [http://kubernetes.io/docs/user-guide/jsonpath].
>       --raw='': Raw URI to request from the server.  Uses the transport specified by the kubeconfig file.
>   -R, --recursive=false: Process the directory used in -f, --filename recursively. Use
>   -l, --selector='': Selector (label query) to filter on, supports '=', '==', and '!='.(e.g. -l key1=value1,key2
>       --server-print=true: If true, have the server return the appropriate table output. Supports extension APIs
>       --show-kind=false: If present, list the resource type for the requested object(s).
>       --show-labels=fal
>       --sort-by='': If non-empty, sort list types using this field specification.  The field specification is expressed as a JSONPath expression (e.g. '{.metadata.name}'). The field in the API
>       --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg
>       --use-openapi-print-columns=false: If true, use x-kubernetes-print-column metadata (if prese
>   -w, --watch=false: After listing/getting the requested object, watch for changes. Uninitialized
>       --
>
> Use "oc
>
> -sh-4.2
> ^C
-sh-4.2$ oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi
deploymentconfig.apps.openshift.io/sicql-mapsfeeder-tqs resource requirements updated
-sh-4.2$
