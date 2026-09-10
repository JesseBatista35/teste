oc set volume dc/sihdg-jboss8-des --add --name=sihdg-sinaf-data-des --type=persistentVolumeClaim --claim-name=sihdg-sinaf-data-des --mount-path=/sihdg_sinaf --containers=sihdg-jboss8-des

oc rollout status dc/sihdg-jboss8-des

oc rollout cancel dc/sihdg-jboss8-des
