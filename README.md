ps -ef | grep -i java | grep -v grep | grep -oE "trustStorePassword[^ ]*" | sort -u


AP=/opt/ctmage/ctm/cm/AI/data/security/apcerts
cp -p $AP $AP.bkp.$(date +%Y%m%d%H%M)

/opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-apl -file /tmp/ac_interna_apl.pem -keystore $AP -storepass appass
/opt/ctmage/JRE/bin/keytool -list -keystore $AP -storepass appass 2>/dev/null | grep -i "ac-interna"

chown ctmagelx:ctmagelx $AP
ls -la $AP

/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL

cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"
