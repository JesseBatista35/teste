oc exec siinp-nucleo-des-335-cgvt7 -n siinp-des -- ls -la /usr/src/app/secrets_files/SIINP_DES/
oc get dc siinp-nucleo-des -n siinp-des -o yaml | grep -iA1 CONFIG_CASE
oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA1 CONFIG_CASE
