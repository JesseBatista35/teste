Identificamos falha nas esteiras Android que utilizam a composite action caixagithub/DevSecOps-Actions/.github/android/default-build@develop. A etapa "Android SDK setup" (android-actions/setup-android@v3) está falhando ao aceitar as licenças do Android SDK, com a mensagem "7 of 7 SDK package licenses not accepted", mesmo com o parâmetro accept-android-sdk-licenses: true configurado no action.yaml — esse input não é reconhecido pela action nessa versão, então está sendo ignorado.

O problema começou a aparecer com o pacote commandlinetools-linux-12266719_latest.zip (cmdline-tools 16.0), que o Google passou a distribuir como "latest" recentemente e que parece ter alterado o fluxo de aceite automático de licenças da action.

Sugestão de correção no action.yaml compartilhado: adicionar um step logo após o "Android SDK setup" forçando o aceite via yes | sdkmanager --licenses > /dev/null || true, o que cobre as licenças independentemente da versão do cmdline-tools baixada.

Observação à parte: os logs também exibem o aviso "Node 20 is being deprecated... running with Node 24 by default". Esse aviso é apenas informativo do runner e não é a causa da falha atual, mas vale mapear quais actions do repositório ainda estão em Node 20 para regularizar antes do prazo do GitHub.
