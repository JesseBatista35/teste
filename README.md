grep -n -A1 -E 'deployment name="SIFEC-CCR[0-9]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'deployment name|sha1'
