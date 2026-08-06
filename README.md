Prezado(a),

Em continuidade ao atendimento da solicitação de criação dos componentes de pipeline para o módulo SIGAP-personalizacao-chip-gestao, informamos:

1. Library/Variable Group: criada com sucesso a library SIGAP-PERSONALIZACAO-CHIP-GESTAO-DES, vinculada ao ambiente DES.

2. Build: pipeline de build configurada e validada com sucesso, utilizando o Task Group padrão (BUILD_DEFAULT_SPRING) e imagem base spring-boot:8.2, com o path de compilação ajustado para o diretório sources/gap-emv, conforme estrutura multi-módulo do projeto (gap-parent, com os módulos plugin-api, plugin-siocr, plugin-sipcs e gap).

3. Release: para a criação e validação da pipeline de release, é necessário que a build de origem já possua ao menos uma execução bem-sucedida publicada, servindo como Artifact source para o deploy via caixa-base-chart no ambiente DES. Como a build já foi validada com sucesso, daremos sequência à configuração da release nos próximos passos.

Ficamos à disposição para eventuais ajustes adicionais.

Atenciosamente,
Esteira Devops DES TQS NPRD
