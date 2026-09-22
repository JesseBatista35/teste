
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# grep -A1 "keystore.if104.path\|keystore.if104.password\|truststore.caixa" /infra_app/config/sifug/sifug_sifgd.properties
api.dataprev.consignado.keystore.if104.path=/infra_app/config/sifug/IF104.p12
api.dataprev.consignado.keystore.if104.password=123456
truststore.caixa.path=/infra_app/config/sifug/cacerts
truststore.caixa.password=changeit

[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# grep -i "erro ao carregar reposit\|certificado\|keystore password\|password was incorrect" /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | tail -30
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#



outro alnalista ta me perguntaos se an oseria bom colcoar  o certificado na pasta dataprev
