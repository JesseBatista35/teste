2026-08-19T19:52:28.6605245Z ##[section]Starting: Executando Build S2I Binary
2026-08-19T19:52:28.6608353Z ==============================================================================
2026-08-19T19:52:28.6608461Z Task         : Bash
2026-08-19T19:52:28.6608514Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-19T19:52:28.6608711Z Version      : 3.227.0
2026-08-19T19:52:28.6608759Z Author       : Microsoft Corporation
2026-08-19T19:52:28.6608822Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-19T19:52:28.6608892Z ==============================================================================
2026-08-19T19:52:28.8100487Z Generating script.
2026-08-19T19:52:28.8112757Z ========================== Starting Command Output ===========================
2026-08-19T19:52:28.8122250Z [command]/bin/bash /opt/ads-agent/_work/_temp/90b36271-9fe5-4bcb-a5c1-5a7cd9839240.sh
2026-08-19T19:52:28.8171400Z + echo okd4_nprd
2026-08-19T19:52:28.8171825Z + egrep -q '^(okd4|ocp)'
2026-08-19T19:52:28.8203045Z + buildconfig=sipnl-totem-frontend
2026-08-19T19:52:28.8204116Z + oc start-build sipnl-totem-frontend --from-dir=/opt/ads-agent/_work/405/a --follow --wait=true -n build-images-ads -v=5
2026-08-19T19:52:28.8844981Z I0819 16:52:28.883998 2926422 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-08-19T19:52:28.8859165Z I0819 16:52:28.885752 2926422 repository.go:533] Error executing command: exit status 128
2026-08-19T19:52:28.8859796Z Uploading directory "/opt/ads-agent/_work/405/a" as binary input for the build ...
2026-08-19T19:52:28.8860206Z I0819 16:52:28.885894 2926422 tar.go:238] Adding "/opt/ads-agent/_work/405/a" to tar ...
2026-08-19T19:52:28.8862534Z I0819 16:52:28.886112 2926422 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i as .s2i
2026-08-19T19:52:28.8865961Z I0819 16:52:28.886310 2926422 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin as .s2i/bin
2026-08-19T19:52:28.8866496Z I0819 16:52:28.886362 2926422 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin/assemble as .s2i/bin/assemble
2026-08-19T19:52:28.8866958Z I0819 16:52:28.886409 2926422 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin/run as .s2i/bin/run
2026-08-19T19:52:28.8867473Z I0819 16:52:28.886462 2926422 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/sipnl-totem-frontend.zip as sipnl-totem-frontend.zip
2026-08-19T19:52:32.7955331Z 
2026-08-19T19:52:32.7955770Z Uploading finished
2026-08-19T19:52:32.7957089Z build.build.openshift.io/sipnl-totem-frontend-15 started
2026-08-19T19:52:32.8079761Z Adding cluster TLS certificate authority to trust store
2026-08-19T19:52:32.8080034Z Receiving source from STDIN as archive ...
2026-08-19T19:52:34.8384598Z Adding cluster TLS certificate authority to trust store
2026-08-19T19:52:35.8435856Z Adding cluster TLS certificate authority to trust store
2026-08-19T19:52:35.8437997Z time="2026-08-19T19:52:35Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-08-19T19:52:35.8438268Z I0819 19:52:35.333152       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-08-19T19:52:35.8438433Z Caching blobs under "/var/cache/blobs".
2026-08-19T19:52:35.8438846Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
2026-08-19T19:52:35.8439039Z Getting image source signatures
2026-08-19T19:52:35.8439184Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-08-19T19:52:35.8439373Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-08-19T19:52:35.8439550Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-08-19T19:52:35.8440200Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-08-19T19:52:35.8440477Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-08-19T19:52:37.8067716Z Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de
2026-08-19T19:52:37.8186801Z Writing manifest to image destination
2026-08-19T19:52:37.8210382Z Storing signatures
2026-08-19T19:52:40.7509916Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-08-19T19:52:40.7943834Z STEP 1/10: FROM image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c
2026-08-19T19:52:40.7944517Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
2026-08-19T19:52:40.8682285Z Getting image source signatures
2026-08-19T19:52:40.8977606Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-08-19T19:52:40.8978854Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-08-19T19:52:40.8979166Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-08-19T19:52:40.8979476Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-08-19T19:52:40.8979775Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-08-19T19:52:40.8980086Z Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de
2026-08-19T19:52:40.9326438Z Writing manifest to image destination
2026-08-19T19:52:40.9580259Z Storing signatures
2026-08-19T19:52:41.0362404Z STEP 2/10: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-08-19T19:52:41.0638131Z STEP 3/10: ENV OPENSHIFT_BUILD_NAME="sipnl-totem-frontend-15"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"     TZ="America/Sao_Paulo"
2026-08-19T19:52:41.0913216Z STEP 4/10: USER root
2026-08-19T19:52:41.1199831Z STEP 5/10: COPY upload/scripts /tmp/scripts
2026-08-19T19:52:41.3064203Z STEP 6/10: COPY upload/src /tmp/src
2026-08-19T19:52:41.4905001Z STEP 7/10: RUN chown -R 1001:0 /tmp/scripts /tmp/src
2026-08-19T19:52:41.7539662Z STEP 8/10: USER 1001
2026-08-19T19:52:41.7765489Z STEP 9/10: RUN /tmp/scripts/assemble
2026-08-19T19:52:41.9979090Z Copying all WAR, EAR, JAR and ZIP artifacts from /tmp/src directory into /opt/app-root/src for later deployment...
2026-08-19T19:52:41.9984463Z '/tmp/src/sipnl-totem-frontend.zip' -> '/opt/app-root/src/sipnl-totem-frontend.zip'
2026-08-19T19:52:42.0001267Z Archive:  /opt/app-root/src/sipnl-totem-frontend.zip
2026-08-19T19:52:42.0001478Z    creating: /opt/app-root/src/dist/
2026-08-19T19:52:42.0002806Z   inflating: /opt/app-root/src/dist/3rdpartylicenses.txt  
2026-08-19T19:52:42.0003029Z  extracting: /opt/app-root/src/dist/prerendered-routes.json  
2026-08-19T19:52:42.0003216Z    creating: /opt/app-root/src/dist/browser/
2026-08-19T19:52:42.0003397Z  extracting: /opt/app-root/src/dist/browser/styles.css  
2026-08-19T19:52:42.0011221Z   inflating: /opt/app-root/src/dist/browser/main.js  
2026-08-19T19:52:42.0012091Z   inflating: /opt/app-root/src/dist/browser/index.html  
2026-08-19T19:52:42.0182882Z STEP 10/10: CMD /tmp/scripts/run
2026-08-19T19:52:42.0441405Z COMMIT temp.builder.openshift.io/build-images-ads/sipnl-totem-frontend-15:d8bfbc28
2026-08-19T19:52:42.0459170Z time="2026-08-19T19:52:42Z" level=warning msg="Adding metacopy option, configured globally"
2026-08-19T19:52:43.0025577Z Getting image source signatures
2026-08-19T19:52:43.0026797Z Copying blob sha256:1733579794674bb13464023e8b7839ad924216064387c3bc9f53c33a4b3cd3c1
2026-08-19T19:52:43.0027114Z Copying blob sha256:47f871cfc125200d9264414fdf234fb7c57beea52683c16fc73a115463ed1454
2026-08-19T19:52:43.0030439Z Copying blob sha256:ced3c19e38498b34993f3d72c5f4fb7089fafe5ac67ce947b2f86f1371e582ab
2026-08-19T19:52:43.0035555Z Copying blob sha256:9b1f3195797934752eac7a7e5ac06cec1f38932871ec486a6a34f42375ab8183
2026-08-19T19:52:43.0035812Z Copying blob sha256:0cd3bd1c23238e6574774c8ba7021fd95b4823599918fff9b8449f9b4373c317
2026-08-19T19:52:43.0041773Z Copying blob sha256:68a3ead22c98b1c500a51abed859bb955eac1b1167c684e18be74dd4bc2c365a
2026-08-19T19:52:43.0184710Z Copying config sha256:b7ba520a2d27da6aedf4fb32073d397910b137ce0497fb202e72ae85ebcc77e0
2026-08-19T19:52:43.0368148Z Writing manifest to image destination
2026-08-19T19:52:43.0407725Z Storing signatures
2026-08-19T19:52:43.1322292Z --> b7ba520a2d2
2026-08-19T19:52:43.1322666Z Successfully tagged temp.builder.openshift.io/build-images-ads/sipnl-totem-frontend-15:d8bfbc28
2026-08-19T19:52:43.1903944Z b7ba520a2d27da6aedf4fb32073d397910b137ce0497fb202e72ae85ebcc77e0
2026-08-19T19:52:43.2074577Z 
2026-08-19T19:52:43.2076818Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/sipnl-totem-frontend:latest ...
2026-08-19T19:52:43.2077566Z Getting image source signatures
2026-08-19T19:52:43.2747498Z Copying blob sha256:68a3ead22c98b1c500a51abed859bb955eac1b1167c684e18be74dd4bc2c365a
2026-08-19T19:52:43.5264720Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-08-19T19:52:43.5270180Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-08-19T19:52:43.5368838Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-08-19T19:52:43.5372123Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-08-19T19:52:43.5381081Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-08-19T19:52:43.5719340Z Warning: Push failed, retrying in 5s ...
2026-08-19T19:52:48.5739182Z Getting image source signatures
2026-08-19T19:52:48.6101519Z Copying blob sha256:68a3ead22c98b1c500a51abed859bb955eac1b1167c684e18be74dd4bc2c365a
2026-08-19T19:52:49.5054142Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-08-19T19:52:49.5054413Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-08-19T19:52:49.5056689Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-08-19T19:52:49.5092725Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-08-19T19:52:49.5107770Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-08-19T19:52:49.5465590Z Warning: Push failed, retrying in 5s ...
2026-08-19T19:52:54.5471879Z Getting image source signatures
2026-08-19T19:52:54.6232214Z Copying blob sha256:68a3ead22c98b1c500a51abed859bb955eac1b1167c684e18be74dd4bc2c365a
2026-08-19T19:52:54.8564653Z Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
2026-08-19T19:52:54.8565582Z Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
2026-08-19T19:52:54.8574335Z Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
2026-08-19T19:52:54.8577512Z Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
2026-08-19T19:52:54.8584026Z Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
2026-08-19T19:52:54.8979715Z Warning: Push failed, retrying in 5s ...
2026-08-19T19:52:59.9333888Z Registry server Address: 
2026-08-19T19:52:59.9334553Z Registry server User Name: serviceaccount
2026-08-19T19:52:59.9334747Z Registry server Email: serviceaccount@example.org
2026-08-19T19:52:59.9335188Z Registry server Password: <<non-empty>>
2026-08-19T19:52:59.9580908Z error: build error: Failed to push image: writing blob: initiating layer upload to /v2/build-images-ads/sipnl-totem-frontend/blobs/uploads/ in image-registry.openshift-image-registry.svc:5000: received unexpected HTTP status: 500 Internal Server Error
2026-08-19T19:54:00.9728027Z rpc error: code = NotFound desc = could not find container "d6d605749be62dabcb7ab224b013ee2f622c05cd518ebb583c10dabe443863cf": specified container not found: d6d605749be62dabcb7ab224b013ee2f622c05cd518ebb583c10dabe443863cfI0819 16:54:00.972258 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T19:55:01.0026515Z I0819 16:55:01.002172 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T19:56:01.0196549Z I0819 16:56:01.019119 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T19:57:01.0391907Z I0819 16:57:01.038603 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T19:58:01.0560189Z I0819 16:58:01.055504 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T19:59:01.0706559Z I0819 16:59:01.070075 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:00:01.0981198Z I0819 17:00:01.097646 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:01:01.1149292Z I0819 17:01:01.114462 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:02:01.1340728Z I0819 17:02:01.133456 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:03:01.1486237Z I0819 17:03:01.148151 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:04:01.1644503Z I0819 17:04:01.163888 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:05:01.2048912Z I0819 17:05:01.204393 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:06:01.2188866Z I0819 17:06:01.218346 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:07:01.2610666Z I0819 17:07:01.260433 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:08:01.2740444Z I0819 17:08:01.273548 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:09:01.2887319Z I0819 17:09:01.288207 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:10:01.3034709Z I0819 17:10:01.303032 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:11:01.3544423Z I0819 17:11:01.353923 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:12:01.3707701Z I0819 17:12:01.370272 2926422 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:12:36.1720280Z ##[error]The task has timed out.
2026-08-19T20:12:36.1728015Z ##[section]Finishing: Executando Build S2I Binary
