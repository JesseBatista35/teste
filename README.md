
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ grep -rniE "sigsj" /opt/apache/conf* 2>/dev/null | grep -iE "JkMount|worker|ServerName|VirtualHost|Listen" | head -20
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ grep -iE "sigsj|\.host|\.port" /opt/apache/conf*/workers.properties 2>/dev/null | head -30
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ tail -3 /log_apache/2.2/sigsj_internet/access.log /log_apache/2.2/sigsj_internet/access443.log
tail: option used in invalid context -- 3
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ find / -xdev \( -name "sigsj_intranet.xml" -o -name "sigsj_ws_boleto.xml" -o -name "sigsj*log4j*.xml" \) 2>/dev/null
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
