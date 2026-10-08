oc get hostsubnet ceadecldlx084.nprd.caixa -o yaml | grep -A15 -i egress
oc get hostsubnet -o custom-columns=NODE:.metadata.name,EGRESSIPS:.egressIPs,CIDRS:.egressCIDRs | grep -E "10.116.221.46|10.116.221.118|10.116.209.64"
