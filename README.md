chown -R root:root /usr/lib/jvm/jdk-21.0.11+10


alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-21.0.11+10/bin/java 3
alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-21.0.11+10/bin/javac 3
alternatives --install /usr/bin/keytool keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 3
java -version

cd /opt/batch/deploy
java -jar sirsa-batch.jar --spring.profiles.active=des
