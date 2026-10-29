Atualizando sobre o SIAVL-gestaomodelonota-backend (DES): o erro de incompatibilidade de Java foi resolvido. O jar é compilado em Java 21 e a imagem estava em openjdk17. Ajustamos a imagem e agora a aplicação sobe normalmente em Java 21, com Spring Boot iniciado e conexão ao banco ok.

Agora estamos verificando outro ponto: as probes de liveness e readiness (/actuator/health/liveness e /actuator/health/readiness) estão retornando 401, o que faz o OpenShift reiniciar o pod. Tudo indica que o Spring Security está protegendo o /actuator. Se for confirmado, vai ser preciso liberar esses endpoints na configuração de segurança da aplicação (ex.: .requestMatchers("/actuator/health/**").permitAll()).

Assim que eu confirmar, te aviso.
