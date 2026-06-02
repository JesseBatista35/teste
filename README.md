Using project "default".
-sh-4.2$ oc project sifug-des
Now using project "sifug-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$ oc set env dc/sifug-siofg-api-des-des --list -n sifug-des | grep -i MXQD1
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sifug-siofg-api-des-des" not found
-sh-4.2$ oc set env dc/sifug-siofg-api-des --list -n sifug-des | grep -i MXQD1
-sh-4.2$

