<img width="1898" height="953" alt="image" src="https://github.com/user-attachments/assets/84216741-11f4-48c8-8d0f-1ee0b29068a1" />




[p585600@caddeapllx2577 ~]$ ls -la /opt/jboss-eap/standalone/deployments/
total 48924
drwxrwxr-x 3 jboss jboss      188 jul  3 10:58 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rw-r--r-- 1 jboss jboss  1209660 jul  2 21:03 mssql-jdbc.jar
-rw-r--r-- 1 jboss jboss       14 jul  2 21:03 mssql-jdbc.jar.deployed
-rw-r--r-- 1 jboss jboss  1006732 jul  2 21:03 postgresql.jar
-rw-r--r-- 1 jboss jboss       14 jul  2 21:03 postgresql.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 47852827 jul  3 10:58 siarg.war
-rw-r--r-- 1 jboss jboss        9 jul  3 10:58 siarg.war.deployed
drwxr-xr-x 2 root  root        21 jul  3 09:54 WEB-INF
[p585600@caddeapllx2577 ~]$ md5sum /opt/jboss-eap/standalone/deployments/siarg.war
26ef5801208d037264abd0f12fca4f48  /opt/jboss-eap/standalone/deployments/siarg.war
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ unzip -p /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml | grep -A3 "java.lang.Throwable"
                <exception-type>java.lang.Throwable</exception-type>
                <location>/WEB-INF/errorpages/500.xhtml</location>
        </error-page>
        <error-page>
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ tail -100 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 92
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 93
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 94
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 95
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 96
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 97
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 98
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 99
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 100
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 101
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 102
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 103
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 104
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 105
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 106
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 107
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 108
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 109
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 110
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 111
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 112
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 113
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 114
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 115
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 116
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 117
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 118
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 119
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 120
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 121
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 122
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 123
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 124
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 125
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 126
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 127
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 128
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 129
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 130
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 131
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 132
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,020 DEBUG [org.hibernate.SQL] (default task-5)  SELECT distinct (d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1 * ((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now())))) else coalesce(( select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now())+1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD)) end prazoDemanda,    COALESCE(pd.pz_responsavel, 0) as prazoResponsavel,  d.no_cor,  d.ic_situacao,  CXDEM.sg_caixa_postal AS demandante,  CXRESP.sg_caixa_postal AS responsavel,  uniCXRESP.ic_tipo_unidade,  d.nu_demanda_pai,  d.ic_demanda_pai,  d.ic_tipo_demanda,  CASE WHEN ultAtend.atend IS NULL THEN CASE WHEN ultAtend.receb IS NULL THEN d.dh_abertura ELSE ultAtend.receb END WHEN ultAtend.atend < ultAtend.receb THEN ultAtend.receb ELSE ultAtend.atend END AS ultimaResp,  CASE WHEN d.ic_situacao = 4 THEN CAST(d.co_matricula_minuta AS VARCHAR) WHEN d.ic_situacao = 0 THEN CAST(d.co_matricula_rascunho AS VARCHAR) WHEN d.ic_situacao = 3 THEN CASE WHEN d.co_matricula_demandante != NULL THEN CAST(d.co_matricula_demandante AS VARCHAR) WHEN d.co_matricula_minuta != NULL THEN CAST(d.co_matricula_minuta AS VARCHAR) WHEN d.co_matricula_rascunho != NULL THEN CAST(d.co_matricula_rascunho AS VARCHAR) END ELSE CAST(d.co_matricula_demandante AS VARCHAR) END AS matricula,  d.nu_assunto, ass.no_assunto, d.no_titulo,   (with recursive b as  (SELECT ar.nu_assunto, ar.no_assunto, ar.nu_assunto_pai   FROM argsm001.argtb09_assunto ar   where ar.nu_assunto = ass.nu_assunto  union   SELECT au.nu_assunto, au.no_assunto, au.nu_assunto_pai      FROM argsm001.argtb09_assunto au      inner join b on au.nu_assunto = b.nu_assunto_pai  )  select string_agg(b.no_assunto, ' > ') over (order by b.nu_assunto)    from b order by b.nu_assunto desc, nu_assunto_pai desc limit 1) as assunto   , d.nu_caixa_postal_responsavel   , (select nu_acao from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) acao   , (select no_anexo_atendimento from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) anexo   , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  FROM argsm001.argtb13_demanda d   LEFT join argsm001.argtb31_classificacao_demanda class_demanda   ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  inner join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto   left join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_responsavel   or cx.nu_caixa_postal = d.nu_caixa_postal_demandante   inner join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade    left join argsm001.argtb16_fluxo_demanda fd on fd.nu_demanda = d.nu_demanda    inner join argsm001.argtb08_caixa_postal CXDEM on CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante   inner join argsm001.argtb08_caixa_postal CXRESP on CXRESP.nu_caixa_postal = d.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uniCXRESP on uniCXRESP.nu_unidade = CXRESP.nu_unidade  left join (    select d4.nu_demanda,    max(atend4.dh_atendimento) atend, max(atend4.dh_recebimento) receb    from  argsm001.argtb15_atendimento atend4   inner join argsm001.argtb13_demanda d4 on atend4.nu_demanda = d4.nu_demanda   inner join argsm001.argtb16_fluxo_demanda fd4 on fd4.nu_demanda = d4.nu_demanda    where  fd4.ic_ativo   AND fd4.nu_caixa_postal = ?  AND (   (d4.ic_situacao = 2 and d4.dh_fechamento >= (date(now())-10)  )   OR d4.ic_situacao = 0  OR d4.ic_situacao = 1  OR d4.ic_situacao = 4 ) group by d4.nu_demanda ) ultAtend on ultAtend.nu_demanda = d.nu_demanda  left join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias from argsm001.argtb16_fluxo_demanda fd5 where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda = d.nu_demanda  CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD    left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda   WHERE 1 = 1           AND d.nu_caixa_postal_responsavel = ?    AND (         (d.ic_situacao = ? AND d.dh_fechamento >= (date(now())-10) )  OR d.ic_situacao = ?  OR d.ic_situacao = ?  OR d.ic_situacao = ?  )  group by 1,2,3,4,5,6,7,8,uniCXRESP.ic_tipo_unidade, CXRESP.sg_caixa_postal, ultatend.atend, ultatend.receb, ass.nu_assunto,CXDEM.sg_caixa_postal,class_demanda.IC_CLASSIFICACAO   union   SELECT distinct(d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1 * ((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now())))) else coalesce(( select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now())+1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD)) end prazoDemanda,  COALESCE(pd.pz_responsavel, 0) as prazoResponsavel,  d.no_cor, d.ic_situacao, CXDEM.sg_caixa_postal AS demandante, cx.sg_caixa_postal AS responsavel, uni.ic_tipo_unidade, d.nu_demanda_pai, d.ic_demanda_pai, d.ic_tipo_demanda,  case     when ultAtend.atend is null then  case when ultAtend.receb is null then d.dh_abertura else ultAtend.receb end when ultAtend.atend < ultAtend.receb then ultAtend.receb else ultAtend.atend end as ultimaResp,  case   when d.ic_situacao = 4 then cast(d.co_matricula_minuta as varchar)   when d.ic_situacao = 0 then cast(d.co_matricula_rascunho as varchar)   when d.ic_situacao = 3 then     case     when d.co_matricula_demandante != null then cast(d.co_matricula_demandante as varchar)     when d.co_matricula_minuta != null then cast(d.co_matricula_minuta as varchar)     when d.co_matricula_rascunho != null then cast(d.co_matricula_rascunho as varchar)     end  else cast(d.co_matricula_demandante as varchar)   end as matricula,  d.nu_assunto, ass.no_assunto, d.no_titulo,  (with recursive b as (SELECT ar.nu_assunto, ar.no_assunto, ar.nu_assunto_pai  FROM argsm001.argtb09_assunto ar  where ar.nu_assunto = ass.nu_assunto  union   SELECT au.nu_assunto, au.no_assunto, au.nu_assunto_pai     FROM argsm001.argtb09_assunto au     inner join b on au.nu_assunto = b.nu_assunto_pai )  select string_agg(b.no_assunto, ' > ') over (order by b.nu_assunto)   from b order by b.nu_assunto desc, nu_assunto_pai desc limit 1) as assunto  , d.nu_caixa_postal_responsavel  , (select nu_acao from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) acao   , (select no_anexo_atendimento from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) anexo   , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  FROM argsm001.argtb16_fluxo_demanda fd     inner join argsm001.argtb13_demanda d on d.nu_demanda = fd.nu_demanda  LEFT join argsm001.argtb31_classificacao_demanda class_demanda             ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  inner join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto    inner join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_responsavel   inner join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade    inner join argsm001.argtb08_caixa_postal CXDEM on CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante    inner join (  select d4.nu_demanda,  max(atend4.dh_atendimento) atend, max(atend4.dh_recebimento) receb     from  argsm001.argtb15_atendimento atend4   inner join argsm001.argtb13_demanda d4 on atend4.nu_demanda = d4.nu_demanda    inner join argsm001.argtb16_fluxo_demanda fd4 on fd4.nu_demanda = d4.nu_demanda   inner join argsm001.argtb08_caixa_postal cx4 on cx4.nu_caixa_postal = d4.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uni4 on cx4.nu_unidade = uni4.nu_unidade  where  d4.nu_demanda in (select d5.nu_demanda from argsm001.argtb13_demanda d5  inner join argsm001.argtb08_caixa_postal cx5 on cx5.nu_caixa_postal = d5.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uni5 on uni5.nu_unidade = cx5.nu_unidade  where (uni5.ic_tipo_unidade = 0 OR uni5.ic_tipo_unidade = 3)  ) AND fd4.ic_ativo  AND fd4.nu_caixa_postal = ?   and (   (d4.ic_situacao = 2 AND d4.dh_fechamento >= (date(now())-10)  )   OR d4.ic_situacao = 0  OR d4.ic_situacao = 1  OR d4.ic_situacao = 4  )  group by d4.nu_demanda   ) ultAtend on ultAtend.nu_demanda = d.nu_demanda  inner join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias from argsm001.argtb16_fluxo_demanda fd5 where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda = d.nu_demanda   CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD         left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda       WHERE (uni.ic_tipo_unidade = 0 or uni.ic_tipo_unidade = 3)  AND fd.ic_ativo  AND d.nu_caixa_postal_demandante != ?   AND (  (d.ic_situacao = ? AND d.dh_fechamento >= (date(now())-10) )  OR d.ic_situacao = ?  OR d.ic_situacao = ?  OR d.ic_situacao = ?  )  order by nu_demanda desc
11:00:08,340 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 0
11:00:08,341 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 1
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 2
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 3
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 4
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 5
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,354 DEBUG [org.hibernate.SQL] (default task-5) select assunto0_.nu_assunto as col_0_0_ from argsm001.argtb09_assunto assunto0_ inner join argsm001.argtb10_fluxo_assunto fluxosassu1_ on assunto0_.nu_assunto=fluxosassu1_.nu_assunto inner join argsm001.argtb08_caixa_postal caixaposta2_ on fluxosassu1_.nu_caixa_postal=caixaposta2_.nu_caixa_postal where caixaposta2_.nu_caixa_postal=? and assunto0_.IC_CATEGORIA_INT_EXT=? and fluxosassu1_.ic_tipo_fluxo=? and fluxosassu1_.nu_ordem=1
11:00:08,364 DEBUG [org.hibernate.SQL] (default task-5)  select distinct(d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1*((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now()))))else ( coalesce((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now()) +1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD))) end prazoDemanda,  d.no_cor,d.ic_situacao,CXDEM.sg_caixa_postal AS demandante,CXRESP.sg_caixa_postal AS responsavel,uniCXRESP.ic_tipo_unidade,d.nu_demanda_pai,d.ic_demanda_pai,d.ic_tipo_demanda,  CASE WHEN  ultAtend.atend IS NULL THEN  CASE WHEN  ultAtend.receb IS NULL THEN  d.dh_abertura ELSE  ultAtend.receb END WHEN ultAtend.atend < ultAtend.receb THEN ultAtend.receb ELSE ultAtend.atend END AS ultimaResp,   CASE    WHEN      d.ic_situacao = 4     THEN      CAST(d.co_matricula_minuta AS VARCHAR)     WHEN      d.ic_situacao = 0     THEN      CAST(d.co_matricula_rascunho AS VARCHAR)     WHEN      d.ic_situacao = 3     THEN      CASE        WHEN          d.co_matricula_demandante  IS NOT NULL         THEN          CAST(d.co_matricula_demandante AS VARCHAR)         WHEN          d.co_matricula_minuta  IS NOT NULL         THEN          CAST(d.co_matricula_minuta AS VARCHAR)         WHEN          d.co_matricula_rascunho IS NOT NULL         THEN          CAST(d.co_matricula_rascunho AS VARCHAR)       END    ELSE      CAST(d.co_matricula_demandante AS VARCHAR)   END  AS matricula, d.nu_assunto, ass.no_assunto, d.no_titulo,   (    WITH RECURSIVE b AS     (      SELECT        ar.nu_assunto,        ar.no_assunto,        ar.nu_assunto_pai       FROM        argsm001.argtb09_assunto ar       WHERE        ar.nu_assunto = ass.nu_assunto       UNION      SELECT        au.nu_assunto,        au.no_assunto,        au.nu_assunto_pai       FROM        argsm001.argtb09_assunto au         INNER JOIN          b           ON au.nu_assunto = b.nu_assunto_pai     )    SELECT      string_agg(b.no_assunto, ' > ') OVER (    ORDER BY      b.nu_assunto)     FROM      b     ORDER BY      b.nu_assunto DESC,      nu_assunto_pai DESC LIMIT 1  )  AS assunto,   d.nu_caixa_postal_responsavel, COALESCE(pd.pz_responsavel, 0)  , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  from argsm001.argtb13_demanda d  LEFT join argsm001.argtb31_classificacao_demanda class_demanda             ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  left join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto  left join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_demandante or cx.nu_caixa_postal = d.nu_caixa_postal_responsavel  left join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade  left join argsm001.argtb16_fluxo_demanda fd on fd.nu_demanda = d.nu_demanda  left join argsm001.argtb15_atendimento ate on ate.nu_demanda = d.nu_demanda  INNER JOIN argsm001.argtb08_caixa_postal CXDEM ON CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante  INNER JOIN argsm001.argtb08_caixa_postal CXRESP ON CXRESP.nu_caixa_postal = d.nu_caixa_postal_responsavel  INNER JOIN argsm001.argtb02_unidade uniCXRESP ON uniCXRESP.nu_unidade = CXRESP.nu_unidade  LEFT JOIN    (      SELECT        d4.nu_demanda,        MAX(atend4.dh_atendimento) atend,        MAX(atend4.dh_recebimento) receb       FROM        argsm001.argtb15_atendimento atend4         INNER JOIN          argsm001.argtb13_demanda d4           ON atend4.nu_demanda =d4.nu_demanda         INNER JOIN          argsm001.argtb16_fluxo_demanda fd4           ON fd4.nu_demanda = d4.nu_demanda       WHERE       fd4.ic_ativo         AND fd4.nu_caixa_postal = ?        AND         ((d4.ic_situacao = 2           AND d4.dh_fechamento >=           (            DATE(now()) - 10          ))           OR d4.ic_situacao = 0           OR d4.ic_situacao = 1           OR d4.ic_situacao = 4         )      GROUP BY        d4.nu_demanda     )    ultAtend     ON ultAtend.nu_demanda = d.nu_demanda  inner join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias   from argsm001.argtb16_fluxo_demanda fd5  where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda =d.nu_demanda  CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD  left join argsm001.argtb11_observador_assunto obsA on obsA.nu_assunto = ass.nu_assunto  left join argsm001.argtb17_observador_demanda obsD on obsD.nu_demanda = d.nu_demanda   left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda           WHERE 1 = 1  and ( (ate.dh_atendimento > date(?) OR ate.dh_recebimento > date(?) )  OR ( ( d.ic_situacao in (?, ?) ) AND COALESCE(d.dh_fechamento, date(now())) > date(?) ) )  AND (d.ic_situacao = ?)  and d.nu_caixa_postal_demandante = ?
11:00:08,628 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 0
11:00:08,628 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/login
*   Trying 10.116.201.44:443...
* Connected to siarg-interno.esteiras.des.caixa (10.116.201.44) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.2 (IN), TLS header, Certificate Status (22):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.2 (IN), TLS header, Finished (20):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Certificate (11):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Finished (20):
* TLSv1.2 (OUT), TLS header, Finished (20):
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS handshake, Finished (20):
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use http/1.1
* Server certificate:
*  subject: C=BR; O=Caixa Economica Federal; CN=siarg-interno.esteiras.des.caixa
*  start date: Apr 17 20:09:07 2026 GMT
*  expire date: Apr 17 20:19:07 2031 GMT
*  issuer: C=BR; O=Caixa Economica Federal; CN=AC Icptestes Sub
*  SSL certificate verify result: unable to get local issuer certificate (20), continuing anyway.
* TLSv1.2 (OUT), TLS header, Unknown (23):
> GET /siarg/login HTTP/1.1
> Host: siarg-interno.esteiras.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* TLSv1.2 (IN), TLS header, Unknown (23):
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Date: Fri, 03 Jul 2026 14:00:46 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Expires: Thu, 01 Jan 1970 00:00:00 GMT
< Cache-Control: no-cache, no-store, must-revalidate
< Set-Cookie: JSESSIONID=mMW4uYPlC2zVX3ccAhU_ZZPcxW8IzR6525M6Z0DD.caddeapllx2577; path=/siarg
< Pragma: no-cache
< X-Frame-Options: DENY
< Referrer-Policy: strict-origin-when-cross-origin
< Content-Security-Policy: frame-ancestors 'none';
< Strict-Transport-Security: max-age=63072000; includeSubDomains
< X-Content-Type-Options: nosniff
< Content-Type: text/html;charset=UTF-8
< Content-Length: 7036
<
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"><head id="j_idt2"><link type="text/css" rel="stylesheet" href="/siarg/javax.faces.resource/bootstrap.min.css.xhtml?ln=css" /><link type="text/css" rel="stylesheet" href="/siarg/javax.faces.resource/font-awesome.min.css.xhtml?ln=css" /><link type="text/css" rel="stylesheet" href="/siarg/javax.faces.resource/jquery-ui.min.css.xhtml?ln=css" /><link type="text/css" rel="stylesheet" href="/siarg/javax.faces.resource/caixa-theme.css.xhtml?ln=css" /><link type="text/css" rel="stylesheet" href="/siarg/javax.faces.resource/estilo.css.xhtml?ln=css" /><script type="text/javascript">if(window.PrimeFaces){PrimeFaces.settings.locale='pt_BR';PrimeFaces.settings.projectStage='Development';}</script>

        <title>SIARG</title>
        <meta http-equiv="X-UA-Compatible" content="IE=10" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta content="text/html; charset=UTF-8" http-equiv="content-type" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <script src="/siarg/webjars/jquery/3.6.4/jquery.min.js"></script><script type="text/javascript" src="/siarg/javax.faces.resource/bootstrap.min.js.xhtml?ln=js"></script>

        <script src="/siarg/resources/js/jquery-ui.min.js"></script><script type="text/javascript" src="/siarg/javax.faces.resource/ie10-viewport-bug-workaround.js.xhtml?ln=js"></script><script type="text/javascript" src="/siarg/javax.faces.resource/jquery.mask.min.js.xhtml?ln=js"></script><script type="text/javascript" src="/siarg/javax.faces.resource/mask-function.js.xhtml?ln=js"></script></head><body>

        <div id="controls-wrapper"></div>
    <div class="container-fluid header-gradient hidden-xs">
        <div class="container">
                <div class="row">
                <div class="col-md-6">
                        <img src="/siarg/resources/images/logo-caixa.svg" alt="CAIXA ECONÔMICA FEDERAL" style="height:28; width:122" class="logo-caixa" />
                </div>
                <div class=" col-md-6" style="text-align: right;">
                                        <h1 class="sigla-sitema ">
                                        <span>#INTERNO.TODOS</span>
                                        </h1>
                                </div>
            </div>
        </div>
    </div>

      <div class="container-fluid header-color ">
        <div class="container">
                <div class="row">
                <div class=" col-md-6">
                        <span class="pull-left margin-right visible-xs">
                                <img src="/siarg/resources/images/logo-caixa.svg" alt="CAIXA ECONÔMICA FEDERAL" style="height:28; width:122" />
                        </span>
                  <h1 class="sigla-sitema ">SIARG
                                        <span class="hidden-xs">- Sistema de Atendimento, Registro e Gerenciamento de Demandas</span>
                  </h1>
                </div>
                <div class=" col-md-6">
                </div>
            </div>
        </div>
    </div>

        <div class="container">
                <script type="text/javascript">
                        const queryString = window.location.search;
                        const urlParams = new URLSearchParams(queryString);
                        const demanda = urlParams.get('demanda');
                        const demandaLogin = urlParams.get('demandaLogin');
                        $(document).ready(function($){

                          $('#mainForm\\:usuario').mask('C000000', {translation: {
                                  'C':{pattern:/[a-zA-Z.]/}
                                 }
                           });

                          $('#mainForm\\:usuario').focus();



                          $('#mainForm\\:demandaId').val(demandaLogin);
                          $('#mainForm\\:demandaLogin').val(demanda);
                          if(demanda!= null){
                           $("#mainForm\\:btnEntrar").click();
                          }

                        });

                   document.addEventListener("keypress", function(event) {
                   var tecla = event.keyCode || event.witch;
                   if (tecla == 13) {
                          $("#mainForm\\:btnEntrar").click();
                   }

               });


            </script>

                <div class="row">
                        <div class="col-xs-offset-2  col-xs-8 col-sm-offset-4  col-sm-4 margin-login-top">
                                <div class="box-login">
