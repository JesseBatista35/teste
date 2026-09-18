ps -ef | grep httpd
netstat -tlnp | grep 6666    # ou: ss -tlnp | grep 6666
tail -f /etc/httpd/logs/.../error_log
