
[root@srjdeapllx158 configuration]# ps -ef | grep "Server:srjdeapllx158_sifpp_intra_8081" | grep -v grep
spjbodr2 117493  26254  8 10:36 ?        00:00:22 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sifpp_intra_8081] -Xms2048m -Xmx2048m -XX:+UseG1GC -DAUTHENTICATION_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/auth/token -DCLIENT_ID=sifpp-intra -DCLIENT_SECRET=3d56da36-ae05-41f8-831f-893fbb849bf2 -DENDPOINT_MICRO=https://sifpp-micro-des.apps.nprd.caixa -DRESOURCE_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/ -DSICPU_APLICATIVO=817 -DSICPU_APP=3058459957320e715a8f1ae6a5005e9db5c25fa9 -DSICPU_PASSWORD=bd2547c2db5e7faf9bee5babe76b8d0e9e2a0dca -DSICPU_USER=SIFPP -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Dsicpu.local=https://central.mobilidade.des.intra.corerj.caixa/sicpu/ -Dsigdb.recebe=/infra_app/config/sifpp/sigdb/ -Dsigdb.transmite=/usr/local/sigdb/TRANSMITE -Dsimma.local=https://des.analytics.mobilidade.caixa.gov.br/analytics/ -Dsisit.local=https://des.central.mobilidade.caixa.gov.br/sisit/ -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server=srjdeapllx158_sifpp_intra_8081/subsystem=logging/periodic-rotating-file-handler=FILE:read-resource
{
    "outcome" => "success",
    "result" => {
        "append" => true,
        "autoflush" => true,
        "enabled" => true,
        "encoding" => undefined,
        "file" => {"path" => expression "/infra_app/logs/sifpp/server-${jboss.server.name}.log"},
        "filter" => undefined,
        "filter-spec" => undefined,
        "formatter" => "%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n",
        "level" => "ALL",
        "name" => "FILE",
        "named-formatter" => "PATTERN",
        "suffix" => ".yyyy-MM-dd"
    }
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server=srjdeapllx158_sifpp_intra_8081/deployment=sifpp-ear.ear:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "OK"
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]

