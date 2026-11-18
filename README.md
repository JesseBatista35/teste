600@srjtqapllx0056 ~]$ ls -lt /infra_app/logs/sigaf/ | head -20; grep -c "APFAP327" /infra_app/logs/sigaf/*
total 2304840
-rw-r--r-- 1 spjbotr2 jboss 2074099547 Nov 17 15:46 srjtqapllx0056_sigaf_intra_8083.log
-rw-r--r-- 1 spjbotr2 jboss  286046937 Nov 17 15:04 server-srjtqapllx0056_sigaf_intra_8083.log
/infra_app/logs/sigaf/server-srjtqapllx0056_sigaf_intra_8083.log:0
/infra_app/logs/sigaf/srjtqapllx0056_sigaf_intra_8083.log:12186
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$ F=/infra_app/logs/sigaf/srjtqapllx0056_sigaf_intra_8083.log; grep "APFAP327" $F | tail -5 | cut -c1-500; grep -c -i "indisponibilidade" $F
15:04:13,202 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-12), Erro ao atualizar os valores do contrato 700349.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
15:04:13,216 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-12), Erro ao atualizar os valores do contrato 700863.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
15:04:13,227 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-12), Erro ao atualizar os valores do contrato 701081.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
15:04:13,238 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-12), Erro ao atualizar os valores do contrato 701281.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
15:04:13,250 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-12), Erro ao atualizar os valores do contrato 705315.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
12186
[p585600@srjtqapllx0056 ~]$
