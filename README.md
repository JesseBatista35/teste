export JAVA_HOME=/usr/java/open-jdk-21.0.5
export PATH="$JAVA_HOME/bin:$PATH"

cd "$BUILD_SOURCESDIRECTORY" || exit 1
echo "PWD: $(pwd)"
ls -la pom.xml

echo "==== rodando mvn com timeout de 150s ===="
timeout 150 mvn -B -ntp help:evaluate -Dexpression=project.version -DforceStdout 2>&1 | tail -n 40
echo "==== EXIT: ${PIPESTATUS[0]} ===="
