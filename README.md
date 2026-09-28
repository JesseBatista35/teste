/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
ss -lntp | grep 7016
su - ctmagelx -c "ag_diag_comm"
