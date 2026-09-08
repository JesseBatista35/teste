
***********************************************************************
p585600@10.116.24.142's password:
Last login: Tue Sep  8 16:02:09 2026 from 10.122.150.31
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$ sudo systemctl list-units -all | grep -i sirpl
  sirpl.service                                                                                                  loaded    active   running   sirpl.service
● sirpldb.service                                                                                                not-found inactive dead      sirpldb.service
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$ ps -ef | grep -i node
root       1016    805  0  2025 ?        07:10:53 node /opt/open/nodejs/sirpl/node_modules/.bin/nodemon -L -e js,json -w .env -w app.js mock-sisgr-middleware.js -w docstrap.json mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json --exec npm run boot
root       1062   1039  0  2025 ?        00:00:00 node /opt/open/nodejs/sirpl/node_modules/.bin/babel-node ./bin/www mock-sisgr-middleware.js mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json
root       1073   1062  0  2025 ?        00:00:03 /usr/bin/node /opt/open/nodejs/sirpl/node_modules/babel-cli/lib/_babel-node ./bin/www mock-sisgr-middleware.js mock-sisgr-db.json mock-sisgr-route.json package.json package-lock.json swagger.json
p585600   82617  82256  0 16:07 pts/1    00:00:00 grep --color=auto -i node
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$ sudo systemctl stop sirpl.service
[p585600@srjtqapllx0018 ~]$ sudo systenctl disable sirpl.service
sudo: systenctl: command not found
[p585600@srjtqapllx0018 ~]$ ps -ef | grep sirpl
p585600   82814  82256  0 16:08 pts/1    00:00:00 grep --color=auto sirpl
[p585600@srjtqapllx0018 ~]$
[p585600@srjtqapllx0018 ~]$
