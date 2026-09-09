systemctl show jboss-eap7_hc -p LimitNPROC -p LimitNOFILE -p User -p PAMName

ls -la /etc/systemd/system/jboss-eap7_hc.service.d/ 2>/dev/null
cat /etc/systemd/system/jboss-eap7_hc.service.d/*.conf 2>/dev/null

cat /etc/systemd/system/jboss-eap7_hc.service | grep -i user

# limite real do processo que está rodando (ou do último PID se já caiu, pegue via journalctl)
systemctl status jboss-eap7_hc
