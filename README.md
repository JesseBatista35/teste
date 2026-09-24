entender o destino desses eventos e se eles estão sendo ignorados pelo Application Insights ou nem estão saindo da aplicação.

Prezados, boa tarde.

Estamos mantendo um ecossistema de aplicações de depósitos judiciais sob a sigla SIGSJ. Uma equipe da CEMOT está nos auxiliando com um painel negocial que contém informações sobre esse ecossistema.

A aplicação possui um coletor em operação criado pela própria CEMOT, disponível no endpoint: otel-collector-nprd.cemot.cloud.caixa. 

Nossa aplicação utilizava OTLP para enviar métricas customizadas para o coletor da CEMOT, enquanto enviada métricas e traces ao LDAI da Subscrição através de autoinstrumentation e um agente injetado.

As métricas, traces e logs correspondentes estão acessíveis através do painel Grafana a seguir, com as fontes configuradas:
https://grafana-nprd.cemot.cloud.caixa/d/ad69xa2/alvara-poc-monitoracao

O problema é que estamos agora tentando enviar customEvents da aplicação, conforme código-fonte, atualmente em execução no OKD, disponível a seguir:

https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/telemetry/OpenTelemetryAlvaraAcEventPublisher.java

Criamos o evento com LogRecordBuilder event = logger.logRecordBuilder(); e o preenchemos conforme documentações da linguagem.

No entanto, não constam esses eventos customizados no insights. Esperávamos algo assim:

     -> alvara_id: Str(24963|2026-09-23|2|1)
     -> esfera: Str(trabalhista)
     -> microsoft.custom_event.name: Str(alvara_ac_snapshot)
     -> sigsj.alvara.codigo_levantamento: Str(2)
     -> sigsj.alvara.codigo_tribunal: Str(6)
     -> sigsj.alvara.data_levantamento: Str(2026-09-23)
     -> sigsj.alvara.data_recepcao: Str(2026-09-23T14:30:09.348Z)
     -> sigsj.alvara.digito_verificador: Str(1)
     -> sigsj.alvara.esfera_justica: Str(5)
     -> sigsj.alvara.nsu: Str(3178841)
     -> sigsj.alvara.numero_alvara: Empty()
     -> sigsj.alvara.numero_levantamento: Str(24963)
     -> sigsj.alvara.status: Str(AC)
     -> sigsj.alvara.tipo_alvara: Str(creditoEmConta)
     -> sigsj.alvara.tribunal_cnj: Str(6)
     -> snapshot_at: Str(2026-09-24T15:08:48.060396800Z)
     -> snapshot_empty: Str(false)
     -> snapshot_id: Str(dcdfd310-fc3f-4f68-9a3a-d88b8d574f7c)
     -> status: Str(AC)
     -> tipo_alvara: Str(creditoEmConta)
     -> tribunal: Str(TRT6)

Gostaria então de entender o destino desses eventos e se eles estão sendo ignorados pelo Application Insights ou nem estão saindo da aplicação.

Agradeço desde já!

Referências: 
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/infrastructure/jobs/AlvaraAcScheduler.java
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/infrastructure/jobs/AlvaraAcMonitor.java
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/repositories/db/JpaAlvaraAcMonitoradoRepository.java
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/telemetry/AlvaraTelemetry.java
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/java/br/gov/caixa/sigsj/alvara/telemetry/OpenTelemetryLogProvider.java
https://devops.caixa/projetos/Caixa/_git/SIGSJ-alvara?path=src/main/resources/application.yml


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




package br.gov.caixa.sigsj.alvara.infrastructure.jobs;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.jbosslog.JBossLog;

import static io.quarkus.scheduler.Scheduled.ConcurrentExecution.SKIP;

@JBossLog
@ApplicationScoped
public class AlvaraAcScheduler {
    static final String INTERVALO_PADRAO = "${sigsj.scheduler.interval:5m}";
    static final String IDENTIDADE_MONITORAMENTO = "sigsj.scheduler.alvara-ac";

    private final AlvaraAcMonitor monitor;

    @Inject
    public AlvaraAcScheduler(AlvaraAcMonitor monitor) {
        this.monitor = monitor;
    }

    @Scheduled(
            every = INTERVALO_PADRAO,
            concurrentExecution = SKIP,
            identity = IDENTIDADE_MONITORAMENTO)
    public void executar() {
        try {
            monitor.executar();
        } catch (RuntimeException exception) {
            log.error("Falha no ciclo de monitoramento de alvaras AC", exception);
        }
    }
}


package br.gov.caixa.sigsj.alvara.infrastructure.jobs;

import br.gov.caixa.sigsj.alvara.model.tables.V01LevantamentoDepositoJudicial;
import br.gov.caixa.sigsj.alvara.repositories.db.AlvaraAcMonitoradoRepository;
import br.gov.caixa.sigsj.alvara.telemetry.AlvaraAcEventPublisher;
import br.gov.caixa.sigsj.alvara.telemetry.AlvaraTelemetry;
import br.gov.caixa.sigsj.alvara.telemetry.TribunalContext;
import br.gov.caixa.sigsj.alvara.telemetry.TribunalContextResolver;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.jbosslog.JBossLog;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JBossLog
@ApplicationScoped
public class AlvaraAcMonitor {
    private final AlvaraAcMonitoradoRepository repository;
    private final AlvaraAcEventPublisher eventPublisher;
    private final TribunalContextResolver tribunalContextResolver;
    private final AlvaraTelemetry telemetry;

    @Inject
    public AlvaraAcMonitor(
            AlvaraAcMonitoradoRepository repository,
            AlvaraAcEventPublisher eventPublisher,
            TribunalContextResolver tribunalContextResolver,
            AlvaraTelemetry telemetry) {
        this.repository = repository;
        this.eventPublisher = eventPublisher;
        this.tribunalContextResolver = tribunalContextResolver;
        this.telemetry = telemetry;
    }

