oc rsh sifpp-micro-des-35-8bfs8 sh -c "/usr/java/jdk-21.0.1/bin/jar tf /deployments/app/sifpp-ms-0.0.0.1.jar | grep -i application"


oc rsh sifpp-micro-des-35-8bfs8 sh -c "cd /tmp && /usr/java/jdk-21.0.1/bin/jar xf /deployments/app/sifpp-ms-0.0.0.1.jar application.properties && cat /tmp/application.properties"

