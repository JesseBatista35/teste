
[p585600@srjtqapllx0018 ~]$ sudo systemctl disable sirpl.service
Removed symlink /etc/systemd/system/multi-user.target.wants/sirpl.service.
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$ systemctl status sirpl.service
● sirpl.service
   Loaded: loaded (/etc/systemd/system/sirpl.service; disabled; vendor preset: disabled)
   Active: failed (Result: exit-code) since Tue 2026-09-08 16:07:41 -03; 2min 32s ago
 Main PID: 805 (code=exited, status=143)
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$ sudo mv /opt/open/nodejs/sirpl /opt/open/nodejs/sirpl.desmobilizado_20260616
[p585600@srjtqapllx0018 ~]$
