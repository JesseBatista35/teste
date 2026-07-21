Prezados,

Em atendimento à solicitação de atualização da JVM para a versão 21 no servidor caddeapllx1369.agil.nprd.caixa.gov.br (ambiente SIRSA), foi realizado levantamento técnico que aponta para dois impeditivos que precisam ser esclarecidos antes da execução:

1. Incompatibilidade de sistema operacional: o servidor está em Red Hat Enterprise Linux 7.9, com glibc na versão 2.17. Os builds oficiais de OpenJDK 21 exigem glibc 2.28 ou superior, o que inviabiliza a instalação da JVM 21 neste servidor sem uma atualização prévia do sistema operacional.

2. Ausência de JBoss/WildFly no servidor: não foi localizada nenhuma instância de JBoss EAP ou WildFly em execução ou instalada no servidor, tampouco arquivos de configuração (standalone.conf, jboss-modules.jar) ou processos ativos nas portas padrão (8080, 9990, 8443). O servidor apresenta apenas estruturas de diretórios de dados (relatorios, processado, ArquivosRemessas, ArquivosTVMs), característico de um servidor de processamento de arquivos, e não de um servidor de aplicação.

Solicitamos confirmar:
- Se o servidor indicado é de fato o destino correto para esta atualização, ou se a demanda deveria apontar para outro node da topologia do SIRSA;
- Caso o servidor esteja correto, se há previsão de atualização do sistema operacional para uma versão compatível com JDK 21;
- Se a atualização pode ser reavaliada para a versão 17 do JDK, compatível com o sistema operacional atual, como alternativa temporária.

Aguardamos retorno para prosseguir.

Atenciosamente,
Jessé Batista
