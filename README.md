.s2i ta assim

#!/bin/bash

#PHP Home
NGINX_HOME=/opt/app-root

# Source code provided to STI is at /tmp/src/
LOCAL_SOURCE_DIR=/tmp/src

# Resulting ZIP files will be deployed to /opt/app-root/src
DEPLOY_DIR=$NGINX_HOME/src

#/opt/app-root/src

function copy_artifacts() {
  if [ -d $LOCAL_SOURCE_DIR ]; then
    echo "Copying all WAR, EAR, JAR and ZIP artifacts from $LOCAL_SOURCE_DIR directory into $DEPLOY_DIR for later deployment..."
    cp -v $LOCAL_SOURCE_DIR/*.zip $LOCAL_SOURCE_DIR/*.jar $LOCAL_SOURCE_DIR/*.war $LOCAL_SOURCE_DIR/*.ear $DEPLOY_DIR 2> /dev/null
   	unzip $DEPLOY_DIR/*.zip -d $DEPLOY_DIR 2> /dev/null
    mv $DEPLOY_DIR/dist/*  $DEPLOY_DIR/.     
	  rm -rf $DEPLOY_DIR/*.zip
  fi
}

# Copy (probably binary) artifacts from the /tmp/src/
# directory to the $NGINX_HOME/src
# directory for later deployment
copy_artifacts "deployments"

exit 0





run


#!/bin/bash

source /opt/app-root/etc/generate_container_user

set -e

source ${NGINX_CONTAINER_SCRIPTS_PATH}/common.sh

process_extending_files ${NGINX_APP_ROOT}/src/nginx-start ${NGINX_CONTAINER_SCRIPTS_PATH}/nginx-start

#replace static values with environment variables
# The example below:
#if [ -n "$VAR" ]; then
#    sed -i "s#__VAR__#$VAR#g" /opt/app-root/src/main*.js
#fi

if [ -n "$URL_SSO" ]; then
    sed -i "s#__URL_SSO__#$URL_SSO#g" /opt/app-root/src/main*.js
fi

if [ -n "$API" ]; then
    sed -i "s#__API__#$API#g" /opt/app-root/src/main*.js
fi

if [ -n "$MODULO" ]; then
    sed -i "s#__MODULO__#$MODULO#g" /opt/app-root/src/main*.js
fi

if [ -n "$VERSION.APP" ]; then
    sed -i "s#__VERSION.APP__#$VERSION.APP#g" /opt/app-root/src/main*.js
fi

exec nginx -g "daemon off;"



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SINCH-web-angular20-intra
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SINCH-web-angular20-intra

.s2i
e2e
src
app
assets
environments
favicon.ico
index.html
main.ts
polyfills.ts
styles.scss
test.ts
.browserslistrc
.gitignore
angular.json

karma.conf.js
package.json
proxy.conf.js
proxy.config.json
README.md
tsconfig.app.json
tsconfig.json
tsconfig.spec.json
tslint.json

develop

/
src
src

New

Contents
History

app
17 de jun.
205f61de
initial commit Fabricio Fernandes
assets
17 de jun.
205f61de
initial commit Fabricio Fernandes
environments
17 de jun.
205f61de
initial commit Fabricio Fernandes
favicon.ico
17 de jun.
205f61de
initial commit Fabricio Fernandes
index.html
17 de jun.
205f61de
initial commit Fabricio Fernandes
main.ts
17 de jun.
205f61de
initial commit Fabricio Fernandes
polyfills.ts
17 de jun.
205f61de
initial commit Fabricio Fernandes
styles.scss
17 de jun.
205f61de
initial commit Fabricio Fernandes
test.ts
17 de jun.
205f61de
initial commit Fabricio Fernandes
Showing filters 1 through 3

No code files found for 'dockerfile' with applied filters
