project: des
source:
  repoURL: >-
    https://github.com/caixadepartamental/vitec-sda8c-frontend-hub-ciaussp-frontend-2026-infranprd
  path: des
  targetRevision: HEAD
  helm:
    values: |
      caixa-base-chart:
        commonLabels:
          app.kubernetes.io/app: 'vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des'
          backstage.io/kubernetes-id: 'vitec-sda8c-frontend-hub-ciaussp-frontend-2026'
          appName: 'vitec-sda8c-frontend-hub-ciaussp-frontend-2026'
        commonAnnotations:
          backstage.io/kubernetes-cluster: 'aks-vitec-dep'
    ignoreMissingValueFiles: true
destination:
  namespace: vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
  name: aks-vitec-dep
syncPolicy:
  automated:
    prune: true
    selfHeal: true
  syncOptions:
    - RespectIgnoreDifferences=true
    - CreateNamespace=true
  retry:
    limit: 4
    backoff:
      duration: 10s
      factor: 2
      maxDuration: 10m
  managedNamespaceMetadata:
    labels:
      argocd.argoproj.io/managed-by: openshift-gitops
      azure-key-vault-env-injection: enabled
ignoreDifferences:
  - group: '*'
    kind: Namespace
    jsonPointers:
      - /metadata/labels
      - /metadata/annotations
