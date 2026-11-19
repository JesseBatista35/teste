No 0039:

bash
cd /prod/load/ran/tpc/lib
ls -la libSenhasSIIBC*
file libSenhasSIIBC.so libSenhasSIIBC_Linux64.so
ldd libSenhasSIIBC_Linux64.so
ldd libSenhasSIIBC.so
md5sum libSenhasSIIBC*

Como interpretar:

file: a que vamos usar tem que dizer ELF 64-bit x86-64.
ls -la: se libSenhasSIIBC.so for um link para a _Linux64, já está resolvido.
ldd: se aparecer not found em alguma linha, essa dependência também precisa ir para a VM. Me manda que a gente vê.

Copiar para as VMs (passando pelo cadsvitrlx100, caso o 0039 não alcance a 2854 direto):

bash
# no 0039
cp /prod/load/ran/tpc/lib/libSenhasSIIBC_Linux64.so /tmp/libSenhasSIIBC.so
chmod 644 /tmp/libSenhasSIIBC.so

# no cadsvitrlx100
scp p585600@10.116.82.x:/tmp/libSenhasSIIBC.so .        # IP do 0039
scp libSenhasSIIBC.so p585600@10.116.202.45:/tmp/        # internet 2854
scp libSenhasSIIBC.so p585600@10.116.194.179:/tmp/       # intranet 955

Uso a _Linux64 renomeada para libSenhasSIIBC.so porque a VM é 64-bit. Se o file mostrar que a libSenhasSIIBC.so também é 64-bit e as duas têm o mesmo md5, tanto faz qual copiar.

Em cada VM (2854 e depois 955), como root:

bash
mkdir -p /apl/sigsj/lib
\mv -f /tmp/libSenhasSIIBC.so /apl/sigsj/lib/
chown -R jboss:jboss /apl/sigsj/lib
chmod 755 /apl/sigsj/lib /apl/sigsj/lib/libSenhasSIIBC.so
ldd /apl/sigsj/lib/libSenhasSIIBC.so      # nenhum "not found"

# incluir o library path no standalone.conf (backup antes)
cp -p /opt/jboss-eap/bin/standalone.conf /opt/jboss-eap/bin/standalone.conf.bkp_$(date +%Y%m%d)
echo 'JAVA_OPTS="$JAVA_OPTS -Djava.library.path=/apl/sigsj/lib"' >> /opt/jboss-eap/bin/standalone.conf

systemctl restart jboss-eap 2>/dev/null || systemctl list-units | grep -i jboss   # se o nome do serviço for outro, me fala
ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"

Antes do echo, confere com ls /opt/jboss-eap/bin/standalone.conf se o caminho é esse mesmo. Depois do restart, testa o login no sigsj-internet.des.caixa e acompanha o log com grep -i SenhasSIIBC server.log.

Duas pendências para depois que funcionar:

Deixar persistente: a linha do java.library.path vai para o standalone.conf no repo SIGSJ-internet-config e no SIGSJ-intranet-config. Senão, a próxima release sobrescreve o arquivo.
A .so em si: a esteira não entrega esse arquivo, então ela fica manual por enquanto, como o log4j. Entra no mesmo assunto que está com o Rafael Augusto (custom.sh).
