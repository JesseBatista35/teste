export JAVA_HOME=/usr/java/open-jdk-21.0.5
export PATH="$JAVA_HOME/bin:$PATH"
cd "$BUILD_SOURCESDIRECTORY" || exit 1
chmod +x mvnw
timeout 200 ./mvnw -B help:evaluate -Dexpression=project.version -DforceStdout 2>&1 | grep -iE "download|quarkus|error|exit" | tail -n 30
echo "==== EXIT: ${PIPESTATUS[0]} ===="
