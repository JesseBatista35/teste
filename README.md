[p585600@caddeapllx2560 opt]$ ls -la /etc/cron.d/ | grep -iE "sig|siccp"
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ls -la /opt/ctmage/
total 40
drwxr-xr-x   9 ctmagelx ctmagelx  324 jun 10 13:49 .
drwxr-xr-x.  6 root     root       61 jun 10 13:49 ..
-rwxr-xr-x   1 ctmagelx controlm  328 jun 10 13:49 .bash_profile
-rw-r--r--   1 ctmagelx ctmagelx   90 set 24  2025 .bash_profile.nodejscli
-rw-r--r--   1 ctmagelx ctmagelx   28 set 24  2025 .bashrc
drwxr-xr-x   5 ctmagelx ctmagelx  187 set 24  2025 BMCINSTALL
drwxrwxr-x   3 ctmagelx ctmagelx   37 set 24  2025 bmcnode
drwxr-xr-x   3 ctmagelx ctmagelx   24 set 24  2025 bmcperl
drwxr-xr-x   3 ctmagelx ctmagelx   17 set 24  2025 .cache
-rw-r--r--   1 ctmagelx ctmagelx  376 set 24  2025 .cshrc
-rwxr-xr-x   1 ctmagelx ctmagelx  429 set  3  2023 .cshrc.back
-rw-r--r--   1 ctmagelx ctmagelx   91 set 24  2025 .cshrc.nodejscli
drwxr-xr-x  25 ctmagelx ctmagelx 4096 set 24  2025 ctm
drwxrwxr-x   3 ctmagelx ctmagelx   50 set 24  2025 ctm_cli
-rw-------   1 ctmagelx ctmagelx 1364 set 24  2025 .history
-rwxr--r--   1 ctmagelx ctmagelx    0 set 24  2025 .hushlogin
-rw-r--r--   1 ctmagelx ctmagelx  846 set 24  2025 installed-versions.txt
drwxr-xr-x   6 ctmagelx ctmagelx   68 abr 18  2025 JRE
-rwxr-xr-x   1 ctmagelx ctmagelx   11 set 24  2025 .profile
-rw-r--r--   1 ctmagelx ctmagelx    0 set 24  2025 VERSION
[p585600@caddeapllx2560 opt]$ ps -ef | grep -i ctm
p585600   738637  738498  0 11:25 pts/0    00:00:00 grep --color=auto -i ctm
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ id ctmagelx
uid=20003596(ctmagelx) gid=20000299(ctmagelx) grupos=20000299(ctmagelx),30000018(controlm)
[p585600@caddeapllx2560 opt]$ grep -rl "sigdb" /opt/batch/ 2>/dev/null
/opt/batch/config/.git/index
/opt/batch/config/.git/objects/pack/pack-fa95367f0a6c91804aaa3515b2044fcc8ad75134.pack
/opt/batch/config/.git/objects/pack/pack-ec55eca11f4180222b3d4f4b94ccb53250b7d9fe.pack
/opt/batch/config/.git/objects/pack/pack-d1e559aa56c26dfba85bf545c7b219663f181007.pack
/opt/batch/config/.git/objects/pack/pack-35923738548ec1a4ce53d21b563d3b8e06b87954.pack
/opt/batch/config/sigdb/sigdb
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
