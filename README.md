# portas reais (AGCMNDATA = server->agent, ATCMNDATA = agent->server)
grep -E "AGCMNDATA|ATCMNDATA|CTMSHOST" $CONTROLM/data/CONFIG.dat

# o sspdeaprlx0028 responde em quais portas?
for p in 7005 7006 7015 7016; do timeout 3 bash -c "</dev/tcp/10.116.84.154/$p" 2>/dev/null && echo "10.116.84.154:$p ABERTA"; done

exit
/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
su - ctmagelx -c "ag_diag_comm"

