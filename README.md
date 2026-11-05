grep -oE 'deployment name="[^"]*" runtime-name="sifec-cdt[^"]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sort -u
