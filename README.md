timeout 5 bash -c "</dev/tcp/10.116.99.99/7015" && echo OK || echo FALHA
timeout 5 bash -c "</dev/tcp/10.116.99.100/7015" && echo OK || echo FALHA

cp -p /etc/hosts /etc/hosts.bkp.$(date +%Y%m%d%H%M)
sed -i -E 's/^#(10\.116\.99\.(99|100)\s+crjdeaprlx03[89])/\1/' /etc/hosts
cat /etc/hosts
getent hosts crjdeaprlx038 crjdeaprlx039

/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
ss -lntp | grep 7016
su - ctmagelx -c "ag_diag_comm"

journalctl --since "2026-09-26 11:26" --until "2026-09-26 11:40" --no-pager | grep -oE "ansible-[a-z_]+ Invoked with.{0,160}" | grep -iE "hosts|ctm|blockinfile|service|systemd|command"
