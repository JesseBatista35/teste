-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- ls -la /usr/src/app/secrets_files/
total 0
drwxrwxrwt. 3 root root  60 Nov 10 11:40 .
drwxr-xr-x. 3 root root  27 Nov 12 14:03 ..
drwxr-xr-x. 3 1337 root 380 Nov 10 11:40 siinp_tqs
-sh-4.2$
-sh-4.2$
-sh-4.2$ _files/
-sh: _files/: Arquivo ou diretório não encontrado
-sh-4.2$ _files/
-sh: _files/: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- env | grep -i SMALLRYE
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/siinp_tqs/
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs siinp-nucleo-tqs-651-deploy -n siinp-tqs
--> Scaling up siinp-nucleo-tqs-651 from 0 to 1, scaling down siinp-nucleo-tqs-647 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling siinp-nucleo-tqs-651 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA2 -E "SMALLRYE|secrets_files"
        - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
          valueFrom:
            secretKeyRef:
              key: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
              name: siinp-nucleo-tqs
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo:1.90.8.1
--
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /deployments/siinp_mtls_sandbox_of_072025_new.p12
--
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
--
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
--
          value: /usr/src/app/secrets_files
        - name: CONFIG_CASE_INSENSITIVE
          value: "0"
--
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
-sh-4.2$

