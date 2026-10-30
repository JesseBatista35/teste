
Options:
      --allow-missing-template-keys=true: If true, ignore any errors in templates when a field or map key is missing in the template. Only applies to golang and jsonpath output formats.
      --append-hash=false: Append a hash of the configmap to its name.
      --dry-run=false: If true, only print the object that would be sent, without sending it.
      --from-env-file='': Specify the path to a file to read lines of key=val pairs to create a configmap (i.e. a Docker .env file).
      --from-file=[]: Key file can be specified using its file path, in which case file basename will be used as configmap key, or optionally with a key and file path, in which case the given key will be used.  Specifying a directory will iterate each named file in the directory whose basename is a valid configmap key.
      --from-literal=[]: Specify a key and literal value to insert in configmap (i.e. mykey=somevalue)
      --generator='configmap/v1': The name of the API generator to use.
  -o, --output='': Output format. One of: json|yaml|name|template|go-template|go-template-file|templatefile|jsonpath|jsonpath-file.
      --save-config=false: If true, the configuration of current object will be saved in its annotation. Otherwise, the annotation will be unchanged. This flag is useful when you want to perform kubectl apply on this object in the future.
      --template='': Template string or path to template file to use when -o=go-template, -o=go-template-file. The template format is golang templates [http://golang.org/pkg/text/template/#pkg-overview].
      --validate=false: If true, use a schema to validate the input before sending it

Use "oc options" for a list of global command-line options (applies to all commands).

error: no objects passed to apply
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe cm jboss-config-sihdg-jboss8 -n sihdg-hmp | grep -B1 -- "^----"
error: selfLink was empty, can't make reference
-sh-4.2$ oc describe cm jboss-config-sihdg-jboss8 -n sihdg-des | grep -B1 -- "^----"
error: selfLink was empty, can't make reference
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp -- ls -la /opt/server/standalone/configuration/
error: Internal error occurred: error executing command in container: container is not created or running
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp -- wc -l /opt/server/standalone/configuration/standalone.xml
438 /opt/server/standalone/configuration/standalone.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-hmp -o jsonpath='{.data.standalone-okd\.xml}' > /tmp/standalone.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c sihdgDS /tmp/standalone.xml
0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
>   --from-file=standalone.xml=/tmp/standalone.xml \
>   --dry-run -o yaml | oc replace -f -
configmap/jboss-config-sihdg-jboss8 replaced
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sihdg-jboss8-hmp-1-74qsf -n sihdg-hmp
pod "sihdg-jboss8-hmp-1-74qsf" deleted
-sh-4.2$
