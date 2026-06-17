
-sh-4.2$ find /usr/lib/jvm -name "cacerts" 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /usr/lib/jvm/*/jre/lib/security/cacerts
ls: não é possível acessar /usr/lib/jvm/*/jre/lib/security/cacerts: Arquivo ou diretório não encontrado
-sh-4.2$ readlink -f /usr/bin/java
/usr/java/jdk1.8.0_181/jre/bin/java
-sh-4.2$
-sh-4.2$
-sh-4.2$
