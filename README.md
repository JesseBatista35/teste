Prezados,

Identificamos que o namespace simil-des, no cluster OKD4 NPRD, está com a ResourceQuota "quota-resources" praticamente saturada em CPU (limits.cpu oscilando entre 7500m/8 e 8/8, conforme o momento), o que está impedindo a conclusão de rollouts de novas releases.

Foram registradas falhas concretas em pelo menos dois sistemas distintos do namespace nesta data:

simil-precificacao-frontend-des, release 75: falha repetida na criação do pod com o erro "exceeded quota: quota-resources, requested: limits.cpu=1, used: limits.cpu=8, limited: limits.cpu=8", resultando em timeout no pipeline de deploy. A situação só foi contornada mediante escalonamento manual para zero da réplica antiga (release 65), liberando CPU suficiente para a nova réplica subir.
simil-precificacao-api-des, release 128: falha idêntica na criação do pod, com o erro "exceeded quota: quota-resources, requested: limits.cpu=1, used: limits.cpu=7500m, limited: limits.cpu=8", evoluindo posteriormente para "used: limits.cpu=8, limited: limits.cpu=8".

Ambos os incidentes ocorreram em uma janela de tempo próxima, evidenciando que a quota atual não comporta a execução simultânea dos rollouts das aplicações hospedadas no namespace.

O namespace hospeda atualmente 7 sistemas em execução simultânea (simil-api-des, simil-precificacao-api-des, simil-precificacao-frontend-des, simil-precificacao-internet-api-des, simil-precificacao-internet-frontend-des, simil-precificacao-intranet-api-des, simil-precificacao-queue-des), vários com container exporter adicional, o que eleva o consumo agregado de CPU e reduz a margem disponível para rolling updates.

Solicitamos avaliação e ampliação do limite de limits.cpu na ResourceQuota "quota-resources" do namespace simil-des, de forma a comportar com folga os rollouts futuros sem impacto às aplicações já em execução, evitando a necessidade de intervenção manual (escalonamento de réplicas antigas) a cada nova release.

Ficamos à disposição para mais detalhes.

Atenciosamente,
Jessé Batista
CTIS/CESTI — DES/TQS NPRD
