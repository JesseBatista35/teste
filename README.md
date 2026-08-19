Aqui está uma nota de fechamento formal, resumindo o atendimento e o encaminhamento dado:

Nota de Fechamento — WO0000081383292 (SIPNC-gestaousuario-backend)

Resumo do atendimento:

Durante a análise da pipeline do projeto SIPNC-gestaousuario-backend, identificou-se que a configuração inicial da imagem (7.4.22-openjdk-17.0.15-bt-23) seguia o catálogo de imagens da wiki de JBoss EAP, incompatível com a stack real da aplicação (Spring Boot). Após ajuste do builder para a imagem spring-boot:8.2, a build passou a ser concluída com sucesso.

Em sequência, foram identificados e corrigidos dois pontos em runtime:

Mismatch de versão de JDK entre compilação (JDK 17) e imagem de runtime (spring-boot:8.2, JDK 11) — contornado com o uso da imagem quarkus-java-binary-s2i:openjdk17 como fonte de runtime JDK 17.
Falha de resolução de placeholder (Could not resolve placeholder 'CLISERPNC_SSO_LOGINX') — identificado que a configuração de consumo de segredos do BeyondTrust seguida (padrão Quarkus, via smallrye-config-source-file-system) não possui equivalente nativo no Spring Boot, framework real da aplicação. O agente BeyondTrust está funcional e grava os arquivos de segredo corretamente; a limitação está na camada de consumo pela aplicação.

Situação da esteira/pipeline: regularizada — builder correto, runtime JDK 17 operacional, agente BeyondTrust íntegro.

Pendência remanescente: ajuste no código da aplicação para leitura dos arquivos de segredo gravados pelo BeyondTrust (fora do escopo de esteira/pipeline).

Encaminhamento: situação alinhada via Teams com o demandante, que ficou responsável por verificar internamente com a equipe de desenvolvimento a implementação do mecanismo de consumo do segredo (ex.: EnvironmentPostProcessor/PropertySource customizado ou script de bootstrap).

Status: encerrado pelo lado de esteiras DevOps DES/TQS NPRD. Pendência de código a ser tratada pela equipe de desenvolvimento.
