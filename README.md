Nota de Fechamento — WO [preencher número]

Sistema: SIFPP-micro (sifpp-ms)
Ambiente: DES
Namespace: sifpp-des

Descrição do problema:
Falha de comunicação ao consumir a API de boleto (/cobranca/boletos/v1/incluiBoleto) e ao recuperar o PDF do boleto gerado, com erro de proxy 502 Proxy Error (Forefront TMG denied the specified Uniform Resource Locator) / Tunnel failed, got: 502, mesmo os destinos sendo hosts/IPs internos (api.des.caixa, 10.116.82.66), dentro do escopo do NO_PROXY configurado no ambiente.

Causa raiz:
Identificados dois pontos distintos no código da aplicação onde clientes HTTP eram instanciados sem configuração explícita de proxy, herdando por padrão o proxy da JVM (https.proxyHost=proxydes.caixa) sem respeitar corretamente a lista de exceções (nonProxyHosts/NO_PROXY):

REST Client do Quarkus (quarkus.rest-client."boleto.api") — ao consumir a API de boleto, o client não reconhecia o host api.des.caixa como interno, roteando a chamada pelo proxy corporativo, que bloqueava a requisição no Forefront TMG.
HttpClient nativo do Java (BoletoResource.createUnsafeClient()) — utilizado para baixar o PDF do boleto via IP interno (10.116.82.66), com o mesmo comportamento: o parser de nonProxyHosts da JVM não interpreta corretamente notação CIDR (10.0.0.0/8), fazendo com que o IP não fosse reconhecido como exceção e a chamada fosse roteada pelo proxy, resultando em bloqueio.

Correções aplicadas:

No application.properties, adicionada a diretiva quarkus.rest-client."boleto.api".proxy-address=none, forçando esse client a nunca utilizar proxy.
No método createUnsafeClient() (BoletoResource.java), adicionada a configuração .proxy(HttpClient.Builder.NO_PROXY) no builder do HttpClient, com o mesmo objetivo.

Validação:
Após build e deploy das correções, o fluxo completo de /boletos/incluir foi testado com sucesso em DES, incluindo a geração do boleto e a conversão do PDF para base64, sem qualquer erro de proxy ou comunicação.

Status: Resolvido.
