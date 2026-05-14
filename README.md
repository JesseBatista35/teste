-sh-4.2$ oc get dc sitop-frontend-des -o yaml > dc-frontend.yaml
-sh-4.2$ grep -n -A5 -B5 "sed|main*.js|command:|args:|image:" dc-frontend.yaml
-sh-4.2$ oc describe dc sitop-frontend-des
Name:           sitop-frontend-des
Namespace:      sitop-des
Created:        28 hours ago
Labels:         CGC_DES=7390
                CGC_OPS=7259
                app=sitop-frontend-des
                application=sitop-frontend-des
                template=angular-caixa-release
Description:    Defines how to deploy the application server
Annotations:    <none>
Latest Version: 5
Selector:       name=sitop-frontend-des
Replicas:       1
Triggers:       <none>
Strategy:       Rolling
Template:
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=sitop-frontend-des
                name=sitop-frontend-des
  Containers:
   sitop-frontend-des:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sitop-frontend:1.0.0-SNAPSHOT
    Port:       8080/TCP
    Host Port:  0/TCP
    Limits:
      cpu:      500m
      memory:   512Mi
    Requests:
      cpu:      500m
      memory:   512Mi
    Liveness:   http-get http://:8080/ delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/ delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:               America/Sao_Paulo
      CLI_WEB_TOP:      cli-web-top
      KEYCLOAK_SSO_API: https://login.des.caixa/auth
      SITOP_API:        https://sitop-backend-des.apps.nprd.caixa/
    Mounts:
      /opt/app-root/etc/nginx.default.d/sitop-nginx.conf from nginx-conf-d-sitop-frontend (rw)
   sitop-frontend-des-exporter:
    Image:              default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter
    Port:               9113/TCP
    Host Port:          0/TCP
    Environment:        <none>
    Mounts:
      /opt/app-root/etc/nginx.default.d/sitop-nginx.conf from nginx-conf-d-sitop-frontend (rw)
  Volumes:
   nginx-conf-d-sitop-frontend:
    Type:       ConfigMap (a volume populated by a ConfigMap)
    Name:       nginx-conf-d-sitop-frontend
    Optional:   false

Deployment #5 (latest):
        Name:           sitop-frontend-des-5
        Created:        2 hours ago
        Status:         Complete
        Replicas:       1 current / 1 desired
        Selector:       deployment=sitop-frontend-des-5,deploymentconfig=sitop-frontend-des,name=sitop-frontend-des
        Labels:         CGC_DES=7390,CGC_OPS=7259,app=sitop-frontend-des,application=sitop-frontend-des,openshift.io/deployment-config.name=sitop-frontend-des,template=angular-caixa-release
        Pods Status:    1 Running / 0 Waiting / 0 Succeeded / 0 Failed
Deployment #4:
        Created:        2 hours ago
        Status:         Failed
        Replicas:       0 current / 0 desired
-sh-4.2$
