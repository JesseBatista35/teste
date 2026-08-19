2026-08-19T20:15:17.0989206Z ##[section]Starting: Executando Build S2I Binary
2026-08-19T20:15:17.0993129Z ==============================================================================
2026-08-19T20:15:17.0993223Z Task         : Bash
2026-08-19T20:15:17.0993268Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-19T20:15:17.0993339Z Version      : 3.227.0
2026-08-19T20:15:17.0993385Z Author       : Microsoft Corporation
2026-08-19T20:15:17.0993469Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-19T20:15:17.0993592Z ==============================================================================
2026-08-19T20:15:17.2465506Z Generating script.
2026-08-19T20:15:17.2479715Z ========================== Starting Command Output ===========================
2026-08-19T20:15:17.2487597Z [command]/bin/bash /opt/ads-agent/_work/_temp/51bc5a42-bad9-452a-aab5-8b47a78a18bd.sh
2026-08-19T20:15:17.2539360Z + echo okd4_nprd
2026-08-19T20:15:17.2539753Z + egrep -q '^(okd4|ocp)'
2026-08-19T20:15:17.2551506Z + buildconfig=sipnl-totem-frontend
2026-08-19T20:15:17.2552149Z + oc start-build sipnl-totem-frontend --from-dir=/opt/ads-agent/_work/405/a --follow --wait=true -n build-images-ads -v=5
2026-08-19T20:15:17.3406879Z I0819 17:15:17.340217 2927526 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-08-19T20:15:17.3428758Z I0819 17:15:17.342589 2927526 repository.go:533] Error executing command: exit status 128
2026-08-19T20:15:17.3429262Z Uploading directory "/opt/ads-agent/_work/405/a" as binary input for the build ...
2026-08-19T20:15:17.3429543Z I0819 17:15:17.342721 2927526 tar.go:238] Adding "/opt/ads-agent/_work/405/a" to tar ...
2026-08-19T20:15:17.3432624Z I0819 17:15:17.343088 2927526 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i as .s2i
2026-08-19T20:15:17.3435367Z I0819 17:15:17.343442 2927526 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin as .s2i/bin
2026-08-19T20:15:17.3436407Z I0819 17:15:17.343553 2927526 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin/assemble as .s2i/bin/assemble
2026-08-19T20:15:17.3436914Z I0819 17:15:17.343636 2927526 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/.s2i/bin/run as .s2i/bin/run
2026-08-19T20:15:17.3437753Z I0819 17:15:17.343723 2927526 tar.go:336] Adding to tar: /opt/ads-agent/_work/405/a/sipnl-totem-frontend.zip as sipnl-totem-frontend.zip
2026-08-19T20:15:55.1349921Z .......
2026-08-19T20:15:55.1350101Z Uploading finished
2026-08-19T20:15:55.1351039Z build.build.openshift.io/sipnl-totem-frontend-17 started
2026-08-19T20:15:55.1659208Z Adding cluster TLS certificate authority to trust store
2026-08-19T20:15:55.1659571Z Receiving source from STDIN as archive ...
2026-08-19T20:15:57.0952783Z Adding cluster TLS certificate authority to trust store
2026-08-19T20:15:58.1099954Z Adding cluster TLS certificate authority to trust store
2026-08-19T20:16:00.0554523Z time="2026-08-19T20:16:00Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-08-19T20:16:00.0555017Z I0819 20:16:00.053921       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-08-19T20:16:00.5079872Z Caching blobs under "/var/cache/blobs".
2026-08-19T20:16:00.5080533Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:04635923301f989fe706d5f8eaf958463d883fb2f523476e57282e38d84bfd20...
2026-08-19T20:16:00.6227170Z Getting image source signatures
2026-08-19T20:16:00.6834201Z Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
2026-08-19T20:16:00.7017727Z Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
2026-08-19T20:16:00.7309710Z Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
2026-08-19T20:16:00.7418811Z Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
2026-08-19T20:16:03.6867268Z Copying config sha256:e072ce6f53be172aaad7ad7fd066a670686820b8f68549e9e28c5770231ee98c
2026-08-19T20:16:03.7446550Z Writing manifest to image destination
2026-08-19T20:16:03.7482873Z Storing signatures
2026-08-19T20:16:06.6713638Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:04635923301f989fe706d5f8eaf958463d883fb2f523476e57282e38d84bfd20
2026-08-19T20:16:06.7645385Z STEP 1/10: FROM image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:04635923301f989fe706d5f8eaf958463d883fb2f523476e57282e38d84bfd20
2026-08-19T20:16:06.7646641Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:04635923301f989fe706d5f8eaf958463d883fb2f523476e57282e38d84bfd20...
2026-08-19T20:16:06.8362895Z Getting image source signatures
2026-08-19T20:16:06.8588259Z Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
2026-08-19T20:16:06.8588511Z Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
2026-08-19T20:16:06.8595962Z Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
2026-08-19T20:16:06.8596301Z Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
2026-08-19T20:16:06.8598456Z Copying config sha256:e072ce6f53be172aaad7ad7fd066a670686820b8f68549e9e28c5770231ee98c
2026-08-19T20:16:06.9554256Z Writing manifest to image destination
2026-08-19T20:16:06.9636638Z Storing signatures
2026-08-19T20:16:07.0670455Z STEP 2/10: LABEL "io.openshift.build.source-location"="/tmp/build/inputs"       "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:04635923301f989fe706d5f8eaf958463d883fb2f523476e57282e38d84bfd20"
2026-08-19T20:16:07.1011213Z STEP 3/10: ENV OPENSHIFT_BUILD_NAME="sipnl-totem-frontend-17"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"     TZ="America/Sao_Paulo"
2026-08-19T20:16:07.1249573Z STEP 4/10: USER root
2026-08-19T20:16:07.1499879Z STEP 5/10: COPY upload/scripts /tmp/scripts
2026-08-19T20:16:07.3530169Z STEP 6/10: COPY upload/src /tmp/src
2026-08-19T20:16:07.5460623Z STEP 7/10: RUN chown -R 1001:0 /tmp/scripts /tmp/src
2026-08-19T20:16:07.9112201Z STEP 8/10: USER 1001
2026-08-19T20:16:07.9388448Z STEP 9/10: RUN /tmp/scripts/assemble
2026-08-19T20:16:08.2599101Z Copying all WAR, EAR, JAR and ZIP artifacts from /tmp/src directory into /opt/app-root/src for later deployment...
2026-08-19T20:16:08.2796622Z '/tmp/src/sipnl-totem-frontend.zip' -> '/opt/app-root/src/sipnl-totem-frontend.zip'
2026-08-19T20:16:08.2797205Z Archive:  /opt/app-root/src/sipnl-totem-frontend.zip
2026-08-19T20:16:08.2797532Z    creating: /opt/app-root/src/dist/
2026-08-19T20:16:08.2797825Z    creating: /opt/app-root/src/dist/browser/
2026-08-19T20:16:08.2798135Z   inflating: /opt/app-root/src/dist/browser/main.js  
2026-08-19T20:16:08.2798453Z  extracting: /opt/app-root/src/dist/browser/styles.css  
2026-08-19T20:16:08.2798943Z   inflating: /opt/app-root/src/dist/browser/index.html  
2026-08-19T20:16:08.2799282Z   inflating: /opt/app-root/src/dist/3rdpartylicenses.txt  
2026-08-19T20:16:08.2799601Z  extracting: /opt/app-root/src/dist/prerendered-routes.json  
2026-08-19T20:16:08.3217865Z STEP 10/10: CMD /tmp/scripts/run
2026-08-19T20:16:08.3474383Z COMMIT temp.builder.openshift.io/build-images-ads/sipnl-totem-frontend-17:446c031a
2026-08-19T20:16:08.3486668Z time="2026-08-19T20:16:08Z" level=warning msg="Adding metacopy option, configured globally"
2026-08-19T20:16:09.0056836Z Getting image source signatures
2026-08-19T20:16:09.0057149Z Copying blob sha256:6f79bbfebf48364efd0ee3ed27d355380a7ebd15516440724189b73bf89a898d
2026-08-19T20:16:09.0057378Z Copying blob sha256:2e13e6e57bf250c2e818300c9fe7e92d505d2afb34eaecfb37af42f4b13e05b1
2026-08-19T20:16:09.0057564Z Copying blob sha256:67dc1f48d5dbaba415af7e891a3014324a0ae663b30e16b0549640180c53bd1b
2026-08-19T20:16:09.0057793Z Copying blob sha256:af2b91009ef3cec0b2621c2771ae32eb678077a030c98f53c6e48a7632f8ea5f
2026-08-19T20:16:09.0108149Z Copying blob sha256:a346eebd1bf6037c9e30775effd80e9fda47fda11693b5407a8f4798f8d0ad37
2026-08-19T20:16:09.0974556Z Copying config sha256:9362408bd6ef47570c4a653b0e177fdf781bf38a1b78450cfbbd8851b15e9d37
2026-08-19T20:16:09.1571306Z Writing manifest to image destination
2026-08-19T20:16:09.1598342Z Storing signatures
2026-08-19T20:16:09.3467315Z --> 9362408bd6e
2026-08-19T20:16:09.3468897Z Successfully tagged temp.builder.openshift.io/build-images-ads/sipnl-totem-frontend-17:446c031a
2026-08-19T20:16:09.4241944Z 9362408bd6ef47570c4a653b0e177fdf781bf38a1b78450cfbbd8851b15e9d37
2026-08-19T20:16:09.4464750Z 
2026-08-19T20:16:09.4465563Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/sipnl-totem-frontend:latest ...
2026-08-19T20:16:09.4465747Z Getting image source signatures
2026-08-19T20:16:09.4995830Z Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
2026-08-19T20:16:09.5198393Z Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
2026-08-19T20:16:09.5345805Z Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
2026-08-19T20:16:09.5434665Z Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
2026-08-19T20:16:09.5455457Z Copying blob sha256:a346eebd1bf6037c9e30775effd80e9fda47fda11693b5407a8f4798f8d0ad37
2026-08-19T20:16:09.5605878Z Warning: Push failed, retrying in 5s ...
2026-08-19T20:16:14.5625262Z Getting image source signatures
2026-08-19T20:16:14.6265581Z Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
2026-08-19T20:16:14.6521351Z Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
2026-08-19T20:16:14.6919047Z Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
2026-08-19T20:16:14.7144865Z Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
2026-08-19T20:16:14.7145432Z Copying blob sha256:a346eebd1bf6037c9e30775effd80e9fda47fda11693b5407a8f4798f8d0ad37
2026-08-19T20:16:14.7324666Z Warning: Push failed, retrying in 5s ...
2026-08-19T20:16:19.7342995Z Getting image source signatures
2026-08-19T20:16:19.7721066Z Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
2026-08-19T20:16:19.7809723Z Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
2026-08-19T20:16:19.7928054Z Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
2026-08-19T20:16:19.7995112Z Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
2026-08-19T20:16:19.7995393Z Copying blob sha256:a346eebd1bf6037c9e30775effd80e9fda47fda11693b5407a8f4798f8d0ad37
2026-08-19T20:16:19.8855146Z Warning: Push failed, retrying in 5s ...
2026-08-19T20:16:24.9296092Z Registry server Address: 
2026-08-19T20:16:24.9296320Z Registry server User Name: serviceaccount
2026-08-19T20:16:24.9297286Z Registry server Email: serviceaccount@example.org
2026-08-19T20:16:24.9298155Z Registry server Password: <<non-empty>>
2026-08-19T20:16:24.9475155Z error: build error: Failed to push image: writing blob: initiating layer upload to /v2/build-images-ads/sipnl-totem-frontend/blobs/uploads/ in image-registry.openshift-image-registry.svc:5000: received unexpected HTTP status: 500 Internal Server Error
2026-08-19T20:17:25.9658219Z I0819 17:17:25.965526 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:18:25.9865105Z I0819 17:18:25.986106 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:19:26.0032745Z I0819 17:19:26.002406 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:20:26.0179771Z I0819 17:20:26.017246 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:21:26.0338061Z I0819 17:21:26.032946 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:22:26.0495446Z I0819 17:22:26.048710 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:23:26.0656459Z I0819 17:23:26.065156 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:24:26.0805513Z I0819 17:24:26.080033 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:25:26.1236449Z I0819 17:25:26.122842 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:26:26.1388906Z I0819 17:26:26.138096 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:27:26.1542955Z I0819 17:27:26.153904 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:28:26.1701938Z I0819 17:28:26.169444 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:29:26.2030317Z I0819 17:29:26.202300 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:30:26.2183142Z I0819 17:30:26.217579 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:31:26.2346078Z I0819 17:31:26.233838 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:32:26.2552815Z I0819 17:32:26.254500 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:33:26.2803227Z I0819 17:33:26.279602 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:34:26.2996309Z I0819 17:34:26.298927 2927526 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
2026-08-19T20:35:24.6121996Z ##[error]The task has timed out.
2026-08-19T20:35:24.6132906Z ##[section]Finishing: Executando Build S2I Binary
