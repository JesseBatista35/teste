Pessoal, sobre o SIFEC-RURAL 2.115.0.1:
O bloqueio de ambiente foi resolvido (o truststore do servidor estava com caminho de Windows; criamos um com a cadeia AC Icptestes da Caixa). Subimos a rural-2.115.0.1-b2446.ear, mas a implantação é revertida por empacotamento:
WELD-001318: Cannot resolve an ambiguous dependency ... JacksonJaxbJsonProvider / RESTEASY003940: Unable to instantiate MessageBodyReader
Esse build é do 6.4 e traz o jackson-jaxrs-json-provider dentro do pacote, que o EAP 7.4 já fornece. Com duas cópias, o CDI não sabe qual usar.
Ajuste necessário no pom: deixar resteasy-* e jackson-* (core, annotations, databind, jaxrs-json-provider) como provided, igual ao que o Inocêncio fez no SICDT, e gerar um build da 2.115.0.1 para o 7.4.
@Paulo, quem é o dev responsável pelo RURAL para mandarmos isso?
