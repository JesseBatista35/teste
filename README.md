
[root@cadsvaprlx373 p585600]#
[root@cadsvaprlx373 p585600]# env | grep -i proxy
ULT_COM=env | grep -i proxy
[root@cadsvaprlx373 p585600]#
[root@cadsvaprlx373 p585600]#
[root@cadsvaprlx373 p585600]# cat /opt/ads-agent/.env /opt/ads-agent/.proxy /opt/ads-agent/.proxybypass 2>/dev/null
LANG=pt_BR.UTF-8
M2_HOME=/opt/apache-maven/apache-maven-3.5.3
SONAR_SCANNER=/opt/sonar-scanner/sonar-scanner
JAVA_HOME_7_X64=/usr/java/jdk1.7.0_79
JAVA_HOME_8_X64=/usr/java/jdk1.8.0_221
JAVA_HOME_11_X64=/usr/java/open-jdk-11
FORTIFY_HOME=/opt/Fortify/Fortify_SCA_and_Apps_22.2.0
[root@cadsvaprlx373 p585600]#
[root@cadsvaprlx373 p585600]#
[root@cadsvaprlx373 p585600]# systemctl cat 'vsts.agent*' 2>/dev/null | grep -i -E 'proxy|Environment'
[root@cadsvaprlx373 p585600]# curl -vk https://api.produtos4.caixa:6443/version
* About to connect() to api.produtos4.caixa port 6443 (#0)
*   Trying 10.121.105.31...
* Connected to api.produtos4.caixa (10.121.105.31) port 6443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* NSS: client certificate not found (nickname not specified)
* SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
* Server certificate:
*       subject: CN=*.produtos4.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jul 13 21:27:17 2023 GMT
*       expire date: Jul 11 21:27:17 2028 GMT
*       common name: *.produtos4.caixa
*       issuer: CN=AC Interna APL,O=Caixa Economica Federal,C=BR
> GET /version HTTP/1.1
> User-Agent: curl/7.29.0
> Host: api.produtos4.caixa:6443
> Accept: */*
>
< HTTP/1.1 200 OK
< Audit-Id: 44384459-e444-44c7-a5ef-be22c6f33d7c
< Cache-Control: no-cache, private
< Content-Type: application/json
< X-Kubernetes-Pf-Flowschema-Uid: 756a0605-aeea-4c9f-a36c-39b9b21010d6
< X-Kubernetes-Pf-Prioritylevel-Uid: e5ab49cd-e940-4803-bbbe-dd61c24df643
< Date: Fri, 27 Nov 2026 17:02:20 GMT
< Content-Length: 295
<
{
  "major": "1",
  "minor": "23+",
  "gitVersion": "v1.23.5-rc.0.2076+8cfebb1ce4a59f-dirty",
  "gitCommit": "8cfebb1ce4a59f15fd8cdd4fba6bb5dc516324f1",
  "gitTreeState": "dirty",
  "buildDate": "2022-07-08T23:31:07Z",
  "goVersion": "go1.17.5",
  "compiler": "gc",
  "platform": "linux/amd64"
* Connection #0 to host api.produtos4.caixa left intact
}[root@cadsvaprlx373 p585600]# curl -vk --noproxy '*' https://api.produtos4.caixa:6443/version
* About to connect() to api.produtos4.caixa port 6443 (#0)
*   Trying 10.121.105.31...
* Connected to api.produtos4.caixa (10.121.105.31) port 6443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* NSS: client certificate not found (nickname not specified)
* SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
* Server certificate:
*       subject: CN=*.produtos4.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jul 13 21:27:17 2023 GMT
*       expire date: Jul 11 21:27:17 2028 GMT
*       common name: *.produtos4.caixa
*       issuer: CN=AC Interna APL,O=Caixa Economica Federal,C=BR
> GET /version HTTP/1.1
> User-Agent: curl/7.29.0
> Host: api.produtos4.caixa:6443
> Accept: */*
>
< HTTP/1.1 200 OK
< Audit-Id: 7ce84615-4819-4ac5-aa60-1e42c3bcf8bd
< Cache-Control: no-cache, private
< Content-Type: application/json
< X-Kubernetes-Pf-Flowschema-Uid: 756a0605-aeea-4c9f-a36c-39b9b21010d6
< X-Kubernetes-Pf-Prioritylevel-Uid: e5ab49cd-e940-4803-bbbe-dd61c24df643
< Date: Fri, 27 Nov 2026 17:02:26 GMT
< Content-Length: 295
<
{
  "major": "1",
  "minor": "23+",
  "gitVersion": "v1.23.5-rc.0.2076+8cfebb1ce4a59f-dirty",
  "gitCommit": "8cfebb1ce4a59f15fd8cdd4fba6bb5dc516324f1",
  "gitTreeState": "dirty",
  "buildDate": "2022-07-08T23:31:07Z",
  "goVersion": "go1.17.5",
  "compiler": "gc",
  "platform": "linux/amd64"
* Connection #0 to host api.produtos4.caixa left intact
}[root@cadsvaprlx373 p585600]#
