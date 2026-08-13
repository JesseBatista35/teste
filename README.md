oc get secret sifpp-micro-des -n sifpp-des -o jsonpath='{.data.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}' | base64 -d
