oc get routes -n siepr-tqs -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination,CERT:.spec.tls.certificate | cut -c1-160

H=<host do backend TQS que apareceu acima>
openssl s_client -connect $H:443 -servername $H -showcerts </dev/null 2>/dev/null | grep -E ' s:| i:'
 
