Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Task groups
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
Task groups

NFS_OKD

Tasks

History

References
Task group : NFS_OKD
Version
Properties
Name
NFS_OKD
Description
Montagem de NFS em Deployment Config no OKD
Category
Parameters
NameDefault valueDescription
AMBIENTE
$(AMBIENTE)
ambiente
PATH_DESTINO
$(PATH_DESTINO)
PATH_NFS
$(PATH_NFS)
Endpoint: Diretório compartilhado no Storage/Servidor. Ex: /ifs/SSPDEARMVD1/ESTEIRA_AGIL
PROJETO
$(PROJETO)
nome do sistema. Ex.:  SINCH 
REPOSITORIO
$(REPOSITORIO)
nome do módulodo projeto. Ex.: sinch-api
SERVER_NFS
$(SERVER_NFS)
fqdn do servidor do storage
SIZE_VOLUME
$(SIZE_VOLUME)
tamanho do storage
Showing filters 1 through 1

# Cria o  arquivo yaml do PV
cat <<EOF > jboss-pv.yaml
apiVersion: v1
kind: PersistentVolume
metadata:
  annotations:
    pv.kubernetes.io/bound-by-controller: "yes"
  finalizers:
  - kubernetes.io/pv-protection
  name: $(REPOSITORIO)-data-$(AMBIENTE)
  labels:
    app: $(REPOSITORIO)-$(AMBIENTE)
spec:
  accessModes:
  - ReadWriteMany
  capacity:
    storage: $(SIZE_VOLUME)
  nfs:
    path: $(PATH_NFS)
    server: $(SERVER_NFS)
  persistentVolumeReclaimPolicy: Retain
EOF

cat $(System.DefaultWorkingDirectory)/jboss-pv.yaml





oc get pv/$(REPOSITORIO)-data-$(AMBIENTE)
if [ "$?" -ne "0" ]; then
oc create -f $(System.DefaultWorkingDirectory)/jboss-pv.yaml
fi


# Cria o  arquivo yaml do PVC
cat <<EOF > jboss-pvc.yaml
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  annotations:
  finalizers:
  - kubernetes.io/pvc-protection
  name: $(REPOSITORIO)-data-$(AMBIENTE)
  namespace: $(PROJETO)-$(AMBIENTE)
spec:
  accessModes:
  - ReadWriteMany
  resources:
    requests:
      storage: $(SIZE_VOLUME)
  storageClassName: ""
  volumeName: $(REPOSITORIO)-data-$(AMBIENTE)
  selector:
    matchLabels:
      app: $(REPOSITORIO)-$(AMBIENTE)-esteiras
EOF

cat $(System.DefaultWorkingDirectory)/jboss-pvc.yaml


oc get pvc $(REPOSITORIO)-data-$(AMBIENTE) -n $(PROJETO)-$(AMBIENTE)
if [ "$?" -ne "0" ]; then
oc create -f $(System.DefaultWorkingDirectory)/jboss-pvc.yaml
fi

check_pvc=`oc get pvc -o=json -n $(PROJETO)-$(AMBIENTE) | jq '.items[0]|.status.phase=="Bound"'`
if [ "$check_pvc" == "true" ]; then
   echo "O volume foi configurado com sucesso"
   else
   echo "Ocorreu alguma falha no processo de configuração"
   exit 1
fi


case $SITE in

  ocp_nprd | ocp_prd | okd4_nprd | okd4_prd )
    app="$(REPOSITORIO)-$(AMBIENTE)"
    ;;

  ctc_nprd | ctc_npcn )
    app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
    ;;

  *)
    app="Não encontrei o cluter"
    echo $app
    ;;
esac

oc set volume dc/$app --add --name=$(REPOSITORIO)-data-$(AMBIENTE) -t pvc --claim-name=$(REPOSITORIO)-data-$(AMBIENTE) --mount-path=$(PATH_DESTINO) --overwrite -n $(PROJETO)-$(AMBIENTE)


#if [[ -n "$SITE" && "$SITE" =~ "okd4" ]]
#then
#  app="$(REPOSITORIO)-$(AMBIENTE)"
#else
#  app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
#fi
#
#oc set volume dc/$app --add --name=$(REPOSITORIO)-data-$(AMBIENTE) -t pvc --claim-name=$(REPOSITORIO)-data-$(AMBIENTE) --mount-path=$(PATH_DESTINO) --overwrite -n $(PROJETO)-$(AMBIENTE)
