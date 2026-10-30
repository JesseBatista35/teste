Atendido o ajuste solicitado no datasource siali-jpa-ds do SIALI em DES (OKD4, namespace siali-des).

Ações realizadas:

Alterado o standalone-okd.xml do repositório SIALI-config: o siali-jpa-ds passou a usar placeholders próprios (SIALIJPADS_CONNECTION_URL, SIALIJPADS_USER, SIALIJPADS_PASSWORD) e deixou de compartilhar os do siali-ds.
Criadas as variáveis correspondentes no grupo SIALI-des, apontando para jdbc:postgresql://10.116.18.152:51317/alidb001, usuário salidb001.
Executada a release em EC DES. Aplicação implantada com sucesso, e o datasource carregado com a nova URL e o novo usuário, conforme validado via jboss-cli no pod.

Pendência de rede: o teste de conexão do pool falhou por timeout na porta 51317. A comunicação com o mesmo host na porta 5432 funciona normalmente. Foi aberta a solicitação de regra de firewall ID 98632: origem 10.116.220.212 (egress siali-des), destino 10.116.18.152, TCP 51317. A regra aguarda aprovação. Após a aplicação, a conexão passa a funcionar sem necessidade de novo deploy.

Observação: a alteração foi feita apenas em DES, conforme solicitado. Antes da próxima release TQS com esse config, será preciso criar as variáveis SIALIJPADS_* no grupo SIALI-tqs.

Mensagem para aprovação

Prezados Flávio Gagliardi e Rafael Guimarães, boa tarde.

Solicito, por gentileza, a aprovação da regra de firewall ID 98632, referente ao SIALI em DES:

Origem: 10.116.220.212 (egress IP OKD4 NPRD, namespace siali-des)
Destino: 10.116.18.152
Porta: TCP 51317

Justificativa: o novo datasource siali-jpa-ds da aplicação passou a apontar para o banco PostgreSQL alidb001 nesse destino. O teste a partir do pod resulta em timeout. A comunicação com o mesmo host na porta 5432 já está liberada.

Obrigado.
