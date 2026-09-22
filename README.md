
[root@srjtqapllx0021 p585600]# cp /infra_app/config/sifug/sifug_sifgd.properties /infra_app/config/sifug/sifug_sifgd.properties.bak_$(date +%Y%m%d%H%M)
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# vi /infra_app/config/sifug/sifug_sifgd.properties
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# grep -c "keystore.if104.password" /infra_app/config/sifug/sifug_sifgd.properties
1
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart"
{
    "outcome" => "success",
    "result" => "STARTING"
}
[root@srjtqapllx0021 p585600]# grep -i "keystore password was incorrect\|erro ao carregar reposit" /infra_app/logs/sifug/server-srjtqapllx0021_sifug_inter_8080.log | tail -5
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
