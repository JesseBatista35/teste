O pgrep pegou o processo errado (veio /usr, que não é o Java). No modo domain, o processo do servidor tem -D[Server:...] no nome, então vamos buscar por ele:

PID=$(pgrep -f "D\[Server:sifec-intranet_node1_lx473\]" | head -1); echo "PID: $PID"
sudo readlink -f /proc/$PID/exe

O esperado é algo como /usr/lib/jvm/java-1.8.0-openjdk-.../jre/bin/java.

Se vier certo, defina o JHOME e confira:

JHOME=$(dirname $(dirname $(sudo readlink -f /proc/$PID/exe))); echo $JHOME
ls -l $JHOME/lib/security/cacerts $JHOME/bin/keytool

Se o PID vier vazio, ou o caminho ainda for estranho, rode este e me mande a saída:

ls -d /usr/lib/jvm/*/jre

Aí eu te digo qual JHOME usar.

A pasta /opt/jboss/truststore já foi criada. Depois disso, seguimos do passo 2 (baixar a cadeia do login.des.caixa).
