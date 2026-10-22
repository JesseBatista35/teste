
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# curl -sv -m 20 -x http://proxydes.caixa:80 https://brazilsouth-1.in.applicationinsights.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|Connected|timed out|refused"
* Connected to proxydes.caixa (10.252.32.63) port 80 (#0)
> CONNECT brazilsouth-1.in.applicationinsights.azure.com:443 HTTP/1.1
< HTTP/1.1 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# curl -sv -m 20 -x http://proxydes.caixa:80 https://brazilsouth.livediagnostics.monitor.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|Connected|timed out|refused"
* Connected to proxydes.caixa (10.252.32.63) port 80 (#0)
> CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
< HTTP/1.1 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# C=$(ls -d /opt/jboss/jboss-eap/hc/data/content/2b/6dcb33bec92c787d6792fb3d58005f2a271760/content)
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# unzip -l $C | grep -iE "applicationinsights|ApplicationInsights.xml|applicationinsights.json"
[root@sbrdeapllx104 p585600]# mkdir -p /tmp/gec && cd /tmp/gec && unzip -oq $C && for f in *.jar *.war; do unzip -l $f | grep -iE "applicationinsights" | sed "s|^|$f: |"; done
[root@sbrdeapllx104 gec]#
