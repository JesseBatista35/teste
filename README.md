oc set env dc/sifap-centralizadora-backend-intranet-des -n sifap-des --list | grep -i ministerio
oc get secret -n sifap-des | grep -i sifap
