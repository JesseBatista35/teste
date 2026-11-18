gec-ejb/src/main/resources/META-INF/beans.xml
 
    bean-discovery-mode="annotated">
 
Como Resolver (Definitivo no código e Teste Agora)
 
1. No código-fonte (para a sua nova release)
Além de manter bean-discovery-mode="all" no gec-ejb/src/main/resources/META-INF/beans.xml, remova a tag <resources><resource-root path="gec-ejb.jar" /></resources> do arquivo gec-ear/src/main/application/META-INF/jboss-deployment-structure.xml (pois como <ear-subdeployments-isolated>false</ear-subdeployments-isolated> já está definido, o gec-batch.jar e o gec-api.war já enxergam o gec-ejb.jar naturalmente sem precisar duplicá-lo como resource-root).
 
 
Aqui está o Manual Técnico Completo de Correção no Repositório (gec-ear) para o profile batch no JBoss EAP 7.4.
 
Este documento consolida todas as correções estruturais, de código-fonte e de empacotamento descobertas durante o diagnóstico e validadas no servidor caddeapllx2884 para que a aplicação suba sem erros (gec-ear.ear.deployed).
 
 
Manual de Adequação do Repositório gec-ear (Profile Batch — JBoss EAP 7.4)
 
1. Visão Geral dos Problemas Encontrados
Durante a subida do pacote gec-ear.ear no JBoss EAP 7.4, foram identificados quatro problemas estruturais no empacotamento e no código do profile batch:
 
Falha de Descoberta de Beans CDI (WELD-001408): O gec-ejb.jar estava configurado com bean-discovery-mode="annotated", fazendo com que o Weld ignorasse as classes DAO (como DAOArquivoInterfaceCaixaFebraban, DAOParametroCaixa, etc.) que não possuem anotações explícitas de escopo CDI.
Duplo Carregamento de ClassLoader (IllegalArgumentException: Can not set ... to ...Proxy$): O jboss-deployment-structure.xml declarava o gec-ejb.jar como <resource-root> no nível <deployment> do EAR, carregando as classes do EJB duas vezes em ClassLoaders distintos (pai e submódulo).
Duplicidade de 293 Classes entre gec-ejb.jar e gec-batch.jar: O build Maven do profile batch estava empacotando as mesmas classes de batch (MDBs, Timers e classes base) dentro dos dois módulos simultaneamente, gerando conflito de inicialização EJB.
Método Abstrato Não Implementado (AbstractMethodError: getNomeFluxo()): Duas classes EJB filhas de AbstractGerenciadorTimers / AbstractGerenciadorTimersSemBMT não implementavam o novo método abstrato getNomeFluxo().
 
 
2. Alterações Obrigatórias no Código-Fonte e Descritores
 
Passo 1: Ajustar o escaneamento CDI no beans.xml do módulo gec-ejb
Arquivo: gec-ejb/src/main/resources/META-INF/beans.xml
 
O que alterar: Mudar o atributo bean-discovery-mode de "annotated" para "all".
Motivo: Permite que o container CDI (Weld) descubra e injete automaticamente todas as classes DAO e de integração do módulo gec-ejb.jar sem exigir anotações de escopo em cada classe legada.
 
Como o arquivo deve ficar:
 
xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://jcp.org"xmlns:xsi="http://w3.org"xsi:schemaLocation="http://jcp.org http://jcp.org/beans_1_1.xsd"version="1.1"bean-discovery-mode="all">
    <interceptors>
        <class>br.gov.caixa.arqrefcore.cobol.conversor.grafo.GraphInterceptor</class>
        <class>br.gov.caixa.arqrefcore.validacao.ValidationInterceptor</class>
        <class>br.gov.caixa.arqrefcore.log.LoggerIntercepter</class>
    </interceptors>
</beans>
Use o código com cuidado.
 
 
Passo 2: Remover <resource-root path="gec-ejb.jar" /> do jboss-deployment-structure.xml
Arquivo: gec-ear/src/main/application/META-INF/jboss-deployment-structure.xml (ou a variante utilizada pelo profile batch)
 
O que alterar: Remover completamente o bloco <resources><resource-root path="gec-ejb.jar" /></resources> de dentro da tag <deployment>.
Motivo: Como <ear-subdeployments-isolated>false</ear-subdeployments-isolated> já está definido, todos os submódulos (gec-batch.jar e gec-api.war) já enxergam o gec-ejb.jar naturalmente. Mantê-lo como <resource-root> duplica o ClassLoader e quebra as injeções @EJB / @Inject com IllegalArgumentException: Can not set ... to ...Proxy$.
 
Como o arquivo deve ficar:
 
xml
<jboss-deployment-structure>
    <!-- Make sub deployments isolated by default, so they cannot see each others
         classes without a Class-Path entry -->    <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
    <deployment>
        <exclusions>
            <module name="cef" />
        </exclusions>
        <dependencies>
            <module name="deployment.framework_sisgd.jar" />
            <module name="deployment.framework.jar" />
        </dependencies>
    </deployment>
    <!-- Profile BATCH: gec-web não é empacotado no EAR -->    <sub-deployment name="gec-api.war">
        <exclusions>
            <module name="cef" />
        </exclusions>
        <dependencies>
            <module name="deployment.framework.jar" />
            <module name="deployment.framework_sisgd.jar" />
        </dependencies>
    </sub-deployment>
