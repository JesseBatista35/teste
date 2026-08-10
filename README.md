#!/bin/bash
set -e

cd "$(Build.SourcesDirectory)"

GROUP_ID=$(grep -m1 -oP '(?<=<groupId>).*(?=</groupId>)' pom.xml)
ARTIFACT_ID=$(grep -m1 -oP '(?<=<artifactId>).*(?=</artifactId>)' pom.xml)
VERSION=$(grep -m1 -oP '(?<=<version>).*(?=</version>)' pom.xml)

mkdir -p "$(Build.SourcesDirectory)/target/maven-archiver"

cat > "$(Build.SourcesDirectory)/target/maven-archiver/pom.properties" <<EOF
groupId=${GROUP_ID}
artifactId=${ARTIFACT_ID}
version=${VERSION}
EOF

echo "pom.properties gerado em $(Build.SourcesDirectory)/target/maven-archiver/pom.properties:"
cat "$(Build.SourcesDirectory)/target/maven-archiver/pom.properties"
