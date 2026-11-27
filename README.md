
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# curl -sI "http://localhost:8080/sigsj_intranet/" | grep -i content-type
Content-Type: text/html;charset=ISO-8859-1
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# curl -s "http://localhost:8080/sigsj_intranet/" | grep -i "charset" | head
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
[root@caddeapllx955 p585600]#
