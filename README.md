
[sudo] password for spssodr1:
,Sorry, try again.
[sudo] password for spssodr1:
sudo: 1 incorrect password attempt
[spssodr1@crjtqapllx036 bin]$ exit
logout
[root@crjtqapllx036 p585600]# ^C
[root@crjtqapllx036 p585600]# sudo chown -R spssodr1:singlesignon /infra_app/logs/siset/
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# ps - ef | grep jboss
error: garbage option

Usage:
 ps [options]

 Try 'ps --help <simple|list|output|threads|misc|all>'
  or 'ps --help <s|l|o|t|m|a>'
 for additional help text.

For more details see ps(1).
[root@crjtqapllx036 p585600]# ps -ef | grep jboss
root     128369 126891  0 11:06 pts/1    00:00:00 grep --color=auto jboss
[root@crjtqapllx036 p585600]#
