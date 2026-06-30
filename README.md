vou te compatilhar a documentação para nao fazermos nada errado


Toggle navigation sidebarToggle in-page Table of Contents
OFD Mobile Heartbeat SDK
Search the docs ...
Guias Android
Guias iOS
OFD Mobile Heartbeat SDK iOS
OFDCamera - Face e OCR - Complemento iOS
Token - Complemento iOS
QRCode Authentication - Complemento iOS
Xamarin - Complemento iOS
Websocket do Heartbeat
Onboarding - Android e iOS - Complemento
OFD Mobile Heartbeat SDK - Bridge para React Native
OFD Mobile Heartbeat SDK - Capacitor Plugin para Ionic 6
OFD Mobile Heartbeat SDK - Cordova Plugin para Ionic 6
OFD Mobile Heartbeat SDK - Flutter Heartbeat Plug-in
Theme by the Executable Book Project
 Contents 
OFD Mobile Heartbeat SDK iOS
PRÉ-REQUISITOS
INCLUSÃO DO OFD MOBILE HEARTBEAT SDK iOS NO PROJETO
Acesso via CloudFront (iOS)
Autenticação
Configuração do Podfile
Adicionando dependência do OFD Mobile Heartbeat SDK iOS manualmente
Retirando arquitetura x86 para publicação na App Store (Somente pacote “.framework”)
Verificar versão do OFD Mobile Heartbeat no seu projeto
INICIALIZAÇÃO DO OFD MOBILE HEARTBEAT SDK iOS
EVENTO DE IDENTIFICAÇÃO DE USUÁRIO
SyncID
OFD Localização Confiável
Chamada Segura
Acesso às informações de WI-FI do iOS
FEATURES E PERMISSÕES
RESOLUÇÃO DE PROBLEMAS
OFD Mobile Heartbeat SDK iOS
PRÉ-REQUISITOS

Matriz de compatibilidade

INCLUSÃO DO OFD MOBILE HEARTBEAT SDK iOS NO PROJETO

Adicionando dependência do OFD Mobile Heartbeat SDK iOS via Cocoapods e AWS S3

Chaves e Credenciais da AWS e do Repositório Podspec

Instalação do Plug-in para baixar o OFD Mobile Heartbeat SDK iOS

Inclusão do OFD Mobile Heartbeat SDK iOS no Podfile

Adicionando dependência do OFD Mobile Heartbeat SDK iOS via Cocoapods com Podspec local

Copiando os Arquivos

Ajustando o Podfile

PRÉ-REQUISITOS
O uso do OFD Mobile Heartbeat SDK iOS exige que o dispositivo possua os seguintes requisitos:

Sistema Operacional iOS 10.3 ou superior.

Para o funcionamento completo do OFD Mobile Heartbeat SDK iOS, é necessário as seguintes permissões:

NSLocationWhenInUseUsageDescription: permissão para usar a localização do dispositivo, usada para combate à fraude;

NSBluetoothAlwaysUsageDescription: permissão para aprimorar identificação do dispositivo para combate à fraude;

NSBluetoothPeripheralUsageDescription: permissão para aprimorar identificação do dispositivo para combate à fraude;

NSContactsUsageDescription: permissão utilizada para detecção e identificação do dispositivo;

NSFaceIDUsageDescription: permissão utilizada para aprimorar a detecção e identificação do dispositivo;

NSCalendarsUsageDescription: permissão utilizada para detecção e identificação do dispositivo;

NSCalendarsFullAccessUsageDescription: permissão utilizada para detecção e identificação do dispositivo.

Observação: Antes da inicialização do OFD Mobile Heartbeat SDK iOS é necessário que as permissões sejam solicitadas ao usuário.

Matriz de compatibilidade
Matriz de compatibilidade do OFD Mobile Heartbeat SDK iOS
iOS mínimo

10+

iOS mínimo para OCR e Face

13+

Vision Technology

Apple Vision

Bitcode Version

12.4

Tamanho do OFD Mobile Heartbeat SDK iOS no .ipa

0,324 MB

INCLUSÃO DO OFD MOBILE HEARTBEAT SDK iOS NO PROJETO
Adicionando dependência do OFD Mobile Heartbeat SDK iOS via Cocoapods e AWS S3
Para que o OFD Mobile Heartbeat SDK iOS possa ser adicionado ao projeto utilizando Cocoapods e a AWS S3, é necessária a configuração dos métodos de autenticação.

Para isso, são necessárias as credenciais para autenticação no repositório podspec e uma para acesso ao binário do OFD Mobile Heartbeat SDK iOS na AWS S3.

Chaves e Credenciais da AWS e do Repositório Podspec
Os binários do OFD Mobile Heartbeat SDK iOS estão disponibilizados na AWS S3, para acessá-los, será disponibilizado um conjunto de chaves de acesso (AWS_ACCESS_KEY e AWS_SECRET_KEY).

Essas chaves de acesso podem ser configuradas no arquivo "$HOME/.aws/credentials".

O pacote com os metadados do OFD Mobile Heartbeat SDK iOS estão hospedados em um repositório Git na AWS, chamado de codecommit.

Para acessá-lo será disponibilizado um usuário e senha, que serão solicitados na primeira vez que o comando pod repo update for executado.

Observação: A região sempre deverá ser us-east-1

Instalação do Plug-in para baixar o OFD Mobile Heartbeat SDK iOS
O comando abaixo irá instalar o plugin cocoapods-s3-download, utilizado para fazer o download do OFD Mobile Heartbeat SDK iOS:

gem install cocoapods-s3-download
Inclusão do OFD Mobile Heartbeat SDK iOS no Podfile
No escopo global do Podfile do seu projeto, é necessário incluir o repositório do OFD Mobile Heartbeat SDK iOS:

source 'https://git-codecommit.us-east-1.amazonaws.com/v1/repos/release-mobile-ios-specs' # OFD Mobile Heartbeat SDK iOS
source 'https://cdn.cocoapods.org' # default
A ordem das URLs importam, assim como a inclusão da linha contendo a URL padrão do cocoapods, pois as demais dependências usarão este repositório.

