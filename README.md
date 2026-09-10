
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des
NAME               REVISION   DESIRED   CURRENT   TRIGGERED BY
sihdg-jboss8-des   89         1         0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc | grep sihdg-jboss8-des
sihdg-jboss8-des-87      0         0         0         19d
sihdg-jboss8-des-88      1         1         1         8d
sihdg-jboss8-des-89      0         0         0         10h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep sihdg-jboss8-des
sihdg-jboss8-des-88-deploy      0/1       Completed   0          8d
sihdg-jboss8-des-88-nsrzb       1/1       Running     0          8d
sihdg-jboss8-des-89-deploy      0/1       Error       0          10h
-sh-4.2$
