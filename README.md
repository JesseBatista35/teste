oc exec -it sipgc-api-seguranca-des-122-hws7p -n sipgc-des -- ls -la /usr/src/app/secrets_files/SIPGC_DES/

oc exec -it sipgc-api-seguranca-des-122-hws7p -n sipgc-des -- sh -c "for f in /usr/src/app/secrets_files/SIPGC_DES/*; do echo \"== \$f ==\"; done"

