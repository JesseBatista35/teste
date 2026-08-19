apiVersion: backstage.io/v1alpha1
kind: Component
metadata:
  name: siagf-backend-clerk-transaction-raw
  description: Worker que lê eventos de todos os tipos de transação da fila ehdadosclientesout , processa e organiza
  annotations:
    argocd/app-selector: 'appName=siagf-backend-clerk-transaction-raw'
    backstage.io/kubernetes-id: siagf-backend-clerk-transaction-raw
    github.com/project-slug: caixagithub/siagf-backend-clerk-transaction-raw
    backstage.io/source-location: url:https://github.com/caixagithub/siagf-backend-clerk-transaction-raw
    backstage.io/techdocs-ref: url:https://github.com/caixagithub/siagf-backend-clerk-transaction-raw/tree/main
    backstage.io/managed-by-location: url:github.com/caixagithub/siagf-backend-clerk-transaction-raw
    sonarqube.org/project-key: sonarqube-produtos4/siagf-backend-clerk-transaction-raw
    feedback/type: 'MAIL'
    feedback/email-to: 'cxnde04@corp.caixa.gov.br'
spec:
  type: service
  lifecycle: estavel
  owner: group:default/g_az_idp_suporte
  system: SIAGF
