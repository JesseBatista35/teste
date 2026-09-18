
-sh-4.1$ grep -i modcluster /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log | tail -n 40
10:47:15,990 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 58) MODCLUSTER000001: Initializing mod_cluster version 1.2.12.Final-redhat-1
10:47:16,035 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 58) MODCLUSTER000032: Listening to proxy advertisements on /228.0.1.120:23364
-sh-4.1$ curl -s http://10.116.84.136:6666/mod_cluster-manager | grep -i sicem
</pre><h1> LBGroup sicem-des: <a href="/mod_cluster-manager?nonce=7735a38c-3407-46de-8d92-294d2a2abedc&Cmd=ENABLE-APP&Range=DOMAIN&Domain=sicem-des">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=7735a38c-3407-46de-8d92-294d2a2abedc&Cmd=DISABLE-APP&Range=DOMAIN&Domain=sicem-des">Disable Nodes</a></h1>
<h1> Node sicem_node1_lx0005 (ajp://10.116.88.24:12809): </h1>
<a href="/mod_cluster-manager?nonce=7735a38c-3407-46de-8d92-294d2a2abedc&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sicem_node1_lx0005">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=7735a38c-3407-46de-8d92-294d2a2abedc&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sicem_node1_lx0005">Disable Contexts</a><br/>
Balancer: sicem-des,LBGroup: sicem-des,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: 161,Ttl: 60000000,Status: OK,Elected: 4,Read: 27245,Transferred: 0,Connected: 0,Load: 100
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/sicem, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=7735a38c-3407-46de-8d92-294d2a2abedc&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sicem_node1_lx0005&Alias=default-host&Context=/sicem">Disable</a>
-sh-4.1$ curl -s http://10.116.84.137:6666/mod_cluster-manager | grep -i sicem
</pre><h1> LBGroup sicem-des: <a href="/mod_cluster-manager?nonce=0e302cca-c0cc-4a14-9188-55e0c14e4d6d&Cmd=ENABLE-APP&Range=DOMAIN&Domain=sicem-des">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=0e302cca-c0cc-4a14-9188-55e0c14e4d6d&Cmd=DISABLE-APP&Range=DOMAIN&Domain=sicem-des">Disable Nodes</a></h1>
<h1> Node sicem_node1_lx0005 (ajp://10.116.88.24:12809): </h1>
<a href="/mod_cluster-manager?nonce=0e302cca-c0cc-4a14-9188-55e0c14e4d6d&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sicem_node1_lx0005">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=0e302cca-c0cc-4a14-9188-55e0c14e4d6d&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sicem_node1_lx0005">Disable Contexts</a><br/>
Balancer: sicem-des,LBGroup: sicem-des,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: 161,Ttl: 60000000,Status: OK,Elected: 5,Read: 13407,Transferred: 0,Connected: 0,Load: 100
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/sicem, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=0e302cca-c0cc-4a14-9188-55e0c14e4d6d&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sicem_node1_lx0005&Alias=example.com&Context=/sicem">Disable</a>
-sh-4.1$



<img width="1833" height="953" alt="image" src="https://github.com/user-attachments/assets/8ff7e885-e560-47e1-8f6b-959baa45bf78" />


<img width="1807" height="990" alt="image" src="https://github.com/user-attachments/assets/3571b6d1-fd4b-4233-9814-0e90889b00e0" />


a pagina da forbinde ai voce da dois f5 ele carega mais adina com forbiden
