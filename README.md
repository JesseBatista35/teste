Prezados, boa noite.

Feitas as referidas atualizações no arquivo responsável pelo envio dos eventos. Mesmo assim, não consigo localizá-los no Insights. Poderiam confirmar para mim que estão disponíveis após a atualização?

Segue novamente link da classe correspondente, já atualizada, para eventuais averiguações:

https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/telemetry/OpenTelemetryAlvaraAcEventPublisher.java


package br.gov.caixa.sigsj.alvara.telemetry;

import br.gov.caixa.sigsj.alvara.model.tables.ChavePrimariaComum;
import br.gov.caixa.sigsj.alvara.model.tables.V01LevantamentoDepositoJudicial;
import br.gov.caixa.sigsj.alvara.repositories.db.TribunalRepository;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.ZoneId;
import java.util.Date;

@ApplicationScoped
public class OpenTelemetryAlvaraAcEventPublisher implements AlvaraAcEventPublisher {
    public static final String EVENT_NAME = "alvara_ac_snapshot";
    private static final AttributeKey<String> EVENT_NAME_ATTRIBUTE =
            AttributeKey.stringKey("microsoft.custom_event.name");

    private final Logger logger;
    private final AlvaraTelemetry telemetry;
    private final TribunalRepository tribunalRepository;

    @Inject
    public OpenTelemetryAlvaraAcEventPublisher(
            OpenTelemetryLogProvider logProvider,
            AlvaraTelemetry telemetry,
            TribunalRepository tribunalRepository) {
        this(logProvider.getLogger(), telemetry, tribunalRepository);
    }

    OpenTelemetryAlvaraAcEventPublisher(
            Logger logger,
            AlvaraTelemetry telemetry,
            TribunalRepository tribunalRepository) {
        this.logger = logger;
        this.telemetry = telemetry;
        this.tribunalRepository = tribunalRepository;
    }

    @Override
    public void publicar(
            V01LevantamentoDepositoJudicial alvara,
            String snapshotId,
            String snapshotAt) {
        LogRecordBuilder event = logger.logRecordBuilder();
        event.setAttribute(EVENT_NAME_ATTRIBUTE, EVENT_NAME);
        event.setSeverity(Severity.INFO);
        atributo(event, "snapshot_id", snapshotId);
        atributo(event, "snapshot_at", snapshotAt);
        atributo(event, "snapshot_empty", Boolean.FALSE.toString());

        ChavePrimariaComum chave = alvara.chavePrimaria();
        TribunalContext contexto = contextoTribunal(alvara);
        atributo(event, "alvara_id", identificadorAlvara(chave));
        atributo(event, "status", valor(alvara.coSituacaoLevantamento()));
        atributo(event, "tipo_alvara", valor(alvara.tipoAlvara()));
        atributo(event, "tribunal", contexto.getSiglaTribunal());
        atributo(event, "esfera", contexto.getEsfera());
        atributo(event, "sigsj.alvara.numero_levantamento",
                valor(chave == null ? null : chave.nuLevantamento()));
        atributo(event, "sigsj.alvara.data_levantamento",
                dataLevantamento(chave == null ? null : chave.dtLevantamento()));
        atributo(event, "sigsj.alvara.codigo_levantamento",
                valor(chave == null ? null : chave.coTipoLevantamento()));
        atributo(event, "sigsj.alvara.digito_verificador",
                valor(chave == null ? null : chave.dvNuLevantamento()));
        atributo(event, "sigsj.alvara.status", valor(alvara.coSituacaoLevantamento()));
        atributo(event, "sigsj.alvara.nsu", valor(alvara.nuNsuLevantamento()));
        atributo(event, "sigsj.alvara.esfera_justica", valor(alvara.nuEsferaJustica()));
        atributo(event, "sigsj.alvara.tribunal_cnj", valor(alvara.nuTribunalCnj()));
        atributo(event, "sigsj.alvara.numero_alvara", valor(alvara.coLevantamentoTribunal()));
        atributo(event, "sigsj.alvara.codigo_tribunal", valor(alvara.nuTribunalCnj()));
        atributo(event, "sigsj.alvara.data_recepcao", dataRecepcao(alvara.tsRecepcaoLevantamento()));
        atributo(event, "sigsj.alvara.tipo_alvara", contexto.getTipoAlvara());
        event.emit();

        registrarMetricaAlvaraAc(alvara, contexto);
    }

    @Override
    public void publicarSnapshotVazio(String snapshotId, String snapshotAt) {
        LogRecordBuilder event = logger.logRecordBuilder();
        event.setAttribute(EVENT_NAME_ATTRIBUTE, EVENT_NAME);
        event.setSeverity(Severity.INFO);
        atributo(event, "snapshot_id", snapshotId);
        atributo(event, "snapshot_at", snapshotAt);
        atributo(event, "snapshot_empty", Boolean.TRUE.toString());
        event.emit();
    }

    private TribunalContext contextoTribunal(V01LevantamentoDepositoJudicial alvara) {
        Integer esferaCodigo = alvara.nuEsferaJustica();
        Integer tribunalCodigo = alvara.nuTribunalCnj();
        String esfera = TribunalContext.esferaComoTexto(esferaCodigo);
        String tribunal = esferaCodigo == null || tribunalCodigo == null || tribunalRepository == null
                ? TribunalContext.VALOR_DESCONHECIDO
                : tribunalRepository.buscarSiglaTribunal(esferaCodigo, tribunalCodigo)
                        .map(String::trim)
                        .filter(sigla -> !sigla.isEmpty())
                        .orElse(TribunalContext.VALOR_DESCONHECIDO);

        return TribunalContext.of(alvara.tipoAlvara(), tribunal, esfera);
    }

    private void registrarMetricaAlvaraAc(
            V01LevantamentoDepositoJudicial alvara,
            TribunalContext contexto) {
        if (telemetry != null) {
            telemetry.registrarAlvaraAc(
                    alvara.tipoAlvara(),
                    contexto.getSiglaTribunal(),
                    contexto.getEsfera());
        }
    }

    private static String identificadorAlvara(ChavePrimariaComum chave) {
        if (chave == null) {
            return TribunalContext.VALOR_DESCONHECIDO;
        }
        return String.join("|",
                valor(chave.nuLevantamento()),
                dataLevantamento(chave.dtLevantamento()),
                valor(chave.coTipoLevantamento()),
                valor(chave.dvNuLevantamento()));
    }

    private static String dataLevantamento(Date data) {
        if (data == null) {
            return "";
        }
        if (data instanceof java.sql.Date sqlDate) {
            return sqlDate.toLocalDate().toString();
        }
        return data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
    }

    private static String dataRecepcao(Date data) {
        return data == null ? "" : valor(data.toInstant());
    }

    private static void atributo(LogRecordBuilder event, String chave, String valor) {
        event.setAttribute(AttributeKey.stringKey(chave), valor);
    }

    private static String valor(Object valor) {
        return valor == null ? "" : valor.toString();
    }
}


