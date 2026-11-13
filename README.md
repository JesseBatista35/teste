No 6.4 (10.116.88.20): Keycloak do ccr-api em cada profile
sudo awk '/<profile name=/{p=$0} /secure-deployment name="ccr-api/{s=1; print NR": "p} s && /<realm>|<resource>|auth-server-url|bearer-only/{print NR":   "$0} s && /<\/secure-deployment>/{s=0}' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed 's/^ *//' | cut -c1-150
No 6.4: versão do CCR em cada grupo
sudo grep -n -E 'deployment name="SIFEC-CCR[0-9]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml

O que procurar:
