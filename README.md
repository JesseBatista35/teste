O caminho mais curto, uns 2 minutos:

1. Restaurar o agente agora (como root)

sed -i -E 's/^(CTMSHOST[[:space:]]+).*/\1cxextrlx038/; s/^(CTMPERMHOSTS[[:space:]]+).*/\1cxextrlx038/' /opt/ctmage/ctm/data/CONFIG.dat
systemctl restart controlm_agent.service
ag_ping

2. Corrigir a release

Em Releases > SIMIL-precificacao-rotinas-batch > Edit > Variables > Pipeline variables, apague CTMSHOST e CTMPERMHOSTS (ou troque por cxextrlx038) e salve. Não precisa rodar a release de novo agora.
