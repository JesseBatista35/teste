1. Validar no caddeapllx2501 (como root)

grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
grep -iE "cxextrlx038|crjdeaprlx" /etc/hosts
systemctl status controlm_agent.service --no-pager | head -5
export CONTROLM=/opt/ctmage/ctm LD_LIBRARY_PATH=/opt/ctmage/ctm/exe PATH=/opt/ctmage/ctm/scripts:/opt/ctmage/ctm/exe:$PATH
ag_ping
