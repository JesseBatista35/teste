Atualizando sobre o pedido do host cxextrux2072 (10.192.222.72) — você comentou que na real o objetivo é dar boot na máquina, não só restart do hc_des. Then, importante:

🔴 Não tenho nenhum tipo de acesso privilegiado nesse servidor:
- Sem sudo: `sudo -l` retornou "Sorry, user p585600 may not run sudo on cxextrux2072"
- Sem senha do usuário jboss (pra su)
- Sem management-user cadastrado no ManagementRealm do JBoss

⚠️ Além disso, reboot de SO nessa VM não impacta só o DES — ela hospeda múltiplos domains no mesmo host (vi nos scripts do init.d: pre, rel, tqs, des, cod, mg1, mg2). Um boot completo derruba tudo isso junto, não só os servers do hc_des.

Isso definitivamente precisa ir pra INFRA — tanto pelo nível de acesso (reboot de SO normalmente é root/change) quanto pelo escopo de impacto (múltiplos ambientes no mesmo host). Você quer que eu abra o chamado, ou prefere você mesmo escalar já que foi você quem recebeu a demanda original?
