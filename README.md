
exit
-sh-4.2$ oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
[10.116.221.46]
-sh-4.2$ oc rsh -n sihdg-tqs sihdg-jboss8-tqs-27-vmg99
sh-5.1$
sh-5.1$
sh-5.1$ df -hT | grep -Ei 'nfs|fs_sihdg'
hypernprd12.ad.caixa:/fs_sihdg_powercenter nfs4      50G     0   50G   0% /sihdg_powercenter
hypernprd12.ad.caixa:/fs_sihdg_tqs         nfs4      20G     0   20G   0% /sihdg_tqs
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ mount | grep -i nfs
sh: mount: command not found
sh-5.1$
