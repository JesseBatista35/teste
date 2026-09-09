
-sh-4.2$
-sh-4.2$ cat /proc/sys/kernel/pid_max
131072
-sh-4.2$ find / -maxdepth 4 -iname 'jboss-eap*' 2>/dev/null
/logs/jboss-eap
/opt/jboss/jboss-eap
/etc/systemd/system/jboss-eap7_hc.service
/upload/jboss6.3/jboss-eap-6.3.tar
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss/ 2>/dev/null
total 10157340
drwxr-xr-x   3 jboss jboss          34 Ago 17 16:23 .
drwxr-xr-x. 12 root  root         4096 Mar 31 12:10 ..
-rw-------   1 jboss jboss 10401087488 Ago 17 15:22 dumps
drwxr-xr-x  18 jboss jboss        4096 Set  2 12:04 jboss-eap
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# cat /etc/security/limits.conf
# /etc/security/limits.conf
#
#This file sets the resource limits for the users logged in via PAM.
#It does not affect resource limits of the system services.
#
#Also note that configuration files in /etc/security/limits.d directory,
#which are read in alphabetical order, override the settings in this
#file in case the domain is the same or more specific.
#That means for example that setting a limit for wildcard domain here
#can be overriden with a wildcard setting in a config file in the
#subdirectory, but a user specific setting here can be overriden only
#with a user specific setting in the subdirectory.
#
#Each line describes a limit for a user in the form:
#
#<domain>        <type>  <item>  <value>
#
#Where:
#<domain> can be:
#        - a user name
#        - a group name, with @group syntax
#        - the wildcard *, for default entry
#        - the wildcard %, can be also used with %group syntax,
#                 for maxlogin limit
#
#<type> can have the two values:
#        - "soft" for enforcing the soft limits
#        - "hard" for enforcing hard limits
#
#<item> can be one of the following:
#        - core - limits the core file size (KB)
#        - data - max data size (KB)
#        - fsize - maximum filesize (KB)
#        - memlock - max locked-in-memory address space (KB)
#        - nofile - max number of open file descriptors
#        - rss - max resident set size (KB)
#        - stack - max stack size (KB)
#        - cpu - max CPU time (MIN)
#        - nproc - max number of processes
#        - as - address space limit (KB)
#        - maxlogins - max number of logins for this user
#        - maxsyslogins - max number of logins on the system
#        - priority - the priority to run user process with
#        - locks - max number of file locks the user can hold
#        - sigpending - max number of pending signals
#        - msgqueue - max memory used by POSIX message queues (bytes)
#        - nice - max nice priority allowed to raise to values: [-20, 19]
#        - rtprio - max realtime priority
#
#<domain>      <type>  <item>         <value>
#

#*               soft    core            0
#*               hard    rss             10000
#@student        hard    nproc           20
#@faculty        soft    nproc           20
#@faculty        hard    nproc           50
#ftp             hard    nproc           0
#@student        -       maxlogins       4

# End of file
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ls /etc/security/limits.d/
20-nproc.conf
[root@sbrdeapllx104 p585600]# cat /etc/security/limits.d/*.conf 2>/dev/null
# Default limit for number of user's processes to prevent
# accidental fork bombs.
# See rhbz #432903 for reasoning.

*          soft    nproc     4096
root       soft    nproc     unlimited
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# dmesg -T | grep -i -E 'oom|kill' | tail -30
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# journalctl -k --since "today" | grep -i oom
[root@sbrdeapllx104 p585600]# free -h
              total        used        free      shared  buff/cache   available
Mem:            11G        787M        8,0G        164M        2,7G         10G
Swap:          4,0G        402M        3,6G
[root@sbrdeapllx104 p585600]# ps -eLf | wc -l
510
[root@sbrdeapllx104 p585600]#
