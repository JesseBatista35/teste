oc exec siinp-nucleo-tqs-651-w6hhb -c siinp-nucleo-tqs -n siinp-tqs -- ls -la /usr/src/app/secrets_files/
oc exec siinp-nucleo-tqs-651-w6hhb -c siinp-nucleo-tqs -n siinp-tqs -- env | grep -i SMALLRYE
