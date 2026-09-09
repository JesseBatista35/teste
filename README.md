[root@sbrdeapllx104 servers]# df -h /opt/jboss
Sist. Arq.                       Tam. Usado Disp. Uso% Montado em
/dev/mapper/VG_PRINCIPAL-LV_OPT   20G   14G  6,6G  68% /opt
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# mount | grep -E "opt|jboss"
/dev/mapper/VG_PRINCIPAL-LV_OPT on /opt type xfs (rw,relatime,attr2,inode64,noquota)
10.116.95.13:/export/jboss_modules64 on /opt/jboss/jboss-eap/modules type nfs4 (rw,relatime,vers=4.1,rsize=262144,wsize=262144,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=10.116.94.211,local_lock=none,addr=10.116.95.13)
[root@sbrdeapllx104 servers]# ]
bash: ]: comando não encontrado
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# dmesg -T | grep -i -E "error|fail|i/o" | tail -30
[Qui Set  3 17:57:02 2026] pci 0000:00:17.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.2: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.3: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.4: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.5: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.5: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.4: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.3: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:18.2: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.5: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.4: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:17.3: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:16.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:16.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:16.5: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:16.4: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:16.3: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:15.7: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:15.6: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:15.5: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:15.4: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:02 2026] pci 0000:00:15.3: BAR 13: failed to assign [io  size 0x1000]
[Qui Set  3 17:57:04 2026] systemd-sysv-generator[4558]: stat() failed on /etc/rc.d/init.d/dsmcad: No such file or directory
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# cat /var/log/messages | grep -i -E "error|i/o error" | tail -30
Sep  9 18:58:14 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:00:01 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:01:48 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:03:35 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:05:23 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:07:10 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:08:57 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:10:44 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:12:31 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:14:18 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:16:05 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:17:52 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:19:39 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:21:26 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:23:13 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:25:00 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:26:47 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:28:35 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:30:22 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:32:09 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:33:56 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:35:43 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:37:30 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:39:17 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:41:04 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:42:51 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:44:38 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:46:25 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:48:12 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
Sep  9 19:50:00 sbrdeapllx104 goferd: [ERROR][worker-0] gofer.messaging.adapter.connect:33 - connect: proton+amqps://cadsvitrlx319.intra.caixa.gov.br:5647, failed: Connection amqps://cadsvitrlx319.intra.caixa.gov.br:5647 disconnected: Condition('proton.pythonio', 'Connection refused to all addresses')
[root@sbrdeapllx104 servers]#
