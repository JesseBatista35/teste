sudo su -
LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log

# 1. acha as linhas de RESPOSTA (recebida/descida), não as enviadas
grep -a -i "recebid\|descida\|resposta\|retorno" "$LOG" | tail -5

# 2. pega uma linha com trecho acentuado e mostra os bytes
grep -a -i "sito\|lculo\|metros\|nios" "$LOG" | tail -1 | hexdump -C | head -40
