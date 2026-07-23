alternatives --install /usr/bin/java java /usr/java/jdk-21.0.11+10/bin/java 210011
alternatives --install /usr/bin/javac javac /usr/java/jdk-21.0.11+10/bin/javac 210011
alternatives --install /usr/bin/keytool keytool /usr/java/jdk-21.0.11+10/bin/keytool 210011
java -version


cd /opt/batch/deploy
java -jar sirsa-batch.jar --spring.profiles.active=des

