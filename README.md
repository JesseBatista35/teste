
sh-4.4$
sh-4.4$ cd /tmp
sh-4.4$ keytool -importcert -noprompt -alias amazonrootca1 -file cert-02 \
>   -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks -storepass changeit
Certificate was added to keystore
sh-4.4$ keytool -list -storepass changeit -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks | grep contains   # esperado: 40
Your keystore contains 40 entries
sh-4.4$ exit
exit
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cp sisou-des/<pod>:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh: pod: Arquivo ou diretório não encontrado
-sh-4.2$




Last login: Thu Nov 26 10:25:17 2026 from 10.211.12.56
[p585600@cadsvitrlx100 ~]$ oc cp sisou-des/<pod>:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks
-bash: pod: No such file or directory
[p585600@cadsvitrlx100 ~]$


tentei dirento no bastina nao pega
