-sh-4.1$ ps aux | grep nginx
p585600  14805  0.0  0.0 103328   888 pts/1    S+   15:04   0:00 grep nginx
root     23664  0.0  0.0  46980   972 ?        Ss   May21   0:00 nginx: master process /usr/sbin/nginx -c /etc/nginx/nginx.conf
nginx    23665  0.0  0.0  48360  3624 ?        S    May21   1:28 nginx: worker process
-sh-4.1$ sudo nginx -t
nginx: the configuration file /etc/nginx/nginx.conf syntax is ok
nginx: configuration file /etc/nginx/nginx.conf test is successful
-sh-4.1$ sudo grep -r "sigct_backend" /etc/nginx/
-sh-4.1$ sudo tail -f/var/log/nginx/error.log
[sudo] password for p585600:
tail: invalid option -- '/'
Experimente "tail --help" para mais informações.
-sh-4.1$ sudo tail -f/var/log/nginx/access.log
tail: invalid option -- '/'
Experimente "tail --help" para mais informações.
-sh-4.1$
