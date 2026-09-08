oc get pods -n istio-system 2>/dev/null | grep -i egress
oc get virtualservice,destinationrule,serviceentry -n siecm-des
oc get serviceentry -A | grep -i sigaq
