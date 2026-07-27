
Senha SUDO:
das01 not running
Command list-domains executed successfully.
-bash-5.1$ sudo -u sjsas8 netstat -an | grep 14848
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-instances --host 10.116.89.101 --port 14848 --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf
Unable to connect to admin-server.  Please check if the server is up and running and that the host and port provided are correct.
CLI137 Command list-instances failed.
-bash-5.1$
-bash-5.1$
-bash-5.1$
^C
-bash-5.1$ clear
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin start-domain das01
Starting Domain das01, please wait.
Default Log location is /opt/SUNWas8/domains/das01/logs/server.log.
CLI152 user is a required option.
CLI156 Could not start the domain das01.
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-domains
das01 not running
Command list-domains executed successfully.
-bash-5.1$ sudo -u sjsas8 netstat -an | grep 14848
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin start-domain --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf das01
Starting Domain das01, please wait.
Default Log location is /opt/SUNWas8/domains/das01/logs/server.log.
Domain das01 started.
-bash-5.1$ sudo -u sjsas8 ls -la /opt/SUNWas8/domains/das01/config/
total 7397
drwx------  15 sjsas8   sunjava       70 Jul  7 12:58 .
drwxr-xr-x  12 sjsas8   sunjava       13 Apr 17 14:22 ..
-rw-------   1 sjsas8   sunjava    36180 Apr 10 15:17 .default-web.xml.20260410151808.p984222
-rw-------   1 sjsas8   sunjava   239369 Apr 10 10:13 .domain.xml.20260410102319.p984222
-rw-------   1 sjsas8   sunjava   239395 Apr 10 11:49 .domain.xml.20260410115229.p984222
-rw-------   1 sjsas8   sunjava   254562 Apr 17 14:45 .domain.xml.20260417144612.p725476
-rw-r--r--   1 sjsas8   sunjava    10838 Sep  2  2025 .server.policy.20250902133035.c067581
-rw-r--r--   1 sjsas8   sunjava    11507 Sep  2  2025 .server.policy.20250902133342.c067581
-rw-------   1 sjsas8   sunjava     1260 Apr 17 14:50 .sun-acc-dsv11.xml.20260417145132.p725476
-rw-r--r--   1 sjsas8   sunjava       13 Jul 27 15:49 .synchronize
-rw-r--r--   1 sjsas8   sunjava      479 Jul 27 15:49 admch
-rw-------   1 sjsas8   sunjava      118 Dec  7  2015 admin-keyfile
-rw-r--r--   1 sjsas8   sunjava       16 Jul 27 15:49 admsn
drwxr-xr-x   2 sjsas8   sunjava       35 Jul  7 13:31 backup
-rw-------   1 sjsas8   sunjava    65536 Dec 10  2025 cert8.db
-rw-------   1 sjsas8   sunjava   131072 Dec  7  2015 cert8.db.20210208
-rw-------   1 sjsas8   sunjava   131072 Sep  5  2024 cert8.db.20251210
drwx------   4 sjsas8   sunjava        4 Dec  7  2015 default-config
-rw-------   1 sjsas8   sunjava    36181 Apr 10 15:18 default-web.xml
-rw-------   1 sjsas8   sunjava    36180 Jun 22  2023 default-web.xml.20260410.WO0000080017346
-rw-------   1 sjsas8   sunjava    36178 Dec  7  2015 default-web.xml.WO0000064721698
-rw-r--r--   1 sjsas8   sunjava        0 Jun 23 15:59 derby.log
-rw-------   1 sjsas8   sunjava     9405 Sep 15  2025 domain-passwords
-rw-------   1 sjsas8   sunjava   251091 Jul 24 15:59 domain.xml
-rw-------   1 sjsas8   sunjava   239095 Aug 21  2025 domain.xml.20250821
-rw-------   1 sjsas8   sunjava   239032 Mar 17 12:57 domain.xml.20260318.WO0000079746330
-rw-------   1 sjsas8   sunjava   239369 Apr  9 12:36 domain.xml.20260410.WO0000080017346
-rw-------   1 sjsas8   sunjava   239369 Apr 17 10:27 domain.xml.20260417.antes.clone.dsv01.backup
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv01-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv02-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv03-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv04-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv05-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv06-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv07-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv08-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv09-config
drwxr-xr-x   2 sjsas8   sunjava        2 Dec  7  2015 dsv10-config
drwxr-xr-x   2 sjsas8   sunjava        2 Apr 17 18:12 dsv11-config
-rw-r--r--   1 sjsas8   sunjava    33251 Apr 20 20:44 hs_err_pid1703.log
-rw-r--r--   1 sjsas8   sunjava    25991 Mar  3 08:06 hs_err_pid28142.log
-rw-r--r--   1 sjsas8   sunjava    25461 Apr 17 14:19 hs_err_pid6525.log
-rw-------   1 sjsas8   sunjava   131072 Dec 10  2025 key3.db
-rw-------   1 sjsas8   sunjava   131072 Dec  7  2015 key3.db.20210208
-rw-------   1 sjsas8   sunjava   131072 Sep  5  2024 key3.db.20251210
-rw-------   1 sjsas8   sunjava      189 Dec  7  2015 keyfile
-rw-------   1 sjsas8   sunjava      392 Dec  7  2015 login.conf
-rw-r--r--   1 sjsas8   sunjava    95440 Jul 27 15:49 mqjms.log.0
-rw-r--r--   1 sjsas8   sunjava        0 Jul 27 15:49 mqjms.log.0.lck
-rw-------   1 sjsas8   sunjava   131072 Dec 10  2025 secmod.db
-rw-------   1 sjsas8   sunjava   131072 Dec  7  2015 secmod.db.20210208
-rw-------   1 sjsas8   sunjava   131072 Feb  8  2021 secmod.db.20251210
-rw-r--r--   1 sjsas8   sunjava       20 Jul 27 15:49 secure.seed
-rw-r--r--   1 sjsas8   sunjava    10838 Sep  2  2025 server.policy
-rw-r--r--   1 sjsas8   sunjava    10838 Jan 13  2022 server.policy.20250902
-rw-r--r--   1 sjsas8   sunjava    11507 Sep  2  2025 server.policy.20250902.funcionou
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv01.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv02.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv03.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv04.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv05.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv06.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv07.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv08.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv09.xml
-rw-------   1 sjsas8   sunjava     1260 Dec  7  2015 sun-acc-dsv10.xml
-rw-------   1 sjsas8   sunjava     1260 Apr 17 15:44 sun-acc-dsv11.xml
-rw-------   1 sjsas8   sunjava     1207 Dec  7  2015 sun-acc.xml
-rw-r--r--   1 sjsas8   sunjava      617 Nov  3  2021 temp.txt
-rw-------   1 sjsas8   sunjava      960 Dec  7  2015 wss-server-config.xml
-bash-5.1$
