Linha do tempo resumida:

20/07 16:16 — Você (Jessé) manda a nota completa pro Armazenamento, com paths, IPs de aplicação e evidências técnicas (timeout, operation not permitted).
20/07 16:31 — Outro analista (C160402) reforça a mesma solicitação, adicionando que precisa liberar backup também e que há comunicação com mainframe.
20/07 16:37 — CESTI53 responde pedindo "path NFS" e "IPs de backup" — mas nesse momento eles ainda não tinham visto sua nota completa de 16:16 (ou ignoraram), e insistem que /export/sigdb/sicql não é o path real do storage.
20/07 16:58 — Você manda a nota completa com os IPs de backup (a que fechamos juntos).
20/07 18:56 — CESTI53 responde de novo, repetindo a mesma pergunta, ignorando sua resposta de 16:58, e pedindo pra encaminhar pra Multi-Suporte SO se não tiver a info.
21/07 — A WO ricocheteia entre times (Multi-Suporte SO diz que não tem IP de backup — mas você já tinha dado! — e devolve pra Armazenamento).
21/07 16:07 — Alguém finalmente nota o óbvio: "os IPs já foram informados na nota de 16h58" e reforça o ponto real ainda em aberto: falta o FQDN/path do NFS do lado do storage, não o path visto pela aplicação.
22/07 — Reclamação de SLA por causa do ping-pong.

O ponto real que está travando tudo:

CESTI53 não está pedindo o path que a aplicação usa (/export/sigdb/sicql) — isso você já deu. Eles querem o identificador interno do export no storage (FQDN ou nome de export conforme cadastrado no Isilon/storage, que pode ser diferente do path visto pelo cliente NFS). Essa informação não é algo que o time de esteira/DevOps tem — é dado interno de configuração do próprio storage, vinculado à FREI original de alocação de espaço.



Prezados,

Reforçando informações já enviadas nesta WO em 20/07 às 16h16 e 16h58, que parecem não ter sido consideradas nas respostas seguintes:

Os paths de montagem e IPs (aplicação e backup) já foram fornecidos anteriormente nesta mesma WO. Segue novamente, para facilitar:

Paths conforme FREI original:

/export/sigdb/sicql → /opt/sigdb
/export/sigdb/sitec → /opt/sigdb/sitec
/export/sicql_bovespa → /opt/jboss/bovespa
/export/upload_prd → /upload

IPs de aplicação: DES 10.116.199.181 | TQS 10.116.201.141
IPs de backup: DES 192.168.233.69 | TQS 192.168.242.137

Sobre o FQDN/path interno do NFS no storage 10.116.88.160: essa informação não está disponível para o time de Esteiras/DevOps, pois se trata de configuração interna do storage, vinculada à FREI original de alocação de espaço em Isilon. Solicitamos que a equipe de Armazenamento consulte esse dado diretamente em seus próprios registros de export, associados ao IP 10.116.88.160 e aos paths acima informados.

Reiteramos que a demanda está em espera de retorno desde 20/07 e solicitamos priorização considerando o SLA já mencionado.

Atenciosamente,
Jessé Mouta Pereira Batista
CTIS/CESTI — Esteira DEVOPS DES TQS NPRD

Quer que eu ajuste o tom (mais direto/mais diplomático) ou inclua o número da FREI, se você tiver?
