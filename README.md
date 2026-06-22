+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/17/s/target/server ']'
+ oc start-build sisou-sac-okd --from-dir=/opt/ads-agent/_work/17/a --follow --wait=true -n build-images-ads -v=5
I0622 15:31:44.986161   33943 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0622 15:31:44.989583   33943 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/17/a" as binary input for the build ...
I0622 15:31:44.989783   33943 tar.go:238] Adding "/opt/ads-agent/_work/17/a" to tar ...
I0622 15:31:44.990187   33943 tar.go:336] Adding to tar: /opt/ads-agent/_work/17/a/sisou-sac-okd.ear as sisou-sac-okd.ear

Uploading finished
The ImageStreamTag "jboss-eap:7.4.14-openjdk17" is invalid: from: Error resolving ImageStreamTag jboss-eap:7.4.14-openjdk17 in namespace openshift: unable to find latest tagged image
##[error]Bash exited with code '1'.
##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 1) after 1000 ms
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/616fef86-26b7-4782-a01e-d4d8ef74ca55.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sisou-sac-okd
+ DOTNET_ASSEMBLY=
/opt/ads-agent/_work/_temp/616fef86-26b7-4782-a01e-d4d8ef74ca55.sh: line 12:  -4: substring expression < 0
+ cd /opt/ads-agent/_work/17/a
+ FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)
++ find -maxdepth 1 -name '*.runtimeconfig*.json'
+ '[' -d /opt/ads-agent/_work/17/s/target/server ']'
+ oc start-build sisou-sac-okd --from-dir=/opt/ads-agent/_work/17/a --follow --wait=true -n build-images-ads -v=5
I0622 15:31:47.289649   33970 repository.go:450] Executing git show -s HEAD --format=%H%n%an%n%ae%n%cn%n%ce%n%B
I0622 15:31:47.292862   33970 repository.go:533] Error executing command: exit status 128
Uploading directory "/opt/ads-agent/_work/17/a" as binary input for the build ...
I0622 15:31:47.293143   33970 tar.go:238] Adding "/opt/ads-agent/_work/17/a" to tar ...
I0622 15:31:47.293542   33970 tar.go:336] Adding to tar: /opt/ads-agent/_work/17/a/sisou-sac-okd.ear as sisou-sac-okd.ear

Uploading finished
The ImageStreamTag "jboss-eap:7.4.14-openjdk17" is invalid: from: Error resolving ImageStreamTag jboss-eap:7.4.14-openjdk17 in namespace openshift: unable to find latest tagged image
##[error]Bash exited with code '1'.
Finishing: Executando Build S2I Binary
