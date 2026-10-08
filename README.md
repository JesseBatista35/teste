oc get netnamespace -o custom-columns=NAME:.metadata.name,EGRESS:.egressIPs | grep -E "10.116.221.46|10.116.221.118|10.116.209.64"
