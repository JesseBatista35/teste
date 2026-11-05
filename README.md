Pablo, abrimos o .ear do PJ (build 144833-8) e cruzamos com o log do Keycloak em TRACE:

O web.xml protege /* exigindo as roles FEC0100..FEC0238, não tem <login-config> e usa security-domain jaas-sifec. Ou seja, o PJ não faz login próprio: depende de receber a identidade do fec-web.
No 7.4 as chamadas do PJ passam pela restrição (200), então o servidor reconhece o usuário via SSO (já habilitamos o single-sign-on do Undertow, igual ao <sso> do 6.4). Mas o adapter do Keycloak não coloca o KeycloakSecurityContext nas requisições do PJ (no fec-web coloca).
No 6.4, a válvula de SSO do JBoss Web repassava o KeycloakPrincipal com o token, e por isso o perfil-acesso-usuario devolvia ["FEC0126","offline_access",...].

Pergunta: como o perfil-acesso-usuario lê as roles? Se for por request.getAttribute(KeycloakSecurityContext.class.getName()) ou da sessão, no EAP 7.4 + SSO isso vem null. Dá para testar lendo por request.getUserPrincipal() (e, se for KeycloakPrincipal, getKeycloakSecurityContext()) ou por request.isUserInRole("FEC0126")? Um log no endpoint mostrando a classe do getUserPrincipal() já confirma
