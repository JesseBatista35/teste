app:
  name: siopi-backend-jornada-pj-hmp
project:
  name: hmp
labels:
  appName: siopi-backend-jornada-pj
  environment: hmp
source:
  repo: "https://github.com/caixagithub/siopi-backend-jornada-pj-infranprd"
  path: hmp
sourcevar:
  repo: "https://github.com/caixagithub/siopi-globalnprd"
  path: hmp
  values: global.yaml  
cluster:
  destination:  
    name: aks-siopi-nprd
    namespace: siopi-backend-jornada-pj



    <img width="1137" height="620" alt="image" src="https://github.com/user-attachments/assets/50995f33-a7aa-4ca1-95f4-1871ca1b10e5" />
so tem isso
