Identificada causa raiz da indisponibilidade do ambiente SISME DES: esgotamento de memória Metaspace da JVM (OutOfMemoryError: Metaspace), evidenciado em server.log a partir de 05/08/2026, 10:29h. Parâmetro MaxMetaspaceSize (anteriormente 256m) insuficiente para a carga da aplicação.

Ação corretiva: ajuste das variáveis JVM_METASPACE_MIN (256M) e JVM_METASPACE_MAX (512m) no grupo de variáveis SISME-DES no Azure DevOps, seguido de disparo de nova release para aplicação via pipeline. Validado que o processo JBoss subiu com os novos parâmetros (confirmado via ps -ef) e aplicação implantada com sucesso (sisme-ear.ear), sem erros no boot.

Ambiente restabelecido às 14:14h. Recomendado acompanhamento contínuo para identificar possível vazamento de classloader como causa raiz de fundo.
