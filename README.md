-sh-4.2$ P=sispx-pix-gestao-des-414-nmjc9
-sh-4.2$ oc get pod $P -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'
secrets-agent-sidecar
secrets-check
dynatrace-operator
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod $P -o jsonpath='{.metadata.annotations}' | tr ',' '\n' | grep -i -E 'istio|traffic'
map[dynakube.dynatrace.com/injected:true istio.io/rev:pix-mesh k8s.v1.cni.cncf.io/networks:v2-5-istio-cni openshift.io/deployment-config.name:sispx-pix-gestao-des prometheus.io/scrape:true traffic.sidecar.istio.io/excludeInboundPorts:15090
15021 openshift.io/deployment.name:sispx-pix-gestao-des-414 openshift.io/generated-by:OpenShiftNewApp openshift.io/scc:anyuid sidecar.istio.io/interceptionMode:REDIRECT sidecar.istio.io/status:{"initContainers":null
"containers":["istio-proxy"]
"istio-envoy"
"istio-data"
"istio-podinfo"
"istiod-ca-cert"]
"k8s.workload.name":"sispx-pix-gestao-des"} openshift.io/deployment-config.latest-version:414 prometheus.io/path:/stats/prometheus traffic.sidecar.istio.io/includeOutboundIPRanges:* traffic.sidecar.istio.io/includeInboundPorts:* instrumentation.opentelemetry.io/inject-java:true k8s.v1.cni.cncf.io/network-status:[{
    "name": "sispx-des/v2-5-istio-cni"
}] kubectl.kubernetes.io/default-logs-container:sispx-pix-gestao-des metadata-enrichment.dynatrace.com/injected:true oneagent.dynatrace.com/injected:true prometheus.io/port:15020 sidecar.istio.io/inject:true]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $P -c secrets-agent-sidecar --tail=15
        endpoint_url,
    ...<3 lines>...
        timeout=(self._timeout_connection_seconds, self._timeout_request_seconds),
    )
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 637, in post
    return self.request("POST", url, data=data, json=json, **kwargs)
           ~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 589, in request
    resp = self.send(prep, **send_kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 703, in send
    r = adapter.send(request, **kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 688, in send
    raise ConnectTimeout(e, request=request)
requests.exceptions.ConnectTimeout: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7fe692770cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
2026-11-26 12:58:41,643 ERROR (d29d8f6c-e998-11f1-94e8-0a5819820ece) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7fe692770cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get serviceentry -n sispx-des
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get serviceentry -A | grep -i -E 'sicsn|beyond'
Error: unknown shorthand flag: 'A' in -A


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
      --export=false: If true, use 'export' for the resources.  Exported resources are stripped of cluster-specific information.
      --field-selector='': Selector (field query) to filter on, supports '=', '==', and '!='.(e.g. --field-selector key1=value1,key2=value2). The server only supports a limited number of field queries per type.
  -f, --filename=[]: Filename, directory, or URL to files identifying the resource to get from a server.
      --ignore-not-found=false: If the requested object does not exist the command will return exit code 0.
      --include-uninitialized=false: If true, the kubectl command applies to uninitialized objects. If explicitly set to false, this flag overrides other flags that make the kubectl commands apply to uninitialized objects, e.g., "--all". Objects with empty metadata.initializers are regarded as initialized.
  -L, --label-columns=[]: Accepts a comma separated list of labels that are going to be presented as columns. Names are case-sensitive. You can also use multiple flag options like -L label1 -L label2...
      --no-headers=false: When using the default or custom-column output format, don't print headers (default print headers).
  -o, --output='': Output format. One of: json|yaml|wide|name|custom-columns=...|custom-columns-file=...|go-template=...|go-template-file=...|jsonpath=...|jsonpath-file=... See custom columns [http://kubernetes.io/docs/user-guide/kubectl-overview/#custom-columns], golang template [http://golang.org/pkg/text/template/#pkg-overview] and jsonpath template [http://kubernetes.io/docs/user-guide/jsonpath].
      --raw='': Raw URI to request from the server.  Uses the transport specified by the kubeconfig file.
  -R, --recursive=false: Process the directory used in -f, --filename recursively. Useful when you want to manage related manifests organized within the same directory.
  -l, --selector='': Selector (label query) to filter on, supports '=', '==', and '!='.(e.g. -l key1=value1,key2=value2)
      --server-print=true: If true, have the server return the appropriate table output. Supports extension APIs and CRDs.
      --show-kind=false: If present, list the resource type for the requested object(s).
      --show-labels=false: When printing, show all labels as the last column (default hide labels column)
      --sort-by='': If non-empty, sort list types using this field specification.  The field specification is expressed as a JSONPath expression (e.g. '{.metadata.name}'). The field in the API resource specified by this JSONPath expression must be an integer or a string.
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
      --use-openapi-print-columns=false: If true, use x-kubernetes-print-column metadata (if present) from the OpenAPI schema for displaying a resource.
  -w, --watch=false: After listing/getting the requested object, watch for changes. Uninitialized objects are excluded if no object name is provided.
      --watch-only=false: Watch for changes to the requested object(s), without listing/getting first.

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ oc get pod sispx-pix-gestao-des-391-ld6h8 -o jsonpath='{range .status.containerStatuses[*]}{.name}{" ready="}{.ready}{"\n"}{end}'
istio-proxy ready=true
sispx-pix-gestao-des ready=false
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run teste-cofre -n sispx-des --rm -it --restart=Never \
>   --image=$(oc get pod $P -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}') \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- sh -c 'python3 -c "import socket;s=socket.create_connection((\"sicsn.caixa\",443),10);print(\"PORTA_443_ABERTA\")" ; python3 -c "import socket;s=socket.create_connection((\"sicsn.caixa\",23),5);print(\"PORTA_23_ABERTA\")"'
If you don't see a command prompt, try pressing enter.

Traceback (most recent call last):
  File "<string>", line 1, in <module>
    import socket;s=socket.create_connection(("sicsn.caixa",443),10);print("PORTA_443_ABERTA")
                    ~~~~~~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/socket.py", line 864, in create_connection
    raise exceptions[0]
  File "/usr/local/lib/python3.13/socket.py", line 849, in create_connection
    sock.connect(sa)
    ~~~~~~~~~~~~^^^^
TimeoutError: timed out
Traceback (most recent call last):
  File "<string>", line 1, in <module>
    import socket;s=socket.create_connection(("sicsn.caixa",23),5);print("PORTA_23_ABERTA")
                    ~~~~~~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/socket.py", line 864, in create_connection
    raise exceptions[0]
  File "/usr/local/lib/python3.13/socket.py", line 849, in create_connection
    sock.connect(sa)
    ~~~~~~~~~~~~^^^^
TimeoutError: timed out
pod "teste-cofre" deleted
pod sispx-des/teste-cofre terminated (Error)
-sh-4.2$
