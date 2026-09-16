-sh-4.2$ oc get configmap sicfd-monitoramento-des-script-bt-check -n sicfd-des -o yaml
apiVersion: v1
data:
  bt-check.sh: "#!/bin/sh\n\n# ==============================================================================\n#
    check_secrets.sh\n#\n# Verifica se um diretório contém um conjunto exato de arquivos
    especificado em\n# uma variável de ambiente.\n#\n# Ele verifica seguintes condições:\n#
    1. O script somente executado se ao menos uma das seguintes variáveis de ambiente\n#
    \   estiver definida: `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`. Se ambas estiverem\n#
    \   definidas, somente será usado `SECRETS_LIST`. Se somente uma estiver definida,\n#
    \   será usada a definida.\n# 2. Todos os arquivos listados na variável de ambiente
    `SECRETS_LIST`\n#    (ou na `MANAGED_ACCOUNTS_LIST`) devem existir em um caminho
    relativo ao\n#    `SECRETS_PATH`.\n# 3. Nenhum outro arquivo além dos listados
    em `SECRETS_LIST` (ou em\n#    `MANAGED_ACCOUNTS_LIST`) pode existir no `SECRETS_PATH`
    ou em seus subdiretórios.\n#\n# Variáveis de Ambiente:\n#   - SECRETS_PATH:  O
    caminho absoluto ou relativo para o diretório a ser\n#                   inspecionado.\n#
    \  - SECRETS_LIST: Uma string com caminhos de arquivos relativos, separados\n#
    \                  por vírgula. \n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#
    \  - MANAGED_ACCOUNTS_LIST: Uma string com caminhos de arquivos relativos, separados\n#
    \                  por vírgula.\n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#\n#
    Códigos de Saída:\n#   - 0: Sucesso. O conteúdo do diretório corresponde perfeitamente
    à lista.\n#   - 1: Falha. Foi encontrada uma divergência (arquivos faltando ou
    extras),\n#        ou ocorreu um erro.\n#   - 2: Variável de ambiente SECRETS_PATH
    não existe ou está vazia.\n#   - 3: Diretório de arquivos de segredos SECRETS_PATH
    não existe ou não é um\n#        diretório.\n#   - 4: Nao foram encontrados arquivos
    de segredos no diretorio SECRETS_PATH\n#   - 5: Falha. Não foi possível criar
    arquivo temporário com a lista de segredos\n#        que devem estar disponíveis.
    Listado na variável de ambiente SECRETS_LIST\n#        ou MANAGED_ACCOUNTS_LIST.\n#
    \  - 6: Falha. Não foi possível criar arquivo temporário com os arquivos\n#        encontrados
    no diretório SECRETS_PATH.\n#   - 7: Falha. Variáveis de ambiente `SECRETS_LIST`
    ou `MANAGED_ACCOUNTS_LIST`\n#        estão definidas, mas não contem caminho de
    arquivos segredos.\n#   - 8: Falha interna. Variável 'expected_count' de uso interno
    do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#
    \  - 9: Falha interna. Variável 'found_count' de uso interno do script\n#        deve
    ser numérica, mas está apresentando caracteres não numéricos.\n#   - 10: Falha
    interna. Não foi possível comparar a lista de segredos esperados\n#         com
    lista de segredos encontrados.\n# ==============================================================================\n\n#
    Exit codes\nEXIT_CODE_SUCCESS=0\nEXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS=1\nEXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE=2\nEXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE=3\nEXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO=4\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS=5\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS=6\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA=7\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO=8\nEXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO=9\nEXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS=10\n\n#
    Localização padrão do diretório contendo segredos\n# Será utilizado se a variável
    de ambiente SECRETS_PATH não estiver definida.\nSECRETS_PATH_DEFAULT=\"${SECRETS_PATH:-/usr/src/app/secrets_files}\"\n\n#
    MUITOS LOGS: 1 - sim ; 0 - não\nCONFIG_LOTS_OF_LOGS=0\n\n# Realizar a verificação
    em modo case sensitive por padrão.\n# 1 - sim ; 0 - não\nCONFIG_CASE_INSENSITIVE=\"${CONFIG_CASE_INSENSITIVE:-1}\"\n\n#
    Emitir logs de diagnóstico se a verificação falhar\nCONFIG_FAIL_DIAGNOSTIC=1\n\n#
    Verifica se o parâmetro da função contem somente dígitos numéricos\ncontem_somente_numeros()
    {\n  local nome_da_variavel=\"${1}\"\n\n  # remove o nome_da_variable da lista
    de parâmetros\n  shift\n\n  case \"${@}\" in\n    *[!0-9]*|'')\n      printf \"ERRO:
    uma variavel '%s' interna do script contem caracteres nao numericos '%s'.\\n\"
    \"${nome_da_variavel}\" \"${@}\" >&2\n\n      return 1\n      ;; # Não é número\n
    \   *)\n      return 0\n      ;; # Contem somente dígitos\n  esac\n}\n\n# ---
    Configuração e Modo Estrito ---\n\n# Encerra o script imediatamente se um comando
    terminar com status diferente de zero.\nset -e\n\n# Trata variáveis não definidas
    como um erro durante a substituição.\n#set -u\n\n\n# --- Validação da Entrada
    ---\n\n# Verifica se SECRETS_PATH está definida ou está vazia\nif [ \"x${SECRETS_PATH}\"
    = \"x\" ]; then\n#  printf \"ERRO: A variavel de ambiente '%s' nao esta definida
    ou estah vazia.\\n\" \"SECRETS_PATH\" >&2\n#  exit ${EXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE}\n\n
    \ printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia,
    sera utilizado valor padrao '%s'.\\n\" \"SECRETS_PATH\" \"${SECRETS_PATH_DEFAULT}\"
    >&2\n\n  SECRETS_PATH=\"${SECRETS_PATH_DEFAULT}\"\nfi\n# Referencia caminho de
    um diretório ?\nif [ ! -d \"${SECRETS_PATH}\" ]; then\n  printf \"ERRO: O diretorio
    de segredos nao foi encontrado em '%s'.\\n\" \"${SECRETS_PATH}\" >&2\n\n  exit
    ${EXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE}\nfi\n\n[ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"Iniciando verificacao para o diretorio: '%s'\\n\" \"$SECRETS_PATH\"\n\n\n#
    --- Lógica Principal ---\n\n# Cria arquivos temporários para armazenar as listas
    ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita
    problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells
    que não encerram com 'set -e' em caso de falha do mktemp\nexpected_files_sorted=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\nexpected_files_sorted_case_insensitive=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\n\n#
    Configura um 'trap' para garantir que os arquivos temporários sejam removidos
    em qualquer saída do script\n# (sucesso, falha ou interrupção).\ntrap 'rm -f \"$expected_files_sorted\"
    \"$found_files_sorted\"' EXIT\n\n# Cria arquivos temporários para armazenar as
    listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro
    e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para
    shells que não encerram com 'set -e' em caso de falha do mktemp\nfound_files_sorted=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\nfound_files_sorted_case_insensitive=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\n\n\n#
    --- Passo 1: Gerar a lista de arquivos ESPERADOS ---\n\n# Devemos verificar se
    existem arquivos de segredos?\n# Finalizar com sucesso se nenhuma das variáveis
    de ambiente estiver definida.\nif [ \"x${SECRETS_LIST}\" = \"x\" -a \"x${MANAGED_ACCOUNTS_LIST}\"
    = \"x\" ]; then\n  printf \"Script nao serah executado, pois nenhuma das seguintes
    variaveis de ambiente estah definida: '%s' , '%s'.\\n\" \"SECRETS_LIST\" \"MANAGED_ACCOUNTS_LIST\"\n\n
    \ exit ${EXIT_CODE_SUCCESS}\nfi\n\nif [ \"x${SECRETS_LIST}\" != \"x\" ]; then\n
    \   SECRETS_TO_CHECK=\"${SECRETS_LIST}\"\nelse\n    SECRETS_TO_CHECK=\"${MANAGED_ACCOUNTS_LIST}\"\nfi\n\n#
    Converte a string SECRETS_LIST (separada por vírgulas) em uma lista separada por
    quebras de linha.\n# Em seguida, ordena a lista, transforma tudo em minúsculas
    e a salva no arquivo temporário.\n# Esta abordagem lida corretamente com caminhos
    de arquivo que contêm espaços.\n# Assume-se que os nomes dos arquivos não contêm
    vírgulas.\n# Filtramos linhas vazias para o caso de a lista ter vírgulas duplas
    ou no final.\necho \"${SECRETS_TO_CHECK}\" | tr ',' '\\n' | grep --invert-match
    --extended-regexp '^[\\t ]*$' | sort > \"${expected_files_sorted}\"\ncat \"${expected_files_sorted}\"
    | tr '[:upper:]' '[:lower:]' | sort > \"${expected_files_sorted_case_insensitive}\"\n\n#
    Verifica se algum segredo esta listado\nexpected_count=$( cat \"${expected_files_sorted}\"
    | wc --lines ) || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\n\n#
    Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"expected_count\"
    \"${expected_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO}\n\n[
    \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && printf \"Arquivos esperados:\\n\"\n\nif
    [ \"${expected_count}\" -gt 0 ]; then\n  # Exibe para feedback do usuário\n  [
    \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && cat \"${expected_files_sorted}\"\nelse\n
    \ [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO:
    Nao foram definidos segredos para recuperar do cofre.\\n\" >&2\n  printf \"ERRO:
    Tanto a variavel '%s' ('%s') quanto a '%s' ('%s') nao contem lista de segredos.\\n\"
    \"SECRETS_LIST\" \"${SECRETS_LIST}\" \"MANAGED_ACCOUNTS_LIST\" \"${MANAGED_ACCOUNTS_LIST}\"
    >&2\n\n  exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\nfi\n\n\n#
    --- Passo 2: Gerar a lista de arquivos ENCONTRADOS ---\n\n# Encontra todos os
    arquivos (-type f) no diretório de segredos.\n# Usa 'sed' para remover o prefixo
    do diretório, deixando apenas o caminho relativo.\n# O 'cd' e o '.' no find garantem
    que obteremos caminhos relativos como 'file.txt'\n# em vez de './file.txt', para
    corresponder ao formato esperado.\n# Converte tudo para minúsculas.\n[ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"\\nArquivos encontrados:\\n\"\n\n# Verifica se o find retorna
    algum resultado\nfound_count=$( cd \"${SECRETS_PATH}\" && find . -type f ! -iregex
    \".*\\_metadata$\" -print | wc --lines ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n#
    Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"found_count\"
    \"${found_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO}\n\nif
    [ \"${found_count}\" -gt 0 ]; then\n  ( cd \"${SECRETS_PATH}\" && find . -type
    f ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' | sort
    > \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n
    \ ( cat \"${found_files_sorted}\" | tr '[:upper:]' '[:lower:]' > \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n  [ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && cat \"${found_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram encontrados
    arquivos com segredos no diretorio '%s'.\\n\" \"${SECRETS_PATH}\" >&2\n\n  exit
    ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\nfi\n\n\n# --- Passo 3:
    Comparar as listas e reportar o status ---\n\nprintf \"\\n--- Resultados da Comparacao
    ---\\n\"\nvalidation_failed=0\n\n# Usa 'comm' para encontrar as diferenças entre
    os dois arquivos ordenados.\n# - 'comm -23' mostra linhas que são exclusivas do
    primeiro arquivo (arquivos FALTANDO).\n# - 'comm -13' mostra linhas que são exclusivas
    do segundo arquivo (arquivos EXTRAS).\n\nif [ \"${CONFIG_CASE_INSENSITIVE}\" -ne
    0 ]; then\n  missing_files=$( comm -23 \"${expected_files_sorted}\" \"${found_files_sorted}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n
    \ extra_files=$( comm -13 \"${expected_files_sorted}\" \"${found_files_sorted}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nelse\n
    \ missing_files=$( comm -23 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n
    \ extra_files=$( comm -13 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nfi\n\nif
    [ \"x${missing_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO
    na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:\\n\" >&2\n\n
    \ echo \"${missing_files}\" >&2\nfi\n\nif [ \"x${extra_files}\" != \"x\" ]; then\n
    \ validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos NAO
    ESPERADOS foram encontrados:\\n\" >&2\n\n  echo \"${extra_files}\" >&2\nfi\n\n\n#
    --- Status Final de Saída ---\n\nif [ \"${validation_failed}\" -ne 0 ]; then\n
    \ printf \"\\nERRO: Verificacao nao foi bem-sucedida.\\n\" >&2\n\n  if [ \"${CONFIG_FAIL_DIAGNOSTIC}\"
    -eq 1 ]; then\n    # Verificar se algum arquivo de segredo existe, mas está vazio.\n
    \   # Se mktemp apresentar erro, emitir o código de erro de validação com falha\n
    \   empty_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\n
    \   ( cd \"${SECRETS_PATH}\" && find . -type f -empty ! -iregex \".*\\_metadata$\"
    -print | sed --regexp-extended 's|^\\./||' 2>/dev/null | sort > \"${empty_files_sorted}\"
    )\n    if [ -f \"${empty_files_sorted}\" ]; then\n      printf \"\\nERRO: Diagnostico.
    Arquivos vazios encontrados.\\n\" >&2\n      cat \"${empty_files_sorted}\" >&2
    || true\n      printf \"\\n\" >&2\n      rm \"${empty_files_sorted}\" >&2 || true\n
    \     printf \"\\n\" >&2\n    fi\n\n    # Recupera os endereços IP do POD.\n    #
    Entretanto, pode não ser o IP que os ativos de rede irão\n    # observar devido
    a \"NAT\" de saída no cluster.\n    printf \"\\nERRO: Diagnostico. IP do POD.\\n\"
    >&2\n    ( ip address show >&2 2>/dev/null || ifconfig -a >&2 2>/dev/null )\n
    \ fi\n\n  exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\nelse\n
    \ printf \"Sucesso! O conteudo do diretorio corresponde a lista esperada.\\n\"\n\n
    \ exit ${EXIT_CODE_SUCCESS}\nfi\n"
kind: ConfigMap
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"v1","data":{"bt-check.sh":"#!/bin/sh\n\n# ==============================================================================\n# check_secrets.sh\n#\n# Verifica se um diretório contém um conjunto exato de arquivos especificado em\n# uma variável de ambiente.\n#\n# Ele verifica seguintes condições:\n# 1. O script somente executado se ao menos uma das seguintes variáveis de ambiente\n#    estiver definida: `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`. Se ambas estiverem\n#    definidas, somente será usado `SECRETS_LIST`. Se somente uma estiver definida,\n#    será usada a definida.\n# 2. Todos os arquivos listados na variável de ambiente `SECRETS_LIST`\n#    (ou na `MANAGED_ACCOUNTS_LIST`) devem existir em um caminho relativo ao\n#    `SECRETS_PATH`.\n# 3. Nenhum outro arquivo além dos listados em `SECRETS_LIST` (ou em\n#    `MANAGED_ACCOUNTS_LIST`) pode existir no `SECRETS_PATH` ou em seus subdiretórios.\n#\n# Variáveis de Ambiente:\n#   - SECRETS_PATH:  O caminho absoluto ou relativo para o diretório a ser\n#                   inspecionado.\n#   - SECRETS_LIST: Uma string com caminhos de arquivos relativos, separados\n#                   por vírgula. \n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#   - MANAGED_ACCOUNTS_LIST: Uma string com caminhos de arquivos relativos, separados\n#                   por vírgula.\n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#\n# Códigos de Saída:\n#   - 0: Sucesso. O conteúdo do diretório corresponde perfeitamente à lista.\n#   - 1: Falha. Foi encontrada uma divergência (arquivos faltando ou extras),\n#        ou ocorreu um erro.\n#   - 2: Variável de ambiente SECRETS_PATH não existe ou está vazia.\n#   - 3: Diretório de arquivos de segredos SECRETS_PATH não existe ou não é um\n#        diretório.\n#   - 4: Nao foram encontrados arquivos de segredos no diretorio SECRETS_PATH\n#   - 5: Falha. Não foi possível criar arquivo temporário com a lista de segredos\n#        que devem estar disponíveis. Listado na variável de ambiente SECRETS_LIST\n#        ou MANAGED_ACCOUNTS_LIST.\n#   - 6: Falha. Não foi possível criar arquivo temporário com os arquivos\n#        encontrados no diretório SECRETS_PATH.\n#   - 7: Falha. Variáveis de ambiente `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`\n#        estão definidas, mas não contem caminho de arquivos segredos.\n#   - 8: Falha interna. Variável 'expected_count' de uso interno do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#   - 9: Falha interna. Variável 'found_count' de uso interno do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#   - 10: Falha interna. Não foi possível comparar a lista de segredos esperados\n#         com lista de segredos encontrados.\n# ==============================================================================\n\n# Exit codes\nEXIT_CODE_SUCCESS=0\nEXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS=1\nEXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE=2\nEXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE=3\nEXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO=4\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS=5\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS=6\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA=7\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO=8\nEXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO=9\nEXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS=10\n\n# Localização padrão do diretório contendo segredos\n# Será utilizado se a variável de ambiente SECRETS_PATH não estiver definida.\nSECRETS_PATH_DEFAULT=\"${SECRETS_PATH:-/usr/src/app/secrets_files}\"\n\n# MUITOS LOGS: 1 - sim ; 0 - não\nCONFIG_LOTS_OF_LOGS=0\n\n# Realizar a verificação em modo case sensitive por padrão.\n# 1 - sim ; 0 - não\nCONFIG_CASE_INSENSITIVE=\"${CONFIG_CASE_INSENSITIVE:-1}\"\n\n# Emitir logs de diagnóstico se a verificação falhar\nCONFIG_FAIL_DIAGNOSTIC=1\n\n# Verifica se o parâmetro da função contem somente dígitos numéricos\ncontem_somente_numeros() {\n  local nome_da_variavel=\"${1}\"\n\n  # remove o nome_da_variable da lista de parâmetros\n  shift\n\n  case \"${@}\" in\n    *[!0-9]*|'')\n      printf \"ERRO: uma variavel '%s' interna do script contem caracteres nao numericos '%s'.\\n\" \"${nome_da_variavel}\" \"${@}\" \u003e\u00262\n\n      return 1\n      ;; # Não é número\n    *)\n      return 0\n      ;; # Contem somente dígitos\n  esac\n}\n\n# --- Configuração e Modo Estrito ---\n\n# Encerra o script imediatamente se um comando terminar com status diferente de zero.\nset -e\n\n# Trata variáveis não definidas como um erro durante a substituição.\n#set -u\n\n\n# --- Validação da Entrada ---\n\n# Verifica se SECRETS_PATH está definida ou está vazia\nif [ \"x${SECRETS_PATH}\" = \"x\" ]; then\n#  printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia.\\n\" \"SECRETS_PATH\" \u003e\u00262\n#  exit ${EXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE}\n\n  printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia, sera utilizado valor padrao '%s'.\\n\" \"SECRETS_PATH\" \"${SECRETS_PATH_DEFAULT}\" \u003e\u00262\n\n  SECRETS_PATH=\"${SECRETS_PATH_DEFAULT}\"\nfi\n# Referencia caminho de um diretório ?\nif [ ! -d \"${SECRETS_PATH}\" ]; then\n  printf \"ERRO: O diretorio de segredos nao foi encontrado em '%s'.\\n\" \"${SECRETS_PATH}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE}\nfi\n\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"Iniciando verificacao para o diretorio: '%s'\\n\" \"$SECRETS_PATH\"\n\n\n# --- Lógica Principal ---\n\n# Cria arquivos temporários para armazenar as listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells que não encerram com 'set -e' em caso de falha do mktemp\nexpected_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\nexpected_files_sorted_case_insensitive=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\n\n# Configura um 'trap' para garantir que os arquivos temporários sejam removidos em qualquer saída do script\n# (sucesso, falha ou interrupção).\ntrap 'rm -f \"$expected_files_sorted\" \"$found_files_sorted\"' EXIT\n\n# Cria arquivos temporários para armazenar as listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells que não encerram com 'set -e' em caso de falha do mktemp\nfound_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\nfound_files_sorted_case_insensitive=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\n\n\n# --- Passo 1: Gerar a lista de arquivos ESPERADOS ---\n\n# Devemos verificar se existem arquivos de segredos?\n# Finalizar com sucesso se nenhuma das variáveis de ambiente estiver definida.\nif [ \"x${SECRETS_LIST}\" = \"x\" -a \"x${MANAGED_ACCOUNTS_LIST}\" = \"x\" ]; then\n  printf \"Script nao serah executado, pois nenhuma das seguintes variaveis de ambiente estah definida: '%s' , '%s'.\\n\" \"SECRETS_LIST\" \"MANAGED_ACCOUNTS_LIST\"\n\n  exit ${EXIT_CODE_SUCCESS}\nfi\n\nif [ \"x${SECRETS_LIST}\" != \"x\" ]; then\n    SECRETS_TO_CHECK=\"${SECRETS_LIST}\"\nelse\n    SECRETS_TO_CHECK=\"${MANAGED_ACCOUNTS_LIST}\"\nfi\n\n# Converte a string SECRETS_LIST (separada por vírgulas) em uma lista separada por quebras de linha.\n# Em seguida, ordena a lista, transforma tudo em minúsculas e a salva no arquivo temporário.\n# Esta abordagem lida corretamente com caminhos de arquivo que contêm espaços.\n# Assume-se que os nomes dos arquivos não contêm vírgulas.\n# Filtramos linhas vazias para o caso de a lista ter vírgulas duplas ou no final.\necho \"${SECRETS_TO_CHECK}\" | tr ',' '\\n' | grep --invert-match --extended-regexp '^[\\t ]*$' | sort \u003e \"${expected_files_sorted}\"\ncat \"${expected_files_sorted}\" | tr '[:upper:]' '[:lower:]' | sort \u003e \"${expected_files_sorted_case_insensitive}\"\n\n# Verifica se algum segredo esta listado\nexpected_count=$( cat \"${expected_files_sorted}\" | wc --lines ) || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\n\n# Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"expected_count\" \"${expected_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO}\n\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"Arquivos esperados:\\n\"\n\nif [ \"${expected_count}\" -gt 0 ]; then\n  # Exibe para feedback do usuário\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 cat \"${expected_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram definidos segredos para recuperar do cofre.\\n\" \u003e\u00262\n  printf \"ERRO: Tanto a variavel '%s' ('%s') quanto a '%s' ('%s') nao contem lista de segredos.\\n\" \"SECRETS_LIST\" \"${SECRETS_LIST}\" \"MANAGED_ACCOUNTS_LIST\" \"${MANAGED_ACCOUNTS_LIST}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\nfi\n\n\n# --- Passo 2: Gerar a lista de arquivos ENCONTRADOS ---\n\n# Encontra todos os arquivos (-type f) no diretório de segredos.\n# Usa 'sed' para remover o prefixo do diretório, deixando apenas o caminho relativo.\n# O 'cd' e o '.' no find garantem que obteremos caminhos relativos como 'file.txt'\n# em vez de './file.txt', para corresponder ao formato esperado.\n# Converte tudo para minúsculas.\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"\\nArquivos encontrados:\\n\"\n\n# Verifica se o find retorna algum resultado\nfound_count=$( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f ! -iregex \".*\\_metadata$\" -print | wc --lines ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n# Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"found_count\" \"${found_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO}\n\nif [ \"${found_count}\" -gt 0 ]; then\n  ( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' | sort \u003e \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n  ( cat \"${found_files_sorted}\" | tr '[:upper:]' '[:lower:]' \u003e \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 cat \"${found_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram encontrados arquivos com segredos no diretorio '%s'.\\n\" \"${SECRETS_PATH}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\nfi\n\n\n# --- Passo 3: Comparar as listas e reportar o status ---\n\nprintf \"\\n--- Resultados da Comparacao ---\\n\"\nvalidation_failed=0\n\n# Usa 'comm' para encontrar as diferenças entre os dois arquivos ordenados.\n# - 'comm -23' mostra linhas que são exclusivas do primeiro arquivo (arquivos FALTANDO).\n# - 'comm -13' mostra linhas que são exclusivas do segundo arquivo (arquivos EXTRAS).\n\nif [ \"${CONFIG_CASE_INSENSITIVE}\" -ne 0 ]; then\n  missing_files=$( comm -23 \"${expected_files_sorted}\" \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n  extra_files=$( comm -13 \"${expected_files_sorted}\" \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nelse\n  missing_files=$( comm -23 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n  extra_files=$( comm -13 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nfi\n\nif [ \"x${missing_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:\\n\" \u003e\u00262\n\n  echo \"${missing_files}\" \u003e\u00262\nfi\n\nif [ \"x${extra_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos NAO ESPERADOS foram encontrados:\\n\" \u003e\u00262\n\n  echo \"${extra_files}\" \u003e\u00262\nfi\n\n\n# --- Status Final de Saída ---\n\nif [ \"${validation_failed}\" -ne 0 ]; then\n  printf \"\\nERRO: Verificacao nao foi bem-sucedida.\\n\" \u003e\u00262\n\n  if [ \"${CONFIG_FAIL_DIAGNOSTIC}\" -eq 1 ]; then\n    # Verificar se algum arquivo de segredo existe, mas está vazio.\n    # Se mktemp apresentar erro, emitir o código de erro de validação com falha\n    empty_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\n    ( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f -empty ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' 2\u003e/dev/null | sort \u003e \"${empty_files_sorted}\" )\n    if [ -f \"${empty_files_sorted}\" ]; then\n      printf \"\\nERRO: Diagnostico. Arquivos vazios encontrados.\\n\" \u003e\u00262\n      cat \"${empty_files_sorted}\" \u003e\u00262 || true\n      printf \"\\n\" \u003e\u00262\n      rm \"${empty_files_sorted}\" \u003e\u00262 || true\n      printf \"\\n\" \u003e\u00262\n    fi\n\n    # Recupera os endereços IP do POD.\n    # Entretanto, pode não ser o IP que os ativos de rede irão\n    # observar devido a \"NAT\" de saída no cluster.\n    printf \"\\nERRO: Diagnostico. IP do POD.\\n\" \u003e\u00262\n    ( ip address show \u003e\u00262 2\u003e/dev/null || ifconfig -a \u003e\u00262 2\u003e/dev/null )\n  fi\n\n  exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\nelse\n  printf \"Sucesso! O conteudo do diretorio corresponde a lista esperada.\\n\"\n\n  exit ${EXIT_CODE_SUCCESS}\nfi\n"},"kind":"ConfigMap","metadata":{"annotations":{},"creationTimestamp":null,"name":"sicfd-monitoramento-des-script-bt-check","namespace":"sicfd-des"}}
  creationTimestamp: 2026-05-08T17:08:46Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:bt-check.sh: {}
      f:metadata:
        f:annotations:
          .: {}
          f:kubectl.kubernetes.io/last-applied-configuration: {}
    manager: kubectl-client-side-apply
    operation: Update
    time: 2026-05-08T17:08:46Z
  name: sicfd-monitoramento-des-script-bt-check
  namespace: sicfd-des
  resourceVersion: "2196168020"
  uid: 41bba1b8-1883-4d67-92cf-5d333909c048
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.initContainers[*].name}{"\n"}'
secrets-agent-sidecar secrets-check
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o yaml | grep -B2 -A 15 "initContainers:"
              .: {}
              k:{"name":"registry-secret"}: {}
            f:initContainers:
              .: {}
              k:{"name":"secrets-agent-sidecar"}:
                .: {}
                f:env:
                  .: {}
                  k:{"name":"BT_API_URL"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"BT_API_VERSION"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"BT_VERIFY_CA"}:
                    .: {}
--
      imagePullSecrets:
      - name: registry-secret
      initContainers:
      - env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
        - name: CLIENT_ID
          valueFrom:
            secretKeyRef:
              key: BT_CLIENT_ID
              name: bt-client-secret-sicfd-monitoramento-des
        - name: CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              key: BT_CLIENT_SECRET
              name: bt-client-secret-sicfd-monitoramento-des
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o yaml | grep -B2 -A 20 "^      volumes:"
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - emptyDir:
          medium: Memory
        name: secrets
      - configMap:
          defaultMode: 420
          name: sicfd-monitoramento-des-script-bt-check
        name: script-bt-volume
      - configMap:
          defaultMode: 420
          name: jconnector-config-sicfd-monitoramento
        name: jconnector-config-sicfd-monitoramento
      - configMap:
          defaultMode: 420
          name: mgmtlog-config-sicfd-monitoramento
        name: mgmtlog-config-sicfd-monitoramento
      - configMap:
          defaultMode: 420
          name: portscan-config-sicfd-monitoramento
        name: portscan-config-sicfd-monitoramento
      - name: cfd-publickey
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sicfd-des sicfd-monitoramento-des-90-w79z8
Error from server (NotFound): pods "sicfd-monitoramento-des-90-w79z8" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                            READY     STATUS      RESTARTS        AGE
delete-job-29822700-bzmm7                       0/1       Completed   0               2d13h
delete-job-29824140-v8zrr                       0/1       Completed   0               37h
delete-job-29825580-54zr9                       0/1       Completed   0               13h
sicfd-after-game-des-55-deploy                  0/1       Completed   0               40d
sicfd-after-game-des-56-deploy                  0/1       Completed   0               39d
sicfd-after-game-des-56-r4ndx                   0/1       Running     78 (7m5s ago)   8h
sicfd-consignado-des-54-deploy                  0/1       Completed   0               118d
sicfd-consignado-des-55-deploy                  0/1       Completed   0               117d
sicfd-consignado-des-55-rm9gr                   1/1       Running     0               117d
sicfd-consultas-des-39-deploy                   0/1       Completed   0               42d
sicfd-consultas-des-40-deploy                   0/1       Completed   0               42d
sicfd-consultas-des-40-qvztr                    1/1       Running     0               42d
sicfd-cve-des-23-deploy                         0/1       Completed   0               154d
sicfd-cve-des-24-deploy                         0/1       Completed   0               126d
sicfd-cve-des-24-l8x69                          1/1       Running     0               126d
sicfd-des-95-deploy                             0/1       Completed   0               22d
sicfd-des-96-deploy                             0/1       Completed   0               15d
sicfd-des-96-vp6f8                              1/1       Running     0               15d
sicfd-individualizacao-des-58-deploy            0/1       Completed   0               58d
sicfd-individualizacao-des-59-deploy            0/1       Completed   0               58d
sicfd-individualizacao-des-59-msrb2             1/1       Running     0               58d
sicfd-monitoramento-des-88-deploy               0/1       Completed   0               6d23h
sicfd-monitoramento-des-88-l6lxl                1/1       Running     2 (18h ago)     6d23h
sicfd-monitoramento-des-90-deploy               0/1       Error       0               6d22h
sicfd-monitoramento-des-91-deploy               0/1       Error       0               15m
sicfd-pgfn-des-149-deploy                       0/1       Completed   0               11d
sicfd-pgfn-des-150-deploy                       0/1       Completed   0               2d1h
sicfd-pgfn-des-150-rnngl                        1/1       Running     0               2d1h
sicfd-resposta-assincrona-des-223-deploy        0/1       Completed   0               105d
sicfd-resposta-assincrona-des-224-deploy        0/1       Completed   0               63d
sicfd-resposta-assincrona-des-224-xwfk7         1/1       Running     0               63d
sicfd-resposta-assincrona-pgfn-des-104-deploy   0/1       Completed   0               14d
sicfd-resposta-assincrona-pgfn-des-105-457tj    1/1       Running     0               13d
sicfd-resposta-assincrona-pgfn-des-105-deploy   0/1       Completed   0               13d
sicfd-retificacao-financeira-des-79-deploy      0/1       Completed   0               25d
sicfd-retificacao-financeira-des-80-deploy      0/1       Completed   0               22d
sicfd-retificacao-financeira-des-80-jq578       1/1       Running     1 (20d ago)     22d
-sh-4.2$
