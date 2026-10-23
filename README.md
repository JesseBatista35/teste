-sh-4.2$ oc exec sicow-penhor-okd-des-60-ndhzc -n sicow-des -- sed -n '1,120p' /usr/local/s2i/assemble
#!/bin/bash

set -x

#Jboss Home
JBOSS_HOME=/opt/jboss

# Source code provided to STI is at /tmp/src/
LOCAL_SOURCE_DIR=/tmp/src

# Resulting WAR files will be deployed to /opt/eap/standalone/deployments
DEPLOY_DIR=$JBOSS_HOME/standalone/deployments

# Modules File
modules_file="/tmp/src/jboss-modules"
generic_deployments="/tmp/src/jboss-deployments"
jboss_cli_offline="/tmp/src/cli-offline.sh"


function copy_generic_deployments() {
  if [[ -f $generic_deployments ]]
    then
      # Removing commented line from jboss-deployments
      sed -i '1d' $modules_file
      # Removing blank lines
      sed -i '/^$/d' $modules_file
      # Running for for download modules to /tmp/src
      for jars in $(cat /tmp/src/jboss-deployments)
      do
         artifact_id=`echo $jars | cut -d':' -f2`
         version=`echo $jars | cut -d':' -f3`
         extension=`echo $jars | cut -d':' -f4`
         mvn org.apache.maven.plugins:maven-dependency-plugin:2.9:get -DrepoUrl=$NEXUS_URL -Dartifact=$jars -Ddest=/tmp/src/${artifact_id}-${version}.${extension}
      done
    else
      echo "Nenhum Deploy adicional será configurado"
  fi
}

function copy_artifacts() {
  if [ -d $LOCAL_SOURCE_DIR ]; then
    echo "Copying all WAR and EAR artifacts from $LOCAL_SOURCE_DIR directory into $DEPLOY_DIR for later deployment..."
    cp -v $LOCAL_SOURCE_DIR/*.jar $LOCAL_SOURCE_DIR/*.war $LOCAL_SOURCE_DIR/*.ear $LOCAL_SOURCE_DIR/*.rar $DEPLOY_DIR 2> /dev/null
  fi
}

function modules() {
  if [[ -f $modules_file ]]
   then
      # Removing commented line from jboss-modules
      sed -i '1d' $modules_file
      # Removing blank lines
      sed -i '/^$/d' $modules_file
      # Running for for download modules to /tmp
      for jars in $(cat /tmp/src/jboss-modules)
      do
         artifact_id=`echo $jars | cut -d':' -f2`
         version=`echo $jars | cut -d':' -f3`
         extension=`echo $jars | cut -d':' -f4`
         mvn org.apache.maven.plugins:maven-dependency-plugin:2.9:get -DrepoUrl=$NEXUS_URL -Dartifact=$jars -Ddest=/tmp/${artifact_id}-${version}.${extension}
      done
    else
      echo "Nenhum modulo adicional será configurado"
  fi
}


function jboss_cli() {
  if [[ -f $jboss_cli_offline ]]
    then
       if [[ $JBOSS_VERSION =~ "7" ]]
         then
            sed -i '1 i\embed-server' /tmp/src/cli-offline.sh
            $JBOSS_HOME/bin/jboss-cli.sh --file=/tmp/src/cli-offline.sh
         else
           $JBOSS_HOME/bin/standalone.sh &
           sleep 10
           $JBOSS_HOME/bin/jboss-cli.sh --file=/tmp/src/cli-offline.sh
      fi
  fi
}

copy_generic_deployments
modules
jboss_cli

# Copy (probably binary) artifacts from the /tmp/src/
# directory to the $JBOSS_HOME/standalone/deployments/
copy_artifacts "deployments"

exit 0
-sh-4.2$
