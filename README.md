
oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK

oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i "BT_CLIENT\|CLIENT_ID\|SECRET_ID"
