
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# systemctl list-units --all | grep -iE "ctm|control"
  sys-devices-pci0000:00-0000:00:16.0-0000:0b:00.0-net-ens192.device                                             loaded    active     plugged      VMXNET3 Ethernet Controller
  sys-subsystem-net-devices-ens192.device                                                                        loaded    active     plugged      VMXNET3 Ethernet Controller
  sys-fs-fuse-connections.mount                                                                                  loaded    active     mounted      FUSE Control File System
  controlm_agent.service                                                                                         loaded    active     running      Control-M Agent
  systemd-udevd-control.socket                                                                                   loaded    active     running      udev Control Socket
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
