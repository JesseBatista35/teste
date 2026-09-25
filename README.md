p585600@10.116.89.0's password:
Last login: Thu Aug 27 16:08:08 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# history
    1  15/10/25 19:22:55 -> exit
    2  15/10/25 19:36:33 -> su - jboss
    3  15/10/25 19:38:00 -> exit
    4  15/10/25 19:43:02 -> su - jboss
    5  15/10/25 19:46:33 -> exit
    6  15/10/25 19:48:45 -> su - jboss
    7  15/10/25 19:50:07 -> exit
    8  15/10/25 20:00:04 -> su - jboss
    9  15/10/25 20:03:55 -> exit
   10  15/10/25 20:07:34 -> su - jboss
   11  15/10/25 20:08:44 -> exit
   12  15/10/25 20:09:08 -> su - jboss
   13  15/10/25 20:09:55 -> exit
   14  15/10/25 21:35:28 -> su - jboss
   15  15/10/25 21:37:22 -> exit
   16  15/10/25 21:41:07 -> su - jboss
   17  15/10/25 21:43:16 -> exit
   18  15/10/25 21:45:21 -> su - jboss
   19  15/10/25 21:45:50 -> exit
   20  15/10/25 21:56:06 -> su - jboss
   21  15/10/25 21:57:35 -> exit
   22  15/10/25 21:59:33 -> su - jboss
   23  15/10/25 22:00:51 -> exit
   24  15/10/25 22:04:53 -> su - jboss
   25  15/10/25 22:05:28 -> exit
   26  15/10/25 22:08:04 -> su - jboss
   27  15/10/25 22:11:14 -> exit
   28  15/10/25 22:18:11 -> su - jboss
   29  15/10/25 22:19:16 -> exit
   30  16/10/25 08:50:46 -> su - jboss
   31  16/10/25 09:03:27 -> exit
   32  16/10/25 09:11:39 -> su - jboss
   33  16/10/25 09:36:11 -> exit
   34  16/10/25 11:42:00 -> su - jboss
   35  16/10/25 11:45:20 -> exit
   36  16/10/25 10:16:19 -> pwd
   37  16/10/25 10:16:27 -> cd /home/p515324/
   38  16/10/25 10:16:29 -> ls -ltr
   39  16/10/25 10:21:59 -> mkdir desacm-mobilidade.des.caixa
   40  16/10/25 12:44:32 -> su - jboss
   41  16/10/25 12:45:57 -> exit
   42  16/10/25 12:50:28 -> su - jboss
   43  16/10/25 12:57:30 -> exit
   44  16/10/25 13:08:53 -> su - jboss
   45  16/10/25 13:10:33 -> exit
   46  16/10/25 13:32:07 -> su - jboss
   47  16/10/25 13:33:44 -> exit
   48  16/10/25 11:34:05 -> cd /home/p515324
   49  16/10/25 11:34:09 -> ls -ltr



