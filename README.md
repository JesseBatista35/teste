
[domain@crjtqapllx003:9990 /] exit
[root@crjtqapllx003 p585600]# ps -ef | grep "Server:crjtqapllx003_sifpp_intra_8080" | grep -v grep | grep -o "DENDPOINT_MICRO=[^ ]*"
DENDPOINT_MICRO=https://sifpp-micro-tqs.apps.nprd.caixa
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# sudo su
[root@crjtqapllx003 p585600]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=crjtqapllx003:9990
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] /host=crjtqapllx003/server=crjtqapllx003_sifpp_intra_8080/deployment=sifpp-ear.ear:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "OK"
}
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] tail -50 /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log
'50' is not a valid parameter name.
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]

