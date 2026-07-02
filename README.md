Solicito apoio e resolução no ambiente de DES. 

A URL está retornando erro 500 
""https://siarg-interno.esteiras.des.caixa/siarg/login"" 

Mesmo após sucess na release: 
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=495609&environmentId=2304176


ja estou dentro do servidor

[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.201.44
p585600@10.116.201.44's password:
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ systemctl status jbos
Unit jbos.service could not be found.
[p585600@caddeapllx2577 ~]$ systemctl status jboss
Unit jboss.service could not be found.
[p585600@caddeapllx2577 ~]$ /opt/jboss-eap/standalone/deployments/
-sh: /opt/jboss-eap/standalone/deployments/: É um diretório
[p585600@caddeapllx2577 ~]$ ls -la /opt/jboss-eap/standalone/deployments/
total 48924
drwxrwxr-x 2 jboss jboss      173 jun 30 17:03 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rw-r--r-- 1 jboss jboss  1209660 jun 30 17:02 mssql-jdbc.jar
-rw-r--r-- 1 jboss jboss       14 jun 30 17:02 mssql-jdbc.jar.deployed
-rw-r--r-- 1 jboss jboss  1006732 jun 30 17:02 postgresql.jar
-rw-r--r-- 1 jboss jboss       14 jun 30 17:02 postgresql.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 47852811 jun 30 17:03 siarg.war
-rw-r--r-- 1 jboss jboss        9 jun 30 17:03 siarg.war.deployed
[p585600@caddeapllx2577 ~]$
