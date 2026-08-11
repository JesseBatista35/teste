Executando Build S2I Binary

View raw log
Starting: Executando Build S2I Binary
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/93fc3552-1cae-41d0-8e43-fd7afe6e9b7e.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siavl-gerencial-frontend
+ oc start-build siavl-gerencial-frontend --from-dir=/opt/ads-agent/_work/254/a --follow --wait=true -n build-images-ads -v=5
I0811 12:04:17.874409 1762365 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0811 12:04:17.876900 1762365 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/254/a" as binary input for the build ...
I0811 12:04:17.877003 1762365 tar.go:238] Adding "/opt/ads-agent/_work/254/a" to tar ...
I0811 12:04:17.877233 1762365 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/.s2i as .s2i
I0811 12:04:17.877509 1762365 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/.s2i/bin as .s2i/bin
I0811 12:04:17.877556 1762365 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/.s2i/bin/assemble as .s2i/bin/assemble
I0811 12:04:17.877600 1762365 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/.s2i/bin/run as .s2i/bin/run
I0811 12:04:17.877665 1762365 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/siavl-gerencial-frontend.zip as siavl-gerencial-frontend.zip
.
Uploading finished
build.build.openshift.io/siavl-gerencial-frontend-14 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-08-11T15:04:51Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0811 15:04:51.836564       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
Getting image source signatures
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650

'/tmp/src/siavl-gerencial-frontend.zip' -> '/opt/app-root/src/siavl-gerencial-frontend.zip'
Archive:  /opt/app-root/src/siavl-gerencial-frontend.zip
   creating: /opt/app-root/src/dist/
  inflating: /opt/app-root/src/dist/futura-book.62378242371aa6c4.ttf  
  inflating: /opt/app-root/src/dist/futura-book-italic.5da5bdcf426538c5.ttf  
  inflating: /opt/app-root/src/dist/futura-medium-italic.8f487e370d59a0b4.ttf  
  inflating: /opt/app-root/src/dist/futura-medium.bf8b53b524b24b76.ttf  
  inflating: /opt/app-root/src/dist/futura-bold.0861c703cd46f362.ttf  
  inflating: /opt/app-root/src/dist/futura-bold-italic.ce19dfbfde98d388.ttf  
  inflating: /opt/app-root/src/dist/futura-heavy.57aa7ab32f3f06b4.ttf  
  inflating: /opt/app-root/src/dist/futura-heavy-italic.9dacb3b6b378bfb5.ttf  
  inflating: /opt/app-root/src/dist/CAIXAStd-Regular.38865969b166b9ed.woff2  
  inflating: /opt/app-root/src/dist/CAIXAStd-Regular.5e5dcaade261bbe9.woff  
  inflating: /opt/app-root/src/dist/CAIXAStd-SemiBold.76913a7af502160a.woff2  
  inflating: /opt/app-root/src/dist/CAIXAStd-SemiBold.66ab64a175a0709c.woff  
  inflating: /opt/app-root/src/dist/CAIXAStd-SemiBoldItalic.1fedb2efb53754a6.woff2  
  inflating: /opt/app-root/src/dist/CAIXAStd-SemiBoldItalic.9dbab25e2c673f04.woff  
  inflating: /opt/app-root/src/dist/CAIXAStd-Bold.44110ff62c0c5f25.woff2  
  inflating: /opt/app-root/src/dist/CAIXAStd-Bold.e9212209060f0f96.woff  
  inflating: /opt/app-root/src/dist/CAIXAStd-BoldItalic.3524f39e7dfc0844.woff2  
  inflating: /opt/app-root/src/dist/CAIXAStd-BoldItalic.fe15ebd12831496d.woff  
  inflating: /opt/app-root/src/dist/material-icons.59322316b3fd6063.woff2  
  inflating: /opt/app-root/src/dist/material-icons-outlined.f86cb7b0aa53f0fe.woff2  
  inflating: /opt/app-root/src/dist/material-icons-round.b10ec9db5b7fbc74.woff2  
  inflating: /opt/app-root/src/dist/material-icons-sharp.3885863ee4746422.woff2  
  inflating: /opt/app-root/src/dist/material-icons-two-tone.675bd578bd14533e.woff2 

  
  inflating: /opt/app-root/src/dist/165.91da7b8128aa1207.js  
  inflating: /opt/app-root/src/dist/195.4eb432c48c747a79.js  
  inflating: /opt/app-root/src/dist/417.c681109a523bbb28.js  
  inflating: /opt/app-root/src/dist/561.1d604e2f9996a0a6.js  
  inflating: /opt/app-root/src/dist/457.01d96bc79f748d34.js  
  inflating: /opt/app-root/src/dist/3rdpartylicenses.txt  
   creating: /opt/app-root/src/dist/assets/
  inflating: /opt/app-root/src/dist/assets/baixados.svg  
   creating: /opt/app-root/src/dist/assets/images/
  inflating: /opt/app-root/src/dist/assets/images/hero-waves.svg  
 extracting: /opt/app-root/src/dist/assets/images/logo-senha.png  
   creating: /opt/app-root/src/dist/assets/images/heroes/
  inflating: /opt/app-root/src/dist/assets/images/heroes/hero-gestaoDeUnidades.png  
  inflating: /opt/app-root/src/dist/assets/images/heroes/hero-unidades.png  
  inflating: /opt/app-root/src/dist/assets/images/heroes/teste-q.png  
  inflating: /opt/app-root/src/dist/assets/images/heroes/teste.png  
   creating: /opt/app-root/src/dist/assets/fonts/
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-Bold.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-BoldItalic.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-Book.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-BookItalic.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-ExtraBold.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-ExtraBoldItalic.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-Italic.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-Light.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-LightItalic.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-Regular.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-SemiBold.ttf  
  inflating: /opt/app-root/src/dist/assets/fonts/CAIXAStd-SemiBoldItalic.ttf  
 inflating: /opt/app-root/src/dist/favicon.ico  
  inflating: /opt/app-root/src/dist/index.html  