No target do aplicativo, deverá incluir a dependência do OFD Mobile Heartbeat SDK iOS:

pod 'Heartbeat', 'x.y.z'
Atenção

Recomendamos deixar travada a versão desejada do OFD Mobile Heartbeat SDK iOS

Após a inclusão do OFD Mobile Heartbeat SDK iOS no Podfile, é necessário atualizar os repositórios do Cocoapods:

pod repo update
Atenção

Nesse momento, será necessário utilizar as chaves do Codecommit, enviadas pela Topaz.

E ao finalizar, executar o comando para instalar a dependência adicionada na configuração:

AWS_REGION=us-east-1 AWS_ACCESS_KEY=ACCESSKEY AWS_SECRET_ACCESS_KEY=SECRET_KEY pod install
Atenção

Nesse momento, será necessário utilizar as chaves de acesso à AWS S3, enviadas pela Topaz.

Adicionando dependência do OFD Mobile Heartbeat SDK iOS via Cocoapods com Podspec local
Método recomendado quando não for possível obter o OFD Mobile Heartbeat SDK iOS pelo AWS S3.

Copiando os Arquivos
É importante deixar os arquivos .bz2 e .podspec no mesmo diretório, para isso, é necessário executar os comandos em um terminal:

mkdir -p $PROJECT_DIR/dependencies/Heartbeat
cp Heartbeat.xcframework.tar.bz2 Heartbeat.podspec $PROJECT_DIR/dependencies/Heartbeat/
Ajustando o Podfile
No Podfile do projeto, o pod do Heartbeat deverá indicar o diretório contendo o Heartbeat.podspec

target 'HeartbeatPodExample' do
   pod 'Heartbeat', :podspec => 'dependencies/Heartbeat'
end
Após execução dos passos acima, o projeto poderá ser compilado com o OFD Mobile Heartbeat SDK iOS incluso.

Observação: Caso o projeto utilize Swift, é necessário um passo adicional em que o mesmo deverá ser compilado após a execução do pod install para, em seguida, proseguir com a inclusão do OFD Mobile Heartbeat SDK iOS no projeto.

Acesso via CloudFront (iOS)
Clientes que não têm conexão direta com a internet e usam proxy para acessar a internet podem usar a seguinte URL para acessar o CloudFront, que é um serviço de CDN utilizado pela Topaz para distribuir o SDK iOS.

Para isso, basta apontar o repositório de specs do CocoaPods para a URL abaixo, em vez do repositório S3 padrão:

https://download-ofd.apps.topazevolution.com/ios-cdn-specs
Essa URL serve o índice CDN do CocoaPods com os specs do Heartbeat, OFDCamera e mcrypt2.

Os binários dos frameworks (referenciados nos specs) estão disponíveis em:

https://download-ofd.apps.topazevolution.com/ios-cdn-releases/{versão}/{Framework}.xcframework.tar.bz2
Autenticação
A autenticação obrigatória deve ser feita utilizando as mesmas credenciais do CodeCommit que normalmente já são entregues aos clientes. As credenciais devem ser configuradas no arquivo ~/.netrc:

machine download-ofd.apps.topazevolution.com
  login <usuario-codecommit>
  password <senha-codecommit>
O CocoaPods lê automaticamente esse arquivo ao acessar URLs autenticadas — nenhuma configuração adicional no Podfile é necessária.

Exemplo de verificação de acesso com curl:

curl --netrc https://download-ofd.apps.topazevolution.com/ios-cdn-specs/all_pods.txt

curl --netrc https://download-ofd.apps.topazevolution.com/ios-cdn-releases/{versão}/Heartbeat.xcframework.tar.bz2 -o /dev/null -w "%{http_code}\n"
Configuração do Podfile
O Podfile do aplicativo deve declarar o repositório CDN como source e referenciar os pods normalmente:

source 'https://download-ofd.apps.topazevolution.com/ios-cdn-specs'

platform :ios, '13.0'

target 'NomeDoApp' do
  pod 'Heartbeat', '~> {versão}'
  pod 'OFDCamera', '~> {versão}'   # opcional
end
Nota

mcrypt2 não precisa ser declarado explicitamente — é uma dependência transitiva do Heartbeat e será resolvido automaticamente pelo CocoaPods.

Após configurar o ~/.netrc e o Podfile, executar normalmente:

pod install --repo-update
Adicionando dependência do OFD Mobile Heartbeat SDK iOS manualmente
Caso seja necessário adicionar o OFD Mobile Heartbeat SDK iOS manualmente no projeto, o arquivo “Heartbeat.xcframework” será disponibilizado pela Topaz OFD e deverá ser adicionado no projeto.

Observação: A partir da versão 12.3 do XCode, pacotes com o formato “.framework” deixaram de funcionar, ocasionando problemas na compilação do projeto. Portanto as novas versões do OFD Mobile Heartbeat SDK iOS são distribuidas em um pacote com o formato “.xcframework”. Porém, se necesário, o pacote “.framework” pode ser solicitado.

Nas propriedades do seu projeto, com o target selecionado, vá na seção “General”, procure por “Embedded Binaries” e clique no símbolo “+”. Uma nova janela irá se abrir.

../_images/guia-programador-ios-escolher-sdk.png
Escolhendo o OFD Mobile Heartbeat SDK iOS para ser adicionado ao projeto

Nessa janela, vá em “Add Other” e navegue até o diretório onde o “Heartbeat.xcframework” está. Selecione o arquivo “Heartbeat.xcframework” e clique em “Open”, uma nova janela irá se abrir.

../_images/guia-programador-ios-adicionar-sdk.png
Finalizando a adição do OFD Mobile Heartbeat SDK iOS ao projeto

Nesta nova janela deixe selecionado a opção “Copy items if needed” e clique em “Finish”.

