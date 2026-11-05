Pablo, o build 184314-9 não subiu, a implantação foi revertida:
WELD-001408: Unsatisfied dependencies for type Usuario with qualifiers @UsuarioContexto
É o mesmo erro de CDI da manhã, provavelmente o produtor do @UsuarioContexto Usuario mudou com a alteração no KeycloakPrincipal. Vale conferir se o método @Produces @UsuarioContexto ainda existe e se a classe que o contém tem anotação de escopo (@RequestScoped/@ApplicationScoped) ou está num módulo com beans.xml.
O ambiente segue com as properties do SICCR/SSO aplicadas e o SSO do Undertow ativo. É só mandar o próximo build que a gente sobe.
