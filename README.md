oc rsh -n sinep-tqs sinep-arquivos-tqs-22-qqgk7 \
  bash -c 'timeout 3 bash -c "</dev/tcp/10.192.224.100/1415" && echo ABERTA || echo FECHADA'

  oc rsh -n sinep-tqs sinep-arquivos-tqs-22-qqgk7 \
  curl -v --connect-timeout 3 telnet://10.192.224.100:1415