Com isso, o OFD Mobile Heartbeat SDK iOS será adicionado nas sessões “Embedded Binaries” e “Linked Framework and Libraries” e estará pronto para uso.

../_images/guia-programador-ios-heartbeat-adicionado.png
OFD Mobile Heartbeat SDK iOS já incluso no projeto

Retirando arquitetura x86 para publicação na App Store (Somente pacote “.framework”)
Observação: Passo necessário apenas para pacotes “.framework”.

Para que seja possível rodar um aplicativo tanto no simulador quanto em dispositivos físicos a Topaz OFD gerou um único framework contendo ambas as arquiteturas (x86 e ARM), como a Apple não aceita o upload de um app contendo a arquitetura x86, é necessário retirá-la. Para fazer isto, com o target do projeto selecionado, vá até a aba “Build Phases” e no botão “+” clique em “New Run Script Phase” e adicione a seguinte linha de código:

bash "${BUILT_PRODUCTS_DIR}/${FRAMEWORKS_FOLDER_PATH}/Heartbeat.framework/strip-heartbeat.sh"
Como por exemplo, mostrado na imagem a seguir:

../_images/guia-programador-ios-remove-arquitetura-build-phase.png
Adicionado o script para remover arquitetura.

Verificar versão do OFD Mobile Heartbeat no seu projeto
Antes de começar, executar com atenção os passos descritos no Guia do Programador da plataforma para inclusão do OFD Mobile Heartbeat no projeto. Os passos a seguir são usados para verificar se a inclusão foi realizada com sucesso.

O comando abaixo ajuda a determinar se o pod mais recente está disponível para integração:

pod repo update
Exemplo de retorno:

Updating spec repo `git-codecommit-v1-repos-release-mobile-ios-specs`
... outras informações ...
HEAD is now at 5bad18c <VERSAO>
Na linha 3, <VERSAO> indicará o número da versão atualizado no repositório local. Caso este número for:

Maior ou igual a versão pretendida, então seu repositório local está pronto.

Menor que a versão pretendida, por exemplo, 4.5.2.x é uma versão menor que 4.6.1.y, então entre em contato com o suporte técnico da Topaz.

Abra seu Podfile e verifique a versão do pod do Heartbeat

pod 'Heartbeat', '<VERSAO>'
É importante especificar um número exato da versão desejada para controle das atualizações. Por exemplo:

pod 'Heartbeat', '4.6.1.1106112'
INICIALIZAÇÃO DO OFD MOBILE HEARTBEAT SDK iOS
Para utilizar as funcionalidades do OFD Mobile Heartbeat SDK iOS é necessário fazer a inicialização do mesmo.

Método Start
Após a concessão das permissões, a inicialização do OFD Mobile Heartbeat SDK iOS deve ser feita através do método start, juntamente com a inicialização do aplicativo (Para quem usa SceneDelegate a recomendação é implementar a inicialização do HB no método sceneWillEnterForeground:, geralmente disponível após iOS 13. Para apps mais antigos ou que fizeram a opção de usar AppDelegate pode-se utilizar o método applicationDidBecomeActive).

Método:

- (void)start:(NSString *)clientId
    onSuccess:(void (^)(int statusCode))onSuccess
    onFailure:(void (^)(int statusCode))onFailure;
Parâmetros:

clientId: Siga de identificação da instituição, fornecida pela Topaz

onSuccess: Callback para ser chamada ao concluir a inicialização com sucesso

onFailure: Callback para ser chamada quando ocorrer algum erro durante a inicialização

Callback:

onSuccess:

statusCode: uso interno da Topaz

onFailure:

2003: Problemas na conexão com a internet ou sigla errada no parâmetro clientId

2007: Sigla de identificação vazia

outros: uso interno da Topaz. Estes códigos internos podem ser incluídos em uma telemetria do app para acompanhamento. Continuar chamando o start normalmente. Na ocorrência destes códigos de uso interno em ambiente de produção, ao abrir uma solicitação para Topaz, informar alguns casos acompanhados de data e hora da ocorrência, dados de usuário e id de sessão ou transação.

Retorno:

Não possui retorno

Observação: Os callbacks de sucesso e falha são chamados através de tarefa adicionada na fila da Thread Principal usando o framework Dispatch. Ao receber a chamada o callback deve despachar para outras filas conforme necessário.

Exemplo em Objective-C:

Exemplo de inicialização do OFD Mobile Heartbeat SDK iOS - Objective C
 #import <Heartbeat/Heartbeat.h>

 - (void)viewDidLoad {
   [Heartbeat start:@"sigla-instituição" onSuccess:^(int statusCode) {
      // OFD Mobile Heartbeat SDK iOS inicializado com sucesso
   } onFailure:^(int statusCode) {
      // Ocorreu uma falha ao inicializar o OFD Mobile Heartbeat SDK iOS
   }];
 }
Exemplo em Swift:

Exemplo de inicialização do OFD Mobile Heartbeat SDK iOS - Swift
 import Heartbeat

 override func viewDidLoad() {
   Heartbeat.start("sigla-instituição", onSuccess: { (statusCode: Int32) in
      // OFD Mobile Heartbeat SDK iOS inicializado com sucesso
   }, onFailure: { (statusCode: Int32) in
      // Ocorreu uma falha ao inicializar o OFD Mobile Heartbeat SDK iOS
   })
 }
EVENTO DE IDENTIFICAÇÃO DE USUÁRIO
Método sendEvent
O evento de identificação de usuário deve ser enviado toda vez que o usuário tentar fazer login na aplicação, sendo bem sucedido ou não, ou durante o onboarding do cliente, utilizando a classe Event do OFD Mobile Heartbeat SDK iOS.

Ao utilizar a Risk Score API, é obrigatório que esse evento no OFD Mobile Heartbeat SDK iOS seja chamado antes do evento de identificação de usuário, informado através da Risk Score API no backend.

Parâmetro:

SESSION_ID: SHA-256 da sessão do usuário.

Exemplo de uso do evento de identificação de usuário em Objective C:

