# 0. Confirmar caminhos e cadeia referenciados no Apache
grep -ri loginxdes /etc/httpd/ 2>/dev/null   # ajuste se o Apache for custom (ps -ef | grep httpd)

# 1. Copiar o .p12 para /tmp e extrair (senha inserida via canal do Teams)
openssl pkcs12 -in /tmp/loginxdes.p12 -out /tmp/loginxdes.caixa.gov.br.key -nodes -nocerts
openssl pkcs12 -in /tmp/loginxdes.p12 -out /tmp/loginxdes.caixa.gov.br.crt -nokeys -clcerts

# 2. Conferir antes de aplicar: validade, emissor e se crt e key casam
openssl x509 -in /tmp/loginxdes.caixa.gov.br.crt -noout -subject -issuer -dates
openssl x509 -in /tmp/loginxdes.caixa.gov.br.crt -noout -modulus | md5sum
openssl rsa  -in /tmp/loginxdes.caixa.gov.br.key -noout -modulus | md5sum   # hashes iguais

# 3. Backup no padrão do Murilo
cd <dir>/alias
mv loginxdes.caixa.gov.br.crt backup/loginxdes.caixa.gov.br.crt.old_WO0000081973727
mv loginxdes.caixa.gov.br.key backup/loginxdes.caixa.gov.br.key.old_WO0000081973727

# 4. Aplicar e ajustar dono/permissão
cp /tmp/loginxdes.caixa.gov.br.{crt,key} .
chown spapadr1:apache loginxdes.caixa.gov.br.*
chmod 644 loginxdes.caixa.gov.br.crt
chmod 640 loginxdes.caixa.gov.br.key

# 5. Validar config e recarregar sem derrubar
apachectl -t && apachectl -k graceful    # ou o reload que esse Apache usar

# 6. Evidência: certificado servido de fato
openssl s_client -connect localhost:443 -servername loginxdes.caixa.gov.br </dev/null 2>/dev/null | openssl x509 -noout -subject -dates

# 7. Limpar o sensível do /tmp
rm -f /tmp/loginxdes.*