    public void executar() {
        var alvaras = repository.buscarTodosAguardandoConciliacao();
        String snapshotId = UUID.randomUUID().toString();
        String snapshotAt = Instant.now().toString();
        List<V01LevantamentoDepositoJudicial> alvarasAc = new ArrayList<>();
        int publicados = 0;
        for (V01LevantamentoDepositoJudicial alvara : alvaras) {
            if (!V01LevantamentoDepositoJudicial.CO_SITUACAO_A_CONCILIAR.equals(alvara.coSituacaoLevantamento())) {
                continue;
            }
            alvarasAc.add(alvara);
            try {
                eventPublisher.publicar(alvara, snapshotId, snapshotAt);
                publicados++;
            } catch (RuntimeException exception) {
                log.errorf(exception, "Falha ao emitir custom event do alvara %s", numeroLevantamento(alvara));
            }
        }
        if (alvarasAc.isEmpty()) {
            eventPublisher.publicarSnapshotVazio(snapshotId, snapshotAt);
        }
        log.infof("Monitoramento de alvaras AC concluido: %d/%d custom events emitidos", publicados, alvaras.size());

        List<TribunalContext> contextosAlvarasAc = alvarasAc.stream()
                .map(tribunalContextResolver::resolver)
                .toList();
        telemetry.atualizarSnapshotAlvarasAc(contextosAlvarasAc);
    }

    private static Integer numeroLevantamento(V01LevantamentoDepositoJudicial alvara) {
        return alvara.chavePrimaria() == null ? null : alvara.chavePrimaria().nuLevantamento();
    }
}


package br.gov.caixa.sigsj.alvara.repositories.db;

import br.gov.caixa.sigsj.alvara.infrastructure.jobs.DiariaEntity;
import br.gov.caixa.sigsj.alvara.model.entities.AlvaraAcDestinacao;
import br.gov.caixa.sigsj.alvara.model.entities.AlvaraAcParametros;
import br.gov.caixa.sigsj.alvara.model.entities.AlvaraAcTransferencia;
import br.gov.caixa.sigsj.alvara.model.tables.ChavePrimariaComum;
import br.gov.caixa.sigsj.alvara.model.tables.V01LevantamentoDepositoJudicial;
import br.gov.caixa.sigsj.alvara.model.tables.V05DestinacaoLevantamento;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@ApplicationScoped
public class JpaAlvaraAcMonitoradoRepository implements AlvaraAcMonitoradoRepository {
    private static final int DIAS_CONSULTADOS = 2;
    private static final int LIMITE_ALVARAS = 10;

    private final EntityManager entityManager;
    private final int tempoMinimoAcEmMinutos;

    @Inject
    public JpaAlvaraAcMonitoradoRepository(
            EntityManager entityManager,
            @ConfigProperty(name = "sigsj.scheduler.alvara-ac.tempo-minimo-minutos") int tempoMinimoAcEmMinutos) {
        this.entityManager = entityManager;
        this.tempoMinimoAcEmMinutos = tempoMinimoAcEmMinutos;
    }

    @Override
    @Transactional
    public List<V01LevantamentoDepositoJudicial> buscarTodosAguardandoConciliacao() {
        Instant limiteRecepcao = Instant.now().minus(tempoMinimoAcEmMinutos, ChronoUnit.MINUTES);
        List<DiariaEntity> diarias = buscarDiarias();

        return diarias.stream()
                .filter(diaria -> elegivel(diaria, limiteRecepcao))
                .sorted(Comparator.comparing(
                        DiariaEntity::getDataRecepcaoLevantamento,
                        Comparator.nullsLast(Comparator.naturalOrder())
                ))
                .limit(LIMITE_ALVARAS)
                .map(this::mapear)
                .toList();
    }

    private List<DiariaEntity> buscarDiarias() {
        List<DiariaEntity> diarias = new ArrayList<>();
        LocalDate data = LocalDate.now();

        for (int dias = 0; dias < DIAS_CONSULTADOS; dias++) {
            TypedQuery<DiariaEntity> query = entityManager.createNamedQuery(DiariaEntity.GSJSP288, DiariaEntity.class);
            query.setParameter("P_DATA", Date.valueOf(data.minusDays(dias)));
            diarias.addAll(query.getResultList());
        }

        return diarias;
    }

    private boolean elegivel(DiariaEntity diaria, Instant limiteRecepcao) {
        return V01LevantamentoDepositoJudicial.CO_SITUACAO_A_CONCILIAR.equals(diaria.getCoSituacaoLevantamento())
                && diaria.getDataRecepcaoLevantamento() != null
                && !diaria.getDataRecepcaoLevantamento().toInstant().isAfter(limiteRecepcao);
    }

    private V01LevantamentoDepositoJudicial mapear(DiariaEntity diaria) {
        DiariaEntity.IdV01 id = diaria.getId();
        AlvaraAcParametros parametros = buscarParametros(id);
        List<AlvaraAcDestinacao> destinacoes = buscarDestinacoes(id);
        List<AlvaraAcTransferencia> transferencias = possuiTipoTransferencia(destinacoes)
                ? buscarTransferencias(id)
                : List.of();

        return V01LevantamentoDepositoJudicial.builder()
                .chavePrimaria(ChavePrimariaComum.builder()
                        .nuLevantamento(id.getNuLevantamento())
                        .dtLevantamento(id.getDtLevantamento())
                        .coTipoLevantamento(id.getCoLevantamento())
                        .dvNuLevantamento(Integer.valueOf(id.getNuDvLevantamento()))
                        .build())
                .nuEsferaJustica(diaria.getNuEsferaJustica())
                .nuTribunalCnj(diaria.getNuTribunalCnj())
                .coSituacaoLevantamento(diaria.getCoSituacaoLevantamento())
                .coLevantamentoTribunal(diaria.getCoLevantamento())
                .nuNsuLevantamento(diaria.getNsu())
                .nuOrigemInformacao(parametros == null ? null : parametros.getOrigemInformacao())
                .tsRecepcaoLevantamento(diaria.getDataRecepcaoLevantamento())
                .tipoAlvara(tipoAlvara(parametros, destinacoes, transferencias))
                .build();
    }

