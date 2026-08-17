
[p585600@caddeapllx2423 ~]$ ss -tlnp | grep java
[p585600@caddeapllx2423 ~]$ ss -tlnp
State                  Recv-Q                 Send-Q                                 Local Address:Port                                   Peer Address:Port                 Process
LISTEN                 0                      10000                                        0.0.0.0:8080                                        0.0.0.0:*
LISTEN                 0                      10000                                        0.0.0.0:8009                                        0.0.0.0:*
LISTEN                 0                      50                                           0.0.0.0:9990                                        0.0.0.0:*
LISTEN                 0                      3                                            0.0.0.0:8778                                        0.0.0.0:*
LISTEN                 0                      10000                                        0.0.0.0:8443                                        0.0.0.0:*
LISTEN                 0                      50                                         127.0.0.1:3528                                        0.0.0.0:*
LISTEN                 0                      128                                          0.0.0.0:22                                          0.0.0.0:*
LISTEN                 0                      65535                                              *:10050                                             *:*
LISTEN                 0                      65535                                              *:9100                                              *:*
LISTEN                 0                      511                                                *:80                                                *:*
LISTEN                 0                      128                                             [::]:22                                             [::]:*
LISTEN                 0                      511                                                *:443                                               *:*
[p585600@caddeapllx2423 ~]$
[p585600@caddeapllx2423 ~]$
[p585600@caddeapllx2423 ~]$ ss -tlnp | grep 14853
[p585600@caddeapllx2423 ~]$ netstat -tlnp 2>/dev/null | grep 1485
[p585600@caddeapllx2423 ~]$ netstat -tlnp 2>/dev/null | grep 14853
[p585600@caddeapllx2423 ~]$
