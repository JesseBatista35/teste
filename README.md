Prezados(as) time CoE Nuvem & DevSecOps,

Identificamos falha nas esteiras Android que utilizam a composite action caixagithub/DevSecOps-Actions/.github/android/default-build (branch develop). A etapa "Android SDK setup" está falhando com a mensagem "7 of 7 SDK package licenses not accepted", travando o build antes mesmo de compilar o código da aplicação.

Causa raiz: essa etapa usa a action pública android-actions/setup-android, fixada na major version v3 (action.yaml do repositório de vocês). Essa versão baixa o Android cmdline-tools como commandlinetools-linux-12266719_latest.zip, ou seja, sem versão fixa, sempre a que o Google estiver marcando como "latest" no momento da execução. O Google atualizou recentemente o que é "latest" (para o pacote 16.0), e o mecanismo interno de aceite automático de licenças da action v3 não está processando corretamente o novo conjunto de licenças desse pacote, deixando o prompt de aceite pendente e derrubando o build. Por isso a falha apareceu ao mesmo tempo em múltiplos projetos sem qualquer alteração de código ou de pipeline da parte dos times consumidores.

Evidências (mesma falha, mesmo ponto da esteira, projetos e times diferentes):
sictm-android: https://github.com/caixagithub/sictm-android/actions/runs/34904443083/job/104177811920
sictm-sicli-adapter: https://github.com/caixagithub/sictm-sicli-adapter/actions/runs/34986904537/job/104441603354?pr=55
sifam-android: run #254 (BUILD FARM_BUILD), falha 3h atrás, mesma mensagem "7 of 7 SDK package licenses not accepted"

Correção proposta: atualizar o pin da action no action.yaml compartilhado de android-actions/setup-android@v3 para @v4. A v4 é a versão atualmente mantida pelos mantenedores e, ao contrário da v3, fixa uma versão específica do cmdline-tools (build 14742923, versão curta 20.0) em vez de sempre buscar "latest". Isso resolve a falha atual e evita que o mesmo problema se repita de forma silenciosa numa próxima atualização do Google. É uma alteração de uma linha no arquivo DevSecOps-Actions/.github/android/default-build/action.yaml, e como a action é compartilhada, a correção vale para todos os projetos Android da BOX de uma vez, sem necessidade de alteração nos repositórios individuais.

Observação à parte, sem relação com essa falha: os logs também exibem o aviso "Node 20 is being deprecated... running with Node 24 by default". É apenas informativo do runner do GitHub, indicando que alguma outra action usada na esteira ainda está em Node 20 e precisará ser atualizada antes da descontinuação definitiva. Fica como pendência à parte para regularização, não bloqueia builds no momento.

Impacto atual: todas as esteiras Android da BOX que dependem dessa composite action estão bloqueadas para build (DES/TQS), afetando múltiplos times/squads simultaneamente.
