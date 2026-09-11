2026-09-11T17:20:14.0887209Z ##[section]Starting: Executando Build S2I Binary
2026-09-11T17:20:14.0893072Z ==============================================================================
2026-09-11T17:20:14.0893219Z Task         : Bash
2026-09-11T17:20:14.0893296Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-11T17:20:14.0893415Z Version      : 3.227.0
2026-09-11T17:20:14.0893492Z Author       : Microsoft Corporation
2026-09-11T17:20:14.0893584Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-11T17:20:14.0893714Z ==============================================================================
2026-09-11T17:20:14.2319765Z Generating script.
2026-09-11T17:20:14.2333772Z ========================== Starting Command Output ===========================
2026-09-11T17:20:14.2341232Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/17b82914-9233-4d9f-93c7-5f42844df3de.sh
2026-09-11T17:20:14.2400133Z + set -o errexit
2026-09-11T17:20:14.2400358Z + set -o pipefail
2026-09-11T17:20:14.2401220Z + echo okd4_nprd
2026-09-11T17:20:14.2401839Z + egrep -q '^(okd4|ocp)'
2026-09-11T17:20:14.2435657Z + buildconfig=siabm-autenticacao-24horas
2026-09-11T17:20:14.2436975Z + oc start-build siabm-autenticacao-24horas --from-dir=/opt/ads-agent/_work/65/a --follow --wait=true -n build-images-ads -v=5
2026-09-11T17:20:14.3090990Z I0911 14:20:14.308698  159929 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
2026-09-11T17:20:14.3115941Z I0911 14:20:14.311388  159929 repository.go:533] Error executing command: exit status 128
2026-09-11T17:20:14.3116610Z Uploading directory "/opt/ads-agent/_work/65/a" as binary input for the build ...
2026-09-11T17:20:14.3116867Z I0911 14:20:14.311547  159929 tar.go:238] Adding "/opt/ads-agent/_work/65/a" to tar ...
2026-09-11T17:20:14.3122947Z I0911 14:20:14.311962  159929 tar.go:336] Adding to tar: /opt/ads-agent/_work/65/a/SIABM-autenticacao-24horas-20260911-1419-1-0-1-0-SNAPSHOT.zip as SIABM-autenticacao-24horas-20260911-1419-1-0-1-0-SNAPSHOT.zip
2026-09-11T17:20:23.3925252Z .I0911 14:20:23.392116  159929 tar.go:336] Adding to tar: /opt/ads-agent/_work/65/a/SIABM-autenticacao-24horas.jar as SIABM-autenticacao-24horas.jar
2026-09-11T17:20:27.9920739Z .
2026-09-11T17:20:27.9920960Z Uploading finished
2026-09-11T17:20:27.9921594Z build.build.openshift.io/siabm-autenticacao-24horas-153 started
2026-09-11T17:20:28.0558641Z Adding cluster TLS certificate authority to trust store
2026-09-11T17:20:28.0558889Z Receiving source from STDIN as archive ...
2026-09-11T17:20:31.6538439Z Adding cluster TLS certificate authority to trust store
2026-09-11T17:20:33.6710828Z Adding cluster TLS certificate authority to trust store
2026-09-11T17:20:34.9921890Z time="2026-09-11T17:20:34Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
2026-09-11T17:20:34.9933871Z I0911 17:20:34.992509       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
2026-09-11T17:20:37.8086973Z Caching blobs under "/var/cache/blobs".
2026-09-11T17:20:37.8103861Z Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25...
2026-09-11T17:20:37.9105092Z Getting image source signatures
2026-09-11T17:20:39.4439429Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-11T17:20:39.5535952Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-11T17:20:39.6666527Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-11T17:20:39.7853675Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-11T17:20:39.7888912Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-11T17:20:39.9349477Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-11T17:20:43.6058082Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-11T17:20:43.9266988Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-11T17:20:43.9725704Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-11T17:20:44.6888417Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-11T17:20:45.0329471Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-11T17:20:45.0486044Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-11T17:20:45.4286905Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-11T17:20:55.9013394Z Copying config sha256:db5724295b3ca3bdc954cddb4ae13f779ef6dc185fa6fa797276b78493e1b0b2
2026-09-11T17:20:56.5331755Z Writing manifest to image destination
2026-09-11T17:20:56.5824866Z Storing signatures
2026-09-11T17:21:25.4790205Z Generating dockerfile with builder image image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-11T17:21:26.6856076Z STEP 1/9: FROM image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25
2026-09-11T17:21:26.9948845Z STEP 2/9: LABEL "io.openshift.build.image"="image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:c14dd0ad9ae18713c127b5f98c9b2f2a4d85ce5215bc6e659432b7c112e6ef25"       "io.openshift.build.source-location"="/tmp/build/inputs"
2026-09-11T17:21:27.0281535Z STEP 3/9: ENV OPENSHIFT_BUILD_NAME="siabm-autenticacao-24horas-153"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
2026-09-11T17:21:27.0573518Z STEP 4/9: USER root
2026-09-11T17:21:27.0817067Z STEP 5/9: COPY upload/src /tmp/src
2026-09-11T17:21:28.3101799Z STEP 6/9: RUN chown -R 1001:0 /tmp/src
2026-09-11T17:21:30.0066085Z STEP 7/9: USER 1001
2026-09-11T17:21:30.0322565Z STEP 8/9: RUN /usr/local/s2i/assemble
2026-09-11T17:21:30.4868939Z + LOCAL_SOURCE_DIR=/tmp/src
2026-09-11T17:21:30.4869124Z + DEPLOY_DIR=/deployments
2026-09-11T17:21:30.4869233Z + copy_artifacts deployments
2026-09-11T17:21:30.4869633Z + '[' -d /tmp/src ']'
2026-09-11T17:21:30.4869863Z + echo 'Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...'
2026-09-11T17:21:30.4870053Z Copying all WAR and EAR artifacts from /tmp/src directory into /deployments for later deployment...
2026-09-11T17:21:30.4870399Z + cp -rfv '/tmp/src/*-runner.jar' '/tmp/src/*-run.jar' /tmp/src/SIABM-autenticacao-24horas-20260911-1419-1-0-1-0-SNAPSHOT.zip /tmp/src/SIABM-autenticacao-24horas.jar /deployments
2026-09-11T17:21:30.5876218Z '/tmp/src/SIABM-autenticacao-24horas-20260911-1419-1-0-1-0-SNAPSHOT.zip' -> '/deployments/SIABM-autenticacao-24horas-20260911-1419-1-0-1-0-SNAPSHOT.zip'
2026-09-11T17:21:30.5876602Z '/tmp/src/SIABM-autenticacao-24horas.jar' -> '/deployments/SIABM-autenticacao-24horas.jar'
2026-09-11T17:21:30.5876747Z + exit 0
2026-09-11T17:21:42.3238416Z STEP 9/9: CMD /usr/local/s2i/run
2026-09-11T17:21:42.3411106Z COMMIT temp.builder.openshift.io/build-images-ads/siabm-autenticacao-24horas-153:70caae5f
2026-09-11T17:21:42.3437113Z time="2026-09-11T17:21:42Z" level=warning msg="Adding metacopy option, configured globally"
2026-09-11T17:21:46.3475942Z Getting image source signatures
2026-09-11T17:21:48.9853754Z Copying blob sha256:f9327c1608ad0ae79b5f4a4c47eda907a980ea9640c70e6036811ea76d641249
2026-09-11T17:21:49.1633413Z Copying blob sha256:449675ca11bc217d5066dcce0a7dcb774bc87cb2553a8f137bc875cb5dddf4d4
2026-09-11T17:21:49.1633706Z Copying blob sha256:9d33dbfb9e8abcd14e0a55be85f30752600448499b0dddb846f2bf5fd21d8d37
2026-09-11T17:21:49.1633959Z Copying blob sha256:d08ff564362ee8ca55bca00895929a4f92fc6c574c9ce4de07024e9627540fc8
2026-09-11T17:21:49.1650035Z Copying blob sha256:88fe04f85e71aef700a24d555248930b381fbdedb2be87e65dd9128fa4b93bf5
2026-09-11T17:21:49.1650641Z Copying blob sha256:6a8d5f164ca47b1c2e7bdb23f07d1bc02247c71c181d3950f2d0012967247ecf
2026-09-11T17:21:49.1650816Z Copying blob sha256:fc52cb1db6a2236e936683e32d7d60350c381fcb63403826f35e5d20a42ea4b4
2026-09-11T17:21:49.1651047Z Copying blob sha256:27f2ced2acdb114c526bf645b9d1b01fec071e61780410099142b37949a8e177
2026-09-11T17:21:49.1651286Z Copying blob sha256:e578e7bf31c2bac2e9cae908f01970074818ba19564ba62c52e4f60d293e22d2
2026-09-11T17:21:49.1651509Z Copying blob sha256:b29fa49cd757a63e0eb6f03b1998612903715a4dcd8b50b12f6b53910c2e67ae
2026-09-11T17:21:49.1658483Z Copying blob sha256:405281dd08e52c573399a3d7dd112b545a92923636ede89d04c5c76a5e9f929a
2026-09-11T17:21:49.1663668Z Copying blob sha256:7a2b528f79445d7c059524929c661a8297e6a4a9663206c104826eb2b51a1dfe
2026-09-11T17:21:49.1880273Z Copying blob sha256:19c2241f978dfd51ee0e33a16fbf562ec5285bd8ea9c16cb473269d2408df3fc
2026-09-11T17:21:49.1943569Z Copying blob sha256:2ad39ce2c1758b19183741da148e714470d8b38cdc5ea6a709941d050c2e2450
2026-09-11T17:21:52.4171029Z Copying config sha256:071ea3d889c915e267bc4f8c62987eaf0b06096da642bb3549a1b01a78470ba4
2026-09-11T17:21:52.8302859Z Writing manifest to image destination
2026-09-11T17:21:52.9386034Z Storing signatures
2026-09-11T17:21:54.9484711Z --> 071ea3d889c
2026-09-11T17:21:54.9485267Z Successfully tagged temp.builder.openshift.io/build-images-ads/siabm-autenticacao-24horas-153:70caae5f
2026-09-11T17:21:55.2169588Z 071ea3d889c915e267bc4f8c62987eaf0b06096da642bb3549a1b01a78470ba4
2026-09-11T17:21:55.2864285Z 
2026-09-11T17:21:55.2865208Z Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/siabm-autenticacao-24horas:latest ...
2026-09-11T17:21:55.2925097Z Getting image source signatures
2026-09-11T17:21:55.5916260Z Copying blob sha256:c98bbacb82bbf386496c2e0ef89b288bc8782dd9ae664dddcb285cf0965ba7f2
2026-09-11T17:21:55.6882304Z Copying blob sha256:e1c363c96d760cb85e197cc8e2ab950760067935b29e7c098ae51ed371f5b0cd
2026-09-11T17:21:55.7618039Z Copying blob sha256:24dafab7f594e7a2b9e71b74932f6f72d2e31ac8f84fbd5062d173e63637b237
2026-09-11T17:21:56.0475743Z Copying blob sha256:264aaa453271eaaf6bc92b521f62e38cbda4f01e1a3fbf50abdb8b466be58a64
2026-09-11T17:21:56.1726002Z Copying blob sha256:0a9a2db04f3ebe8121912deecd1a66d98a4ff35c7a3ee57e3eeffcb667119be1
2026-09-11T17:21:56.1838546Z Copying blob sha256:7f24bdb73d536337c7d82dee9c11e09acd3bacb0e1a76e98c6e82a8208e82284
2026-09-11T17:21:58.5739793Z Copying blob sha256:62d739cb3ca9a7f2a63e12f99c516e6432170af671b061195e6eafa7e864d6a2
2026-09-11T17:21:58.6739990Z Copying blob sha256:9d5b85cf24e32083e165099afcc1bd9cc0a57a764f9077301e686e2d27f0eb2c
2026-09-11T17:21:58.9402707Z Copying blob sha256:067039afffe5f5aa56bc578e5d9256b8b0055763a32c54a38a73b969a8fd4f13
2026-09-11T17:21:59.1875415Z Copying blob sha256:4e0cd4f607fede7693f7eb61b31b84c051e5897ce5a096534ed90dc4808e5523
2026-09-11T17:21:59.2208560Z Copying blob sha256:586ae232f6757fb4248eda7dca86bf361d076242d052ee30965fec2eb1ea5a1c
2026-09-11T17:21:59.4525750Z Copying blob sha256:7749ffa7020405743e3e0425d93720455a83619d343e217645f48f948260ab49
2026-09-11T17:21:59.6766739Z Copying blob sha256:da2064a8b4a27db53f236c51c89c049f993c4438da41f6c80cb24242776bf1da
2026-09-11T17:21:59.6781992Z Copying blob sha256:2ad39ce2c1758b19183741da148e714470d8b38cdc5ea6a709941d050c2e2450
2026-09-11T17:22:03.7015274Z Copying config sha256:071ea3d889c915e267bc4f8c62987eaf0b06096da642bb3549a1b01a78470ba4
2026-09-11T17:22:04.0034098Z Writing manifest to image destination
2026-09-11T17:22:04.1110871Z Storing signatures
2026-09-11T17:22:04.1111596Z Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/siabm-autenticacao-24horas@sha256:3a75cae8ee733bb54a3338ee93ace2b0afeba4ebb6962151469db5715eb1f88f
2026-09-11T17:22:04.1867586Z Push successful
2026-09-11T17:22:09.8141039Z ##[section]Finishing: Executando Build S2I Binary
