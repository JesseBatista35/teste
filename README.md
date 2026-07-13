ls -la /logs/jboss-eap/hc/servers/siouv_node1_lx0002/

tail -50 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log
]
grep -iE "exception|error|refused|timeout|unable to connect" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -30

ls -la /logs/jboss-eap/hc/servers/siouv_node1_lx0002/siouv.log
tail -100 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/siouv.log | grep -iE "oracle|jdbc|connect|orad01ng|timeout"
