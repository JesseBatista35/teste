
[p585600@srjdeapllx0051 ~]$ ps -ef | grep -i node
spnoddr1  15838  15816  0  2024 ?        1-03:55:02 node /opt/open/nodejs/sirpl/node_modules/.bin/nodemon -L -e js,json -w .env -w app.js mock-sisgr-middleware.js -w docstrap.json mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json --exec npm run boot
spnoddr1  15883  15861  0  2024 ?        00:00:00 node /opt/open/nodejs/sirpl/node_modules/.bin/babel-node ./bin/www mock-sisgr-middleware.js mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json
spnoddr1  15890  15883  0  2024 ?        06:28:22 /usr/bin/node /opt/open/nodejs/sirpl/node_modules/babel-cli/lib/_babel-node ./bin/www mock-sisgr-middleware.js mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json
spnoddr1  50140  50087  0  2024 ?        00:00:03 node index.js
spnoddr1  50143  50086  0  2024 ?        03:22:10 node index.js
p585600   93840  93588  0 15:50 pts/7    00:00:00 grep --color=auto -i node
spnoddr1 117056 117038  0 Jul27 ?        00:02:11 node index.js
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo netsat -tulnp | grep 8601
sudo: netsat: command not found
[p585600@srjdeapllx0051 ~]$ sudo netstat -tulnp | grep 8601
[p585600@srjdeapllx0051 ~]$ ls -la /etc/init.d | grep -i sirpl
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ chkconfig --list | grep -i sirpl

Note: This output shows SysV services only and does not include native
      systemd services. SysV configuration data might be overridden by native
      systemd configuration.

      If you want to list systemd services use 'systemctl list-unit-files'.
      To see services enabled on particular target use
      'systemctl list-dependencies [target]'.

[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
