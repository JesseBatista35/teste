oc exec siinp-nucleo-tqs-654-fr4q8 -n siinp-tqs -- ls -la /usr/src/app/secrets_files/SIINP_TQS/
oc logs siinp-nucleo-tqs-654-fr4q8 -n siinp-tqs | grep -i "Failed to load config"
