normalmente), então é só:

Baixar o tarball do JDK 17 no seu PC:
https://adoptium.net/temurin/releases/?version=17 → Linux, x64, .tar.gz
Mandar direto via scp do seu PC pro servidor:

bashscp OpenJDK17U-jdk_x64_linux_hotspot_17.0.13_11.tar.gz p585600@caddeapllx1369.agil.nprd.caixa.gov.br:/tmp/
Isso é tudo. Sem Nexus, sem agente de build, sem burocracia — só um scp direto de ponta a ponta.
Isso funciona no seu caso, ou o seu acesso ao caddeapllx1369 passa por algum jump host / bastion que não deixa scp de arquivo externo passar direto?
