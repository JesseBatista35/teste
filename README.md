Enquanto isso, crie o projeto do cenário 2 para rodar em paralelo:

Projects → Create project
Name: SIFEC-CCR-EAP7-JDK17
Description: REQ000146318691 - Cenário 2: JBoss EAP 7 com Java 17
Add applications: upload do SIFEC-CCR.ear.
Set transformation target: card JBoss EAP 7 e também o card OpenJDK (se tiver seletor de versão, escolha 17).
Select packages: só br.
Custom rules / Custom labels: Next.
Options: confira se o Target mostra eap7 e openjdk17 (se o 17 não estiver, adicione pelo dropdown). Mantenha Source eap6 e Export CSV ligado.
Review → Save and run.
