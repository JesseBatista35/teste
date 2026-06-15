
GITHUB/ARGOCD/FUSIONXPod em estado Progressing indefinidamente
Ir para navegaçãoIr para pesquisar
📄 Argo CD — Erro: Pod em estado Progressing indefinidamente

🎯 Objetivo

Identificar e corrigir erro onde o Pod permanece em estado Progressing por longo período e posteriormente falha.


🚨 Problema

O Pod fica com status:

Progressing
Após um tempo, apresenta falha com:

ProgressDeadlineExceeded
Nos eventos, aparece erro de agendamento:

FailedScheduling
0/6 nodes are available
🔍 Causa

O Pod não consegue ser agendado em nenhum nó do cluster.

Isso ocorre porque:

O cluster possui taints configurados nos nós

O Pod não possui tolerations compatíveis


🔎 Como identificar

Acessar o Argo CD

Abrir a aplicação afetada

Selecionar o Pod

Ir na aba Events


Buscar por mensagens como:

Faleid Scheduling  e mensagens como untolerated taint {nuvem.caixa/nodepoolname: ...}
🛠️ Solução

Adicione a toleração correta no values.yaml do Helm. Procure pela seção tolerations e complete com o valor do nodepool.

Exemplo:

tolerations:

- key: "nuvem.caixa/nodepoolname"
  effect: "NoSchedule"    
  operator: "Equal"    
  value: "appssiiga"

📄 Arquivo afetado

Plain Textvalues.yaml (repositório de infraestrutura)Mostrar mais linhas


⚠️ Pontos de atenção

O valor do nodepool deve estar correto Um valor incorreto impedirá o agendamento do Pod Sempre validar após o deploy


💡 Dica

Caso não saiba o valor correto:

✅ Verifique outro ambiente (DEV/HML/PRD) que esteja funcionando

✅ Copie o bloco de tolerations já validado

✅ Resultado esperado


Pod é agendado corretamente Status muda para:

Running
Deploy finalizado com sucesso no Argo CD

Menu de navegação
P585600DiscussãoPreferênciasPáginas vigiadasContribuiçõesSair
PáginaDiscussão
LerEditarEditar código-fonteVer históricoVigiar
Mais
Pesquisa
Pesquisar em WikiPRDCetad
Página principal
Mudanças recentes
Página aleatória
Ajuda do MediaWiki
Processos
Atendimento às Comunidades
Equipe
Pessoas
Redes
Instalações
Multiplataforma
Contratos
Plataforma Alta
Infraestrutura de Banco de Dados
Armazenamento
Nuvem Pública e Capacidade
Aplicação Multiplataformas (Esteiras)
Operação Contínua
Gerência de Centralizadora
Informações
Manual de Usuário
Ferramentas
Páginas afluentes
Mudanças relacionadas
Enviar arquivo
Páginas especiais
Versão para impressão
Ligação permanente
Informações da página
Esta página foi modificada pela última vez em 10 de junho de 2026, às 22h13min.
Política de privacidadeSobre WikiPRDCetadTermo de responsabilidade
Powered by MediaWiki
