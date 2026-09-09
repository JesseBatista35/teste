À CAIXA,

Identificado que a variável de pipeline DOTNET_STARTUP_ASSEMBLY do repositório SISOU-api-sac-internet estava configurada com o valor SISEI-csharp-batch.dll, divergente do nome real do assembly da aplicação (SISOU-api-sac-internet.dll). Essa divergência fazia com que o script da etapa "Executando Build S2I Binary" removesse o runtimeconfig.json correto do pacote de build (por não corresponder ao nome esperado), resultando na falha:

error: cannot find startup assembly
This image does not contain an sdk and can only be used with pre-built applications.

Corrigido o valor da variável para SISOU-api-sac-internet.dll. Build #2.0.0.19 executado com sucesso após o ajuste, confirmando a resolução do problema.

Atenciosamente,
Jessé Batista
CTIS/CESTI/ESTEIRA - DEVOPS
