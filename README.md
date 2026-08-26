Bom dia, Matheus,

Investigamos o caso e identificamos a causa raiz: as tasks 'Run Code Analysis' e 'Publish Quality Gate Result' foram desabilitadas propositalmente em junho/2026 no Task Group DotnetCore-Build, usado pelas pipelines SIMOV-imoveiscaixa-backend e -batch (e por diversas outras aplicações .NET da esteira).

O motivo: o plugin do SonarQube para .NET não funciona corretamente com o SonarQube exposto via HTTPS na nossa esteira (diferente do plugin Java, que lida bem com isso). Isso gera erro de certificado (PKIX path building failed) e falha a análise. Esse é um problema antigo e conhecido, sem solução encontrada até o momento para o cenário .NET.

Testamos reabilitar as tasks para confirmar, e de fato o erro se reproduz. Por esse motivo, elas permanecerão desabilitadas por ora — não é uma falha de configuração pontual do SIMOV, e sim uma limitação conhecida do Sonar para aplicações .NET nesta esteira.

Ficamos à disposição para mais detalhes.
