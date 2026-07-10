oc get secret vault-sisam-internet-keystore -n sisam-tqs -o jsonpath='{.data}' | python3 -m json.tool


/opt/jboss/bin/standalone.conf: line 43: =org.jboss.byteman: command not found

