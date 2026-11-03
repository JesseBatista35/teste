

</VirtualHost>
[p585600@cbrdeapllx476 ~]$ sudo sh -c 'grep "03/Nov/2026" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log > /tmp/migracaosifec-access.log'
Sorry, user p585600 is not allowed to execute '/usr/bin/sh -c grep "03/Nov/2026" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log > /tmp/migracaosifec-access.log' as root on cbrdeapllx476.
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo sh -c 'grep "Nov 03" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log > /tmp/migracaosifec-error.log'
Sorry, user p585600 is not allowed to execute '/usr/bin/sh -c grep "Nov 03" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log > /tmp/migracaosifec-error.log' as root on cbrdeapllx476.
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo chmod 644 /tmp/migracaosifec-*.log
chmod: cannot access '/tmp/migracaosifec-*.log': No such file or directory
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ wc -l /tmp/migracaosifec-*.log
wc: '/tmp/migracaosifec-*.log': No such file or directory
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
