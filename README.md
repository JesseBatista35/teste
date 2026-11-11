Como root, faça nesta ordem:

1. Ver se o agente sobe por serviço

systemctl list-units --all | grep -iE "ctm|control"

Se aparecer um serviço (ex.: ctmag.service), use só ele e pule para o passo 4:

systemctl restart <servico>
systemctl status <servico>

2. Se não houver serviço, carregar o ambiente do agente

ls -a /opt/ctmage
grep -l CONTROLM /opt/ctmage/.* 2>/dev/null

Faça source no arquivo que aparecer (normalmente .bash_profile ou .profile):

source /opt/ctmage/.bash_profile
echo $CONTROLM

Se não houver profile, exporte na mão:

export CONTROLM=/opt/ctmage/ctm
export PATH=$CONTROLM/scripts:$CONTROLM/exe:$PATH

3. Reiniciar o agente

$CONTROLM/scripts/shut-ag -u root -p ALL
$CONTROLM/scripts/start-ag -u root -p ALL
ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep

Os PIDs precisam mudar e a hora de início precisa ser de hoje.

4. Validar

$CONTROLM/exe/ag_ping
$CONTROLM/scripts/ag_diag_comm

Esperado: “Server is alive” no ag_ping, e no ag_diag_comm o server host cxextrlx038 com comunicação ok.

Se o ag_ping falhar mesmo com a porta 7015 aberta, provavelmente o agente ainda não está cadastrado no BR DES - Negocial. Nesse caso, peça ao time do Control-M para incluir o caddeapllx2501.

Lembre também do repositório: confira o etc/hosts-des no SIMIL-precificacao-rotinas-batch-config (main) com 10.192.224.54 cxextrlx038. Assim a próxima release mantém o que você ajustou à mão.
