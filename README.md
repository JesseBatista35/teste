oc rsh sifpp-micro-des-35-8bfs8 sh -c "python3 -c \"import zipfile; print(zipfile.ZipFile('/deployments/app/sifpp-ms-0.0.0.1.jar').read('application.properties').decode())\""


oc rsh sifpp-micro-des-35-8bfs8 sh -c "jar tf /deployments/app/sifpp-ms-0.0.0.1.jar | grep application.properties"
