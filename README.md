Michael, fizemos o deploy da 3.55.51.01 às 15:51. O ajuste no persistence.xml funcionou: o erro de Duplicate generator name gen não bloqueia mais, aparece apenas como aviso.

O deploy foi revertido por outro ponto de código:
WFLYWELD0037: Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' na implantação sirur-ejb.jar
Ponto de injeção: br.gov.caixa.sirur.persistence.repository.impl.EtapaCadastroProducaoRuralRepositoryImpl.entityManager

A classe usa @PersistenceContext(unitName = "entityManagerFactory"), mas as unidades disponíveis no pacote são fec.pu e fec.rur.pu (no sirur-ejb.jar), além de fecDS e SIEMP-PU. O ajuste é usar o nome correto da unidade, provavelmente fec.rur.pu, por se tratar de produção rural.

Sugiro também procurar outras ocorrências de unitName = "entityManagerFactory" no projeto, para corrigir tudo de uma vez. Assim que gerar a nova versão, fazemos o deploy. O ambiente (banco e configurações) já está pronto.
