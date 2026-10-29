
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'id; ls -ln /sibec/Folha | head -5; du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
uid=185(185) gid=0(root) groups=0(root)
total 1752312
-rw-rw-rw-. 1 193291257      120     2187 Oct 20 17:39                                     BECT.E2.BOD1.H21.C2506.P1466.AAM.T.W
-rw-r-xr-x. 1 193291301      120    28266 Sep 14 11:30 BECD.E2.BOD1.D02.C2506.P1466.ABR.T.ZIP
-rw-r-xr-x. 1 193291301      120     1098 Sep 17 15:59 BECD.E2.BOD1.D05.C2505.P1466.ABR.T.ZIP
-rw-r--r--. 1  10702107 30000018      298 Apr  3  2025 BECD.E2.BOD1.F03.C1811.P0694.A3303807.C.ZIP
4.5G    /sibec
3.5G    /sibec3
37120
19954
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'find /sibec -type f ! -readable | wc -l; find /sibec -type f ! -readable | head -20'
59
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A5214838.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A1302801.C.ZIP
/sibec/Folha/PKTMPARC.ZCQY8324
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A4105409.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A2601409.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.APR.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.APE.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.ARJ.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A2804508.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F03.C2505.P1466.ABR.CY.TXT
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A2308906.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A3203205.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A5207253.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.AMG.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A3304557.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A2111300.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F03.C2505.P1466.ABR.CY.zip
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.A1705508.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.APB.C.ZIP
/sibec/Folha/BECD.E2.BOD1.F31.C2505.P1466.ABA.C.ZIP
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cd /sibec && tar cf - . 2>/tmp/erros.txt | (cd /sibec3 && tar xf - --no-same-owner); echo FIM rc=$?; wc -l < /tmp/erros.txt'
^Ccommand terminated with exit code 130
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cd /sibec && tar cf - . 2>/tmp/erros.txt | (cd /sibec3 && tar xf - --no-same-owner); echo FIM rc=$?; wc -l < /tmp/erros.txt'
^Ccommand terminated with exit code 130
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
4.5G    /sibec
3.5G    /sibec3
37123
19957
-sh-4.2$
