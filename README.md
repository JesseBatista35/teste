alternatives --display keytool


Prezados,

Em atendimento à WO0000081122941, informamos a conclusão da atualização da JVM no servidor caddeapllx1567.agil.nprd.caixa.gov.br (ambiente SIRSA-batch, DES).

Resumo da execução:

1. Instalado o Eclipse Temurin JDK 21 (build 21.0.11+10) via tarball, em /usr/java/jdk-21.0.11+10, compatível com o sistema operacional do servidor (Red Hat Enterprise Linux 7.9).

2. Configurado o utilitário alternatives do sistema para apontar java, javac e keytool para o JDK 21 como padrão, mantendo o JDK 8 original preservado como fallback.

3. Realizado teste manual de execução do pacote sirsa-batch.jar com o novo JDK. A aplicação inicializou corretamente, reconhecendo Java 21.0.11 sem qualquer erro de compatibilidade de bytecode.

4. Durante o teste, foi identificado um erro de conexão com o banco de dados Oracle (ORA-01033: Oracle initialization or shutdown in progress), indicando que a instância estava em processo de inicialização/manutenção no momento do teste. Esse erro é de natureza distinta e não está relacionado à atualização da JVM.

A atualização da JVM para a versão 21 está concluída e validada tecnicamente. Ficamos à disposição para esclarecimentos adicionais.

Atenciosamente,
Jessé Batista
