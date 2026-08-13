oc rsh sifpp-micro-des-35-8bfs8 find /deployments -iname "application.properties"



oc rsh sifpp-micro-des-35-8bfs8 sh -c "grep -a 'boleto.api.base-url' /deployments/app/sifpp-ms-0.0.0.1.jar"


oc rsh sifpp-micro-des-35-8bfs8 sh -c "java -version"


oc rsh sifpp-micro-des-35-8bfs8 sh -c "find / -name 'jar' -type f 2>/dev/null"
