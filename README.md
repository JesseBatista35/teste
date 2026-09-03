apiVersion: backstage.io/v1alpha1
kind: Component
metadata:
  name: sigex-frontend-painel-presi-gestao
  description: Painel Gestão PRESI - Novo Super Design System e Angular 20+
  annotations:
    argocd/app-selector: 'appName=sigex-frontend-painel-presi-gestao'
    backstage.io/kubernetes-id: sigex-frontend-painel-presi-gestao
    github.com/project-slug: caixagithub/sigex-frontend-painel-presi-gestao
    backstage.io/source-location: url:https://github.com/caixagithub/sigex-frontend-painel-presi-gestao
    backstage.io/techdocs-ref: url:https://github.com/caixagithub/sigex-frontend-painel-presi-gestao/tree/main
    backstage.io/managed-by-location: url:github.com/caixagithub/sigex-frontend-painel-presi-gestao
    sonarqube.org/project-key: sonarqube-produtos4/sigex-frontend-painel-presi-gestao
    feedback/type: 'MAIL'
    feedback/email-to: 'cxnde04@corp.caixa.gov.br'
spec:
  type: website
  lifecycle: estavel
  owner: group:default/g_az_idp_presi_arquiteto
  system: SIGEX
