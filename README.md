oc get secret siinp-nucleo-des -n siinp-des -o jsonpath='{.data.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}' | base64 -d; echo

ls -la /usr/src/app/secrets_files/SIINP_DES/

