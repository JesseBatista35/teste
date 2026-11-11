Pelo log, o rc.agent_user faz su para o usuário ctmagelx para carregar o ambiente. Use o profile dele.

Opção A: pegar o ambiente do ctmagelx

su - ctmagelx -c 'env | grep -E "CONTROLM|LD_LIBRARY_PATH|^PATH"'

Exporte no seu shell de root os valores que aparecerem e rode ag_ping de novo.

Opção B: achar a lib direto

find /opt/ctmage -name "libBMCOS.so*" 2>/dev/null
export LD_LIBRARY_PATH=<diretorio_encontrado>:$LD_LIBRARY_PATH
ag_ping

O esperado é “Server is alive”. Se vier “Server is not alive” ou “Unknown agent”, a comunicação do seu lado está ok e falta o cadastro do caddeapllx2501 no BR DES - Negocial. Aí é com o time do Control-M.

Pendências para fechar a REQ:

Conferir o etc/hosts-des no repositório SIMIL-precificacao-rotinas-batch-config (main) com 10.192.224.54 cxextrlx038 e sem as linhas do crjdeaprlx ativas.
Rodar uma release EC DES para garantir que a esteira reproduz o que você fez à mão.
Agente “Available” no Control-M e job de teste pelo Iury.
