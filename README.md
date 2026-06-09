sh-4.2$ oc get buildconfigs --all-namespaces | grep sifof-api
-sh-4.2$ oc project build-images-ads
Now using project "build-images-ads" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create buildconfig sifof-api-aplicacao \
>   --image=registry.redhat.io/ubi9/ubi:latest \
>   --binary=true \
>   -n build-images-ads
Error: unknown flag: --image


Usage:
  oc create -f FILENAME [flags]

Examples:
  # Create a pod using the data in pod.json.
  oc create -f pod.json

  # Create a pod based on the JSON passed into stdin.
  cat pod.json | oc create -f -

Available Commands:
  clusterresourcequota Create cluster resource quota resource.
  clusterrole          Create a ClusterRole.
  clusterrolebinding   Create a ClusterRoleBinding for a particular ClusterRole
  configmap            Create a configmap from a local file, directory or literal value
  deployment           Create a deployment with the specified name.
  deploymentconfig     Create deployment config with default options that uses a given image.
  identity             Manually create an identity (only needed if automatic creation is disabled).
  imagestream          Create a new empty image stream.
  imagestreamtag       Create a new image stream tag.
  job                  Create a job with the specified name.
  namespace            Create a namespace with the specified name
  poddisruptionbudget  Create a pod disruption budget with the specified name.
  priorityclass        Create a priorityclass with the specified name.
  quota                Create a quota with the specified name.
  role                 Create a role with single rule.
  rolebinding          Create a RoleBinding for a particular Role or ClusterRole
  route                Expose containers externally via secured routes
  secret               Create a secret using specified subcommand
  service              Create a service using specified subcommand.
  serviceaccount       Create a service account with the specified name
  user                 Manually create a user (only needed if automatic creation is disabled).
  useridentitymapping  Manually map an identity to a user.

Options:
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --dry-run=false: If true, only print the object that would be sent, without sending it.
      --edit=false: Edit the API resource before creating
  -f, --filename=[]: Filename, directory, or URL to files to use to create the resource
  -o, --output='': Output format. One of: json|yaml|name|go-template|go-template-file|templatefile|template|jsonpath|jsonpath-file.
      --raw='': Raw URI to POST to the server.  Uses the transport specified by the kubeconfig file.
      --record=false: Record current kubectl command in the resource annotation. If set to false, do not record the command. If set to true, record the command. If not set, default to updating the existing annotation value only if one already exists.
  -R, --recursive=false: Process the directory used in -f, --filename recursively. Useful when you want to manage related manifests organized within the same directory.
      --save-config=false: If true, the configuration of current object will be saved in its annotation. Otherwise, the annotation will be unchanged. This flag is useful when you want to perform kubectl apply on this object in the future.
  -l, --selector='': Selector (label query) to filter on, supports '=', '==', and '!='.(e.g. -l key1=value1,key2=value2)
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
      --validate=false: If true, use a schema to validate the input before sending it
      --windows-line-endings=false: Only relevant if --edit=true. Defaults to the line ending native to your platform.

Use "oc <command> --help" for more information about a given command.
Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc start-build sifof-api-aplicacao \
>   --from-dir=/opt/ads-agent/_work/61/a \
>   --follow \
>   --wait=true \
>   -n sifof-des \
>   -v=5
F0609 10:40:04.230881   29576 helpers.go:119] error: stat /opt/ads-agent/_work/61/a: no such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get buildconfigs -A
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

-sh-4.2$ oc auth can-i create buildconfigs -n build-images-ads
yes
-sh-4.2$ oc auth can-i create buildconfigs -n sifof-des
yes
-sh-4.2$ oc get buildconfigs -n sifof-des
No resources found.
-sh-4.2$ oc get buildconfigs --all-namespaces | grep sifof
-sh-4.2$ oc describe buildconfig sifof-api-aplicacao -n [NAMESPACE]
Error from server (NotFound): namespaces "[NAMESPACE]" not found
-sh-4.2$
