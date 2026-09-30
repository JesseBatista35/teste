
-sh-4.2$
-sh-4.2$ oc auth can-i get builds -n build-images-ads --as=system:serviceaccount:build-images-ads:builder
yes
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n build-images-ads --sort-by=.metadata.creationTimestamp | tail -10
sirex-agenda-api-63                                   Source    Binary           Failed (GenericBuildFailed)          19 minutes ago      8m20s
siavl-enviomsgativa-backend-80                        Source    Binary           Failed (PushImageToRegistryFailed)   18 minutes ago      8m14s
sinep-api-441                                         Source    Binary           Complete                             10 minutes ago      3m21s
sigec-com-frontend-18                                 Source    Binary           Complete                             6 minutes ago       28s
sicgr-web-211                                         Source    Binary           Complete                             5 minutes ago       2m39s
siepr-frontend-278                                    Source    Binary           Complete                             5 minutes ago       2m7s
siiso-frontend-39                                     Source    Binary           Complete                             5 minutes ago       1m50s
sisou-front-410                                       Source    Binary           Complete                             2 minutes ago       47s
sirex-agenda-api-64                                   Source    Binary           Running                              2 minutes ago
simtx-transferegov-processamento-177                  Source    Binary           Running                              2 minutes ago
-sh-4.2$
