Michael, fizemos o deploy da 3.55.51.02 às 15:08. O erro anterior foi corrigido, mas o mesmo problema apareceu em outra classe:
WFLYWELD0037: Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' em br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryImpl.entityManager

Como o JBoss para no primeiro erro, cada build mostra só uma classe. Para resolver de uma vez, sugiro procurar no projeto todas as ocorrências de entityManagerFactory:

grep -rn "entityManagerFactory" --include=*.java .

E trocar em todos os @PersistenceContext pelo nome correto da unidade (fec.rur.pu ou fec.pu, conforme o caso).

O ajuste do Duplicate generator continua ok. Assim que gerar a nova versão, fazemos o deploy.
