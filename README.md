package br.gov.caixa.siavl.gerencial.security;

import br.gov.caixa.siavl.gerencial.dto.ApiUser;
import br.gov.caixa.siavl.gerencial.dto.output.ExceptionOutputDTO;
import br.gov.caixa.siavl.gerencial.exception.FaltaDeRoleException;
import br.gov.caixa.siavl.gerencial.exception.TokenJwtException;
import br.gov.caixa.siavl.gerencial.security.dto.ApiAuthentication;
import br.gov.caixa.siavl.gerencial.security.service.JwtTokenCaixaService;
import br.gov.caixa.siavl.gerencial.util.TokenUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.util.List;

@Component
@Profile("!test")
@AllArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
	private static final String EXCEPTION_ACESSO_MENSAGEM = "Acesso negado para a API";
	private static final ObjectMapper MAPPER = new ObjectMapper();
	private final JwtTokenCaixaService jwtTokenCaixaService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String header = request.getHeader("Authorization");
		if (header == null || !header.startsWith("Bearer ") || !TokenUtils.isTokenCompleto(header)) {
			this.gerarRetornoUnauthorized(response, "O client não foi autenticado.",
					HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		String token = header.replace("Bearer ", "");
		try {
			ApiUser apiUser = jwtTokenCaixaService.validarRequisicaoECriarUsuario(token);
			Authentication authentication = ApiAuthentication.builder().apiUser(apiUser).authenticated(true).build();
			SecurityContextHolder.getContext().setAuthentication(authentication);
		} catch (FaltaDeRoleException e) {
			this.gerarRetornoUnauthorized(response, e.getMessage(), HttpServletResponse.SC_FORBIDDEN);
			return;
		} catch (TokenJwtException e) {
			logger.error("Erro ao validar o token JWT: " + e.getMessage());
			this.gerarRetornoUnauthorized(response, "O client não foi autenticado.",
					HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		chain.doFilter(request, response);
	}

	private void gerarRetornoUnauthorized(HttpServletResponse response, String mensagem, int httpStatus)
			throws IOException {
		ExceptionOutputDTO dto = new ExceptionOutputDTO();
		dto.setMensagem(EXCEPTION_ACESSO_MENSAGEM);
		dto.setErros(List.of(mensagem));
		response.setStatus(httpStatus);
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.getWriter().write(MAPPER.writeValueAsString(dto));
	}
}

spring:
  application:
    name: SIAVL-gerencial-backend
  datasource:
    url: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad04bc
    username: SAVLSD01
    password: SAV2017D04
    driver-class-name: oracle.jdbc.OracleDriver
  jpa:
    database-platform: org.hibernate.dialect.OracleDialect
    hibernate:
      ddl-auto: validate
      naming.physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      naming.implicit-strategy: org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
    properties:
      hibernate:
        globally_quoted_identifiers: true
        format_sql: true
        hbm2ddl:
          auto: none
        jdbc:
          time_zone: UTC

management:
  health:
    livenessstate:
      enabled: true
    readineasstate:
      enabled: true
  endpoint:
    health:
      show-details: always
      probes:
        enabled: true

env:
  apimanager:
    url: https://api.des.caixa:8443
    key: l7xx2b6f4c64f3774870b0b9b399a77586f5
  certificadodigital:
    validar: false

api:
  caixa:
    issuers: https://login.des.caixa/auth/realms/intranet



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIAVL-gerencial-backend
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIAVL-gerencial-backend

.mvn
src
main
java
br
gov
caixa
siavl
gerencial
config
controller
dto
exception
security
algorithm
clients
dto
service
JwtAuthenticationFilter.java
util
RunApplication.java
resources
application.yaml
test
.gitattributes
.gitignore
applicationinsights.log
lombok.config
mvnw
mvnw.cmd
pom.xml
README.md

startup

/
src
/
main
/
resources
/
application.yaml
application.yaml

Edit

Contents
History
Compare
Blame

1234567891011121314151617181920212223242526272829303132333435363738394041424344
spring:
  application:
    name: SIAVL-gerencial-backend
  datasource:
    url: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad04bc
    username: SAVLSD01
    password: SAV2017D04
    driver-class-name: oracle.jdbc.OracleDriver
  jpa:
    database-platform: org.hibernate.dialect.OracleDialect
…    validar: false

api:
  caixa:
    issuers: https://login.des.caixa/auth/realms/intranet
Showing 7 items.

Finished loading items

Expanded

Collapsed


    
