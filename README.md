JS=/usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack
ls -l $JS   # se não existir: ls /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/  (pode estar em ../bin ou só haver jre)

for i in 1 2 3; do runuser -u jboss -- $JS -l $P > /tmp/batch-td$i.txt; sleep 10; done
wc -l /tmp/batch-td*.txt

# 1) O WildFly avisa quando um timer ainda está rodando e pula a próxima execução dele
#    → o info= que aparecer aqui é o timer travado
grep -n "WFLYEJB0043" $LOG | tail -5
grep "WFLYEJB0043" $LOG | grep -oE "info=[A-Z0-9_]+" | sort | uniq -c

# 2) O que o batch estava fazendo logo antes de travar (sem as linhas de stack trace)
sed -n '17000,17455p' $LOG | grep -v '^\s*at ' | grep -v '^\s*\.\.\.' | tail -80

