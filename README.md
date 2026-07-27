
/usr/bin/bash /opt/ads-agent/_work/_temp/97c08303-1f28-4e08-8a0e-e512169bf2b1.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sifap-centralizadora-frontend-intranet
+ oc start-build sifap-centralizadora-frontend-intranet --from-dir=/opt/ads-agent/_work/20/a --follow --wait=true -n build-images-ads -v=5
I0727 09:25:08.513689   53130 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0727 09:25:08.516024   53130 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/20/a" as binary input for the build ...
I0727 09:25:08.516257   53130 tar.go:238] Adding "/opt/ads-agent/_work/20/a" to tar ...
I0727 09:25:08.518851   53130 tar.go:336] Adding to tar: /opt/ads-agent/_work/20/a/.s2i as .s2i
I0727 09:25:08.519486   53130 tar.go:336] Adding to tar: /opt/ads-agent/_work/20/a/.s2i/bin as .s2i/bin
I0727 09:25:08.519632   53130 tar.go:336] Adding to tar: /opt/ads-agent/_work/20/a/.s2i/bin/assemble as .s2i/bin/assemble
I0727 09:25:08.519786   53130 tar.go:336] Adding to tar: /opt/ads-agent/_work/20/a/.s2i/bin/run as .s2i/bin/run
I0727 09:25:08.519928   53130 tar.go:336] Adding to tar: /opt/ads-agent/_work/20/a/sifap-centralizadora-frontend-intranet.zip as sifap-centralizadora-frontend-intranet.zip

Uploading finished
build.build.openshift.io/sifap-centralizadora-frontend-intranet-98 started
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-07-27T12:25:16Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0727 12:25:16.052162       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/nginx@sha256:d4c426a72029951c5b81d6ea57ecae73e9a4ea8aeeb115cf871bf7b375bcd44c...
Getting image source signatures
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying config sha256:90b0cf992825e3025554113313ee65e4bf7266435c790dcb45f1e6512958e3de
Writing manifest to image destination
Storing signatures


Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying blob sha256:85e6d8a25256cd471add937073fed8180d0607c8acf43c582ad157c3556d81ac
Warning: Push failed, retrying in 5s ...
Getting image source signatures
Copying blob sha256:44115d860fcecaa250b811cc4120d7ba18a2250bada1fe15199de53cefde7fc7
Copying blob sha256:06038631a24a25348b51d1bfc7d0a0ee555552a8998f8328f9b657d02dd4c64c
Copying blob sha256:262268b65bd5f33784d6a61514964887bc18bc00c60c588bc62bfae7edca46f1
Copying blob sha256:b7874c7c745526edc862e5c886bfa9b9ded6e01ef384d46ce1aee844f8a7eefc
Copying blob sha256:16ced056df22eeca4ed0180b92a884beb321e53afded464e9c64bab3e5f7a650
Copying blob sha256:85e6d8a25256cd471add937073fed8180d0607c8acf43c582ad157c3556d81ac
Warning: Push failed, retrying in 5s ...
Registry server Address: 
Registry server User Name: serviceaccount
Registry server Email: serviceaccount@example.org
Registry server Password: <<non-empty>>
error: build error: Failed to push image: writing blob: initiating layer upload to /v2/build-images-ads/sifap-centralizadora-frontend-intranet/blobs/uploads/ in image-registry.openshift-image-registry.svc:5000: received unexpected HTTP status: 500 Internal Server Error
rpc error: code = NotFound desc = could not find container "9b692c67f36da2175ec611c948f80980c798ddb9795b4b6d525001e5a4ad8e8e": specified container not found: 9b692c67f36da2175ec611c948f80980c798ddb9795b4b6d525001e5a4ad8e8eI0727 09:26:43.662303   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:27:43.701511   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:28:43.724923   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:29:43.746762   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:30:43.768823   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:31:43.786515   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:32:43.806307   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:33:43.828447   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:34:43.847868   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:35:43.872415   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:36:43.894922   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:37:43.950206   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:38:43.971423   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:39:44.005300   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:40:44.028218   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:41:44.050367   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:42:44.078728   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:43:44.114457   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
I0727 09:44:44.147300   53130 streamwatcher.go:111] Unexpected EOF during watch stream event decoding: unexpected EOF
##[error]The task has timed out.
Finishing: Executando Build S2I Binary
