alternatives --remove keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 2>/dev/null
alternatives --install /usr/bin/keytool keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 3
alternatives --display keytool