<form id="mainForm" name="mainForm" method="post" action="/siarg/login" enctype="application/x-www-form-urlencoded">
<input type="hidden" name="mainForm" value="mainForm" />

                                                <legend>Login</legend><div id="mainForm:messages"></div>

                                                <div class="form-group">
                                                        <label for="usuario">Usuário:</label>
                                                        <div class="input-group">
                                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="mainForm:usuario" type="text" name="mainForm:usuario" class="form-control" maxlength="7" />
                                                        </div>
                                                </div>
                                                <div class="form-group">
                                                        <label for="senha">Senha:</label>
                                                        <div class="input-group">
                                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span><input id="mainForm:senha" type="password" name="mainForm:senha" value="" class="form-control" />
                                                        </div>
                                                </div><input id="mainForm:demandaId" type="hidden" name="mainForm:demandaId" value="0" /><input id="mainForm:demandaLogin" type="hidden" name="mainForm:demandaLogin" value="0" /><script type="text/javascript" src="/siarg/javax.faces.resource/jsf.js.xhtml;jsessionid=mMW4uYPlC2zVX3ccAhU_ZZPcxW8IzR6525M6Z0DD.caddeapllx2577?ln=javax.faces&amp;stage=Development"></script><a id="mainForm:btnEntrar" href="#" onblur="$(this).removeClass('btnSelected');" onfocus="$(this).addClass('btnSelected');" title="Clique aqui para entrar" onclick="mojarra.jsfcljs(document.getElementById('mainForm'),{'mainForm:btnEntrar':'mainForm:btnEntrar'},'');return false" class="btn btn-warning pull-right">Entrar
                                                        <i class="glyphicon glyphicon-arrow-right"></i></a><input type="hidden" name="javax.faces.ViewState" id="j_id1:javax.faces.ViewState:0" value="q5n3FkJvTFmwIcqBofGNw57EY3SUzy9j9Sdy5T78DL0h7hc9OiAJC6vvZ8T8/QAsOboZfjy9yY47JpPZCEa9qmseXfk6eoXO2U7z6qfqyrMpWn260S9CEuB0grRtf9H+j5kJsozD5zYOnGjyXBbD4N5XmyuBA4u92BjPVy7Fyh6P8zlLHX4rIeXBVNn7p3dT31N49BhjAdJAIOs/Vd6Ges13rc0TEkmzYe4O4UOAoeQ6Nxbudo4eiH4e1OAr6N3UKE395BwjBpGp9hH71evThdXCBUPKMXVCUc0YwFlci65AHZkHHAnuw1a7g6fOF8Ep3yux4DTfLihgY6xIpqIXJAeEpWq87uVE5ywT0Yov3Lvxq2gw0xnyd501QhqErAOUGdOj9fvrlk/dBiDd67pBCtD9lTkcPHTtjZxjHNkG27G0KigjA2oWFQX/v7IK137K3dd1iL/OAR+JAJ82J6FY5rOqIW3GgezVOBWCJ42t49nVdgcySv15yyvEKPtV/XaW4+3YrLrOZqZwxNqjN+7Gx90xBsOSlXfaTceke6Th8R9V9jtGXvVbii+rdUvGnpNJNE10Qv76jbk34a9MB8raSTKzU9QfBXGPSbjUpgYYqvuQ5S5QRLiw/wMaAlWX7XvASncKkQa3qihCXGhDJB5gzTMM5CY2MVdHJw6P7W1DK0Xy3KhvjRfP4JnJV72w7dsu5tYQ4PQwP3Vlcp6bdTshsQx9rRXKQuy0zztGASK0L6mTXjaq7shQIaqGl7Xsz9WKmZZdMepXKqvpJbIB6ww4M5FzDXxgRKzOIzGzqsJTm8wWAtv501JDF39b9CEPQR33vrff5Sg/ywYwyEHGE4xc/ZJZXyEoZrQ1pI7OW5rtpqiRHPp6ef/pbtdFxkE2rBAOrr3UHesQLfh1H+KVvCXxdHyFrMJ+oAKU4m+7VnaogA/h9CVLRe3O2IYRhNEPBwGG" autocomplete="off" />
