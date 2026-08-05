Prezada,

Em atenção à sua solicitação, informamos o resultado da análise técnica realizada nos ambientes DES e TQS referente ao sistema SIORF:

1. Sobre a criação das pastas /siorf/Convenio/Processar e /siorf/Convenio/Resultado em DES e TQS:

Em DES, apenas a pasta /siorf/Convenio/Resultado foi criada e está montada, com 50GB de capacidade via NFS (fs_siorf). A pasta /siorf/Convenio/Processar não existe no ambiente.

Em TQS, nenhuma das duas pastas foi criada. O compartilhamento NFS não foi provisionado neste ambiente e não há volume ou ponto de montagem configurado no servidor de aplicação.

2. Sobre o acesso 777 dos usuários de serviço SORFDB01 e SORFTB01:

A pasta /siorf/Convenio/Resultado (única existente) está com permissão 777 (leitura, escrita e execução para todos), porém o proprietário do diretório é o usuário nobody, e não SORFDB01 ou SORFTB01. Como a permissão já contempla acesso total, isso não deve impactar a gravação/leitura pelos usuários de serviço, mas o registro de propriedade diverge do informado.

3. Sobre a configuração do JBoss com os paths:

Apenas o path /siorf/Convenio/Resultado está configurado no servidor de aplicação (JBoss), via volumeMount direto associado a um PVC, seguindo o modelo de um path por pasta (não há path único resolvido em tempo de execução). O path /siorf/Convenio/Processar não está configurado, e nenhum path está configurado no ambiente TQS.

Importante: Ao analisarmos o histórico completo das solicitações REQ000144998295 e REQ000144998297, mencionadas por você como base para a criação das pastas Processar e Resultado em DES e TQS, verificamos que essa solicitação, como descrita, não consta nos registros dessas REQs.

O que foi de fato solicitado e tramitado nas referidas REQs foi a criação do compartilhamento NFS (fs_siorf) e do ponto de montagem /siorf/Convenio/Resultado, exclusivamente no ambiente DES. Não há registro, em nenhuma das duas REQs, de solicitação da pasta Processar nem de provisionamento no ambiente TQS.

Próximos passos:

Como não existe nenhum compartilhamento NFS, volume ou mount configurado para TQS, e a pasta Processar também não foi criada em DES, o processo para regularizar ambos precisa seguir o fluxo abaixo:

Você deverá abrir nova(s) solicitação(ões) de armazenamento pelo Infrafácil, no módulo de Solicitação de Armazenamento, indicando o sistema (siorf), ambiente, ponto de montagem desejado e volumetria — da mesma forma que foi feito para o Resultado em DES;
A equipe de Armazenamento fica responsável por criar o(s) compartilhamento(s) NFS no storage e liberar os IPs de acesso correspondentes;
Após a criação pelo Armazenamento, a Esteiras realiza a configuração do volume/volumeMount no OKD para montar o path no JBoss.

Assim que a(s) solicitação(ões) forem abertas no Infrafácil, favor nos indicar o(s) número(s) da REQ para darmos continuidade na configuração pela Esteiras.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
