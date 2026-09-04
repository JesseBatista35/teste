Prezados,

Em resposta ao questionamento: sim, a esteira suporta múltiplos NFS simultâneos para a mesma aplicação/pod, desde que cada volume tenha um ponto de montagem (mountPath) distinto na configuração do deployment. Não há restrição técnica que impeça dois exports NFS (ainda que originados de servidores diferentes, como no caso hypernprd12 e hypernprd56) de serem montados no mesmo pod, contanto que os destinos de montagem sejam únicos.

O problema relatado ocorreu porque as duas solicitações (REQ000145657410 e REQ000145740789) especificaram o mesmo PATH_DESTINO (/sihdg/), mesmo se referindo a integrações e exports distintos (SINAF x MAINFRAME e SIHDG x POWERCENTER). Isso resultou em sobreposição do ponto de montagem no pod, gerando a confusão identificada.

Confirmamos como tecnicamente adequada a proposta de separação:

No servidor NFS (fs_sihdg), manter dois diretórios/exports distintos:
sihdg_sinaf (referente ao item 1 - integração SIHDG x MAINFRAME)
sihdg_powercenter (referente ao item 2 - integração SIHDG x POWERCENTER)
No pod, realizar duas montagens separadas, uma para cada destino:
PATH_DESTINO = /sihdg_sinaf
PATH_DESTINO_PWC = /sihdg_powercenter
Atualizar a library do SIHDG-JBOSS8-DES para refletir as duas variáveis distintas, garantindo que a aplicação referencie corretamente cada ponto de montagem conforme a integração.

Com essa estrutura, o servidor SIHDG-JBOSS8-DES passará a ter dois pontos de montagem NFS independentes, eliminando o conflito atual e mantendo a rastreabilidade de qual export atende cada integração.

Ficamos à disposição para prosseguir com a alteração dos PATH_DESTINO conforme proposto, mediante confirmação/agendamento da criação dos novos exports no servidor NFS.

Atenciosamente,
Jessé Batista
