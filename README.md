ANÁLISE - Falha na dependência Heartbeat iOS

Status: Bloqueado

Descrição do problema:
A pipeline falha durante `pod install` com erro 401 (Unauthorized) ao tentar fazer download do Heartbeat framework versão 4.36.0.1638431 da CDN https://download-ofd.apps.topazevolution.com/.

Errolog:
curl: (22) The requested URL returned error: 401
https://download-ofd.apps.topazevolution.com/ios-cdn-releases/4.36.0.1638431/Heartbeat.xcframework.tar.bz2

Causas potenciais:
1. Versão 4.36.0.1638431 do Heartbeat não disponível ou descontinuada na CDN
2. URL expirada ou sem credenciais válidas de acesso
3. Podfile.lock desatualizado apontando para versão que não existe mais na repo
4. CocoaPods precisa de header de autenticação que não está sendo enviado

Ações necessárias:
1. Time iOS: validar versão do Heartbeat no Podfile — está esse número de build ainda disponível?
2. Time iOS: verificar se há configuração de source/credentials no Podfile para a CDN
3. Testar acesso direto à CDN em local (curl -v com auth se necessário)
4. Se versão foi deprecada, atualizar Podfile para versão suportada
5. Se CDN exige credenciais, configurar no CocoaPods source do Podfile

Próxima ação: Aguardando resposta do time iOS sobre disponibilidade/versão do Heartbeat.
