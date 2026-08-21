
chown f593268:supadmin /sigdb/sigdb/TRANSMITE
chmod 775 /sigdb/sigdb/TRANSMITE

# validar como o usuário real da aplicação
su - f593268 -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao && echo OK && rm /sigdb/sigdb/TRANSMITE/teste_permissao"
