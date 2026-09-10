-sh-4.2$ ^C
-sh-4.2$ oc get pods | grep sihdg-jboss8-des
sihdg-jboss8-des-88-deploy      0/1       Completed   0             8d
sihdg-jboss8-des-88-nsrzb       1/1       Running     0             8d
sihdg-jboss8-des-91-deploy      1/1       Running     0             9m1s
sihdg-jboss8-des-91-r5vj8       0/1       Running     2 (50s ago)   8m57s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sihdg-jboss8-des-91-r5vj8
sh-5.1$
sh-5.1$
sh-5.1$ ls -la /sihdg_sinaf
total 0
drwxrwxrwx. 2   99   99  0 Sep  9 14:55 .
dr-xr-xr-x. 1 root root 75 Sep 10 00:47 ..
sh-5.1$
sh-5.1$
sh-5.1$ df -h /sihdg_sinaf
Filesystem                                             Size  Used Avail Use% Mounted on
nprdnfs01.ad.caixa:/ifs/cpwsprd01/nprd/fs_sihdg_sinaf   50G     0   50G   0% /sihdg_sinaf
sh-5.1$
