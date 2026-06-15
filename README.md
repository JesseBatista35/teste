-sh-4.2$ oc delete route integra.iniciadora -n siinp-tqs
route.route.openshift.io "integra.iniciadora" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create route edge integra.iniciadora
Error: required flag(s) "service" not set


Usage:
  oc create route edge [NAME] --service=SERVICE [flags]

Examples:
  # Create an edge route named "my-route" that exposes frontend service.
  oc create route edge my-route --service=frontend

  # Create an edge route that exposes the frontend service and specify a path.
  # If the route name is omitted, the service name will be re-used.
  oc create route edge --service=frontend --path /assets

Options:
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --ca-cert='': Path to a CA certificate file.
      --cert='': Path to a certificate file.
      --dry-run=false: If true, only print the object that would be sent, without sending it.
      --hostname='': Set a hostname for the new route
      --insecure-policy='': Set an insecure policy for the new route
      --key='': Path to a key file.
  -o, --output='': Output format. One of: json|yaml|name|templatefile|template|go-template|go-template-file|jsonpath-file|jsonpath.
      --path='': Path that the router watches to route traffic to the service.
      --port='': Name of the service port or number of the container port the route will route traffic to
      --service='': Name of the service that the new route is exposing
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
      --validate=false: If true, use a schema to validate the input before sending it
      --wildcard-policy='': Sets the WilcardPolicy for the hostname, the default is "None". valid values are "None" and "Subdomain"

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ --service=siinp-nucleo-web-tqs
-sh: --service=siinp-nucleo-web-tqs: comando não encontrado
-sh-4.2$ --hostname=integra.iniciadora.caixa.gov.br
-sh: --hostname=integra.iniciadora.caixa.gov.br: comando não encontrado
-sh-4.2$ -n siinp-tqs
-sh: -n: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create route edge integra.iniciadora
Error: required flag(s) "service" not set


Usage:
  oc create route edge [NAME] --service=SERVICE [flags]

Examples:
  # Create an edge route named "my-route" that exposes frontend service.
  oc create route edge my-route --service=frontend

  # Create an edge route that exposes the frontend service and specify a path.
  # If the route name is omitted, the service name will be re-used.
  oc create route edge --service=frontend --path /assets

Options:
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --ca-cert='': Path to a CA certificate file.
      --cert='': Path to a certificate file.
      --dry-run=false: If true, only print the object that would be sent, without sending it.
      --hostname='': Set a hostname for the new route
      --insecure-policy='': Set an insecure policy for the new route
      --key='': Path to a key file.
  -o, --output='': Output format. One of: json|yaml|name|go-template|go-template-file|templatefile|template|jsonpath|jsonpath-file.
      --path='': Path that the router watches to route traffic to the service.
      --port='': Name of the service port or number of the container port the route will route traffic to
      --service='': Name of the service that the new route is exposing
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
      --validate=false: If true, use a schema to validate the input before sending it
      --wildcard-policy='': Sets the WilcardPolicy for the hostname, the default is "None". valid values are "None" and "Subdomain"

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ --service=siinp-nucleo-web-tqs
-sh: --service=siinp-nucleo-web-tqs: comando não encontrado
-sh-4.2$ --hostname=integra.iniciadora.caixa.gov.br
-sh: --hostname=integra.iniciadora.caixa.gov.br: comando não encontrado
-sh-4.2$ -n siinp-tq
-sh: -n: comando não encontrado
-sh-4.2$ E0615 15:47:42.373064   50292 portforward.go:178] lost connection to pod

[1]+  Concluído              oc port-forward svc/siinp-nucleo-tqs 8080:8080
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
