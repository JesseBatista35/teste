sudo su -

mkdir -p /apl/sigsj/lib
\mv -f /tmp/libSenhasSIIBC.so /apl/sigsj/lib/
chown -R jboss:jboss /apl/sigsj/lib
chmod 755 /apl/sigsj/lib /apl/sigsj/lib/libSenhasSIIBC.so
ls -la /apl/sigsj/lib/
ldd /apl/sigsj/lib/libSenhasSIIBC.so

ls -la /opt/jboss-eap/bin/standalone.conf
grep -n "library.path\|JAVA_OPTS" /opt/jboss-eap/bin/standalone.conf | tail -20
systemctl list-units --type=service | grep -i jboss

Me manda a saída. Com ela confirmo onde entra a linha do java.library.path e qual é o nome do serviço para o restart.

Depois, vale fazer a mesma cópia na 955 (intranet), puxando direto de lá:

bash
scp p585600@10.116.88.96:/tmp/libSenhasSIIBC.so /tmp/
