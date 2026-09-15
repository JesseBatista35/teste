Prezados(as),

Informamos que a pipeline "Call CodeQL workflow Seguranca" (análise de segurança) estava falhando em projetos da família sisfm-lib-* (evidência: sisfm-lib-interfaces, run https://github.com/caixagithub/sisfm-lib-interfaces/actions/runs/34973932963/job/104487426770).

O erro ocorria na etapa de configuração do Android SDK, ao tentar instalar o pacote "tools" (Android SDK Tools legado), que o Google descontinuou e removeu do repositório oficial do SDK há algum tempo. Como esse pacote não existe mais para download, a etapa falhava com "Failed to find package 'tools'" e o workflow encerrava com erro antes de concluir a análise de segurança.

O problema foi corrigido. A partir de agora, os times de desenvolvimento devem executar uma nova jornada (novo run) nas pipelines de segurança dos projetos sisfm-lib-* para validar que a análise volta a rodar normalmente.

Qualquer nova falha após essa execução, favor retornar para acompanhamento.
