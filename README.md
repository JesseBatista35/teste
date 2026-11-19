
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# find / -name "*SenhasSIIBC*" 2>/dev/null
/prod/load/ran/tpc/lib/libSenhasSIIBC.so
/prod/load/ran/tpc/lib/libSenhasSIIBC_Linux64.so



^C
[root@sspdeapllx0039 p585600]# ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
java.library.path=/prod/load/ran/tpc/lib
java.library.path=/prod/load/ran/tpc/lib
[root@sspdeapllx0039 p585600]#
