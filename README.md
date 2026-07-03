awk 'NR>27940 && /ERROR/' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | head -5


awk 'NR>27940 && /ERROR/{print NR; exit}' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log

sed -n 'N,N+80p' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
