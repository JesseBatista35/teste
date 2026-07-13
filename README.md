Prezados, time de Infraestrutura/Imagens,

Estamos com uma falha de deploy no ambiente DES (siamc-dev-internet) que foi rastreada até uma incompatibilidade de versão do adapter Keycloak instalado na imagem da VM JBoss, e precisamos de apoio para verificar se existe uma imagem alternativa já disponível com a versão correta.

Resumo técnico:

- Sistema: SIAMC-INTERNET (siamc-ear.ear / siamc-web-3.0.0-SNAPSHOT.war)
- Ambiente: DES (esteira esteira-jboss-vm-v2, host caddeapllx2620.agil.nprd.caixa.gov.br)
- Sintoma: deploy falha na fase DEPENDENCIES com o erro:
  "Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter"
  (origem: org.keycloak.subsystem.adapter.extension.KeycloakDependencyProcessorWildFly)

- Causa raiz identificada: a imagem da VM possui o módulo Keycloak adapter na versão 22.0.5 (confirmado em /opt/jboss-eap/modules/system/add-ons/keycloak/), que não suporta mais o legacy security layer do JBoss EAP. A aplicação está configurada no standalone-full-ha.xml com o subsystem legado "urn:jboss:domain:keycloak:1.1" (secure-deployment para siamc-web, realm "internet", auth-server logindes.caixa.gov.br), que depende justamente desse legacy security layer.

- O chamado original desta esteira solicitava explicitamente Keycloak 10.x para a VM, versão compatível com essa configuração legada. Verificamos que o módulo 22.0.5 já está presente na imagem desde 24/10/2023 (data de modificação do jar keycloak-core-22.0.5.jar), ou seja, não é instalado dinamicamente pelo pipeline — está fixo na imagem/template base.

Solicitação:

1. Poderiam verificar se existe uma imagem/template de build para essa esteira (JBoss EAP VM) que já contenha o Keycloak adapter na versão 10.x, compatível com o legacy security layer?
2. Caso exista, qual o procedimento para apontarmos a esteira para essa imagem?
3. Caso não exista, poderiam avaliar a viabilidade de gerar uma variante da imagem com essa versão do adapter, já que a aplicação depende dela na configuração atual?

Fico à disposição para fornecer mais detalhes, logs completos ou acesso aos artefatos de deploy, conforme necessário.

Atenciosamente,
Jessé Batista
Analista de Esteiras - CTIS/CESTI
DEVOPS DES TQS NPRD
