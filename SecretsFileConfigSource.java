package br.gov.caixa.siofg.config;

import io.quarkus.runtime.configuration.StaticInitSafe;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ConfigSource que lê os segredos gravados em arquivo pelo sidecar do BeyondTrust
 * (um arquivo por segredo: o nome do arquivo e a chave, o conteudo e o valor) e os
 * disponibiliza como propriedades de configuracao do MicroProfile/SmallRye.
 *
 * Diferente do smallrye-config-source-file-system (que e uma lib generica e NAO e
 * static-init-safe), esta classe e anotada com @StaticInitSafe. E isso que faz o
 * Quarkus considerar este source tambem na fase de static init, permitindo expandir
 * placeholders como ${SIFUG_XMQD1} em @ConfigMapping validados ja no boot.
 *
 * O diretorio e lido a partir de SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS (mesma variavel
 * que a esteira ja injeta), com fallback para o caminho padrao. Aceita multiplas
 * locations separadas por virgula.
 */
@StaticInitSafe
public class SecretsFileConfigSource implements ConfigSource {

    private static final String DEFAULT_DIR = "/usr/src/app/secrets_files/SIOFG_DES";
    private static final String NAME = "secrets-file-static-init";
    private static final int ORDINAL = 270;

    private final Map<String, String> properties;

    public SecretsFileConfigSource() {
        this.properties = Collections.unmodifiableMap(load());
    }

    private Map<String, String> load() {
        Map<String, String> map = new HashMap<>();
        for (String location : resolveLocations()) {
            String trimmed = location.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            Path dir = Paths.get(trimmed);
            if (!Files.isDirectory(dir)) {
                continue;
            }
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                for (Path file : stream) {
                    String key = file.getFileName().toString();
                    // ignora os arquivos *_Metadata (JSON) que o sidecar tambem grava
                    if (!Files.isRegularFile(file) || key.endsWith("_Metadata")) {
                        continue;
                    }
                    map.put(key, stripTrailingNewline(new String(Files.readAllBytes(file))));
                }
            } catch (IOException e) {
                // Nao derruba o boot por causa de um diretorio; apenas ignora esta location.
                System.err.println("[" + NAME + "] falha ao ler " + dir + ": " + e.getMessage());
            }
        }
        return map;
    }

    private String[] resolveLocations() {
        String configured = System.getenv("SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS");
        if (configured == null || configured.isEmpty()) {
            configured = System.getProperty("smallrye.config.source.file.locations");
        }
        if (configured == null || configured.isEmpty()) {
            configured = DEFAULT_DIR;
        }
        return configured.split(",");
    }

    /**
     * Remove apenas quebras de linha no final (o sidecar costuma gravar um \n ao final
     * do arquivo). Nao usa trim() para nao corromper segredos com espacos significativos.
     */
    private static String stripTrailingNewline(String value) {
        int end = value.length();
        while (end > 0 && (value.charAt(end - 1) == '\n' || value.charAt(end - 1) == '\r')) {
            end--;
        }
        return value.substring(0, end);
    }

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public Set<String> getPropertyNames() {
        return properties.keySet();
    }

    @Override
    public String getValue(String propertyName) {
        return properties.get(propertyName);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getOrdinal() {
        return ORDINAL;
    }
}
