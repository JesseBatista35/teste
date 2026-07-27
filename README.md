curl -vk --max-time 10 https://logindes.caixa.gov.br/


nslookup logindes.caixa.gov.br

openssl s_client -connect logindes.caixa.gov.br:443 -servername logindes.caixa.gov.br 2>&1 | head -30