    private AlvaraAcParametros buscarParametros(DiariaEntity.IdV01 id) {
        return entityManager.createNamedQuery(AlvaraAcParametros.GSJSP287, AlvaraAcParametros.class)
                .setParameter("P_NU_LEVANTAMENTO", id.getNuLevantamento())
                .setParameter("P_DT_LEVANTAMENTO", id.getDtLevantamento())
                .setParameter("P_CO_LEVANTAMENTO", id.getCoLevantamento())
                .setParameter("P_NU_DV_LEVANTAMENTO", id.getNuDvLevantamento())
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

    private List<AlvaraAcDestinacao> buscarDestinacoes(DiariaEntity.IdV01 id) {
        return entityManager.createNamedQuery(AlvaraAcDestinacao.GSJSP331, AlvaraAcDestinacao.class)
                .setParameter("NU_ORDEM_LEVANTAMENTO", id.getNuLevantamento())
                .setParameter("DT_ORDEM_LEVANTAMENTO", id.getDtLevantamento())
                .setParameter("IC_TIPO_ORDEM_LEVANTAMENTO", id.getCoLevantamento())
                .setParameter("NU_DV_ORDEM_LEVANTAMENTO", id.getNuDvLevantamento())
                .getResultList();
    }

    private List<AlvaraAcTransferencia> buscarTransferencias(DiariaEntity.IdV01 id) {
        return entityManager.createNamedQuery(AlvaraAcTransferencia.GSJSP225, AlvaraAcTransferencia.class)
                .setParameter("P_NU_LEVANTAMENTO", id.getNuLevantamento())
                .setParameter("P_DT_LEVANTAMENTO", id.getDtLevantamento())
                .setParameter("P_CO_LEVANTAMENTO", id.getCoLevantamento())
                .setParameter("P_NU_DV_LEVANTAMENTO", id.getNuDvLevantamento())
                .getResultList();
    }

    private String tipoAlvara(
            AlvaraAcParametros parametros,
            List<AlvaraAcDestinacao> destinacoes,
            List<AlvaraAcTransferencia> transferencias) {
        if (parametros != null
                && Integer.valueOf(V01LevantamentoDepositoJudicial.CO_ORIGEM_INFO_API_RPV).equals(parametros.getOrigemInformacao())) {
            return V01LevantamentoDepositoJudicial.TIPO_ALVARA_RPV;
        }

        if (destinacoes.isEmpty()) {
            return V01LevantamentoDepositoJudicial.TIPO_ALVARA_DESCONHECIDO;
        }

        if (!possuiTipoTransferencia(destinacoes)) {
            return V01LevantamentoDepositoJudicial.TIPO_ALVARA_CREDITO_CONTA;
        }

        boolean precatorio = transferencias.stream()
                .map(AlvaraAcTransferencia::getFinalidadeDeposito)
                .anyMatch("PRECATORIO"::equalsIgnoreCase);
        return precatorio
                ? V01LevantamentoDepositoJudicial.TIPO_ALVARA_INDIVIDUALIZACAO
                : V01LevantamentoDepositoJudicial.TIPO_ALVARA_TRANSFERENCIA;
    }

    private boolean possuiTipoTransferencia(List<AlvaraAcDestinacao> destinacoes) {
        return destinacoes.stream()
                .map(AlvaraAcDestinacao::getTipoDestinacao)
                .anyMatch(this::ehTipoTransferencia);
    }

    private boolean ehTipoTransferencia(Integer tipoDestinacao) {
        return tipoDestinacao != null
                && (tipoDestinacao == V05DestinacaoLevantamento.TipoDestinacao.TRANSFERENCIA_CONTA.codigo
                || tipoDestinacao == V05DestinacaoLevantamento.TipoDestinacao.TRANSFERENCIA_ID.codigo);
    }
}


package br.gov.caixa.sigsj.alvara.telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.api.metrics.ObservableLongUpDownCounter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@ApplicationScoped
@Slf4j
public class AlvaraTelemetry {

        public static final String ALVARA = "alvara";
        static final String NOME_METER = "sigsj-alvara";
        static final String METRICA_ALVARAS_RECEBIDOS = "alvaras_recebidos";
        static final String METRICA_ALVARAS_AC = "alvaras_ac";
        static final String METRICA_ALVARAS_REJEITADOS = "alvaras_rejeitados";
        static final String METRICA_ALVARAS_EM_PROCESSAMENTO = "alvaras_em_processamento";

        // Métricas
        private final LongCounter alvarasRecebidos;
        private final ObservableLongUpDownCounter alvarasAc;
        private final LongCounter alvarasRejeitados;
        private final LongUpDownCounter alvarasEmProcessamento;
        private final AtomicReference<Map<Attributes, Long>> snapshotAlvarasAc =
                new AtomicReference<>(Map.of());

        // Chaves de atributo
        static final AttributeKey<String> TIPO_ALVARA = AttributeKey.stringKey("tipoAlvara");
        static final AttributeKey<String> TRIBUNAL = AttributeKey.stringKey("tribunal");
        static final AttributeKey<String> ESFERA = AttributeKey.stringKey("esfera");
        private static final AttributeKey<String> MOTIVO_REJEICAO = AttributeKey.stringKey("motivoRejeicao");

        @Inject
        public AlvaraTelemetry(Instance<OpenTelemetry> openTelemetryInstance) {
                OpenTelemetry openTelemetry =
                        openTelemetryInstance.isResolvable()
                                ? openTelemetryInstance.get()
                                : OpenTelemetry.noop();

                Meter meter = openTelemetry.getMeter(NOME_METER);

                this.alvarasRecebidos = meter
                        .counterBuilder(METRICA_ALVARAS_RECEBIDOS)
                        .setDescription("Contador de alvarás recebidos")
                        .build();

                this.alvarasAc = meter
                        .upDownCounterBuilder(METRICA_ALVARAS_AC)
                        .setDescription("Quantidade atual de alvarás em situação A Conciliar")
                        .buildWithCallback((ObservableLongMeasurement measurement) -> snapshotAlvarasAc.get()
                                .forEach((attributes, value) -> measurement.record(value, attributes)));

                this.alvarasEmProcessamento = meter
                        .upDownCounterBuilder(METRICA_ALVARAS_EM_PROCESSAMENTO)
                        .setDescription("Contador de alvarás processados pela baixa plataforma")
                        .build();

                this.alvarasRejeitados = meter
                        .counterBuilder(METRICA_ALVARAS_REJEITADOS)
                        .setDescription("Contador de alvarás rejeitados por erro em qualquer fase")
                        .build();
        }

