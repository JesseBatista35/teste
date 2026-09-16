
Last login: Tue Sep 15 10:37:19 2026 from 10.122.150.31
-sh-4.2$ oc login --token=sha256~FnInh7YXKhB6Kl8iEw2CEixCbBo484vmfjg-zEhpU9k --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 984 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$ oc project build-images-ads
Now using project "build-images-ads" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get --raw /healthz
ok-sh-4.2$ oc get clusteroperators | grep -v "true.*False.*False"
NAME                                       VERSION                          AVAILABLE   PROGRESSING   DEGRADED   SINCE     MESSAGE
authentication                             4.12.0-0.okd-2023-04-16-041331   True        False         False      3h50m
baremetal                                  4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
cloud-controller-manager                   4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
cloud-credential                           4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
cluster-autoscaler                         4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
config-operator                            4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
console                                    4.12.0-0.okd-2023-04-16-041331   True        False         False      9d
control-plane-machine-set                  4.12.0-0.okd-2023-04-16-041331   True        False         False      457d
csi-snapshot-controller                    4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
dns                                        4.12.0-0.okd-2023-04-16-041331   True        False         False      404d
etcd                                       4.12.0-0.okd-2023-04-16-041331   True        False         False      44d
image-registry                             4.12.0-0.okd-2023-04-16-041331   True        False         False      138d
ingress                                    4.12.0-0.okd-2023-04-16-041331   True        False         False      455d
insights                                   4.12.0-0.okd-2023-04-16-041331   True        False         False      457d
kube-apiserver                             4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
kube-controller-manager                    4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
kube-scheduler                             4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
kube-storage-version-migrator              4.12.0-0.okd-2023-04-16-041331   True        False         False      418d
machine-api                                4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
machine-approver                           4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
machine-config                             4.12.0-0.okd-2023-04-16-041331   True        False         False      44d
marketplace                                4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
monitoring                                 4.12.0-0.okd-2023-04-16-041331   True        False         False      71d
network                                    4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
node-tuning                                4.12.0-0.okd-2023-04-16-041331   True        False         False      457d
openshift-apiserver                        4.12.0-0.okd-2023-04-16-041331   True        False         False      32d
openshift-controller-manager               4.12.0-0.okd-2023-04-16-041331   True        False         False      457d
openshift-samples                          4.12.0-0.okd-2023-04-16-041331   True        False         False      457d
operator-lifecycle-manager                 4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
operator-lifecycle-manager-catalog         4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
operator-lifecycle-manager-packageserver   4.12.0-0.okd-2023-04-16-041331   True        False         False      396d
service-ca                                 4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
storage                                    4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
-sh-4.2$ oc get co kube-apiserver openshifit-apiserver
NAME             VERSION                          AVAILABLE   PROGRESSING   DEGRADED   SINCE     MESSAGE
kube-apiserver   4.12.0-0.okd-2023-04-16-041331   True        False         False      3y311d
Error from server (NotFound): clusteroperators.config.openshift.io "openshifit-apiserver" not found
-sh-4.2$ oc get pods -n openshift-kube-apiserver -o wide
NAME                                            READY     STATUS      RESTARTS   AGE       IP              NODE                       NOMINATED NODE   READINESS GATES
installer-482-ceadecldlx004.nprd.caixa          0/1       Completed   0          9d        25.1.1.227      ceadecldlx004.nprd.caixa   <none>           <none>
installer-482-ceadecldlx005.nprd.caixa          0/1       Completed   0          9d        25.2.1.136      ceadecldlx005.nprd.caixa   <none>           <none>
installer-482-ceadecldlx006.nprd.caixa          0/1       Completed   0          9d        25.0.1.248      ceadecldlx006.nprd.caixa   <none>           <none>
installer-483-ceadecldlx004.nprd.caixa          0/1       Completed   0          4d15h     25.1.0.102      ceadecldlx004.nprd.caixa   <none>           <none>
installer-483-ceadecldlx005.nprd.caixa          0/1       Completed   0          4d15h     25.2.1.144      ceadecldlx005.nprd.caixa   <none>           <none>
installer-483-ceadecldlx006.nprd.caixa          0/1       Completed   0          4d15h     25.0.0.4        ceadecldlx006.nprd.caixa   <none>           <none>
installer-484-ceadecldlx004.nprd.caixa          0/1       Completed   0          4d15h     25.1.0.105      ceadecldlx004.nprd.caixa   <none>           <none>
installer-484-ceadecldlx005.nprd.caixa          0/1       Completed   0          4d15h     25.2.1.146      ceadecldlx005.nprd.caixa   <none>           <none>
installer-484-ceadecldlx006.nprd.caixa          0/1       Completed   0          4d15h     25.0.0.6        ceadecldlx006.nprd.caixa   <none>           <none>
installer-485-ceadecldlx004.nprd.caixa          0/1       Completed   0          4d15h     25.1.0.116      ceadecldlx004.nprd.caixa   <none>           <none>
installer-485-ceadecldlx005.nprd.caixa          0/1       Completed   0          4d15h     25.2.1.153      ceadecldlx005.nprd.caixa   <none>           <none>
installer-485-ceadecldlx006.nprd.caixa          0/1       Completed   0          4d15h     25.0.0.32       ceadecldlx006.nprd.caixa   <none>           <none>
kube-apiserver-ceadecldlx004.nprd.caixa         5/5       Running     0          4d14h     10.116.208.23   ceadecldlx004.nprd.caixa   <none>           <none>
kube-apiserver-ceadecldlx005.nprd.caixa         5/5       Running     0          4d15h     10.116.208.24   ceadecldlx005.nprd.caixa   <none>           <none>
kube-apiserver-ceadecldlx006.nprd.caixa         5/5       Running     0          4d15h     10.116.208.25   ceadecldlx006.nprd.caixa   <none>           <none>
kube-apiserver-guard-ceadecldlx004.nprd.caixa   1/1       Running     0          417d      25.1.0.21       ceadecldlx004.nprd.caixa   <none>           <none>
kube-apiserver-guard-ceadecldlx005.nprd.caixa   1/1       Running     0          457d      25.2.0.9        ceadecldlx005.nprd.caixa   <none>           <none>
kube-apiserver-guard-ceadecldlx006.nprd.caixa   1/1       Running     0          457d      25.0.0.8        ceadecldlx006.nprd.caixa   <none>           <none>
revision-pruner-481-ceadecldlx004.nprd.caixa    0/1       Completed   0          9d        25.1.1.225      ceadecldlx004.nprd.caixa   <none>           <none>
revision-pruner-481-ceadecldlx005.nprd.caixa    0/1       Completed   0          9d        25.2.1.134      ceadecldlx005.nprd.caixa   <none>           <none>
revision-pruner-481-ceadecldlx006.nprd.caixa    0/1       Completed   0          9d        25.0.1.246      ceadecldlx006.nprd.caixa   <none>           <none>
revision-pruner-482-ceadecldlx004.nprd.caixa    0/1       Completed   0          9d        25.1.1.226      ceadecldlx004.nprd.caixa   <none>           <none>
revision-pruner-482-ceadecldlx005.nprd.caixa    0/1       Completed   0          9d        25.2.1.135      ceadecldlx005.nprd.caixa   <none>           <none>
revision-pruner-482-ceadecldlx006.nprd.caixa    0/1       Completed   0          9d        25.0.1.247      ceadecldlx006.nprd.caixa   <none>           <none>
revision-pruner-483-ceadecldlx004.nprd.caixa    0/1       Completed   0          4d15h     25.1.0.101      ceadecldlx004.nprd.caixa   <none>           <none>
revision-pruner-483-ceadecldlx005.nprd.caixa    0/1       Completed   0          4d15h     25.2.1.143      ceadecldlx005.nprd.caixa   <none>           <none>
revision-pruner-483-ceadecldlx006.nprd.caixa    0/1       Completed   0          4d15h     25.0.0.3        ceadecldlx006.nprd.caixa   <none>           <none>
revision-pruner-484-ceadecldlx004.nprd.caixa    0/1       Completed   0          4d15h     25.1.0.104      ceadecldlx004.nprd.caixa   <none>           <none>
revision-pruner-484-ceadecldlx005.nprd.caixa    0/1       Completed   0          4d15h     25.2.1.145      ceadecldlx005.nprd.caixa   <none>           <none>
revision-pruner-484-ceadecldlx006.nprd.caixa    0/1       Completed   0          4d15h     25.0.0.5        ceadecldlx006.nprd.caixa   <none>           <none>
revision-pruner-485-ceadecldlx004.nprd.caixa    0/1       Completed   0          4d15h     25.1.0.115      ceadecldlx004.nprd.caixa   <none>           <none>
revision-pruner-485-ceadecldlx005.nprd.caixa    0/1       Completed   0          4d15h     25.2.1.152      ceadecldlx005.nprd.caixa   <none>           <none>
revision-pruner-485-ceadecldlx006.nprd.caixa    0/1       Completed   0          4d15h     25.0.0.25       ceadecldlx006.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc siifx-api-aplicacao -n build-images-ads
NAME                  TYPE      FROM      LATEST
siifx-api-aplicacao   Source    Binary    712
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get build -n build-images-ads --sort-by=.metadata.creationTimestamp
No resources found.
-sh-4.2$ oc describe build siifx-api-aplicacao -n build images-ads
Error from server (NotFound): namespaces "build" not found
-sh-4.2$ time culr -kv https://api.produtos4.caixa:6443/healthz
-sh: culr: comando não encontrado

