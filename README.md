essa exclui

oc get configmaps nginx-conf-d-$(REPOSITORIO) -n $(PROJETO)-$(AMBIENTE)
if [ "$?" -ne "1" ]; then
oc delete configmap nginx-conf-d-$(REPOSITORIO)  -n $(PROJETO)-$(AMBIENTE)
fi


essa cria

oc create configmap nginx-conf-d-$(REPOSITORIO)  --from-file="$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)-config/$(PROJETO)-nginx.conf" -n $(PROJETO)-$(AMBIENTE)
