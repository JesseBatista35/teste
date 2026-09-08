 ls -l /proc/709283/cmdline | tr '\0' ' '; echo
tr '\0' ' ' < /proc/709283/cmdline; echo


ls -l /proc/709283/fd | grep -i log


