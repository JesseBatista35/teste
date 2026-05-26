last -F | head -30 && \
echo "==HISTORICO ALTERACOES CONF==" && \
stat /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf && \
echo "==BASH HISTORY ROOT==" && \
cat /root/.bash_history | grep -i "sigpf\|balancer\|member\|vi \|nano \|echo " | tail -50


grep -i "sigpf\|httpd\|apache" /var/log/secure | tail -30
