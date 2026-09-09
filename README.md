jar tf /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar | head -5

python3 -c "import zipfile; z=zipfile.ZipFile('/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar'); print('bad file:', z.testzip()); print('entries:', len(z.namelist()))"

tail -c 200 /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar | xxd | tail -10

which java
java -version
