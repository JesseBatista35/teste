Prezados,
Identificamos que o componente referente ao sistema SISVA Transacional Frontend está cadastrado no catálogo do FusionX com o nome incorreto sisva-frontend-transacional-frontend (com o termo "frontend" duplicado/fora de ordem).
O nome correto do sistema, conforme repositório de origem, é sisva-transacional-frontend.
Esse cadastro incorreto está fazendo com que a Application gerada no ArgoCD para o ambiente DES seja recriada automaticamente com o nome errado (sisva-frontend-transacional-frontend-des) a cada execução da pipeline, mesmo após ajuste manual do arquivo de definição do app no repositório de GitOps (sisva-transacional-frontend-infranprd).
Solicitamos a correção do nome do componente no catálogo do FusionX para sisva-transacional-frontend, de forma a refletir corretamente nas próximas execuções.
Em caso de dúvidas, favor contactar p585600 (Jesse Mouta Pereira Batista) no Teams.
