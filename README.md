
[sudo] password for p585600:
15:    ProxyPass        ^/fec-web/ balancer://mod_cluster_sifec/fec-web/ stickysession=JSESSIONID|jsessionid nofailover=On
16:    ProxyPassReverse ^/fec-web/ balancer://mod_cluster_sifec/fec-web/
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
