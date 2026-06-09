
1. Ver eventos de deleção:
bashoc get events -n build-images-ads --sort-by='.lastTimestamp' | grep -i delete
2. Ver auditoria (se habilitada):
bash# No seu cluster, peça ao admin:
oc adm node-logs --role=master --path=audit.log | grep sifof-api-aplicacao
3. Verificar backup/histórico do git:
Se o BuildConfig estava em um repositório Git:
bashcd seu-repo
git log --oneline | grep -i sifof
git show <commit-hash> # Ver o que foi deletado

🛡️ Recuperar o BuildConfig
Opção 1: Git History
bash# Se estava versionado, recupere do git
git checkout <commit-anterior> -- buildconfig.yaml
oc create -f buildconfig.yaml
Opção 2: Backup do Cluster
bash# Se seu admin fez backup:
oc get buildconfig sifof-api-aplicacao -n build-images-ads -o yaml > sifof-api-aplicacao-backup.yaml
Opção 3: Recriar do zero
bashoc get buildconfig sifof-api-aplicacao -n build-images-ads -o yaml
# (Pedir para alguém que tenha acesso fornecer)

📌 Proteger contra futuras deletions
bash# Adicionar label de proteção
oc patch buildconfig sifof-api-aplicacao -n build-images-ads -p '{"metadata":{"labels":{"protected":"true"}}}'

# Ou usar RBAC para restringir deletions
oc adm policy add-role-to-user view seu-usuario -n build-images-ads

❓ Próximos Passos

Você tem o YAML original do BuildConfig? (arquivo ou git)
Quando foi deletado? (hoje? semana passada?)
Quem tem acesso para deletar? (admin? pipeline automática?)

Compartilhe o YAML original ou acesse o git histórico! 🔧
