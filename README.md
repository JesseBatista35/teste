oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd\.xml}' > ~/standalone-okd.xml
sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' ~/standalone-okd.xml
grep "pool-name=\"sihdgDS\"" ~/standalone-okd.xml
oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone-okd.xml=~/standalone-okd.xml --dry-run=client -o yaml | oc apply -f -
oc rollout latest dc/sihdg-jboss8-des -n sihdg-des
oc rollout status dc/sihdg-jboss8-des -n sihdg-des --watch




-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone-okd\.xml}' > ~/standalone-okd.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's#jndi-name="java:jboss/datasources/ExampleDS" pool-name="sihdgDS"#jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS"#' ~/standalone-okd.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "pool-name=\"sihdgDS\"" ~/standalone-okd.xml
                <datasource jta="true" jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS" enabled="true" use-ccm="true">
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone-okd.xml=~/standalone-okd.xml --dry-run=client -o yaml | oc apply -f -
Error: invalid argument "client" for "--dry-run" flag: strconv.ParseBool: parsing "client": invalid syntax


Aliases:
configmap, cm

Usage:
  oc create configmap NAME [--from-file=[key=]source] [--from-literal=key1=value1] [--dry-run] [flags]

Examples:
  # Create a new configmap named my-config based on folder bar
  oc create configmap my-config --from-file=path/to/bar

  # Create a new configmap named my-config with specified keys instead of file basenames on disk
  oc create configmap my-config --from-file=key1=/path/to/bar/file1.txt --from-file=key2=/path/to/bar/file2.txt

  # Create a new configmap named my-config with key1=config1 and key2=config2
  oc create configmap my-config --from-literal=key1=config1 --from-literal=key2=config2

  # Create a new configmap named my-config from the key=value pairs in the file
  oc create configmap my-config --from-file=path/to/bar

  # Create a new configmap named my-config from an env file
  oc create configmap my-config --from-env-file=path/to/bar.env

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
