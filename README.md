  ls /desenvolvimento/rotina/ 2>/dev/null; ls -d /opt/*/ 2>/dev/null
  grep -il siafr /etc/fstab /opt/*/ -r 2>/dev/null | head
