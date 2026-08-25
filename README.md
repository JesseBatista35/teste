Peguei a REQ000145446658 (continuação) — criação de nova instância JBoss EAP 7.4 nos servidores 10.192.222.70 e 10.192.222.72 (SIPCS, ambiente DES), pros domínios des, tqs, pre e rel, seguindo o padrão DC+HC na .70 e HC na .72.

Levantei os processos via ps -ef nos dois servidores e confirmei que todos os IPs de management já estão ocupados pelas versões 6.4 e 7.0 (ex: 7.0 usa .237/.238 pra des, .246/.247 pra tqs, etc). Pra criar a 7.4 vou precisar de IPs novos — 8 na .70 (DC+HC × 4 domínios) e 4 na .72 (HC × 4 domínios), total 12 IPs novos na subnet 10.192.222.x.

O Diego (quem abriu a demanda) não informou os IPs e acho que ele não tem essa info. Antes de eu formalizar uma solicitação pra equipe de Rede, queria confirmar contigo:

Isso realmente precisa ir pra Rede, ou a gente (esteira) tem algum range/pool já reservado pra esses servidores que eu possa usar diretamente?
Se for pra Rede mesmo, tem algum fluxo/formulário específico que vocês costumam usar pra esse tipo de pedido, ou minha nota "solta" no WO resolve?

Valeu!
