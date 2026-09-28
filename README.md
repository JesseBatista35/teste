cd /opt/ctmage/ctm/proclog
ls -lt *.log | head -10
tail -f $(ls -t AG_*.log | head -1)


ps -ef | grep -E "executa-job|siifx" | grep -v grep
