
[root@sspdeaprlx0027 siavl05]# for n in 02 03 04 05; do
>   dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
>   f=$dir/siavl${n}.conf
>   cd "$dir"
>   cp "$f" "backup/siavl${n}.conf.$(date +%Y%m%d).WO-CORS-unset-v1"
>   \mv -f "${f}.NOVO" "$f"
> done
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep -E "siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd" | grep -v inter
apache    8542  0.0  0.1 271112  7800 ?        Ss   Aug28   0:11 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache    9496  0.0  0.1 271112  7800 ?        Ss   Aug28   0:11 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   11463  0.0  0.1 271112  7808 ?        Ss   Aug28   0:10 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   15315  0.0  0.0 270740  3228 ?        S    11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   15316  0.0  0.1 920724  5368 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   15317  0.0  0.1 756688  5180 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl02-httpd.log -k start
apache   15415  0.0  0.1 282852  4488 ?        S    11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   15416  0.0  0.0 270740  3224 ?        S    11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   15417  0.0  0.1 625616  4696 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   15418  0.0  0.1 855188  4932 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl03-httpd.log -k start
apache   15420  0.0  0.1 932836  5744 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   15421  0.0  0.1 637860  5084 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   15581  0.0  0.0 270740  3236 ?        S    11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   15582  0.0  0.1 920724  5376 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
apache   15585  0.6  0.1 691152  5140 ?        Sl   11:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl05-httpd.log -k start
root     15702  0.0  0.0 103460   960 pts/2    S+   11:40   0:00 grep -E siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd
root     57234  0.0  0.2 271112  8020 ?        Ss   Aug31   0:02 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -ik -X GET "https://agenciadigital4.des.caixa:8025/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0    80    0    80    0     0   1554      0 --:--:-- --:--:-- --:--:-- 26666
Access-Control-Allow-Origin: *
[root@sspdeaprlx0027 siavl05]#

