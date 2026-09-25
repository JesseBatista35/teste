wc -l /tmp/batch-tdF.txt; head -5 /tmp/batch-tdF.txt
grep -n "oracle.jdbc\|socketRead\|br\.gov\.caixa\|\.gec\." /tmp/batch-tdF.txt | head -40

# Conexões abertas do batch com o banco (porta 1521) e com o Service Bus (5671)
ss -tnp | grep "pid=$P," | awk '{print $5}' | sort | uniq -c | sort -rn | head

