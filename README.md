
-sh-4.2$ oc debug pod -n sicbc-des sicbc-backend-des-15-mstdb -it --image=busybox
Error: unknown shorthand flag: 'i' in -it


Usage:
  oc debug RESOURCE/NAME [ENV1=VAL1 ...] [-c CONTAINER] [flags] [-- COMMAND]

Examples:
  # Debug a currently running deployment
  oc debug dc/test

  # Test running a deployment as a non-root user
  oc debug dc/test --as-user=1000000

  # Debug a specific failing container by running the env command in the 'second' container
  oc debug dc/test -c second -- /bin/env

  # See the pod that would be created to debug
  oc debug dc/test -o yaml

Options:
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --as-root=false: If true, try to run the container as the root user
      --as-user=-1: Try to run the container as a specific user UID (note: admins may limit your ability to use this flag)
  -c, --container='': Container name; defaults to first container
      --dry-run=false: If true, only print the object that would be sent, without sending it.
  -f, --filename=[]: Filename, directory, or URL to files to read a template
      --keep-annotations=false: If true, keep the original pod annotations
      --keep-init-containers=true: Run the init containers for the pod. Defaults to true.
      --keep-liveness=false: If true, keep the original pod liveness probes
      --keep-readiness=false: If true, keep the original pod readiness probes
  -I, --no-stdin=false: Bypasses passing STDIN to the container, defaults to true if no command specified
  -T, --no-tty=false: Disable pseudo-terminal allocation
      --node-name='': Set a specific node to run on - by default the pod will run on any valid node
      --one-container=false: If true, run only the selected container, remove all others
  -o, --output='': Output format. One of: json|yaml|name|template|go-template|go-template-file|templatefile|jsonpath|jsonpath-file.
  -R, --recursive=false: Process the directory used in -f, --filename recursively. Useful when you want to manage related manifests organized within the same directory.
      --show-labels=false: When printing, show all labels as the last column (default hide labels column)
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
  -t, --tty=false: Force a pseudo-terminal to be allocated

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$
