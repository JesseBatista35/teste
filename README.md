oc set volume dc/sihdg-jboss8-des --add --name=sihdg-sinaf-data-des --type=persistentVolumeClaim --claim-name=sihdg-sinaf-data-des --mount-path=/sihdg_sinaf --containers=sihdg-jboss8-des

oc rollout status dc/sihdg-jboss8-des

oc rollout cancel dc/sihdg-jboss8-des



-sh-4.2$ oc rollout status dc/sihdg-jboss8-des
error: replication controller "sihdg-jboss8-des-89" has failed progressing
-sh-4.2$ oc rollout cancel dc/sihdg-jboss8-des
No rollout is in progress (latest rollout #89 failed 11 hours ago)
-sh-4.2$
