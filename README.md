oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml \
  | sed '/Listen 0.0.0.0:8443 https/d' | oc replace -f -

oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml | grep -c Listen

oc delete pod sipar-inter-frontend-des-32-l46w8


oc get pods | grep frontend