Exemplo de evento de identificação de usuário - Objective C
 #import <Heartbeat/Heartbeat.h>

 Event *event = [Event new];
 [event addParameter:@"SESSION_ID" value:@"46F7764"];
 [event sendEvent];
Exemplo de uso do evento de identificação de usuário em Swift:

Exemplo de evento de identificação de usuário - Swift
 import Heartbeat

 let event = Event()
 event.addParameter("SESSION_ID", value: "46F7764")
 event.send()
Observações:

Caso seja utilizado a Risk Score API o SESSION_ID é obrigatório e deve corresponder com o informado através da Risk Score API no backend. Para mais informações, consultar o Guia do Programador do Analytics Risk Score.

O parâmetro acima tem que estar em caixa alta.

SyncID
O SyncID é uma informação gerada pelo OFD Mobile Heartbeat SDK iOS que deve ser enviada no backend através da Risk Score API no campo “sync_id”

Método getSyncID
Esse método retorna um SyncID, informação que deve ser utilizada via Risk Score API, para vincular o dispositivo à transação feita no backend.

Esse método é uma operação offline, não acrescentando demora significativa nos fluxos onde é chamado.

Nota

Realizar a chamada à este método apenas após o callback do método Start.

Método:

+ (NSString *)getSyncID;
Retorno:

Exemplo do retorno em formato de NSString do syncID:

"MV98XzBffF9BV0t4T3pCVFFSdkZBMG1yekFXRDVkRDhKdUF6bXhFUm9vQzU0cVlVUjJqbkd4YzBEaDdORDE2YTZzSnhvazR1VFFEazFJaFVPVWtwYUFOeTZZb09wTExCaFp6TWhBS1lRRzBzVEc5Vyt6eVUrSi9GNGxNSHYzMmxqTUozMCttbUM5RFZlUkNRUGNoUU0xUnMraGlsNnhjMG0zVEhGYkJSY0NUaDdTSXNwd3pyZSt5N2Z6RnUrUnlFbGFybm9aNEdETVNsVHY3VGtFU2VxSTFwRHJOWEhRPT0="
Exemplo:

Uso do método getSyncID
#import <Heartbeat/Heartbeat.h>

NSString *syncID = [Heartbeat getSyncID];
Uso do método getSyncID
import Heartbeat

let syncID = Heartbeat.getSyncID()
OFD Localização Confiável
A Localização Confiável é uma tecnologia OFD Topaz para definir locais de confiança onde o usuário se sente seguro para realizar transações financeiras.

No canal móvel, disponibilizamos um novo método para obter a geolocalização em formato compatível com a tecnologia OFD Localização Confiável na Risk Score API.

O aplicativo deve obter a geolocalização e enviar para seu backend para então ser enviado para a Risk Score API.

Nota

Os dados de geolocalização do dispositivo devem ser enviados para a Risk Score API exclusivamente pelo backend conectado a Risk Score API

Para aprender mais sobre as operações possíveis para a tecnologia OFD Localização Confiável consulte o guia do programador na página Risk Score API.

No aplicativo, o fluxo de cadastramento de localização confiável pode ser implementado da seguinte forma:

Obter a geolocalização do dispositivo utilizando o novo método Heartbeat.getCurrentLocation()

Exibir as informações para obter consentimento do usuário utilizando os campos wifi ou location

Enviar o campo location_data retornado do novo método para o backend da instituição conectado a Risk Score API

O backend conectado à Risk Score API deve enviar uma operação de cadastramento de localização confiável

Método getCurrentLocation
Nota

Realizar a chamada à este método apenas após o callback do método Start.

É necessário enviar as informações do campo location_data através do backend para a Risk Score API.

Atenção

Este método requer ativação prévia do serviço de localização do dispositivo (Android ou iOS). Informações sobre o WiFI também dependem deste serviço. Consulte a seção Acesso às Informações de WI-FI do iOS deste guia.

Método:

+ (void)getCurrentLocation:(NSDictionary *)params onSuccess:(void (^)(NSString *))onSuccess onFailure:(void (^)(int))onFailure
Parâmetros:

Nota

Todos os parâmetros descritos são obrigatórios.

params: NSDictionary que é subdividido em 2 parâmetros:

timeout: Timeout em milissegundos maior que 5000 para a espera das informações, caso o timeout seja atingido será retornado um código de erro específico no callback de erro.

dataOption: Valor inteiro para o tipo de informação a ser obtida, onde:

1: Todas (Wifi + GPS)

2: Wifi

3: GPS

onSuccess(NSString *json);
Callback chamado em caso de sucesso, com uma string em formato Json com os dados solicitados.

onFailure(int statusCode);
Callback chamado em caso de erro, com um statusCode indicando o erro.

Callbacks:

Nota

As respostas dos callbacks são executados na thread principal

Callback onSuccess:

{
    "location": {
        "latitude": "37.421998333333335",
        "longitude": "-122.084",
        "accuracy": "5.0",
        "timestamp": "1684269749307"
    },
    "wifi": {
        "ssid": "\"iOSWifi\"",
        "bssid": "00:13:10:85:fe:01"
    },
    "location_data": "MV98XzBffF9KbFpMQTk4WjhmMXB2TTBjU05iajZQWXREUXl4bGVadU9rUXJleEFGYVh1OUZZc3JOc2c2UTcvZDBlSzB5eUFJUEljMko2YVdMT2RNZEF0UEJQS3Irei8yU1A0bFhFQnhRVWJKcVdrdFRuQ3hXRks2aERwak1GcUhzSUV3SW42Y1BlYWlBUHkxRExWQkZvbmMzd0pkV1VoSGhUTWJzSndiZGRQczlmNVZ2ZkxwZm5IT1F5dUovT04zdVpkQ2pwWEdTTFY4OTFXZm8zSEZCbmFpNld1TnJpSnFTVTRYRzdQTllGWjRlaHRIak5mSGpLTDVibE9NRjFQNHdZZ00rN2NtVWcwRElXOUpDNHJBalo3dWt4VE41MWo0Vmx5V2V3bjA2SUV1MnAwRWt0VzhpbXFRUkMrODdlYW04Zmg0R2FxNmZsTStKZkNuUDlsNjJqTlZOa2pWSjMwWFIybVRmeTYvZS80ZGhBakpBbWVEUmFzaDdvZXZ6WjZ1QWJyeGxWOTRUd2N6UDJHaXhlZW1NOWZ3KzJiQXFwTUc5dHV6UW1pKzBsSGlVT1JEQUxOOGNKQkRMNGY0azRBRGdCaTZUVGhZQlJwNnYrcm9mN0Z0TU00Ulh4R1BjZz09"
}
Callback onFailure:

