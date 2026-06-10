app:
  name: siiga-frontend-mfe-gestao-canais-tqs
project:
  name: tqs
labels:
  appName: siiga-frontend-mfe-gestao-canais
  environment: tqs
source:
  repo: "https://github.com/caixagithub/siiga-frontend-mfe-gestao-canais-infranprd"
  path: tqs
sourcevar:
  repo: "https://github.com/caixagithub/siiga-globalnprd"
  path: tqs
  values: global.yaml  
cluster:
  destination:  
    name: aks-pla-nprd
    namespace: siiga-frontend-mfe-gestao-canais
