-sh-4.2$ cat /home/sadscp01/.nvm/versions/node/v10.14.0/lib/node_modules/firebase-tools/package.json | grep '"version"'
cat: /home/sadscp01/.nvm/versions/node/v10.14.0/lib/node_modules/firebase-tools/package.json: Permissão negada
-sh-4.2$ /home/sadscp01/.nvm/versions/node/v10.14.0/bin/firebase --version
-sh: /home/sadscp01/.nvm/versions/node/v10.14.0/bin/firebase: Permissão negada
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[root@cadsvaprlx015 p585600]# cat /home/sadscp01/.nvm/versions/node/v10.14.0/lib/node_modules/firebase-tools/package.json | grep '"version"'
  "version": "9.6.1"
[root@cadsvaprlx015 p585600]# /home/sadscp01/.nvm/versions/node/v10.14.0/bin/firebase --version
/usr/bin/env: node: Arquivo ou diretório não encontrado
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
[root@cadsvaprlx015 p585600]#
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
[root@cadsvaprlx015 p585600]#
