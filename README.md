sudo chkconfig --list postfix          # se está desabilitado no boot (parado de propósito) ou caiu
sudo ls -l /var/spool/postfix/maildrop/ # suas 2 mensagens de teste devem estar aqui
sudo postsuper -d ALL                   # opcional: descarta os testes, para não saírem se alguém subir o Postfix depois
