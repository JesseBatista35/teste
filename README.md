
sispl-consulta-transacao-ocp4-tqs-17-27b2v
Running

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-17 23:50:11,607 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource FileSystemConfigSource[dir=/usr/src/app/secrets_files/SISPL_TQS] with ordinal 100
2026-06-17 23:50:11,614 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-06-17 23:50:11,888 DEBUG [org.hib.qua.feature] (main) Hibernate Features Enabled
2026-06-17 23:50:11,889 DEBUG [io.qua.hib.orm] (main) List of entities found by Quarkus deployment:
[br.gov.caixa.loterias.consultatransacao.domain.Transacao906, br.gov.caixa.loterias.consultatransacao.domain.Transacao909]
2026-06-17 23:50:11,912 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='totalRequests', tags=[]}, type: counter, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 23:50:11,913 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='concurrentRequests', tags=[]}, type: concurrent gauge, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 23:50:11,914 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='requestRate', tags=[]}, type: meter, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 23:50:11,915 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='processTime', tags=[]}, type: timer, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 23:50:12,047 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-06-17 23:50:12,048 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-06-17 23:50:12,048 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-06-17 23:50:12,054 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=150, observers=8]
2026-06-17 23:50:12,060 DEBUG [org.hib.jpa.int.uti.LogHelper] (main) PersistenceUnitInfo [
	name: <default>
	persistence provider classname: null
	classloader: null
	excludeUnlistedClasses: true
	JTA datasource: null
	Non JTA datasource: null
	Transaction type: JTA
	PU root URL: null
	Shared Cache Mode: null
	Validation Mode: null
	Jar files URLs []
	Managed classes names [
		br.gov.caixa.loterias.consultatransacao.domain.Transacao909
		br.gov.caixa.loterias.consultatransacao.domain.Transacao906
		io.quarkus.hibernate.orm.panache.PanacheEntityBase
		br.gov.caixa.loterias.consultatransacao.domain.Transacao
		io.quarkus.hibernate.orm.panache.PanacheEntity]
	Mapping files names []
	Properties [
		hibernate.hbm2ddl.import_files: 
		hibernate.hbm2ddl.skip_default_import_file: true
		hibernate.query.plan_cache_max_size: 2048
		hibernate.default_batch_fetch_size: 16
		hibernate.discriminator.ignore_explicit_for_joined: false
		hibernate.hbm2ddl.charset_name: UTF-8
		hibernate.cache.use_reference_entries: null
		hibernate.cache.use_query_cache: null
		hibernate.dialect: org.hibernate.dialect.DB2zDialect
		hibernate.query.in_clause_parameter_padding: true
		hibernate.cache.use_second_level_cache: null
		jakarta.persistence.sharedCache.mode: null
		hibernate.id.sequence.increment_size_mismatch_strategy: null
		hibernate.batch_fetch_style: PADDED
		hibernate.id.optimizer.pooled.preferred: pooled-lo
		hibernate.order_by.default_null_ordering: none
		jakarta.persistence.validation.mode: CALLBACK]
2026-06-17 23:50:12,284 DEBUG [org.hib.Version] (main) HHH000412: Hibernate ORM core version 7.0.3.Final
2026-06-17 23:50:12,284 DEBUG [org.hib.cfg.Environment] (main) HHH000206: 'hibernate.properties' not found
2026-06-17 23:50:12,288 DEBUG [org.hib.orm.idg.factory] (main) Ignoring CDI for resolving IdentifierGenerator instances as extended or delayed CDI support was enabled
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid2] -> [org.hibernate.id.UUIDGenerator]
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [guid] -> [org.hibernate.id.GUIDGenerator]
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid] -> [org.hibernate.id.UUIDHexGenerator]
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid.hex] -> [org.hibernate.id.UUIDHexGenerator]
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [assigned] -> [org.hibernate.id.Assigned]
2026-06-17 23:50:12,290 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [identity] -> [org.hibernate.id.IdentityGenerator]
2026-06-17 23:50:12,291 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [select] -> [org.hibernate.id.SelectGenerator]
2026-06-17 23:50:12,291 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-06-17 23:50:12,291 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [increment] -> [org.hibernate.id.IncrementGenerator]
2026-06-17 23:50:12,291 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [foreign] -> [org.hibernate.id.ForeignGenerator]
2026-06-17 23:50:12,291 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-06-17 23:50:12,292 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-table] -> [org.hibernate.id.enhanced.TableGenerator]
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@118acf70
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@118acf70
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration true_false -> org.hibernate.type.BasicTypeReference@f723cdb
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@f723cdb
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@101bdd1c
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@101bdd1c
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [B -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@380ce5a3
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@380ce5a3
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration image -> org.hibernate.type.BasicTypeReference@31da0434
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration blob -> org.hibernate.type.BasicTypeReference@423ed3b5
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@423ed3b5
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@74960e9d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@fb5aeed
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration integer -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration int -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@21390938
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@21390938
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@7a388990
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@7a388990
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@6db328f8
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration string -> org.hibernate.type.BasicTypeReference@61b65d54
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@61b65d54
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nstring -> org.hibernate.type.BasicTypeReference@43935e9c
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration characters -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char[] -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [C -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@5f8a02cf
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration text -> org.hibernate.type.BasicTypeReference@70b6db83
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ntext -> org.hibernate.type.BasicTypeReference@559af296
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration clob -> org.hibernate.type.BasicTypeReference@18709cb2
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@18709cb2
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nclob -> org.hibernate.type.BasicTypeReference@370ef50b
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@370ef50b
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@4b87760e
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@1b24ea2a
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@2d313c8c
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@113f9078
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@586495f1
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@2a0ea492
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> org.hibernate.type.BasicTypeReference@2e56b4d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@2e56b4d
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@b5ac0c1
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@b5ac0c1
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@55846997
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@55846997
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@168142da
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@168142da
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@36f6e521
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@36f6e521
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@50211483
2026-06-17 23:50:12,349 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@1472208d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@6de004f1
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@6de004f1
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@191c6e13
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@1a8e9ed9
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@12fcb2c3
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@39ab5ef7
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@39ab5ef7
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@4b195203
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@23444a36
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration date -> org.hibernate.type.BasicTypeReference@30a9e3db
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@30a9e3db
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration time -> org.hibernate.type.BasicTypeReference@16a3cc88
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@16a3cc88
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@19f02280
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@19827608
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration instant -> org.hibernate.type.BasicTypeReference@14b528b6
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@14b528b6
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@fbe70d8
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@7d2c345d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration class -> org.hibernate.type.BasicTypeReference@5db948c9
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@5db948c9
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration locale -> org.hibernate.type.BasicTypeReference@4ae2e781
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@4ae2e781
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration serializable -> org.hibernate.type.BasicTypeReference@7d1c164a
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@7d1c164a
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timezone -> org.hibernate.type.BasicTypeReference@3b35798
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@3b35798
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@6a2d867d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@6a2d867d
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration url -> org.hibernate.type.BasicTypeReference@3830b06c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@3830b06c
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration vector -> org.hibernate.type.BasicTypeReference@784d9bc
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float_vector -> org.hibernate.type.BasicTypeReference@426131d7
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double_vector -> org.hibernate.type.BasicTypeReference@7c7e73c5
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte_vector -> org.hibernate.type.BasicTypeReference@58687fb7
2026-06-17 23:50:12,350 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration row_version -> org.hibernate.type.BasicTypeReference@3a3b10f4
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration object -> org.hibernate.type.JavaObjectType@525647f3
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@525647f3
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration null -> org.hibernate.type.NullType@29962b2f
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@691541bc
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@43a4a9e5
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@35145874
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@11df2829
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@f245bdd
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@280fafd
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@14b275bd
2026-06-17 23:50:12,382 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@4b03cbad
2026-06-17 23:50:12,384 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting Scanner [io.quarkus.hibernate.orm.runtime.boot.scan.QuarkusScanner@5c313224] into BootstrapContext; was [null]
2026-06-17 23:50:12,385 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanEnvironment [org.hibernate.jpa.boot.internal.StandardJpaScanEnvironmentImpl@4b957db0] into BootstrapContext; was [null]
2026-06-17 23:50:12,385 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanOptions [org.hibernate.boot.archive.scan.internal.StandardScanOptions@8840c98] into BootstrapContext; was [org.hibernate.boot.archive.scan.internal.StandardScanOptions@626b639e]
2026-06-17 23:50:12,388 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting JPA temp ClassLoader [null] into BootstrapContext; was [null]
2026-06-17 23:50:12,388 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) ClassLoaderAccessImpl#injectTempClassLoader(null) [was null]
2026-06-17 23:50:12,404 DEBUG [org.hib.orm.deprecation] (main) HHH90000025: DB2zDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-06-17 23:50:12,404 DEBUG [org.hib.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.DB2zDialect, version: 12.1
2026-06-17 23:50:12,409 DEBUG [org.hib.orm.jdb.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-06-17 23:50:12,416 DEBUG [org.hib.orm.con.pooling] (main) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database version: 12.1
	Autocommit mode: undefined/unknown
	Isolation level: <unknown>
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-06-17 23:50:12,421 DEBUG [org.hib.typ.des.sql.spi.DdlTypeRegistry] (main) addDescriptor(-2, org.hibernate.type.descriptor.sql.internal.CapacityDependentDdlType@1653b84e) replaced previous registration(org.hibernate.type.descriptor.sql.internal.DdlTypeImpl@7f8a9454)
2026-06-17 23:50:12,421 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2026-06-17 23:50:12,421 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2026-06-17 23:50:12,422 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2026-06-17 23:50:12,422 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2026-06-17 23:50:12,422 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(16, SmallIntTypeDescriptor) replaced previous registration(BooleanTypeDescriptor)
2026-06-17 23:50:12,423 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-3, VarbinaryTypeDescriptor) replaced previous registration(VarbinaryTypeDescriptor)
2026-06-17 23:50:12,423 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-15, CharTypeDescriptor) replaced previous registration(NCharTypeDescriptor)
2026-06-17 23:50:12,423 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(2011, ClobTypeDescriptor(STREAM_BINDING)) replaced previous registration(NClobTypeDescriptor(DEFAULT))
2026-06-17 23:50:12,423 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-9, VarcharTypeDescriptor) replaced previous registration(NVarcharTypeDescriptor)
2026-06-17 23:50:12,423 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(2, DecimalTypeDescriptor) replaced previous registration(NumericTypeDescriptor)
2026-06-17 23:50:12,481 DEBUG [org.hib.typ.BasicTypeRegistry] (main) BasicTypeRegistry registration overwritten (2000 + org.hibernate.type.descriptor.java.ObjectJavaType@22d9c961); previous =`org.hibernate.type.NullType@29962b2f`
2026-06-17 23:50:12,481 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration JAVA_OBJECT -> org.hibernate.type.JavaObjectType@3b4086c1
2026-06-17 23:50:12,481 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@3b4086c1
2026-06-17 23:50:12,481 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Type registration key [java.lang.Object] overrode previous entry : `org.hibernate.type.JavaObjectType@525647f3`
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$1@56a4abd0) replaced previous registration(org.hibernate.type.descriptor.jdbc.InstantJdbcType@5eed6dfb)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$2@551be9f6) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalDateTimeJdbcType@269222ae)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$3@40d848f9) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalDateJdbcType@4a864d4d)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$4@46a123e4) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalTimeJdbcType@44bc2449)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$5@7558c24b) replaced previous registration(org.hibernate.type.descriptor.jdbc.OffsetDateTimeJdbcType@3a296107)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$6@646cd766) replaced previous registration(org.hibernate.type.descriptor.jdbc.OffsetTimeJdbcType@57151b3a)
2026-06-17 23:50:12,482 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$7@2dff7085) replaced previous registration(org.hibernate.type.descriptor.jdbc.ZonedDateTimeJdbcType@2faa55bb)
2026-06-17 23:50:12,485 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2026-06-17 23:50:12,485 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2026-06-17 23:50:12,485 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2026-06-17 23:50:12,487 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (main) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@6c742b84] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@5db3d57c]
2026-06-17 23:50:12,498 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=null}, physicalName=Name{catalog=null, schema=null}]
2026-06-17 23:50:12,500 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass br.gov.caixa.loterias.consultatransacao.domain.Transacao, the class will be discovered analyzing the implementing class
2026-06-17 23:50:12,500 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass io.quarkus.hibernate.orm.panache.PanacheEntity, the class will be discovered analyzing the implementing class
2026-06-17 23:50:12,522 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 23:50:12,524 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Transacao906
2026-06-17 23:50:12,525 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=SPL}, physicalName=Name{catalog=null, schema=SPL}]
2026-06-17 23:50:12,528 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.gov.caixa.loterias.consultatransacao.domain.Transacao906 on table SPLTB906_HTCO_MVTO
2026-06-17 23:50:12,598 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-06-17 23:50:12,611 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_REFERENCIA')
2026-06-17 23:50:12,611 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] is safe
2026-06-17 23:50:12,611 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 23:50:12,614 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dataReferencia with lazy=false
2026-06-17 23:50:12,615 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:dataReferencia]
2026-06-17 23:50:12,617 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dataReferencia
2026-06-17 23:50:12,619 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.DT_REFERENCIA
2026-06-17 23:50:12,619 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dataReferencia
2026-06-17 23:50:12,621 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CD')
2026-06-17 23:50:12,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property codigoLoterica with lazy=false
2026-06-17 23:50:12,621 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:codigoLoterica]
2026-06-17 23:50:12,621 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for codigoLoterica
2026-06-17 23:50:12,621 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_CD
2026-06-17 23:50:12,621 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property codigoLoterica
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TRANSACAO')
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nsu with lazy=false
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:nsu]
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nsu
2026-06-17 23:50:12,622 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_TRANSACAO
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nsu
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_LINHA')
2026-06-17 23:50:12,622 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property situacao with lazy=false
2026-06-17 23:50:12,623 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:situacao]
2026-06-17 23:50:12,623 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for situacao
2026-06-17 23:50:12,623 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_SITUACAO_LINHA
2026-06-17 23:50:12,623 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacao
2026-06-17 23:50:12,623 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.gov.caixa.loterias.consultatransacao.domain
2026-06-17 23:50:12,681 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 23:50:12,681 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Transacao909
2026-06-17 23:50:12,681 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.gov.caixa.loterias.consultatransacao.domain.Transacao909 on table SPLTB909_HTCO_LOG
2026-06-17 23:50:12,681 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_REFERENCIA')
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] is safe
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dataReferencia with lazy=false
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao909:dataReferencia]
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dataReferencia
2026-06-17 23:50:12,684 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB909_HTCO_LOG.DT_REFERENCIA
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dataReferencia
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CD')
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property codigoLoterica with lazy=false
2026-06-17 23:50:12,684 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to 
