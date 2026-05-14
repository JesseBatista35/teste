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
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -nE -A5 -B5 "sed|main*.js|command:|args:|image:" dc-frontend.yaml
167-                    f:value: {}
168-                  k:{"name":"SITOP_API"}:
169-                    .: {}
170-                    f:name: {}
171-                    f:value: {}
172:                f:image: {}
173-                f:volumeMounts:
174-                  .: {}
175-                  k:{"mountPath":"/opt/app-root/etc/nginx.default.d/sitop-nginx.conf"}:
176-                    .: {}
177-                    f:mountPath: {}
178-                    f:name: {}
179-                    f:subPath: {}
180-              k:{"name":"sitop-frontend-des-exporter"}:
181:                f:image: {}
182-                f:volumeMounts:
183-                  .: {}
184-                  k:{"mountPath":"/opt/app-root/etc/nginx.default.d/sitop-nginx.conf"}:
185-                    .: {}
186-                    f:mountPath: {}
--
264-          value: cli-web-top
265-        - name: KEYCLOAK_SSO_API
266-          value: https://login.des.caixa/auth
267-        - name: SITOP_API
268-          value: https://sitop-backend-des.apps.nprd.caixa/
269:        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sitop-frontend:1.0.0-SNAPSHOT
270-        imagePullPolicy: Always
271-        livenessProbe:
272-          failureThreshold: 3
273-          httpGet:
274-            path: /
--
303-        terminationMessagePolicy: File
304-        volumeMounts:
305-        - mountPath: /opt/app-root/etc/nginx.default.d/sitop-nginx.conf
306-          name: nginx-conf-d-sitop-frontend
307-          subPath: sitop-nginx.conf
308:      - image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter
309-        imagePullPolicy: Always
310-        name: sitop-frontend-des-exporter
311-        ports:
312-        - containerPort: 9113
313-          protocol: TCP
-sh-4.2$ oc get cm nginx-conf-d-sitop-frontend -o yaml
apiVersion: v1
data:
  sitop-nginx.conf: "location * {\n    server_tokens off;    \n    add_header Cache-Control
    \"no-store, max-age=0\";\n    add_header Clear-Site-Data \"\\\"cache\\\",\\\"cookies\\\",\\\"storage\\\"\";\n
    \   add_header Content-Security-Policy \"default-src 'self'; form-action 'self';
    base-uri 'self'; object-src 'none'; frame-ancestors 'none'; upgrade-insecure-requests\";\n
    \   add_header Cross-Origin-Embedder-Policy \"require-corp\";\n    add_header
    Cross-Origin-Opener-Policy \"same-origin\";\n    add_header Cross-Origin-Resource-Policy
    \"same-origin\";\n    add_header Permissions-Policy \"accelerometer=(), autoplay=(),
    camera=(), cross-origin-isolated=(), display-capture=(), encrypted-media=(), fullscreen=(),
    geolocation=(), gyroscope=(), keyboard-map=(), magnetometer=(), microphone=(),
    midi=(), payment=(), picture-in-picture=(), publickey-credentials-get=(), screen-wake-lock=(),
    sync-xhr=(self), usb=(), web-share=(), xr-spatial-tracking=(), clipboard-read=(),
    clipboard-write=(), gamepad=(), hid=(), idle-detection=(), interest-cohort=(),
    serial=(), unload=()\";\n    add_header Referrer-Policy \"no-referrer\";\n    add_header
    Strict-Transport-Security  \"max-age=31536000; includeSubDomains\";\n    add_header
    X-Content-Type-Options \"nosniff\";\n    add_header X-DNS-Prefetch-Control \"off\";\n
    \   add_header X-Frame-Options \"deny\";\n    add_header X-Permitted-Cross-Domain-Policies
    \"none\";\n}\n\nlocation /socket.io {\n    proxy_pass https://sitop-backend-des.apps.nprd.caixa/;
    \n    proxy_http_version 1.1;\n    proxy_set_header Upgrade $http_upgrade;\n    proxy_set_header
    Connection 'upgrade';\n    proxy_set_header Host $host;\n    proxy_set_header
    X-Forwarded-Host $host;\n    proxy_set_header X-Forwarded-Server $host;\n    proxy_set_header
    X-Forwarded-For $proxy_add_x_forwarded_for;\n    proxy_cache_bypass $http_upgrade;
    \   \n}"
kind: ConfigMap
metadata:
  creationTimestamp: 2026-05-13T21:47:00Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:sitop-nginx.conf: {}
    manager: kubectl-create
    operation: Update
    time: 2026-05-13T21:47:00Z
  name: nginx-conf-d-sitop-frontend
  namespace: sitop-des
  resourceVersion: "1954386846"
  uid: 6c3bd5a6-122a-4c6a-8c81-6993788bddd5
-sh-4.2$ oc get cm nginx-conf-d-sitop-frontend -o yaml | grep -nE "sed|main*.js|root|alias|try_files|8080|stub_status"
-sh-4.2$ oc debug dc/sitop-frontend-des -- /bin/sh
Defaulting container name to sitop-frontend-des.
Use 'oc describe pod/sitop-frontend-des-debug -n sitop-des' to see all of the containers in this pod.

Debugging with pod/sitop-frontend-des-debug, original command: <image entrypoint>
Waiting for pod to start ...

Removing debug pod ...
-sh-4.2$ oc debug pod/sitop-frontend-des-5-mzzkd -c sitop-frontend-des -- /bin/sh
Debugging with pod/sitop-frontend-des-5-mzzkd-debug, original command: <image entrypoint>
Waiting for pod to start ...

Removing debug pod ...
-sh-4.2$ pwd
/home/p585600
-sh-4.2$ ls -la /opt
total 392
drwxr-xr-x. 17 root     root        244 Mar 13 10:25 .
dr-xr-xr-x. 20 root     root        287 Dez 13 02:59 ..
drwxr-xr-x  20 sadscp01 sadscp01   4096 Mai 13 01:31 ads-agent
drwxr-xr-x   3 root     root         32 Nov 21  2019 apache-maven
drwxr-xr-x   5 root     root         49 Jun 27  2025 azcmagent
drwxrwxr-x   5 ctmagelx controlm    155 Fev 15  2018 ctmage
drwxrwxrwx   2 root     root         45 Mar 13  2024 dump
drwxr-xr-x   3 root     root        188 Jun 29  2021 fortify-20.2.2
drwxr-xr-x   5 root     root         50 Jun 27  2025 GC_Ext
drwxr-xr-x   3 root     root         16 Jun 27  2025 GC_Service
drwxr-xr-x   3 root     root         21 Mar 13 10:25 jboss-eap
drwxr-xr-x   3 root     root         19 Jun 28  2025 microsoft
drwxr-xr-x.  7 root     root         81 Set  5  2024 puppetlabs
drwxr-xr-x   3 root     root         22 Jun 18  2024 rh
drwxr-xr-x   2 root     root          6 Jan 12  2023 SONAR
drwxrwxrwx   2 root     root     319488 Abr  1  2025 SSC-ssc
drwxr-xr-x   3 root     root         17 Jun 25  2020 tivoli
-sh-4.2$ ls -la /opt/app-root
ls: não é possível acessar /opt/app-root: Arquivo ou diretório não encontrado
-sh-4.2$
