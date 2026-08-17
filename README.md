
-sh-4.2$ oc exec oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK_TOKEN -c simpi-dict-api-des -n simpi-des -- sh -c 'env | grep -i PIX_FRAMEWORK_TOKEN'
grep: simpi-dict-api-des: Arquivo ou diretório não encontrado
grep: simpi-des: Arquivo ou diretório não encontrado
grep: sh: Arquivo ou diretório não encontrado
grep: -c: Arquivo ou diretório não encontrado
grep: env | grep -i PIX_FRAMEWORK_TOKEN: Arquivo ou diretório não encontrado
Error: unknown flag: --list


Usage:
  oc exec [flags] POD [-c CONTAINER] -- COMMAND [args...]

Examples:
  # Get output from running 'date' in ruby-container from pod 'mypod'
  oc exec mypod -c ruby-container date

  # Switch to raw terminal mode, sends stdin to 'bash' in ruby-container from pod 'mypod' and sends stdout/stderr from 'bash' back to the client
  oc exec mypod -c ruby-container -i -t -- bash -il

Options:
  -c, --container='': Container name. If omitted, the first container in the pod will be chosen
  -p, --pod='': Pod name (deprecated)
  -i, --stdin=false: Pass stdin to the container
  -t, --tty=false: Stdin is a TTY

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$
