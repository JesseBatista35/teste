Pessoal, atualização do hub-api (SICCR-HUB-BACKEND2, hub-api-2.2.0-b809) no JBoss 7.4 (sifec-intranet):

Ambiente (DevOps): concluído. Incluímos as propriedades de integração do HUB (SICCR_HUB_WS_*, mesmos valores do 6.4) no server-group. A configuração de segurança (Keycloak) do hub-api.war já estava pronta.

Código (fábrica): ajuste necessário. O deploy foi revertido porque a unidade de persistência HUB-PU não sobe:
Legacy-style query parameters (?) are no longer supported; use JPA-style ordinal parameters (e.g., ?1)
Named query: ProcessoEnvioContrato.buscar (entidade br.gov.caixa.siccr.dominio.pf.ProcessoEnvioContratoEntidade)

O Hibernate do JBoss 7.4 não aceita mais o ? sem número. É preciso trocar por ?1, ?2... ou por parâmetro nomeado (:processo) e ajustar o setParameter correspondente. O ajuste é o mesmo que já foi feito no PJ.

O Hibernate para no primeiro erro que encontra. Por isso, vale procurar todas as queries com ? sem número no projeto e nas bibliotecas de domínio do SICCR, para não precisarmos de vários ciclos de build.

@Paulo, quem é o dev responsável pelo HUB? Assim que houver build novo, faço o deploy e acompanho o log.
