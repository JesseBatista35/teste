last -F | grep "May 13\|Mai 13" && \
echo "==QUEM MODIFICOU==" && \
find /var/log/ -name "*.log" -newer /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf 2>/dev/null | head -10
