
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# rm -rf /tmp/ear && mkdir /tmp/ear && cd /tmp/ear
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# unzip -q /opt/jboss-eap/standalone/deployments/gec-ear.ear
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# mkdir war && cd war && unzip -q ../gec-web.war && cd ..
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# echo "=== web.xml: AppServlet ==="
=== web.xml: AppServlet ===
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# grep -n -B2 -A4 "AppServlet" war/WEB-INF/web.xml
10-     </context-param>
11-     <servlet>
12:             <display-name>AppServlet</display-name>
13:             <servlet-name>AppServlet</servlet-name>
14:             <servlet-class>br.gov.caixa.arqrefweb.controle.AppServlet</servlet-class>
15-     </servlet>
16-     <servlet-mapping>
17:             <servlet-name>AppServlet</servlet-name>
18:             <url-pattern>/AppServlet</url-pattern>
19-     </servlet-mapping>
20-     <welcome-file-list>
21-             <welcome-file>index.html</welcome-file>
22-     </welcome-file-list>
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# echo "=== jars que contêm AppServlet (EAR e WAR) ==="
=== jars que contêm AppServlet (EAR e WAR) ===
[root@caddeapllx2871 ear]# for j in $(find . -name '*.jar'); do unzip -l "$j" 2>/dev/null | grep -q 'arqrefweb/controle/AppServlet' && echo "$j"; done
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# echo "=== classes soltas no WAR ==="
find war/WEB-INF/classes -path '*arqrefweb*' | head
=== classes soltas no WAR ===
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# echo "=== jars arqref no EAR/WAR ==="
=== jars arqref no EAR/WAR ===
[root@caddeapllx2871 ear]# find . -iname '*arqref*' | sort
./lib/br.gov.caixa.arqref-arqref-core-3.7.2.2.jar
./war/WEB-INF/lib/arqref-core-3.7.2.2.jar
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]#
[root@caddeapllx2871 ear]# echo "=== modulos do JBoss com arqref ==="
=== modulos do JBoss com arqref ===
[root@caddeapllx2871 ear]# find /opt/jboss-eap/modules -iname '*arqref*' | head
[root@caddeapllx2871 ear]#
