
-sh-4.2$ find /opt/ads-agent/_work -path "esteira-jboss-vm" -iname "*.yml" | xargs grep -l -i keycloak 2>/dev/null
find: ‘/opt/ads-agent/_work’: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/modules/system/add-ons/keycloak/
total 0
drwxrwxr-x 3 jboss jboss 17 Out 24  2023 .
drwxrwxr-x 3 jboss jboss 22 Out 24  2023 ..
drwxrwxr-x 3 jboss jboss 22 Out 24  2023 org
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ stat /opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core/main/keycloak-core-22.0.5.jar
  File: “/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core/main/keycloak-core-22.0.5.jar”
  Size: 355266          Blocks: 696        IO Block: 4096   arquivo comum
Device: fd02h/64770d    Inode: 25526185    Links: 1
Access: (0775/-rwxrwxr-x)  Uid: (30000115/   jboss)   Gid: (30000115/   jboss)
Access: 2026-07-13 13:50:30.937234897 -0300
Modify: 2023-10-24 07:13:43.000000000 -0300
Change: 2025-10-31 17:19:04.578120751 -0300
 Birth: -
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "*.retry" -o -iname "ansible-facts*" 2>/dev/null | grep -i jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
