
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID|Location'
< HTTP/1.1 503 Service Unavailable
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID|Location'
< HTTP/1.1 404 Not Found
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer:|Contexts' -A1
<h1> LBGroup mycluster_sigec2: <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=ENABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=DISABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Disable Nodes</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=STOP-APP&Range=DOMAIN&Domain=mycluster_sigec2">Stop Nodes</a></h1>
<h1> Node sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104 (ajp://10.116.94.211:8829): </h1>
<a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Disable Contexts</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=STOP-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Stop Contexts</a><br/>
Balancer: mycluster_sigec2,LBGroup: mycluster_sigec2,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: -1,Ttl: 60000000,Status: OK,Elected: 0,Read: 0,Transferred: 0,Connected: 0,Load: 62
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/gec-api, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-api">Disable</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-api">Stop</a>
/gec-web/por, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-web/por">Disable</a> <a href="/mod_cluster-manager?nonce=be23b061-e764-4633-bd40-8f72958d8074&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-web/por">Stop</a>
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# tail -5 /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-error.log
[Thu Oct 29 17:52:47.947281 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Thu Oct 29 17:53:32.992555 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Mon Nov 02 10:02:56.857645 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Tue Nov 03 11:45:24.082806 2026] [:error] [pid 4149714:tid 4150125] proxy: CLUSTER: (balancer://mycluster_sigec2). All workers are in error state
[Tue Nov 03 11:47:50.595533 2026] [:error] [pid 4149714:tid 4150146] proxy: CLUSTER: (balancer://mycluster_sigec2). All workers are in error state
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# tail -5 /logs/apache2/gec-web/sigec.des.caixa-error.log
[Thu Oct 29 17:51:15.137817 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Thu Oct 29 17:52:00.176350 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Thu Oct 29 17:52:57.958390 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Thu Oct 29 17:53:43.003640 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[Mon Nov 02 10:03:06.863625 2026] [:error] [pid 577339:tid 577686] (70007)The timeout specified has expired: ajp_cping_cpong: apr_socket_recv failed
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# tail -10 /logs/apache2/sigec/mod_cluster-error.log
[Mon Nov 02 11:26:52.636444 2026] [proxy:error] [pid 577339:tid 577726] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:26:52.636460 2026] [proxy:error] [pid 577339:tid 577726] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:27:17.823932 2026] [proxy:error] [pid 577339:tid 577732] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:27:17.823975 2026] [proxy:error] [pid 577339:tid 577732] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:27:50.300355 2026] [proxy:error] [pid 577339:tid 577715] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:27:50.300390 2026] [proxy:error] [pid 577339:tid 577715] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:29:42.995411 2026] [proxy:error] [pid 577339:tid 577755] (111)Connection refused: AH00957: ajp: attempt to connect to 10.116.94.211:8859 (10.116.94.211:8859) failed
[Mon Nov 02 11:29:42.995461 2026] [proxy:error] [pid 577339:tid 577755] AH00959: ap_proxy_connect_backend disabling worker for (10.116.94.211:8859) for 60s
[Mon Nov 02 11:32:38.738716 2026] [:warn] [pid 577339:tid 577745] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104" JVMRoute
[Tue Nov 03 11:43:55.625825 2026] [:warn] [pid 4149734:tid 4149995] manager_handler STATUS error: MEM: Can't read node with "sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104" JVMRoute
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# grep -n ProxyPass /opt/httpd/conf.d/httpd-sigec.des.conf /opt/httpd/conf.d/httpd-sigecpor2.conf
/opt/httpd/conf.d/httpd-sigec.des.conf:12:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigec.des.conf:13:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
/opt/httpd/conf.d/httpd-sigecpor2.conf:15:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigecpor2.conf:16:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/
[root@caddeapllx2794 conf.d]#
