Flávio, boa tarde! Tudo bem?

Registrei a solicitação de regra de firewall ID 98173 e preciso da sua aprovação, por favor.

É para o SIPDM em DES: a aplicação sipdm-api-estudante está retornando erro 500 porque não consegue conectar no banco SQL Server do PDM. O namespace sai com egress IP dedicado, que não está liberado para o banco.

Regra:
• Origem: 10.116.221.183 (egress IP do namespace sipdm-des)
• Destino: 10.116.100.127 (CRJDEDADNT009)
• Porta: TCP/1433

O banco está ativo: a partir do bastion conecta normalmente. Só a origem do namespace está bloqueada.

Obrigado!
