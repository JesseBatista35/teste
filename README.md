recebi esssa demadna:


Solicito apoio e resolução no ambiente de DES, a release apresenta erro na task "Exportar Variáveis Infra fácil"

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=497730&environmentId=2313642

À CAIXA

Prezados, foi realizado um novo deploy em des com sucesso e nenhum step falhou, segue evidencia em anexo: 



Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


Após novo deploy a url está inacessível sem a porta "8443" - "https://siarg-interno.esteiras.des.caixa/siarg/login " e a task de configuração do apache apresenta erro "RUNNING HANDLER [apache : Reload Apache]" . Esse erro já havia sido resolvido em ocasião anterior, mas agora voltou a se repetir tanto em DES, quanto em TQS. 


so que nao foi feito nada em tqs entao isso sugere que não é erro no deploy ou é?

600@caddeapllx2577 ~]$ systemctl status jboss
Unit jboss.service could not be found.
[p585600@caddeapllx2577 ~]$ cd /opt/jboss-eap/standalone/log/
[p585600@caddeapllx2577 log]$ ls -la
total 8
drwxrwxr-x 2 jboss jboss  122 jul  8 14:10 .
drwxrwxr-x 8 jboss jboss   91 set 30  2024 ..
-rwxrwxr-x 1 jboss jboss    0 set 30  2024 audit.log
-rwxrwxr-x 1 jboss jboss    0 set 30  2024 backupgc.log.current
-rwxrwxr-x 1 jboss jboss    0 set 30  2024 gc.log.0.current
-rw-r--r-- 1 root  root  7498 jul  8 14:10 server.log
-rwxrwxr-x 1 jboss jboss    0 set 30  2024 server.log.2024-09-30
[p585600@caddeapllx2577 log]$ server.log
-sh: server.log: comando não encontrado
[p585600@caddeapllx2577 log]$ cd server.log
-sh: cd: server.log: Não é um diretório
[p585600@caddeapllx2577 log]$ less server.log
[p585600@caddeapllx2577 log]$