        /**
         * Registra evento de recepção de alvará
         *
         * @param tipoAlvara tipo do alvará (creditoEmConta, transferenciaJudicial, etc.)
         * @param tribunal   sigla do tribunal (TJCE, TJRO, etc.) ou "desconhcido"
         * @param esfera     esfera da justiça (federal, estadual, trabalhista) ou "desconhcida"
         */
        public void registrarRecepcaoAlvara(
                String tipoAlvara,
                String tribunal,
                String esfera
        ) {
                alvarasRecebidos.add(1, Attributes.of(
                        TIPO_ALVARA, tipoAlvara != null ? tipoAlvara : TribunalContext.VALOR_DESCONHECIDO,
                        TRIBUNAL, tribunal != null ? tribunal : TribunalContext.VALOR_DESCONHECIDO,
                        ESFERA, esfera != null ? esfera : TribunalContext.ESFERA_DESCONHECIDA
                ));

                log.info("Evento OTEL: Alvará recebido - Tribunal: {}, Tipo: {}, Esfera: {}",
                        tribunal, tipoAlvara, esfera);
        }

        public void registrarAlvaraAc(
                String tipoAlvara,
                String tribunal,
                String esfera
        ) {
                log.info("Evento OTEL: Alvará em AC - Tribunal: {}, Tipo: {}, Esfera: {}",
                        tribunal, tipoAlvara, esfera);
        }

        /** Substitui a contagem da última varredura observada na próxima coleta. */
        public void atualizarSnapshotAlvarasAc(List<TribunalContext> alvarasAc) {
                Map<Attributes, Long> contagemAtual = new HashMap<>();
                for (TribunalContext contexto : alvarasAc) {
                        Attributes attributes = Attributes.of(
                                TIPO_ALVARA, contexto.getTipoAlvara(),
                                TRIBUNAL, contexto.getSiglaTribunal(),
                                ESFERA, contexto.getEsfera());
                        contagemAtual.merge(attributes, 1L, Long::sum);
                }

                snapshotAlvarasAc.updateAndGet(contagemAnterior -> {
                        Map<Attributes, Long> snapshot = new HashMap<>();
                        contagemAnterior.keySet().forEach(attributes -> snapshot.put(attributes, 0L));
                        snapshot.putAll(contagemAtual);
                        return Map.copyOf(snapshot);
                });
        }

        /**
         * Registra alvará rejeitado por erro (síncrono, validação ou assíncrono)
         *
         * @param tipoAlvara     tipo do alvará (creditoEmConta, transferenciaJudicial, etc.)
         * @param tribunal       sigla do tribunal (TJCE, TJRO, etc.)
         * @param esfera         esfera da justiça (federal, estadual, trabalhista)
         * @param motivoRejeicao motivo da rejeição: erroSincrono, erroValidacao, erroAssincrono
         */
        public void registrarAlvaraRejeitado(
                String tipoAlvara,
                String tribunal,
                String esfera,
                String motivoRejeicao
        ) {
                alvarasRejeitados.add(1, Attributes.of(
                        TIPO_ALVARA, tipoAlvara != null ? tipoAlvara : TribunalContext.VALOR_DESCONHECIDO,
                        TRIBUNAL, tribunal != null ? tribunal : TribunalContext.VALOR_DESCONHECIDO,
                        ESFERA, esfera != null ? esfera : TribunalContext.ESFERA_DESCONHECIDA,
                        MOTIVO_REJEICAO, motivoRejeicao != null ? motivoRejeicao : TribunalContext.VALOR_DESCONHECIDO
                ));

                log.warn("Evento OTEL: Alvará rejeitado - Tipo: {}, Tribunal: {}, Esfera: {}, Motivo: {}",
                        tipoAlvara, tribunal, esfera, motivoRejeicao);
        }

        /**
         * Incrementar métrica de "em processamento", para sinalizar início do processamento em alta plataforma
         *
         * @param tipoAlvara tipo do alvará
         * @param tribunal   sigla do tribunal
         * @param esfera     esfera da justiça
         */
        public void registrarAlvaraProcessado(
                String tipoAlvara,
                String tribunal,
                String esfera
        ) {
                alvarasEmProcessamento.add(1, Attributes.of(
                        TIPO_ALVARA, tipoAlvara != null ? tipoAlvara : TribunalContext.VALOR_DESCONHECIDO,
                        TRIBUNAL, tribunal != null ? tribunal : TribunalContext.VALOR_DESCONHECIDO,
                        ESFERA, esfera != null ? esfera : TribunalContext.ESFERA_DESCONHECIDA
                ));

                log.info("Evento OTEL: Alvará em processamento - Tipo: {}, Tribunal: {}, Esfera: {}",
                        tipoAlvara, tribunal, esfera);
        }
}



package br.gov.caixa.sigsj.alvara.telemetry;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporter;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.SdkLoggerProviderBuilder;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.resources.Resource;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class OpenTelemetryLogProvider {
    private static final String LOG_SCOPE = "sigsj-alvara";
    private static final String LOGS_PATH = "/v1/logs";

    private final SdkLoggerProvider loggerProvider;

    @Inject
    public OpenTelemetryLogProvider(
            @ConfigProperty(name = "OTEL_TELEMETRIA_ATIVADA", defaultValue = "true") boolean enabled,
            @ConfigProperty(name = "OTEL_ENDPOINT") String endpoint,
            @ConfigProperty(name = "OTEL_TIMEOUT", defaultValue = "10000") long timeoutMillis,
            @ConfigProperty(name = "OTEL_NOME_SERVICO", defaultValue = "sigsj-alvara") String serviceName) {
        this.loggerProvider = criarProvider(enabled, endpoint, timeoutMillis, serviceName);
    }

    public Logger getLogger() {
        return loggerProvider.get(LOG_SCOPE);
    }

    @PreDestroy
    void shutdown() {
        loggerProvider.shutdown().join(10, TimeUnit.SECONDS);
    }

    private static SdkLoggerProvider criarProvider(
            boolean enabled,
            String endpoint,
            long timeoutMillis,
            String serviceName) {
        SdkLoggerProviderBuilder builder = SdkLoggerProvider.builder()
                    .setResource(Resource.getDefault().merge(Resource.create(Attributes.of(
                        AttributeKey.stringKey("service.name"),
                            serviceName))));
        if (!enabled) {
            return builder.build();
        }

        OtlpHttpLogRecordExporter exporter = OtlpHttpLogRecordExporter.builder()
                .setEndpoint(endpointComLogs(endpoint))
                .setTimeout(timeoutMillis, TimeUnit.MILLISECONDS)
                .build();
        return builder
                .addLogRecordProcessor(BatchLogRecordProcessor.builder(exporter)
                        .setExporterTimeout(timeoutMillis, TimeUnit.MILLISECONDS)
                        .build())
                .build();
    }

    private static String endpointComLogs(String endpoint) {
        if (endpoint.endsWith(LOGS_PATH)) {
            return endpoint;
        }
        return endpoint.replaceAll("/+$", "") + LOGS_PATH;
    }
}



quarkus:
  http:
    auth:
      proactive: false
    port: "8100"
    cors:
      ~: "true"
      origins: "*"
  application:
    version: 3.0.9.101
    name: SIGSJ-alvara
  rest:
    path: /deposito-judicial/levantamento
  devservices:
    enabled: "false"
  scheduler:
    enabled: ${SIGSJ_SCHEDULER_ENABLED:true}
  live-reload:
    instrumentation: true

