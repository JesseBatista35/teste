runuser -u jboss -- $JS -F $P > /tmp/batch-tdF.txt 2>&1 || $JS -F $P > /tmp/batch-tdF.txt 2>&1
grep -n -A40 "EJB default - 2" /tmp/batch-tdF.txt | head -60





# Tudo que a EJB default - 2 escreveu depois das 09:24 (exceto erros de lock)
awk 'NR>17440 && /\(EJB default - 2\)/' $LOG | grep -v WFLYEJB | head -10

# Execuções bem-sucedidas anteriores: qual é o passo seguinte ao "Gerando XML ACTC"
grep -h -A4 "Gerando XML ACTC" $LOG ${LOG}.2026-09-2* 2>/dev/null | grep -v '^\s*at ' | head -30

# Quando o ProcessadorLegado começou a ficar preso
grep -n "WFLYEJB0043" $LOG | grep ProcessadorLegado | head -2



curl -v --max-time 15 https://apim-parceiros-sandbox.azure-api.net/ 2>&1 | tail -5
curl -v --max-time 15 -x http://proxydes.caixa:80 https://apim-parceiros-sandbox.azure-api.net/ 2>&1 | tail -5
