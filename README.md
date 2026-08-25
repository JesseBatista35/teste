
(p585600@10.192.222.70) Password:
Last login: Fri Aug 21 14:23:51 2026 from 10.122.150.31
Oracle Corporation      SunOS 5.11      11.4    November 2019
-bash-5.0$
-bash-5.0$
-bash-5.0$ ps -ef | grep java | grep -E "jboss-eap-7.0" | grep -oE " "jboss.bind.address(.management)?=[0-9.]+|jboss.domain.base.dir=[^ ]+"
-bash: syntax error near unexpected token ‘(’
-bash-5.0$ ps -ef | grep java | grep -E "jboss-eap-7.0" | grep -oE "jboss.bind.address(.management)?=[0-9.]+|jboss.domain.base.dir=[^ ]+"
grep: illegal option -- E
Usage: grep [-c|-l|-q] -bhinsvw pattern file . . .
grep: illegal option -- o
grep: illegal option -- E
Usage: grep [-c|-l|-q] -bhinsvw pattern file . . .
-bash-5.0$ ps -ef | grep java | grep -E "jboss-eap-7.4|jboss-eap-7.0" | grep -oE "jboss.bind.address(.management)?=[0-9.]+|jboss.domain.base.dir=[^ ]+"
grep: illegal option -- E
Usage: grep [-c|-l|-q] -bhinsvw pattern file . . .
grep: illegal option -- o
grep: illegal option -- E
Usage: grep [-c|-l|-q] -bhinsvw pattern file . . .
-bash-5.0$
-bash-5.0$
-bash-5.0$ find /opt -maxdepth 2 -iname "*7.4*" 2>/dev/null
-bash-5.0$
-bash-5.0$
-bash-5.0$ find / -maxdepth 4 -iname "*eap-7.4*" -o -iname "*jboss-eap-7.4*" 2>/dev/null
-bash-5.0$
-bash-5.0$
-bash-5.0$

