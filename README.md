Último teste de ambiente, rápido (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=undertow/servlet-container=default:read-attribute(name=proactive-authentication)

Essa opção faz o Undertow aplicar a identidade do SSO em toda requisição, como o 6.4 fazia.

Vier false: é candidata forte. Me avise antes de mudar, porque precisa de restart.
Vier true: a parte de ambiente está esgotada, e a correção é na configuração de segurança do PJ. É com o Pablo.
