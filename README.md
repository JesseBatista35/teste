ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1)

ls -lrt /opt/ctmage/ctm/proclog/ | grep -i "AI_" | tail -5
grep -ih "IIFX\|Back End\|Failed" /opt/ctmage/ctm/proclog/AI_*.log 2>/dev/null | tail -30

ls -laR /opt/ctmage/ctm/cm/AI/apps-repo/
ls -la /opt/ctmage/ctm/cm/AI/data/
head -40 /opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
