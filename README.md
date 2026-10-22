Retorno CESTI – SIECM-middleware (TQS) – Guardrail Fortify / Privacy Violation

À equipe SIECM,

Conforme a REQ000146671991, a CESTI identificou a causa da falha no step “SAST: Guardrail Segurança Cibernética”. O Fortify aponta um achado Critical do tipo Privacy Violation no arquivo:

src/main/java/br/gov/caixa/siecm/infra/ier/connector/AbstractJarmGateway.java

A correção completa foi implementada e validada pela CESTI na branch cesti_teste (commit 41466348). Nessa branch o achado Critical deixou de ser identificado pelo Fortify e a esteira passou pelo Guardrail.

Ao analisarmos o commit da equipe ce9dac65 (“Refatoração: melhorar logging e uso de constantes no AbstractJarmGateway”), verificamos que a correção foi aplicada apenas parcialmente. Foram alterados somente dois trechos:

o catch do establishUserContext;
o catch genérico do executeWithConnection.

Os demais ajustes feitos na branch cesti_teste não foram incorporados, como o tratamento de logs e exceções em withReadUserContext e installRmReadSubject e a padronização das mensagens. Por isso o Guardrail continua encontrando uma vulnerabilidade crítica e a esteira segue barrada.

Ação necessária (equipe de desenvolvimento):

Substituir o conteúdo do AbstractJarmGateway.java na branch de trabalho pelo arquivo completo da branch cesti_teste (commit 41466348). Pode ser feito por cherry-pick ou merge. Não basta reaplicar trechos isolados.
Gerar uma nova TAG e executar a pipeline.
Se algum achado ainda aparecer, o detalhe (arquivo, linha e categoria) pode ser consultado diretamente no SSC (https://sast.caixa/ssc), na aplicação SIECM-middleware, versão 1.0.0.

Não é necessária a abertura de sala. A correção já está pronta e validada no repositório, e falta apenas a equipe aplicá-la integralmente. Diante disso, encerramos a demanda. Caso o erro persista após a aplicação completa do arquivo da branch cesti_teste, favor abrir nova requisição anexando o log da execução.

Atenciosamente,
Jessé Batista
CTIS / CESTI – Esteira DevOps DES/TQS NPRD
