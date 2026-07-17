
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone.xml=~/standalone-okd.xml --dry-run=true -o yaml | oc apply -f -
error: error reading ~/standalone-okd.xml: no such file or directory
error: no objects passed to apply
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la ~/standalone-okd.xml
-rw-r--r-- 1 p585600 usucef 30153 Jul 17 14:58 /home/p585600/standalone-okd.xml
-sh-4.2$ echo $HOME
/home/p585600
-sh-4.2$ oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone.xml=$HOME/standalone-okd.xml --dry-run=true -o yaml | oc apply -f -
Warning: oc apply should be used on resource created by either oc create --save-config or oc apply
configmap/jboss-config-sihdg-jboss8 configured
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd.xml}' > $HOME/standalone-okd.xml sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' $HOME/standalone-okd.xml grep "pool-name="sihdgDS"" $HOME/standalone-okd.xml
Error: unknown shorthand flag: 'i' in -i


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
-sh-4.2$
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd\.xml}' > $HOME/standalone-okd.xml
-sh-4.2$ sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' $HOME/standalone-okd.xml
-sh-4.2$ grep "pool-name=\"sihdgDS\"" $HOME/standalone-okd.xml
                <datasource jta="true" jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS" enabled="true" use-ccm="true">
-sh-4.2$
