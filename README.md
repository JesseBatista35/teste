Vamos testar isso agora, já que temos o caminho de transferência funcionando:
1. No seu PC, baixa o tarball do Temurin 21 (mesma página, só troca a versão): https://adoptium.net/temurin/releases/?version=21 → Linux x64 → .tar.gz
2. Repete o fluxo de transferência que já validamos:
bashscp OpenJDK21U-jdk_x64_linux_hotspot_21.0.X_X.tar.gz p585600@10.116.196.109:/tmp/
3. No servidor, extrai e testa direto (sem mexer no alternatives ainda):
bashmkdir -p /tmp/jdk21test
tar -xzf /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.X_X.tar.gz -C /tmp/jdk21test/
/tmp/jdk21test/jdk-21.*/bin/java -version
Se esse -version funcionar sem erro de GLIBC, aí sim seguimos: movemos pra /usr/lib/jvm/, registramos no alternatives com prioridade maior, e testamos o jar de novo.
Faz esse teste e me manda o resultado.


