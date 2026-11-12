\mv -f /log_jboss/config-log4j/XXX_INTERNET_XML_XXX /log_jboss/config-log4j/sigsj_internet.xml
chown jboss:jboss /log_jboss/config-log4j/sigsj_internet.xml
chmod 644 /log_jboss/config-log4j/sigsj_internet.xml
ls -la /log_jboss/config-log4j/
grep 'File' /log_jboss/config-log4j/sigsj_internet.xml
