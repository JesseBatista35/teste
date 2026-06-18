# EXECUTE ESSES (não precisa de registry):

oc delete pods --field-selector=status.phase=Failed -n build-images-ads

oc delete pods --field-selector=status.phase=Succeeded -n build-images-ads

oc delete builds -n build-images-ads --field-selector=status=Failed
