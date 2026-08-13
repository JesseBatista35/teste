sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "python3 -c \"import zipfile; print(zipfile.ZipFile('/deployments/app/sifpp-ms-0.0.0.1.jar').read('application.properties').decode())\""
sh: python3: command not found
command terminated with exit code 127
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "jar tf /deployments/app/sifpp-ms-0.0.0.1.jar | grep application.properties"
sh: jar: command not found
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 find /deployments -iname "application.properties"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "grep -a 'boleto.api.base-url' /deployments/app/sifpp-ms-0.0.0.1.jar"
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "java -version"
openjdk version "21.0.1" 2023-10-17
OpenJDK Runtime Environment (build 21.0.1+12-29)
OpenJDK 64-Bit Server VM (build 21.0.1+12-29, mixed mode, sharing)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "find / -name 'jar' -type f 2>/dev/null"
/usr/java/jdk-21.0.1/bin/jar
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
