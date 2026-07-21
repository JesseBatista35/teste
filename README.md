/usr/lib/jvm/jdk-17.0.19+10/bin/java -version


alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-17.0.19+10/bin/java 2
alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-17.0.19+10/bin/javac 2


alternatives --display java
