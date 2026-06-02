Confirmação rápida (1 minuto, reversível)
Pra cravar isso, seta a senha do MQ como valor literal temporário (sem ${}, e env var é static-init-safe):
bashoc set env dc/sifug-siofg-api-des QUARKUS_SIOFG_IBM_MQ_PASSWORD='teste123' -n sifug-des
oc get pods -n sifug-des -w | grep siofg-api-des
Se o pod passar do SRCFG00011 (ele vai subir mais ou falhar lá na frente na autenticação real do MQ, o que é esperado com senha falsa), está confirmado: o problema é só o source de arquivo não estar disponível na fase certa. Depois reverte:
bashoc set env dc/sifug-siofg-api-des QUARKUS_SIOFG_IBM_MQ_PASSWORD='${SIFUG_XMQD1}' -n sifug-des
A correção definitiva
A solução limpa, que mantém o modelo do BeyondTrust (segredo só em arquivo, nunca materializado no deployment), é adicionar no app um ConfigSource próprio anotado com @StaticInitSafe que lê o mesmo diretório. Aí o valor passa a estar disponível também na static init. São poucas linhas:
javapackage br.gov.caixa.siofg.config;

import io.quarkus.runtime.configuration.StaticInitSafe;
import org.eclipse.microprofile.config.spi.ConfigSource;
import java.nio.file.*;
import java.util.*;

@StaticInitSafe
public class SecretsFileConfigSource implements ConfigSource {
    private static final Path DIR = Paths.get("/usr/src/app/secrets_files/SIOFG_DES");
    private final Map<String, String> props = new HashMap<>();

    public SecretsFileConfigSource() {
        if (Files.isDirectory(DIR)) {
            try (DirectoryStream<Path> ds = Files.newDirectoryStream(DIR)) {
                for (Path p : ds) {
                    if (Files.isRegularFile(p) && !p.getFileName().toString().endsWith("_Metadata")) {
                        props.put(p.getFileName().toString(),
                                  new String(Files.readAllBytes(p)).trim());
                    }
                }
            } catch (Exception ignored) { }
        }
    }
    @Override public Map<String,String> getProperties() { return props; }
    @Override public Set<String> getPropertyNames() { return props.keySet(); }
    @Override public String getValue(String name) { return props.get(name); }
    @Override public String getName() { return "secrets-file-static-init"; }
    @Override public int getOrdinal() { return 270; }
}
E registra via ServiceLoader, criando o arquivo:
src/main/resources/META-INF/services/org.eclipse.microprofile.config.spi.ConfigSource
com uma linha:
br.gov.caixa.siofg.config.SecretsFileConfigSource
Esse source lê o diretório nas duas fases (ordinal 270: acima do application.properties, abaixo das env vars), e o @StaticInitSafe é o que faz o Quarkus considerá-lo já na static init. Aí o ${SIFUG_XMQD1} expande normalmente. Com isso você pode até remover a dependência smallrye-config-source-file-system e o env SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS, já que esse source passa a cobrir tudo — mas dá pra deixar os dois convivendo também.
Depois é rebuild + redeploy (o novo deploy 272 que apareceu na sua lista está no mesmo CrashLoop, então vai precisar da imagem nova).
Uma alternativa menos invasiva, se mexer no código não for viável agora: trocar o @ConfigMapping da senha do MQ por uma leitura lazy em runtime (injetar via @ConfigProperty só no ponto onde a connection factory do JMS é criada, em vez de um mapping validado no boot). Aí a resolução cai pra fase de runtime, onde o filesystem source já está ativo. Mas isso depende de como o quarkus.siofg.ibm.mq está modelado hoje no seu código — se quiser seguir por esse caminho, me mostra a interface/classe de config do MQ que eu te ajudo a ajustar.
Quer que eu monte os arquivos da correção (a classe + o arquivo de services) prontos pra você commitar?
