no argocd


OPERATION
Sync
PHASE
Error
MESSAGE
ComparisonError: Failed to load target state: failed to generate manifest for source 1 of 1: rpc error: code = Unknown desc = Manifest generation error (cached): failed to execute helm template command: failed to get command args to log: `helm template . --name-template sinsh-backend-simulador-pj-des --namespace sinsh-backend-simulador-pj --kube-version 1.34 --values /tmp/24bcabf3-70ac-48a4-8556-9d530c799e4f <api versions removed> --include-crds` failed exit status 1: coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. Error: template: caixa-base-chart/charts/caixa-base-chart/templates/deployment.yaml:100:3: executing "caixa-base-chart/charts/caixa-base-chart/templates/deployment.yaml" at <include "caixa-base-chart.mergedEnvs" .>: error calling include: template: caixa-base-chart/charts/caixa-base-chart/templates/_helpers.tpl:85:9: executing "caixa-base-chart.mergedEnvs" at <.name>: can't evaluate field name in type interface {} Use --debug flag to render out invalid YAML (retried 4 times).
STARTED AT
an hour ago (Thu Jul 09 2026 15:10:49 GMT-0300)
DURATION
5m2s
FINISHED AT
an hour ago (Thu Jul 09 2026 15:15:51 GMT-0300)
REVISION
INITIATED BY
githubuser

Application conditions
ComparisonError
Failed to load target state: failed to generate manifest for source 1 of 1: rpc error: code = Unknown desc = Manifest generation error (cached): failed to execute helm template command: failed to get command args to log: `helm template . --name-template sinsh-backend-simulador-pj-des --namespace sinsh-backend-simulador-pj --kube-version 1.34 --values /tmp/ef15c510-f46b-438d-bc38-77e02d7f34f0 <api versions removed> --include-crds` failed exit status 1: coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. coalesce.go:237: warning: skipped value for caixa-base-chart.caixa-base-chart.env: Not a table. Error: template: caixa-base-chart/charts/caixa-base-chart/templates/deployment.yaml:100:3: executing "caixa-base-chart/charts/caixa-base-chart/templates/deployment.yaml" at <include "caixa-base-chart.mergedEnvs" .>: error calling include: template: caixa-base-chart/charts/caixa-base-chart/templates/_helpers.tpl:85:9: executing "caixa-base-chart.mergedEnvs" at <.name>: can't evaluate field name in type interface {} Use --debug flag to render out invalid YAML
15 minutes ago (Thu Jul 09 2026 16:14:13 GMT-0300)
OrphanedResourceWarning
Application has 1 orphaned resources

<img width="1891" height="920" alt="image" src="https://github.com/user-attachments/assets/002c0c32-b6aa-414f-937a-73f9e7c35a5e" />