StatusCode possíveis no callback onFailure
Código

Descrição

100

Configuração do Heartbeat não encontrada, chamar o método start do Heartbeat antes

101

Feature desabilitada, contactar o suporte da Topaz OFD

102

Parâmetros inválidos

103

Sem permissão de GPS

105

Tempo máximo de timeout atingido

106

Serviço de localização do dispositivo está desativado

107

Processamento em andamento através de outra chamada

Nota

Recomenda-se que após solicitado informação de GPS + WiFi ou apenas GPS, se retornado 105, solicite-se novamente apenas a informação de WiFi.

Atenção

A partir do iOS 14 é possível conceder a permissão de localização de forma precisa e não precisa. Caso seja concedido a permissão não precisa de localização, ao requisitar informações de GPS ou Wifi, o código de erro 103 será retornado.

Exemplo em Objective-C

Uso do método getCurrentLocation.
#import <Heartbeat/Heartbeat.h>

private void getCurrentLocation() {
   NSMutableDictionary *params = [NSMutableDictionary new];
   [params setObject:@"20000" forKey:@"timout"];
   [params setObject:@"1" forKey:@"dataOption"];

   [Heartbeat getCurrentLocation:params onSuccess: ^(NSString *json) {
     NSLog(@"CALLBACK ONSUCCESS GETCURRENTLOCATION onSuccess:  %@", json);
   } onFailure: ^(int statusCode) {
     NSLog(@"CALLBACK FAILURE GETCURRENTLOCATION onFailure: %f", statusCode);
   }];
}
Exemplo em Swift

Uso do método getCurrentLocation.
import Heartbeat

func getCurrentLocation() {
   var params = [String: Any]()
   params["timeout"] = "20000"
   params["dataOption"] = "1"

   Heartbeat.getCurrentLocation(params, onSuccess: { json in
     NSLog("CALLBACK ONSUCCESS GETCURRENTLOCATION onSuccess: %@", json ?? "")
   }, onFailure: { statusCode in
     NSLog("CALLBACK FAILURE GETCURRENTLOCATION onFailure: %d", statusCode)
   })
}
Chamada Segura
A proteção Chamada Segura é um serviço gerenciado de verificação de chamadas da API do OFD Mobile Heartbeat disponível a partir do iOS 10. Ao receber uma chamada o SDK irá tratá-la conforme a jornada escolhida:

Jornada Simplificada: Implementamos os casos de uso onde o cliente pode personalizar as mensagens e telas que serão exibidas no dispositivo.

Jornada da Instituição: Através dos métodos do Chamada Segura, entregamos informações sobre a chamada para que a instituição implemente suas próprias jornadas.

Importante

No iOS nem todos os casos de uso implementados no Android estão diponíveis, devido as restrições da API do sistema e políticas de privacidade do usuário.

Para utilizar o módulo Chamada Segura, é necessário realizar a formalização e validação prévia junto ao time comercial. Entre em contato através do e-mail gestoresofd@topazevolution.com para mais informações e garantir a correta ativação.

Devido às restrições do iOS, a partir da versão 4.26.0, as interações da Chamada Segura com o usuário ocorrem apenas quando o app está sendo apresentado na tela.

A partir da versão 4.27.0, o Heartbeat pode ser configurado para considerar uma chamada em andamento apenas após o usuário atendê-la, ao invés de a partir do momento em que o telefone toca. Solicite essa configuração ao time de implantação ou suporte da Topaz.

Método getCallStatus
O método getCallStatus pode auxiliar a tomada de decisão ao informar o status atual, se há uma chamada em andamento ou não.

Esse método é síncrono, não adicionando tempo significativo no fluxo onde for chamado.


Objective-C
Utilização do método getCallStatus em Objective-C
SecureCall *secureCall = [[[SecureCallBuilder alloc] initWithContext:self] build];
int status = [secureCall getCallStatus];

Swift
Status possíveis para o getCallStatus
Status

Descrição

1

Há chamada em andamento.

0

Não há chamada em andamento.

-1

Erro inesperado, não foi possível determinar.

Jornada Simplificada
A jornada simplificada é um fluxo simples para permitir que o usuário ative o serviço Chamada Segura, ele apresenta uma tela para visualizar os benefícios da proteção e solicita as permissões requeridas. Após ativação, telas e notificações ajudam o usuário com mensagens de orientação para prevenção de fraudes financeiras.

Ativação
Para iniciar o fluxo Jornada Simplificada, é necessário chamar o método build da classe SecureCallBuilder em uma ViewController no método viewDidLoad nativo do iOS.

É possível personalizar elementos do conteúdo exibido na jornada simplificada para harmonizar com o estilo do aplicativo, entre em contato com o time de implantação ou suporte da Topaz para obter mais detalhes.

../_images/ios_chamada_segura_inicio_pt.png

Objective-c
Iniciar a jornada
#import <Hearbteat/Heartbeat.h>

