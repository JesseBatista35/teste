oc patch svc sipar-inter-frontend-des --type=json \
  -p '[{"op":"add","path":"/spec/ports/-","value":{"name":"https","port":8443,"protocol":"TCP","targetPort":8443}}]'

oc patch route sipar-inter-frontend-des -p '{"spec":{"port":{"targetPort":"https"}}}'

oc get route sipar-inter-frontend-des


https://sipar-inter-frontend-des.apps.nprd.caixa/siparInternet/
