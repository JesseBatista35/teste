Equipe, bom dia.
Durante a investigação da falha de build na esteira do SIPDM-frontend, identificamos que o projeto foi migrado do Angular 16 para o Angular 19 sem seguir o processo incremental recomendado pelo guia oficial (ng update, versão por versão). Isso já gerou e ainda vem gerando uma série de incompatibilidades:
Já ajustados pelo time de esteiras (nível de pipeline/configuração de teste, sem alterar regra de negócio):

Removida flag --build-optimizer, descontinuada nas versões atuais do Angular CLI/build system.
Ajustado setup-jest.ts para mockar as variáveis de ambiente runtime (_ENV), que passaram a ser exigidas obrigatoriamente pelo environment.ts mas não existem no ambiente de testes (Jest/jsdom).

Pendente de ajuste pelo time de desenvolvimento (código de negócio):

O teste tabela-crud.component.spec.ts está falhando com o erro TypeError: this.messageService.showDialogTemplate is not a function, originado em tabela-crud.component.ts (linhas 142 e 154).
Isso indica que o método showDialogTemplate do MessageService (ou da lib de componentes/DSC da qual ele depende) não existe mais, foi renomeado ou teve a assinatura alterada na versão atualizada da dependência, e o componente não foi adaptado.
Pedimos que o time avalie a API atual do MessageService/lib correspondente e ajuste a chamada em tabela-crud.component.ts (e no spec, se necessário) para o método/assinatura correta.

Ficamos à disposição para rodar a esteira novamente assim que o ajuste for aplicado.
Atenciosamente,
Jessé Batista — CTIS / Esteiras DEVOPS DES TQS NPRD
