<img width="1672" height="907" alt="image" src="https://github.com/user-attachments/assets/dee6e9b0-8243-47d0-81ac-12fe2656ce26" />


alteraçao feita na pipe

Criando novo BuildConfig

View raw log

Starting: Criando novo BuildConfig
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/bd1a4edd-5d48-40c8-a951-b113dc88a0cb.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=simpf-frontend
+ oc get imagestreams/simpf-frontend -n build-images-ads
NAME             IMAGE REPOSITORY                                                                              TAGS                                                       UPDATED
simpf-frontend   default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simpf-frontend   3.12.0.7-SNAPSHOT,latest,3.12.0.4-SNAPSHOT + 226 more...   7 minutes ago
+ '[' 0 -ne 0 ']'
Finishing: Criando novo BuildConfig




2026-09-02T19:56:54.0586434Z ##[section]Starting: Executando Build S2I Binary
2026-09-02T19:56:54.0589902Z ==============================================================================
2026-09-02T19:56:54.0589987Z Task         : Bash
2026-09-02T19:56:54.0590036Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-02T19:56:54.0590108Z Version      : 3.227.0
2026-09-02T19:56:54.0590157Z Author       : Microsoft Corporation
2026-09-02T19:56:54.0590222Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-02T19:56:54.0590299Z ==============================================================================
2026-09-02T19:56:54.2039544Z Generating script.
2026-09-02T19:56:54.2053037Z ========================== Starting Command Output ===========================
2026-09-02T19:56:54.2068692Z [command]/bin/bash /opt/ads-agent/_work/_temp/fa96bad4-2c22-46a7-bc70-f4fa6b523313.sh
2026-09-02T19:56:54.2124574Z + echo okd4_nprd
2026-09-02T19:56:54.2125591Z + egrep -q '^(okd4|ocp)'
2026-09-02T19:56:54.2145706Z + buildconfig=simpf-frontend
2026-09-02T19:56:54.2146575Z + oc start-build simpf-frontend --from-dir=/opt/ads-agent/_work/422/a --follow --wait=true -n build-images-ads -v=5
2026-09-02T19:56:54.2813262Z I0902 16:56:54.280984 3664725 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-02T19:56:54.2833742Z I0902 16:56:54.283134 3664725 repository.go:533] Error executing command: exit status 128
2026-09-02T19:56:54.2834419Z Uploading directory "/opt/ads-agent/_work/422/a" as binary input for the build ...
2026-09-02T19:56:54.2835298Z I0902 16:56:54.283238 3664725 tar.go:238] Adding "/opt/ads-agent/_work/422/a" to tar ...
2026-09-02T19:56:54.2835638Z I0902 16:56:54.283454 3664725 tar.go:336] Adding to tar: /opt/ads-agent/_work/422/a/.s2i as .s2i
2026-09-02T19:56:54.2848186Z I0902 16:56:54.283630 3664725 tar.go:336] Adding to tar: /opt/ads-agent/_work/422/a/.s2i/bin as .s2i/bin
2026-09-02T19:56:54.2848557Z I0902 16:56:54.283690 3664725 tar.go:336] Adding to tar: /opt/ads-agent/_work/422/a/.s2i/bin/assemble as .s2i/bin/assemble
2026-09-02T19:56:54.2848998Z I0902 16:56:54.283746 3664725 tar.go:336] Adding to tar: /opt/ads-agent/_work/422/a/.s2i/bin/run as .s2i/bin/run
2026-09-02T19:56:54.2849434Z I0902 16:56:54.283799 3664725 tar.go:336] Adding to tar: /opt/ads-agent/_work/422/a/simpf-frontend.zip as simpf-frontend.zip
2026-09-02T19:56:58.9163786Z 
2026-09-02T19:56:58.9164622Z Uploading finished
2026-09-02T19:56:58.9167578Z build.build.openshift.io/simpf-frontend-434 started
2026-09-02T19:56:58.9262475Z Adding cluster TLS certificate authority to trust store
2026-09-02T19:56:58.9262989Z Receiving source from STDIN as archive ...
2026-09-02T19:57:00.4198864Z Adding cluster TLS certificate authority to trust store
2026-09-02T19:57:02.4455619Z Adding cluster TLS certificate authority to trust store
2026-09-02T19:57:03.7794541Z time="2026-09-02T19:57:03Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-02T19:57:03.7794937Z I0902 19:57:03.777965       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-02T19:57:03.9023049Z Caching blobs under "/var/cache/blobs".
2026-09-02T19:57:03.9044098Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
2026-09-02T19:57:04.0527121Z Getting image source signatures
2026-09-02T19:57:04.1131843Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-09-02T19:57:04.1489316Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-09-02T19:57:04.1826583Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-09-02T19:57:04.1826918Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-09-02T19:57:04.2102281Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-09-02T19:57:07.4557160Z Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de
2026-09-02T19:57:07.5247748Z Writing manifest to image destination
2026-09-02T19:57:07.5325299Z Storing signatures
2026-09-02T19:57:11.8989075Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-09-02T19:57:12.0144797Z STEP 1/10: FROM image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-09-02T19:57:12.0145459Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
2026-09-02T19:57:12.0800048Z Getting image source signatures
2026-09-02T19:57:12.1062487Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-09-02T19:57:12.1064162Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-09-02T19:57:12.1064357Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-09-02T19:57:12.1064549Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-09-02T19:57:12.1064741Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-09-02T19:57:12.1064941Z Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de
2026-09-02T19:57:12.1455213Z Writing manifest to image destination
2026-09-02T19:57:12.1510212Z Storing signatures
2026-09-02T19:57:12.2071622Z STEP 2/10: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-02T19:57:12.2409747Z STEP 3/10: ENV OPENSHIFT_BUILD_NAME="simpf-frontend-434"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"     TZ="America/Sao_Paulo"
2026-09-02T19:57:12.2818722Z STEP 4/10: USER root
2026-09-02T19:57:12.3260998Z STEP 5/10: COPY upload/scripts /tmp/scripts
2026-09-02T19:57:12.6098552Z STEP 6/10: COPY upload/src /tmp/src
2026-09-02T19:57:12.9370678Z STEP 7/10: RUN chown -R 1001:0 /tmp/scripts /tmp/src
2026-09-02T19:57:13.6937307Z STEP 8/10: USER 1001
2026-09-02T19:57:13.7208248Z STEP 9/10: RUN /tmp/scripts/assemble
2026-09-02T19:57:14.1484911Z Copying all WAR, EAR, JAR and ZIP artifacts from /tmp/src directory into /opt/app-root/src for later deployment...
2026-09-02T19:57:14.1566941Z '/tmp/src/simpf-frontend.zip' -> '/opt/app-root/src/simpf-frontend.zip'
2026-09-02T19:57:14.1586252Z Archive:  /opt/app-root/src/simpf-frontend.zip
2026-09-02T19:57:14.1589278Z    creating: /opt/app-root/src/dist/
2026-09-02T19:57:14.1610476Z    creating: /opt/app-root/src/dist/SIMPF-frontend/
2026-09-02T19:57:14.1645045Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-brands-400.23f19bb08961f37aaf69.eot  
2026-09-02T19:57:14.1645851Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-brands-400.d878b0a6a1144760244f.woff2  
2026-09-02T19:57:14.1646232Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-brands-400.2285773e6b4b172f07d9.woff  
2026-09-02T19:57:14.1660683Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-brands-400.527940b104eb2ea366c8.ttf  
2026-09-02T19:57:14.1700210Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-brands-400.2f517e09eb2ca6650ff5.svg  
2026-09-02T19:57:14.1700706Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-regular-400.77206a6bb316fa0aded5.eot  
2026-09-02T19:57:14.1700990Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/fa-regular-400.7a3337626410ca2f4071.woff2  
2026-09-02T19:57:14.1702082Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-regular-400.bb58e57c48a3e911f15f.woff  
2026-09-02T19:57:14.1704415Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-regular-400.491974d108fe4002b2aa.ttf  
2026-09-02T19:57:14.1720104Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-regular-400.4689f52cc96215721344.svg  
2026-09-02T19:57:14.1737376Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-solid-900.9bbb245e67a133f6e486.eot  
2026-09-02T19:57:14.1739223Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-solid-900.1551f4f60c37af51121f.woff2  
2026-09-02T19:57:14.1753086Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-solid-900.eeccf4f66002c6f2ba24.woff  
2026-09-02T19:57:14.1769278Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-solid-900.be9ee23c0c6390141475.ttf  
2026-09-02T19:57:14.1854054Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/fa-solid-900.7a8b4f130182d19a2d7c.svg  
2026-09-02T19:57:14.1854382Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-book.00ab1ea729515a2da446.ttf  
2026-09-02T19:57:14.1859632Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-book-italic.a1fdb373abdab064cabc.ttf  
2026-09-02T19:57:14.1859897Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-medium.dbbde3d53b68cf982647.ttf  
2026-09-02T19:57:14.1860176Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-medium-italic.d67c9ffce045f50d68a8.ttf  
2026-09-02T19:57:14.1860431Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-heavy.af72c25a6945b0f48abb.ttf  
2026-09-02T19:57:14.1863907Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-heavy-italic.815a0751cf3a349980ef.ttf  
2026-09-02T19:57:14.1867316Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-bold.610881046b0c09803fda.ttf  
2026-09-02T19:57:14.1873435Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/futura-bold-italic.d83bc6dfbd440f85aa97.ttf  
2026-09-02T19:57:14.1878308Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/arial-monospaced-mt.f2f3e0cdc9bc0022c507.ttf  
2026-09-02T19:57:14.1882180Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/sort.df04503bd7fe9f837694.png  
2026-09-02T19:57:14.1882443Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/sort-up.2e543a335887181616d4.png  
2026-09-02T19:57:14.1882700Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/sort-down.658d55f26e5f3ff402c8.png  
2026-09-02T19:57:14.1882938Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/runtime.7b63b9fd40098a2e8207.js  
2026-09-02T19:57:14.2145117Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/main.92f91f0ccc64176bfd59.js  
2026-09-02T19:57:14.2146128Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/polyfills.3c191382e2c06ca5e372.js  
2026-09-02T19:57:14.2146409Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/styles.073d4513ca9d5937dfbf.css  
2026-09-02T19:57:14.2146652Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/scripts.a209cb0257977b52dc8c.js  
2026-09-02T19:57:14.2210927Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/3rdpartylicenses.txt  
2026-09-02T19:57:14.2211233Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/favicon.ico  
2026-09-02T19:57:14.2211444Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/
2026-09-02T19:57:14.2211666Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/
2026-09-02T19:57:14.2211893Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Arial-Monospace/
2026-09-02T19:57:14.2212148Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Arial-Monospace/arial-monospaced-mt.ttf  
2026-09-02T19:57:14.2212388Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/
2026-09-02T19:57:14.2212637Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-bold-italic.ttf  
2026-09-02T19:57:14.2212887Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-bold.ttf  
2026-09-02T19:57:14.2213139Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-book-italic.ttf  
2026-09-02T19:57:14.2213416Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-book.ttf  
2026-09-02T19:57:14.2302998Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-heavy-italic.ttf  
2026-09-02T19:57:14.2303842Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-heavy.ttf  
2026-09-02T19:57:14.2304208Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-medium-italic.ttf  
2026-09-02T19:57:14.2304558Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/fonts/Futura-STD/futura-medium.ttf  
2026-09-02T19:57:14.2304871Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/
2026-09-02T19:57:14.2305191Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/baixo.png  
2026-09-02T19:57:14.2305501Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/cima.png  
2026-09-02T19:57:14.2305809Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/
2026-09-02T19:57:14.2306273Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/android-chrome-192x192.png  
2026-09-02T19:57:14.2306635Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/android-chrome-512x512.png  
2026-09-02T19:57:14.2306989Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/apple-touch-icon.png  
2026-09-02T19:57:14.2307337Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/favicon-16x16.png  
2026-09-02T19:57:14.2307679Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/favicon-32x32.png  
2026-09-02T19:57:14.2308010Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/favicon.ico  
2026-09-02T19:57:14.2308340Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/favicon.old.ico  
2026-09-02T19:57:14.2308768Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/lgcx100.png  
2026-09-02T19:57:14.2309123Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/favicon/site.webmanifest  
2026-09-02T19:57:14.2309438Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home.jpg  
2026-09-02T19:57:14.2926879Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/
2026-09-02T19:57:14.2947316Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/amazonas_cmb2.jpg  
2026-09-02T19:57:14.3055140Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/amazonas_cmb3.jpg  
2026-09-02T19:57:14.3055460Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/assessoria_caixa.jpg  
2026-09-02T19:57:14.3055709Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/assessoria_cmb.jpg  
2026-09-02T19:57:14.3055948Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/home.jpg  
2026-09-02T19:57:14.3091727Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home/parque_sumidouro_caixa_florestas.jpg  
2026-09-02T19:57:14.3092024Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home2.jpg  
2026-09-02T19:57:14.3112612Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/home2.png  
2026-09-02T19:57:14.3112959Z  extracting: /opt/app-root/src/dist/SIMPF-frontend/assets/images/lgcx100.png  
2026-09-02T19:57:14.3113241Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/percentual_func_contadas_blue.PNG  
2026-09-02T19:57:14.3113506Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/percentual_func_contadas_cinza.PNG  
2026-09-02T19:57:14.3113769Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/percentual_func_contadas_laranja.PNG  
2026-09-02T19:57:14.3114028Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/percentual_func_contadas.PNG  
2026-09-02T19:57:14.3114264Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/sort-down.png  
2026-09-02T19:57:14.3118740Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/sort-up.png  
2026-09-02T19:57:14.3118990Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/images/sort.png  
2026-09-02T19:57:14.3119208Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/
2026-09-02T19:57:14.3119758Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/
2026-09-02T19:57:14.3120002Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/
2026-09-02T19:57:14.3121945Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.css  
2026-09-02T19:57:14.3137415Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.css.map  
2026-09-02T19:57:14.3137960Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.min.css  
2026-09-02T19:57:14.3145264Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.min.css.map  
2026-09-02T19:57:14.3155977Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.rtl.css  
2026-09-02T19:57:14.3170707Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.rtl.css.map  
2026-09-02T19:57:14.3175729Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.rtl.min.css  
2026-09-02T19:57:14.3181988Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-grid.rtl.min.css.map  
2026-09-02T19:57:14.3182299Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.css  
2026-09-02T19:57:14.3195151Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.css.map  
2026-09-02T19:57:14.3195453Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.min.css  
2026-09-02T19:57:14.3199873Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.min.css.map  
2026-09-02T19:57:14.3200163Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.rtl.css  
2026-09-02T19:57:14.3206852Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.rtl.css.map  
2026-09-02T19:57:14.3207281Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.rtl.min.css  
2026-09-02T19:57:14.3211000Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-reboot.rtl.min.css.map  
2026-09-02T19:57:14.3217756Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.css  
2026-09-02T19:57:14.3227241Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.css.map  
2026-09-02T19:57:14.3231358Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.min.css  
2026-09-02T19:57:14.3248976Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.min.css.map  
2026-09-02T19:57:14.3287579Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.rtl.css  
2026-09-02T19:57:14.3287899Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.rtl.css.map  
2026-09-02T19:57:14.3290235Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.rtl.min.css  
2026-09-02T19:57:14.3290563Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap-utilities.rtl.min.css.map  
2026-09-02T19:57:14.3301290Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.css  
2026-09-02T19:57:14.3341426Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.css.map  
2026-09-02T19:57:14.3353134Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.min.css  
2026-09-02T19:57:14.3384357Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.min.css.map  
2026-09-02T19:57:14.3397547Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.rtl.css  
2026-09-02T19:57:14.3584857Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.rtl.css.map  
2026-09-02T19:57:14.3585478Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.rtl.min.css  
2026-09-02T19:57:14.3587758Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/css/bootstrap.rtl.min.css.map  
2026-09-02T19:57:14.3588211Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/
2026-09-02T19:57:14.3589138Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.bundle.js  
2026-09-02T19:57:14.3589604Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.bundle.js.map  
2026-09-02T19:57:14.3590204Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.bundle.min.js  
2026-09-02T19:57:14.3590664Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.bundle.min.js.map  
2026-09-02T19:57:14.3591131Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.esm.js  
2026-09-02T19:57:14.3611577Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.esm.js.map  
2026-09-02T19:57:14.3616644Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.esm.min.js  
2026-09-02T19:57:14.3646874Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.esm.min.js.map  
2026-09-02T19:57:14.3807240Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.js  
2026-09-02T19:57:14.3807760Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.js.map  
2026-09-02T19:57:14.3808193Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.min.js  
2026-09-02T19:57:14.3808738Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/bootstrap-5.1.1-dist/js/bootstrap.min.js.map  
2026-09-02T19:57:14.3809162Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/
2026-09-02T19:57:14.3809579Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/attribution.js  
2026-09-02T19:57:14.3810011Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/
2026-09-02T19:57:14.3810431Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/all.css  
2026-09-02T19:57:14.3810859Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/all.min.css  
2026-09-02T19:57:14.3811289Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/brands.css  
2026-09-02T19:57:14.3811717Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/brands.min.css  
2026-09-02T19:57:14.3812145Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/fontawesome.css  
2026-09-02T19:57:14.3812601Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/fontawesome.min.css  
2026-09-02T19:57:14.3813032Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/regular.css  
2026-09-02T19:57:14.3813472Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/regular.min.css  
2026-09-02T19:57:14.3813885Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/solid.css  
2026-09-02T19:57:14.3814688Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/solid.min.css  
2026-09-02T19:57:14.3815118Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/svg-with-js.css  
2026-09-02T19:57:14.3815559Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/svg-with-js.min.css  
2026-09-02T19:57:14.3815997Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/v4-shims.css  
2026-09-02T19:57:14.3816426Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/css/v4-shims.min.css  
2026-09-02T19:57:14.3816860Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/
2026-09-02T19:57:14.3871549Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/all.js  
2026-09-02T19:57:14.3992017Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/all.min.js  
2026-09-02T19:57:14.4037390Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/brands.js  
2026-09-02T19:57:14.4090321Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/brands.min.js  
2026-09-02T19:57:14.4090663Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/conflict-detection.js  
2026-09-02T19:57:14.4092624Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/conflict-detection.min.js  
2026-09-02T19:57:14.4107636Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/fontawesome.js  
2026-09-02T19:57:14.4107966Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/fontawesome.min.js  
2026-09-02T19:57:14.4116730Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/regular.js  
2026-09-02T19:57:14.4126925Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/regular.min.js  
2026-09-02T19:57:14.4190760Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/solid.js  
2026-09-02T19:57:14.4245706Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/solid.min.js  
2026-09-02T19:57:14.4246970Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/v4-shims.js  
2026-09-02T19:57:14.4248072Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/js/v4-shims.min.js  
2026-09-02T19:57:14.4251637Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/
2026-09-02T19:57:14.4252087Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_animated.less  
2026-09-02T19:57:14.4252395Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_bordered-pulled.less  
2026-09-02T19:57:14.4254212Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_core.less  
2026-09-02T19:57:14.4255017Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_fixed-width.less  
2026-09-02T19:57:14.4260823Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_icons.less  
2026-09-02T19:57:14.4264706Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_larger.less  
2026-09-02T19:57:14.4266710Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_list.less  
2026-09-02T19:57:14.4267014Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_mixins.less  
2026-09-02T19:57:14.4268411Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_rotated-flipped.less  
2026-09-02T19:57:14.4269993Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_screen-reader.less  
2026-09-02T19:57:14.4276416Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_shims.less  
2026-09-02T19:57:14.4276829Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_stacked.less  
2026-09-02T19:57:14.4281194Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/_variables.less  
2026-09-02T19:57:14.4282891Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/brands.less  
2026-09-02T19:57:14.4283585Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/fontawesome.less  
2026-09-02T19:57:14.4284078Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/regular.less  
2026-09-02T19:57:14.4286908Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/solid.less  
2026-09-02T19:57:14.4288860Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/less/v4-shims.less  
2026-09-02T19:57:14.4289301Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/LICENSE.txt  
2026-09-02T19:57:14.4289689Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/
2026-09-02T19:57:14.4292831Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/categories.yml  
2026-09-02T19:57:14.4559009Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/icons.json  
2026-09-02T19:57:14.4559632Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/icons.yml  
2026-09-02T19:57:14.4560127Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/shims.json  
2026-09-02T19:57:14.4560573Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/shims.yml  
2026-09-02T19:57:14.4561009Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/metadata/sponsors.yml  
2026-09-02T19:57:14.4561421Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/
2026-09-02T19:57:14.4561847Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_animated.scss  
2026-09-02T19:57:14.4562306Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_bordered-pulled.scss  
2026-09-02T19:57:14.4562770Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_core.scss  
2026-09-02T19:57:14.4563216Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_fixed-width.scss  
2026-09-02T19:57:14.4563633Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_icons.scss  
2026-09-02T19:57:14.4564040Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_larger.scss  
2026-09-02T19:57:14.4889361Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_list.scss  
2026-09-02T19:57:14.4889726Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_mixins.scss  
2026-09-02T19:57:14.4890016Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_rotated-flipped.scss  
2026-09-02T19:57:14.4890334Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_screen-reader.scss  
2026-09-02T19:57:14.4890616Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_shims.scss  
2026-09-02T19:57:14.4893016Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_stacked.scss  
2026-09-02T19:57:14.4893364Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/_variables.scss  
2026-09-02T19:57:14.4893767Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/brands.scss  
2026-09-02T19:57:14.4894162Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/fontawesome.scss  
2026-09-02T19:57:14.4894541Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/regular.scss  
2026-09-02T19:57:14.4895033Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/solid.scss  
2026-09-02T19:57:14.4895404Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/scss/v4-shims.scss  
2026-09-02T19:57:14.4895678Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/sprites/
2026-09-02T19:57:14.4941348Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/sprites/brands.svg  
2026-09-02T19:57:14.4945058Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/sprites/regular.svg  
2026-09-02T19:57:14.5016577Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/sprites/solid.svg  
2026-09-02T19:57:14.5016880Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/
2026-09-02T19:57:14.5017148Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/
2026-09-02T19:57:14.5017461Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/500px.svg  
2026-09-02T19:57:14.5017756Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/accessible-icon.svg  
2026-09-02T19:57:14.5018058Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/accusoft.svg  
2026-09-02T19:57:14.5018374Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/acquisitions-incorporated.svg  
2026-09-02T19:57:14.5018754Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/adn.svg  
2026-09-02T19:57:14.5019050Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/adversal.svg  
2026-09-02T19:57:14.5019338Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/affiliatetheme.svg  
2026-09-02T19:57:14.5019622Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/airbnb.svg  
2026-09-02T19:57:14.5019898Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/algolia.svg  
2026-09-02T19:57:14.5020176Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/alipay.svg  
2026-09-02T19:57:14.5020452Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/amazon-pay.svg  
2026-09-02T19:57:14.5020729Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/amazon.svg  
2026-09-02T19:57:14.5020999Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/amilia.svg  
2026-09-02T19:57:14.5030660Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/android.svg  
2026-09-02T19:57:14.5030950Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/angellist.svg  
2026-09-02T19:57:14.5031324Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/angrycreative.svg  
2026-09-02T19:57:14.5036485Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/angular.svg  
2026-09-02T19:57:14.5036771Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/app-store-ios.svg  
2026-09-02T19:57:14.5037051Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/app-store.svg  
2026-09-02T19:57:14.5037389Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/apper.svg  
2026-09-02T19:57:14.5038278Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/apple-pay.svg  
2026-09-02T19:57:14.5038778Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/apple.svg  
2026-09-02T19:57:14.5039088Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/artstation.svg  
2026-09-02T19:57:14.5039374Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/asymmetrik.svg  
2026-09-02T19:57:14.5039654Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/atlassian.svg  
2026-09-02T19:57:14.5039930Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/audible.svg  
2026-09-02T19:57:14.5040216Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/autoprefixer.svg  
2026-09-02T19:57:14.5040508Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/avianex.svg  
2026-09-02T19:57:14.5040786Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/aviato.svg  
2026-09-02T19:57:14.5043438Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/aws.svg  
2026-09-02T19:57:14.5043787Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bandcamp.svg  
2026-09-02T19:57:14.5044126Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/battle-net.svg  
2026-09-02T19:57:14.5044412Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/behance-square.svg  
2026-09-02T19:57:14.5047103Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/behance.svg  
2026-09-02T19:57:14.5047409Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bimobject.svg  
2026-09-02T19:57:14.5047695Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bitbucket.svg  
2026-09-02T19:57:14.5047966Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bitcoin.svg  
2026-09-02T19:57:14.5048245Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bity.svg  
2026-09-02T19:57:14.5048539Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/black-tie.svg  
2026-09-02T19:57:14.5048888Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/blackberry.svg  
2026-09-02T19:57:14.5049204Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/blogger-b.svg  
2026-09-02T19:57:14.5049572Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/blogger.svg  
2026-09-02T19:57:14.5049935Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bluetooth-b.svg  
2026-09-02T19:57:14.5050810Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bluetooth.svg  
2026-09-02T19:57:14.5054426Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/bootstrap.svg  
2026-09-02T19:57:14.5054889Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/btc.svg  
2026-09-02T19:57:14.5056821Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/buffer.svg  
2026-09-02T19:57:14.5057118Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/buromobelexperte.svg  
2026-09-02T19:57:14.5057405Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/buy-n-large.svg  
2026-09-02T19:57:14.5057744Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/buysellads.svg  
2026-09-02T19:57:14.5058036Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/canadian-maple-leaf.svg  
2026-09-02T19:57:14.5058340Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-amazon-pay.svg  
2026-09-02T19:57:14.5058799Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-amex.svg  
2026-09-02T19:57:14.5059213Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-apple-pay.svg  
2026-09-02T19:57:14.5061356Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-diners-club.svg  
2026-09-02T19:57:14.5061656Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-discover.svg  
2026-09-02T19:57:14.5062054Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-jcb.svg  
2026-09-02T19:57:14.5063857Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-mastercard.svg  
2026-09-02T19:57:14.5064141Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-paypal.svg  
2026-09-02T19:57:14.5064417Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-stripe.svg  
2026-09-02T19:57:14.5066291Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cc-visa.svg  
2026-09-02T19:57:14.5066594Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/centercode.svg  
2026-09-02T19:57:14.5066874Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/centos.svg  
2026-09-02T19:57:14.5067148Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/chrome.svg  
2026-09-02T19:57:14.5067426Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/chromecast.svg  
2026-09-02T19:57:14.5072302Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cloudflare.svg  
2026-09-02T19:57:14.5075816Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cloudscale.svg  
2026-09-02T19:57:14.5076100Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cloudsmith.svg  
2026-09-02T19:57:14.5076381Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cloudversify.svg  
2026-09-02T19:57:14.5076663Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/codepen.svg  
2026-09-02T19:57:14.5076945Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/codiepie.svg  
2026-09-02T19:57:14.5077419Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/confluence.svg  
2026-09-02T19:57:14.5077766Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/connectdevelop.svg  
2026-09-02T19:57:14.5078046Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/contao.svg  
2026-09-02T19:57:14.5078327Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cotton-bureau.svg  
2026-09-02T19:57:14.5078739Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cpanel.svg  
2026-09-02T19:57:14.5079047Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-by.svg  
2026-09-02T19:57:14.5083051Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-nc-eu.svg  
2026-09-02T19:57:14.5084005Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-nc-jp.svg  
2026-09-02T19:57:14.5084316Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-nc.svg  
2026-09-02T19:57:14.5084605Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-nd.svg  
2026-09-02T19:57:14.5084911Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-pd-alt.svg  
2026-09-02T19:57:14.5085212Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-pd.svg  
2026-09-02T19:57:14.5086576Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-remix.svg  
2026-09-02T19:57:14.5086882Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-sa.svg  
2026-09-02T19:57:14.5087226Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-sampling-plus.svg  
2026-09-02T19:57:14.5098019Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-sampling.svg  
2026-09-02T19:57:14.5098437Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-share.svg  
2026-09-02T19:57:14.5098818Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons-zero.svg  
2026-09-02T19:57:14.5099126Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/creative-commons.svg  
2026-09-02T19:57:14.5099415Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/critical-role.svg  
2026-09-02T19:57:14.5102940Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/css3-alt.svg  
2026-09-02T19:57:14.5103223Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/css3.svg  
2026-09-02T19:57:14.5103507Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/cuttlefish.svg  
2026-09-02T19:57:14.5103791Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/d-and-d-beyond.svg  
2026-09-02T19:57:14.5104602Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/d-and-d.svg  
2026-09-02T19:57:14.5104901Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dailymotion.svg  
2026-09-02T19:57:14.5105182Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dashcube.svg  
2026-09-02T19:57:14.5105624Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/deezer.svg  
2026-09-02T19:57:14.5105909Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/delicious.svg  
2026-09-02T19:57:14.5106600Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/deploydog.svg  
2026-09-02T19:57:14.5106878Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/deskpro.svg  
2026-09-02T19:57:14.5107150Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dev.svg  
2026-09-02T19:57:14.5107479Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/deviantart.svg  
2026-09-02T19:57:14.5107775Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dhl.svg  
2026-09-02T19:57:14.5111974Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/diaspora.svg  
2026-09-02T19:57:14.5112250Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/digg.svg  
2026-09-02T19:57:14.5114097Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/digital-ocean.svg  
2026-09-02T19:57:14.5114398Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/discord.svg  
2026-09-02T19:57:14.5116170Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/discourse.svg  
2026-09-02T19:57:14.5116464Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dochub.svg  
2026-09-02T19:57:14.5121002Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/docker.svg  
2026-09-02T19:57:14.5121308Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/draft2digital.svg  
2026-09-02T19:57:14.5121630Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dribbble-square.svg  
2026-09-02T19:57:14.5121913Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dribbble.svg  
2026-09-02T19:57:14.5122188Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dropbox.svg  
2026-09-02T19:57:14.5122458Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/drupal.svg  
2026-09-02T19:57:14.5122731Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/dyalog.svg  
2026-09-02T19:57:14.5123002Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/earlybirds.svg  
2026-09-02T19:57:14.5129026Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ebay.svg  
2026-09-02T19:57:14.5133285Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/edge-legacy.svg  
2026-09-02T19:57:14.5133620Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/edge.svg  
2026-09-02T19:57:14.5133900Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/elementor.svg  
2026-09-02T19:57:14.5134173Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ello.svg  
2026-09-02T19:57:14.5134452Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ember.svg  
2026-09-02T19:57:14.5134854Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/empire.svg  
2026-09-02T19:57:14.5137154Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/envira.svg  
2026-09-02T19:57:14.5137431Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/erlang.svg  
2026-09-02T19:57:14.5137703Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ethereum.svg  
2026-09-02T19:57:14.5137980Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/etsy.svg  
2026-09-02T19:57:14.5138421Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/evernote.svg  
2026-09-02T19:57:14.5140251Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/expeditedssl.svg  
2026-09-02T19:57:14.5140598Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/facebook-f.svg  
2026-09-02T19:57:14.5140892Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/facebook-messenger.svg  
2026-09-02T19:57:14.5141185Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/facebook-square.svg  
2026-09-02T19:57:14.5141465Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/facebook.svg  
2026-09-02T19:57:14.5141759Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fantasy-flight-games.svg  
2026-09-02T19:57:14.5142040Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fedex.svg  
2026-09-02T19:57:14.5142315Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fedora.svg  
2026-09-02T19:57:14.5146913Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/figma.svg  
2026-09-02T19:57:14.5158158Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/firefox-browser.svg  
2026-09-02T19:57:14.5159977Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/firefox.svg  
2026-09-02T19:57:14.5160265Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/first-order-alt.svg  
2026-09-02T19:57:14.5160552Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/first-order.svg  
2026-09-02T19:57:14.5160841Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/firstdraft.svg  
2026-09-02T19:57:14.5161126Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/flickr.svg  
2026-09-02T19:57:14.5161404Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/flipboard.svg  
2026-09-02T19:57:14.5161680Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fly.svg  
2026-09-02T19:57:14.5161966Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/font-awesome-alt.svg  
2026-09-02T19:57:14.5162259Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/font-awesome-flag.svg  
2026-09-02T19:57:14.5162555Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/font-awesome-logo-full.svg  
2026-09-02T19:57:14.5162872Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/font-awesome.svg  
2026-09-02T19:57:14.5163154Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fonticons-fi.svg  
2026-09-02T19:57:14.5163437Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fonticons.svg  
2026-09-02T19:57:14.5163802Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fort-awesome-alt.svg  
2026-09-02T19:57:14.5164085Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fort-awesome.svg  
2026-09-02T19:57:14.5164363Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/forumbee.svg  
2026-09-02T19:57:14.5164641Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/foursquare.svg  
2026-09-02T19:57:14.5164926Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/free-code-camp.svg  
2026-09-02T19:57:14.5174616Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/freebsd.svg  
2026-09-02T19:57:14.5183434Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/fulcrum.svg  
2026-09-02T19:57:14.5184539Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/galactic-republic.svg  
2026-09-02T19:57:14.5184834Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/galactic-senate.svg  
2026-09-02T19:57:14.5185120Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/get-pocket.svg  
2026-09-02T19:57:14.5185401Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gg-circle.svg  
2026-09-02T19:57:14.5185674Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gg.svg  
2026-09-02T19:57:14.5185963Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/git-alt.svg  
2026-09-02T19:57:14.5186602Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/git-square.svg  
2026-09-02T19:57:14.5189989Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/git.svg  
2026-09-02T19:57:14.5190274Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/github-alt.svg  
2026-09-02T19:57:14.5190576Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/github-square.svg  
2026-09-02T19:57:14.5190856Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/github.svg  
2026-09-02T19:57:14.5191135Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gitkraken.svg  
2026-09-02T19:57:14.5191429Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gitlab.svg  
2026-09-02T19:57:14.5191703Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gitter.svg  
2026-09-02T19:57:14.5191980Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/glide-g.svg  
2026-09-02T19:57:14.5192253Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/glide.svg  
2026-09-02T19:57:14.5192524Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gofore.svg  
2026-09-02T19:57:14.5192804Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/goodreads-g.svg  
2026-09-02T19:57:14.5193085Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/goodreads.svg  
2026-09-02T19:57:14.5193373Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-drive.svg  
2026-09-02T19:57:14.5193812Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-pay.svg  
2026-09-02T19:57:14.5194237Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-play.svg  
2026-09-02T19:57:14.5194620Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-plus-g.svg  
2026-09-02T19:57:14.5195007Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-plus-square.svg  
2026-09-02T19:57:14.5195403Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-plus.svg  
2026-09-02T19:57:14.5195784Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google-wallet.svg  
2026-09-02T19:57:14.5196260Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/google.svg  
2026-09-02T19:57:14.5196645Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gratipay.svg  
2026-09-02T19:57:14.5197048Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/grav.svg  
2026-09-02T19:57:14.5204071Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gripfire.svg  
2026-09-02T19:57:14.5204403Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/grunt.svg  
2026-09-02T19:57:14.5204723Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/guilded.svg  
2026-09-02T19:57:14.5205000Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/gulp.svg  
2026-09-02T19:57:14.5205296Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hacker-news-square.svg  
2026-09-02T19:57:14.5205584Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hacker-news.svg  
2026-09-02T19:57:14.5205863Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hackerrank.svg  
2026-09-02T19:57:14.5206169Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hips.svg  
2026-09-02T19:57:14.5206616Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hire-a-helper.svg  
2026-09-02T19:57:14.5208851Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hive.svg  
2026-09-02T19:57:14.5209145Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hooli.svg  
2026-09-02T19:57:14.5209428Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hornbill.svg  
2026-09-02T19:57:14.5209707Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hotjar.svg  
2026-09-02T19:57:14.5209978Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/houzz.svg  
2026-09-02T19:57:14.5210253Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/html5.svg  
2026-09-02T19:57:14.5210526Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/hubspot.svg  
2026-09-02T19:57:14.5210800Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ideal.svg  
2026-09-02T19:57:14.5211092Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/imdb.svg  
2026-09-02T19:57:14.5214539Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/innosoft.svg  
2026-09-02T19:57:14.5217343Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/instagram-square.svg  
2026-09-02T19:57:14.5217760Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/instagram.svg  
2026-09-02T19:57:14.5218085Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/instalod.svg  
2026-09-02T19:57:14.5218359Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/intercom.svg  
2026-09-02T19:57:14.5218755Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/internet-explorer.svg  
2026-09-02T19:57:14.5219054Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/invision.svg  
2026-09-02T19:57:14.5220529Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ioxhost.svg  
2026-09-02T19:57:14.5221900Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/itch-io.svg  
2026-09-02T19:57:14.5224538Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/itunes-note.svg  
2026-09-02T19:57:14.5224850Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/itunes.svg  
2026-09-02T19:57:14.5227729Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/java.svg  
2026-09-02T19:57:14.5228012Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/jedi-order.svg  
2026-09-02T19:57:14.5228293Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/jenkins.svg  
2026-09-02T19:57:14.5235988Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/jira.svg  
2026-09-02T19:57:14.5236276Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/joget.svg  
2026-09-02T19:57:14.5236559Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/joomla.svg  
2026-09-02T19:57:14.5236839Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/js-square.svg  
2026-09-02T19:57:14.5237114Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/js.svg  
2026-09-02T19:57:14.5239129Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/jsfiddle.svg  
2026-09-02T19:57:14.5239432Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/kaggle.svg  
2026-09-02T19:57:14.5239714Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/keybase.svg  
2026-09-02T19:57:14.5239992Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/keycdn.svg  
2026-09-02T19:57:14.5240276Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/kickstarter-k.svg  
2026-09-02T19:57:14.5240561Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/kickstarter.svg  
2026-09-02T19:57:14.5243666Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/korvue.svg  
2026-09-02T19:57:14.5243948Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/laravel.svg  
2026-09-02T19:57:14.5244229Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/lastfm-square.svg  
2026-09-02T19:57:14.5244566Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/lastfm.svg  
2026-09-02T19:57:14.5246655Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/leanpub.svg  
2026-09-02T19:57:14.5247073Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/less.svg  
2026-09-02T19:57:14.5247343Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/line.svg  
2026-09-02T19:57:14.5250984Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/linkedin-in.svg  
2026-09-02T19:57:14.5251321Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/linkedin.svg  
2026-09-02T19:57:14.5253011Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/linode.svg  
2026-09-02T19:57:14.5253329Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/linux.svg  
2026-09-02T19:57:14.5253603Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/lyft.svg  
2026-09-02T19:57:14.5257678Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/magento.svg  
2026-09-02T19:57:14.5257969Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mailchimp.svg  
2026-09-02T19:57:14.5261437Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mandalorian.svg  
2026-09-02T19:57:14.5261734Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/markdown.svg  
2026-09-02T19:57:14.5262020Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mastodon.svg  
2026-09-02T19:57:14.5263636Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/maxcdn.svg  
2026-09-02T19:57:14.5263915Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mdb.svg  
2026-09-02T19:57:14.5264191Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/medapps.svg  
2026-09-02T19:57:14.5264466Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/medium-m.svg  
2026-09-02T19:57:14.5264740Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/medium.svg  
2026-09-02T19:57:14.5265013Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/medrt.svg  
2026-09-02T19:57:14.5269845Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/meetup.svg  
2026-09-02T19:57:14.5273841Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/megaport.svg  
2026-09-02T19:57:14.5274125Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mendeley.svg  
2026-09-02T19:57:14.5274407Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/microblog.svg  
2026-09-02T19:57:14.5274688Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/microsoft.svg  
2026-09-02T19:57:14.5274962Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mix.svg  
2026-09-02T19:57:14.5275235Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mixcloud.svg  
2026-09-02T19:57:14.5277049Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mixer.svg  
2026-09-02T19:57:14.5277737Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/mizuni.svg  
2026-09-02T19:57:14.5280816Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/modx.svg  
2026-09-02T19:57:14.5281167Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/monero.svg  
2026-09-02T19:57:14.5281445Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/napster.svg  
2026-09-02T19:57:14.5283308Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/neos.svg  
2026-09-02T19:57:14.5283596Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/nimblr.svg  
2026-09-02T19:57:14.5283873Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/node-js.svg  
2026-09-02T19:57:14.5284192Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/node.svg  
2026-09-02T19:57:14.5284462Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/npm.svg  
2026-09-02T19:57:14.5284793Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ns8.svg  
2026-09-02T19:57:14.5289600Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/nutritionix.svg  
2026-09-02T19:57:14.5289895Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/octopus-deploy.svg  
2026-09-02T19:57:14.5290195Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/odnoklassniki-square.svg  
2026-09-02T19:57:14.5290540Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/odnoklassniki.svg  
2026-09-02T19:57:14.5293622Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/old-republic.svg  
2026-09-02T19:57:14.5293928Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/opencart.svg  
2026-09-02T19:57:14.5294205Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/openid.svg  
2026-09-02T19:57:14.5294478Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/opera.svg  
2026-09-02T19:57:14.5294757Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/optin-monster.svg  
2026-09-02T19:57:14.5297873Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/orcid.svg  
2026-09-02T19:57:14.5304156Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/osi.svg  
2026-09-02T19:57:14.5304469Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/page4.svg  
2026-09-02T19:57:14.5304756Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pagelines.svg  
2026-09-02T19:57:14.5305048Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/palfed.svg  
2026-09-02T19:57:14.5305330Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/patreon.svg  
2026-09-02T19:57:14.5305608Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/paypal.svg  
2026-09-02T19:57:14.5309806Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/penny-arcade.svg  
2026-09-02T19:57:14.5310164Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/perbyte.svg  
2026-09-02T19:57:14.5310455Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/periscope.svg  
2026-09-02T19:57:14.5310745Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/phabricator.svg  
2026-09-02T19:57:14.5313509Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/phoenix-framework.svg  
2026-09-02T19:57:14.5318056Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/phoenix-squadron.svg  
2026-09-02T19:57:14.5326120Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/php.svg  
2026-09-02T19:57:14.5326448Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pied-piper-alt.svg  
2026-09-02T19:57:14.5328893Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pied-piper-hat.svg  
2026-09-02T19:57:14.5329393Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pied-piper-pp.svg  
2026-09-02T19:57:14.5329817Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pied-piper-square.svg  
2026-09-02T19:57:14.5331219Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pied-piper.svg  
2026-09-02T19:57:14.5331630Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pinterest-p.svg  
2026-09-02T19:57:14.5332475Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pinterest-square.svg  
2026-09-02T19:57:14.5332765Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pinterest.svg  
2026-09-02T19:57:14.5333054Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/playstation.svg  
2026-09-02T19:57:14.5334394Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/product-hunt.svg  
2026-09-02T19:57:14.5334691Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/pushed.svg  
2026-09-02T19:57:14.5335007Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/python.svg  
2026-09-02T19:57:14.5337327Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/qq.svg  
2026-09-02T19:57:14.5340338Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/quinscape.svg  
2026-09-02T19:57:14.5340629Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/quora.svg  
2026-09-02T19:57:14.5340904Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/r-project.svg  
2026-09-02T19:57:14.5344967Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/raspberry-pi.svg  
2026-09-02T19:57:14.5345765Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ravelry.svg  
2026-09-02T19:57:14.5348714Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/react.svg  
2026-09-02T19:57:14.5349122Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/reacteurope.svg  
2026-09-02T19:57:14.5349480Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/readme.svg  
2026-09-02T19:57:14.5353108Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/rebel.svg  
2026-09-02T19:57:14.5355095Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/red-river.svg  
2026-09-02T19:57:14.5355731Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/reddit-alien.svg  
2026-09-02T19:57:14.5356047Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/reddit-square.svg  
2026-09-02T19:57:14.5359867Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/reddit.svg  
2026-09-02T19:57:14.5360152Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/redhat.svg  
2026-09-02T19:57:14.5360425Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/renren.svg  
2026-09-02T19:57:14.5363799Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/replyd.svg  
2026-09-02T19:57:14.5364721Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/researchgate.svg  
2026-09-02T19:57:14.5365181Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/resolving.svg  
2026-09-02T19:57:14.5368273Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/rev.svg  
2026-09-02T19:57:14.5368839Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/rocketchat.svg  
2026-09-02T19:57:14.5369336Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/rockrms.svg  
2026-09-02T19:57:14.5370916Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/rust.svg  
2026-09-02T19:57:14.5375245Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/safari.svg  
2026-09-02T19:57:14.5375559Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/salesforce.svg  
2026-09-02T19:57:14.5380230Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sass.svg  
2026-09-02T19:57:14.5380521Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/schlix.svg  
2026-09-02T19:57:14.5380807Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/scribd.svg  
2026-09-02T19:57:14.5385538Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/searchengin.svg  
2026-09-02T19:57:14.5385833Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sellcast.svg  
2026-09-02T19:57:14.5386112Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sellsy.svg  
2026-09-02T19:57:14.5386395Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/servicestack.svg  
2026-09-02T19:57:14.5390251Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/shirtsinbulk.svg  
2026-09-02T19:57:14.5390540Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/shopify.svg  
2026-09-02T19:57:14.5393239Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/shopware.svg  
2026-09-02T19:57:14.5393523Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/simplybuilt.svg  
2026-09-02T19:57:14.5398351Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sistrix.svg  
2026-09-02T19:57:14.5398941Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sith.svg  
2026-09-02T19:57:14.5400788Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sketch.svg  
2026-09-02T19:57:14.5401083Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/skyatlas.svg  
2026-09-02T19:57:14.5401368Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/skype.svg  
2026-09-02T19:57:14.5401810Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/slack-hash.svg  
2026-09-02T19:57:14.5405496Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/slack.svg  
2026-09-02T19:57:14.5405789Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/slideshare.svg  
2026-09-02T19:57:14.5411855Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/snapchat-ghost.svg  
2026-09-02T19:57:14.5412237Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/snapchat-square.svg  
2026-09-02T19:57:14.5414305Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/snapchat.svg  
2026-09-02T19:57:14.5414586Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/soundcloud.svg  
2026-09-02T19:57:14.5414956Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sourcetree.svg  
2026-09-02T19:57:14.5415360Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/speakap.svg  
2026-09-02T19:57:14.5416883Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/speaker-deck.svg  
2026-09-02T19:57:14.5417236Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/spotify.svg  
2026-09-02T19:57:14.5417514Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/squarespace.svg  
2026-09-02T19:57:14.5418452Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stack-exchange.svg  
2026-09-02T19:57:14.5419084Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stack-overflow.svg  
2026-09-02T19:57:14.5419407Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stackpath.svg  
2026-09-02T19:57:14.5421452Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/staylinked.svg  
2026-09-02T19:57:14.5425147Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/steam-square.svg  
2026-09-02T19:57:14.5425445Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/steam-symbol.svg  
2026-09-02T19:57:14.5428922Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/steam.svg  
2026-09-02T19:57:14.5429281Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/sticker-mule.svg  
2026-09-02T19:57:14.5430688Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/strava.svg  
2026-09-02T19:57:14.5431219Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stripe-s.svg  
2026-09-02T19:57:14.5497376Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stripe.svg  
2026-09-02T19:57:14.5497839Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/studiovinari.svg  
2026-09-02T19:57:14.5499852Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stumbleupon-circle.svg  
2026-09-02T19:57:14.5500477Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/stumbleupon.svg  
2026-09-02T19:57:14.5502407Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/superpowers.svg  
2026-09-02T19:57:14.5505583Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/supple.svg  
2026-09-02T19:57:14.5506446Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/suse.svg  
2026-09-02T19:57:14.5507081Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/swift.svg  
2026-09-02T19:57:14.5512345Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/symfony.svg  
2026-09-02T19:57:14.5512977Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/teamspeak.svg  
2026-09-02T19:57:14.5513270Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/telegram-plane.svg  
2026-09-02T19:57:14.5513645Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/telegram.svg  
2026-09-02T19:57:14.5513945Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/tencent-weibo.svg  
2026-09-02T19:57:14.5514241Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/the-red-yeti.svg  
2026-09-02T19:57:14.5514522Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/themeco.svg  
2026-09-02T19:57:14.5514800Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/themeisle.svg  
2026-09-02T19:57:14.5515081Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/think-peaks.svg  
2026-09-02T19:57:14.5515358Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/tiktok.svg  
2026-09-02T19:57:14.5515651Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/trade-federation.svg  
2026-09-02T19:57:14.5515938Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/trello.svg  
2026-09-02T19:57:14.5516222Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/tumblr-square.svg  
2026-09-02T19:57:14.5516502Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/tumblr.svg  
2026-09-02T19:57:14.5516776Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/twitch.svg  
2026-09-02T19:57:14.5517056Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/twitter-square.svg  
2026-09-02T19:57:14.5517335Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/twitter.svg  
2026-09-02T19:57:14.5517615Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/typo3.svg  
2026-09-02T19:57:14.5517890Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/uber.svg  
2026-09-02T19:57:14.5518163Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ubuntu.svg  
2026-09-02T19:57:14.5518433Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/uikit.svg  
2026-09-02T19:57:14.5518854Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/umbraco.svg  
2026-09-02T19:57:14.5519191Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/uncharted.svg  
2026-09-02T19:57:14.5519471Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/uniregistry.svg  
2026-09-02T19:57:14.5519749Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/unity.svg  
2026-09-02T19:57:14.5520065Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/unsplash.svg  
2026-09-02T19:57:14.5520338Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/untappd.svg  
2026-09-02T19:57:14.5520605Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ups.svg  
2026-09-02T19:57:14.5520869Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/usb.svg  
2026-09-02T19:57:14.5521141Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/usps.svg  
2026-09-02T19:57:14.5521415Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/ussunnah.svg  
2026-09-02T19:57:14.5521724Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vaadin.svg  
2026-09-02T19:57:14.5521995Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/viacoin.svg  
2026-09-02T19:57:14.5522277Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/viadeo-square.svg  
2026-09-02T19:57:14.5522552Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/viadeo.svg  
2026-09-02T19:57:14.5522824Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/viber.svg  
2026-09-02T19:57:14.5523101Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vimeo-square.svg  
2026-09-02T19:57:14.5523377Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vimeo-v.svg  
2026-09-02T19:57:14.5523657Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vimeo.svg  
2026-09-02T19:57:14.5523923Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vine.svg  
2026-09-02T19:57:14.5524198Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vk.svg  
2026-09-02T19:57:14.5524464Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vnv.svg  
2026-09-02T19:57:14.5524737Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/vuejs.svg  
2026-09-02T19:57:14.5620566Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/watchman-monitoring.svg  
2026-09-02T19:57:14.5621198Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/waze.svg  
2026-09-02T19:57:14.5623819Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/weebly.svg  
2026-09-02T19:57:14.5624423Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/weibo.svg  
2026-09-02T19:57:14.5624732Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/weixin.svg  
2026-09-02T19:57:14.5625027Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/whatsapp-square.svg  
2026-09-02T19:57:14.5625320Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/whatsapp.svg  
2026-09-02T19:57:14.5625595Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/whmcs.svg  
2026-09-02T19:57:14.5625882Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wikipedia-w.svg  
2026-09-02T19:57:14.5626175Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/windows.svg  
2026-09-02T19:57:14.5626448Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wix.svg  
2026-09-02T19:57:14.5627021Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wizards-of-the-coast.svg  
2026-09-02T19:57:14.5627310Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wodu.svg  
2026-09-02T19:57:14.5627605Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wolf-pack-battalion.svg  
2026-09-02T19:57:14.5627899Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wordpress-simple.svg  
2026-09-02T19:57:14.5628187Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wordpress.svg  
2026-09-02T19:57:14.5628534Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wpbeginner.svg  
2026-09-02T19:57:14.5628918Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wpexplorer.svg  
2026-09-02T19:57:14.5629236Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wpforms.svg  
2026-09-02T19:57:14.5629515Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/wpressr.svg  
2026-09-02T19:57:14.5629785Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/xbox.svg  
2026-09-02T19:57:14.5630068Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/xing-square.svg  
2026-09-02T19:57:14.5630345Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/xing.svg  
2026-09-02T19:57:14.5630630Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/y-combinator.svg  
2026-09-02T19:57:14.5630933Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yahoo.svg  
2026-09-02T19:57:14.5631208Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yammer.svg  
2026-09-02T19:57:14.5631580Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yandex-international.svg  
2026-09-02T19:57:14.5631985Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yandex.svg  
2026-09-02T19:57:14.5632371Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yarn.svg  
2026-09-02T19:57:14.5632647Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yelp.svg  
2026-09-02T19:57:14.5632926Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/yoast.svg  
2026-09-02T19:57:14.5633208Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/youtube-square.svg  
2026-09-02T19:57:14.5633494Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/youtube.svg  
2026-09-02T19:57:14.5633775Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/brands/zhihu.svg  
2026-09-02T19:57:14.5634046Z    creating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/
2026-09-02T19:57:14.5634328Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/address-book.svg  
2026-09-02T19:57:14.5634617Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/address-card.svg  
2026-09-02T19:57:14.5634901Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/angry.svg  
2026-09-02T19:57:14.5635193Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/arrow-alt-circle-down.svg  
2026-09-02T19:57:14.5635544Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/arrow-alt-circle-left.svg  
2026-09-02T19:57:14.5635840Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/arrow-alt-circle-right.svg  
2026-09-02T19:57:14.5790493Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/arrow-alt-circle-up.svg  
2026-09-02T19:57:14.5791507Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/bell-slash.svg  
2026-09-02T19:57:14.5791846Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/bell.svg  
2026-09-02T19:57:14.5792408Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/bookmark.svg  
2026-09-02T19:57:14.5793000Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/building.svg  
2026-09-02T19:57:14.5794014Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar-alt.svg  
2026-09-02T19:57:14.5794663Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar-check.svg  
2026-09-02T19:57:14.5794978Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar-minus.svg  
2026-09-02T19:57:14.5795329Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar-plus.svg  
2026-09-02T19:57:14.5795641Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar-times.svg  
2026-09-02T19:57:14.5795978Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/calendar.svg  
2026-09-02T19:57:14.5796940Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/caret-square-down.svg  
2026-09-02T19:57:14.5797248Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/caret-square-left.svg  
2026-09-02T19:57:14.5797544Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/caret-square-right.svg  
2026-09-02T19:57:14.5797837Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/caret-square-up.svg  
2026-09-02T19:57:14.5798176Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/chart-bar.svg  
2026-09-02T19:57:14.5798480Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/check-circle.svg  
2026-09-02T19:57:14.5799493Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/check-square.svg  
2026-09-02T19:57:14.5799781Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/circle.svg  
2026-09-02T19:57:14.5800769Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/clipboard.svg  
2026-09-02T19:57:14.5801111Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/clock.svg  
2026-09-02T19:57:14.5802095Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/clone.svg  
2026-09-02T19:57:14.5802385Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/closed-captioning.svg  
2026-09-02T19:57:14.5802674Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/comment-alt.svg  
2026-09-02T19:57:14.5803590Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/comment-dots.svg  
2026-09-02T19:57:14.5803967Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/comment.svg  
2026-09-02T19:57:14.5804247Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/comments.svg  
2026-09-02T19:57:14.5804557Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/compass.svg  
2026-09-02T19:57:14.5804835Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/copy.svg  
2026-09-02T19:57:14.5805116Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/copyright.svg  
2026-09-02T19:57:14.5805441Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/credit-card.svg  
2026-09-02T19:57:14.5805720Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/dizzy.svg  
2026-09-02T19:57:14.5806000Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/dot-circle.svg  
2026-09-02T19:57:14.5806279Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/edit.svg  
2026-09-02T19:57:14.5806558Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/envelope-open.svg  
2026-09-02T19:57:14.5806836Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/envelope.svg  
2026-09-02T19:57:14.5807112Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/eye-slash.svg  
2026-09-02T19:57:14.5807385Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/eye.svg  
2026-09-02T19:57:14.5807659Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-alt.svg  
2026-09-02T19:57:14.5807941Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-archive.svg  
2026-09-02T19:57:14.5808254Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-audio.svg  
2026-09-02T19:57:14.5808537Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-code.svg  
2026-09-02T19:57:14.5808944Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-excel.svg  
2026-09-02T19:57:14.5809228Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-image.svg  
2026-09-02T19:57:14.5809588Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-pdf.svg  
2026-09-02T19:57:14.5810029Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-powerpoint.svg  
2026-09-02T19:57:14.5810321Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-video.svg  
2026-09-02T19:57:14.5810600Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file-word.svg  
2026-09-02T19:57:14.5810874Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/file.svg  
2026-09-02T19:57:14.5811144Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/flag.svg  
2026-09-02T19:57:14.5811415Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/flushed.svg  
2026-09-02T19:57:14.5811701Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/folder-open.svg  
2026-09-02T19:57:14.5812024Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/folder.svg  
2026-09-02T19:57:14.5812324Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/font-awesome-logo-full.svg  
2026-09-02T19:57:14.5812669Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/frown-open.svg  
2026-09-02T19:57:14.5813527Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/frown.svg  
2026-09-02T19:57:14.5813808Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/futbol.svg  
2026-09-02T19:57:14.5814081Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/gem.svg  
2026-09-02T19:57:14.5814405Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grimace.svg  
2026-09-02T19:57:14.5814688Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-alt.svg  
2026-09-02T19:57:14.5814973Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-beam-sweat.svg  
2026-09-02T19:57:14.5815259Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-beam.svg  
2026-09-02T19:57:14.5815539Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-hearts.svg  
2026-09-02T19:57:14.5815828Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-squint-tears.svg  
2026-09-02T19:57:14.5816206Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-squint.svg  
2026-09-02T19:57:14.5816637Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-stars.svg  
2026-09-02T19:57:14.5816966Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-tears.svg  
2026-09-02T19:57:14.5817257Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-tongue-squint.svg  
2026-09-02T19:57:14.5817545Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-tongue-wink.svg  
2026-09-02T19:57:14.5817831Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-tongue.svg  
2026-09-02T19:57:14.5818109Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin-wink.svg  
2026-09-02T19:57:14.5818379Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/grin.svg  
2026-09-02T19:57:14.5818718Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/hand-lizard.svg  
2026-09-02T19:57:14.5819066Z   inflating: /opt/app-root/src/dist/SIMPF-frontend/assets/lib/fontawesome-free-5.15.4-web/svgs/regular/hand-p



