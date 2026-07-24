O erro reportado é:

src/app/services/notificacao-snackbar.service.ts:33:37 - error TS2339: Property 'snackBar' does not exist on type 'DscSnackbarService'.

33 this.dscSnackbarService.snackBar.dismiss();

O compilador TypeScript indica que a propriedade snackBar não existe no tipo DscSnackbarService, o que sugere incompatibilidade entre o código-fonte e a versão atual do pacote do Design System CAIXA utilizada no projeto, ou uso incorreto da API do serviço.

Solicitamos que o time de desenvolvimento avalie o arquivo notificacao-snackbar.service.ts (linha 33) e a versão do pacote correspondente no package.json, realizando o ajuste necessário no código ou na dependência.
