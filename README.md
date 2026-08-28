Analisado o pipeline do sibko-originacao-digital-api-dossie. O erro (NU1101, no dotnet restore do Dockerfile) ocorre porque o projeto depende do pacote Sibko.Shared.Sso.Token via NuGet, e esse pacote está publicado apenas no Nexus interno (binario.caixa), não no nuget.org. Não há NuGet.Config nem credenciais configuradas no Dockerfile/pipeline para acessar esse feed privado, por isso o restore falha.

Não encontramos essa referência dentro do próprio repositório (não há PackageReference a Sibko.Shared.Sso.Token no csproj principal, nem pasta de código-fonte compartilhado). Buscamos pelo termo no repositório via GitHub e não retornou resultado, então a referência deve estar em outro csproj do repo (possivelmente na pasta Tests) que não foi possível confirmar por essa via.

Como comparação, o projeto sibko-pos-venda-process resolve isso de forma diferente: ele não usa o Nexus (uses_nexus: false) porque inclui o código do Sibko.Shared diretamente como source dentro do próprio repositório (pasta shared/Sibko.Shared), em vez de consumir como pacote externo.

Encaminhamos para que o time avalie qual caminho seguir: configurar acesso ao Nexus (URL do feed + usuário/senha) no pipeline do dossie, ou adotar o mesmo padrão do pos-venda-process trazendo o Sibko.Shared como código-fonte local.
