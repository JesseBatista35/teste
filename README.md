Para confirmar, roda:
bashoc describe imagestream sisgf-backend -n build-images-ads
ou
bashoc get imagestream sisgf-backend -o yaml -n build-images-ads | grep -A 5 "docker:"
