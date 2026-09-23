diff \
  <(oc set env dc/sicbp-avaliarisco-backend-des --list -n sicbp-des | sed 's/^# //' | awk -F'[= ]' '{print $1}' | sort -u) \
  <(oc set env dc/sicbp-avaliarisco-backend-tqs --list -n sicbp-tqs | sed 's/^# //' | awk -F'[= ]' '{print $1}' | sort -u)

  oc set env dc/sicbp-avaliarisco-backend-tqs ENABLE_SWAGGER=FALSE -n sicbp-tqs

  
