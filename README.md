Prezados,

Em continuidade à análise do problema de disponibilização do componente SIAVL-gerencial-backend no ambiente DES, identificamos a causa raiz do erro HTTP 401 apresentado pelas probes de readiness e liveness.

Causa identificada:

A classe JwtAuthenticationFilter (pacote br.gov.caixa.siavl.gerencial.security), responsável por interceptar as requisições e validar o token JWT via header Authorization, não possui nenhuma regra de exclusão de path. Como o filtro é aplicado a todas as requisições, inclusive as chamadas internas de readiness e liveness feitas pelo Kubernetes/OpenShift para os endpoints /actuator/health/readiness e /actuator/health/liveness são interceptadas, não possuem o header Authorization esperado e, por consequência, retornam 401. Isso impede que o pod atinja o estado Ready e gera reinicializações contínuas do container.

Sugestão de ajuste:

Recomendamos sobrescrever o método shouldNotFilter na classe JwtAuthenticationFilter, liberando os endpoints do actuator utilizados pelas probes, conforme exemplo abaixo:

@Override
protected boolean shouldNotFilter(HttpServletRequest request) {
    String path = request.getRequestURI();
    return path.startsWith("/actuator/health");
}

Dessa forma, as chamadas de readiness e liveness deixam de exigir autenticação, sem impactar a proteção dos demais endpoints da API.

Observação adicional:

Durante a análise, identificamos que o arquivo application.yaml contém as credenciais de acesso ao banco Oracle (usuário e senha) em texto plano, versionadas no repositório. Sugerimos avaliar a migração dessas credenciais para um mecanismo seguro de gestão de segredos, de forma a atender as práticas de segurança da informação da Caixa.

Ficamos à disposição para apoiar na validação do ajuste em ambiente DES assim que a alteração estiver disponível.

Atenciosamente,
Jessé Batista
CTIS/CESTI - DES/TQS NPRD
