À CAIXA

Prezados,

Seguem as informações solicitadas sobre o backend em DES:

Aplicação: sibec-micro-des (DeploymentConfig, namespace sibec-des), imagem sibec-micro:1.7.2.2.
Destino SISGR configurado: SISGR_API_MP_REST_URL = https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web.
Conectividade do pod ao destino validada (HTTP [código]); não há bloqueio de rede.
Log da chamada POST /api/autorizacao/parametros-portal: a exceção AutorizacaoPortalException (“parametroPortal é obrigatório”) ocorre em AutorizacaoService.recuperarParametroPortal (linha 155), após a biblioteca SISGR (br.gov.caixa.sisgr.parametros.SisgrParametros) retornar nulo. O log registra “log4j:WARN No appenders could be found” para essa biblioteca, ou seja, os erros internos do SISGR não estão sendo registrados.

Recomendamos que a equipe de desenvolvimento configure o log4j da biblioteca SISGR (ou trate e registre a exceção no retorno nulo) para identificar o motivo, e valide com o gestor do SISGR os parâmetros/credenciais usados pela aplicação. Não foi identificada necessidade de ajuste de variável ou configuração na esteira.

Como os pontos relatados nesta demanda têm causas e responsáveis distintos, solicitamos que novas ocorrências sejam registradas em REQs específicas.

Demanda encerrada.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
