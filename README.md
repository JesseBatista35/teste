find / -xdev -type f -newermt "2026-09-26 11:20" ! -newermt "2026-09-26 11:40" 2>/dev/null | grep -vE "^/(proc|sys|run)"


find / -xdev \( -name "*~" -o -name "*.bak*" -o -name "*.bkp*" -o -name "*.orig" -o -name "*.old" -o -name "*.rpmsave" -o -name "*@*~" \) -newermt "2026-06-01" 2>/dev/null | grep -vE "^/(proc|sys)"
ls -la /opt/ctmage/ctm/data/ | grep -i config

grep "Sep 26 11:[12]" /var/log/secure* /var/log/messages* 2>/dev/null | head -50
journalctl --since "2026-09-26 11:15" --until "2026-09-26 11:45" --no-pager | head -100

ls -d /usr/openv /opt/commvault /opt/tivoli /opt/veeam 2>/dev/null
systemctl list-units --all | grep -iE "netbackup|commvault|dsm|veeam|bacula"

  ssh 10.116.201.113 "cat /etc/hosts; ls -la /opt/ctmage/ctm/data/CONFIG.dat"
