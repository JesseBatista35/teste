2026-09-10T21:57:39.9492924Z ##[section]Starting: Executando Build S2I Binary
2026-09-10T21:57:39.9499093Z ==============================================================================
2026-09-10T21:57:39.9499236Z Task         : Bash
2026-09-10T21:57:39.9499323Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T21:57:39.9499419Z Version      : 3.227.0
2026-09-10T21:57:39.9499609Z Author       : Microsoft Corporation
2026-09-10T21:57:39.9499686Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T21:57:39.9499776Z ==============================================================================
2026-09-10T21:57:40.1106113Z Generating script.
2026-09-10T21:57:40.1118539Z ========================== Starting Command Output ===========================
2026-09-10T21:57:40.1126037Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/4fb6b964-4403-419b-b261-9177e6a79f72.sh
2026-09-10T21:57:40.1178848Z + set -o errexit
2026-09-10T21:57:40.1179064Z + set -o pipefail
2026-09-10T21:57:40.1180873Z + echo okd4_nprd
2026-09-10T21:57:40.1181322Z + egrep -q '^(okd4|ocp)'
2026-09-10T21:57:40.1214301Z + buildconfig=siabm-autenticacao-24horas
2026-09-10T21:57:40.1215438Z + oc start-build siabm-autenticacao-24horas --from-dir=/opt/ads-agent/_work/74/a --follow --wait=true -n build-images-ads -v=5
2026-09-10T21:57:40.2006976Z I0910 18:57:40.200346  152560 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-10T21:57:40.2027224Z I0910 18:57:40.202483  152560 repository.go:533] Error executing command: exit status 128
2026-09-10T21:57:40.2027635Z Uploading directory "/opt/ads-agent/_work/74/a" as binary input for the build ...
2026-09-10T21:57:40.2029051Z I0910 18:57:40.202585  152560 tar.go:238] Adding "/opt/ads-agent/_work/74/a" to tar ...
2026-09-10T21:57:40.2029488Z I0910 18:57:40.202830  152560 tar.go:336] Adding to tar: /opt/ads-agent/_work/74/a/SIABM-autenticacao-24horas-20260910-1856-1-0-0-24-SNAPSHOT.zip as SIABM-autenticacao-24horas-20260910-1856-1-0-0-24-SNAPSHOT.zip
2026-09-10T21:57:46.6672699Z .I0910 18:57:46.666742  152560 tar.go:336] Adding to tar: /opt/ads-agent/_work/74/a/SIABM-autenticacao-24horas.jar as SIABM-autenticacao-24horas.jar
2026-09-10T21:57:49.9563761Z 
2026-09-10T21:57:49.9564490Z Uploading finished
2026-09-10T21:57:49.9566803Z build.build.openshift.io/siabm-autenticacao-24horas-152 started
2026-09-10T21:57:50.0115459Z Adding cluster TLS certificate authority to trust store
2026-09-10T21:57:50.0115786Z Receiving source from STDIN as archive ...
2026-09-10T21:57:51.7766938Z Adding cluster TLS certificate authority to trust store
2026-09-10T21:57:52.7973669Z Adding cluster TLS certificate authority to trust store
2026-09-10T21:57:52.7974468Z time="2026-09-10T21:57:52Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-10T21:57:52.7974768Z I0910 21:57:52.509089       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-10T21:57:52.7974985Z Caching blobs under "/var/cache/blobs".
2026-09-10T21:57:52.7975365Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25...
2026-09-10T21:57:52.7975605Z Getting image source signatures
2026-09-10T21:57:52.7976001Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-10T21:57:52.8150435Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-10T21:57:52.8496217Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-10T21:57:52.8659440Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-10T21:57:52.9131154Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-10T21:57:52.9230490Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-10T21:57:53.5117788Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-10T21:57:53.5358869Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-10T21:57:53.5621588Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-10T21:57:53.5906945Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-10T21:57:53.6491051Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-10T21:57:53.9860224Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-10T21:57:54.0774200Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-10T21:58:02.7346219Z Copying config sha256:db5724295b3ca3bdc954cddb4ae13f779ef6dc185fa6fa797276b78493e1b0b2
2026-09-10T21:58:03.0311439Z Writing manifest to image destination
2026-09-10T21:58:03.0384335Z Storing signatures
2026-09-10T21:58:18.3700390Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-10T21:58:18.6574417Z STEP 1/9: FROM image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-10T21:58:18.6933474Z STEP 2/9: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-10T21:58:18.7339047Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="siabm-autenticacao-24horas-152"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-10T21:58:18.7644744Z STEP 4/9: USER root
2026-09-10T21:58:18.7965696Z STEP 5/9: COPY upload/src /tmp/src
2026-09-10T21:58:19.7216382Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-10T21:58:20.1259696Z STEP 7/9: USER 1001
2026-09-10T21:58:20.1563642Z STEP 8/9: RUN /usr/local/s2i/assemble
2026-09-10T21:58:20.4535141Z + LOCAL_SOURCE_DIR=/tmp/src
2026-09-10T21:58:20.4535492Z + DEPLOY_DIR=/deployments
2026-09-10T21:58:20.4538689Z + copy_artifacts deployments
2026-09-10T21:58:20.4541509Z + '[' -d /tmp/src ']'
2026-09-10T21:58:20.4541835Z + echo 'Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...'
2026-09-10T21:58:20.4542209Z Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...
2026-09-10T21:58:20.4542610Z + cp -rfv '/tmp/src/*-runner.jar' '/tmp/src/*-run.jar' /tmp/src/SIABM-autenticacao-24horas-20260910-1856-1-0-0-24-SNAPSHOT.zip /tmp/src/SIABM-autenticacao-24horas.jar /deployments
2026-09-10T21:58:20.5628433Z '/tmp/src/SIABM-autenticacao-24horas-20260910-1856-1-0-0-24-SNAPSHOT.zip' -> '/deployments/SIABM-autenticacao-24horas-20260910-1856-1-0-0-24-SNAPSHOT.zip'
2026-09-10T21:58:20.5628975Z '/tmp/src/SIABM-autenticacao-24horas.jar' -> '/deployments/SIABM-autenticacao-24horas.jar'
2026-09-10T21:58:20.5629162Z + exit 0
2026-09-10T21:58:20.6036756Z STEP 9/9: CMD /usr/local/s2i/run
2026-09-10T21:58:20.6360038Z COMMIT temp.builder.openshift.io/build-images-ads/siabm-autenticacao-24horas-152:0c3d351c
2026-09-10T21:58:20.6472916Z time="2026-09-10T21:58:20Z" level=warning msg="Adding metacopy option, configured globally"
2026-09-10T21:58:24.4157393Z Getting image source signatures
2026-09-10T21:58:24.4160338Z Copying blob sha256:f9327c1608ad0ae79b5f4a4c47eda907a980ea9640c70e6036811ea76d641249
2026-09-10T21:58:24.4160834Z Copying blob sha256:449675ca11bc217d5066dcce0a7dcb774bc87cb2553a8f137bc875cb5dddf4d4
2026-09-10T21:58:24.4163730Z Copying blob sha256:9d33dbfb9e8abcd14e0a55be85f30752600448499b0dddb846f2bf5fd21d8d37
2026-09-10T21:58:24.4172034Z Copying blob sha256:d08ff564362ee8ca55bca00895929a4f92fc6c574c9ce4de07024e9627540fc8
2026-09-10T21:58:24.4172968Z Copying blob sha256:88fe04f85e71aef700a24d555248930b381fbdedb2be87e65dd9128fa4b93bf5
2026-09-10T21:58:24.4182483Z Copying blob sha256:6a8d5f164ca47b1c2e7bdb23f07d1bc02247c71c181d3950f2d0012967247ecf
2026-09-10T21:58:24.4183436Z Copying blob sha256:fc52cb1db6a2236e936683e32d7d60350c381fcb63403826f35e5d20a42ea4b4
2026-09-10T21:58:24.4188970Z Copying blob sha256:27f2ced2acdb114c526bf645b9d1b01fec071e61780410099142b37949a8e177
2026-09-10T21:58:24.4189208Z Copying blob sha256:e578e7bf31c2bac2e9cae908f01970074818ba19564ba62c52e4f60d293e22d2
2026-09-10T21:58:24.4200391Z Copying blob sha256:b29fa49cd757a63e0eb6f03b1998612903715a4dcd8b50b12f6b53910c2e67ae
2026-09-10T21:58:24.4200627Z Copying blob sha256:405281dd08e52c573399a3d7dd112b545a92923636ede89d04c5c76a5e9f929a
2026-09-10T21:58:24.4205285Z Copying blob sha256:7a2b528f79445d7c059524929c661a8297e6a4a9663206c104826eb2b51a1dfe
2026-09-10T21:58:24.4213619Z Copying blob sha256:19c2241f978dfd51ee0e33a16fbf562ec5285bd8ea9c16cb473269d2408df3fc
2026-09-10T21:58:24.4246087Z Copying blob sha256:af221c390955de20124d30fdf9562adb5aa753d14d5c7a1410047c3a7fb4ac05
2026-09-10T21:58:27.3756309Z Copying config sha256:1bc9feb650fdd8586491fadc60f630d7b0d9414684dc0fdb42f962b55fb0d948
2026-09-10T21:58:27.4699502Z Writing manifest to image destination
2026-09-10T21:58:27.4700086Z Storing signatures
2026-09-10T21:58:28.3323801Z --> 1bc9feb650f
2026-09-10T21:58:28.3324540Z Successfully tagged temp.builder.openshift.io/build-images-ads/siabm-autenticacao-24horas-152:0c3d351c
2026-09-10T21:58:28.4711440Z 1bc9feb650fdd8586491fadc60f630d7b0d9414684dc0fdb42f962b55fb0d948
2026-09-10T21:58:28.4762003Z 
2026-09-10T21:58:28.4763320Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/siabm-autenticacao-24horas:latest ...
2026-09-10T21:58:28.4772466Z Getting image source signatures
2026-09-10T21:58:28.5817933Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-10T21:58:28.6337856Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-10T21:58:28.6441474Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-10T21:58:28.6818919Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-10T21:58:28.7794009Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-10T21:58:28.8187622Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-10T21:58:28.8684503Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-10T21:58:28.8777508Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-10T21:58:28.8967952Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-10T21:58:29.0945301Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-10T21:58:29.1120891Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-10T21:58:29.1247292Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-10T21:58:29.1615084Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-10T21:58:29.1786671Z Copying blob sha256:af221c390955de20124d30fdf9562adb5aa753d14d5c7a1410047c3a7fb4ac05
2026-09-10T21:58:31.8997447Z Copying config sha256:1bc9feb650fdd8586491fadc60f630d7b0d9414684dc0fdb42f962b55fb0d948
2026-09-10T21:58:32.1175685Z Writing manifest to image destination
2026-09-10T21:58:32.2340298Z Storing signatures
2026-09-10T21:58:32.2341013Z Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/siabm-autenticacao-24horas@sha256:fe8f779497f1e8a415fe5fe9a19a596a0960fbac8a391e830699bd4764a3010f
2026-09-10T21:58:32.3246593Z Push successful
2026-09-10T21:58:37.7901587Z ##[section]Finishing: Executando Build S2I Binary
