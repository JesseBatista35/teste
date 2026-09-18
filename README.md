
tail: no files remaining
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]# grep -iE "errorlog|customlog" /etc/httpd/httpd_eap_des_64.conf
ErrorLog /logs/apache2/httpd_eap_des_64/error.log
        CustomLog /logs/apache2/httpd_eap_des_64/access.log combined
        ErrorLog /logs/apache2/httpd_eap_des_64/error.log
[root@sbrdeaprlx0002 p585600]#




(No info could be read for "-p": geteuid()=10585600 but you should be root.)
tcp        0      0 10.116.84.136:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.84.149:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.84.220:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.85.250:6666          0.0.0.0:*                   LISTEN      -
tcp        0      0 10.116.98.48:6666           0.0.0.0:*                   LISTEN      -
-sh-4.1$ tail -f /etc/httpd/logs/.../error_log
tail: cannot open `/etc/httpd/logs/.../error_log' for reading: Permission denied
tail: no files remaining
-sh-4.1$ grep -iE "errorlog|customlog" /etc/httpd/httpd_eap_des_64.conf
ErrorLog /logs/apache2/httpd_eap_des_64/error.log
        CustomLog /logs/apache2/httpd_eap_des_64/access.log combined
        ErrorLog /logs/apache2/httpd_eap_des_64/error.log
-sh-4.1$
-sh-4.1$
-sh-4.1$
