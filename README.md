# 1. o configmap/secret do keystore foi criado?
oc get configmap vaultkeystore-sispl-canal-webhook-pix -n sispl-des
oc get secret vaultkeystore-sispl-canal-webhook-pix -n sispl-des

# 2. o volume/mount está no deployment?
oc get deployment sispl-canal-webhook-pix-des -n sispl-des -o yaml | grep -A5 vaultkeystore

# 3. o mount realmente está no pod atual?
oc exec sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -n sispl-des -- ls -la /opt/jboss/standalone/configuration/ | grep -i vault
