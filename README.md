Nota de encerramento — WO0000081575607

Identificada causa raiz do erro de indisponibilidade do pod simpf-frontend-des: desalinhamento entre .s2i/bin/assemble e .s2i/bin/run após remoção da pasta web/ do repositório, causando primeiro falha no sed (arquivo main*.js fora do caminho esperado) e, após correção parcial via PR #162, novo sintoma (403 - directory index forbidden) por ausência do index.html na raiz servida pelo Nginx.

Aplicado ajuste no .s2i/bin/assemble (mv dist/*/* em vez de mv dist/*), corrigindo a estrutura de arquivos entregue ao Nginx. Realizado novo deploy e validado funcionamento normal do pod em DES.

Status: Resolvido. Demanda encerrada.
