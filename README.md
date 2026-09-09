Oi! Sobre o restart do hc_des que você pediu (host cxextrux2072, DES/TQS Cartões) — tentei mas não consegui, te explico o que rolou:

1️⃣ Tentei `/etc/init.d/jboss-7.0_hc_des.sh restart` → deu "kill: permission denied" (o processo é do usuário jboss, minha sessão é o meu usuário pessoal)
2️⃣ Tentei `sudo su` → não tenho sudoers nesse servidor
3️⃣ Tentei `su - jboss` → não tenho a senha do usuário jboss
4️⃣ Tentei via jboss-cli (management port 9999, confirmei que está acessível) com `:shutdown(restart=true)` → autenticação falhou nos dois mecanismos: JBOSS-LOCAL-USER (permission denied no challenge file, que só o dono jboss consegue ler) e DIGEST-MD5 (meu usuário não está cadastrado no ManagementRealm)
