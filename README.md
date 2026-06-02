oc debug dc/sifug-siofg-api-des -n sifug-des --keep-init-containers=false -c sifug-siofg-api-des -- /bin/sh -c 'echo "=== file-system source ==="; ls -1 /deployments/lib/main/ | grep -i "config-source-file-system"; echo "=== smallrye-config core ==="; ls -1 /deployments/lib/main/ | grep -i "smallrye-config" | grep -iv "source-file"'



}

oc get pods -n sifug-des | grep siofg-api-des
