Segue um texto para encerrar a demanda:

Análise e encerramento

O deploy do SIIFX-batch-ctm em DES avançou até a etapa "Configura Control-M". Nessa etapa falha na task control_m : Copia Scripts com o erro:

Could not find or access '/opt/ads-agent/_work/r12197/a/_SIIFX-batch-ctm-config/scripts_ctm/' on the Ansible Controller.

Causa: o repositório de configuração SIIFX-batch-ctm-config (branch main) contém apenas o README.md padrão, criado em 18/ago. A esteira JBoss VM (Control-M) exige que esse repositório tenha a estrutura de configuração da aplicação. Isso inclui a pasta scripts_ctm/, na raiz, com os scripts que os jobs do Control-M vão executar.

Ação necessária (time de desenvolvimento):

Popular o repositório SIIFX-batch-ctm-config com os arquivos de configuração da aplicação. Isso inclui a pasta scripts_ctm/ com os scripts dos jobs, que não pode estar vazia, porque o Git não versiona diretórios vazios.
Usar como referência o repositório SIIFX-batch-rendimentos-ctm-config, que tem a mesma arquitetura e roda normalmente na esteira.
Fazer o commit na branch configurada no artifact da release.
Gerar uma nova release do SIIFX-batch-ctm.

Do lado da esteira não há correção a ser feita: o pipeline, os artifacts e o agente estão funcionando. Encerramos esta demanda. Se a falha continuar depois que o repositório de config for populado, favor abrir um novo chamado com o log da release.
