


<img width="1881" height="911" alt="image" src="https://github.com/user-attachments/assets/6610baf5-25ee-44ac-a60d-ecd09a35da8d" />



<img width="1890" height="912" alt="image" src="https://github.com/user-attachments/assets/ce01ab4f-8dc0-466c-b68a-dab772a9692b" />



o config.yaml já tem aks



app:
  name: sinsh-backend-simulador-pj-des
project:
  name: des
labels:
  appName: sinsh-backend-simulador-pj
  environment: des
source:
  repo: "https://github.com/caixagithub/sinsh-backend-simulador-pj-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sinsh-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-sinsh-nprd
    namespace: sinsh-backend-simulador-pj


    o aks nao ta craido no microstf azure em clusters

    
