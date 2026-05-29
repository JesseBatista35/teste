Estamos recebendo um erro quando a action de segurança é ativada
https://github.com/caixagithub/sirmc-api-suitability/actions/runs/26595411567/job/78364866158?pr=3

informa que falta incluir a linguagem utilizada.

Solicitamos auxilio.


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sirmc-api-suitability
Repository navigation
Code
Issues
1
 (1)
Pull requests
1
 (1)
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
Back to pull request #3
Seguranca-__. #14
All jobs
Run details
Annotations
1 error and 1 warning
CodeQL / Create language matrix
failed yesterday in 19s
Search logs
2s
10s
1s
0s
0s
2s
1s
0s
Run input=${input:-[]}
  input=${input:-[]}
  input=${input:-}
  
  cleaned=${input//[\[\]]/}
  json=$(awk -v str="$cleaned" 'BEGIN {
      n = split(str, a, ",");
      printf "[";
      for (i = 1; i <= n; i++) {
          gsub(/^[[:space:]]+|[[:space:]]+$/, "", a[i]);
          gsub(/^"|"$/, "", a[i]);
          printf "\"%s\"%s", a[i], (i < n ? "," : "")
      }
      print "]"
  }')
  if [[ -z "$json" || "$json" == "[]" ]]; then
    echo "Nenhuma linguagem detectada"
    exit 1
  fi
  echo "languages=$json" >> $GITHUB_OUTPUT
  shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
  env:
    pythonLocation: /opt/hostedtoolcache/Python/3.11.15/x64
    PKG_CONFIG_PATH: /opt/hostedtoolcache/Python/3.11.15/x64/lib/pkgconfig
    Python_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.15/x64
    Python2_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.15/x64
    Python3_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.15/x64
    LD_LIBRARY_PATH: /opt/hostedtoolcache/Python/3.11.15/x64/lib
Nenhuma linguagem detectada
Error: Process completed with exit code 1.
0s
0s
0s
1s
0s
