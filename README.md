
sigms-motor-decisao
/catalog-info.yaml


apiVersion: backstage.io/v1alpha1
kind: Component
metadata:
  name: sigms-motor-decisao
  description: Motor de Decisão do Sistema de Mensageria - WhatsApp, Push e SMS
  annotations:
    argocd/app-selector: 'appName=sigms-motor-decisao'
    backstage.io/kubernetes-id: sigms-motor-decisao
    github.com/project-slug: caixagithub/sigms-motor-decisao
    backstage.io/source-location: url:https://github.com/caixagithub/sigms-motor-decisao
    backstage.io/techdocs-ref: url:https://github.com/caixagithub/sigms-motor-decisao/tree/main
    backstage.io/managed-by-location: url:github.com/caixagithub/sigms-motor-decisao
    sonarqube.org/project-key: sonarqube-produtos4/sigms-motor-decisao
    feedback/type: 'MAIL'
    feedback/email-to: 'cxnde02@corp.caixa.gov.br'
spec:
  type: service
  lifecycle: estavel
  owner: group:default/g_az_idp_cocli_desenvolvedor_caixa
  system: SIGMS
