Tivemos que modificar o sistema para atender a autenticação do CNS .
Já pedimos para verificar se a nova cadeia de certificados esta instalada no servidor REQ000146274139.

Nosso site  https://sipar-inter-des.apps.nprd.caixa/siparInternet/

Ao chamar a aplicação o pop-up de selecionar o certificado do CNS não aparece.

Gostaríamos que verificasse se alguma nova configuração deve ser feita.

Para servir de orientação o sistema SICSE tem essa configuração.
https://des.inter.corerj.caixa:8613/sicse/

Estamos enviando um documento para visualizar o que esta ocorrendo


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 29/09/2026 16:28:57
Criado por	 P719371
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Verificando via teams com o solicitante se existe mais algum módulo com a configuração solicitada.
Aguardando retorno.
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 29/09/2026 15:06:04
Criado por	 P719371
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Em analise.
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 28/09/2026 18:40:04
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 28/09/2026 17:41:30
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 28/09/2026 17:28:07
Criado por	 F949792
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081742301
Criado em	 28/09/2026 17:28:06
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 29/09/2026 16:29:34



Solicitação de Configuração para o SICRF-INTER

Configurar no Apache para a solicitação do certificado cadeia V6 para escolher o certificado.

No SICSE (https://des.inter.corerj.caixa:8613/sicse/ControladorPrincipalServlet) está funcionado corretamente. Quando entra no endereço, o pop-up para escolher o certificado é acionado e depois disso entra na aplicação.
 
 
 



Já no SIPAR-INTER, o pop-up não é chamado e em consequência disso, dá erro quando a aplicação tenta ler o certificado.
https://sipar-inter-des.apps.nprd.caixa/siparInternet/pages/principal/*
 
Neste caso, é necessário aplicar no SIPAR-INTER as mesmas configurações do SICSE.



<img width="754" height="324" alt="image" src="https://github.com/user-attachments/assets/6442f907-04b2-49ab-9dea-21c4e15b498b" />





<img width="459" height="445" alt="image" src="https://github.com/user-attachments/assets/b469f961-557b-4e62-8d8e-3fa275aeb239" />


<img width="743" height="503" alt="image" src="https://github.com/user-attachments/assets/0c90c166-d417-4dc5-bf97-3ced602af9f8" />

<img width="886" height="298" alt="image" src="https://github.com/user-attachments/assets/7218f1f5-e0ed-4a45-bce7-060423ee4fb6" />





