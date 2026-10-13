-sh-4.2$
-sh-4.2$ WAR=/opt/jboss-eap/standalone/deployments/simkt.war
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -l $WAR | grep -i csv
        0  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/csv/
        0  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/util/csv/
     2392  10-08-2026 15:27   WEB-INF/classes/mpas.csv
     5713  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/domain/enums/MapCsvEnum.class
      156  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/csv/CsvBean.class
     2876  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/csv/PrivilegeCsv.class
      956  10-08-2026 15:27   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/util/csv/CsvUtils.class
   199929  11-07-2024 14:19   WEB-INF/lib/opencsv-5.0.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -p $WAR WEB-INF/classes/mpas.csv | cat -A | tail -20
/*/api/v1/parametrizacoes/publicadas/**,PARPUBLIC,FLUXO_PUBLICADOS,C-L,"MKT_AUDITOR,MKT_ADMINISTRADOR,MKT_MARKETING,MKT_NEGOCIO,MKT_MATRIZ"$
$
/*/api/v1/solicitacoes/**,SLCTMANT,SOLICITACAO_MANTER,E-A-C-L-I,"MKT_ADMINISTRADOR,MKT_MARKETING,MKT_MATRIZ"$
$
/*/api/v1/solicitacoes/**,SLCTALTE,SOLICITACAO_ALTERAR,A-C-L-I,MKT_NEGOCIO$
$
/*/api/v1/solicitacoes/**,SLCTCONS,SOLICITACAO_CONSULTAR,C-L,MKT_AUDITOR$
$
/*/api/v1/solicitacaopendente/**,SLCTPEND,SOLICITACAO_PENDENTE,C-L,"MKT_AUDITOR,MKT_ADMINISTRADOR,MKT_MARKETING,MKT_NEGOCIO,MKT_MATRIZ"$
$
/*/api/v1/solicitacoessituacoes/**,SLCTHIST,SOLICITACAO_HISTORICO,C-L,"MKT_AUDITOR,MKT_ADMINISTRADOR,MKT_MARKETING,MKT_NEGOCIO,MKT_MATRIZ"$
$
/*/api/v1/solicitacoessituacoes/voltarEtapa/**,SLCTHISTVLTETP,SOLICITACAO_HISTORICO_VOLTAR_ETAPA,A-C-L-I,"MKT_ADMINISTRADOR,MKT_MATRIZ"$
$
/*/api/v1/historicos/**,PARAHIST,PARAMETRIZACAO_HISTORICO,C-L,"MKT_ADMINISTRADOR,MKT_AUDITOR,MKT_MARKETING,MKT_MATRIZ"$
$
,PARAEXPO,PARAMETRIZACAO_EXPORTAR,C,"MKT_ADMINISTRADOR,MKT_AUDITOR,MKT_MARKETING,MKT_MATRIZ"$
$
$
/*/api/v1/relatorios/gerenciais/**,RELGEMANT,RELATORIO_GERENCIAL_MANTER,A-C-L-I,MKT_ADMINISTRADOR$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -p $WAR WEB-INF/classes/mpas.csv | grep -n -i relatorio
50:/*/api/v1/relatorios/gerenciais/**,RELGEMANT,RELATORIO_GERENCIAL_MANTER,A-C-L-I,MKT_ADMINISTRADOR
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -p $WAR WEB-INF/classes/mpas.csv | awk -F';' '{print NF}' | sort | uniq -c
     25 0
     25 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
