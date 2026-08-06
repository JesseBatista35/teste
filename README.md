
Prezado(a),

Certificado do API Manager (CN https://api.des.caixa, número de série 7e00000860471c4eedc7ea0650000000000860, emissor AC Icptestes Sub) instalado com sucesso no ambiente legado, servidor sbrdeapllx114 (instância sinad_node1_lx114).

Procedimento realizado:
- Obtenção da cadeia completa de certificados (raiz, intermediária e folha) via conexão TLS direta com api.des.caixa:8443, com validação do número de série conforme informado nesta WO;
- Importação dos três certificados no cacerts da JVM em uso pela aplicação (/usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts);
- Reload isolado da instância sinad_node1_lx114 via jboss-cli, sem impacto às demais aplicações hospedadas no mesmo host controller;
- Validação do log da aplicação após o reload, sem ocorrência de erros de SSL/PKIX.

Instância confirmada em status STARTED, operando normalmente.

Encerramos o atendimento desta demanda.

Atenciosamente,
Esteira Devops DES TQS NPRD
