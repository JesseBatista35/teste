oc get netnamespace -o custom-columns=NAME:.metadata.name,EGRESS:.egressIPs | grep -E "10.116.209.59|10.116.222.206|10.116.222.190|10.116.222.6|10.116.222.5|10.116.222.164|10.116.220.210|10.116.220.180|10.116.221.183"

oc debug node/ceadecldlx084.nprd.caixa -- chroot /host ip -4 addr | grep -B2 10.116.221.46

