Verificação sugerida (DES, caddeapllx2480)
bash
head -1 /sigdb/run | cat -A        # shebang presente? termina em $ ou ^M$?
ls -lZ /sigdb/run /sigdb/AgtSigdb  # permissão x e contexto SELinux
cat /sigdb/run                     # ele daemoniza (nohup/&) ou roda em foreground?
cat /etc/systemd/system/sigdb.service
getenforce; ausearch -m avc -ts today | grep -i sigdb
