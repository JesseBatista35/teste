No LX104 (root):

bash
LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log

# 1. Cabeçalho do stack trace que se repete
awk 'NR<=735 && /^[0-9]{4}-/{l=NR": "$0} NR==735{print l}' $LOG | cut -c1-400

# 2. Exceções mais frequentes
grep -oE "^[a-zA-Z_.$]+(Exception|Error)[^ ]*(: .{0,150})?" $LOG | sort | uniq -c | sort -rn | head -15
grep -oE "^[0-9]{4}-[0-9-]+ [0-9:,]+(ERROR|WARN).{0,180}" $LOG | cut -c24- | sed 's/[0-9]\{3,\}/N/g' | sort | uniq -c | sort -rn | head -15

# 3. Destino das conexões (coluna 5) e quem é 10.252.32.63/65
date; ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
ss -tnp | grep "pid=72951" | awk '{print $5}' | sort | uniq -c | sort -rn | head
getent hosts proxydes.caixa 10.252.32.63 10.252.32.65

No DC: saia do jboss-cli antes (exit), depois:

bash
ps -ef | grep "Host Controller" | grep -o "org.jboss.boot.log.file=[^ ]*"
grep -nE "SIGEC-PORTABILIDADE-BATCH|deploy" <arquivo_retornado_acima> | tail -40

O item 3 é o mais importante: rodando de novo, vemos se a contagem passou de 234 (às 14:30). Se continuar subindo nesse ritmo, o vazamento fica confirmado.
