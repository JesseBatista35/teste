Starting: check-case-sensitivity.js
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/dc5627d6-e0c9-409e-9936-1e2dad426b2d.sh
=== Conteudo categoria.model.ts (minusculo) ===
export interface CategoriaGet {
  identificador: number;
  identificador_negocial: number;
  nome: string;
}

=== Conteudo Categoria.model.ts (maiusculo) ===
export interface CategoriaGet {
  identificador: number;
  identificador_negocial: number;
  nome: string;
}

=== MD5 dos dois arquivos (se forem iguais, o hash bate) ===
d505fbb019dfdc16193bae9d88a19fcd  src/app/model/endomarketing/categoria.model.ts
d505fbb019dfdc16193bae9d88a19fcd  src/app/model/endomarketing/Categoria.model.ts

=== Quem importa de model/endomarketing/categoria (qualquer caixa) ===
##[error]Bash exited with code '1'.
Finishing: check-case-sensitivity.js
