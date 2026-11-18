grep -n -A30 'jdbc/IdmsSiapxDS' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vE '<password>|<user-name>' | head -60
