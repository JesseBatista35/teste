Segue o texto pronto para resposta na W.O. Ajustei os campos entre colchetes onde faltam dados específicos que só vocês têm (nome exato do jar, caminho de origem, número do provider) — preencha antes de enviar.

Assunto: Solicitação de ajuste de imagem/build para integração JCA/JCE do HSM Dinamo - siabm-autenticacao-api
Prezados,
Solicitamos o ajuste abaixo para viabilizar em definitivo a integração JCA/JCE do HSM (biblioteca Dinamo, versão 4.10.2) na aplicação siabm-autenticacao-api, atualmente validada em ambiente de desenvolvimento.
De acordo com o manual de instalação do fabricante, a biblioteca JCA/JCE do HSM deve ser disponibilizada no diretório de extensões do JRE utilizado pela aplicação (lib/ext), de forma que o provedor criptográfico seja reconhecido pela JVM.
O ambiente atual utiliza Java 8 (Oracle Corporation, build 1.8.0_301), e o provedor já está referenciado via parâmetro de inicialização:
-Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND
Solicitamos que o processo de build/imagem (S2I) da aplicação seja ajustado para:

Incluir o arquivo [nome_do_jar_da_lib_hsm.jar] no diretório [/usr/java/latest/lib/ext ou caminho equivalente do JRE da imagem base];
Garantir que essa inclusão seja persistida em toda nova build de imagem, e não apenas no container em execução, uma vez que ajustes manuais realizados diretamente nos pods não sobrevivem a redeploys, rollouts ou rebuilds;
Manter o parâmetro -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND (ou o número de provider apropriado) no JAVA_OPTS da aplicação, conforme já validado em ambiente de desenvolvimento.

O ajuste foi testado localmente e a aplicação subiu sem erros relacionados ao HSM, com os beans HsmServiceImpl e JcaCryptoService corretamente inicializados. Ficamos à disposição para fornecer o arquivo da biblioteca e demais informações complementares necessárias para a execução do ajuste.
Atenciosamente,
Jessé Batista
