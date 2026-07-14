Prezados,
Durante a execução do pipeline de build do projeto SIASC-frontend-novo, foi identificada uma falha na etapa de npm install, com erro ERESOLVE de conflito de dependências.
O erro ocorre porque o pacote @caixa/sdsc-angular na versão 0.1.17 exige como peer dependency a versão 20.2.14 ou superior de @angular/cdk. No entanto, o package.json do projeto fixa as versões de @angular/cdk, @angular/material e @angular/material-date-fns-adapter em 20.2.4, versão anterior à exigida, o que impede a resolução da árvore de dependências pelo npm.
Solicitamos que a equipe de desenvolvimento realize o ajuste das seguintes dependências no package.json, atualizando-as para a versão 20.2.14:
@angular/cdk
@angular/material
@angular/material-date-fns-adapter
Após a alteração, recomenda-se executar o npm install localmente para regerar o package-lock.json de forma consistente, e verificar se o pacote primeng, também apontado no log de erro como consumidor do mesmo peer dependency, permanece compatível com a nova versão do cdk. Em seguida, o package.json e o package-lock.json atualizados devem ser commitados juntos no repositório.
Ficamos à disposição para apoiar caso seja necessário validar novamente a execução do pipeline após o ajuste.
Atenciosamente,
