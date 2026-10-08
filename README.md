
-sh-4.2$
-sh-4.2$ oc get hostsubnet ceadecldlx084.nprd.caixa -o yaml | grep -A15 -i egress
egressCIDRs:
- 10.116.192.0/19
egressIPs:
- 10.116.209.59
- 10.116.222.206
- 10.116.222.190
- 10.116.222.6
- 10.116.222.5
- 10.116.222.164
- 10.116.220.210
- 10.116.221.46
- 10.116.220.180
- 10.116.221.183
host: ceadecldlx084.nprd.caixa
hostIP: 10.116.208.104
kind: HostSubnet
metadata:
  annotations:
--
      f:egressCIDRs: {}
    manager: kubectl-patch
    operation: Update
    time: 2025-09-22T20:07:07Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressIPs: {}
    manager: openshift-sdn-controller
    operation: Update
    time: 2026-08-30T05:39:44Z
  name: ceadecldlx084.nprd.caixa
  resourceVersion: "2171219778"
  uid: f24c988c-7f3c-467b-a7ea-ed42a5985c18
subnet: 25.3.40.0/23
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet -o custom-columns=NODE:.metadata.name,EGRESSIPS:.egressIPs,CIDRS:.egressCIDRs | grep -E "10.116.221.46|10.116.221.118|10.116.209.64"
ceadecldlx039.nprd.caixa   [10.116.209.111 10.116.221.180 10.116.220.219 10.116.222.163 10.116.222.14 10.116.221.129 10.116.222.25 10.116.209.64 10.116.222.167 10.116.221.107]                   [10.116.192.0/19]
ceadecldlx077.nprd.caixa   [10.116.221.118 10.116.220.234 10.116.209.23 10.116.220.41 10.116.222.119 10.116.220.186 10.116.221.247 10.116.221.140 10.116.221.103 10.116.221.243 10.116.209.125]   [10.116.192.0/19]
ceadecldlx084.nprd.caixa   [10.116.209.59 10.116.222.206 10.116.222.190 10.116.222.6 10.116.222.5 10.116.222.164 10.116.220.210 10.116.221.46 10.116.220.180 10.116.221.183]                      [10.116.192.0/19]
-sh-4.2$
-sh-4.2$
-sh-4.2$
