
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project sinep-tqs
NAME        DISPLAY NAME   STATUS
sinep-tqs                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sinep-tqs
NAME                                     READY     STATUS      RESTARTS        AGE
sinep-api-tqs-85-deploy                  0/1       Completed   0               4d23h
sinep-api-tqs-85-sjpjp                   1/1       Running     0               4d23h
sinep-api-tqs-86-deploy                  0/1       Error       0               4h3m
sinep-api-tqs-87-deploy                  0/1       Error       0               151m
sinep-arquivos-tqs-22-qqgk7              1/1       Running     0               11d
sinep-arquivos-tqs-24-deploy             0/1       Error       0               176m
sinep-bff-tqs-52-deploy                  0/1       Completed   0               6d20h
sinep-bff-tqs-53-8grtw                   1/1       Running     0               4h8m
sinep-bff-tqs-53-deploy                  0/1       Completed   0               4h8m
sinep-chamados-tqs-4-deploy              0/1       Completed   0               11d
sinep-chamados-tqs-5-6hxg2               1/1       Running     0               7d3h
sinep-chamados-tqs-5-deploy              0/1       Completed   0               7d3h
sinep-internet-frontend-tqs-121-deploy   0/1       Completed   0               10d
sinep-internet-frontend-tqs-122-deploy   0/1       Completed   0               7d3h
sinep-internet-frontend-tqs-122-p6dxx    2/2       Running     1 (7d3h ago)    7d3h
sinep-intranet-frontend-tqs-103-deploy   0/1       Completed   0               5d2h
sinep-intranet-frontend-tqs-104-deploy   0/1       Completed   0               4d23h
sinep-intranet-frontend-tqs-104-mzm4z    2/2       Running     2 (4d23h ago)   4d23h
sinep-notas-fiscais-tqs-28-deploy        0/1       Completed   0               20h
sinep-notas-fiscais-tqs-28-nwqpq         1/1       Running     0               20h
sinep-notas-fiscais-tqs-29-deploy        0/1       Error       0               3h5m
sinep-pdq-tqs-24-deploy                  0/1       Completed   0               55d
sinep-pdq-tqs-25-deploy                  0/1       Completed   0               11d
sinep-pdq-tqs-25-g5w5q                   1/1       Running     0               11d
sinep-relatorios-tqs-17-deploy           0/1       Completed   0               6d20h
sinep-relatorios-tqs-18-2ntx4            1/1       Running     0               4d21h
sinep-relatorios-tqs-18-deploy           0/1       Completed   0               4d21h
sinep-relatorios-tqs-19-deploy           0/1       Error       0               4h2m
sinep-relatorios-tqs-21-deploy           0/1       Error       0               3h15m
sinep-remessa-tqs-23-deploy              0/1       Completed   0               130d
sinep-remessa-tqs-23-gc4rd               1/1       Running     0               130d
sinep-rotinas-tqs-19-deploy              0/1       Completed   0               26d
sinep-rotinas-tqs-20-deploy              0/1       Completed   0               11d
sinep-rotinas-tqs-20-zmdcm               1/1       Running     0               11d
sinep-trilha-auditoria-tqs-9-njbb7       1/1       Running     0               36d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sinep-arquivos-tqs-22-qqgk7 \ bash -c 'timeout 3 bash -c "</dev/tcp/10.192.224.100/1415" && echo ABERTA || echo FECHADA'
Error from server (NotFound): pods " bash" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
