$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
$CLI --command='/profile=full-ha-sigec-portabilidade2/subsystem=modcluster:read-resource(recursive=true)' | grep -E 'balancer|load-balancing-group|proxies' -A4
$CLI --command='/socket-binding-group=full-ha-sockets:read-resource(recursive=true)' | grep -A6 -E 'sbrdeaprlx05|caddeapllx2794'




curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer|Contexts' -A1
tail -50 /logs/apache2/sigec/mod_cluster-error.log


ssh sbrdeaprlx052
httpd -S 2>/dev/null | grep -i sigec





[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
{
    "outcome" => "success",
    "result" => "STARTING"
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/profile=full-ha-sigec-portabilidade2/subsystem=modcluster:read-resource(recursive=true)' | grep -E 'balancer|load-balancing-group|proxies' -A4
        "balancer" => "mycluster_sigec2",
        "connector" => "ajp",
        "excluded-contexts" => "ROOT,invoker,jbossws,juddi,console",
        "flush-packets" => false,
        "flush-wait" => -1,
        "load-balancing-group" => "mycluster_sigec2",
        "max-attempts" => 1,
        "node-timeout" => -1,
        "ping" => 10,
        "proxies" => [
            "sbrdeaprlx052_proxy",
            "sbrdeaprlx053_proxy",
            "caddeapllx2794_proxy"
        ],
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/socket-binding-group=full-ha-sockets:read-resource(recursive=true)' | grep -A6 -E 'sbrdeaprlx05|caddeapllx2794'
            "sbrdeaprlx052_proxy" => {
                "fixed-source-port" => false,
                "host" => "10.116.98.52",
                "port" => 6666,
                "source-interface" => undefined,
                "source-port" => 0
            },
            "sbrdeaprlx053_proxy" => {
                "fixed-source-port" => false,
                "host" => "10.116.98.53",
                "port" => 6666,
                "source-interface" => undefined,
                "source-port" => 0
            },
            "caddeapllx2794_proxy" => {
                "fixed-source-port" => false,
                "host" => "10.116.78.14",
                "port" => 6666,
                "source-interface" => undefined,
                "source-port" => 0
            }
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#




[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer|Contexts' -A1
<h1> LBGroup mycluster_sigec2: <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=ENABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Disable Nodes</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=DOMAIN&Domain=mycluster_sigec2">Stop Nodes</a></h1>
<h1> Node sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104 (ajp://10.116.94.211:8829): </h1>
<a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Disable Contexts</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Stop Contexts</a><br/>
Balancer: mycluster_sigec2,LBGroup: mycluster_sigec2,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: -1,Ttl: 60000000,Status: OK,Elected: 2,Read: 0,Transferred: 0,Connected: 0,Load: 65
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/gec-web/por, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-web/por">Disable</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-web/por">Stop</a>
/gec-api, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-api">Disable</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-api">Stop</a>
[p585600@caddeapllx2794 ~]$ tail -50 /logs/apache2/sigec/mod_cluster-error.log
[Mon Nov 02 10:40:01.859849 2026] [proxy:error] [pid 577339:tid 577748] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:40:50.837008 2026] [:warn] [pid 577339:tid 577735] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[Mon Nov 02 10:42:05.820868 2026] [:warn] [pid 577339:tid 577763] ENABLE: context /gec-api is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 10:42:05.821311 2026] [:warn] [pid 577339:tid 577762] ENABLE: context /gec-web/por is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 10:42:05.822724 2026] [proxy:error] [pid 577339:tid 577750] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:42:05.822743 2026] [proxy:error] [pid 577339:tid 577750] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:42:30.177013 2026] [proxy:error] [pid 577339:tid 577752] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:42:30.177052 2026] [proxy:error] [pid 577339:tid 577752] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:43:44.883615 2026] [proxy:error] [pid 577339:tid 577712] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:43:44.883660 2026] [proxy:error] [pid 577339:tid 577712] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:44:17.025201 2026] [proxy:error] [pid 577339:tid 577728] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:44:17.025240 2026] [proxy:error] [pid 577339:tid 577728] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:44:58.005719 2026] [proxy:error] [pid 577339:tid 577741] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:44:58.005759 2026] [proxy:error] [pid 577339:tid 577741] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:45:53.867505 2026] [proxy:error] [pid 577339:tid 577744] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:45:53.867574 2026] [proxy:error] [pid 577339:tid 577744] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:47:55.197896 2026] [:warn] [pid 577339:tid 577719] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[Mon Nov 02 10:52:50.352029 2026] [:warn] [pid 577339:tid 577757] ENABLE: context /gec-api is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 10:52:50.352504 2026] [:warn] [pid 577339:tid 577758] ENABLE: context /gec-web/por is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 10:52:50.353704 2026] [proxy:error] [pid 577339:tid 577770] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:52:50.353723 2026] [proxy:error] [pid 577339:tid 577770] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:55:34.580261 2026] [proxy:error] [pid 577339:tid 577755] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:55:34.580305 2026] [proxy:error] [pid 577339:tid 577755] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:55:50.730094 2026] [proxy:error] [pid 577339:tid 577711] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:55:50.730132 2026] [proxy:error] [pid 577339:tid 577711] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 10:56:14.943194 2026] [proxy:error] [pid 577339:tid 577721] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 10:56:14.943231 2026] [proxy:error] [pid 577339:tid 577721] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:01:01.816325 2026] [:warn] [pid 577339:tid 577757] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[Mon Nov 02 11:01:18.308167 2026] [:warn] [pid 577339:tid 577722] ENABLE: context /gec-api is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 11:01:18.308619 2026] [:warn] [pid 577339:tid 577739] ENABLE: context /gec-web/por is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 11:01:26.538138 2026] [proxy:error] [pid 577339:tid 577729] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:01:26.538175 2026] [proxy:error] [pid 577339:tid 577729] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:01:43.103622 2026] [proxy:error] [pid 577339:tid 577744] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:01:43.103658 2026] [proxy:error] [pid 577339:tid 577744] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:02:32.271433 2026] [proxy:error] [pid 577339:tid 577738] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:02:32.271469 2026] [proxy:error] [pid 577339:tid 577738] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:05:15.366312 2026] [proxy:error] [pid 577339:tid 577750] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:05:15.366351 2026] [proxy:error] [pid 577339:tid 577750] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:07:50.497461 2026] [:warn] [pid 577339:tid 577713] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[Mon Nov 02 11:26:52.628809 2026] [:warn] [pid 577339:tid 577723] ENABLE: context /gec-api is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 11:26:52.630009 2026] [:warn] [pid 577339:tid 577713] ENABLE: context /gec-web/por is in balancer mycluster_sigec and mycluster_sigec2
[Mon Nov 02 11:26:52.636444 2026] [proxy:error] [pid 577339:tid 577726] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:26:52.636460 2026] [proxy:error] [pid 577339:tid 577726] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:27:17.823932 2026] [proxy:error] [pid 577339:tid 577732] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:27:17.823975 2026] [proxy:error] [pid 577339:tid 577732] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:27:50.300355 2026] [proxy:error] [pid 577339:tid 577715] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:27:50.300390 2026] [proxy:error] [pid 577339:tid 577715] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:29:42.995411 2026] [proxy:error] [pid 577339:tid 577755] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:29:42.995461 2026] [proxy:error] [pid 577339:tid 577755] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:32:38.738716 2026] [:warn] [pid 577339:tid 577745] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[p585600@caddeapllx2794 ~]$


caddeaprlx064.extra.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$ ssh sbrdeaprlx052
The authenticity of host 'sbrdeaprlx052 (10.116.98.52)' can't be established.
ECDSA key fingerprint is SHA256:YDb/hgF/FAeuRp1uwYjmoDHgYrwpukpUPXSHm1OjuEY.
ECDSA key fingerprint is MD5:f7:b7:f2:c4:86:1e:79:a8:fe:5e:66:e2:27:1b:b4:e8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'sbrdeaprlx052,10.116.98.52' (ECDSA) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@sbrdeaprlx052's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ httpd -S 2>/dev/null | grep -i sigec
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

