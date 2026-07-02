-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos -n -o yaml | grep -A 40 "env:"
No resources found.
Error from server (NotFound): namespaces "-o" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sibec-arquivos --list -n | grep -i -E "pass|senha|datasource"
Error: flag needs an argument: 'n' in -n


Usage:
  oc set env RESOURCE/NAME KEY_1=VAL_1 ... KEY_N=VAL_N [flags]

Examples:
  # Update deployment 'registry' with a new environment variable
  oc set env dc/registry STORAGE_DIR=/local

  # List the environment variables defined on a build config 'sample-build'
  oc set env bc/sample-build --list

  # List the environment variables defined on all pods
  oc set env pods --all --list

  # Output modified build config in YAML
  oc set env bc/sample-build STORAGE_DIR=/data -o yaml

  # Update all containers in all replication controllers in the project to have ENV=prod
  oc set env rc --all ENV=prod

  # Import environment from a secret
  oc set env --from=secret/mysecret dc/myapp

  # Import environment from a config map with a prefix
  oc set env --from=configmap/myconfigmap --prefix=MYSQL_ dc/myapp

  # Remove the environment variable ENV from container 'c1' in all deployment configs
  oc set env dc --all --containers="c1" ENV-

  # Remove the environment variable ENV from a deployment config definition on disk and
  # update the deployment config on the server
  oc set env -f dc.json ENV-

  # Set some of the local shell environment into a deployment config on the server
  env | grep RAILS_ | oc set env -e - dc/registry

Options:
      --all=false: If true, select all resources in the namespace of the specified resource types
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
  -c, --containers='*': The names of containers in the selected pod templates to change - may use wildcards
      --dry-run=false: If true, only print the object that would be sent, without sending it.
  -e, --env=[]: Specify a key-value pair for an environment variable to set into each container.
  -f, --filename=[]: Filename, directory, or URL to files to use to edit the resource
      --from='': The name of a resource from which to inject environment variables
      --list=false: If true, display the environment and any changes in the standard format
      --local=false: If true, set image will NOT contact api-server but run locally.
  -o, --output='': Output format. One of: json|yaml|name|go-template|go-template-file|templatefile|template|jsonpath|jsonpath-file.
      --overwrite=true: If true, allow environment to be overwritten, otherwise reject updates that overwrite existing environment.
      --prefix='': Prefix to append to variable names
  -R, --recursive=false: Process the directory used in -f, --filename recursively. Useful when you want to manage related manifests organized within the same directory.
      --resolve=false: If true, show secret or configmap references when listing variables
      --resource-version='': If non-empty, the labels update will only succeed if this is the current resource-version for the object. Only valid when specifying a single resource.
  -l, --selector='': Selector (label query) to filter on
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.volumes}' | jq oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | jq
jq: Unknown option -o
Use jq --help for help with command-line options,
or see the jq manpage, or online docs  at https://stedolan.github.io/jq
No resources found.
Error from server (NotFound): namespaces "-o" not found
-sh-4.2$