STEP 10/10: CMD /tmp/scripts/run
COMMIT temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-14:7a320017
time="2026-08-11T15:05:02Z" level=warning msg="Adding metacopy option, configured globally"
Getting image source signatures
Copying blob sha256:1733579794674bb13464023e8b7839ad924216064387c3bc9f53c33a4b3cd3c1
Copying blob sha256:47f871cfc125200d9264414fdf234fb7c57beea52683c16fc73a115463ed1454
Copying blob sha256:ced3c19e38498b34993f3d72c5f4fb7089fafe5ac67ce947b2f86f1371e582ab
Copying blob sha256:9b1f3195797934752eac7a7e5ac06cec1f38932871ec486a6a34f42375ab8183
Copying blob sha256:0cd3bd1c23238e6574774c8ba7021fd95b4823599918fff9b8449f9b4373c317
Copying blob sha256:e7d9afa4a0a8357b4c6c3f764c9f7ce7d883e861670a52f465429b599b9f7d04
Copying config sha256:93517c556e2de4e9078cf97bf7dd1c9307750cd6435bac73dc907c3af10e7650
Writing manifest to image destination
Storing signatures
--> 93517c556e2
Successfully tagged temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-14:7a320017
93517c556e2de4e9078cf97bf7dd1c9307750cd6435bac73dc907c3af10e7650

Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend:latest ...
Getting image source signatures
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:e7d9afa4a0a8357b4c6c3f764c9f7ce7d883e861670a52f465429b599b9f7d04
Copying config sha256:93517c556e2de4e9078cf97bf7dd1c9307750cd6435bac73dc907c3af10e7650
Writing manifest to image destination
Storing signatures
Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend@sha256:57768bfd153356ca760a1b7f3dc444ed6b901bb9d485e31109936d5df2d0580a
Push successful
Finishing: Executando Build S2I Binary
