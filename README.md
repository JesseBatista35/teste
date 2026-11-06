SICCR-PJ (Workflow Crédito PJ) – JBoss EAP 7.4 – DES ✅

Sintoma: a tela do PJ abria, mas as APIs (perfil-acesso-usuario, cliente/cnpj e a lista de clientes) retornavam HTTP 200 sem conteúdo (Content-Length 0), sem erro no log.

Causa raiz: o filtro da aplicação (br.gov.caixa.wpj.app.filter.RequestFilter / BufferedResponseWrapper) usa um wrapper de resposta que o Undertow (EAP 7.4) não aceita por padrão (aviso UT010024). Com isso, o corpo da resposta era descartado. No 6.4 (JBoss Web) esse comportamento era aceito.

Correção no ambiente: allow-non-standard-wrappers=true no servlet-container do Undertow (profile full-ha-sifec-intranet) + restart do server-group sifec-intranet.

Validação: o perfil-acesso-usuario retorna as roles do usuário (igual ao 6.4) e a lista de clientes carrega normalmente.

Ajustes complementares feitos durante a investigação, para igualar ao 6.4: properties do SICCR/PJ (SICLI, SSO de serviço, LDAP, barramento), single-sign-on no Undertow (domain des.caixa) e security domain jaas-sifec.

Recomendação ao dev: ajustar o BufferedResponseWrapper para estender HttpServletResponseWrapper com super(response), para não depender da flag nos demais ambientes (TQS/HMP/PRD).

🙏 Agradecimentos

Thiago Jeferson, pela análise que identificou a causa raiz (UT010024 no filtro do PJ) e pelo apoio nos deploys.
Pablo, pela disponibilidade nos testes, pelos builds com as correções e pela paciência durante a investigação.
Prokot e Luiz, pelo apoio técnico nas análises de Keycloak e dos avisos de subida.
Paulo e Rodrigo, pela priorização e pelo alinhamento com o time.

Valeu, pessoal! Seguimos com os próximos módulos. 🚀
