Precisamos dos certificados corretos. Veja:
bashfind / -name "*.esteiras*" -o -name "*wildcard*" 2>/dev/null | grep -iE "crt|pem|cer" | head -10
bashfind /etc/pki /opt/httpd/conf -name "*.crt" -o -name "*.pem" 2>/dev/null | head -10
bash# Ver o certificado que apareceu no curl externo - onde está armazenado
openssl s_client -connect sicmu-intranet-update.esteiras.des.caixa:443 2>/dev/null | openssl x509 -text | grep -E "Subject:|Issuer:|DNS:"
Preciso saber onde estão os arquivos .crt e .key do certificado wildcard *.esteiras.des.caixa para montar o bloco 443 correto no vhost.
