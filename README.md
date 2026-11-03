
[domain@localhost:9443 /] deploy --name=SICCR-PJ3 --server-groups=sifec-intranet
{"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet
_node1_lx473" => {"WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:" => {"Operação step-2" => {"WFLYCTL0080: Falha de serviços" => {"jboss
.persistenceunit.\"sifec-ccr-pj-8.40.0.3-b5719.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu\"" => "javax.persistence.PersistenceException: [PersistenceUnit: fec.wpj.pu] Unable to build Hiber
nate SessionFactory
    Caused by: javax.persistence.PersistenceException: [PersistenceUnit: fec.wpj.pu] Unable to build Hibernate SessionFactory
    Caused by: org.hibernate.HibernateException: Errors in named queries:
SolicitacaoAnalise.listarAnaliseConformidadeAtacadoAbertas failed because of: org.hibernate.hql.internal.ast.QuerySyntaxException: expecting EOF, found ')' near line 1, column 1165 [SELECT
 sa FROM br.gov.caixa.wpj.modelo.entidade.SolicitacaoAnalise sa JOIN FETCH sa.empresaMge empresa WHERE sa.nuSolicitacaoAnalise IN ( SELECT MIN(saInner.id) FROM br.gov.caixa.wpj.modelo.enti
dade.SolicitacaoAnalise saInner WHERE saInner.coDemanda = sa.coDemanda AND saInner.situacao.deSituacao IN :situacaoAtual GROUP BY saInner.coDemanda ) AND sa.situacao.deSituacao IN :situaca
oAtual AND sa.tipoSolicitacao.noTipoSolicitacaoAnalise IN :tipoSolicitacao AND ( :filter = 'FILTROSEMVALOR' OR UPPER(sa.coDemanda) LIKE CONCAT(CONCAT('%',UPPER(:filter)),'%') OR CONCAT(sa.
empresaMge.nuCnpjEmpresaMge,'') LIKE CONCAT(CONCAT('%',TRIM(LEADING '0' FROM REPLACE(REPLACE(REPLACE(:filter, '-',''),'/',''),'.',''))),'%' ) OR CONCAT(sa.empresaMge.coCnpjMediaGrandeEmpre
sa,'') LIKE CONCAT(CONCAT('%',TRIM(LEADING '0' FROM REPLACE(REPLACE(REPLACE(:filter, '-',''),'/',''),'.',''))),'%' ) OR UPPER(sa.empresaMge.noRazaoSocial) LIKE CONCAT(CONCAT('%',UPPER(:fil
ter)),'%') OR UPPER(sa.situacao.deSituacao) LIKE CONCAT(CONCAT('%',UPPER(:filter)),'%')) OR ( sa.tipoSolicitacao.noTipoSolicitacaoAnalise IN :tipoSolicitacao AND upper(sa.nuContrato) LIKE
'%' || upper(:filter || '%')) ) GROUP BY sa.coDemanda HAVING MIN(sa.nuSolicitacaoAnalise) = sa.nuSolicitacaoAnalise]
DocumentoSolicitacao.localizarRecebidoPorIdSolicitacao failed because of: org.hibernate.hql.internal.ast.QuerySyntaxException: expecting EOF, found ')' near line 1, column 744 [SELECT ds F
ROM br.gov.caixa.wpj.modelo.entidade.DocumentoSolicitacao ds INNER JOIN ds.solicitacaoAnalise sa WHERE ds.id.nuSolicitacaoAnalise = :nuSolicitacaoAnalise AND ds.icEnviadoRecebido = 'R' AND
 ds.dossieOperacao IS NULL AND ds.id.nuArquivo IN ( select ds2.id.nuArquivo from br.gov.caixa.wpj.modelo.entidade.DocumentoSolicitacao ds2 where (:filtro = 'FILTROSEMVALOR' OR UPPER(ds2.so
licitacaoAnalise.documento.tipoDocumento.noTipoDocumento) like CONCAT(CONCAT('%',UPPER(:filtro)),'%')) OR (:filtro = 'FILTROSEMVALOR' OR UPPER(ds2.solicitacaoAnalise.documento.noDocumento)
 like CONCAT(CONCAT('%',UPPER(:filtro)),'%')) OR (:filtro = 'FILTROSEMVALOR' OR UPPER(ds2.solicitacaoAnalise.deMensagem) like CONCAT(CONCAT('%',UPPER(:filtro)),'%')) ) )]"},"WFLYCTL0412: S
erviços necessários que não estão instalados:" => ["jboss.security.security-domain.jaas-sifec","jboss.security.security-domain.java:/jaas/jaas-sifec","jboss.naming.context.java.jboss.mail.
FECMail"],"WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.deployment.subunit.\"sifec-ccr-pj-8.40.0.3-b5719.ear\".\"workflow-credito-pj-web.war\".undertow
-deployment.UndertowDeploymentInfoService faltam [jboss.security.security-domain.jaas-sifec]","jboss.deployment.subunit.\"sifec-ccr-pj-8.40.0.3-b5719.ear\".\"workflow-credito-pj-web.war\".
component.SecurityKeycloakUtils.CREATE faltam [jboss.security.security-domain.java:/jaas/jaas-sifec]","jboss.deployment.unit.\"sifec-ccr-pj-8.40.0.3-b5719.ear\".WeldStartService faltam [jb
oss.naming.context.java.jboss.mail.FECMail]"]}}}}}}}}}

[domain@localhost:9443 /]





[domain@localhost:9443 /] deployment-info --name=SICCR-PJ3
NAME      RUNTIME-NAME
SICCR-PJ3 sifec-ccr-pj-8.40.0.3-b5719.ear

SERVER-GROUP    STATE
siemp           not added
sifec-intranet  not added
sifec-intranet2 not added
sipen           not added

[domain@localhost:9443 /]
