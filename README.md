root@crjtqapllx036 tmp]# grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
            <inet-address value="${jboss.bind.address.management:10.116.88.148}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address:10.116.88.148}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address.private:10.116.88.148}"/>
        </interface>
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]# find /opt/open/sso/7.3.0 -iname "*standalone*.sh" -o -iname "jboss-standalone*"
/opt/open/sso/7.3.0/bin/standalone.sh
[root@crjtqapllx036 tmp]# ls -la /opt/open/sso/7.3.0/bin/
total 3040
drwxr-x--x  4 spssodr1 singlesignon    4096 May  6  2025 .
drwxr-xr-x 13 spssodr1 singlesignon    4096 Jul 21 15:21 ..
-rw-r--r--  1 spssodr1 singlesignon    3804 Jan  9  2019 adapter-elytron-install.cli
-rw-r--r--  1 spssodr1 singlesignon    3866 Jan  9  2019 adapter-elytron-install-offline.cli
-rw-r--r--  1 spssodr1 singlesignon     351 Jan  9  2019 adapter-install.cli
-rw-r--r--  1 spssodr1 singlesignon     412 Jan  9  2019 adapter-install-offline.cli
-rw-r--r--  1 spssodr1 singlesignon    2417 Jan  9  2019 add-user.bat
-rw-r--r--  1 spssodr1 singlesignon    2187 Jan  9  2019 add-user-keycloak.bat
-rwxr-xr-x  1 spssodr1 singlesignon    2239 Jan  9  2019 add-user-keycloak.sh
-rw-r--r--  1 spssodr1 singlesignon    2444 Jan  9  2019 add-user.properties
-rw-r--r--  1 spssodr1 singlesignon    1069 Jan  9  2019 add-user.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2392 Jan  9  2019 add-user.sh
-rwxr-xr-x  1 spssodr1 singlesignon    4621 Jan  9  2019 appclient.sh
drwxr-x--x  2 spssodr1 singlesignon    4096 Dec  3  2019 client
-rw-r--r--  1 spssodr1 singlesignon     916 Jan  9  2019 common.bat
-rw-r--r--  1 spssodr1 singlesignon   11030 Jan  9  2019 common.ps1
-rwxr-xr-x  1 spssodr1 singlesignon     877 Jan  9  2019 common.sh
-rw-r--r--  1 spssodr1 singlesignon    6526 Jan  9  2019 domain.bat
-rw-r--r--  1 spssodr1 singlesignon    2666 Jan  9  2019 domain.conf
-rw-r--r--  1 spssodr1 singlesignon    3331 Jan  9  2019 domain.conf.bat
-rw-r--r--  1 spssodr1 singlesignon    2984 Jan  9  2019 domain.conf.ps1
-rw-r--r--  1 spssodr1 singlesignon    3624 Jan  9  2019 domain.ps1
-rwxr-xr-x  1 spssodr1 singlesignon   11499 Jan  9  2019 domain.sh
-rw-r--r--  1 spssodr1 singlesignon    1708 Jan  9  2019 elytron-tool.bat
-rw-r--r--  1 spssodr1 singlesignon    1079 Jan  9  2019 elytron-tool.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    1793 Jan  9  2019 elytron-tool.sh
-rwxr-xr-x  1 spssodr1 singlesignon    1018 Jan  9  2019 federation-sssd-setup.sh
drwxr-xr-x  2 spssodr1 singlesignon    4096 Jan  9  2019 init.d
-rw-r--r--  1 spssodr1 singlesignon    3271 Jan  9  2019 jboss-cli.bat
-rw-r--r--  1 spssodr1 singlesignon    1933 Jan  9  2019 jboss-cli-logging.properties
-rw-r--r--  1 spssodr1 singlesignon     893 Jan  9  2019 jboss-cli.ps1
-rw-r--r--  1 spssodr1 singlesignon     477 Jan  9  2019 .jbossclirc
-rwxr-xr-x  1 spssodr1 singlesignon    2673 Jun 13  2022 jboss-cli.sh
-rwxr-xr-x  1 root     root            2635 Jun 13  2022 .jboss-cli.sh.20220613100603.p971504
-rw-r--r--  1 spssodr1 singlesignon    2581 Jan  9  2019 jboss-cli.xml
-rw-r--r--  1 spssodr1 singlesignon    2083 Jan  9  2019 jconsole.bat
-rw-r--r--  1 spssodr1 singlesignon    1065 Jan  9  2019 jconsole.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2424 Jan  9  2019 jconsole.sh
-rw-r--r--  1 spssodr1 singlesignon    2175 Jan  9  2019 jdr.bat
-rw-r--r--  1 spssodr1 singlesignon     693 Jan  9  2019 jdr.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2172 Jan  9  2019 jdr.sh
-rw-r--r--  1 spssodr1 singlesignon     218 Dec  3  2019 kcadm.bat
-rwxr-xr-x  1 spssodr1 singlesignon    1051 Dec  3  2019 kcadm.sh
-rw-r--r--  1 spssodr1 singlesignon     239 Dec  3  2019 kcreg.bat
-rwxr-xr-x  1 spssodr1 singlesignon     571 Dec  3  2019 kcreg.sh
-rw-r--r--  1 spssodr1 singlesignon   51705 Dec  3  2019 launcher.jar
-rw-r--r--  1 spssodr1 singlesignon   37290 Jan  9  2019 migrate-domain-clustered.cli
-rw-r--r--  1 spssodr1 singlesignon   32582 Jan  9  2019 migrate-domain-standalone.cli
-rw-r--r--  1 spssodr1 singlesignon   27755 Jan  9  2019 migrate-standalone.cli
-rw-r--r--  1 spssodr1 singlesignon   33285 Jan  9  2019 migrate-standalone-ha.cli
-rw-r--r--  1 spssodr1 singlesignon     216 May 21  2022 mqjms.log.0
-rw-r--r--  1 spssodr1 singlesignon       0 May 21  2022 mqjms.log.0.lck
-rw-r--r--  1 spssodr1 singlesignon      12 Jan  9  2019 product.conf
-rw-r--r--  1 spssodr1 singlesignon   18003 Dec  3  2019 service.bat
-rw-r--r--  1 spssodr1 singlesignon    9318 Dec  3  2019 standalone.bat
-rw-r--r--  1 spssodr1 singlesignon    3286 May  6  2025 standalone.conf
-rw-r--r--  1 spssodr1 singlesignon    3297 Oct 21  2021 .standalone.conf.20211021021047.p746770
-rw-r--r--  1 spssodr1 singlesignon    3301 Jan 27  2022 .standalone.conf.20220127190112.p412846
-rw-r--r--  1 spssodr1 singlesignon    3298 May  7  2022 .standalone.conf.20220507220506.p528227
-rw-r--r--  1 spssodr1 singlesignon    3297 May 21  2022 .standalone.conf.20220521100559.p971504
-rw-r--r--  1 root     root            3014 Apr 17  2025 .standalone.conf.20250417190445.p725476
-rw-r--r--  1 spssodr1 singlesignon    3014 May 21  2022 standalone.conf.20250417.WO0000076117142
-rw-r--r--  1 root     root            3284 May  6  2025 standalone.conf_20250506
-rw-r--r--  1 root     root            3284 May  6  2025 .standalone.conf.20250506160536.p744064
-rw-r--r--  1 spssodr1 singlesignon    3086 Jan  9  2019 standalone.conf.bat
-rw-r--r--  1 spssodr1 singlesignon    2794 Jan  9  2019 standalone.conf.ps1
-rw-r--r--  1 spssodr1 singlesignon    1638 Jan  9  2019 standalone.ps1
-rwxr-xr-x  1 spssodr1 singlesignon   12622 Jun 13  2022 standalone.sh
-rwxr-xr-x  1 spssodr1 singlesignon   12583 Jun 13  2022 .standalone.sh.20220613100619.p971504
-rw-r--r--  1 spssodr1 singlesignon    2269 Jan  9  2019 vault.bat
-rw-r--r--  1 spssodr1 singlesignon     709 Jan  9  2019 vault.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2362 Jan  9  2019 vault.sh
-rw-r--r--  1 spssodr1 singlesignon 2548184 Dec  3  2019 wildfly-elytron-tool.jar
-rw-r--r--  1 spssodr1 singlesignon    2252 Jan  9  2019 wsconsume.bat
-rw-r--r--  1 spssodr1 singlesignon     783 Jan  9  2019 wsconsume.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2744 Jan  9  2019 wsconsume.sh
-rw-r--r--  1 spssodr1 singlesignon    2252 Jan  9  2019 wsprovide.bat
-rw-r--r--  1 spssodr1 singlesignon     783 Jan  9  2019 wsprovide.ps1
-rwxr-xr-x  1 spssodr1 singlesignon    2744 Jan  9  2019 wsprovide.sh
[root@crjtqapllx036 tmp]#
