Beleza. Quando a release terminar, confirme no host (como root):

grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
export CONTROLM=/opt/ctmage/ctm LD_LIBRARY_PATH=/opt/ctmage/ctm/exe PATH=/opt/ctmage/ctm/scripts:/opt/ctmage/ctm/exe:$PATH
ag_ping
