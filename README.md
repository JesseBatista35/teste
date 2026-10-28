cd /opt/jboss-eap/standalone/deployments
\mv -f sirotcon-ejb.jar* /tmp/bkp_sirotcon/
ls -l
rm -f sigsj_intranet-ear.ear.failed
touch sigsj_intranet-ear.ear.dodeploy
sleep 40; ls -l
