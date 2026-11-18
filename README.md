# execuções/sysout de hoje
ls -ltr /opt/ctmage/ctm/sysout | tail -10

# log do agente de hoje (se existir, houve comunicação do servidor)
ls -ltr /opt/ctmage/ctm/dailylog | tail -5
tail -50 /opt/ctmage/ctm/dailylog/daily_ctmag_20261118.log

# o script existe e é executável pelo ctmagelx?
ls -l /producao/simil-precificacao-rotinas-batch.sh
