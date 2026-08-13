
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