</jboss-deployment-structure>
Use o código com cuidado.
 
 
Passo 3: Implementar o método getNomeFluxo() nas classes de Timer
Motivo: A superclasse AbstractGerenciadorTimers / AbstractGerenciadorTimersSemBMT exige a implementação de public String getNomeFluxo(), mas duas classes filhas estavam sem o método, causando java.lang.AbstractMethodError na subida do EJB.
 
Adicione a implementação do método nas duas classes abaixo (em gec-ejb ou gec-batch, conforme a localização no projeto):
 
Classe: br.gov.caixa.sigec.negocio.AcatamentoAutomaticoIndependenteContaSalarioBean

java
@Overridepublic String getNomeFluxo() {
    return "AcatamentoAutomaticoIndependenteContaSalario";
}
Use o código com cuidado.
 
Classe: br.gov.caixa.sigec.negocio.TEDSolicitacaoExternaBean

java
@Overridepublic String getNomeFluxo() {
    return "TEDSolicitacaoExterna";
}
Use o código com cuidado.
 
 
(Ajuste a String de retorno caso haja uma constante ou padrão específico de log utilizado nos demais beans).
 
 
Passo 4: Eliminar a duplicidade de classes entre gec-ejb.jar e gec-batch.jar no Maven
Arquivos: gec-ejb/pom.xml, gec-batch/pom.xml e gec-ear/pom.xml
 
O que verificar e ajustar: No empacotamento do profile batch, foram encontradas 293 classes duplicadas presentes simultaneamente dentro de gec-ejb.jar e gec-batch.jar (incluindo GerenciadorTimersBean, EnvioTedListenerBean, PagamentoTedListenerBean, AbstractGerenciadorTimers, InicializadorBancoDadosBean, etc.).
Como corrigir:
Garantir que o módulo gec-batch dependa de gec-ejb com <scope>provided</scope> no gec-batch/pom.xml, para que o Maven compile contra gec-ejb, mas não copie as classes compiladas do gec-ejb para dentro do gec-batch.jar.
Garantir que no profile batch do gec-ejb/pom.xml não haja configuração de maven-jar-plugin ou build-helper incluindo pacotes exclusivos do gec-batch.
Cada classe .class deve existir em apenas um JAR dentro do gec-ear.ear.
 
 
3. Validação Local Antes de Subir na Esteira
Antes de fazer o commit/merge para a esteira de deploy, execute a compilação limpa e valide o .ear gerado localmente:
 
 
1. Compilar todo o projeto do zero
bash
mvn clean package -Pbatch
Use o código com cuidado.
 
(O uso obrigatório do clean garante que não sobrem arquivos .class antigos de builds anteriores).
 
 
2. Conferir o beans.xml dentro do gec-ejb.jar gerado
Verifique se bean-discovery-mode="all" está presente no artefato final (target/gec-ear.ear).
 
 
3. Conferir o jboss-deployment-structure.xml dentro do gec-ear.ear gerado
Verifique se não existe nenhuma tag <resource-root path="gec-ejb.jar" />.
 
 
4. Conferir se não há classes duplicadas entre gec-ejb.jar e gec-batch.jar
Você pode rodar este comando rápido (Linux/Git Bash/WSL) sobre o .ear gerado na pasta target/ para garantir que a interseção de classes seja zero:
 
bash
python3 -c '
import zipfile, io
with zipfile.ZipFile("gec-ear/target/gec-ear.ear") as z:
    ejb = {f for f in zipfile.ZipFile(io.BytesIO(z.read("gec-ejb.jar"))).namelist() if f.endswith(".class")}
    batch = {f for f in zipfile.ZipFile(io.BytesIO(z.read("gec-batch.jar"))).namelist() if f.endswith(".class")}
    dup = ejb & batch
    print("Classes duplicadas:", len(dup))
    if dup:
        print("\n".join(sorted(dup)[:10]))
'
Use o código com cuidado.
 
Resultado esperado: Classes duplicadas: 0.
 
 
4. Resumo das Configurações Já Aplicadas no Servidor (caddeapllx2884)
Para registro da equipe de infraestrutura e desenvolvimento, o servidor JBoss EAP 7.4 já está configurado e pronto com:
 
Datasources DB2: java:/jdbc/DB2SiempDS, java:/jdbc/DB2SigecDS e java:/jdbc/DB2SifecDS.
Mensageria (remoteJMS): Todas as filas e connection factories (queueRecebimentoTed, queueEnvioTed, queueRspPagamentoTed, queueVerificacaoTed, etc.) e o adaptador wmq.jmsra.rar implantado.
Subsistema Weld: Configurado com require-bean-descriptor=false.
Segurança (Elytron / Undertow): Conflito ELY01148 resolvido (subsistema legado keycloak removido e domínio other vinculado ao ApplicationDomain).
 
 
 
 
 
 
