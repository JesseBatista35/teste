Prezados,

Demanda atendida.

PROBLEMA
A release do SICMO-backend-internet no ambiente DES falhava por timeout na etapa "Verificando Status do Deployment". O pod da aplicação não concluía a inicialização. O mesmo código funcionava normalmente no backend (intranet).

CAUSA
O volume NFS da aplicação internet estava configurado para o storage hypernprd12.ad.caixa:/fs_sicmo, que passou a recusar a montagem a partir dos nodes do cluster OKD4 NPRD (erro "access denied by server"). Sem o volume montado, o pod não iniciava e a release excedia o tempo limite. O backend utiliza o storage hypernprd56.ad.caixa:/fs_sicmo, que não apresentou falha.

AÇÕES REALIZADAS
1. Backup das configurações do volume (PV/PVC) da aplicação.
2. Recriação do volume da aplicação internet apontando para hypernprd56.ad.caixa:/fs_sicmo, o mesmo utilizado pelo backend.
3. Ajuste da variável SERVER_NFS no grupo de variáveis SICMO-INTERNET-DES para hypernprd56.ad.caixa, evitando reincidência nas próximas releases.
4. Reexecução da release no ambiente DES.

RESULTADO
Release SICMO-backend-internet-1.6.0.3(2) executada com sucesso no ambiente DES. Aplicação na versão 1.6.0.3 em execução e operando normalmente.

OBSERVAÇÕES
- Caso a aplicação internet precise utilizar dados próprios, distintos do backend, a equipe de desenvolvimento deve sinalizar para tratarmos a liberação do storage original junto à equipe de Storage.
- Os logs da aplicação exibem erros de conexão com o servidor Elastic APM (apm-server-devops.produtos.caixa). Esses erros não impactam o funcionamento. A remoção da variável JAVA_OPTS_MONITORING pode ser avaliada pela equipe de desenvolvimento.

Encerrando a demanda.