@implementation MyViewController
- (void)viewDidLoad {
    [super viewDidLoad];

    SecureCallCallback callback = ^(NSInteger resultCode) {
        if (resultCode == 1001) {
            // Enviar ativação do Chamada Segura através do backend do app na Risk Score API
        }
    };

    SecureCall *secureCall = [[[[[[[[[SecureCallBuilder alloc] initWithContext:self]
                                withLanguage:@"pt"]
                               withBroadcast:NO] // opcional, se não for necessário enviar broadcast para o app
                              withAlertScreen:NO] // opcional, se não for necessário exibir alerta de tela
                             withNotification:NO] // opcional, se não for necessário enviar notificação para o app
                            withUserInteraction:NO] // opcional para desligar todas as interações com o usuário (tem precedência sobre os outros métodos)
                           withCallback:callback]
                          build];
    [secureCall present];
}
@end

Swift
A classe SecureCallBuilder recebe sete parâmetros no builder:

Language: para definir o idioma da tela pode receber valores “pt” (Português), “en” (Inglês), “es” (Espanhol). Caso não seja informado, será utilizado “pt”

Broadcast (opcional): recebe um boleano como argumento. Se o argumento para este método for falso, nenhum broadcast será enviado. Esta opção está disponível à partir da versão 4.26.0.

AlertScreen (opcional): recebe um boleano como argumento. Se o argumento para este método for falso, nenhum alerta de tela será enviado. Esta opção está disponível à partir da versão 4.26.0.

Notification (opcional): recebe um boleano como argumento. Se o argumento para este método for falso, nenhuma notificação será enviada. Esta opção está disponível à partir da versão 4.26.0.

UserInteraction (opcional): recebe um booleano como argumento. Este método tem precedência sobre os outros e por isso se o argumento para este método for falso, nenhum broadcast para o app, alerta de tela ou notificação é enviado pelo SDK. Recomendamos usar este método, quando houver um requisito explícito no projeto do app para impedir todas estas interações. A funcionalidade Chamada Segura não é desligada. Esta opção está disponível à partir da versão 4.26.0.

Callback: implementação da callback SecureCallCallback, ela recebe os códigos de status abaixo:

1000 - finalizado sem nenhuma ação.

1001 - usuário ativou a proteção.

1002 - usuário ativou a proteção anteriormente.

2000 - usuário desativou a proteção.

2001 - jornada simplificada não habilitada na configuração do Heartbeat.

2002 - Heartbeat não foi iniciado.

2003 - idioma passado no builder não suportado.

2004 - contexto inválido passado na inicialização da classe SecureCallBuilder

Após apertar o botão Ativar Proteção é necessário aceitar a permissão de envio de notificações solicitada, através do botão Permitir, veja o exemplo abaixo.

../_images/ios_permissao_chamada_segura_pt.png
Após ativar a Chamada Segura é possível desligar a proteção pressionando a botão Desativar Proteção, veja no exemplo abaixo:

../_images/ios_chamada_segura_desativada_pt.png
Nota

Caso a instituição deseje realizar integração com sua Central de Atendimento, para informar ao usuário quando ele está recebendo uma ligação legítima, descrita no caso de uso Número Verificado, é necessário realizar integração também com a Risk Score API. Ver mais.

Casos de Uso
Os seguintes casos de uso podem ocorrer durante o tratamento de uma chamada. As notificações e telas dos textos abaixo podem ser customizados, entre em contato com o time de implantação ou suporte da Topaz para obter mais detalhes.

Número Verificado
Quando a instituição envia a operação via Risk Score API informando que está em contato com o usuário do dispositivo, o Heartbeat pode gerar a confirmação positiva:

../_images/secure-call-verified-screen1.png
../_images/ios-secure-call-verified-notification.png
Ligação Desconhecida
Ligações recebidas ou originadas pelo dispositivo durante o uso do aplicativo podem gerar alertas para previnir o usuário.

../_images/secure-call-unknown-screen1.png
../_images/ios-secure-call-unknown-notification.png
Jornada da Instituição
Caso a instituição deseje implementar sua própria jornada com o módulo Chamada Segura, poderá fazê-lo conforme descrito nesta seção.

Métodos da classe SecureCall
Os métodos da classe SecureCall são declarados no header <Heartbeat/Heartbeat.h> e estão acessíveis para o Swift através do módulo Heartbeat:


Objective-c
Método enable da classe SecureCall
[SecureCall enable:^(NSInteger resultCode) {
    // resultCode
}];

Swift
O método estático enable é usado para ligar a proteção e recebe como argumento uma callback SecureCallCallback que recebe em statusCode conforme descrito abaixo:

1001 - proteção está ligada.

1002 - proteção ligada anteriormente.

2001 - serviço Chamada Segura desligada na configuração do SDK.

2002 - SDK não foi inicializado.


Objective-c
Método disable da classe SecureCall
[SecureCall disable:^(NSInteger resultCode) {
    // resultCode
}];

Swift
O método estático disable é usado para desligar a proteção e recebe como argumento uma callback SecureCallCallback que recebe em statusCode conforme descrito abaixo:

2000 - proteção está desligada.


Objective-c
Método status da classe SecureCall
SecureCall *secureCall = [[[SecureCallBuilder alloc] initWithContext:self] build];
int status = [secureCall getCallStatus];

Swift
O método estático status é usado para obter o estado atual da proteção e recebe como argumento uma callback SecureCallCallback que recebe em statusCode conforme descrito abaixo:

1001 - proteção está ligada.

2000 - proteção desligada por falta de permissões requeridas

2001 - serviço Chamada Segura desligada na configuração do SDK.

2002 - SDK não foi inicializado.

Solicitação de Permissão

Objective-c
Solicitar permissões para o Chamada Segura
- (void)permissionsGranted {
    UNUserNotificationCenter *center = [UNUserNotificationCenter currentNotificationCenter];
    [center requestAuthorizationWithOptions:(UNAuthorizationOptionAlert | UNAuthorizationOptionSound | UNAuthorizationOptionBadge)
                          completionHandler:^(BOOL granted, NSError * _Nullable error) {
        if (granted) {
            // Chamar o [SecureCall enable]
        } else {
            // Tratar o caso em que a permissão não foi concedida
        }
     }];
}

