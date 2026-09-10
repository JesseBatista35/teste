-sh-4.2$
-sh-4.2$ oc set volume dc/sihdg-jboss8-des --add --name=sihdg-sinaf-data-des --type=persistentVolumeClaim --claim-name=sihdg-sinaf-data-des --mount-path=/sihdg_sinaf --containers=sihdg-jboss8-des
deploymentconfig.apps.openshift.io/sihdg-jboss8-des volume updated
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sihdg-jboss8-des
error: replication controller "sihdg-jboss8-des-89" has failed progressing
-sh-4.2$
