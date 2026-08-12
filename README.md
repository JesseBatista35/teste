Prezados, bom dia.

Realizamos a investigação técnica no ambiente DES do sistema sicmu-intranet-update.

O caminho que a aplicação espera para o arquivo jconnector.properties está definido internamente no módulo br.gov.caixa.psc.jconnector (jconnector-2.10.jar), utilizado pelo SICMU:

/infra_app/config/sit/jconnector.properties

Evidência (extraído das classes compiladas do jconnector-2.10.jar):

+/infra_app/config/sit/jconnector.properties
o:/infra_app/config/sit/jconnector.properties

Verificamos diretamente no servidor (inclusive com acesso root) e confirmamos que esse caminho não existe no ambiente DES atualmente - nem o arquivo, nem a estrutura de diretórios /infra_app.

Evidência (busca realizada como root, sem nenhum resultado):

[root@caddeapllx2484 tmp]# find / -path "/infra_app/config" 2>/dev/null
[root@caddeapllx2484 tmp]# find / -iname "jconnector.properties" 2>/dev/null
[root@caddeapllx2484 tmp]# find / -type d -iname "infra_app" 2>/dev/null

Diante disso, existem duas possibilidades a serem avaliadas pelo time responsável pela aplicação:

Se o caminho for fixo e não configurável (hardcoded no jar do conector), será necessário que a estrutura de diretórios e o arquivo sejam criados nesse local específico no servidor.
Se houver alguma forma de a aplicação apontar para um caminho diferente (variável de ambiente, configuração externa, etc.), pode ser necessário ajustar essa referência para o ambiente DES.

Ficamos à disposição para qualquer teste adicional necessário no ambiente.
