[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# timeout 5 bash -c "</dev/tcp/10.116.99.99/7015" && echo OK || echo FALHA
bash: connect: Conexão recusada
bash: linha 1: /dev/tcp/10.116.99.99/7015: Conexão recusada
FALHA
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# timeout 5 bash -c "</dev/tcp/10.116.99.100/7015" && echo OK || echo FALHA
bash: connect: Conexão recusada
bash: linha 1: /dev/tcp/10.116.99.100/7015: Conexão recusada
FALHA
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cp -p /etc/hosts /etc/hosts.bkp.$(date +%Y%m%d%H%M)
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# sed -i -E 's/^#(10\.116\.99\.(99|100)\s+crjdeaprlx03[89])/\1/' /etc/hosts
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
10.116.99.99    crjdeaprlx038
10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
10.116.99.99    crjdeaprlx038
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
Killing Control-M/Agent Listener pid:1143116
1 seconds - 1143116 is still alive
2 seconds - 1143116 is still alive
3 seconds - 1143116 is still alive
4 seconds - 1143116 is still alive
2026-09-28 12:53:54 Listener process stopped
Killing Control-M/Agent Tracker pid:1143182
2026-09-28 12:53:55 Tracker process stopped
Killing Control-M/Agent Java Process pid:1142950
1 seconds - 1142950 is still alive
2 seconds - 1142950 is still alive
2026-09-28 12:53:58 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.

Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created.
..
Control-M/Agent Agent Java Process started. pid: 1169228

Control-M/Agent Listener started. pid: 1169402

Control-M/Agent Tracker started. pid: 1169468


Control-M/Agent started successfully.
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ss -lntp | grep 7016
LISTEN 0      300          0.0.0.0:7016       0.0.0.0:*    users:(("java",pid=1169228,fd=233))                                                                                                      
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 12:54:29

Control-M/Agent Communication Diagnostic Report
-----------------------------------------------

 Agent User Name                       : ctmagelx
 Agent Directory                       : /opt/ctmage/ctm
 Agent Platform Architecture           : Linux 5.14.0-362.8.1.el9_3.x86_64 #1 SMP PREEMPT_DYNAMIC Tue Oct 3 11:12:36 EDT 2023 x86_64
 Agent Version                         : 9.0.21.200
 Agent Host Name                       : caddeapllx2695.agil.nprd.caixa.gov.br
 Logical Agent Name                    : caddeapllx2695.agil.nprd.caixa.gov.br
 Server-Agent Protocol Version         : 12
 Listen to Network Interface           : *ANY
 Server Host Name                      : crjdeaprlx038
 Authorized Servers Host Names         : crjdeaprlx038|crjdeaprlx039
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 7016
 Agent-to-Server Port Number           : 7015
 Server-Agent Connection mode          : Transient (by Java)
  Agent router internal ports          :  AR-AG=7036, AR-AT=16559, AR-UT=34091
 System ping to Server Platform        : Succeeded
^C
Sessão terminada, matando o shell... ...morto.

[root@caddeapllx2695 p585600]# journalctl --since "2026-09-26 11:26" --until "2026-09-26 11:40" --no-pager | grep -oE "ansible-[a-z_]+ Invoked with.{0,160}" | grep -iE "hosts|ctm|blockinfile|service|systemd|command"
ansible-command Invoked with _uses_shell=True _raw_params=systemctl restart chronyd warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=None
ansible-command Invoked with _uses_shell=True _raw_params=sysctl -p warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=None removes=None st
ansible-command Invoked with _uses_shell=True _raw_params=tuned-adm profile throughput-performance warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=No
ansible-command Invoked with _uses_shell=True _raw_params=subscription-manager identity warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=
ansible-command Invoked with _uses_shell=True _raw_params=subscription-manager repos --enable=CEF_Zabbix_Zabbix_6_REDHAT_9 warn=True stdin_add_newline=True strip_empty_ends=True argv=None
ansible-file Invoked with _original_basename=.gitignore owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False follo
ansible-file Invoked with _original_basename=README.md owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False follow
ansible-file Invoked with _original_basename=.git/description owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False
ansible-copy Invoked with remote_src=False _original_basename=.git/HEAD follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-17
ansible-copy Invoked with remote_src=False _original_basename=.git/config follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-
ansible-copy Invoked with remote_src=False _original_basename=.git/FETCH_HEAD follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tmp/ansible-
ansible-copy Invoked with remote_src=False _original_basename=.git/index follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-1
ansible-file Invoked with _original_basename=.git/hooks/applypatch-msg.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/con
ansible-file Invoked with _original_basename=.git/hooks/commit-msg.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/
ansible-file Invoked with _original_basename=.git/hooks/post-update.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config
ansible-file Invoked with _original_basename=.git/hooks/pre-applypatch.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/con
ansible-file Invoked with _original_basename=.git/hooks/pre-commit.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/
ansible-file Invoked with _original_basename=.git/hooks/pre-push.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ f
ansible-file Invoked with _original_basename=.git/hooks/pre-receive.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config
ansible-file Invoked with _original_basename=.git/hooks/update.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ for
ansible-file Invoked with _original_basename=.git/hooks/fsmonitor-watchman.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch
ansible-file Invoked with _original_basename=.git/hooks/pre-rebase.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/
ansible-file Invoked with _original_basename=.git/hooks/prepare-commit-msg.sample owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch
ansible-file Invoked with _original_basename=.git/info/exclude owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=Fals
ansible-file Invoked with _original_basename=.git/refs/remotes/origin/1944d8e8-revert-from-fix_auto_tnsnames.ora owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse
ansible-file Invoked with _original_basename=.git/refs/remotes/origin/8daf163e-revert-from-fix_auto_tnsnames.ora owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse
ansible-file Invoked with _original_basename=.git/refs/remotes/origin/develop owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/con
ansible-file Invoked with _original_basename=.git/refs/remotes/origin/fix_auto_tnsnames.ora owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=
ansible-copy Invoked with remote_src=False _original_basename=.git/refs/remotes/origin/main follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansibl
ansible-copy Invoked with remote_src=False _original_basename=.git/objects/pack/pack-2bc3a65dab5ecc8aba4e54acb2259ed578ce00f5.pack follow=False owner=ctmagelx group=controlm dest=/opt/b
ansible-copy Invoked with remote_src=False _original_basename=.git/objects/pack/pack-2bc3a65dab5ecc8aba4e54acb2259ed578ce00f5.idx follow=False owner=ctmagelx group=controlm dest=/opt/ba
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/HEAD follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tmp/ansible-t
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/refs/remotes/origin/1944d8e8-revert-from-fix_auto_tnsnames.ora follow=False owner=ctmagelx group=controlm dest=/o
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/refs/remotes/origin/8daf163e-revert-from-fix_auto_tnsnames.ora follow=False owner=ctmagelx group=controlm dest=/o
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/refs/remotes/origin/develop follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/refs/remotes/origin/fix_auto_tnsnames.ora follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=
ansible-copy Invoked with remote_src=False _original_basename=.git/logs/refs/remotes/origin/main follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.a
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/etc/hosts-des get_md5=False get_mime=True get_attributes=True
ansible-file Invoked with _original_basename=etc/hosts-des owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False fo
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/etc/hosts-hmp get_md5=False get_mime=True get_attributes=True
ansible-file Invoked with _original_basename=etc/hosts-hmp owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False fo
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/etc/hosts-tqs get_md5=False get_mime=True get_attributes=True
ansible-file Invoked with _original_basename=etc/hosts-tqs owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch/config/ force=False fo
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/scripts_ctm/env_config.sh get_md5=False get_mime=True get_attributes=True
ansible-copy Invoked with remote_src=False _original_basename=scripts_ctm/env_config.sh follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/tm
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/scripts_ctm/executa-job.sh get_md5=False get_mime=True get_attributes=True
ansible-copy Invoked with remote_src=False _original_basename=scripts_ctm/executa-job.sh follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.ansible/t
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/batch/config/scripts_ctm/configuration/custom.sh get_md5=False get_mime=True get_attributes=Tr
ansible-copy Invoked with remote_src=False _original_basename=scripts_ctm/configuration/custom.sh follow=False owner=ctmagelx group=controlm dest=/opt/batch/config/ src=/home/sansbp01/.
ansible-file Invoked with _original_basename=securefiles/caixa-truststore2023.jks owner=ctmagelx group=controlm state=file dest=/opt/batch/config/ recurse=False mode=502 path=/opt/batch
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%H%M.%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/etc recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%H%M.%S
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/scripts_ctm recurse=False mode=None force=False follow=True modification_time_format=%Y%m%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/securefiles recurse=False mode=None force=False follow=True modification_time_format=%Y%m%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/branches recurse=False mode=None force=False follow=True modification_time_format=%Y%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/hooks recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/info recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/refs recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/objects recurse=False mode=None force=False follow=True modification_time_format=%Y%m
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/logs recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/refs/heads recurse=False mode=None force=False follow=True modification_time_format=%
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/refs/tags recurse=False mode=None force=False follow=True modification_time_format=%Y
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/refs/remotes recurse=False mode=None force=False follow=True modification_time_format
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/refs/remotes/origin recurse=False mode=None force=False follow=True modification_time
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/objects/pack recurse=False mode=None force=False follow=True modification_time_format
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/objects/info recurse=False mode=None force=False follow=True modification_time_format
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/logs/refs recurse=False mode=None force=False follow=True modification_time_format=%Y
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/logs/refs/remotes recurse=False mode=None force=False follow=True modification_time_f
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/.git/logs/refs/remotes/origin recurse=False mode=None force=False follow=True modification
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/opt/batch/config/scripts_ctm/configuration recurse=False mode=None force=False follow=True modification_tim
ansible-file Invoked with state=absent path=/opt/batch/config/scripts_ctm recurse=False force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_time_format=%Y%m%d%H%M.%S _
ansible-command Invoked with _uses_shell=True _raw_params=temp=`basename "http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siifx/caixinhas/siifx-caixinhas-batch/0.0.7-SNAPSHOT/s
ansible-file Invoked with force=True _original_basename=siifx-caixinhas-batch-0.0.7-20260922.183950-1.jar owner=ctmagelx group=controlm state=file dest=/opt/batch/deploy/siifx-caixinhas
ansible-file Invoked with _original_basename=caixa-truststore-acteste-nprd.jks owner=ctmagelx group=controlm state=file dest=/opt/batch/securefiles/. recurse=False mode=420 path=/opt/ba
ansible-file Invoked with _original_basename=caixa-truststore-acteste-nprd.jks owner=ctmagelx group=controlm state=file dest=/opt/batch/securefiles/. recurse=False mode=420 path=/opt/ba
ansible-command Invoked with _uses_shell=True _raw_params=echo '[{"NFS_ENDPOINT_ISILON": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH","NFS_MOUNT_POINT_ISILON": "/
ansible-command Invoked with _raw_params=rpm -ivh --relocate /usr=/opt/networker http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm warn=True _uses_shell=False stdin_add_newline=Tr
ansible-command Invoked with _raw_params=rpm -ivh --relocate /usr=/opt/networker http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm warn=True _uses_shell=False stdin_add_newline=Tr
ansible-setup Invoked with filter=ansible_service_mgr gather_subset=['!all'] gather_timeout=10 fact_path=/etc/ansible/facts.d
ansible-systemd Invoked with name=networker.service enabled=True state=started daemon_reload=False daemon_reexec=False no_block=False force=None masked=None user=None scope=None
ansible-command Invoked with _raw_params=/opt/networker/bin/nsrports -S 7937-8057 warn=True _uses_shell=False stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=N
ansible-command Invoked with _raw_params=systemctl restart networker warn=True _uses_shell=False stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=N
ansible-command Invoked with _raw_params=rpm -ivh --relocate /usr=/opt/networker http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm warn=True _uses_shell=False stdin_add_newline=Tr
ansible-command Invoked with _raw_params=rpm -ivh --relocate /usr=/opt/networker http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm warn=True _uses_shell=False stdin_add_newline=Tr
ansible-setup Invoked with filter=ansible_service_mgr gather_subset=['!all'] gather_timeout=10 fact_path=/etc/ansible/facts.d
ansible-systemd Invoked with name=networker.service enabled=True state=started daemon_reload=False daemon_reexec=False no_block=False force=None masked=None user=None scope=None
ansible-command Invoked with _raw_params=/opt/networker/bin/nsrports -S 7937-8057 warn=True _uses_shell=False stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=N
ansible-command Invoked with _raw_params=systemctl restart networker warn=True _uses_shell=False stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=N
ansible-blockinfile Invoked with create=True state=present path=/etc/hosts block=#10.116.99.99        crjdeaprlx038
ansible-stat Invoked with path=/opt/ctmage follow=False get_md5=False get_checksum=True get_mime=True get_attributes=True checksum_algorithm=sha1
ansible-command Invoked with _uses_shell=True _raw_params=/tmp/add-user.sh warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None creates=None removes=
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/ctmage/.bash_profile get_md5=False get_mime=True get_attributes=True
ansible-file Invoked with _original_basename=bash_profile owner=ctmagelx group=controlm state=file dest=/opt/ctmage/.bash_profile recurse=False mode=0755 path=/opt/ctmage/.bash_profile
ansible-file Invoked with group=controlm state=directory mode=0755 owner=ctmagelx path=/producao/ recurse=False force=False follow=True modification_time_format=%Y%m%d%H%M.%S access_tim
ansible-copy Invoked with _original_basename=env_config.sh follow=False owner=ctmagelx group=controlm dest=/producao/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-1790432909.24-65097-247
ansible-copy Invoked with _original_basename=executa-job.sh follow=False owner=ctmagelx group=controlm dest=/producao/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-1790432909.24-65097-24
ansible-copy Invoked with _original_basename=configuration/custom.sh follow=False owner=ctmagelx group=controlm dest=/producao/ src=/home/sansbp01/.ansible/tmp/ansible-tmp-1790432909.24
ansible-file Invoked with owner=ctmagelx group=controlm state=directory path=/producao/configuration recurse=False mode=None force=False follow=True modification_time_format=%Y%m%d%H%M.
ansible-command Invoked with _uses_shell=True _raw_params=/producao//configuration/custom.sh warn=True stdin_add_newline=True strip_empty_ends=True argv=None chdir=None executable=None cre
ansible-stat Invoked with checksum_algorithm=sha1 get_checksum=True follow=False path=/opt/ctmage/ctm/data/CONFIG.dat get_md5=False get_mime=True get_attributes=True
ansible-copy Invoked with src=/home/sansbp01/.ansible/tmp/ansible-tmp-1790432911.69-65148-148765162088249/source dest=/opt/ctmage/ctm/data/CONFIG.dat checksum=279160800e6b1cc95bb911c999
ansible-systemd Invoked with name=controlm_agent.service enabled=True state=restarted daemon_reload=False daemon_reexec=False no_block=False force=None masked=None user=None scope=None
[root@caddeapllx2695 p585600]#