0/05/26 13:38:11 -> grep -iR sbrdeapllx103 *
 1912  20/05/26 11:04:00 -> df -kh
 1913  20/05/26 11:04:09 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1914  20/05/26 11:04:16 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1915  20/05/26 13:41:14 -> netstat -antlp
 1916  20/05/26 14:21:07 -> cd /opt/jboss/
 1917  20/05/26 14:21:08 -> ls
 1918  20/05/26 14:21:10 -> cd jboss-eap/
 1919  20/05/26 14:21:10 -> ls
 1920  20/05/26 14:21:14 -> cd dc/
 1921  20/05/26 14:21:14 -> ls
 1922  20/05/26 14:21:17 -> cd configuration/
 1923  20/05/26 14:21:18 -> ls
 1924  20/05/26 14:21:22 -> ls -lhtr
 1925  20/05/26 14:21:28 -> vim domain.xml
 1926  20/05/26 15:03:20 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1927  20/05/26 15:03:44 -> cd /opt/jboss/jboss-eap/dc/log/
 1928  20/05/26 15:04:16 -> grep -iR "slave host" *
 1929  20/05/26 15:05:41 -> ls -lhtr
 1930  20/05/26 15:08:39 -> netstat -antlp | grep 99
 1931  20/05/26 15:08:56 -> netstat -antlp
 1932  20/05/26 15:09:05 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1933  20/05/26 15:25:25 -> tail -900f host-controller.log
 1934  20/05/26 15:30:49 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1935  20/05/26 15:37:30 -> cd ..
 1936  20/05/26 15:37:30 -> ls
 1937  20/05/26 15:37:34 -> cd configuration/
 1938  20/05/26 15:37:34 -> ls
 1939  20/05/26 15:37:40 -> vim domain.xml
 1940  20/05/26 15:43:26 -> tail -900f host-controller.log
 1941  20/05/26 15:43:31 -> cd -
 1942  20/05/26 15:43:38 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1943  20/05/26 15:43:54 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1944  20/05/26 15:47:16 -> cat configuration/domain.xml
 1945  20/05/26 15:47:29 -> vi configuration/domain.xml
 1946  20/05/26 15:50:59 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1947  20/05/26 17:35:09 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 1948  22/05/26 15:44:06 -> cd /opt/jboss/
 1949  22/05/26 15:44:07 -> ls
 1950  22/05/26 15:44:20 -> tar czvf backup-jboss-eap-dc-7.1.6-$(date +%Y-%m-%d).tar.gz jboss-eap
 1951  22/05/26 15:45:47 -> df -h
 1952  22/05/26 15:45:56 -> ls -lhtr
 1953  22/05/26 15:46:36 -> chmod 777 backup-jboss-eap-dc-7.1.6-2026-05-22.tar.gz
 1954  22/05/26 15:46:38 -> pwd
 1955  22/05/26 15:46:43 -> ifconfig
 1956  26/05/26 17:56:52 -> su - jboss
 1957  26/05/26 17:57:24 -> exit
 1958  26/05/26 17:35:48 -> ps -ef | grep jboss
 1959  26/05/26 17:35:58 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 1960  26/05/26 17:36:16 -> cd /opt/jboss/jboss-eap/dc/configuration/
 1961  26/05/26 17:36:17 -> ls -ltr
 1962  26/05/26 17:36:21 -> vim domain.xml
 1963  27/05/26 09:57:41 -> cd /opt/jboss/jboss-eap/dc/
 1964  27/05/26 09:57:43 -> cd configuration/
 1965  27/05/26 09:57:44 -> ls -ltr
 1966  27/05/26 09:57:48 -> vim domain.xml
 1967  27/05/26 12:14:40 -> systemctl stop jboss-eap7_dc.service
 1968  27/05/26 12:14:44 -> ps -ef | grep jboss
 1969  27/05/26 12:14:50 -> systemctl start jboss-eap7_dc.service
 1970  27/05/26 12:14:58 -> ps -ef | grep jboss
 1971  27/05/26 12:15:04 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1972  27/05/26 14:03:19 -> ps -ef | grep jboss
 1973  27/05/26 14:03:26 -> cd /opt/jboss/jboss-eap/dc/configuration/
 1974  27/05/26 14:03:29 -> vim domain.xml
 1975  27/05/26 14:05:04 -> systemctl stop jboss-eap7_dc.service
 1976  27/05/26 14:05:15 -> ps -ef | grep jboss
 1977  27/05/26 14:05:19 -> systemctl start jboss-eap7_dc.service
 1978  27/05/26 14:05:31 -> ps -ef | grep jboss
 1979  27/05/26 14:05:36 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1980  27/05/26 14:13:56 -> vim domain.xml
 1981  28/05/26 09:13:07 -> ps -ef | grep jboss
 1982  28/05/26 09:13:09 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1983  28/05/26 09:13:22 -> cd /opt/jboss/jboss-eap/dc/configuration/
 1984  28/05/26 09:13:26 -> vim domain.xml
 1985  28/05/26 09:14:49 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1986  28/05/26 09:17:24 -> vim domain.xml
 1987  28/05/26 09:20:38 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1988  29/05/26 14:36:27 -> cd /opt/jboss/jboss-eap/dc/configuration/
 1989  29/05/26 14:36:30 -> vim domain.xml
 1990  29/05/26 17:31:12 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 1991  29/05/26 17:31:55 -> cd /opt/jboss/jboss-eap/dc/configuration/
 1992  29/05/26 17:31:56 -> ls -ltr
 1993  29/05/26 17:32:01 -> vim domain.xml
 1994  02/06/26 16:27:24 -> sudo us
 1995  02/06/26 16:27:29 -> sudo su
 1996  02/06/26 16:27:38 -> ps -ef | grep jboss
 1997  02/06/26 16:28:02 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 1998  02/06/26 16:37:59 -> ip a
 1999  02/06/26 16:38:17 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2000  02/06/26 16:43:34 -> strings /var/tmp/pacote/WEB-INF/classes/br/gov/caixa/ecm/controller/health/HealthCheck.class|less -I
 2001  02/06/26 16:45:41 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2002  02/06/26 16:49:25 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2003  02/06/26 16:49:27 -> ls -ltr
 2004  02/06/26 16:49:43 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2005  03/06/26 10:29:59 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2006  03/06/26 10:31:09 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2007  03/06/26 10:31:15 -> ls -ltr
 2008  03/06/26 10:31:25 -> vim domain.xml
 2009  03/06/26 12:20:58 -> ps -ef | grep jboss
 2010  03/06/26 12:21:00 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2011  03/06/26 14:53:14 -> su - jboss
 2012  03/06/26 14:54:56 -> exit
 2013  03/06/26 16:39:37 -> su - jboss
 2014  03/06/26 16:45:49 -> exit
 2015  03/06/26 16:50:37 -> su - jboss
 2016  03/06/26 18:00:11 -> exit
 2017  03/06/26 18:15:36 -> su - jboss
 2018  03/06/26 18:16:16 -> exit
 2019  03/06/26 18:16:28 -> su - jboss
 2020  03/06/26 18:18:35 -> exit
 2021  03/06/26 18:27:28 -> su - jboss
 2022  08/06/26 13:44:26 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2023  10/06/26 15:00:10 -> ls -lrth
 2024  10/06/26 15:00:20 -> ps -ef | grep jboss
 2025  10/06/26 15:00:31 -> cd /opt/jboss/jboss-eap/dc
 2026  10/06/26 15:00:32 -> ls -lrth
 2027  10/06/26 15:00:34 -> cd configuration/
 2028  10/06/26 15:00:35 -> ls -lrth
 2029  10/06/26 15:00:41 -> less -I domain.xml
 2030  11/06/26 10:15:20 -> ps -ef | grep jboss
 2031  11/06/26 10:34:02 -> ps -ef | grep jboss
 2032  11/06/26 10:35:48 -> tail -20f /opt/jboss/jboss-eap/dc/log/process-controller.log
 2033  11/06/26 10:37:40 -> cd /opt/jboss/jboss-eap/dc/log/
 2034  11/06/26 10:37:57 -> ls -lt
 2035  11/06/26 10:38:37 -> df -h
 2036  16/06/26 12:39:30 -> cat /opt/ads-agent/_work/_temp/36ca2504-80d7-48d1-8869-4fcd4040556b.sh
 2037  16/06/26 12:39:56 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2038  18/06/26 16:28:09 -> LS -LTRH
 2039  18/06/26 16:28:13 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2040  18/06/26 16:28:43 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2041  18/06/26 17:19:56 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2042  18/06/26 17:19:57 -> ls -ltr
 2043  18/06/26 17:20:00 -> vim domain.xml
 2044  18/06/26 17:33:43 -> cp domain.xml domain.xml.18062026
 2045  18/06/26 17:33:50 -> vim domain.xml
 2046  18/06/26 17:34:13 -> systemctl stop jboss-eap7_dc.service
 2047  18/06/26 17:34:28 -> vim domain.xml
 2048  18/06/26 17:38:27 -> systemctl start jboss-eap7_dc.service
 2049  18/06/26 17:38:38 -> tail -20f /opt/jboss/jboss-eap/dc/log/process-controller.log
 2050  18/06/26 17:38:51 -> ps -ef | grep jboss
 2051  18/06/26 17:39:23 -> tail -900f/opt/jboss/jboss-eap/dc/log/host-controller.log
 2052  18/06/26 17:39:28 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2053  18/06/26 17:39:42 -> ps -ef | grep jboss
 2054  18/06/26 17:39:48 -> systemctl start jboss-eap7_dc.service
 2055  18/06/26 17:40:06 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2056  19/06/26 09:59:37 -> df -kh
 2057  19/06/26 09:59:44 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2058  19/06/26 09:59:47 -> ls -ltr
 2059  19/06/26 09:59:51 -> vim domain.xml
 2060  19/06/26 10:03:46 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2061  19/06/26 17:26:29 -> cd /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss
 2062  19/06/26 17:26:31 -> ls -ltr
 2063  22/06/26 11:10:22 -> cd /opt/jboss/jboss-eap/dc/
 2064  22/06/26 11:10:27 -> cd configuration/
 2065  22/06/26 11:10:28 -> ls -ltr
 2066  22/06/26 11:10:33 -> vim domain.xml
 2067  22/06/26 11:11:30 -> df -kh
 2068  22/06/26 11:11:36 -> cd /upload/des/sigec/
 2069  22/06/26 11:11:38 -> ls -ltr
 2070  22/06/26 11:11:45 -> pwd
 2071  22/06/26 11:11:56 -> df -kh
 2072  22/06/26 11:13:01 -> pwd
 2073  22/06/26 11:13:42 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2074  22/06/26 11:17:12 -> df -kh
 2075  22/06/26 11:17:44 -> ls -ltr /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/
 2076  22/06/26 11:17:52 -> pwd
 2077  22/06/26 11:19:25 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2078  22/06/26 11:31:49 -> systemctl stop jboss-eap7_dc.service
 2079  22/06/26 11:31:57 -> ps -ef | grep jboss
 2080  22/06/26 11:32:02 -> systemctl start jboss-eap7_dc.service
 2081  22/06/26 11:32:15 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2082  22/06/26 11:32:25 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2083  22/06/26 11:45:11 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2084  22/06/26 11:49:03 -> pwd
 2085  22/06/26 11:49:08 -> vim /opt/jboss/jboss-eap/dc/configuration/domain.xml
 2086  22/06/26 11:50:38 -> systemctl stop jboss-eap7_dc.service
 2087  22/06/26 11:50:42 -> ps -ef | grep jboss
 2088  22/06/26 11:50:45 -> systemctl start jboss-eap7_dc.service
 2089  22/06/26 11:50:54 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2090  22/06/26 16:43:52 -> cd /upload/des/sigec
 2091  22/06/26 16:43:54 -> ls -ltrh
 2092  22/06/26 17:09:25 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2093  23/06/26 13:43:57 -> su - jboss
 2094  26/06/26 10:04:51 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2095  26/06/26 10:04:52 -> ls -ltr
 2096  26/06/26 10:04:56 -> vim domain.xml
 2097  26/06/26 12:41:13 -> systemctl | grep zabbix
 2098  26/06/26 12:41:25 -> systemctl status zabbix-agent.service
 2099  26/06/26 12:41:32 -> systemctl stop zabbix-agent.service
 2100  26/06/26 12:41:38 -> vi /etc/zabbix/zabbix_agentd.conf
 2101  26/06/26 12:42:35 -> cd /var/run/
 2102  26/06/26 12:42:41 -> ls -lh
 2103  26/06/26 12:42:46 -> mkdir zabbix
 2104  26/06/26 12:42:50 -> cd /var/log/
 2105  26/06/26 12:42:53 -> ls -lh zabbix/
 2106  26/06/26 12:42:58 -> ls -lhd zabbix/
 2107  26/06/26 12:43:01 -> cd -
 2108  26/06/26 12:43:07 -> chown zabbix: zabbix/
 2109  26/06/26 12:43:10 -> ls -lhd zabbix/
 2110  26/06/26 12:43:16 -> systemctl stgart zabbix-agent.service

 
 2111  26/06/26 12:43:20 -> systemctl start zabbix-agent.service
 2112  26/06/26 12:43:22 -> systemctl status zabbix-agent.service
 2113  26/06/26 12:43:34 -> puppet agent -t
 2114  03/07/26 21:52:37 -> su - jboss
 2115  03/07/26 21:55:36 -> exit
 2116  03/07/26 22:00:28 -> su - jboss
 2117  03/07/26 22:00:56 -> exit
 2118  07/07/26 16:02:28 -> su - jboss
 2119  07/07/26 16:17:15 -> exit
 2120  13/07/26 12:25:13 -> su - jboss
 2121  13/07/26 12:27:46 -> exit
 2122  13/07/26 15:18:35 -> su - jboss
 2123  13/07/26 15:19:53 -> exit
 2124  17/07/26 17:01:20 -> history
 2125  17/07/26 17:01:27 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:999
 2126  17/07/26 17:01:37 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2127  23/07/26 16:37:45 -> systemctl stop jboss-eap7_dc.service
 2128  23/07/26 16:37:54 -> systemctl start jboss-eap7_dc.service
 2129  23/07/26 16:38:16 -> ps -f | grep 'jboss'
 2130  23/07/26 16:38:34 -> systemctl status jboss-eap7_dc.service
 2131  23/07/26 16:38:43 -> ps -f | grep'jboss
 2132  25/09/26 11:11:05 -> '
 2133  23/07/26 16:38:58 -> ps -f | grep jboss
 2134  23/07/26 16:39:03 -> ps -f | grep -i jboss
 2135  23/07/26 16:39:08 -> ps -ef | grep -i jboss
 2136  23/07/26 16:40:37 -> exit
 2137  23/07/26 14:55:03 -> ps -ef | grep jboss
 2138  23/07/26 14:55:09 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2139  23/07/26 14:55:10 -> ls -ltr
 2140  23/07/26 14:55:28 -> cp domain.xml domain.xml.bkp_23072026
 2141  23/07/26 14:55:33 -> vim domain.xml
 2142  23/07/26 15:03:57 -> pwd
 2143  23/07/26 15:04:34 -> vim domain.xml
 2144  23/07/26 15:08:25 -> systemctl stop jboss-eap7_dc.service
 2145  23/07/26 15:08:30 -> ps -ef | grep jboss
 2146  23/07/26 15:08:35 -> systemctl start jboss-eap7_dc.service
 2147  23/07/26 15:09:06 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2148  27/07/26 16:02:14 -> ps -ef | grep jboss
 2149  27/07/26 16:02:27 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2150  27/07/26 16:03:52 -> ls -ltr
 2151  27/07/26 16:03:59 -> vim domain.xml
 2152  29/07/26 11:48:35 -> su - jboss
 2153  29/07/26 12:19:58 -> exit
 2154  29/07/26 11:55:05 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2155  29/07/26 11:55:06 -> ls -ltrh
 2156  29/07/26 11:55:31 -> cat domain.xml
 2157  29/07/26 11:55:45 -> vi domain.xml
 2158  29/07/26 11:58:28 -> ls -ltrh
 2159  29/07/26 11:58:57 -> pwd
 2160  29/07/26 12:04:48 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2161  31/07/26 12:23:08 -> grep -R "SINAD." /opt/jboss/jboss-eap/hc/configuration
 2162  31/07/26 12:23:17 -> grep -R "SINAD." /opt/jboss/jboss-eap/dc/configuration
 2163  31/07/26 12:25:38 -> cd  /opt/jboss/jboss-eap/dc/configuration
 2164  31/07/26 12:25:41 -> ls -ltrh
 2165  31/07/26 12:37:01 -> vi domain.xml
 2166  31/07/26 13:02:01 -> ls -ltrh
 2167  31/07/26 13:03:16 -> ps -ef | grep java
 2168  31/07/26 13:03:28 -> history | grep restart
 2169  31/07/26 13:03:37 -> history | grep start
 2170  31/07/26 13:03:53 -> systemctl restart jboss-eap7_dc.service
 2171  31/07/26 13:04:10 -> ps -ef | grep java
 2172  31/07/26 13:04:19 -> l s-ltrh
 2173  31/07/26 13:08:30 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2174  31/07/26 13:10:29 -> ls -ltrh
 2175  31/07/26 13:10:44 -> grep -R "SINAD." /opt/jboss/jboss-eap/dc/configuration
 2176  31/07/26 13:10:55 -> vim domain.xml
 2177  04/08/26 17:01:42 -> ps -ef | grep jboss
 2178  04/08/26 17:01:45 -> df -kh
 2179  04/08/26 17:01:50 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2180  04/08/26 22:38:25 -> su - jboss
 2181  04/08/26 22:39:26 -> exit
 2182  04/08/26 22:39:49 -> su - jboss
 2183  04/08/26 22:41:12 -> exit
 2184  04/08/26 22:48:28 -> su - jboss
 2185  05/08/26 10:58:08 -> exit
 2186  05/08/26 11:26:21 -> su - jboss
 2187  05/08/26 11:28:37 -> exit
 2188  05/08/26 11:29:55 -> su - jboss
 2189  05/08/26 11:31:40 -> exit
 2190  05/08/26 09:26:13 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2191  05/08/26 09:26:44 -> ps -ef | grep jboss
 2192  05/08/26 09:26:48 -> systemctl restart jboss-eap7_dc.service
 2193  05/08/26 09:26:58 -> ps -ef | grep jboss
 2194  05/08/26 09:27:13 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2195  05/08/26 10:40:07 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2196  05/08/26 10:40:09 -> ls -ltr
 2197  05/08/26 10:40:34 -> cp domain.xml domain.xml.05082026
 2198  05/08/26 10:40:40 -> vim domain.xml
 2199  05/08/26 10:48:36 -> cd /upload/des/sigec/
 2200  05/08/26 10:48:39 -> ls -ltr
 2201  05/08/26 10:48:45 -> df -kh
 2202  05/08/26 10:48:52 -> pwd
 2203  05/08/26 10:49:44 -> vim azuresb.properties
 2204  05/08/26 10:50:37 -> ls -ltr
 2205  05/08/26 10:50:46 -> chown jboss. azuresb.properties
 2206  05/08/26 10:50:47 -> ls -ltr
 2207  05/08/26 10:50:58 -> chmod 777 azuresb.properties
 2208  05/08/26 10:50:59 -> ls -ltr
 2209  05/08/26 10:51:05 -> pwd
 2210  05/08/26 10:51:31 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2211  05/08/26 10:51:35 -> vim domain.xml
 2212  05/08/26 10:52:42 -> systemctl stop jboss-eap7_dc.service
 2213  05/08/26 10:52:47 -> ps -ef | grep jboss
 2214  05/08/26 10:52:49 -> systemctl restart jboss-eap7_dc.service
 2215  05/08/26 10:52:59 -> ps -ef | grep jboss
 2216  05/08/26 10:56:07 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2217  05/08/26 10:59:58 -> vim domain.xml
 2218  05/08/26 11:01:04 -> cd /upload/des/sigec/
 2219  05/08/26 11:13:44 -> pwd
 2220  05/08/26 11:13:46 -> ls -ltr
 2221  05/08/26 11:13:51 -> cat a
 2222  05/08/26 11:13:55 -> cat azuresb.properties
 2223  05/08/26 11:33:18 -> su - jboss
 2224  05/08/26 17:51:30 -> cd /upload/des/sigec/
 2225  05/08/26 17:51:31 -> ls -tlr
 2226  05/08/26 17:51:39 -> vim azuresb.properties
 2227  05/08/26 17:52:39 -> ls -ltr
 2228  05/08/26 17:52:47 -> systemctl stop jboss-eap7_dc.service
 2229  05/08/26 17:52:53 -> ps -ef | grep jboss
 2230  05/08/26 17:53:00 -> systemctl start jboss-eap7_dc.service
 2231  05/08/26 17:53:10 -> ps -ef | grep jboss
 2232  05/08/26 17:53:18 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2233  06/08/26 12:09:37 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2234  06/08/26 12:09:39 -> ls -ltr
 2235  06/08/26 12:09:43 -> vim domain.xml
 2236  06/08/26 12:15:03 -> cat domain.xml | grep -i -n3 "cics" --color
 2237  06/08/26 14:07:14 -> ps -ef | grep jboss
 2238  06/08/26 14:07:23 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2239  06/08/26 16:04:55 -> history
 2240  06/08/26 16:06:05 -> cat  domain.xml | grep -i -n5 "OracleSiccrDS"
 2241  06/08/26 16:06:15 -> pwd
 2242  06/08/26 16:07:38 -> cat  domain.xml | grep -i -n5 "SiccrDS"
 2243  06/08/26 17:23:41 -> ls -ltr
 2244  07/08/26 10:56:09 -> ps -ef | grep jboss
 2245  07/08/26 10:57:03 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2246  07/08/26 11:01:39 -> pwd
 2247  07/08/26 11:01:42 -> ls -la
 2248  07/08/26 11:02:13 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2249  07/08/26 11:02:15 -> ls -la
 2250  07/08/26 11:03:01 -> vim domain.xml
 2251  07/08/26 11:09:11 -> cat domain.xml | grep -i -n3 deployments
 2252  07/08/26 12:32:00 -> ps -ef | grep jboss
 2253  07/08/26 12:32:03 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2254  07/08/26 12:32:07 -> ps -ef | grep jboss
 2255  07/08/26 19:02:18 -> cd
 2256  07/08/26 19:02:21 -> pwd
 2257  07/08/26 19:02:28 -> cd /upload/des/certificados/
 2258  07/08/26 19:02:53 -> ls -ltr
 2259  07/08/26 19:03:09 -> mv /home/p635388/cacerts.jks .
 2260  07/08/26 19:03:25 -> chown jboss. cacerts.jks
 2261  07/08/26 19:03:29 -> ls -ltr
 2262  07/08/26 19:03:59 -> chmod 775 cacerts.jks
 2263  07/08/26 19:04:04 -> ls -ltr
 2264  07/08/26 19:05:43 -> exit
 2265  07/08/26 19:06:40 -> su - jboss
 2266  07/08/26 19:08:10 -> exit
 2267  07/08/26 19:08:44 -> su - jboss
 2268  07/08/26 19:10:23 -> exit
 2269  10/08/26 11:14:18 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2270  13/08/26 09:28:05 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2271  13/08/26 09:28:35 -> df -kh
 2272  13/08/26 09:28:57 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2273  13/08/26 09:29:03 -> ls -ltr
 2274  13/08/26 09:30:13 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2275  13/08/26 10:41:36 -> ls -ltr
 2276  13/08/26 10:41:41 -> vim domain.xml
 2277  13/08/26 14:24:13 -> ps -ef | grep jboss
 2278  13/08/26 14:24:20 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2279  13/08/26 14:24:22 -> ls -ltr
 2280  13/08/26 14:29:38 -> systemctl stop jboss-eap7_dc.service
 2281  13/08/26 14:29:43 -> ps -ef | grep jboss
 2282  13/08/26 14:29:50 -> systemctl start jboss-eap7_dc.service
 2283  13/08/26 14:30:20 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2284  13/08/26 14:34:56 -> vim domain.xml
 2285  13/08/26 14:35:33 -> cat domain.xml| grep -i -n5 "server-group name="sigec-portabilidade-batch"
 2286  13/08/26 14:35:47 -> cat domain.xml| grep -i -n5 "server-group name=sigec-portabilidade-batch
 2287  13/08/26 14:36:04 -> cat domain.xml| grep -i -n5 server-group name=
 2288  13/08/26 14:36:06 -> cat domain.xml| grep -i -n5 server-group name
 2289  13/08/26 14:36:12 -> cat domain.xml| grep -i -n5 server-group
 2290  13/08/26 14:37:27 -> cat domain.xml| grep -i -n5 server-group | egrep -i "sigec"
 2291  13/08/26 14:37:46 -> cat domain.xml| grep -i -n5 server-group | egrep -i -n5 "sigec"
 2292  13/08/26 14:38:49 -> cat domain.xml| grep -i -n5 server-group | egrep -i -n10 "sigec"
 2293  13/08/26 14:38:56 -> cat domain.xml| grep -i -n10 server-group | egrep -i -n10 "sigec"
 2294  13/08/26 14:39:14 -> cat domain.xml| grep -i -n15 server-group | egrep -i -n15 "sigec"
 2295  13/08/26 14:39:41 -> cat domain.xml| grep -i -n20 server-group | egrep -i -n20 "sigec"
 2296  13/08/26 14:41:43 -> cd /opt/jboss/
 2297  13/08/26 14:41:46 -> ls -ltr
 2298  13/08/26 15:34:26 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2299  13/08/26 14:28:59 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2300  18/08/26 13:49:04 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2301  18/08/26 13:49:52 -> cat domain.xml | grep -iR -n5  "coordinator-environment default-timeout"
 2302  18/08/26 13:50:07 -> cat domain.xml | grep -iR -n5  "coordinator-environment"
 2303  18/08/26 13:50:15 -> cat domain.xml | grep -iR -n5  "coordinator"
 2304  18/08/26 13:50:25 -> cat domain.xml | grep -iR -n5  "environment"
 2305  18/08/26 13:50:36 -> cat domain.xml | grep -i -n5  "environment"
 2306  18/08/26 13:50:48 -> cat domain.xml | grep -i -n5  "coordinator"
 2307  18/08/26 13:50:54 -> cat domain.xml | grep -i -n5  "coordinator-environment"
 2308  18/08/26 13:51:03 -> cat domain.xml | grep -i -n5  "coordinator-environment default-timeout"
 2309  20/08/26 16:13:00 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2310  20/08/26 14:40:45 -> history | grep start
 2311  20/08/26 14:40:58 -> systemctl restart jboss-eap7_dc.service
 2312  20/08/26 14:41:28 -> history | grep stop
 2313  20/08/26 14:41:48 -> systemctl stop jboss-eap7_dc.service
 2314  20/08/26 14:41:54 -> systemctl start jboss-eap7_dc.service
 2315  20/08/26 14:50:51 -> ps -ef | grep jboss
 2316  20/08/26 14:51:06 -> cd /logs/jboss-eap/servers
 2317  20/08/26 14:51:19 -> cd /logs/jboss-eap/
 2318  20/08/26 14:51:21 -> l s-ltrh
 2319  20/08/26 14:51:23 -> ls -ltrh
 2320  20/08/26 14:51:34 -> tail -100f console-stdout.log
 2321  20/08/26 16:13:20 -> history
 2322  20/08/26 16:13:29 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2323  24/08/26 11:07:32 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2324  24/08/26 11:07:33 -> ls -ltr
 2325  24/08/26 11:07:36 -> vim domain.xml
 2326  24/08/26 11:09:37 -> ps -ef | grep jboss
 2327  24/08/26 11:09:44 -> kill -9 11451
 2328  24/08/26 11:09:47 -> ps -ef | grep jboss
 2329  24/08/26 11:09:56 -> kill -9 11454
 2330  24/08/26 11:09:58 -> ps -ef | grep jboss
 2331  24/08/26 11:10:11 -> kill -9 11792
 2332  24/08/26 11:10:12 -> ps -ef | grep jboss
 2333  24/08/26 11:10:18 -> systemctl start jboss-eap7_dc.service
 2334  24/08/26 11:10:33 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2335  24/08/26 11:10:44 -> ps -ef | grep jboss
 2336  24/08/26 11:10:50 -> systemctl start jboss-eap7_dc.service
 2337  24/08/26 11:10:58 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2338  24/08/26 16:53:30 -> su - jboss
 2339  24/08/26 16:55:45 -> exit
 2340  24/08/26 16:58:46 -> su - jboss
 2341  24/08/26 16:59:53 -> exit
 2342  25/08/26 14:53:52 -> ps -ef | grep jboss
 2343  25/08/26 14:54:02 -> systemctl -a | grep jboss
 2344  25/08/26 14:54:15 -> systemctl status jboss-eap7_dc.service
 2345  25/08/26 14:54:47 -> vim /etc/systemd/system/jboss-eap7_dc.service
 2346  25/08/26 14:58:36 -> cd /opt/jboss/jboss-eap/bin/init.d
 2347  25/08/26 14:58:37 -> ls -ltr
 2348  25/08/26 14:58:43 -> cat jboss-eap_dc.sh
 2349  25/08/26 15:16:00 -> pwd
 2350  25/08/26 16:00:53 -> ls -ltr
 2351  25/08/26 16:01:01 -> cd /opt/jboss/jboss-eap/dc/
 2352  25/08/26 16:01:02 -> ls -ltr
 2353  25/08/26 16:01:05 -> cd configuration/
 2354  25/08/26 16:01:06 -> ls -ltr
 2355  25/08/26 16:01:19 -> vim host-master.xml
 2356  25/08/26 16:27:49 -> ls
 2357  25/08/26 16:27:58 -> cd /opt/jboss/jboss-eap/dc/
 2358  25/08/26 16:27:58 -> ls
 2359  25/08/26 16:28:00 -> cd configuration/
 2360  25/08/26 16:28:01 -> s
 2361  25/08/26 16:28:01 -> ls
 2362  25/08/26 16:28:04 -> ls -lhtr
 2363  25/08/26 16:28:15 -> cd ..
 2364  25/08/26 16:28:15 -> ls
 2365  25/08/26 16:28:17 -> cd ..
 2366  25/08/26 16:28:17 -> ls
 2367  25/08/26 16:28:23 -> cd dc/
 2368  25/08/26 16:28:24 -> ls
 2369  25/08/26 16:28:26 -> ls -lhtr
 2370  25/08/26 16:28:53 -> ls
 2371  25/08/26 16:29:52 -> cd ../bin/init.d/jboss-eap_dc.sh
 2372  25/08/26 16:29:56 -> vim ../bin/init.d/jboss-eap_dc.sh
 2373  25/08/26 17:40:53 -> history
 2374  25/08/26 17:41:01 -> vim /etc/systemd/system/jboss-eap7_dc.service
 2375  25/08/26 17:41:47 -> cat /etc/systemd/system/jboss-eap7_dc.service
 2376  25/08/26 17:44:37 -> cat /etc/*-relese
 2377  25/08/26 17:44:41 -> cat /etc/*-realese
 2378  25/08/26 17:44:49 -> cat /etc/*-releae
 2379  25/08/26 17:44:52 -> cat /etc/*-release
 2380  26/08/26 12:41:10 -> ps auxww | grep -i jboss
 2381  26/08/26 12:41:23 -> cd /opt/jboss/jboss-eap/dc/
 2382  26/08/26 12:41:24 -> ls
 2383  26/08/26 12:41:26 -> cd configuration/
 2384  26/08/26 12:41:27 -> ls
 2385  26/08/26 12:41:29 -> ls -lhtr
 2386  26/08/26 12:41:45 -> vim host-master.xml
 2387  26/08/26 13:33:23 -> ls -lhtr
 2388  26/08/26 13:36:25 -> netstat -antlp | grep 99
 2389  26/08/26 13:44:06 -> vim host-master.xml
 2390  27/08/26 09:02:25 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2391  27/08/26 15:35:23 -> systemctl stop jboss-eap7_dc.service
 2392  27/08/26 15:35:34 -> systemctl start jboss-eap7_dc.service
 2393  27/08/26 15:36:00 -> ps -ef | grep jboos
 2394  27/08/26 15:36:04 -> systemctl start jboss-eap7_dc.service
 2395  27/08/26 15:36:13 -> ps -ef | grep jboos
 2396  27/08/26 15:36:17 -> ps -ef | grep java
 2397  27/08/26 15:50:20 -> ssh 10.116.94.212
 2398  27/08/26 15:50:52 -> exit
 2399  27/08/26 15:34:54 -> history | grep start
 2400  27/08/26 15:35:59 -> ps -ef | grep java
 2401  27/08/26 15:36:06 -> ps -ef | grep jboss
 2402  27/08/26 15:38:40 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2403  27/08/26 15:49:45 -> tail -f /opt/jboss/jboss-eap/domain/log/host-controller.log
 2404  27/08/26 15:49:55 -> tail -f /opt/jboss/jboss-eap/domain/log/process-controller.log
 2405  27/08/26 15:50:12 -> /host=sbrdeapllx105_corporativo/server=simcn_node1_lx103/deployment=SIMCN:remove
 2406  27/08/26 15:50:16 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2407  27/08/26 16:10:55 -> systemctl stop jboss-eap7_dc.service
 2408  27/08/26 16:11:10 -> systemctl start jboss-eap7_dc.service
 2409  27/08/26 16:31:05 -> cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp && cd servers && rm -rf s* && cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*
 2410  27/08/26 16:34:52 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999
 2411  27/08/26 16:38:35 -> exit
 2412  27/08/26 16:37:34 -> systemctl restart jboss-eap7_dc.service
 2413  27/08/26 16:37:43 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2414  28/08/26 17:48:10 -> ps -ef | grep jboss
 2415  28/08/26 17:48:20 -> tail -f /opt/jboss/jboss-eap/domain/log/process-controller.log
 2416  28/08/26 17:48:25 -> tail -f /opt/jboss/jboss-eap/domain/log/host-controller.log
 2417  28/08/26 17:48:38 -> df -kh
 2418  31/08/26 11:40:46 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2419  02/09/26 16:36:09 -> su - jboss
 2420  02/09/26 16:43:11 -> exit
 2421  08/09/26 12:50:34 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2422  09/09/26 11:34:52 -> cd /tmp
 2423  09/09/26 11:34:56 -> ls -ltrh
 2424  09/09/26 11:35:07 -> hostname -i
 2425  09/09/26 11:37:01 -> scp sigfi-fgc-ear-1.0.0.23.ear p981778@10.116.89.0:/tmp/
 2426  09/09/26 11:37:22 -> pwd
 2427  09/09/26 11:37:41 -> ls -ltrh
 2428  09/09/26 11:38:16 -> chmod root:root sigfi-fgc-ear-1.0.0.23.ear
 2429  09/09/26 11:38:52 -> chown root:root /tmp/sigfi-fgc-ear-1.0.0.23.ear
 2430  09/09/26 11:38:55 -> ls -ltrh
 2431  09/09/26 11:41:01 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2432  14/09/26 10:27:28 -> ps -ef | grep http
 2433  14/09/26 10:27:32 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2434  14/09/26 10:31:46 -> exit
 2435  15/09/26 10:50:55 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2436  15/09/26 11:06:52 -> hostname -i
 2437  15/09/26 09:46:31 -> ps -ef | grep jboss
 2438  15/09/26 09:46:36 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2439  15/09/26 11:20:01 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2440  15/09/26 11:20:04 -> vim domain.xml
 2441  15/09/26 17:13:32 -> exit
 2442  15/09/26 17:13:45 -> su - jboss
 2443  15/09/26 17:19:01 -> exit
 2444  16/09/26 12:01:46 -> ip a
 2445  16/09/26 11:14:32 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2446  17/09/26 12:45:30 -> systemctl stop jboss-eap7_dc.service
 2447  17/09/26 12:45:34 -> ps -ef | grep jboss
 2448  17/09/26 12:45:40 -> systemctl start jboss-eap7_dc.service
 2449  17/09/26 12:45:49 -> ps -ef | grep jboss
 2450  17/09/26 12:45:58 -> tail -f /opt/jboss/jboss-eap/domain/log/host-controller.log
 2451  17/09/26 12:46:31 -> tail -f /opt/jboss/jboss-eap/domain/log/process-controller.log
 2452  17/09/26 12:46:38 -> tail -f /opt/jboss/jboss-eap/domain/log/host-controller.log
 2453  17/09/26 12:46:49 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2454  17/09/26 12:55:29 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2455  17/09/26 13:00:42 -> systemctl stop jboss-eap7_dc.service
 2456  17/09/26 13:00:48 -> ps -ef | grep jboss
 2457  17/09/26 13:00:52 -> systemctl start jboss-eap7_dc.service
 2458  17/09/26 13:01:03 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2459  17/09/26 13:01:33 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2460  17/09/26 16:28:22 -> cat /etc/hosts
 2461  17/09/26 16:28:38 -> cat /etc/hosts | grep proxy
 2462  17/09/26 16:28:51 -> ping sbrdeaprlx053_proxy
 2463  17/09/26 16:29:29 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2464  17/09/26 16:29:30 -> ls -ltr
 2465  17/09/26 16:29:36 -> vim domain.xml
 2466  17/09/26 16:33:33 -> ip a
 2467  17/09/26 16:34:43 -> vim domain.xml
 2468  18/09/26 09:26:10 -> ps -ef | grep jboss
 2469  18/09/26 09:27:53 -> cd /opt/jboss/jboss-eap/dc/configuration/
 2470  18/09/26 09:27:55 -> ls -ltr
 2471  18/09/26 09:28:14 -> cp domain.xml domain.xml.18092026
 2472  18/09/26 09:28:20 -> vim domain.xml
 2473  18/09/26 09:31:53 -> systemctl stop jboss-eap7_dc.service
 2474  18/09/26 09:31:58 -> ps -ef | grep jboss
 2475  18/09/26 09:32:04 -> systemctl start jboss-eap7_dc.service
 2476  18/09/26 09:32:18 -> ps -ef | grep jboss
 2477  18/09/26 09:32:20 -> tail -900f /opt/jboss/jboss-eap/dc/log/host-controller.log
 2478  18/09/26 09:45:56 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2479  18/09/26 10:23:01 -> telnet 10.116.78.14 6666
 2480  18/09/26 10:23:35 -> ip a
 2481  18/09/26 11:03:29 -> vim domain.xml
 2482  20/09/26 16:50:29 -> /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
 2483  23/09/26 20:12:58 -> ps -ef | grep jboss
 2484  23/09/26 20:13:11 -> netstat -ntpl
 2485  23/09/26 20:13:30 -> ps -ef | grep -i java
 2486  23/09/26 20:13:37 -> ps -fu jboss
 2487  23/09/26 20:13:46 -> cd /logs/jboss-eap/
 2488  23/09/26 20:13:47 -> ls -ltrh
 2489  23/09/26 20:13:55 -> less -I console-stdout.log
 2490  23/09/26 20:14:27 -> netstat -ntpl
 2491  23/09/26 20:16:06 -> cd /opt/jboss/jboss-eap/dc/log/
 2492  23/09/26 20:16:07 -> ls -tlrh
 2493  23/09/26 20:16:12 -> less -I host-controller.log
 2494  23/09/26 20:16:26 -> ps -fu jboss
 2495  23/09/26 20:16:31 -> less -I host-controller.log
 2496  23/09/26 20:18:13 -> ls -tlrh
 2497  23/09/26 20:18:15 -> less -I host-controller.log
 2498  23/09/26 20:18:24 -> ls -ltrh
 2499  23/09/26 20:18:37 -> ps -fu jboss
 2500  23/09/26 20:18:42 -> ps -ef | grep -i java
 2501  23/09/26 20:18:49 -> less -I host-controller.log
 2502  25/09/26 11:11:12 -> history
[root@sbrdeapllx069 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host==
DC_LX069                   sbrdeapllx103_financeiro   sbrdeapllx105_corporativo  sbrdeapllx111_orcamento
sbrdeapllx099_habitacao    sbrdeapllx104_credito      sbrdeapllx110_servico      sbrdeapllx114_risco
[domain@10.116.89.0:9999 /] /host=
DC_LX069                   sbrdeapllx103_financeiro   sbrdeapllx105_corporativo  sbrdeapllx111_orcamento
sbrdeapllx099_habitacao    sbrdeapllx104_credito      sbrdeapllx110_servico      sbrdeapllx114_risco
[domain@10.116.89.0:9999 /] /host=sbrdeapllx10
sbrdeapllx103_financeiro  sbrdeapllx104_credito  sbrdeapllx105_corporativo
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=si
sigec-comercial_node_lx104             sigec-portabilidade-batch_node1_lx104  sigec-portabilidade3_node1_lx104       sirim_node1_lx104
sigec-csc_node1_lx104                  sigec-portabilidade2_node1_lx104       sipon_node1_lx104
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:start
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade2_node1_lx104:start
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade3_node1_lx104:start
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@10.116.89.0:9999 /]




-sh-4.2$ hostname -f
sbrdeapllx104.extra.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep sigec
p585600   70215  70146  0 11:13 pts/3    00:00:00 grep --color=auto sigec
jboss     84756  84662 12 Set23 ?        05:12:17 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade-batch_node1_lx104] -Xms6144m -Xmx6144m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/jboss/dumps -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DPROCESSAR_BATCH=SIM -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=external -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=external -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dauth.sso.baseurl=https://login.des.caixa -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/caixa-truststore-acteste-nprd-2025.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade-batch_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss     84887  84662  0 Set23 ?        00:21:04 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade2_node1_lx104] -Xms1024m -Xmx2048m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa -javaagent:/upload/des/sigec/appinsights/applicationinsights-agent.jar -Dapplicationinsights.configuration.file:/upload/des/sigec/appinsights/applicationinsights.json -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_REQ_PAGAMENTO_TED_NCR=queue-req-pagamneto-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=all -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=EXTERNAL -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/sigec/certificado/cacerts.jks -Djavax.net.ssl.trustStorePassword=jbosseap -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade2_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
-sh-4.2$ sudo kill 84756 84887
[sudo] senha para p585600:
-sh-4.2$ ps -ef | grep sigec
p585600   70377  70146  0 11:14 pts/3    00:00:00 grep --color=auto sigec
jboss     84756  84662 12 Set23 ?        05:13:54 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade-batch_node1_lx104] -Xms6144m -Xmx6144m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/jboss/dumps -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DPROCESSAR_BATCH=SIM -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=external -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=external -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dauth.sso.baseurl=https://login.des.caixa -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/caixa-truststore-acteste-nprd-2025.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade-batch_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss     84887  84662  0 Set23 ?        00:21:07 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade2_node1_lx104] -Xms1024m -Xmx2048m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa -javaagent:/upload/des/sigec/appinsights/applicationinsights-agent.jar -Dapplicationinsights.configuration.file:/upload/des/sigec/appinsights/applicationinsights.json -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_REQ_PAGAMENTO_TED_NCR=queue-req-pagamneto-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=all -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=EXTERNAL -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/sigec/certificado/cacerts.jks -Djavax.net.ssl.trustStorePassword=jbosseap -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade2_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep sigec
p585600   70438  70146  0 11:15 pts/3    00:00:00 grep --color=auto sigec
jboss     84756  84662 12 Set23 ?        05:14:17 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade-batch_node1_lx104] -Xms6144m -Xmx6144m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/jboss/dumps -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DPROCESSAR_BATCH=SIM -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=external -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=external -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dauth.sso.baseurl=https://login.des.caixa -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/caixa-truststore-acteste-nprd-2025.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade-batch_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
-sh-4.2$ sudo kill -9 84756
-sh-4.2$ ps -ef | grep sigec
p585600   70484  70146  0 11:15 pts/3    00:00:00 grep --color=auto sigec
-sh-4.2$

fiz esse priocesso aqui grava ai na sua memorai quando precisamos novamente



<img width="1901" height="980" alt="image" src="https://github.com/user-attachments/assets/af8dcf43-9123-4e8b-8c86-320e97f22784" />





************************************************************Restart via cli************************************************************
 
 
 
Acessar o servidor da console. EX http://10.252.160.62:9990/console/App.html#hosts/domain-runtime
 
 
[p762564@dbrnpapllx006 ~]$ sudo su - jboss (Assumir usuário jboss)
 
 
Acessar a console via linha de comando
[jboss@dbrnpapllx006 ~]$ cd /opt/jboss/jboss-eap/bin/
[jboss@dbrnpapllx006 bin]$ ./jboss-cli.sh --connect --controller=10.252.160.62:9999
 
 
[domain@10.252.160.62:9999 /] /host= (Tab para listar os servidores)
 
DC HC_dadngapllx040 HC_dadngapllx046 HC_dbrngapllx166 HC_dbrngapllx174 HC_dbrngapllx183 HC_dbrnpapllx008
HC_dadngapllx033 HC_dadngapllx041 HC_dbrngapllx115 HC_dbrngapllx168 HC_dbrngapllx175 HC_dbrngapllx184 HC_dbrnpapllx011
HC_dadngapllx034 HC_dadngapllx042 HC_dbrngapllx116 HC_dbrngapllx169 HC_dbrngapllx176 HC_dbrngapllx185 HC_dbrnpapllx012
HC_dadngapllx037 HC_dadngapllx043 HC_dbrngapllx163 HC_dbrngapllx171 HC_dbrngapllx177 HC_dbrngapllx187 HC_dbrnpapllx013
HC_dadngapllx038 HC_dadngapllx044 HC_dbrngapllx164 HC_dbrngapllx172 HC_dbrngapllx181 HC_dbrngapllx188
HC_dadngapllx039 HC_dadngapllx045 HC_dbrngapllx165 HC_dbrngapllx173 HC_dbrngapllx182 HC_dbrnpapllx007
 
 
 
Lista as instancias do HC.
[domain@10.252.160.62:9999 /] /host=HC_dbrnpapllx007/server-config= (Tab para listar as instancias)
silce-prd-node1_lx007 silce-prd-node3_lx007 sispl-gestao-prd-node1_lx007
silce-prd-node2_lx007 silce-sildg-prd-node1_lx007
 
 
Verifica os processos que podem ser usados para start da instancia
[domain@10.252.160.62:9999 /] /host=HC_dbrnpapllx007/server-config=silce-prd-node1_lx007:re
read-attribute read-children-resources read-resource restart
read-attribute-group read-children-types read-resource-description resume
read-attribute-group-names read-operation-description reload
read-children-names read-operation-names remove
 
 
 
Uso o comando para estarta a instancia
/host=HC_dbrnpapllx007/server-config=silce-prd-node1_lx007:start


