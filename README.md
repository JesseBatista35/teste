[root@caddeapllx1945 bin]# sudo su
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]# tail -200 /opt/jboss-eap/standalone/log/server.log
tail: não foi possível abrir '/opt/jboss-eap/standalone/log/server.log' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx1945 bin]# cd ..
[root@caddeapllx1945 jboss-eap]# cd ..
[root@caddeapllx1945 opt]# cd ..
[root@caddeapllx1945 /]# tail -200 /opt/jboss-eap/standalone/log/server.log
tail: não foi possível abrir '/opt/jboss-eap/standalone/log/server.log' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# cat /opt/jboss-eap/standalone/log/server.log | tail -200
cat: /opt/jboss-eap/standalone/log/server.log: Arquivo ou diretório inexistente
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# ls -la /opt/jboss-eap/standalone/log/
total 20
drwxr-xr-x 2 root  root    94 jun 16 14:25 .
drwxrwxr-x 8 jboss jboss   91 jun 16 11:47 ..
-rw-r--r-- 1 root  root     0 jun 16 11:47 audit.log
-rw-r--r-- 1 root  root  5638 jun 16 14:24 backupgc.log.current
-rw-r--r-- 1 root  root  5641 jun 16 14:25 gc.log.0.current
-rw-r--r-- 1 root  root  1378 jun 16 14:25 startup.log
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# df -kh /opt
Sist. Arq.                       Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_OPT   10G  1,5G  8,5G  15% /opt
[root@caddeapllx1945 /]# df -h /opt
Sist. Arq.                       Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_OPT   10G  1,5G  8,5G  15% /opt
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# dmesg | tail -50
[    3.501748] XFS (sda1): Mounting V5 Filesystem
[    3.501877] XFS (dm-5): Mounting V5 Filesystem
[    3.521989] XFS (dm-3): Ending clean mount
[    3.534122] XFS (dm-4): Ending clean mount
[    3.535411] XFS (dm-2): Ending clean mount
[    3.542737] systemd-journald[622]: Received client request to flush runtime journal.
[    3.561939] XFS (dm-5): Ending clean mount
[    3.709396] XFS (sda1): Ending clean mount
[    3.912377] NET: Registered PF_VSOCK protocol family
[    4.003562] vmxnet3 0000:0b:00.0 ens192: intr type 3, mode 0, 3 vectors allocated
[    4.004715] vmxnet3 0000:0b:00.0 ens192: NIC Link is Up 10000 Mbps
[    4.007516] vmxnet3 0000:13:00.0 ens224: intr type 3, mode 0, 3 vectors allocated
[    4.008594] vmxnet3 0000:13:00.0 ens224: NIC Link is Up 10000 Mbps
[    4.452931] block dm-4: the capability attribute has been deprecated.
[   46.122317] systemd-rc-local-generator[1512]: /etc/rc.d/rc.local is not marked executable, skipping.
[  164.258722] systemd-rc-local-generator[1951]: /etc/rc.d/rc.local is not marked executable, skipping.
[  175.772672] systemd-rc-local-generator[2237]: /etc/rc.d/rc.local is not marked executable, skipping.
[  402.179751] systemd-rc-local-generator[3691]: /etc/rc.d/rc.local is not marked executable, skipping.
[  405.969273] systemd-rc-local-generator[4684]: /etc/rc.d/rc.local is not marked executable, skipping.
[  406.113851] systemd-rc-local-generator[4713]: /etc/rc.d/rc.local is not marked executable, skipping.
[  417.590034] systemd-rc-local-generator[5302]: /etc/rc.d/rc.local is not marked executable, skipping.
[  452.411145] systemd[1]: systemd 252-18.el9 running in system mode (+PAM +AUDIT +SELINUX -APPARMOR +IMA +SMACK +SECCOMP +GCRYPT +GNUTLS +OPENSSL +ACL +BLKID +CURL +ELFUTILS -FIDO2 +IDN2 -IDN -IPTC +KMOD +LIBCRYPTSETUP +LIBFDISK +PCRE2 -PWQUALITY +P11KIT -QRENCODE +TPM2 +BZIP2 +LZ4 +XZ +ZLIB +ZSTD -BPF_FRAMEWORK +XKBCOMMON +UTMP +SYSVINIT default-hierarchy=unified)
[  452.411191] systemd[1]: Detected virtualization vmware.
[  452.411194] systemd[1]: Detected architecture x86-64.
[  452.430477] systemd-rc-local-generator[7716]: /etc/rc.d/rc.local is not marked executable, skipping.
[  454.879401] systemd-rc-local-generator[7767]: /etc/rc.d/rc.local is not marked executable, skipping.
[  482.906299] Warning: Deprecated Driver is detected: nft_compat will not be maintained in a future major release and may be disabled
[  486.883300] systemd-rc-local-generator[10587]: /etc/rc.d/rc.local is not marked executable, skipping.
[  497.390843] systemd-rc-local-generator[12319]: /etc/rc.d/rc.local is not marked executable, skipping.
[  519.355157] systemd-rc-local-generator[13403]: /etc/rc.d/rc.local is not marked executable, skipping.
[  521.438229] systemd-rc-local-generator[13450]: /etc/rc.d/rc.local is not marked executable, skipping.
[  521.589586] systemd-rc-local-generator[13481]: /etc/rc.d/rc.local is not marked executable, skipping.
[  523.569461] systemd-rc-local-generator[13536]: /etc/rc.d/rc.local is not marked executable, skipping.
[  523.690570] RPC: Registered named UNIX socket transport module.
[  523.690572] RPC: Registered udp transport module.
[  523.690572] RPC: Registered tcp transport module.
[  523.690573] RPC: Registered tcp NFSv4.1 backchannel transport module.
[  523.801946] systemd-rc-local-generator[13594]: /etc/rc.d/rc.local is not marked executable, skipping.
[  524.155749] systemd-rc-local-generator[13640]: /etc/rc.d/rc.local is not marked executable, skipping.
[  529.294606] systemd-rc-local-generator[14528]: /etc/rc.d/rc.local is not marked executable, skipping.
[  529.419239] systemd-rc-local-generator[14551]: /etc/rc.d/rc.local is not marked executable, skipping.
[  544.902001] FS-Cache: Loaded
[  544.902548] systemd-journald[622]: Field hash table of /run/log/journal/e78fc5d43482431abcdd1cccc0bdfc8e/system.journal has a fill level at 75.1 (250 of 333 items), suggesting rotation.
[  544.902550] systemd-journald[622]: /run/log/journal/e78fc5d43482431abcdd1cccc0bdfc8e/system.journal: Journal header limits reached or header out-of-date, rotating.
[  544.952840] Key type dns_resolver registered
[  545.070980] NFS: Registering the id_resolver key type
[  545.070985] Key type id_resolver registered
[  545.070986] Key type id_legacy registered
[  584.374578] systemd-rc-local-generator[18954]: /etc/rc.d/rc.local is not marked executable, skipping.
[  597.439428] systemd-rc-local-generator[19563]: /etc/rc.d/rc.local is not marked executable, skipping.
[root@caddeapllx1945 /]#
