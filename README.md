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
/bin/bash /opt/ads-agent/_work/_temp/44461fbb-a3a5-4e82-a21f-2673dccf027b.sh
+ set -o errexit
+ set -o pipefail
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=siavl-gerencial-frontend
+ oc start-build siavl-gerencial-frontend --from-dir=/opt/ads-agent/_work/254/a --follow --wait=true -n build-images-ads -v=5
I0811 11:53:16.444827 1761338 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0811 11:53:16.447187 1761338 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/254/a" as binary input for the build ...
I0811 11:53:16.447734 1761338 tar.go:238] Adding "/opt/ads-agent/_work/254/a" to tar ...
I0811 11:53:16.448286 1761338 tar.go:336] Adding to tar: /opt/ads-agent/_work/254/a/siavl-gerencial-frontend-0.0.0.zip as siavl-gerencial-frontend-0.0.0.zip
.
Uploading finished
build.build.openshift.io/siavl-gerencial-frontend-13 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-08-11T14:53:24Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0811 14:53:24.324461       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
Getting image source signatures
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de



STEP 5/9: COPY upload/src /tmp/src
STEP 6/9: RUN chown -R 1001:0 /tmp/src
STEP 7/9: USER 1001
STEP 8/9: RUN /usr/libexec/s2i/assemble
---> Installing application source
---> Copying nginx start-hook scripts...
STEP 9/9: CMD /usr/libexec/s2i/run
COMMIT temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-13:4cd095d5
time="2026-08-11T14:53:32Z" level=warning msg="Adding metacopy option, configured globally"
Getting image source signatures
Copying blob sha256:1733579794674bb13464023e8b7839ad924216064387c3bc9f53c33a4b3cd3c1
Copying blob sha256:47f871cfc125200d9264414fdf234fb7c57beea52683c16fc73a115463ed1454
Copying blob sha256:ced3c19e38498b34993f3d72c5f4fb7089fafe5ac67ce947b2f86f1371e582ab
Copying blob sha256:9b1f3195797934752eac7a7e5ac06cec1f38932871ec486a6a34f42375ab8183
Copying blob sha256:0cd3bd1c23238e6574774c8ba7021fd95b4823599918fff9b8449f9b4373c317
Copying blob sha256:c09889b8accfa94140a986dca1408172927f5c777b21ce7ded2a0b94e0544f7c
Copying config sha256:83e0a45bd58e23cbcff3554da4445b4e2f6272f8fd905d093b00b6d56ab83793
Writing manifest to image destination
Storing signatures
--> 83e0a45bd58
Successfully tagged temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-13:4cd095d5
83e0a45bd58e23cbcff3554da4445b4e2f6272f8fd905d093b00b6d56ab83793

Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend:latest ...
Getting image source signatures
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:c09889b8accfa94140a986dca1408172927f5c777b21ce7ded2a0b94e0544f7c
Copying config sha256:83e0a45bd58e23cbcff3554da4445b4e2f6272f8fd905d093b00b6d56ab83793
Writing manifest to image destination
Storing signatures
Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend@sha256:1601a377bbc5d3d11105d6e820bb370de8a57807251b27112c46606409c55e7c
Push successful
Finishing: Executando Build S2I Binary