Swift
Ativação
O usuário pode ativar a Chamada Segura ao chamar o método enable da classe SecureCall conforme exemplo abaixo:


Objective-c
Ativar a chamada segura
#import <Heartbeat/Heartbeat.h>

@implementation MyViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [SecureCall enable:^(NSInteger statusCode) {
        if statusCode == 1001 {
            // Enviar ativação do Chamada Segura através do backend do app na Risk Score API
        }
    }];
}

Swift
Desativar a Chamada Segura
Para desativar a proteção chamar o método disable da classe SecureCall conforme exemplo abaixo:


Objective-c
Desativar a Chamada Segura
#import <Heartbeat/Heartbeat.h>

@implementation MyViewController

- (void)viewDidLoad {
    [super viewDidLoad];

    [SecureCall disable:^(NSInteger statusCode) {
        // Chamar os handlers para cada statusCode
        if (statusCode == 2000) {
            // Handler para Chamada Segura desativada
        }
    }];
}

Swift
Status da Chamada Segura
O seguinte exemplo mostra como verificar o status atual da Chamada Segura.


Objective-c
Status da Chamada Segura
#import <Heartbeat/Heartbeat.h>

@implementation MyViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [SecureCall status:^(NSInteger statusCode) {
        // Tratar cada statusCode adequadamente
        if (statusCode == 1001) {
            // A Chamada Segura está ativada, atualizar os elementos na tela
        } else if (statusCode >= 2000 && statusCode <= 2002 ) {
            // A Chamada Segura está desativada, atualizar os elementos na tela
        }
    }];
}

Swift
Broadcast da Chamada
Após as tratativas para a chamada recebida ou originada o SDK envia um broadcast, assim o aplicativo pode tomar qualquer ação adequada, por exemplo, alertar o usuário, modificar a jornada e etc. Veja abaixo um exemplo para receber as mensagens:


Objective-c
Implementar o HeartbeatCallReceiver
@implementation MyViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    NSString *receiverName = @"HeartbeatCallReceiver";
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(handleHeartbeatCallReceiver:) name:receiverName object:nil];
}

- (void)handleHeartbeatCallReceiver:(NSNotification *)notification {
    NSDictionary *info = notification.userInfo;
    NSString *reason = info[@"REASON"];

    if ([reason isEqualToString:@"tc"]) {
        // Chamar o handler para caso de uso da Chamada Confiável
    } else if ([reason isEqualToString:@"uc"]){
        // Chamar o handler para caso de uso da Chamada Desconhecida
    }
}

Swift
Nota

É necessário que o aplicativo solicite a permissão de envio de notificações para que consiga exibir as notificações.

Controlar as Interações com o Usuário
Para controlar as interações da Chamada Segura com o usuário, é possível utilizar os métodos do builder da classe SecureCall. Esses métodos permitem desativar as interações como notificações e alertas de tela. É importante ressaltar que o método withUserInteraction(false) tem precedência sobre os outros métodos, ou seja, se for utilizado, todas as interações com o usuário serão desativadas.

Nota

Use esta API sob orientação do time de implantação da Topaz OFD. A configuração do Heartbeat contém os comportamentos adequados para o funcionamento da Chamada Segura. Esta API pode ser útil, por exemplo, em casos de migração da Jornada Simplificada para a Jornada da Instituição, mas você deseja desativar algumas dessas interações durante a transição.


Objective-c
Iniciar a jornada
#import <Hearbteat/Heartbeat.h>

@implementation MyViewController
- (void)viewDidLoad {
    [super viewDidLoad];

    SecureCall *secureCall = [[[[[[[SecureCallBuilder alloc] initWithContext:self]
                               withBroadcast:NO] // opcional, se não for necessário enviar broadcast para o app
                              withAlertScreen:NO] // opcional, se não for necessário exibir alerta de tela
                             withNotification:NO] // opcional, se não for necessário enviar notificação para o app
                            withUserInteraction:NO] // opcional para desligar todas as interações com o usuário (tem precedência sobre os outros métodos)
                          build]; // as preferências serão aplicadas imediatamente após a chamada deste método.
}
@end

Swift
Acesso às informações de WI-FI do iOS
PRÉ-REQUISITOS
O OFD Mobile Heartbeat SDK iOS iOS já incluso no aplicativo e pronto para uso como monstrado nos tópicos anteriores.

ATIVANDO ENTITLEMENT OU CAPABILITY
Para o funcionamento completo do OFD Mobile Heartbeat SDK iOS é necessário ativarmos o entitlement:

com.apple.developer.networking.wifi-info

Que também pode ser visto como uma capability:

Access WiFi Information

Precisamos acessar a conta responsável pelo aplicativo no site Apple Developer e através do menu lateral esquerdo, acessar a opção Certificates, IDs & Profiles. Para ter acesso ao menu com os certificates e profiles, é necessário que o usuário da conta tenha a permissão “Access to Cloud Managed Distribution Certificate”, um subitem de “Access to Certificates, identifiers & Profiles” da gestão de usuários da conta Apple.

../_images/apendice-acesso-a-informacoes-de-wifi-menu-lateral.png
Na nova tela que se abriu, acessaremos através do menu lateral esquerdo a opção Identifiers:

../_images/apendice-acesso-a-informacoes-de-wifi-menu-identifiers.png
Na tela que lista os Identifiers, deveremos selecionar o aplicativo que está implementando o OFD Mobile Heartbeat SDK iOS.

Após isso, conseguiremos visualizar as informações relacionadas ao aplicativo, como o Bundle ID, Platform e também os Capabilities habilitados para esse aplicativo, como mostrado na imagem à seguir:

../_images/apendice-acesso-a-informacoes-de-wifi-pagina-capabilities-desabilitado.png
Para habilitar o acesso à informações de WiFi, devemos marcar o checkbox responsável pelo Access WiFi Information e seguir os passos mostrados em tela. No final, a capability ficará habilitada:

