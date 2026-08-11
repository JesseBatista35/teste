[root@cadsvaprlx015 p585600]# ls /home/sadscp01/.nvm/versions/node/
v10.14.0  v12.18.1  v14.17.0
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]# /home/sadscp01/.nvm/versions/node/vXX.X.X/bin/node /home/sadscp01/.nvm/versions/node/v10.14.0/lib/node_modules/firebase-tools/lib/bin/firebase.js --version
bash: /home/sadscp01/.nvm/versions/node/vXX.X.X/bin/node: Arquivo ou diretório não encontrado
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]# /home/sadscp01/.nvm/versions/node/v12.18.1/bin/node --version
v12.18.1
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]# /home/sadscp01/.nvm/versions/node/v14.17.0/bin/node --version
v14.17.0
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]# cat /home/sadscp01/.nvm/alias/default 2>/dev/null
10.14.0
[root@cadsvaprlx015 p585600]# readlink -f /home/sadscp01/.nvm/versions/node/current 2>/dev/null
/home/sadscp01/.nvm/versions/node/current
[root@cadsvaprlx015 p585600]# su - sadscp01 -c 'source ~/.nvm/nvm.sh && nvm current'
v10.14.0
[root@cadsvaprlx015 p585600]# su - sadscp01 -c 'which node; which firebase; node --version'
/home/sadscp01/.nvm/versions/node/v10.14.0/bin/node
/home/sadscp01/.nvm/versions/node/v10.14.0/bin/firebase
v10.14.0
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
