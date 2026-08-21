
[p585600@caddeapllx2560 opt]$ systemctl list-units --type=service | grep -iE "jboss|wildfly|siccp|sig"
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ systemctl list-unit-files | grep -iE "jboss|wildfly|siccp|sig"
insights-client-results.path               enabled         disabled
insights-client-boot.service               enabled         enabled
insights-client-results.service            static          -
insights-client.service                    static          -
sigpwr.target                              static          -
insights-client.timer                      enabled         disabled
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ crontab -l -u root 2>/dev/null
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ crontab -l 2>/dev/null
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ls -la /etc/cron.d/ | grep -iE "sig|siccp"
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
