oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK_TOKEN

oc exec <pod> -c simpi-dict-api-des -n simpi-des -- sh -c 'env | grep -i PIX_FRAMEWORK_TOKEN'