  #### Filtro de Schemas ####

  #### LOG ####
  log:
    console:
      filter: controle-logging
    category:
      "{*}":
        level: ${QUARKUS_LOG_LEVEL:INFO}
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager":
        level: WARN
      "org.apache.pdfbox.pdmodel.font":
        level: ERROR
      "org.apache.fontbox":
        level: ERROR
      "io.opentelemetry":
        level: DEBUG
      "io.opentelemetry.exporter":
        level: DEBUG
      "io.opentelemetry.sdk":
        level: ALL
    level: ${QUARKUS_LOG_LEVEL:INFO}
  # log.min-level: TRACE

  ################################################################################################################################################
  ########################################## AUTH - SSO RBCA JWT CORE ############################################################################
  ################################################################################################################################################
  #smallrye-jwt.enabled: true
  #http.auth.permission.authenticated.paths: /*
  #http.auth.permission.authenticated.policy: authenticated
  #mp.jwt.verify.publickey.location: ${QUARKUS_OIDC_AUTH_SERVER_URL}/protocol/openid-connect/certs

  ### LOG - DEV MODE
  # hibernate-orm.log.sql: true
  # hibernate-orm.log.bind-param: true
  # log.min-level: TRACE
  # hibernate-orm.log.bind-parameters: true
  ### LOG CHAMADAS HTTP ###
  # http.access-log.enabled: true
  # log.category."org.apache.http".level: TRACE
  # log.category."org.apache.http".min-level: TRACE
  #  log.file.enable: true
  #  log.file.path: alvara.log

  #DB2 Datasource config
  datasource:
    db-kind: db2
    username: ${QUARKUS_DATASOURCE_USERNAME}
    password: ${QUARKUS_DATASOURCE_PASSWORD}
    jdbc:
      url: ${QUARKUS_DATASOURCE_JDBC_URL}
      telemetry: true
  hibernate-orm:
    database:
      default-schema: GSJ
      generation: none
    #dialect: org.hibernate.dialect.DB2400Dialect
    validation:
      enabled: "false"
    validate-in-dev-mode: "false"
    packages: br.gov.caixa,io.quarkus.hibernate.orm.panache
    # log:
    #   sql: true
    #   format-sql: true
    #   bind-parameters: true

  ### SECURITY ###
  tls:
    trust-all: "true"
  #oidc-client.client-enabled: false

  #### LIB CORE CONFIG ####
  index-dependency:
    core:
      group-id: br.gov.caixa.core
      artifact-id: sigsj-core
    vavr:
      group-id: io.vavr
      artifact-id: vavr

  rest-client:
    logging:
      scope: request-response
      body-limit: 65536
    extensions-api:
      scope: all
  # rest-client.disable-contextual-error-messages: true
  # resteasy.multipart.input-part.default-charset: binary

  ### AUTH - SSO CONFIG OIDC Configuration
  oidc:
    auth-server-url: ${QUARKUS_OIDC_AUTH_SERVER_URL}
    client-id: cli-ser-gsj
    roles:
      role-claim-path: realm_access/roles
    intranet:
      auth-server-url: ${QUARKUS_OIDC_AUTH_SERVER_URL_INTRA}
      client-id: cli-ser-gsj
      credentials:
        secret: ${QUARKUS_OIDC_CREDENTIALS_SECRET_INTRA}

  ### SSO CONFIG OIDC Configuration - REST CLIENT ###
  oidc-client:
    auth-server-url: ${QUARKUS_OIDC_AUTH_SERVER_URL_INTRA}
    client-id: cli-ser-gsj
    credentials:
      secret: ${QUARKUS_OIDC_CREDENTIALS_SECRET_INTRA}
  # rest-client.follow-redirects: true
  # rest-client.max-redirects: 2

  otel:
    enabled: ${OTEL_TELEMETRIA_ATIVADA:true}
    sdk:
      disabled: false
    # Propaga contexto de trace para chamadas REST
    propagators: tracecontext,baggage
    service:
      name: ${OTEL_NOME_SERVICO}
    traces:
      enabled: true
      exporter: otlp
      sampler: always_on
    metrics:
      enabled: true
      exporter: otlp
    metric:
      export:
        interval: ${OTEL_INTERVALO_METRICAS}
    exporter:
      otlp:
        endpoint: ${OTEL_ENDPOINT}
        protocol: ${OTEL_ENDPOINT_PROTOCOLO}
        timeout: ${OTEL_TIMEOUT:10000}
        metrics:
          endpoint: ${OTEL_ENDPOINT}v1/metrics
          protocol: ${OTEL_ENDPOINT_PROTOCOLO}
        traces:
          endpoint: ${OTEL_ENDPOINT}v1/traces
          protocol: ${OTEL_ENDPOINT_PROTOCOLO}

