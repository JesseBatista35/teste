Jesse Mouta Pereira Batista
Resumo do dia 17/11: Migração JBoss 7.4 (SIFEC/SICCR), DES   Avanços de hoje   CCR (ccr-api, 401): causa identificada e ajuste aplicado, conforme alinhado com Alessandro, Paulo e Gustavo. Removemos a…
MANTER DOCUMENTO 2.2.7: qual build subir (b88, b91 ou b94)? vamos subir o último
 
BNDES 1.0.4.2: link do pacote (no domain só tem a 1.1.0). vamos subir a versão que tem. Vou procurar o time responsável
 
ARC: existe build para o 7.4? No domain só tem siarc_EAP6.ear. Subir esse mesmo
 
Jesse Mouta Pereira Batista, boa tarde! Conseguimos subir alguns dos pacotes que estavam na fila?
 
Gustavo Duarte Lepesteur da Costa
Jesse Mouta Pereira Batista, boa tarde! Conseguimos subir alguns dos pacotes que estavam na fila?
Gustavo Duarte Lepesteur da Costa, boa tarde estamos subindo aqui agora, em breve envio o relatorio. 
 
Gustavo Duarte Lepesteur da Costa
 
Durante a janela de implantação foram identificadas falhas nos deploys das aplicações SIARC e SICCR-DOCUMENTOS2, impedindo a conclusão das publicações.
SIARC (siarc_EAP6.ear)

A aplicação apresentou incompatibilidade relacionada às dependências JSF requeridas para sua inicialização no ambiente atual. Como consequência, o deploy foi revertido automaticamente pelo servidor.
Ação da fábrica: revisar as dependências/frameworks utilizados pela aplicação, validar a compatibilidade com a plataforma atual e disponibilizar nova versão do pacote após os ajustes necessários.
SICCR-DOCUMENTOS2 (SIFEC-MANTERDOCUMENTO-2.2.7-b94.ear)

A aplicação apresentou incompatibilidade com a versão do Hibernate utilizada na plataforma, impedindo a inicialização da camada de persistência e ocasionando o rollback do deploy.
Ação da fábrica: revisar e adequar as consultas JPA/Hibernate da aplicação para compatibilidade com a versão atualmente suportada pelo ambiente, gerando nova versão para implantação.
No momento, os deploys permanecem pendentes de correção pela equipe responsável pelas aplicações. Após disponibilização de novos artefatos, poderemos realizar nova tentativa de publicação.
 
 
Flavio de Almeida Gagliardi Patricia Vourakis Barbosa Braga PC 
 
Prezados,
 
SIRUR-SIFEC com nova versão gerada: 3.55.51.05.
Atualizados os pontos indicados e migrado pra Java 8.
 
http://binario.caixa:8081/repository/releases/br/gov/caixa/sirur/sifec-sirur/3.55.51.05/sifec-sirur-3.55.51.05.ear
 
 
 
Michael Lourant de Oliveira Ferreira
Prezados,   SIRUR-SIFEC com nova versão gerada: 3.55.51.05. Atualizados os pontos indicados e migrado pra Java 8.   http://binario.caixa:8081/repository/releases/br/gov/caixa/sirur/sifec-sirur/3.55.5…
Michael Lourant de Oliveira Ferreira
 
SIRUR (sifec-sirur-3.55.51.05.ear)
 
Durante a implantação do pacote sifec-sirur-3.55.51.05.ear foi identificada falha na fase inicial de validação estrutural do deployment (STRUCTURE), impedindo o processamento da aplicação pelo servidor.
 
Foi realizada análise detalhada do artefato armazenado no Domain Controller, sendo validada sua integridade, sem evidências de corrupção ou falha de transferência. Entretanto, foi constatada inconsistência no arquivo META-INF/MANIFEST.MF presente no pacote.
 
A validação foi reproduzida diretamente utilizando o parser padrão da plataforma Java, que retornou o mesmo erro apresentado durante o deploy:
 
java.io.IOException: invalid header field
 
 
Com isso, conclui-se que o arquivo de manifesto gerado no processo de build possui formatação inválida, impossibilitando sua leitura pelo Java e, consequentemente, pelo WildFly/JBoss. Em razão dessa inconsistência, o deploy é interrompido e revertido automaticamente antes da inicialização da aplicação.
 
Ação da fábrica:
 
Revisar a geração do arquivo META-INF/MANIFEST.MF.
Corrigir a formatação das entradas do manifesto.
Gerar novo artefato EAR após os ajustes.
Disponibilizar nova versão para implantação.

 
Flavio de Almeida Gagliardi Patricia Vourakis Barbosa Braga PC 
 
Thiago Jeferson de Sousa Silva
Michael Lourant de Oliveira Ferreira   SIRUR (sifec-sirur-3.55.51.05.ear)   Durante a implantação do pacote sifec-sirur-3.55.51.05.ear foi identificada falha na fase inicial de validação estrutural…
Verificaremos.
 
A/C Emerson
 