2026-09-02T19:57:24.6951925Z ##[section]Starting: Cadastrar imagem no Infradevops
2026-09-02T19:57:24.6956779Z ==============================================================================
2026-09-02T19:57:24.6956922Z Task         : Bash
2026-09-02T19:57:24.6957000Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-02T19:57:24.6957088Z Version      : 3.227.0
2026-09-02T19:57:24.6957150Z Author       : Microsoft Corporation
2026-09-02T19:57:24.6957232Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-02T19:57:24.6957314Z ==============================================================================
2026-09-02T19:57:24.8702698Z Generating script.
2026-09-02T19:57:24.8713529Z ========================== Starting Command Output ===========================
2026-09-02T19:57:24.8721492Z [command]/bin/bash /opt/ads-agent/_work/_temp/e59fa6a1-7c26-4f6f-bb4f-59fc9e8935f4.sh
2026-09-02T19:57:24.9203360Z Hash da imagem no OpenShift:
2026-09-02T19:57:24.9203601Z sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-09-02T19:57:24.9204099Z sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-09-02T19:57:24.9681794Z Resultado JSON
2026-09-02T19:57:24.9682322Z {
2026-09-02T19:57:24.9683469Z   "HOME": "/opt/app-root/src",
2026-09-02T19:57:24.9683705Z   "NGINX_VERSION": "1.18",
2026-09-02T19:57:24.9684045Z   "NGINX_LOG_PATH": "/var/log/nginx",
2026-09-02T19:57:24.9684843Z   "NGINX_PERL_MODULE_PATH": "/opt/app-root/etc/perl",
2026-09-02T19:57:24.9685037Z   "TZ": "America/Sao_Paulo"
2026-09-02T19:57:24.9685149Z }
2026-09-02T19:57:24.9721773Z * Uses proxy env variable NO_PROXY == 'infradevops-api.apl.caixa,10.122.144.195,10.122.144.130,10.221.144.17,cadsvgerap004-1.intra.caixa.gov.br,devops.caixa,cadsvgerap028-1.intra.caixa.gov.br,infradevops-novoportal-backend-esteiras.apl.caixa,infradevops-novoportal-backend-prd.apps.produtos4.caixa,binario.caixa,api.produtos4.caixa'
2026-09-02T19:57:24.9723755Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-02T19:57:24.9724076Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-02T19:57:24.9724354Z 
2026-09-02T19:57:24.9749985Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0*   Trying 10.121.110.5:80...
2026-09-02T19:57:24.9756765Z * Connected to infradevops-api.apl.caixa (10.121.110.5) port 80 (#0)
2026-09-02T19:57:24.9757104Z > PUT /api.php?acao=cadastrarImagem HTTP/1.1
2026-09-02T19:57:24.9757388Z > Host: infradevops-api.apl.caixa
2026-09-02T19:57:24.9757725Z > User-Agent: curl/7.76.1
2026-09-02T19:57:24.9758237Z > Accept: */*
2026-09-02T19:57:24.9758557Z > Content-Type: application/json
2026-09-02T19:57:24.9758864Z > Content-Length: 319
2026-09-02T19:57:24.9758991Z > 
2026-09-02T19:57:24.9759095Z } [319 bytes data]
2026-09-02T19:57:24.9778486Z * Mark bundle as not supporting multiuse
2026-09-02T19:57:24.9778877Z * HTTP 1.0, assume close after body
2026-09-02T19:57:24.9779141Z < HTTP/1.0 503 Service Unavailable
2026-09-02T19:57:24.9779615Z < pragma: no-cache
2026-09-02T19:57:24.9779840Z < cache-control: private, max-age=0, no-cache, no-store
2026-09-02T19:57:24.9780018Z < Content-Type: text/html
2026-09-02T19:57:24.9780119Z < 
2026-09-02T19:57:24.9780224Z { [1196 bytes data]
2026-09-02T19:57:24.9780282Z 
2026-09-02T19:57:24.9780530Z 100  2822    0  2503  100   319   488k  63800 --:--:-- --:--:-- --:--:--  551k
2026-09-02T19:57:24.9780695Z * Closing connection 0
2026-09-02T19:57:24.9781201Z <html>
2026-09-02T19:57:24.9781308Z   <head>
2026-09-02T19:57:24.9781514Z     <meta name="viewport" content="width=device-width, initial-scale=1">
2026-09-02T19:57:24.9781592Z 
2026-09-02T19:57:24.9781703Z     <style type="text/css">
2026-09-02T19:57:24.9781821Z       body {
2026-09-02T19:57:24.9782171Z         font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
2026-09-02T19:57:24.9782361Z         line-height: 1.66666667;
2026-09-02T19:57:24.9782512Z         font-size: 16px;
2026-09-02T19:57:24.9782622Z         color: #333;
2026-09-02T19:57:24.9783079Z         background-color: #fff;
2026-09-02T19:57:24.9783200Z         margin: 2em 1em;
2026-09-02T19:57:24.9783304Z       }
2026-09-02T19:57:24.9783402Z       h1 {
2026-09-02T19:57:24.9783533Z         font-size: 28px;
2026-09-02T19:57:24.9783685Z         font-weight: 400;
2026-09-02T19:57:24.9783790Z       }
2026-09-02T19:57:24.9783884Z       p {
2026-09-02T19:57:24.9783989Z         margin: 0 0 10px;
2026-09-02T19:57:24.9784107Z       }
2026-09-02T19:57:24.9784248Z       .alert.alert-info {
2026-09-02T19:57:24.9784409Z         background-color: #F0F0F0;
2026-09-02T19:57:24.9784564Z         margin-top: 30px;
2026-09-02T19:57:24.9784675Z         padding: 30px;
2026-09-02T19:57:24.9784776Z       }
2026-09-02T19:57:24.9784876Z       .alert p {
2026-09-02T19:57:24.9785025Z         padding-left: 35px;
2026-09-02T19:57:24.9785129Z       }
2026-09-02T19:57:24.9785218Z       ul {
2026-09-02T19:57:24.9785370Z         padding-left: 51px;
2026-09-02T19:57:24.9785485Z         position: relative;
2026-09-02T19:57:24.9785659Z       }
2026-09-02T19:57:24.9785752Z       li {
2026-09-02T19:57:24.9785890Z         font-size: 14px;
2026-09-02T19:57:24.9786041Z         margin-bottom: 1em;
2026-09-02T19:57:24.9786142Z       }
2026-09-02T19:57:24.9786239Z       p.info {
2026-09-02T19:57:24.9786346Z         position: relative;
2026-09-02T19:57:24.9786514Z         font-size: 20px;
2026-09-02T19:57:24.9786612Z       }
2026-09-02T19:57:24.9786730Z       p.info:before, p.info:after {
2026-09-02T19:57:24.9786850Z         content: "";
2026-09-02T19:57:24.9786947Z         left: 0;
2026-09-02T19:57:24.9787054Z         position: absolute;
2026-09-02T19:57:24.9787162Z         top: 0;
2026-09-02T19:57:24.9787262Z       }
2026-09-02T19:57:24.9787367Z       p.info:before {
2026-09-02T19:57:24.9787485Z         background: #0066CC;
2026-09-02T19:57:24.9787648Z         border-radius: 16px;
2026-09-02T19:57:24.9787760Z         color: #fff;
2026-09-02T19:57:24.9787867Z         content: "i";
2026-09-02T19:57:24.9787981Z         font: bold 16px/24px serif;
2026-09-02T19:57:24.9788096Z         height: 24px;
2026-09-02T19:57:24.9788201Z         left: 0px;
2026-09-02T19:57:24.9788351Z         text-align: center;
2026-09-02T19:57:24.9788463Z         top: 4px;
2026-09-02T19:57:24.9788644Z         width: 24px;
2026-09-02T19:57:24.9788804Z       }
2026-09-02T19:57:24.9788856Z 
2026-09-02T19:57:24.9789019Z       @media (min-width: 768px) {
2026-09-02T19:57:24.9789135Z         body {
2026-09-02T19:57:24.9789241Z           margin: 6em;
2026-09-02T19:57:24.9789344Z         }
2026-09-02T19:57:24.9789430Z       }
2026-09-02T19:57:24.9789525Z     </style>
2026-09-02T19:57:24.9789624Z   </head>
2026-09-02T19:57:24.9789722Z   <body>
2026-09-02T19:57:24.9789818Z     <div>
2026-09-02T19:57:24.9789931Z       <h1>Application is not available</h1>
2026-09-02T19:57:24.9790109Z       <p>The application is currently not serving requests at this endpoint. It may not have been started or is still starting.</p>
2026-09-02T19:57:24.9790204Z 
2026-09-02T19:57:24.9790365Z       <div class="alert alert-info">
2026-09-02T19:57:24.9790486Z         <p class="info">
2026-09-02T19:57:24.9790615Z           Possible reasons you are seeing this page:
2026-09-02T19:57:24.9790735Z         </p>
2026-09-02T19:57:24.9790833Z         <ul>
2026-09-02T19:57:24.9790995Z           <li>
2026-09-02T19:57:24.9791256Z             <strong>The host doesn't exist.</strong>
2026-09-02T19:57:24.9791425Z             Make sure the hostname was typed correctly and that a route matching this hostname exists.
2026-09-02T19:57:24.9791570Z           </li>
2026-09-02T19:57:24.9791668Z           <li>
2026-09-02T19:57:24.9791874Z             <strong>The host exists, but doesn't have a matching path.</strong>
2026-09-02T19:57:24.9792053Z             Check if the URL path was typed correctly and that the route was created using the desired path.
2026-09-02T19:57:24.9792192Z           </li>
2026-09-02T19:57:24.9792289Z           <li>
2026-09-02T19:57:24.9792416Z             <strong>Route and path matches, but all pods are down.</strong>
2026-09-02T19:57:24.9792675Z             Make sure that the resources exposed by this route (pods, services, deployment configs, etc) have at least one pod running.
2026-09-02T19:57:24.9792831Z           </li>
2026-09-02T19:57:24.9792922Z         </ul>
2026-09-02T19:57:24.9793017Z       </div>
2026-09-02T19:57:24.9793112Z     </div>
2026-09-02T19:57:24.9793206Z   </body>
2026-09-02T19:57:24.9793302Z </html>
2026-09-02T19:57:24.9853866Z ##[section]Finishing: Cadastrar imagem no Infradevops