  ###### REST CLIENT ######
  cxf:
    client:
      '"ws-alvara-incluir"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/alvara/incluir
      '"ws-levantamento-alvara-incluir"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/levantamento/incluir
      '"ws-validar-darf"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/darf/validar
      '"ws-executar-financeiro-alvara"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/financeiro/executar
      '"ws-validar-gps"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/gps/validar
      '"ws-calculadora"':
        username: ${CICSWS_USERNAME}
        password: ${CICSWS_PASSWORD}
        client-endpoint-url: ${CICSWS_URL}/sigsj/calculadorasintetica/consultar

      # "ws-executar-financeiro-alvara".features: org.apache.cxf.feature.LoggingFeature

  console:
    color: false

  # Cache configuration

  cache:
    caffeine:
      situacao-sicow-cpf-cache:
        expire-after-write: 1H
        maximum-size: 100
      situacao-sicow-cnpj-cache:
        expire-after-write: 1H
        maximum-size: 100
      consulta-titularidade-nsgd-cache:
        expire-after-write: 12H
        maximum-size: 54
mp:
  openapi:
    extensions:
      smallrye:
        openapi: 3.0.1
    filter: br.gov.caixa.sigsj.alvara.OpenAPISchemaFilter

### REST CLIENT ###
br:
  gov:
    caixa:
      sigsj:
        alvara:
          gerar-indice: ${GERAR_INDICE:false}
          repositories:
            rest:
              depositoid:
                DepositoIdClient/mp-rest/url: ${GSJ_DEPOSITO_URL}
          integration:
            rest:
              sicow:
                SituacaoCadastralSicowService/mp-rest/url: ${QUARKUS_API_MANAGER_URL}
              fabricaendtoend:
                FabricaEndToEndService/mp-rest/url: ${QUARKUS_API_MANAGER_URL}transacoes-financeiras/pagamentos-instantaneos/spi
              dict:
                DictService/mp-rest/url: ${QUARKUS_API_MANAGER_URL}transacoes-financeiras/pagamentos-instantaneos/dict
              pix:
                PixValidatorClient/mp-rest/url: ${QUARKUS_API_MANAGER_URL}
              executaralvaramq:
                ExecutarAlvaraClient/mp-rest/url: ${GSJ_NOTIFICACAO_URL}
              nsgd:
                ConsultaContaClient/mp-rest/url: ${QUARKUS_API_MANAGER_URL}
        core:
          logging:
            resources:
              trilha: ativo
    sigsj:
      core:
        security:
          certificado:
            signature-verify: ${VALIDA_ASS_ALVARA}
            signature-verify-data: ${VALIDA_ASS_ALVARA_DATA}
          captcha:
            pk: '""'

sigsj:
  scheduler:
    interval: ${SIGSJ_SCHEDULER_INTERVAL:5m}
    alvara-ac:
      tempo-minimo-minutos: ${SIGSJ_SCHEDULER_ALVARA_AC_TEMPO_MINIMO_MINUTOS:20}
  client:
    notificacao:
      path/mp-rest/url: ${GSJ_NOTIFICACAO_URL}
    api-manager-caixa:
      path/mp-rest/url: ${QUARKUS_API_MANAGER_URL}
      token: ${API_MANAGER_APIKEY}
    fwc:
      path/mp-rest/url: ${FWC_API_URL}
      token: ${FWC_API_TOKEN}
    cnj:
      path/mp-rest/url: ${CNJ_API_URL}
      token: ${API_PARCEIROS_APIKEY}
      healthcheck:
        interval: ${CNJ_HEALTHCHECK_INTERVAL:30s}
  log:
    api:
      return-stacktrace: ${QUARKUS_RETURN_STACKTRACE:false}
      return-stacktrace-encrypt: ${QUARKUS_RETURN_STACKTRACE_ENCRYPT:false}
  permitir-credito-conta: ${PERMITIR_CREDITO_CONTA}
  permitir-transferencia: ${PERMITIR_TRANSFERENCIA}
  permitir-individualiza-precatorio: ${PERMITIR_INDIVIDUALIZA_PRECATORIO}
  permitir-cnpj-alfanumerico: ${PERMITIR_CNPJ_ALFANUMERICO}
  cache:
    tempo-expiracao-minutos:
      consulta-conta-NSGD: ${CACHE_EXPIRACAO_MINUTOS_CONSULTA_CONTA_NSGD}
  client-fallback:
    enabled: ${FALLBACK_ENABLED:false}
  verificar-pendencia:
    # Intervalo para logar levantamentos pendentes.
    intervalo-log : ${ALVARA_PENDENCIA_INTERVALO:0 */5 * * * ?}
    # Quanto tempo esperar o CICS remover o status AC antes de notificar um erro.
    timeout: ${ALVARA_PENDENCIA_TIMEOUT:300} # segundos

# %prod.quarkus.http.body.uploads-directory: /work/formdata/
# quarkus.http.body.uploads-directory: src/main/resources/formdata
# quarkus.http.max-body-size: 10M

mq:
  host: ${SIGSJ_WMQ_HOSTNAME}
  port: ${SIGSJ_WMQ_PORT}
  channel: ${SIGSJ_WMQ_CHANNEL}
  queueManager: ${SIGSJ_WMQ_QUEUEMANAGER}
  # fila agendamento
  queueName: ${SIGSJ_WMQ_QUEUE_NAME}
  usuario-agendamento: ${SIGSJ_WMQ_USERNAME}
  senha-agendamento: ${CICSWS_PASSWORD}
  # fila processamento assincorno
  filaAssincrono: ${SIGSJ_QUEUE_ALVARA}
  usuario-assincrono: ${CICSWS_USERNAME}
  senha-assincrono: ${CICSWS_PASSWORD}
  id-instancia: ${CICSWS_USERNAME} # trocar por SGSJSD01 se quiser testar local chamando sigsj-assincrono de DES

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGSJ-alvara
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SIGSJ

SIGSJ-alvara
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIGSJ-ALVARA-DES (29)
Grupo de variáveis de SIGSJ-ALVARA-DES

Scopes: EC DES
ALVARA_PENDENCIA_INTERVALO
"0 * * * * ?"
ALVARA_PENDENCIA_TIMEOUT
300
INIT
Criadoviaapi
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIGSJ-ALVARA-DES
_ENV.CACHE_EXPIRACAO_MINUTOS_CONSULTA_CONTA_NSGD
3
_ENV.CNJ_API_URL
https://apim-parceiros-sandbox.azure-api.net/deposito-judicial/cnj
_ENV.FALLBACK_ENABLED
true
_ENV.FWC_API_TOKEN
eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsicmVzb3VyY2VzIl0sInVzZXJfbmFtZSI6InNnc2pmd2NkIiwic2NvcGUiOlsicmVhZCJdLCJpc3MiOiJodHRwOi8vZndjLWJyeS1mdzItYXV0aC1zZXJ2ZXItZGVzOjgwODAvcmVhbG1zL2Z3IiwiaWF0IjoxNzQzMDExNDU2LCJhdXRob3JpdGllcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9BUFAifV0sImp0aSI6IjBiOTk2ZGZmLTRlYzItNGQyMy1iMTAzLThkODZmMTVlZDI1MSIsImNsaWVudF9pZCI6InNnc2pmd2NkIn0.ZoNGZg1d8T8eLa7MetqiNgdc34f8Lka93rAnNc9EtytPIALsBoLmtuvct63Zy0fMrap7E734yUenZuXn9sTktL9PPq1RqUkT5k8zJuenZyQaZwDYYA4HX50wbLL_o9JVfMo3lV-m26s8LLMOp1uivpt5D584PHlT3QIVIYHdgrrOcQvn0ywXb2b3ezvP8YZM0Rspm70eg96SkcZ46xXEGgPqoPUJ0OuSKEZkoaDKKlJA1tpK_5ebTrksr3HXh9x2BJ7ZBzbj-5FiTcpxLWrW7Yfxkt29zNU3aiE3U9X9KkN4Z-d-bQGDUVVPXaiRNW_rYyNuvxzkLhWEoqw8s4p72g
_ENV.FWC_API_URL
https://fwc-des.apps.nprd.caixa/api
_ENV.GSJ_DEPOSITO_URL
http://sigsj-deposito-sandbox-des:8080
_ENV.GSJ_NOTIFICACAO_URL
http://sigsj-notificacao-des:8080
_ENV.LOGGING_COR_CONSOLE
ANSI
_ENV.OTEL_ENDPOINT
https://otel-collector-nprd.cemot.cloud.caixa/sistemas-judiciais/
_ENV.OTEL_ENDPOINT_METRICS
https://otel-collector-nprd.cemot.cloud.caixa/sistemas-judiciais/
_ENV.OTEL_ENDPOINT_METRICS_PROTOCOLO
http/protobuf
_ENV.OTEL_ENDPOINT_PROTOCOLO
http/protobuf
_ENV.OTEL_ENDPOINT_TRACES
https://otel-collector-nprd.cemot.cloud.caixa/sistemas-judiciais/v1/traces
_ENV.OTEL_ENDPOINT_TRACES_PROTOCOLO
http/protobuf
_ENV.OTEL_INTERVALO_METRICAS
5000
_ENV.OTEL_NOME_SERVICO
sigsj-alvara-des
_ENV.OTEL_TELEMETRIA_ATIVADA
true
_ENV.PERMITIR_CNPJ_ALFANUMERICO
true
_ENV.PERMITIR_CREDITO_CONTA
true
_ENV.PERMITIR_INDIVIDUALIZA_PRECATORIO
true
_ENV.PERMITIR_TRANSFERENCIA
true
_ENV.SIGSJ_QUEUE_ALVARA
SIGSJ.REQ.LEVANTAMENTO_ASSINCRONO
_ENV.SIGSJ_WMQ_QUEUE_NAME
SIGSJ.REQ.EXECUCAO_LEVANTAMENTO
_ENV.VALIDA_ASS_ALVARA
false
_ENV.VALIDA_ASS_ALVARA_DATA
false
SIGSJ-comum-des (45)
Scopes: EC DES
JKS_PASS
changeit
PASS_CICSWS
********
PASS_DB2
********
PASS_ORACLE
"N/A"
SSO
'${CLISERGSJ_SSO_INTER}'
SSO_INTRA
'${CLISERGSJ_SSO_INTRA}'
VAULT_LOCATION
/usr/src/app/secrets_files/SIGSJ_DES/
_ENV.API_MANAGER_APIKEY
l7c05aa788cab746389ebdb746d30215bc
_ENV.API_PARCEIROS_APIKEY
4448bef18951433797b816153128e6ab
_ENV.CICSWS_URL
"https://cicsweb.des.caixa:2587"
_ENV.CICSWS_USERNAME
SGSJSD01
_ENV.DATASOURCE_MAX_POOL_SIZE
5
_ENV.DATASOURCE_MIN_POOL_SIZE
1
_ENV.DB_ALIAS
orad01bc
_ENV.DB_URL
"cnpexdadvm01-scan8.extra.caixa.gov.br"
_ENV.DB_USER
SGSJDS01
_ENV.HOST-VPN-TRIBUNAL
172.28.144.217
_ENV.HOST-VPN-TRIBUNAL_PORTA
8000
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa"
_ENV.NO_PROXY
".caixa,.caixa.gov.br,apim-parceiros-sandbox.azure-api.net"
_ENV.QUARKUS_API_MANAGER_URL
"https://api.des.caixa:8443/"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.192.225.76:2905/DBD0"
_ENV.QUARKUS_DATASOURCE_USERNAME
SGSJDS01
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL_INTRA
https://login.des.caixa/auth/realms/intranet/
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
ad144649-5b73-42f5-978b-c84c6b8cd16d
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET_INTRA
26529535-b805-4274-a7f8-203a97ae1571
_ENV.QUARKUS_RETURN_STACKTRACE
true
_ENV.SIGSJ_QUEUE_RESET_INTERVAL
"0 */30 * * * ?"
_ENV.SIGSJ_WMQ_CHANNEL
SIGSJ.SVRCONN
_ENV.SIGSJ_WMQ_HOSTNAME
ibmspdes.caixa
_ENV.SIGSJ_WMQ_PORT
1420
_ENV.SIGSJ_WMQ_QUEUEMANAGER
QSDA
_ENV.SIGSJ_WMQ_USER
SGSJSD01
_ENV.SIGSJ_WMQ_USERNAME
SGSJSD02
_ENV.SIMTR_URL
"http://simtr-api-intranet-des-esteiras.simtr-des.svc:8080/"
_ENV.SSO_CLIENT_ID
cli-ser-gsj
_ENV.URL_PROXY
http://proxydes.caixa:80
_SECRET.CICSWS_PASSWORD
#{PASS_CICSWS}#
_SECRET.ORACLE_PASSWORD
'${SGSJSD01_ORACLE}'
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASS_DB2}#
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
#{JKS_PASS}#
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
#{VAULT_LOCATION}#
SIGSJ-insights-des (5)
Variáveis comuns para os módulos do SIGSJ-Quarkus para configuração de Insights
Scopes: EC DES
SIGSJ-ALVARA-TQS (25)
Grupo de variáveis de SIGSJ-ALVARA-TQS
Scopes: EC TQS
SIGSJ-comum-tqs (37)
Scopes: EC TQS
SIGSJ-ALVARA-HMP (1)
Grupo de variáveis de SIGSJ-ALVARA-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIGSJ-ALVARA-PRD (22)
Grupo de variáveis de SIGSJ-ALVARA-PRD
Scopes: EC PRD
SIGSJ-comum-prd (32)
Scopes: EC PRD
SIGSJ-insights-prd (5)
Variáveis comuns para os módulos do SIGSJ-Quarkus para configuração de Insights
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

