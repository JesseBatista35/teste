timeout 3 bash -c "</dev/tcp/10.116.84.154/18007" && echo OK || echo FALHA

/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
cp -p /opt/ctmage/ctm/data/CONFIG.dat /opt/ctmage/ctm/data/CONFIG.dat.bkp.$(date +%Y%m%d%H%M)

cd /opt/ctmage/ctm/data
sed -i -E 's/^(CTMSHOST\s+).*/\1sspdeaprlx0028/'      CONFIG.dat
sed -i -E 's/^(CTMPERMHOSTS\s+).*/\1sspdeaprlx0028/'  CONFIG.dat
sed -i -E 's/^(ATCMNDATA\s+).*/\118007/'               CONFIG.dat
sed -i -E 's/^(AGCMNDATA\s+).*/\118008/'               CONFIG.dat

grep -E "CTMSHOST|CTMPERMHOSTS|AGCMNDATA|ATCMNDATA|LOGICAL_AGENT_NAME" CONFIG.dat

sed -i -E 's/^(LOGICAL_AGENT_NAME\s+).*/\1caddeapllx2695/' CONFIG.dat

/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
ss -lntp | grep 18008
su - ctmagelx -c "ag_diag_comm"
