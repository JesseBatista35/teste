Subject: Encaminhamento: Investigação WO0000080743905 - Cluster DES - Múltiplos Pods em Erro

Prezados,

Em resposta à Ordem de Trabalho WO0000080743905, conduzimos investigação no cluster OKD DES Login Serviços NPRD e identificamos que o problema reportado não está relacionado ao status das máquinas de infraestrutura, mas sim a um elevado número de PODS de aplicação em estado de erro ou crash.

=== DIAGNÓSTICO REALIZADO ===

✅ INFRAESTRUTURA - OPERACIONAL:
• 86 nodes em status "Ready"
• Cluster version 4.12.0-0.okd (OKD)
• Capacidade: CPU 31.5 cores, Memória 64GB por node
• Todos os nodes com heartbeat e condições normais

✅ AUTENTICAÇÃO (AAD) - CONFIGURADA:
• OpenID Provider: AAD (login.microsoftonline.com)
• Oauth-openshift deployment ativo e saudável
• Certificados válidos e carregados corretamente

❌ APLICAÇÕES - CRÍTICO:
• 500+ pods em status "Error" (deployments falhando)
• 100+ pods em status "CrashLoopBackOff" (aplicações caindo em loop)
• Exemplos: simkt-backend, connector-tqs, sievj-api-portal (1301+ restarts), fwc-* services
• Namespaces afetados: simkt, sipcs, sipdi, siaas, sipnc, sievj, fwc, e outros

=== CONCLUSÃO ===

A infraestrutura está operacional. O bloqueio para subida de novos workers e a impossibilidade de acesso via AAD são consequências dos PODS de aplicação não conseguirem inicializar corretamente.

Este cenário indica possíveis problemas em:
• Image pull errors (credenciais de registry privado)
• Erros de inicialização das aplicações
• Falta de dependências externas (bancos de dados, APIs)
• Quotas de recursos esgotadas
• Configurações de deployment incorretas

=== SOLICITAÇÃO ===

Requisitamos que a equipe de nuvem/OpenShift investigue:
1. Logs detalhados dos pods em erro
2. Eventos recentes dos namespaces afetados
3. Status de pull de imagens (registry access)
4. Quotas de recursos por namespace
5. Dependências externas dos serviços

Por gentileza, coordenem a análise e nos retornem com as ações necessárias.

Atenciosamente,
Equipe de Suporte CESTI36
