
Prezados,

Informamos a conclusão da atualização da JVM no servidor caddeapllx1369.agil.nprd.caixa.gov.br (ambiente SIRSA-batch, DES).

Resumo da execução:

1. Instalado o Eclipse Temurin JDK 21 (build 21.0.11+10) via tarball, em /usr/lib/jvm/jdk-21.0.11+10, compatível com o sistema operacional atual do servidor (Red Hat Enterprise Linux 7.9).

2. Configurado o utilitário alternatives do sistema para apontar java, javac e keytool para o JDK 21 como padrão, mantendo o JDK 17 disponível como opção intermediária e o JDK 11 original preservado.

3. Realizado teste manual de execução do pacote sirsa-batch.jar com o novo JDK. A aplicação inicializou corretamente, reconhecendo Java 21.0.11 sem qualquer erro de compatibilidade de bytecode (o pacote está compilado para a versão 65.0 do class file, correspondente ao Java 21).

4. Durante o teste, foi identificado um erro de conexão com o banco de dados Oracle (ORA-12514: serviço orad01ng não registrado no listener em cnpexdadvm01clu04.extra.caixa.gov.br:1521). Esse erro é de natureza distinta e não está relacionado à atualização da JVM; recomendamos validação em conjunto com o time responsável pela infraestrutura de banco de dados antes da próxima execução agendada via Control-M, ou confirmação de que a rota de rede e o listener são acessíveis somente durante a execução orquestrada pelo Control-M.

A atualização da JVM para a versão 21 está concluída e validada tecnicamente. Ficamos à disposição para esclarecimentos adicionais.

Atenciosamente,
Jessé Batista
