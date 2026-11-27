1. Veja como o script funciona antes de usar:

bash
head -60 /opt/open/jboss/7.0.0/scripts/jboss-admin
grep -nE 'start\)|stop\)|status\)|USER|domain.sh|standalone.sh' /opt/open/jboss/7.0.0/scripts/jboss-admin

2. Suba pelo service:

bash
service jboss status
service jboss start

Se o script pedir um parâmetro diferente, como start domain ou o nome da instância, a saída do passo 1 mostra qual é.

3. Confira se subiu:

bash
ps -ef | grep [j]ava
ss -lntp | grep 9999
ls -lt /opt/open/jboss/7.0.0/*/log/ 2>/dev/null | head

Quando a 9999 aparecer, rode a "Reciclagem sifpp" de novo.

4. Veja por que não subiu sozinho no boot:

bash
chkconfig --list jboss

Se estiver off nos runlevels 3 e 5, ative com chkconfig jboss on. Assim ele volta junto com a VM no próximo reboot.

Se o start der erro ou o processo morrer logo depois de subir, me manda a saída do head do script e o final do log.
