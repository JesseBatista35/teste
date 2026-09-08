oc exec -it siecm-middleware-des-223-qtktl -- bash -c "echo | openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa -showcerts 2>/dev/null | openssl x509 -outform PEM > /tmp/sigaq-leaf.pem"


oc exec -it siecm-middleware-des-223-qtktl -- openssl x509 -in /tmp/sigaq-leaf.pem -noout -text | grep -A3 "Authority Information Access"

oc exec -it siecm-middleware-des-223-qtktl -- curl -sk http://icptestes.caixa/certs/acicptestessub.cer -o /tmp/acicptestessub.der


oc exec -it siecm-middleware-des-223-qtktl -- openssl x509 -inform DER -in /tmp/acicptestessub.der -outform PEM -out /tmp/acicptestessub.pem


oc exec -it siecm-middleware-des-223-qtktl -- bash -c "cat /tmp/acicptestessub.pem >> /tmp/chain-test.pem"
oc exec -it siecm-middleware-des-223-qtktl -- openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa -CAfile /tmp/acicptestessub.pem
