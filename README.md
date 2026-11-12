
-sh-4.2$
-sh-4.2$ oc get pods -n siepr-des -w | grep bec3
siepr-curso-bec3-frontend-des-17-deploy   0/1       Completed   0          2h
siepr-curso-bec3-frontend-des-18-7zb2w    2/2       Running     0          1h
siepr-curso-bec3-frontend-des-18-deploy   0/1       Completed   0          1h
^C
-sh-4.2$ oc describe pod <pod-19> -n siepr-des | grep -A3 -i "failed to pull"
-sh: pod-19: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siepr-curso-bec3-frontend-des -n siepr-des --list | grep -E "^API_|HORARIO"
API_ARQUIVOS_PATH=https://sibec-arquivos-des.apps.nprd.caixa/api
API_BASE_PATH=https://sibec-micro-des.apps.nprd.caixa/api
API_DADOS_FAMILIA_PATH=https://sibec-dados-familia-des.apps.nprd.caixa/api
API_GESTAO_PATH=https://sibec-gestao-des.apps.nprd.caixa/api
API_MANUTENCAO_PATH=https://sibec-manutencao-des.apps.nprd.caixa/api
API_PARAMETRIZACAO_PATH=https://sibec-parametrizacao-des.apps.nprd.caixa/api
API_RELATORIOS_PATH=https://sibec-relatorios-des.apps.nprd.caixa/api
HORARIO_ACESSO_INTERNET_FINAL=21:00
HORARIO_ACESSO_INTERNET_INICIO=07:00
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/ | grep -oE 'chunk-[A-Za-z0-9]+\.js' | head -1) | grep -c __API_
0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
