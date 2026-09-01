Access-Control-Allow-Origin: *
[root@sspdeaprlx0027 siavl05]# kill 57234
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep "siavl04-httpd" | grep -v inter
root     15813  0.0  0.0 103324   872 pts/2    S+   11:41   0:00 grep siavl04-httpd
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -ik -X GET "https://agenciadigital4.des.caixa:8025/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
