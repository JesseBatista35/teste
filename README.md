app:
  name: sisva-frontend-transacional-des
project:
  name: des
labels:
  appName: sisva-frontend-transacional
  environment: des
source:
  repo: "https://github.com/caixagithub/sisva-frontend-transacional-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sisva-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-aixa-des
    namespace: sisva-frontend-transacional


    <img width="1886" height="931" alt="image" src="https://github.com/user-attachments/assets/5b2ff0e3-f10a-445c-8abb-b0535776cd85" />

    
