
-sh-4.2$ oc debug -n sispl-des --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3 -- bash
Error: unknown flag: --image


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
-sh-4.2$
-sh-4.2$
-sh-4.2$ nc -zv 10.192.224.76 5021
Ncat: Version 7.50 ( https://nmap.org/ncat )
Ncat: Connected to 10.192.224.76:5021.
Ncat: 0 bytes sent, 0 bytes received in 0.01 seconds.
-sh-4.2$ nc -zv 10.192.224.76 5051
Ncat: Version 7.50 ( https://nmap.org/ncat )
Ncat: Connected to 10.192.224.76:5051.
Ncat: 0 bytes sent, 0 bytes received in 0.01 seconds.
-sh-4.2$ nc -zv 10.192.228.145 1418
Ncat: Version 7.50 ( https://nmap.org/ncat )
Ncat: Connected to 10.192.228.145:1418.
Ncat: 0 bytes sent, 0 bytes received in 0.01 seconds.
-sh-4.2$ curl -vk https://logindes.caixa.gov.br/auth/realms/internet
* About to connect() to logindes.caixa.gov.br port 443 (#0)
*   Trying 10.116.81.75...
* Connected to logindes.caixa.gov.br (10.116.81.75) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
* Server certificate:
*       subject: CN=logindes.caixa.gov.br
*       start date: Jun 16 00:00:00 2026 GMT
*       expire date: Dez 31 23:59:59 2026 GMT
*       common name: logindes.caixa.gov.br
*       issuer: CN=Sectigo Public Server Authentication CA DV R36,O=Sectigo Limited,C=GB
> GET /auth/realms/internet HTTP/1.1
> User-Agent: curl/7.29.0
> Host: logindes.caixa.gov.br
> Accept: */*
>
< HTTP/1.1 200 OK
< Date: Tue, 28 Jul 2026 20:14:35 GMT
< Server: Apache/2.4.46 (Unix)
< Cache-Control: no-cache
< Content-Type: application/json
< Content-Length: 631
< Request-Context: appId=f94af886-cd60-4c6e-b856-7185f640fe46
< X-FRAME-OPTIONS: SAMEORIGIN
< X-XSS-Protection: 1;mode=block
< X-Content-type-options: nosniff
< Set-Cookie: ROUTEID=.; path=/; Secure; SameSite=Lax
<
* Connection #0 to host logindes.caixa.gov.br left intact
{"realm":"internet","public_key":"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB","token-service":"https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect","account-service":"https://logindes.caixa.gov.br/auth/realms/internet/account","tokens-not-before":1579379479}-sh-4.2$