real    0m0.001s
user    0m0.001s
sys     0m0.000s
-sh-4.2$ time curl -kv https://api.produtos4.caixa:6443/healthz
* About to connect() to api.produtos4.caixa port 6443 (#0)
*   Trying 10.121.105.31...
* Connected to api.produtos4.caixa (10.121.105.31) port 6443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* NSS: client certificate not found (nickname not specified)
* SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
* Server certificate:
*       subject: CN=*.produtos4.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jul 13 21:27:17 2023 GMT
*       expire date: Jul 11 21:27:17 2028 GMT
*       common name: *.produtos4.caixa
*       issuer: CN=AC Interna APL,O=Caixa Economica Federal,C=BR
> GET /healthz HTTP/1.1
> User-Agent: curl/7.29.0
> Host: api.produtos4.caixa:6443
> Accept: */*
>
< HTTP/1.1 200 OK
< Audit-Id: afa70dd5-daf5-4e35-abbf-3e9f72756f45
< Cache-Control: no-cache, private
< Content-Type: text/plain; charset=utf-8
< X-Content-Type-Options: nosniff
< X-Kubernetes-Pf-Flowschema-Uid: 540e6e9c-60af-4c03-a863-5116d49ea4bc
< X-Kubernetes-Pf-Prioritylevel-Uid: 02c6c0bf-f595-4438-a22a-0aff0dff5345
< Date: Wed, 16 Sep 2026 13:03:58 GMT
< Content-Length: 2
<
* Connection #0 to host api.produtos4.caixa left intact
ok
real    0m0.153s
user    0m0.055s
sys     0m0.079s
-sh-4.2$ oc get events -n build-images-ads --sort-by='.lastTimestamp' | tail -30
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -A --sort-by='.lastTimestamp' | grep -i -E "apiserver|timeout|evict" | tail -30
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

-sh-4.2$
