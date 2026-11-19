Está tudo certo para usar:

a libSenhasSIIBC.so é só um link para a _Linux64;
o arquivo real é 64-bit x86-64;
a única dependência é a libc, que já existe em qualquer Linux.

Pode copiar.

1. No 0039:

bash
cp /prod/load/ran/tpc/lib/libSenhasSIIBC_Linux64.so /tmp/libSenhasSIIBC.so
chmod 644 /tmp/libSenhasSIIBC.so
hostname -i

2. No cadsvitrlx100 (troca o IP pelo que o hostname -i mostrou):

bash
scp p585600@<IP_DO_0039>:/tmp/libSenhasSIIBC.so .
scp libSenhasSIIBC.so p585600@10.116.202.45:/tmp/
scp libSenhasSIIBC.so p585600@10.116.194.179:/tmp/

3. Na 2854 (internet), como root:

bash
md5sum /tmp/libSenhasSIIBC.so          # tem que dar 9f4b9758ac4f4c75cd9e7cf6826eed38
mkdir -p /apl/sigsj/lib
\mv -f /tmp/libSenhasSIIBC.so /apl/sigsj/lib/
chown -R jboss:jboss /apl/sigsj/lib
chmod 755 /apl/sigsj/lib /apl/sigsj/lib/libSenhasSIIBC.so
ldd /apl/sigsj/lib/libSenhasSIIBC.so

ls -la /opt/jboss-eap/bin/standalone.conf
grep -n "library.path" /opt/jboss-eap/bin/standalone.conf
systemctl list-units --type=service | grep -i jboss

Me manda essa saída antes de mexer no standalone.conf e reiniciar. Assim confirmo o caminho do arquivo e o nome do serviço, e você não reinicia nada no escuro. A 955 (intranet) a gente faz logo depois, do mesmo jeito.
