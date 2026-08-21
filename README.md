# Ver o script run real que a app usa
cat /opt/batch/config/sigdb/des/run
ls -la /sigdb/
cat /sigdb/run 2>/dev/null | head -30

# Confirmar que ctmagelx não tem acesso de escrita
sudo -u ctmagelx touch /sigdb/sigdb/TRANSMITE/teste_permissao 2>&1
# (se não tiver sudo, comparar id ctmagelx com dono/grupo do diretório é suficiente)
