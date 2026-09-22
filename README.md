
-sh-4.2$
-sh-4.2$ oc -n selenium-grid get svc
NAME                     TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)                      AGE
selenium-distributor     ClusterIP   25.128.251.225   <none>        5553/TCP                     2y193d
selenium-event-bus       ClusterIP   25.128.188.239   <none>        4442/TCP,4443/TCP,5557/TCP   2y193d
selenium-router          ClusterIP   25.128.44.255    <none>        8080/TCP                     2y193d
selenium-session-queue   ClusterIP   25.128.224.170   <none>        5559/TCP                     2y193d
selenium-sessions        ClusterIP   25.128.197.243   <none>        5556/TCP                     2y193d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc - selenium-grid get route
Error: unknown command "selenium-grid" for "oc"
Run 'oc --help' for usage.
-sh-4.2$ oc -n selenium-grid get route
NAME                  HOST/PORT                                            PATH      SERVICES          PORT      TERMINATION     WILDCARD
selenium-grid.caixa   selenium-grid.caixa                                            selenium-router   web       edge/Redirect   None
selenium-router       selenium-router-selenium-grid.apps.produtos4.caixa             selenium-router   web       edge/Redirect   None
-sh-4.2$
