ls -la /opt/ctmage/ctm/cm/AI/
find /opt/ctmage/ctm/cm/AI -maxdepth 4 -iname "*IIFX*" 2>/dev/null
grep -ril "IIFX" /opt/ctmage/ctm/cm/AI --include=*.xml 2>/dev/null | head

ls -lrt /opt/ctmage/ctm/cm/AI/proclog/ 2>/dev/null | tail -5
grep -rih "IIFX\|Back End" /opt/ctmage/ctm/cm/AI/proclog/ 2>/dev/null | tail -20