</form>
                                </div>
                        </div>
                </div>
        </div>

         <footer class="footer">
      <div class="container">
       <ul>
         <li>Caixa Econômica Federal</li>
         <li>SIARG - Sistema de Atendimento, Registro e Gerenciamento de Demandas<span class="pull-right">Versão: 2.0.0.5</span></li>
       </ul>
      </div>
    </footer><script type="text/javascript">$(function(){hideStatus();;});</script></body>

* Connection #0 to host siarg-interno.esteiras.des.caixa left intact
</html>[p585600@caddeapllx25tail -80 /logs/jboss/jboss-eap/standalone/siarg-interno/server.logver.log
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 102
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 103
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 104
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 105
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 106
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 107
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 108
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 109
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 110
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 111
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 112
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 113
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 114
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 115
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 116
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 117
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 118
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 119
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 120
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 121
11:00:08,004 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 122
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 123
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 124
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 125
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 126
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 127
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 128
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 129
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 130
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 131
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 132
11:00:08,005 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,020 DEBUG [org.hibernate.SQL] (default task-5)  SELECT distinct (d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1 * ((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now())))) else coalesce(( select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now())+1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD)) end prazoDemanda,    COALESCE(pd.pz_responsavel, 0) as prazoResponsavel,  d.no_cor,  d.ic_situacao,  CXDEM.sg_caixa_postal AS demandante,  CXRESP.sg_caixa_postal AS responsavel,  uniCXRESP.ic_tipo_unidade,  d.nu_demanda_pai,  d.ic_demanda_pai,  d.ic_tipo_demanda,  CASE WHEN ultAtend.atend IS NULL THEN CASE WHEN ultAtend.receb IS NULL THEN d.dh_abertura ELSE ultAtend.receb END WHEN ultAtend.atend < ultAtend.receb THEN ultAtend.receb ELSE ultAtend.atend END AS ultimaResp,  CASE WHEN d.ic_situacao = 4 THEN CAST(d.co_matricula_minuta AS VARCHAR) WHEN d.ic_situacao = 0 THEN CAST(d.co_matricula_rascunho AS VARCHAR) WHEN d.ic_situacao = 3 THEN CASE WHEN d.co_matricula_demandante != NULL THEN CAST(d.co_matricula_demandante AS VARCHAR) WHEN d.co_matricula_minuta != NULL THEN CAST(d.co_matricula_minuta AS VARCHAR) WHEN d.co_matricula_rascunho != NULL THEN CAST(d.co_matricula_rascunho AS VARCHAR) END ELSE CAST(d.co_matricula_demandante AS VARCHAR) END AS matricula,  d.nu_assunto, ass.no_assunto, d.no_titulo,   (with recursive b as  (SELECT ar.nu_assunto, ar.no_assunto, ar.nu_assunto_pai   FROM argsm001.argtb09_assunto ar   where ar.nu_assunto = ass.nu_assunto  union   SELECT au.nu_assunto, au.no_assunto, au.nu_assunto_pai      FROM argsm001.argtb09_assunto au      inner join b on au.nu_assunto = b.nu_assunto_pai  )  select string_agg(b.no_assunto, ' > ') over (order by b.nu_assunto)    from b order by b.nu_assunto desc, nu_assunto_pai desc limit 1) as assunto   , d.nu_caixa_postal_responsavel   , (select nu_acao from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) acao   , (select no_anexo_atendimento from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) anexo   , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  FROM argsm001.argtb13_demanda d   LEFT join argsm001.argtb31_classificacao_demanda class_demanda   ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  inner join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto   left join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_responsavel   or cx.nu_caixa_postal = d.nu_caixa_postal_demandante   inner join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade    left join argsm001.argtb16_fluxo_demanda fd on fd.nu_demanda = d.nu_demanda    inner join argsm001.argtb08_caixa_postal CXDEM on CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante   inner join argsm001.argtb08_caixa_postal CXRESP on CXRESP.nu_caixa_postal = d.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uniCXRESP on uniCXRESP.nu_unidade = CXRESP.nu_unidade  left join (    select d4.nu_demanda,    max(atend4.dh_atendimento) atend, max(atend4.dh_recebimento) receb    from  argsm001.argtb15_atendimento atend4   inner join argsm001.argtb13_demanda d4 on atend4.nu_demanda = d4.nu_demanda   inner join argsm001.argtb16_fluxo_demanda fd4 on fd4.nu_demanda = d4.nu_demanda    where  fd4.ic_ativo   AND fd4.nu_caixa_postal = ?  AND (   (d4.ic_situacao = 2 and d4.dh_fechamento >= (date(now())-10)  )   OR d4.ic_situacao = 0  OR d4.ic_situacao = 1  OR d4.ic_situacao = 4 ) group by d4.nu_demanda ) ultAtend on ultAtend.nu_demanda = d.nu_demanda  left join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias from argsm001.argtb16_fluxo_demanda fd5 where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda = d.nu_demanda  CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD    left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda   WHERE 1 = 1           AND d.nu_caixa_postal_responsavel = ?    AND (         (d.ic_situacao = ? AND d.dh_fechamento >= (date(now())-10) )  OR d.ic_situacao = ?  OR d.ic_situacao = ?  OR d.ic_situacao = ?  )  group by 1,2,3,4,5,6,7,8,uniCXRESP.ic_tipo_unidade, CXRESP.sg_caixa_postal, ultatend.atend, ultatend.receb, ass.nu_assunto,CXDEM.sg_caixa_postal,class_demanda.IC_CLASSIFICACAO   union   SELECT distinct(d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1 * ((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now())))) else coalesce(( select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now())+1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD)) end prazoDemanda,  COALESCE(pd.pz_responsavel, 0) as prazoResponsavel,  d.no_cor, d.ic_situacao, CXDEM.sg_caixa_postal AS demandante, cx.sg_caixa_postal AS responsavel, uni.ic_tipo_unidade, d.nu_demanda_pai, d.ic_demanda_pai, d.ic_tipo_demanda,  case     when ultAtend.atend is null then  case when ultAtend.receb is null then d.dh_abertura else ultAtend.receb end when ultAtend.atend < ultAtend.receb then ultAtend.receb else ultAtend.atend end as ultimaResp,  case   when d.ic_situacao = 4 then cast(d.co_matricula_minuta as varchar)   when d.ic_situacao = 0 then cast(d.co_matricula_rascunho as varchar)   when d.ic_situacao = 3 then     case     when d.co_matricula_demandante != null then cast(d.co_matricula_demandante as varchar)     when d.co_matricula_minuta != null then cast(d.co_matricula_minuta as varchar)     when d.co_matricula_rascunho != null then cast(d.co_matricula_rascunho as varchar)     end  else cast(d.co_matricula_demandante as varchar)   end as matricula,  d.nu_assunto, ass.no_assunto, d.no_titulo,  (with recursive b as (SELECT ar.nu_assunto, ar.no_assunto, ar.nu_assunto_pai  FROM argsm001.argtb09_assunto ar  where ar.nu_assunto = ass.nu_assunto  union   SELECT au.nu_assunto, au.no_assunto, au.nu_assunto_pai     FROM argsm001.argtb09_assunto au     inner join b on au.nu_assunto = b.nu_assunto_pai )  select string_agg(b.no_assunto, ' > ') over (order by b.nu_assunto)   from b order by b.nu_assunto desc, nu_assunto_pai desc limit 1) as assunto  , d.nu_caixa_postal_responsavel  , (select nu_acao from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) acao   , (select no_anexo_atendimento from argsm001.argtb15_atendimento where nu_demanda = d.nu_demanda and nu_acao = 8 order by nu_atendimento desc limit 1) anexo   , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  FROM argsm001.argtb16_fluxo_demanda fd     inner join argsm001.argtb13_demanda d on d.nu_demanda = fd.nu_demanda  LEFT join argsm001.argtb31_classificacao_demanda class_demanda             ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  inner join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto    inner join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_responsavel   inner join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade    inner join argsm001.argtb08_caixa_postal CXDEM on CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante    inner join (  select d4.nu_demanda,  max(atend4.dh_atendimento) atend, max(atend4.dh_recebimento) receb     from  argsm001.argtb15_atendimento atend4   inner join argsm001.argtb13_demanda d4 on atend4.nu_demanda = d4.nu_demanda    inner join argsm001.argtb16_fluxo_demanda fd4 on fd4.nu_demanda = d4.nu_demanda   inner join argsm001.argtb08_caixa_postal cx4 on cx4.nu_caixa_postal = d4.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uni4 on cx4.nu_unidade = uni4.nu_unidade  where  d4.nu_demanda in (select d5.nu_demanda from argsm001.argtb13_demanda d5  inner join argsm001.argtb08_caixa_postal cx5 on cx5.nu_caixa_postal = d5.nu_caixa_postal_responsavel  inner join argsm001.argtb02_unidade uni5 on uni5.nu_unidade = cx5.nu_unidade  where (uni5.ic_tipo_unidade = 0 OR uni5.ic_tipo_unidade = 3)  ) AND fd4.ic_ativo  AND fd4.nu_caixa_postal = ?   and (   (d4.ic_situacao = 2 AND d4.dh_fechamento >= (date(now())-10)  )   OR d4.ic_situacao = 0  OR d4.ic_situacao = 1  OR d4.ic_situacao = 4  )  group by d4.nu_demanda   ) ultAtend on ultAtend.nu_demanda = d.nu_demanda  inner join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias from argsm001.argtb16_fluxo_demanda fd5 where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda = d.nu_demanda   CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD         left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda       WHERE (uni.ic_tipo_unidade = 0 or uni.ic_tipo_unidade = 3)  AND fd.ic_ativo  AND d.nu_caixa_postal_demandante != ?   AND (  (d.ic_situacao = ? AND d.dh_fechamento >= (date(now())-10) )  OR d.ic_situacao = ?  OR d.ic_situacao = ?  OR d.ic_situacao = ?  )  order by nu_demanda desc
11:00:08,340 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 0
11:00:08,341 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 1
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 2
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 3
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 4
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 5
11:00:08,342 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
11:00:08,354 DEBUG [org.hibernate.SQL] (default task-5) select assunto0_.nu_assunto as col_0_0_ from argsm001.argtb09_assunto assunto0_ inner join argsm001.argtb10_fluxo_assunto fluxosassu1_ on assunto0_.nu_assunto=fluxosassu1_.nu_assunto inner join argsm001.argtb08_caixa_postal caixaposta2_ on fluxosassu1_.nu_caixa_postal=caixaposta2_.nu_caixa_postal where caixaposta2_.nu_caixa_postal=? and assunto0_.IC_CATEGORIA_INT_EXT=? and fluxosassu1_.ic_tipo_fluxo=? and fluxosassu1_.nu_ordem=1
11:00:08,364 DEBUG [org.hibernate.SQL] (default task-5)  select distinct(d.nu_demanda), d.dh_abertura,  case when prazoDiasD < date(now()) then (-1*((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(prazoDiasD) +1, date(now()), interval '1 day') as dt) d)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(prazoDiasD) and date(now()))))else ( coalesce((select sum(case when extract(dow from dt) in (1,2,3,4,5) then 1 else 0 end) as dias from (select generate_series(date(now()) +1, date(prazoDiasD), interval '1 day') as dt) d),0)-(select count(dt_feriado) dias FROM argsm001.argtb14_feriado where date(dt_feriado) between date(now()) and date(prazoDiasD))) end prazoDemanda,  d.no_cor,d.ic_situacao,CXDEM.sg_caixa_postal AS demandante,CXRESP.sg_caixa_postal AS responsavel,uniCXRESP.ic_tipo_unidade,d.nu_demanda_pai,d.ic_demanda_pai,d.ic_tipo_demanda,  CASE WHEN  ultAtend.atend IS NULL THEN  CASE WHEN  ultAtend.receb IS NULL THEN  d.dh_abertura ELSE  ultAtend.receb END WHEN ultAtend.atend < ultAtend.receb THEN ultAtend.receb ELSE ultAtend.atend END AS ultimaResp,   CASE    WHEN      d.ic_situacao = 4     THEN      CAST(d.co_matricula_minuta AS VARCHAR)     WHEN      d.ic_situacao = 0     THEN      CAST(d.co_matricula_rascunho AS VARCHAR)     WHEN      d.ic_situacao = 3     THEN      CASE        WHEN          d.co_matricula_demandante  IS NOT NULL         THEN          CAST(d.co_matricula_demandante AS VARCHAR)         WHEN          d.co_matricula_minuta  IS NOT NULL         THEN          CAST(d.co_matricula_minuta AS VARCHAR)         WHEN          d.co_matricula_rascunho IS NOT NULL         THEN          CAST(d.co_matricula_rascunho AS VARCHAR)       END    ELSE      CAST(d.co_matricula_demandante AS VARCHAR)   END  AS matricula, d.nu_assunto, ass.no_assunto, d.no_titulo,   (    WITH RECURSIVE b AS     (      SELECT        ar.nu_assunto,        ar.no_assunto,        ar.nu_assunto_pai       FROM        argsm001.argtb09_assunto ar       WHERE        ar.nu_assunto = ass.nu_assunto       UNION      SELECT        au.nu_assunto,        au.no_assunto,        au.nu_assunto_pai       FROM        argsm001.argtb09_assunto au         INNER JOIN          b           ON au.nu_assunto = b.nu_assunto_pai     )    SELECT      string_agg(b.no_assunto, ' > ') OVER (    ORDER BY      b.nu_assunto)     FROM      b     ORDER BY      b.nu_assunto DESC,      nu_assunto_pai DESC LIMIT 1  )  AS assunto,   d.nu_caixa_postal_responsavel, COALESCE(pd.pz_responsavel, 0)  , class_demanda.IC_CLASSIFICACAO  ,(SELECT categoriaCor.ic_cor_categoria ||'<>'||COALESCE(categoriaCor.de_categoria, ' ') as cor_desc FROM argsm001.argtb35_categoria_cor categoriaCor      INNER JOIN argsm001.argtb36_categoria_cor_demanda categoriaCorDemanda       on categoriaCorDemanda.nu_categoria_cor = categoriaCor.nu_categoria_cor     WHERE categoriaCorDemanda.nu_demanda = d.nu_demanda      AND categoriaCor.nu_caixa_postal = ?) as ic_cor_categoria  from argsm001.argtb13_demanda d  LEFT join argsm001.argtb31_classificacao_demanda class_demanda             ON (class_demanda.nu_demanda = d.nu_demanda AND class_demanda.ic_tipo_avaliacao = 2 )  left join argsm001.argtb09_assunto ass on ass.nu_assunto = d.nu_assunto  left join argsm001.argtb08_caixa_postal cx on cx.nu_caixa_postal = d.nu_caixa_postal_demandante or cx.nu_caixa_postal = d.nu_caixa_postal_responsavel  left join argsm001.argtb02_unidade uni on uni.nu_unidade = cx.nu_unidade  left join argsm001.argtb16_fluxo_demanda fd on fd.nu_demanda = d.nu_demanda  left join argsm001.argtb15_atendimento ate on ate.nu_demanda = d.nu_demanda  INNER JOIN argsm001.argtb08_caixa_postal CXDEM ON CXDEM.nu_caixa_postal = d.nu_caixa_postal_demandante  INNER JOIN argsm001.argtb08_caixa_postal CXRESP ON CXRESP.nu_caixa_postal = d.nu_caixa_postal_responsavel  INNER JOIN argsm001.argtb02_unidade uniCXRESP ON uniCXRESP.nu_unidade = CXRESP.nu_unidade  LEFT JOIN    (      SELECT        d4.nu_demanda,        MAX(atend4.dh_atendimento) atend,        MAX(atend4.dh_recebimento) receb       FROM        argsm001.argtb15_atendimento atend4         INNER JOIN          argsm001.argtb13_demanda d4           ON atend4.nu_demanda =d4.nu_demanda         INNER JOIN          argsm001.argtb16_fluxo_demanda fd4           ON fd4.nu_demanda = d4.nu_demanda       WHERE       fd4.ic_ativo         AND fd4.nu_caixa_postal = ?        AND         ((d4.ic_situacao = 2           AND d4.dh_fechamento >=           (            DATE(now()) - 10          ))           OR d4.ic_situacao = 0           OR d4.ic_situacao = 1           OR d4.ic_situacao = 4         )      GROUP BY        d4.nu_demanda     )    ultAtend     ON ultAtend.nu_demanda = d.nu_demanda  inner join ( select fd5.nu_demanda, sum(case when fd5.nu_ordem = 0 then 0 else (fd5.pz_fluxo_demanda + COALESCE(fd5.pz_adicional,0)) end) dias   from argsm001.argtb16_fluxo_demanda fd5  where fd5.ic_ativo and fd5.nu_ordem > 0 group by fd5.nu_demanda) prazo on prazo.nu_demanda =d.nu_demanda  CROSS JOIN LATERAL workday(date(d.dh_abertura), cast(prazo.dias as integer)) prazoDiasD  left join argsm001.argtb11_observador_assunto obsA on obsA.nu_assunto = ass.nu_assunto  left join argsm001.argtb17_observador_demanda obsD on obsD.nu_demanda = d.nu_demanda   left JOIN argsm001.argtb28_prazo_demanda pd on pd.nu_demanda = d.nu_demanda           WHERE 1 = 1  and ( (ate.dh_atendimento > date(?) OR ate.dh_recebimento > date(?) )  OR ( ( d.ic_situacao in (?, ?) ) AND COALESCE(d.dh_fechamento, date(now())) > date(?) ) )  AND (d.ic_situacao = ?)  and d.nu_caixa_postal_demandante = ?
11:00:08,628 DEBUG [org.hibernate.loader.Loader] (default task-5) Result set row: 0
11:00:08,628 DEBUG [org.hibernate.loader.Loader] (default task-5) Result row:
[p585600@caddeapllx2577 ~]$
