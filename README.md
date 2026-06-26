@Backend @Segurança @Administração de Identidades

Pessoal, REQ000144658129/WO0000080824869. Mudança importante de escopo.

Identificamos que o problema NÃO é mais OAuth bloqueando de forma genérica. Uma única credencial retorna login com sucesso, enquanto outras falham com 401/302. Isso indica que o servidor de OAuth está respondendo corretamente, mas a autorização por credencial está dessincronizada.

Além disso, mesmo após login bem-sucedido, os serviços internos retornam 500, o que sugere problema de integração pós-autenticação.

O problema real provavelmente está em:

1. Base de credenciais dessincronizada ou desatualizada
2. Cache de autenticação vencido ou não atualizado
3. Mudança recente em ACLs ou políticas de autorização
4. Serviços internos com falha na integração pós-autenticação

Preciso esclarecer com os times responsáveis:

- Quem gerencia a base de credenciais e ACLs para esse fluxo? Houve sincronização recente ou mudança?
- Os serviços que retornam 500 após login, quais são e quem é responsável?
- A credencial que funciona tem alguma coisa diferente no servidor em relação às que falham?

Sem essas informações não conseguimos avançar. SLA segue 24h.

Atenciosamente,
Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

