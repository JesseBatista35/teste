Ao rodar o CI/CD Workflow Generic para o projeto, o ambiente DES faz o deploy mas o ambiente TQS appresenta o seguinte erro:

Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
Run set -euo pipefail

ENVIRONMENT_LOWER=tqs

APP_NAME_LOWER=sisph-mfe-jnd-central-servicos
Falha ao obter Application ou erro retornado:

{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.