372 pipelines found

Select a release pipeline to view its releases

57 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 2

Showing filters 1 through 2

2026-09-24T16:24:13.5930658Z ##[section]Starting: Logs da Aplicação
2026-09-24T16:24:13.5933701Z ==============================================================================
2026-09-24T16:24:13.5933777Z Task         : Bash
2026-09-24T16:24:13.5933830Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-24T16:24:13.5933891Z Version      : 3.227.0
2026-09-24T16:24:13.5933933Z Author       : Microsoft Corporation
2026-09-24T16:24:13.5933989Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-24T16:24:13.5934057Z ==============================================================================
2026-09-24T16:24:14.4228503Z Generating script.
2026-09-24T16:24:14.4240360Z ========================== Starting Command Output ===========================
2026-09-24T16:24:14.4245748Z [command]/bin/bash /opt/ads-agent/_work/_temp/e48ec582-b01b-49b6-a644-fa1e9ed98f07.sh
2026-09-24T16:24:14.4300218Z + shopt -s expand_aliases
2026-09-24T16:24:14.4301916Z + [[ -n okd4_nprd ]]
2026-09-24T16:24:14.4302227Z + [[ okd4_nprd =~ ocp ]]
2026-09-24T16:24:14.4302672Z + [[ -n okd4_nprd ]]
2026-09-24T16:24:14.4302884Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-24T16:24:14.4303372Z + app=sigsj-alvara-des
2026-09-24T16:24:14.4303535Z + oc version
2026-09-24T16:24:14.5730142Z oc v3.11.0+0cbc58b
2026-09-24T16:24:14.5730376Z kubernetes v1.11.0+d4cacc0
2026-09-24T16:24:14.5731883Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-24T16:24:14.5809913Z 
2026-09-24T16:24:14.5810463Z Server https://api.nprd.caixa:6443
2026-09-24T16:24:14.5811107Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-24T16:24:14.5846297Z ++ oc get pod -l name=sigsj-alvara-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-24T16:24:14.5846679Z ++ tac
2026-09-24T16:24:14.5848040Z ++ grep -v '^$'
2026-09-24T16:24:14.5857370Z ++ head -n1
2026-09-24T16:24:16.1853295Z + last_pod=sigsj-alvara-des-664-mc49j
2026-09-24T16:24:16.1854211Z + echo 'Logs do POD: sigsj-alvara-des-664-mc49j'
2026-09-24T16:24:16.1854513Z + oc logs sigsj-alvara-des-664-mc49j -c sigsj-alvara-des -n sigsj-des
2026-09-24T16:24:16.1854701Z Logs do POD: sigsj-alvara-des-664-mc49j
2026-09-24T16:24:16.5052202Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-24T16:24:16.5136144Z ##[section]Finishing: Logs da Aplicação


