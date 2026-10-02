entao o erro ta ai


<img width="1811" height="935" alt="image" src="https://github.com/user-attachments/assets/5b53b7c6-66dc-4a40-8231-9b092e8bb35e" />


ele ja tem esse arquivo na taks

<img width="1539" height="797" alt="image" src="https://github.com/user-attachments/assets/51458df8-89a3-404a-a12e-3f7392d10b78" />


ta apontado errado por isso o usraio dlee nao tem permisao, para corrigi de vez temos que mudar esse valor na variavel


[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# setfacl -m u:f517263:r /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
[root@caddeapllx1567 p585600]# getfacl /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
getfacl: Removing leading '/' from absolute path names
# file: opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
# owner: ctmagelx
# group: controlm
user::rw-
user:f517263:r--
group::---
mask::r--
other::---

[root@caddeapllx1567 p585600]# su - f517263 -c "head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo LEITURA OK"
LEITURA OK
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# keytool -list -keystore /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -i -E "caixa|ac"
Informe a senha da área de armazenamento de chaves:
