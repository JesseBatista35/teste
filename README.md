Jesse Mouta Pereira Batista
Bom dia, tudo bem?
 
A resposta do time de CETEL  foi essa abaixo:
 
 
12/06/2026 16:32:39 ;  (P908440)
À

TELEDATA/CETEL/REDES,

- Ao acessar a URL 
https://sicmu-intranet-update.esteiras.des.caixa, a mensagem recebida é: "Ops!!!!... parece que você acessou uma URL que não está disponível. Confere lá no Azure DevOps Server se essa URL tá certa no seu processo de release.". Tal mensagem, bem como o retorno
 "403 Forbidden" relatado não são problemas de conectividade, mas sim aplicação. Informo ainda que a URL é resolvida pelo VIP compartilhado de Esteiras, portanto nenhuma configuração deve ser alterada no balanceador. Não há ação da equipe de Redes - Datacenter.


Att,

Magnus dos Santos Silva

Analista de Datacenter - Redes

TELEDATA/CETEL/REDES
 
 
Jesse Mouta Pereira Batista
 
Posso abrir outra REQ para vc verificar novamente as configurações lá?.....
 
********** Onde é cadastrada essa variável de URL da aplicação?
 
Lá no DevOps, as únicas variáveis de URL que estão lá são essas do SISGR:
 
 
 
 
Será que preciso criar variável tipo "URL_CMU" para formalizar essa URL  https://sicmu-intranet-update.esteiras.des.caixa/sicmu  ????
 
Não há nenhuma variável criada para essa URL.....
 
opa Marcelo bom dia, vou dar uma verificada ~lá então uma vez que o  Magnus informou que a configuração do balanceador está certa, devemos investigar, não abre a req por enquanto não, assim que retornar do almoço verifico aviso pra você abrir a req beleza? 
 
beleza



 resumundi a configuraçao esta certo realmente existe um problme aqui e voce nao me ajudou esta me prejudicando
