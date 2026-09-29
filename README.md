-sh-4.2$ oc get events --sort-by=.lastTimestamp | grep -i frontend | tail -15
F0929 16:44:00.137912   71373 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sipar-inter-frontend-des -o yaml | grep -i -B2 -A6 "image"
                    f:name: {}
                    f:value: {}
                f:image: {}
                f:livenessProbe:
                  .: {}
                  f:exec: {}
                  f:failureThreshold: {}
                  f:initialDelaySeconds: {}
                  f:successThreshold: {}
--
            f:containers:
              k:{"name":"sipar-inter-frontend-des"}:
                f:imagePullPolicy: {}
    manager: kubectl-edit
    operation: Update
    time: 2025-03-12T22:12:46Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
--
              apiVersion: v1
              fieldPath: status.podIP
        image: image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d
        imagePullPolicy: IfNotPresent
        livenessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /tmp/health-check.sh
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get is -n openshift | grep -i httpd
httpd                              image-registry.openshift-image-registry.svc:5000/openshift/httpd                              2.4-ubi8,2.4-ubi9,latest,2.4-el8 + 2 more...           16 months ago
httpd-24-rhel7                     image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7                     2.4-cef                                                20 months ago
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag -n openshift | grep -i httpd
httpd:2.4                                  image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:2fa4c4c3e3bd1cd013b65dd3e91c7d3d1d6d86dc312af5635ac02d8a221eb40f                            3 years ago
httpd:2.4-el7                              image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:2fa4c4c3e3bd1cd013b65dd3e91c7d3d1d6d86dc312af5635ac02d8a221eb40f                            3 years ago
httpd:2.4-el8                              image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:aba4d65d2949f6228e5f7fd34274b2fa5d16cdd62acf7b82ed00caaac25ca9ec                            3 years ago
httpd:2.4-ubi8                             image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:406a1766aea4ee1a26e4a97022583f3c8fc0ff6ef46c87b91d33ea59d254c912                            16 months ago
httpd:2.4-ubi9                             image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:e0c9480fb2693a2a94874b2ea7ed6baac017c88a8c2b17e7ff48482ff730ff60                            16 months ago
httpd:latest                               image-registry.openshift-image-registry.svc:5000/openshift/httpd@sha256:406a1766aea4ee1a26e4a97022583f3c8fc0ff6ef46c87b91d33ea59d254c912                            16 months ago
httpd-24-rhel7:2.4-cef                     image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d                   20 months ago
-sh-4.2$ oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml
apiVersion: v1
data:
  default-virtualhost-ssl.conf: |-
    Listen 0.0.0.0:8443 https

    <VirtualHost *:8443>
    ServerName https://sipar-inter-frontend-des.apps.nprd.caixa

    ErrorLog /proc/self/fd/2
    TransferLog /proc/self/fd/1
    LogLevel info

    ProxyPreserveHost On
    RewriteEngine On
    RewriteCond  %{DOCUMENT_ROOT}/%{REQUEST_FILENAME} !-f
    RewriteRule  .*favicon\.ico$    htdocs/favicon.ico [L]

    ProxyPass /siparInternet ajp://sipar-inter-des:8009/siparInternet connectiontimeout=5 timeout=30
    ProxyPassReverse /siparInternet ajp://sipar-inter-des:8009/siparInternet

    ServerSignature off

    #SSLEngine on#
    #SSLProtocol -all +TLSv1 -SSLv3
    #SSLCipherSuite ECDHE-ECDSA-CHACHA20-POLY1305:ECDHE-RSA-CHACHA20-POLY1305:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA:ECDHE-RSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-RSA-AES256-SHA256:DHE-RSA-AES256-SHA:ECDHE-ECDSA-DES-CBC3-SHA:ECDHE-RSA-DES-CBC3-SHA:EDH-RSA-DES-CBC3-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:DES-CBC3-SHA:!DSS
    #SSLHonorCipherOrder on
    #SSLCompression off

    SSLEngine on
    SSLProtocol +TLSv1.2 -SSLv2 -SSLv3
    SSLCipherSuite "ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384"
    SSLHonorCipherOrder on
    SSLCompression off

    SSLCertificateFile "/etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt"
    SSLCertificateKeyFile "/etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key"
    SSLCertificateChainFile "/etc/httpd/tls/cadeia_cert_caixav3_des.crt"
    SSLCACertificateFile "/etc/httpd/tls/cadeiacompletav2_des.crt"
    SSLVerifyClient require
    SSLVerifyDepth 10
    SSLOptions +ExportCertData +StdEnvVars

    # HSTS
    Header add Strict-Transport-Security "max-age=15768000"

    CustomLog /proc/self/fd/1 \
              "%t %h %{SSL_PROTOCOL}x %{SSL_CIPHER}x \"%r\" %b"

    </VirtualHost>
    <VirtualHost *:8443>
    ServerName https://sipar-inter-frontend-des.apps.nprd.caixa

    ErrorLog /proc/self/fd/2
    TransferLog /proc/self/fd/1
    LogLevel info

    ProxyPreserveHost On
    RewriteEngine On
    RewriteCond  %{DOCUMENT_ROOT}/%{REQUEST_FILENAME} !-f
    RewriteRule  .*favicon\.ico$    htdocs/favicon.ico [L]

    ProxyPass /siparInternet ajp://sipar-inter-des:8009/siparInternet connectiontimeout=5 timeout=30
    ProxyPassReverse /siparInternet ajp://sipar-inter-des:8009/siparInternet

    ServerSignature off

    #SSLEngine on
    #SSLProtocol -all +TLSv1 -SSLv3
    #SSLCipherSuite ECDHE-ECDSA-CHACHA20-POLY1305:ECDHE-RSA-CHACHA20-POLY1305:ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-GCM-SHA384:DHE-RSA-AES128-GCM-SHA256:DHE-RSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES128-SHA256:ECDHE-RSA-AES128-SHA256:ECDHE-ECDSA-AES128-SHA:ECDHE-RSA-AES256-SHA384:ECDHE-RSA-AES128-SHA:ECDHE-ECDSA-AES256-SHA384:ECDHE-ECDSA-AES256-SHA:ECDHE-RSA-AES256-SHA:DHE-RSA-AES128-SHA256:DHE-RSA-AES128-SHA:DHE-RSA-AES256-SHA256:DHE-RSA-AES256-SHA:ECDHE-ECDSA-DES-CBC3-SHA:ECDHE-RSA-DES-CBC3-SHA:EDH-RSA-DES-CBC3-SHA:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:DES-CBC3-SHA:!DSS
    #SSLHonorCipherOrder on
    #SSLCompression off

    SSLEngine on
    SSLProtocol +TLSv1.2 -SSLv2 -SSLv3
    SSLCipherSuite "ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384"
    SSLHonorCipherOrder on
    SSLCompression off

    SSLCertificateFile "/etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.crt"
    SSLCertificateKeyFile "/etc/httpd/tls/sipar-inter-frontend-des.apps.nprd.caixa.key"
    SSLCertificateChainFile "/etc/httpd/tls/cadeia_cert_caixav3_des.crt"
    SSLCACertificateFile "/etc/httpd/tls/cadeiacompletav2_des.crt"
    SSLVerifyClient require
    SSLVerifyDepth 10
    SSLOptions +ExportCertData +StdEnvVars

    # HSTS
    Header add Strict-Transport-Security "max-age=15768000"

    CustomLog /proc/self/fd/1 \
              "%t %h %{SSL_PROTOCOL}x %{SSL_CIPHER}x \"%r\" %b"

    </VirtualHost>
kind: ConfigMap
metadata:
  creationTimestamp: 2026-09-29T00:15:53Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:default-virtualhost-ssl.conf: {}
    manager: oc
    operation: Update
    time: 2026-09-29T00:15:53Z
  name: default-virtualhost-ssl-conf-sipar-inter-frontend
  namespace: sipar-des
  resourceVersion: "2229684979"
  uid: 9cefb7d7-fa9f-410d-8bf0-acd0619fcc38
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get svc sipar-inter-frontend-des -o yaml | grep -A12 "ports:"
        f:ports:
          .: {}
          k:{"port":8009,"protocol":"TCP"}:
            .: {}
            f:name: {}
            f:port: {}
            f:protocol: {}
            f:targetPort: {}
          k:{"port":8080,"protocol":"TCP"}:
            .: {}
            f:name: {}
            f:port: {}
            f:protocol: {}
--
  ports:
  - name: web
    port: 8080
    protocol: TCP
    targetPort: 8080
  - name: jmx
    port: 8778
    protocol: TCP
    targetPort: 8778
  - name: ajp
    port: 8009
    protocol: TCP
    targetPort: 8009
-sh-4.2$
