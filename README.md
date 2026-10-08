
-sh-4.2$
-sh-4.2$ oc get netnamespace -o custom-columns=NAME:.metadata.name,EGRESS:.egressIPs | grep -E "10.116.221.46|10.116.221.118|10.116.209.64"
sihdg-tqs                                          [10.116.221.46]
siife-tqs                                          [10.116.209.64]
sisam-tqs                                          [10.116.221.118]
-sh-4.2$ oc get netnamespace -o custom-columns=NAME:.metadata.name,EGRESS:.egressIPs | grep -E "10.116.221.46|10.116.221.118|10.116.209.64"
sihdg-tqs                                          [10.116.221.46]
siife-tqs                                          [10.116.209.64]
sisam-tqs                                          [10.116.221.118]
-sh-4.2$
-sh-4.2$
