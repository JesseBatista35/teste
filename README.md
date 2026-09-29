oc get template apache24-https-caixa-release -n openshift -o yaml | grep -iE "image|Listen|health|targetPort|registry" | head -30
