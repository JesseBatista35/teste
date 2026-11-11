Dá para descobrir a versão desse pacote pelo arquivo guardado no repositório de conteúdo do DC. Na 471, como root:

find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content'

Isso mostra o caminho do arquivo. Depois, para ver a versão dentro dele:

unzip -p $(find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content') 'META-INF/maven/*/pom.properties'
unzip -p $(find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content') META-INF/MANIFEST.MF

O pom.properties mostra o version=. O MANIFEST pode trazer Implementation-Version ou a data do build.

Se os dois vierem vazios, liste o conteúdo, porque às vezes a versão está no nome dos módulos internos:

unzip -l $(find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content')

Com a versão em mãos, a gente confere com a planilha e com o João Pedro:

Se bater com a planilha: fica esse pacote mesmo, que já está validado com a API 200.
Se não bater: subimos o da planilha. Também vale perguntar ao João Pedro de onde veio esse sifec-ccr-parametros.ear sem versão.