2026-09-24T16:24:16.5155278Z ##[section]Starting: Resumo da Release
2026-09-24T16:24:16.5158242Z ==============================================================================
2026-09-24T16:24:16.5158315Z Task         : Bash
2026-09-24T16:24:16.5158364Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-24T16:24:16.5158424Z Version      : 3.227.0
2026-09-24T16:24:16.5158465Z Author       : Microsoft Corporation
2026-09-24T16:24:16.5158521Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-24T16:24:16.5158589Z ==============================================================================
2026-09-24T16:24:17.3030395Z Generating script.
2026-09-24T16:24:17.3040621Z ========================== Starting Command Output ===========================
2026-09-24T16:24:17.3051810Z [command]/bin/bash /opt/ads-agent/_work/_temp/d3b59a4b-c20a-45ca-982d-a435ef44b882.sh
2026-09-24T16:24:17.3100196Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/sigsj-des/overview
2026-09-24T16:24:17.3104461Z /opt/ads-agent/_work/_temp/d3b59a4b-c20a-45ca-982d-a435ef44b882.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-09-24T16:24:17.3111486Z /opt/ads-agent/_work/_temp/d3b59a4b-c20a-45ca-982d-a435ef44b882.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-09-24T16:24:17.5351506Z APP Publicada na URL: https://sigsj-alvara-des.apps.nprd.caixa
2026-09-24T16:24:17.5433581Z ##[section]Finishing: Resumo da Release

  
