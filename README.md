Edson, além do ponto do 401, encontramos outro erro no CCR no 7.4, na consulta de contrato (ContratacaoRest.consultaListaAutorizacao → ContratoAPXBean.consultarContratoPorId):

ORA-25156: a junção externa de estilo antigo (+) não pode ser usada com junções ANSI

O SQL gerado mistura cross join (ANSI, gerado pelo Hibernate 5 do JBoss 7.4) com (+) (outer join antiga do Oracle), o que o Oracle não aceita. Isso costuma ocorrer quando a unidade de persistência usa um dialeto Oracle antigo. O ajuste sugerido é definir hibernate.dialect como org.hibernate.dialect.Oracle10gDialect (ou Oracle12cDialect) no persistence.xml do CCR, ou revisar essa consulta. Esse erro gera 500 nessa funcionalidade e é independente do 401.
