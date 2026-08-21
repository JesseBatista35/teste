chown ctmagelx:controlm /sigdb/sigdb/TRANSMITE
chmod 775 /sigdb/sigdb/TRANSMITE
su - ctmagelx -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao && echo OK && rm /sigdb/sigdb/TRANSMITE/teste_permissao"