../_images/apendice-acesso-a-informacoes-de-wifi-pagina-capabilities-habilitado.png
CONFIGURAÇÃO DO PROJETO
Para configurar o entitlement no aplicativo, devemos abrir o projeto no xcode e o selecionar no menu esquerdo (1), selecionar o target do aplicativo (2) e por fim, clicar na aba Signing & Capabilities (3).

../_images/apendice-acesso-a-informacoes-de-wifi-configuração-projeto-1.png
Prosseguiremos clicando no botão + Capability (4) e selecionando a capability Access WiFi Information (5)

../_images/apendice-acesso-a-informacoes-de-wifi-configuração-projeto-2.png
No final, podemos observar que foi criado um novo arquivo no projeto com final .entitlement e a capability também será exibida conforme na imagem:

../_images/apendice-acesso-a-informacoes-de-wifi-configuração-projeto-3.png
FEATURES E PERMISSÕES
Relação de features e permissões necessárias
Permissão

Feature

Descrição

NSLocationWhenInUseUsageDescription

Location

Obtem informações de localização do dispositivo para melhorar a heurística do Risk Score

NSBluetoothAlwaysUsageDescription e NSBluetoothPeripheralUsageDescription

Bluetooth Info

Obtem informações de devices pareados com o dispositivo para melhorar a heurística do Risk Score

NSContactsUsageDescription

Priority Info

Informações anônimas coletadas na lista de contatos para melhorar a heurística do Risk Score

NSCalendarsUsageDescription

Calendar Info

Informações anônimas coletadas no calendário para melhorar a heurística do Risk Score

NSFaceIDUsageDescription

Biometry Info

Informações anônimas coletadas sobre a biometria do dispositivo para melhorar a heurística do Risk Score

Importante

Caso alguma dessas permissões não sejam concedidas, a feature poderá ter seu pleno funcionamento afetado, fazendo com que não funcione como esperado.

Nota

No iOS, temos a limitação de não conseguirmos monitorar os SMS e Notificações

RESOLUÇÃO DE PROBLEMAS
Os eventos não estão sendo enviados, o que devo fazer?

Verifique se o método start está sendo chamado na inicialização da aplicação

Verifique se a sigla que está sendo passada para o método start do OFD Mobile Heartbeat SDK iOS está correta

Verifique se o dispositivo tem conexão ativa com a internet

Os eventos são enviados, mas o campo de localização está vazio. O que devo fazer?

Verifique se as permissões foram solicitadas ao usuário e concedidas

Verifique se o GPS está habilitado no dispositivo

O build do meu projeto está falhando com: “Building for iOS, but the linked and embedded framework ‘Heartbeat.framework’ was built for iOS + iOS Simulator.”, o que devo fazer?

A partir do XCode 12.3 é necessário utilizar o pacote .xcframework do OFD Mobile Heartbeat SDK iOS.

Todas as permissões são necessárias?

Não, mas são de extrema importância para que o OFD Mobile Heartbeat SDK iOS opere com plena excelência.

Pod Install está exibindo o erro “Unsupported download strategy”, o que devo fazer?

Este problema pode ser causado pela falta do Plug-in para baixar o OFD Mobile Heartbeat SDK iOS, veja como instalar no item “Instalação do Plug-in para baixar o OFD Mobile Heartbeat SDK iOS”.

Se persistir, o problema pode estar sendo causado pelo programa ‘/usr/bin/gem’ que é parte do Ruby já instalado no macOS. Para resolver, basta escolher qual versão de Ruby será usada e ajustar a variável PATH:

PATH=/opt/homebrew/Cellar/ruby/3.1.0/bin:$PATH
gem install cocoapods cocoapods-s3-download
pod install
Pod Install está exibindo o código de erro 403, o que devo fazer?

Para resolver problemas de acesso ao repositório AWS CodeCommit para download do pod do Heartbeat via Cocoapods, siga os passos:

Apagar a senha salva no chaveiro do MacOS, em relação ao repositório do AWS CodeCommit. No terminal execute o comando:

security delete-internet-password -s git-codecommit.us-east-1.amazonaws.com
Remover o repositório do Cocoapods:

# Exibe a lista dos repositórios do AWS CodeCommit
pod repo list | grep "git-codecommit-v1-repos-release-mobile-ios-specs"

# Apagar repositórios, inclusive aqueles com sufixo no nome (ex. -1, -2 e etc)
pod repo remove git-codecommit-v1-repos-release-mobile-ios-specs
pod repo remove git-codecommit-v1-repos-release-mobile-ios-specs-1 # se houver

# Antes de rodar o build do projeto
pod repo update
Se mesmo assim não funcionar, execute o comando abaixo e nos envie o log para análise

pod install --verbose
Erro ao exibir tela após recebimento de Broadcast no Chamada Segura

Para resolver o problema “Attempt to present <MyViewController…> whose view is not in the window hierarchy.”:

Obtenha a view controller que está no topo da sua pilha (topmost) e utilize-a para exibir a view controller desejada.

- (UIViewController *)getCurrentViewController {
    UIViewController *rootViewController = [UIApplication sharedApplication].keyWindow.rootViewController;
    return [self getVisibleViewControllerFrom:rootViewController];
}

- (UIViewController *)getVisibleViewControllerFrom:(UIViewController *)viewController {
    if ([viewController isKindOfClass:[UINavigationController class]]) {
        UINavigationController *navController = (UINavigationController *)viewController;
        return [self getVisibleViewControllerFrom:navController.visibleViewController];
    } else if ([viewController isKindOfClass:[UITabBarController class]]) {
        UITabBarController *tabBarController = (UITabBarController *)viewController;
        return [self getVisibleViewControllerFrom:tabBarController.selectedViewController];
    } else if (viewController.presentedViewController) {
        return [self getVisibleViewControllerFrom:viewController.presentedViewController];
    } else {
        return viewController;
    }
}
anterior

Guias iOS

próximo

OFDCamera - Face e OCR - Complemento iOS

By OFD Mobile
© Copyright 2024, Topaz OFD Mobile.
