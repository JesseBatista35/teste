[p585600@srjdeapllx0051 ~]$ sudo systemctl stop sirpl.service
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl disable sirpl.service
Removed symlink /etc/systemd/system/multi-user.target.wants/sirpl.service.
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ systemctl status sirpl.service
● sirpl.service
   Loaded: loaded (/etc/systemd/system/sirpl.service; disabled; vendor preset: disabled)
   Active: inactive (dead)
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ ps -ef | grep sirpl
p585600   94859  93588  0 15:55 pts/7    00:00:00 grep --color=auto sirpl
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl disable sirpldb.service
Failed to execute operation: No such file or directory
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo rm /etc/systemd/system/multi-user.target.wants/sirpldb.service
[p585600@srjdeapllx0051 ~]$ ]
-bash: ]: command not found
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo mv /opt/open/nodejs/sirpl /opt/open/nodejs/sirpl.desmobilizado_20260616
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl list-units --all | grep -i sirpl
● sirpldb.service                                                                                                not-found inactive dead      sirpldb.service
[p585600@srjdeapllx0051 ~]$ ps -ef | grep -i node
spnoddr1  50140  50087  0  2024 ?        00:00:03 node index.js
spnoddr1  50143  50086  0  2024 ?        03:22:10 node index.js
p585600   95038  93588  0 15:56 pts/7    00:00:00 grep --color=auto -i node
spnoddr1 117056 117038  0 Jul27 ?        00:02:11 node index.js
[p585600@srjdeapllx0051 ~]$
