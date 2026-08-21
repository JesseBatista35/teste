sudo grep "p515324" /var/log/secure | grep "Aug 21 1[45]:"

sudo ausearch -f /opt/keystore -ts today 2>&1 | grep -E "type=PATH|uid=|exe="

sudo find /home -maxdepth 2 -user p515324 -name ".bash_history" -exec sudo cat {} \; 2>/dev/null | grep -i "keystore\|cert\|4570"
