**tr '\0' ' ' < /proc/750315/cmdline; echo

lsof -p 750315 | grep -i -E "conf|log"


ls -l /proc/750315/fd | grep -i log
**
