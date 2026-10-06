grep -n -A40 "Obter credencial" /opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml | grep -E "stepName|<cookies|<headers|URLPath|WSheaders" | head
