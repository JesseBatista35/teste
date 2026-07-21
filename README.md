Prezados,

Referente ao deploy do componente SIAVL-gerencial-backend no ambiente DES (namespace siavl-des), informamos que a aplicação está apresentando falha de disponibilização, impedindo a conclusão do rollout.

Diagnóstico realizado pela equipe de pipeline:

A aplicação inicializa corretamente, incluindo a conexão com o banco de dados Oracle, que é estabelecida com sucesso pelo pool de conexões HikariCP. O contexto Spring é finalizado sem erros e o Tomcat sobe normalmente na porta 8080.

Entretanto, as probes de readiness e liveness configuradas para os caminhos /actuator/health/readiness e /actuator/health/liveness estão retornando código de status HTTP 401 (Unauthorized). Como consequência, o pod nunca atinge o estado Ready, o rollout do deployment não conclui e o container entra em ciclo de reinicialização (crash loop) devido às falhas consecutivas da liveness probe, resultando em restarts contínuos.

Solicitamos ao time de desenvolvimento verificar:

1. A configuração de segurança da aplicação (Spring Security), confirmando se os endpoints do actuator utilizados pelas probes de readiness e liveness estão liberados para acesso sem autenticação.

2. Se houve alguma alteração recente na configuração de segurança ou nas dependências relacionadas ao Spring Security/Spring Boot Actuator que possa ter impactado a exposição desses endpoints.

3. Validar localmente, se possível, o comportamento dos endpoints /actuator/health/readiness e /actuator/health/liveness, confirmando se retornam HTTP 200 sem necessidade de autenticação.

Ficamos à disposição para apoiar com informações adicionais de infraestrutura e pipeline, caso necessário.

Atenciosamente,
Jessé Batista
CTIS/CESTI - DES/TQS NPRD
