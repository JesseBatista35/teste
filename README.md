  cd /opt/ctmage/ctm/data
  sed -i -E 's/^(LOGICAL_AGENT_NAME\s+).*/\1caddeapllx2695.agil.nprd.caixa.gov.br/' CONFIG.dat
  /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
  /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL


  grep -E "ORDERNO|orderno=[^,]|SUBMIT|JOB" /opt/ctmage/ctm/proclog/AG_*.log | grep -v "orderno=," | tail -20
