1. Mostre o erro na hora (os pacotes já estão no repositório do 471). Antes, abra o log no 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WELD-0014|WELD-001408|WFLYCTL0013|Unsatisfied|at injection point|ERROR"

No CLI do 471, um de cada vez (o deploy vai falhar e ser revertido, sem impacto nos outros módulos):

deploy --name=SIFEC-EMP --server-groups=sifec-intranet
deploy --name=SIEMP-EMPRESAS --server-groups=sifec-intranet

A linha at injection point ... mostra exatamente qual classe injeta qual bean. É isso que ele precisa ver.

2. O que falar para ele:

Jefferson, os dois módulos sobem no 7.4 até o CDI, e aí a implantação é revertida com WELD-001408: Unsatisfied dependencies:

SIFEC-EMP: o VeiculosTotalizadorBean é injetado pela interface, mas o bean não fica disponível por ela.
SIEMP-EMPRESAS: o mesmo caso com o ParametrizacaoBean.

O Weld do EAP 7.4 é mais rígido que o do 6.4. As causas mais comuns são:

O bean não declara implements da interface que está sendo injetada.
EJB (@Stateless/@Singleton) sem @Local(Interface.class) ou sem a interface na assinatura, quando injetado por ela.
O módulo onde o bean está sem beans.xml, ou com bean-discovery-mode="annotated" e a classe sem anotação de escopo.

Do lado do ambiente já testamos o que dava (inclusive a configuração do Weld) e não resolveu. O ajuste é no código. Assim que tiver o build, manda o link do Nexus que a gente sobe e acompanha.

3. Se ele também cuidar do RURAL, aproveite:

No SIFEC-RURAL 2.115.0.1, o pacote atual é do 6.4 e traz o jackson-jaxrs-json-provider junto, o que gera WELD-001318 (dependência ambígua com o do EAP 7.4). O ajuste é deixar resteasy-* e jackson-* como provided no pom, como o Inocêncio fez no SICDT.

4. Combine o próximo passo antes de ele sair: quando ele envia os builds, e se prefere que vocês subam juntos na sala.
