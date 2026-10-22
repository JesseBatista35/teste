Gisele, achamos a causa do ClassNotFoundException: br.gov.caixa.log.Log no intranet.

O sirotcon-ejb que a esteira implantava antes (artefato br.gov.caixa.SirotconEAP:sirotcon-ejb:2.3.0.1) trazia dentro dele as libs de que o SIROT depende: CeflogEAP-2.5.0.0, ceflib-2.5.0.1, log4j-1.2.17 e o sirotcon-ejb-lib. A classe br.gov.caixa.log.Log fica no CeflogEAP-2.5.0.0.

Na build nova, o sigsj_intranet.war leva só o sirotcon-ejb-2.3.0.1-farm e o sirotcon-ejb-lib-2.3.0.2-farm, sem o CeflogEAP e sem o ceflib.

Consegue incluir no pom as dependências CeflogEAP 2.5.0.0 e ceflib 2.5.0.1 e gerar uma nova build? O boleto deve precisar do mesmo ajuste. Do nosso lado, config e servidor já estão prontos para a nova versão.
