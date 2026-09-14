oc rsh siinp-nucleo-des-292-nflpk -n siinp-des ls -la /usr/src/app/secrets_files/siinp_des/

# se o pod cair rápido demais pro rsh funcionar, sobe um pod de debug com a mesma spec:
oc debug dc/siinp-nucleo-des -n siinp-des -- ls -la /usr/src/app/secrets_files/siinp_des/


oc get dc siinp-nucleo-des -n siinp-des -o yaml | grep -A15 "volumeMounts\|volumes:"
