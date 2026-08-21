su - ctmagelx -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao" 2>&1


chown ctmagelx:controlm /sigdb/sigdb/TRANSMITE
chmod 775 /sigdb/sigdb/TRANSMITE

# valida
su - ctmagelx -c "touch /sigdb/sigdb/TRANSMITE/teste_permissao && echo OK && rm /sigdb/sigdb/TRANSMITE/teste_permissao"



ls -la /sigdb/sigdb.zip
find / -xdev -newer /sigdb/sigdb.zip -iname "*.log" 2>/dev/null | grep -i deploy
# ou, se souber o horário do último release, comparar com mtime do zip
stat /sigdb/sigdb.zip
