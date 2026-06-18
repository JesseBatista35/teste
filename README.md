exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-17 21:57:50,070 DEBUG [org.jbo.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource FileSystemConfigSource[dir=/usr/src/app/secrets_files/SISPL_TQS] with ordinal 100
2026-06-17 21:57:50,077 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-06-17 21:57:50,301 DEBUG [org.hib.qua.feature] (main) Hibernate Features Enabled
2026-06-17 21:57:50,301 DEBUG [io.qua.hib.orm] (main) List of entities found by Quarkus deployment:
[br.gov.caixa.loterias.consultatransacao.domain.Transacao906, br.gov.caixa.loterias.consultatransacao.domain.Transacao909]
2026-06-17 21:57:50,368 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='totalRequests', tags=[]}, type: counter, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 21:57:50,369 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='concurrentRequests', tags=[]}, type: concurrent gauge, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 21:57:50,370 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='requestRate', tags=[]}, type: meter, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 21:57:50,371 DEBUG [io.sma.metrics] (main) SRMET01201: Register metric [metricId: MetricID{name='processTime', tags=[]}, type: timer, origin: RawMemberInfo{memberType=METHOD, declaringClassName='br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso', name='consultarTransacao', parameterTypeNames=[java.lang.String, java.lang.String, java.lang.String]}]
2026-06-17 21:57:50,488 DEBUG [io.net.uti.int.log.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-06-17 21:57:50,488 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-06-17 21:57:50,488 DEBUG [io.net.uti.int.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-06-17 21:57:50,494 DEBUG [io.qua.arc.impl] (main) ArC DI container initialized [beans=150, observers=8]
2026-06-17 21:57:50,500 DEBUG [org.hib.jpa.int.uti.LogHelper] (main) PersistenceUnitInfo [
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
2026-06-17 21:57:50,697 DEBUG [org.hib.Version] (main) HHH000412: Hibernate ORM core version 7.0.3.Final
2026-06-17 21:57:50,698 DEBUG [org.hib.cfg.Environment] (main) HHH000206: 'hibernate.properties' not found
2026-06-17 21:57:50,702 DEBUG [org.hib.orm.idg.factory] (main) Ignoring CDI for resolving IdentifierGenerator instances as extended or delayed CDI support was enabled
2026-06-17 21:57:50,703 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid2] -> [org.hibernate.id.UUIDGenerator]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [guid] -> [org.hibernate.id.GUIDGenerator]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid] -> [org.hibernate.id.UUIDHexGenerator]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [uuid.hex] -> [org.hibernate.id.UUIDHexGenerator]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [assigned] -> [org.hibernate.id.Assigned]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [identity] -> [org.hibernate.id.IdentityGenerator]
2026-06-17 21:57:50,704 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [select] -> [org.hibernate.id.SelectGenerator]
2026-06-17 21:57:50,705 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-06-17 21:57:50,705 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [increment] -> [org.hibernate.id.IncrementGenerator]
2026-06-17 21:57:50,705 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [foreign] -> [org.hibernate.id.ForeignGenerator]
2026-06-17 21:57:50,705 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-sequence] -> [org.hibernate.id.enhanced.SequenceStyleGenerator]
2026-06-17 21:57:50,706 DEBUG [org.hib.orm.idg.factory] (main) Registering IdentifierGenerator strategy [enhanced-table] -> [org.hibernate.id.enhanced.TableGenerator]
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@6ffd4c0d
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@118acf70
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@118acf70
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration true_false -> org.hibernate.type.BasicTypeReference@f723cdb
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@f723cdb
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@101bdd1c
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@101bdd1c
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@62c3f556
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [B -> org.hibernate.type.BasicTypeReference@3dc68586
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@380ce5a3
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@380ce5a3
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration image -> org.hibernate.type.BasicTypeReference@31da0434
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration blob -> org.hibernate.type.BasicTypeReference@423ed3b5
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@423ed3b5
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@74960e9d
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@fb5aeed
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@37af24cb
2026-06-17 21:57:50,799 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration integer -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration int -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@2fc49538
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@7ca492d9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@443cdaa4
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@6aa5974e
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@21390938
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@21390938
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@7a388990
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@7a388990
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@4c319d52
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@6db328f8
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration string -> org.hibernate.type.BasicTypeReference@61b65d54
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@61b65d54
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nstring -> org.hibernate.type.BasicTypeReference@43935e9c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration characters -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration char[] -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration [C -> org.hibernate.type.BasicTypeReference@790d8fdd
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@5f8a02cf
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration text -> org.hibernate.type.BasicTypeReference@70b6db83
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ntext -> org.hibernate.type.BasicTypeReference@559af296
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration clob -> org.hibernate.type.BasicTypeReference@18709cb2
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@18709cb2
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration nclob -> org.hibernate.type.BasicTypeReference@370ef50b
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@370ef50b
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@4b87760e
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@1b24ea2a
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@2d313c8c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@113f9078
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@586495f1
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@2a0ea492
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> org.hibernate.type.BasicTypeReference@2e56b4d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@2e56b4d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@b5ac0c1
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@b5ac0c1
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@55846997
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@55846997
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@168142da
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@168142da
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@36f6e521
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@36f6e521
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@50211483
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@1472208d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@6de004f1
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@6de004f1
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@191c6e13
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@1a8e9ed9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@12fcb2c3
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@39ab5ef7
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@39ab5ef7
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@4b195203
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@23444a36
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration date -> org.hibernate.type.BasicTypeReference@30a9e3db
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@30a9e3db
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration time -> org.hibernate.type.BasicTypeReference@16a3cc88
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@16a3cc88
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@4f081b5d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@265c1a7c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@19f02280
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@19827608
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration instant -> org.hibernate.type.BasicTypeReference@14b528b6
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@14b528b6
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@450f0235
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@fbe70d8
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@7d2c345d
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration class -> org.hibernate.type.BasicTypeReference@5db948c9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@5db948c9
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@7aea704c
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration locale -> org.hibernate.type.BasicTypeReference@4ae2e781
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@4ae2e781
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration serializable -> org.hibernate.type.BasicTypeReference@7d1c164a
2026-06-17 21:57:50,800 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@7d1c164a
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration timezone -> org.hibernate.type.BasicTypeReference@3b35798
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@3b35798
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@6a2d867d
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@6a2d867d
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration url -> org.hibernate.type.BasicTypeReference@3830b06c
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@3830b06c
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration vector -> org.hibernate.type.BasicTypeReference@784d9bc
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration float_vector -> org.hibernate.type.BasicTypeReference@426131d7
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration double_vector -> org.hibernate.type.BasicTypeReference@7c7e73c5
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration byte_vector -> org.hibernate.type.BasicTypeReference@58687fb7
2026-06-17 21:57:50,801 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration row_version -> org.hibernate.type.BasicTypeReference@3a3b10f4
2026-06-17 21:57:50,803 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration object -> org.hibernate.type.JavaObjectType@525647f3
2026-06-17 21:57:50,803 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@525647f3
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration null -> org.hibernate.type.NullType@29962b2f
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@691541bc
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@43a4a9e5
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@35145874
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@11df2829
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@f245bdd
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@280fafd
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@14b275bd
2026-06-17 21:57:50,804 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@4b03cbad
2026-06-17 21:57:50,806 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting Scanner [io.quarkus.hibernate.orm.runtime.boot.scan.QuarkusScanner@5c313224] into BootstrapContext; was [null]
2026-06-17 21:57:50,806 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanEnvironment [org.hibernate.jpa.boot.internal.StandardJpaScanEnvironmentImpl@4b957db0] into BootstrapContext; was [null]
2026-06-17 21:57:50,806 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting ScanOptions [org.hibernate.boot.archive.scan.internal.StandardScanOptions@8840c98] into BootstrapContext; was [org.hibernate.boot.archive.scan.internal.StandardScanOptions@626b639e]
2026-06-17 21:57:50,809 DEBUG [org.hib.boo.int.BootstrapContextImpl] (main) Injecting JPA temp ClassLoader [null] into BootstrapContext; was [null]
2026-06-17 21:57:50,809 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) ClassLoaderAccessImpl#injectTempClassLoader(null) [was null]
2026-06-17 21:57:50,872 DEBUG [org.hib.orm.deprecation] (main) HHH90000025: DB2zDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-06-17 21:57:50,872 DEBUG [org.hib.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.DB2zDialect, version: 12.1
2026-06-17 21:57:50,877 DEBUG [org.hib.orm.jdb.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-06-17 21:57:50,886 DEBUG [org.hib.orm.con.pooling] (main) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database version: 12.1
	Autocommit mode: undefined/unknown
	Isolation level: <unknown>
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-06-17 21:57:50,891 DEBUG [org.hib.typ.des.sql.spi.DdlTypeRegistry] (main) addDescriptor(-2, org.hibernate.type.descriptor.sql.internal.CapacityDependentDdlType@1653b84e) replaced previous registration(org.hibernate.type.descriptor.sql.internal.DdlTypeImpl@7f8a9454)
2026-06-17 21:57:50,892 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2026-06-17 21:57:50,892 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2026-06-17 21:57:50,892 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(16, SmallIntTypeDescriptor) replaced previous registration(BooleanTypeDescriptor)
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-3, VarbinaryTypeDescriptor) replaced previous registration(VarbinaryTypeDescriptor)
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-15, CharTypeDescriptor) replaced previous registration(NCharTypeDescriptor)
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(2011, ClobTypeDescriptor(STREAM_BINDING)) replaced previous registration(NClobTypeDescriptor(DEFAULT))
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(-9, VarcharTypeDescriptor) replaced previous registration(NVarcharTypeDescriptor)
2026-06-17 21:57:50,893 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(2, DecimalTypeDescriptor) replaced previous registration(NumericTypeDescriptor)
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.BasicTypeRegistry] (main) BasicTypeRegistry registration overwritten (2000 + org.hibernate.type.descriptor.java.ObjectJavaType@22d9c961); previous =`org.hibernate.type.NullType@29962b2f`
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration JAVA_OBJECT -> org.hibernate.type.JavaObjectType@3b4086c1
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@3b4086c1
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Type registration key [java.lang.Object] overrode previous entry : `org.hibernate.type.JavaObjectType@525647f3`
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$1@56a4abd0) replaced previous registration(org.hibernate.type.descriptor.jdbc.InstantJdbcType@5eed6dfb)
2026-06-17 21:57:50,896 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$2@551be9f6) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalDateTimeJdbcType@269222ae)
2026-06-17 21:57:50,897 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$3@40d848f9) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalDateJdbcType@4a864d4d)
2026-06-17 21:57:50,897 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$4@46a123e4) replaced previous registration(org.hibernate.type.descriptor.jdbc.LocalTimeJdbcType@44bc2449)
2026-06-17 21:57:50,897 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$5@7558c24b) replaced previous registration(org.hibernate.type.descriptor.jdbc.OffsetDateTimeJdbcType@3a296107)
2026-06-17 21:57:50,897 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$6@646cd766) replaced previous registration(org.hibernate.type.descriptor.jdbc.OffsetTimeJdbcType@57151b3a)
2026-06-17 21:57:50,897 DEBUG [org.hib.typ.des.jdb.spi.JdbcTypeRegistry] (main) addDescriptor(org.hibernate.dialect.DB2Dialect$7@2dff7085) replaced previous registration(org.hibernate.type.descriptor.jdbc.ZonedDateTimeJdbcType@2faa55bb)
2026-06-17 21:57:50,899 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2026-06-17 21:57:50,899 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2026-06-17 21:57:50,899 DEBUG [org.hib.typ.BasicTypeRegistry] (main) Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2026-06-17 21:57:50,901 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (main) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@6c742b84] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@5db3d57c]
2026-06-17 21:57:50,962 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=null}, physicalName=Name{catalog=null, schema=null}]
2026-06-17 21:57:50,964 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass br.gov.caixa.loterias.consultatransacao.domain.Transacao, the class will be discovered analyzing the implementing class
2026-06-17 21:57:50,964 DEBUG [org.hib.boo.mod.sou.int.ann.AnnotationMetadataSourceProcessorImpl] (main) Skipping explicit MappedSuperclass io.quarkus.hibernate.orm.panache.PanacheEntity, the class will be discovered analyzing the implementing class
2026-06-17 21:57:50,984 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 21:57:50,986 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Transacao906
2026-06-17 21:57:50,988 DEBUG [org.hib.boo.mod.rel.Namespace] (main) Created database namespace [logicalName=Name{catalog=null, schema=SPL}, physicalName=Name{catalog=null, schema=SPL}]
2026-06-17 21:57:51,004 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.gov.caixa.loterias.consultatransacao.domain.Transacao906 on table SPLTB906_HTCO_MVTO
2026-06-17 21:57:51,009 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-06-17 21:57:51,062 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_REFERENCIA')
2026-06-17 21:57:51,062 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] is safe
2026-06-17 21:57:51,062 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 21:57:51,065 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dataReferencia with lazy=false
2026-06-17 21:57:51,067 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:dataReferencia]
2026-06-17 21:57:51,069 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dataReferencia
2026-06-17 21:57:51,071 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.DT_REFERENCIA
2026-06-17 21:57:51,071 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dataReferencia
2026-06-17 21:57:51,073 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CD')
2026-06-17 21:57:51,073 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property codigoLoterica with lazy=false
2026-06-17 21:57:51,073 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:codigoLoterica]
2026-06-17 21:57:51,073 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for codigoLoterica
2026-06-17 21:57:51,073 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_CD
2026-06-17 21:57:51,073 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property codigoLoterica
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TRANSACAO')
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nsu with lazy=false
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:nsu]
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nsu
2026-06-17 21:57:51,074 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_TRANSACAO
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nsu
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_LINHA')
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property situacao with lazy=false
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao906:situacao]
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for situacao
2026-06-17 21:57:51,074 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB906_HTCO_MVTO.NU_SITUACAO_LINHA
2026-06-17 21:57:51,074 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacao
2026-06-17 21:57:51,075 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.gov.caixa.loterias.consultatransacao.domain
2026-06-17 21:57:51,082 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Binding entity from annotated class: br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 21:57:51,082 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Import with entity name Transacao909
2026-06-17 21:57:51,082 DEBUG [org.hib.boo.mod.int.EntityBinder] (main) Bind entity br.gov.caixa.loterias.consultatransacao.domain.Transacao909 on table SPLTB909_HTCO_LOG
2026-06-17 21:57:51,082 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedDiscriminatorColumn(column='DTYPE')
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='DT_REFERENCIA')
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] is safe
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property dataReferencia with lazy=false
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao909:dataReferencia]
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for dataReferencia
2026-06-17 21:57:51,084 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB909_HTCO_LOG.DT_REFERENCIA
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property dataReferencia
2026-06-17 21:57:51,084 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_CD')
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property codigoLoterica with lazy=false
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao909:codigoLoterica]
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for codigoLoterica
2026-06-17 21:57:51,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB909_HTCO_LOG.NU_CD
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property codigoLoterica
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_TRANSACAO')
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property nsu with lazy=false
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao909:nsu]
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for nsu
2026-06-17 21:57:51,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB909_HTCO_LOG.NU_TRANSACAO
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property nsu
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.AnnotatedColumn] (main) Binding column: AnnotatedColumn(column='NU_SITUACAO_LINHA')
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) MetadataSourceProcessor property situacao with lazy=false
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.AbstractPropertyHolder] (main) Attempting to locate auto-apply AttributeConverter for property [br.gov.caixa.loterias.consultatransacao.domain.Transacao909:situacao]
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) building BasicValue for situacao
2026-06-17 21:57:51,085 DEBUG [org.hib.map.BasicValue] (main) Skipping column re-registration: SPLTB909_HTCO_LOG.NU_SITUACAO_LINHA
2026-06-17 21:57:51,085 DEBUG [org.hib.boo.mod.int.PropertyBinder] (main) Building property situacao
2026-06-17 21:57:51,085 DEBUG [io.qua.hib.orm.run.ser.FlatClassLoaderService] (main) HHH000194: Package not found or no package-info.java: br.gov.caixa.loterias.consultatransacao.domain
2026-06-17 21:57:51,087 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dataReferencia
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for codigoLoterica
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nsu
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for situacao
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for dataReferencia
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for codigoLoterica
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for nsu
2026-06-17 21:57:51,088 DEBUG [org.hib.boo.mod.int.BasicValueBinder] (main) Starting `BasicValueBinder#fillSimpleValue` for situacao
2026-06-17 21:57:51,091 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [dt_referencia] to be non-null as it is part of the primary key for table [spltb906_htco_mvto]
2026-06-17 21:57:51,091 DEBUG [org.hib.map.PrimaryKey] (main) Forcing column [dt_referencia] to be non-null as it is part of the primary key for table [spltb909_htco_log]
2026-06-17 21:57:51,105 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-06-17 21:57:51,105 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-06-17 21:57:51,105 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-06-17 21:57:51,105 DEBUG [org.hib.boo.reg.int.BootstrapServiceRegistryImpl] (main) Implicitly destroying Boot-strap registry on de-registration of all child ServiceRegistries
2026-06-17 21:57:51,106 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] is safe
2026-06-17 21:57:51,106 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 21:57:51,107 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) Not known whether passed class name [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] is safe
2026-06-17 21:57:51,107 DEBUG [org.hib.boo.int.ClassLoaderAccessImpl] (main) No temp ClassLoader provided; using live ClassLoader for loading potentially unsafe class : br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 21:57:51,163 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 668 ms
2026-06-17 21:57:51,169 DEBUG [org.hib.val.int.uti.Version] (main) HV000001: Hibernate Validator 8.0.2.Final
2026-06-17 21:57:51,171 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom LocaleResolver of type io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper
2026-06-17 21:57:51,173 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom BeanMetaDataClassNormalizer of type io.quarkus.hibernate.validator.runtime.ArcProxyBeanMetaDataClassNormalizer
2026-06-17 21:57:51,180 DEBUG [io.qua.arc.impl] (main) Loaded 90 removed beans lazily
2026-06-17 21:57:51,181 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ConstraintValidatorFactory of type io.quarkus.hibernate.validator.runtime.ArcConstraintValidatorFactoryImpl
2026-06-17 21:57:51,181 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
2026-06-17 21:57:51,182 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) Setting custom ClockProvider of type io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider
2026-06-17 21:57:51,183 DEBUG [org.hib.val.int.eng.AbstractConfigurationImpl] (main) HV000002: Ignoring XML configuration.
2026-06-17 21:57:51,194 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-06-17 21:57:51,194 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ValidationMessages not found.
2026-06-17 21:57:51,194 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000255: Using io.quarkus.hibernate.validator.runtime.locale.LocaleResolversWrapper as locale resolver.
2026-06-17 21:57:51,195 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-06-17 21:57:51,195 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) ContributorValidationMessages not found.
2026-06-17 21:57:51,197 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-06-17 21:57:51,198 DEBUG [org.hib.val.res.PlatformResourceBundleLocator] (main) org.hibernate.validator.ValidationMessages found.
2026-06-17 21:57:51,201 DEBUG [org.hib.val.mes.ResourceBundleMessageInterpolator] (main) Loaded expression factory via original TCCL
2026-06-17 21:57:51,203 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
2026-06-17 21:57:51,268 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator as ValidatorFactory-scoped message interpolator.
2026-06-17 21:57:51,268 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
2026-06-17 21:57:51,268 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
2026-06-17 21:57:51,268 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using io.quarkus.hibernate.validator.runtime.clockprovider.RuntimeReinitializedDefaultClockProvider as ValidatorFactory-scoped clock provider.
2026-06-17 21:57:51,268 DEBUG [org.hib.val.int.eng.ValidatorFactoryConfigurationHelper] (main) HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
2026-06-17 21:57:51,271 DEBUG [io.qua.arc.run.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.validator.runtime.HibernateValidatorRecorder$2 finished in 108 ms
2026-06-17 21:57:51,297 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.consultatransacao.ApiApplication()
2026-06-17 21:57:51,298 DEBUG [org.jbo.res.res.i18n] (main) RESTEASY002225: Deploying jakarta.ws.rs.core.Application: class br.gov.caixa.loterias.consultatransacao.ApiApplication
2026-06-17 21:57:51,301 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyViolationExceptionMapper()
2026-06-17 21:57:51,311 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusObjectMapperContextResolver()
2026-06-17 21:57:51,313 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectWriter()
2026-06-17 21:57:51,313 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectWriter()
2026-06-17 21:57:51,314 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReactiveStreamProvider()
2026-06-17 21:57:51,314 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.CacheControlFeature()
2026-06-17 21:57:51,315 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.CacheControlFeature()
2026-06-17 21:57:51,315 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.ServerContentEncodingAnnotationFeature()
2026-06-17 21:57:51,316 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.JsonProcessingExceptionMapper()
2026-06-17 21:57:51,316 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.CompletionStageProvider()
2026-06-17 21:57:51,316 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.ClientContentEncodingAnnotationFeature()
2026-06-17 21:57:51,317 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationCompletionExceptionMapper()
2026-06-17 21:57:51,362 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-06-17 21:57:51,367 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-06-17 21:57:51,367 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-06-17 21:57:51,367 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider()
2026-06-17 21:57:51,368 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-06-17 21:57:51,369 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-06-17 21:57:51,369 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-06-17 21:57:51,369 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.common.runtime.jackson.QuarkusJacksonSerializer()
2026-06-17 21:57:51,369 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayReader()
2026-06-17 21:57:51,369 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayReader()
2026-06-17 21:57:51,370 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.hibernate.orm.rest.data.panache.runtime.RestDataPanacheExceptionMapper()
2026-06-17 21:57:51,370 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectReader()
2026-06-17 21:57:51,370 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonObjectReader()
2026-06-17 21:57:51,371 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-06-17 21:57:51,371 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-06-17 21:57:51,371 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-06-17 21:57:51,371 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileProvider()
2026-06-17 21:57:51,372 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.consultatransacao.exception.NegocioExceptionHandler()
2026-06-17 21:57:51,372 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.ForbiddenExceptionMapper()
2026-06-17 21:57:51,374 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.CompositeExceptionMapper()
2026-06-17 21:57:51,375 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationRedirectExceptionMapper()
2026-06-17 21:57:51,376 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.MultiValuedParamConverterProvider()
2026-06-17 21:57:51,377 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-06-17 21:57:51,377 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-06-17 21:57:51,377 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-06-17 21:57:51,377 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ByteArrayProvider()
2026-06-17 21:57:51,377 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.consultatransacao.exception.ParametroInvalidoExceptionHandler()
2026-06-17 21:57:51,379 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-06-17 21:57:51,379 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-06-17 21:57:51,379 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-06-17 21:57:51,379 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StringTextStar()
2026-06-17 21:57:51,379 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayWriter()
2026-06-17 21:57:51,380 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.vertx.JsonArrayWriter()
2026-06-17 21:57:51,380 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.UnauthorizedExceptionMapper()
2026-06-17 21:57:51,380 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.AuthenticationFailedExceptionMapper()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StreamingOutputProvider()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.StreamingOutputProvider()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-06-17 21:57:51,381 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.ReaderProvider()
2026-06-17 21:57:51,382 DEBUG [io.qua.res.runtime] (main) Create constructor: public br.gov.caixa.loterias.consultatransacao.exception.ExceptionHandlerGenerico()
2026-06-17 21:57:51,382 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-06-17 21:57:51,383 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-06-17 21:57:51,383 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-06-17 21:57:51,383 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.DataSourceProvider()
2026-06-17 21:57:51,383 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.AsyncStreamingOutputProvider()
2026-06-17 21:57:51,383 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.AsyncStreamingOutputProvider()
2026-06-17 21:57:51,384 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileRangeWriter()
2026-06-17 21:57:51,384 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.FileRangeWriter()
2026-06-17 21:57:51,384 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-06-17 21:57:51,385 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-06-17 21:57:51,385 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-06-17 21:57:51,385 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.InputStreamProvider()
2026-06-17 21:57:51,470 DEBUG [io.qua.res.runtime] (main) Create resource constructor: public br.gov.caixa.loterias.consultatransacao.resource.ConsultaTransacaoRecurso()
2026-06-17 21:57:51,475 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.runtime.EagerSecurityFilter()
2026-06-17 21:57:51,483 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.jackson.PatchMethodFilter()
2026-06-17 21:57:51,483 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.providers.sse.SseEventSinkInterceptor()
2026-06-17 21:57:51,483 DEBUG [io.qua.res.runtime] (main) Create constructor: public org.jboss.resteasy.plugins.interceptors.MessageSanitizerContainerResponseFilter()
2026-06-17 21:57:51,484 DEBUG [io.qua.res.runtime] (main) Create constructor: public io.quarkus.resteasy.links.runtime.hal.HalServerResponseFilter()
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/sispl-consulta-transacao-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource FileSystemConfigSource[dir=/usr/src/app/secrets_files/SISPL_TQS] with ordinal 100
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource null:null:ServletConfigSource with ordinal 60
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource null:null:FilterConfigSource with ordinal 50
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource null:ServletContextConfigSource with ordinal 40
2026-06-17 21:57:51,562 DEBUG [io.sma.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-06-17 21:57:51,765 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) -Dio.netty.noUnsafe: false
2026-06-17 21:57:51,766 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) Java version: 17
2026-06-17 21:57:51,767 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.Buffer.address: available
2026-06-17 21:57:51,767 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.Bits.unaligned: available, true
2026-06-17 21:57:51,768 DEBUG [io.net.uti.int.PlatformDependent0] (Thread-1) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-06-17 21:57:51,768 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) sun.misc.Unsafe: available
2026-06-17 21:57:51,768 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-06-17 21:57:51,768 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-06-17 21:57:51,769 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.maxDirectMemory: -1 bytes
2026-06-17 21:57:51,769 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-06-17 21:57:51,769 DEBUG [io.net.uti.int.CleanerJava9] (Thread-1) java.nio.ByteBuffer.cleaner(): available
2026-06-17 21:57:51,769 DEBUG [io.net.uti.int.PlatformDependent] (Thread-1) -Dio.netty.noPreferDirect: false
2026-06-17 21:57:51,770 DEBUG [io.net.cha.DefaultChannelId] (Thread-1) -Dio.netty.processId: 8 (auto-detected)
2026-06-17 21:57:51,772 DEBUG [io.net.cha.DefaultChannelId] (Thread-1) -Dio.netty.machineId: 46:cd:57:ec:7b:b5:e5:7f (user-set)
2026-06-17 21:57:51,864 DEBUG [io.ver.cor.log.LoggerFactory] (main) Using io.vertx.core.logging.SLF4JLogDelegateFactory
2026-06-17 21:57:51,870 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/1577459236554653119
2026-06-17 21:57:51,880 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-06-17 21:57:51,880 DEBUG [io.net.uti.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-06-17 21:57:51,889 DEBUG [io.net.cha.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 2
2026-06-17 21:57:51,893 DEBUG [io.net.uti.con.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-06-17 21:57:51,897 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-06-17 21:57:51,897 DEBUG [io.net.cha.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-06-17 21:57:51,900 DEBUG [io.net.uti.int.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-06-17 21:57:51,910 DEBUG [io.qua.ver.cor.run.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-06-17 21:57:51,976 DEBUG [com.arj.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-06-17 21:57:52,276 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv4Stack: false
2026-06-17 21:57:52,277 DEBUG [io.net.uti.NetUtil] (main) -Djava.net.preferIPv6Addresses: false
2026-06-17 21:57:52,278 DEBUG [io.net.uti.NetUtilInitializations] (main) Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
2026-06-17 21:57:52,278 DEBUG [io.net.uti.NetUtil] (main) /proc/sys/net/core/somaxconn: 4096
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numHeapArenas: 2
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.numDirectArenas: 2
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.pageSize: 8192
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxOrder: 3
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.chunkSize: 65536
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.smallCacheSize: 256
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.normalCacheSize: 64
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimInterval: 8192
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
2026-06-17 21:57:52,400 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.useCacheForAllThreads: false
2026-06-17 21:57:52,401 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
2026-06-17 21:57:52,401 DEBUG [io.net.buf.PooledByteBufAllocator] (vert.x-eventloop-thread-1) -Dio.netty.allocator.disableCacheFinalizersForFastThreadLocalThreads: false
2026-06-17 21:57:52,405 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.allocator.type: pooled
2026-06-17 21:57:52,406 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.threadLocalDirectBufferSize: 0
2026-06-17 21:57:52,406 DEBUG [io.net.buf.ByteBufUtil] (vert.x-eventloop-thread-1) -Dio.netty.maxThreadLocalCharBufferSize: 16384
2026-06-17 21:57:52,409 DEBUG [io.net.boo.ChannelInitializerExtensions] (vert.x-eventloop-thread-1) -Dio.netty.bootstrap.extensions: null
2026-06-17 21:57:52,499 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:90ee8c5de5bfa62d2ae2ff7097c4857, Subject:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:96139010, Valid from:11/2/17, 10:24 AM, Valid until:11/2/27, 9:24 AM
2026-06-17 21:57:52,501 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:40000000001444ef03631, Subject:CN=AlphaSSL CA - SHA256 - G2, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:548631210, Valid from:2/20/14, 7:00 AM, Valid until:2/20/24, 7:00 AM
2026-06-17 21:57:52,502 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:47b583ffce303b8047ba716d908e88d2, Subject:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:71683228, Valid from:12/23/22, 11:55 AM, Valid until:12/23/42, 12:05 PM
2026-06-17 21:57:52,503 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1ff8b0e2c3fd345a, Subject:CN=loginxdes.caixa.gov.br, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:-1555469654, Valid from:5/11/21, 9:51 AM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,504 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:150e88f84f214ace9186fcb9aa13bbbb, Subject:CN=login2.tqs.caixa.gov.br, Issuer:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Key type:RSA, Length:2048, Cert Id:418081379, Valid from:6/5/24, 9:00 PM, Valid until:6/6/25, 8:59 PM
2026-06-17 21:57:52,505 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:fa74722c53d88c80f589efb1f9d4a3a, Subject:CN=Microsoft RSA TLS CA 02, O=Microsoft Corporation, C=US, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:4096, Cert Id:996801192, Valid from:7/21/20, 8:00 PM, Valid until:10/8/24, 4:00 AM
2026-06-17 21:57:52,506 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:95acf6e02c380d079ca3b57583a41a7, Subject:CN=*.bcb.gov.br, Issuer:CN=Thawte TLS RSA CA G1, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:83932897, Valid from:10/24/23, 9:00 PM, Valid until:11/24/24, 8:59 PM
2026-06-17 21:57:52,507 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00 PM, Valid until:11/20/28, 9:00 PM
2026-06-17 21:57:52,508 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:dbba38ee1c516cf1ad31d93ccbdc4ead, Subject:CN=logintqs.caixa.gov.br, Issuer:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Key type:RSA, Length:2048, Cert Id:1953798219, Valid from:6/6/24, 9:00 PM, Valid until:6/7/25, 8:59 PM
2026-06-17 21:57:52,508 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:47be70e66ecd58f3, Subject:CN=LOGIN.DES.CAIXA, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:-1342256041, Valid from:3/23/22, 7:27 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,562 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00 PM, Valid until:2/11/29, 8:59 PM
2026-06-17 21:57:52,563 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:77bd0d8bd8393e66d492f8a39ddff004, Subject:CN=Soluti CA - OV, O=SOLUTI - SOLUCOES EM NEGOCIOS INTELIGENTES S/A, C=BR, Issuer:CN=Trusted Root TLS CA SHA256 G3, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:1941238576, Valid from:7/4/20, 9:00 PM, Valid until:2/23/26, 9:00 PM
2026-06-17 21:57:52,564 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00 PM, Valid until:8/1/33, 8:59 PM
2026-06-17 21:57:52,565 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:-1197580894, Valid from:12/31/03, 10:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,565 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1a35f2c1c3dbd2c1, Subject:CN=sicco.webservices.des.caixa, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:-937095708, Valid from:11/29/19, 2:42 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,567 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:4188b0e1a030eda84084ca76a3b1be32, Subject:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-1788474838, Valid from:10/13/22, 2:25 PM, Valid until:10/13/42, 2:35 PM
2026-06-17 21:57:52,568 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:2, Subject:CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:-148717755, Valid from:1/9/17, 5:36 PM, Valid until:2/15/29, 4:36 PM
2026-06-17 21:57:52,569 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:39bbd8f1543cc5bf, Subject:CN=CICSWEB.DES.CAIXA, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:2052730590, Valid from:9/18/20, 9:32 AM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,570 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7983603ade39908219ca00c27bc8a6c, Subject:CN=RapidSSL TLS DV RSA Mixed SHA256 2020 CA-1, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:-1439800652, Valid from:7/16/20, 9:25 AM, Valid until:5/31/23, 8:59 PM
2026-06-17 21:57:52,570 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46 PM, Valid until:5/12/25, 8:59 PM
2026-06-17 21:57:52,571 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:f14965f202069994fd5c7ac788941e2, Subject:CN=Microsoft RSA TLS CA 01, O=Microsoft Corporation, C=US, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:4096, Cert Id:-1094593825, Valid from:7/21/20, 8:00 PM, Valid until:10/8/24, 4:00 AM
2026-06-17 21:57:52,572 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:f538647e5941c12, Subject:CN=AC Corporativa Multipla v4, OU=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-492032866, Valid from:9/2/14, 1:29 PM, Valid until:8/29/24, 1:29 PM
2026-06-17 21:57:52,573 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:-1835097136, Valid from:11/1/18, 9:00 PM, Valid until:12/31/30, 8:59 PM
2026-06-17 21:57:52,574 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:600000000299b24b9d7901ea84000000000002, Subject:CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-1847337803, Valid from:12/23/22, 12:47 PM, Valid until:12/23/42, 12:05 PM
2026-06-17 21:57:52,575 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:143df92b7cfcb4c9, Subject:CN=API.DES.CAIXA, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:1908071789, Valid from:7/7/22, 12:43 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,575 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1, Subject:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:827042461, Valid from:3/2/16, 10:01 AM, Valid until:3/2/29, 8:59 PM
2026-06-17 21:57:52,576 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:5, Subject:CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR, Issuer:CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR, Key type:RSA, Length:4096, Cert Id:1380576325, Valid from:9/14/16, 10:10 AM, Valid until:3/2/29, 9:00 AM
2026-06-17 21:57:52,577 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:3beb18aa368cf3de, Subject:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Multipla v4, OU=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-902178316, Valid from:9/2/14, 1:32 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,577 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:c6ae97cced599838690a00a9ea53214, Subject:CN=Microsoft Azure TLS Issuing CA 02, O=Microsoft Corporation, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:-583698405, Valid from:7/29/20, 9:30 AM, Valid until:6/27/24, 8:59 PM
2026-06-17 21:57:52,578 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:3beb18aa368cf3de, Subject:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Multipla v4, OU=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-902178316, Valid from:9/2/14, 1:32 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,578 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:-1134778060, Valid from:3/11/19, 9:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,579 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00 AM, Valid until:1/28/28, 9:00 AM
2026-06-17 21:57:52,579 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1ee5f221dfc623bd4333a8557, Subject:CN=GlobalSign RSA OV SSL CA 2018, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:930132802, Valid from:11/20/18, 10:00 PM, Valid until:11/20/28, 9:00 PM
2026-06-17 21:57:52,580 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46 PM, Valid until:5/12/25, 8:59 PM
2026-06-17 21:57:52,580 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:f14965f202069994fd5c7ac788941e2, Subject:CN=Microsoft RSA TLS CA 01, O=Microsoft Corporation, C=US, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:4096, Cert Id:-1094593825, Valid from:7/21/20, 8:00 PM, Valid until:10/8/24, 4:00 AM
2026-06-17 21:57:52,581 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00 PM, Valid until:11/9/31, 9:00 PM
2026-06-17 21:57:52,581 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:da8f5fc09106876, Subject:CN=des.barramento.caixa, OU=AC Corporativa Aplicacoes v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Aplicacoes v4, OU=AC Corporativa Multipla v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:2048, Cert Id:-294983714, Valid from:6/18/20, 5:59 PM, Valid until:8/28/24, 1:32 PM
2026-06-17 21:57:52,582 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00 PM, Valid until:11/9/31, 9:00 PM
2026-06-17 21:57:52,582 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:-1197580894, Valid from:12/31/03, 10:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,583 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:888cd525f1924444d14a58291deb952, Subject:CN=Microsoft IT TLS CA 5, OU=Microsoft IT, O=Microsoft Corporation, L=Redmond, ST=Washington, C=US, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:4096, Cert Id:1601269688, Valid from:5/20/16, 9:53 AM, Valid until:5/20/24, 9:53 AM
2026-06-17 21:57:52,583 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:abf3da611b460f8, Subject:CN=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Corporativa Caixa v4, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-959525657, Valid from:9/2/14, 1:23 PM, Valid until:8/30/24, 1:23 PM
2026-06-17 21:57:52,584 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:7d5b5126b476ba11db74160bbc530da7, Subject:CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:2048, Cert Id:-1835097136, Valid from:11/1/18, 9:00 PM, Valid until:12/31/30, 8:59 PM
2026-06-17 21:57:52,584 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:-1446618248, Valid from:12/18/19, 7:51 PM, Valid until:7/18/42, 8:00 PM
2026-06-17 21:57:52,585 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43f77db1b4ecc3bd7b869fe1, Subject:CN=*.caixavidaeprevidencia.com.br, O=CAIXA VIDA E PREVIDENCIA S/A, L=SAO PAULO, ST=SAO PAULO, C=BR, Issuer:CN=Soluti CA - OV, O=SOLUTI - SOLUCOES EM NEGOCIOS INTELIGENTES S/A, C=BR, Key type:RSA, Length:2048, Cert Id:1391500496, Valid from:9/13/23, 8:48 AM, Valid until:10/14/24, 8:48 AM
2026-06-17 21:57:52,586 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:36825e7fb5a481937ef6d1736bb93ca6, Subject:CN=COMODO RSA Organization Validation Secure Server CA, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:245647897, Valid from:2/11/14, 10:00 PM, Valid until:2/11/29, 8:59 PM
2026-06-17 21:57:52,586 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,587 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:62000000027328772c722ac752000000000002, Subject:CN=AC Interna APL, O=Caixa Economica Federal, C=BR, Issuer:CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR, Key type:RSA, Length:4096, Cert Id:-548122864, Valid from:10/13/22, 3:34 PM, Valid until:10/13/42, 2:35 PM
2026-06-17 21:57:52,587 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:-1134778060, Valid from:3/11/19, 9:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,588 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:-347365895, Valid from:1/31/10, 10:00 PM, Valid until:1/18/38, 8:59 PM
2026-06-17 21:57:52,675 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default protocols (JDK): [TLSv1.3, TLSv1.2] 
2026-06-17 21:57:52,675 DEBUG [io.net.han.ssl.JdkSslContext] (vert.x-eventloop-thread-1) Default cipher suites (JDK): [TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384]
2026-06-17 21:57:52,780 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkAccessible: true
2026-06-17 21:57:52,781 DEBUG [io.net.buf.AbstractByteBuf] (vert.x-eventloop-thread-1) -Dio.netty.buffer.checkBounds: true
2026-06-17 21:57:52,781 DEBUG [io.net.uti.ResourceLeakDetectorFactory] (vert.x-eventloop-thread-1) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@433e9e99
2026-06-17 21:57:52,784 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.maxCapacityPerThread: 4096
2026-06-17 21:57:52,784 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.ratio: 8
2026-06-17 21:57:52,784 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.chunkSize: 32
2026-06-17 21:57:52,784 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
2026-06-17 21:57:52,784 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.batchFastThreadLocalOnly: true
2026-06-17 21:57:52,795 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7253fcab8e5c287e01c7f7c396cad17d, Subject:CN=logindes.caixa.gov.br, Issuer:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Key type:RSA, Length:2048, Cert Id:771739022, Valid from:6/25/25, 9:00 PM, Valid until:6/26/26, 8:59 PM
2026-06-17 21:57:52,795 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:ce22972800344766b49ca5d407cd039, Subject:CN=Valid Certificadora RSA DV SSL CA, O=Valid Certificadora Digital LTDA, C=BR, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:3072, Cert Id:131886298, Valid from:8/1/23, 9:00 PM, Valid until:8/1/33, 8:59 PM
2026-06-17 21:57:52,796 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:3972443af922b751d7d36c10dd313595, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:-1134778060, Valid from:3/11/19, 9:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,866 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) ValidationChain: 131886298, 771739022
2026-06-17 21:57:52,868 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:5ec3b7a6437fa4e0, Subject:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Issuer:C=ES, O=ACCV, OU=PKIACCV, CN=ACCVRAIZ1, Key type:RSA, Length:4096, Cert Id:-592111236, Valid from:5/5/11, 6:37 AM, Valid until:12/31/30, 6:37 AM
2026-06-17 21:57:52,868 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5d938d306736c8061d1ac754846907, Subject:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Issuer:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Key type:RSA, Length:4096, Cert Id:1555523573, Valid from:10/29/08, 1:59 PM, Valid until:12/31/29, 9:00 PM
2026-06-17 21:57:52,869 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:62f6326ce5c4e3685c1b62dd9c2e9d95, Subject:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Issuer:CN=AC RAIZ FNMT-RCM SERVIDORES SEGUROS, OID.2.5.4.97=VATES-Q2826004J, OU=Ceres, O=FNMT-RCM, C=ES, Key type:EC, Length:384, Cert Id:246315697, Valid from:12/20/18, 7:37 AM, Valid until:12/20/43, 6:37 AM
2026-06-17 21:57:52,869 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:dd3e3bc6cf96bb1, Subject:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Issuer:CN=ANF Secure Server Root CA, OU=ANF CA Raiz, O=ANF Autoridad de Certificacion, C=ES, SERIALNUMBER=G63287510, Key type:RSA, Length:4096, Cert Id:-841649695, Valid from:9/4/19, 7:00 AM, Valid until:8/30/39, 7:00 AM
2026-06-17 21:57:52,870 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:570a119742c4e3cc, Subject:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Issuer:CN=Actalis Authentication Root CA, O=Actalis S.p.A./03358520967, L=Milan, C=IT, Key type:RSA, Length:4096, Cert Id:1729119956, Valid from:9/22/11, 8:22 AM, Valid until:9/22/30, 8:22 AM
2026-06-17 21:57:52,870 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7777062726a9b17c, Subject:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Commercial, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:630485644, Valid from:1/29/10, 12:06 PM, Valid until:12/31/30, 11:06 AM
2026-06-17 21:57:52,871 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:7c4f04391cd4992d, Subject:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Networking, O=AffirmTrust, C=US, Key type:RSA, Length:2048, Cert Id:651670175, Valid from:1/29/10, 12:08 PM, Valid until:12/31/30, 11:08 AM
2026-06-17 21:57:52,871 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:6d8c1446b1a60aee, Subject:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium, O=AffirmTrust, C=US, Key type:RSA, Length:4096, Cert Id:-2130283955, Valid from:1/29/10, 12:10 PM, Valid until:12/31/40, 11:10 AM
2026-06-17 21:57:52,872 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7497258ac73f7a54, Subject:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Issuer:CN=AffirmTrust Premium ECC, O=AffirmTrust, C=US, Key type:EC, Length:384, Cert Id:-2080363786, Valid from:1/29/10, 12:20 PM, Valid until:12/31/40, 11:20 AM
2026-06-17 21:57:52,873 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:66c9fcf99bf8c0a39e2f0788a43e696365bca, Subject:CN=Amazon Root CA 1, O=Amazon, C=US, Issuer:CN=Amazon Root CA 1, O=Amazon, C=US, Key type:RSA, Length:2048, Cert Id:-1472444962, Valid from:5/25/15, 9:00 PM, Valid until:1/16/38, 9:00 PM
2026-06-17 21:57:52,873 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:66c9fd29635869f0a0fe58678f85b26bb8a37, Subject:CN=Amazon Root CA 2, O=Amazon, C=US, Issuer:CN=Amazon Root CA 2, O=Amazon, C=US, Key type:RSA, Length:4096, Cert Id:-1766132388, Valid from:5/25/15, 9:00 PM, Valid until:5/25/40, 9:00 PM
2026-06-17 21:57:52,874 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:66c9fd5749736663f3b0b9ad9e89e7603f24a, Subject:CN=Amazon Root CA 3, O=Amazon, C=US, Issuer:CN=Amazon Root CA 3, O=Amazon, C=US, Key type:EC, Length:256, Cert Id:-1562287523, Valid from:5/25/15, 9:00 PM, Valid until:5/25/40, 9:00 PM
2026-06-17 21:57:52,874 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:66c9fd7c1bb104c2943e5717b7b2cc81ac10e, Subject:CN=Amazon Root CA 4, O=Amazon, C=US, Issuer:CN=Amazon Root CA 4, O=Amazon, C=US, Key type:EC, Length:384, Cert Id:-1654272513, Valid from:5/25/15, 9:00 PM, Valid until:5/25/40, 9:00 PM
2026-06-17 21:57:52,875 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5c33cb622c5fb332, Subject:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Issuer:C=DE, O=Atos, CN=Atos TrustedRoot 2011, Key type:RSA, Length:2048, Cert Id:-28528624, Valid from:7/7/11, 11:58 AM, Valid until:12/31/30, 8:59 PM
2026-06-17 21:57:52,875 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:53ec3beefbb2485f, Subject:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Issuer:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Key type:RSA, Length:4096, Cert Id:692250759, Valid from:5/20/09, 5:38 AM, Valid until:12/31/30, 5:38 AM
2026-06-17 21:57:52,876 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1b70e9d2ffae6c71, Subject:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Issuer:CN=Autoridad de Certificacion Firmaprofesional CIF A62634068, C=ES, Key type:RSA, Length:4096, Cert Id:-1766730314, Valid from:9/23/14, 12:22 PM, Valid until:5/5/36, 12:22 PM
2026-06-17 21:57:52,876 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:20000b9, Subject:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Issuer:CN=Baltimore CyberTrust Root, OU=CyberTrust, O=Baltimore, C=IE, Key type:RSA, Length:2048, Cert Id:1425294543, Valid from:5/12/00, 3:46 PM, Valid until:5/12/25, 8:59 PM
2026-06-17 21:57:52,876 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 2 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:969960563, Valid from:10/26/10, 6:38 AM, Valid until:10/26/40, 5:38 AM
2026-06-17 21:57:52,877 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2, Subject:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Issuer:CN=Buypass Class 3 Root CA, O=Buypass AS-983163327, C=NO, Key type:RSA, Length:4096, Cert Id:1264269967, Valid from:10/26/10, 6:28 AM, Valid until:10/26/40, 5:28 AM
2026-06-17 21:57:52,877 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:92b888dbb08ac163, Subject:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Issuer:CN=CA Disig Root R2, O=Disig a.s., L=Bratislava, C=SK, Key type:RSA, Length:4096, Cert Id:747175721, Valid from:7/19/12, 6:15 AM, Valid until:7/19/42, 6:15 AM
2026-06-17 21:57:52,877 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:184accd6, Subject:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Issuer:CN=CFCA EV ROOT, O=China Financial Certification Authority, C=CN, Key type:RSA, Length:4096, Cert Id:551407782, Valid from:8/8/12, 12:07 AM, Valid until:12/31/29, 12:07 AM
2026-06-17 21:57:52,878 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:4e812d8a8265e00b02ee3e350246e53d, Subject:CN=COMODO Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:904304908, Valid from:11/30/06, 10:00 PM, Valid until:12/31/29, 8:59 PM
2026-06-17 21:57:52,878 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:1f47afaa62007050544c019e9b63992a, Subject:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO ECC Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:EC, Length:384, Cert Id:1146488932, Valid from:3/5/08, 9:00 PM, Valid until:1/18/38, 8:59 PM
2026-06-17 21:57:52,879 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:4caaf9cadb636fe01ff74ed85b03869d, Subject:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:4096, Cert Id:1769425049, Valid from:1/18/10, 10:00 PM, Valid until:1/18/38, 8:59 PM
2026-06-17 21:57:52,879 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:fedce3010fc948ff, Subject:CN=Certigna, O=Dhimyotis, C=FR, Issuer:CN=Certigna, O=Dhimyotis, C=FR, Key type:RSA, Length:2048, Cert Id:-788091456, Valid from:6/29/07, 12:13 PM, Valid until:6/29/27, 12:13 PM
2026-06-17 21:57:52,880 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:cae91b89f155030da3e6416dc4e3a6e1, Subject:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Issuer:CN=Certigna Root CA, OU=0002 48146308100036, O=Dhimyotis, C=FR, Key type:RSA, Length:4096, Cert Id:356684591, Valid from:10/1/13, 5:32 AM, Valid until:10/1/33, 5:32 AM
2026-06-17 21:57:52,880 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:788f275c81125220a504d02dddba73f4, Subject:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum EC-384 CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:EC, Length:384, Cert Id:994586241, Valid from:3/26/18, 4:24 AM, Valid until:3/26/43, 4:24 AM
2026-06-17 21:57:52,881 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:444c0, Subject:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:2048, Cert Id:2014002193, Valid from:10/22/08, 10:07 AM, Valid until:12/31/29, 9:07 AM
2026-06-17 21:57:52,881 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:21d6d04a4f250fc93237fcaa5e128de9, Subject:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Issuer:CN=Certum Trusted Network CA 2, OU=Certum Certification Authority, O=Unizeto Technologies S.A., C=PL, Key type:RSA, Length:4096, Cert Id:1983350452, Valid from:10/6/11, 5:39 AM, Valid until:10/6/46, 5:39 AM
2026-06-17 21:57:52,882 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA512withRSA, Serial:1ebf5950b8c980374c06f7eb554fb5ed, Subject:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Issuer:CN=Certum Trusted Root CA, OU=Certum Certification Authority, O=Asseco Data Systems S.A., C=PL, Key type:RSA, Length:4096, Cert Id:-774327051, Valid from:3/16/18, 9:10 AM, Valid until:3/16/43, 9:10 AM
2026-06-17 21:57:52,882 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Issuer:CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB, Key type:RSA, Length:2048, Cert Id:-1197580894, Valid from:12/31/03, 10:00 PM, Valid until:12/31/28, 8:59 PM
2026-06-17 21:57:52,883 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7cc98f2b84d7dfea0fc9659ad34b4d96, Subject:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST BR Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:-83817738, Valid from:2/11/20, 6:45 AM, Valid until:2/11/35, 6:44 AM
2026-06-17 21:57:52,883 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5f0241d77a877c4c03a3ac968dfbffd0, Subject:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST EV Root CA 1 2020, O=D-Trust GmbH, C=DE, Key type:EC, Length:384, Cert Id:238735896, Valid from:2/11/20, 7:00 AM, Valid until:2/11/35, 6:59 AM
2026-06-17 21:57:52,884 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:983f3, Subject:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1430153102, Valid from:11/5/09, 6:35 AM, Valid until:11/5/29, 5:35 AM
2026-06-17 21:57:52,884 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:983f4, Subject:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Issuer:CN=D-TRUST Root Class 3 CA 2 EV 2009, O=D-Trust GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:971313728, Valid from:11/5/09, 6:50 AM, Valid until:11/5/29, 5:50 AM
2026-06-17 21:57:52,884 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:ce7e0e517d846fe8fe560fc1bf03039, Subject:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:-860404528, Valid from:11/9/06, 10:00 PM, Valid until:11/9/31, 9:00 PM
2026-06-17 21:57:52,885 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:b931c3ad63967ea6723bfc3af9af44b, Subject:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:-385398383, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,885 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:ba15afa1ddfa0b54944afcd24a06cec, Subject:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Assured ID Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:-645537245, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,886 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:83be056904246b1a1756ac95991c74a, Subject:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1341898239, Valid from:11/9/06, 10:00 PM, Valid until:11/9/31, 9:00 PM
2026-06-17 21:57:52,886 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:33af1e6a711a9a0bb2864b11d09fae5, Subject:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:1136084297, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,886 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:55556bcf25ea43535c3a40fd5ab4572, Subject:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Global Root G3, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:EC, Length:384, Cert Id:-795968543, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,886 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:2ac5c266a0b409b8f0b79f2ae462577, Subject:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert High Assurance EV Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:2048, Cert Id:-1410680354, Valid from:11/9/06, 10:00 PM, Valid until:11/9/31, 9:00 PM
2026-06-17 21:57:52,887 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:59b1b579e8e2132e23907bda777755c, Subject:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Issuer:CN=DigiCert Trusted Root G4, OU=www.digicert.com, O=DigiCert Inc, C=US, Key type:RSA, Length:4096, Cert Id:1057369358, Valid from:8/1/13, 9:00 AM, Valid until:1/15/38, 9:00 AM
2026-06-17 21:57:52,887 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:6a683e9c519bcb53, Subject:CN=E-Tugra Certification Authority, OU=E-Tugra Sertifikasyon Merkezi, O=E-Tuğra EBG Bilişim Teknolojileri ve Hizmetleri A.Ş., L=Ankara, C=TR, Issuer:CN=E-Tugra Certification Authority, OU=E-Tugra Sertifikasyon Merkezi, O=E-Tuğra EBG Bilişim Teknolojileri ve Hizmetleri A.Ş., L=Ankara, C=TR, Key type:RSA, Length:4096, Cert Id:-673382379, Valid from:3/5/13, 9:09 AM, Valid until:3/3/23, 9:09 AM
2026-06-17 21:57:52,888 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:-11d4c2142bde21eb579d53fb0c223bff, Subject:CN=EC-ACC, OU=Jerarquia Entitats de Certificacio Catalanes, OU=Vegeu https://www.catcert.net/verarrel (c)03, OU=Serveis Publics de Certificacio, O=Agencia Catalana de Certificacio (NIF Q-0801176-I), C=ES, Issuer:CN=EC-ACC, OU=Jerarquia Entitats de Certificacio Catalanes, OU=Vegeu https://www.catcert.net/verarrel (c)03, OU=Serveis Publics de Certificacio, O=Agencia Catalana de Certificacio (NIF Q-0801176-I), C=ES, Key type:RSA, Length:2048, Cert Id:1077306647, Valid from:1/7/03, 9:00 PM, Valid until:1/7/31, 7:59 PM
2026-06-17 21:57:52,889 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:3863def8, Subject:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Issuer:CN=Entrust.net Certification Authority (2048), OU=(c) 1999 Entrust.net Limited, OU=www.entrust.net/CPS_2048 incorp. by ref. (limits liab.), O=Entrust.net, Key type:RSA, Length:2048, Cert Id:-328536082, Valid from:12/24/99, 3:50 PM, Valid until:7/24/29, 11:15 AM
2026-06-17 21:57:52,889 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:456b5054, Subject:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority, OU="(c) 2006 Entrust, Inc.", OU=www.entrust.net/CPS is incorporated by reference, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:-1261404096, Valid from:11/27/06, 6:23 PM, Valid until:11/27/26, 5:53 PM
2026-06-17 21:57:52,890 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:a68b79290000000050d091f9, Subject:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - EC1, OU="(c) 2012 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:EC, Length:384, Cert Id:924514073, Valid from:12/18/12, 1:25 PM, Valid until:12/18/37, 12:55 PM
2026-06-17 21:57:52,890 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:4a538c28, Subject:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G2, OU="(c) 2009 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1936920337, Valid from:7/7/09, 2:25 PM, Valid until:12/7/30, 2:55 PM
2026-06-17 21:57:52,891 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:d9b5437fafa9390f000000005565ad58, Subject:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Issuer:CN=Entrust Root Certification Authority - G4, OU="(c) 2015 Entrust, Inc. - for authorized use only", OU=See www.entrust.net/legal-terms, O="Entrust, Inc.", C=US, Key type:RSA, Length:4096, Cert Id:1368037548, Valid from:5/27/15, 8:11 AM, Valid until:12/27/37, 8:41 AM
2026-06-17 21:57:52,891 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:81bbdd6b241fdab4be8f1bda0855c4, Subject:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Issuer:OU=AC RAIZ FNMT-RCM, O=FNMT-RCM, C=ES, Key type:RSA, Length:4096, Cert Id:1776617097, Valid from:10/29/08, 1:59 PM, Valid until:12/31/29, 9:00 PM
2026-06-17 21:57:52,892 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7d0997fef047ea7a, Subject:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Issuer:CN=GDCA TrustAUTH R5 ROOT, O="GUANG DONG CERTIFICATE AUTHORITY CO.,LTD.", C=CN, Key type:RSA, Length:4096, Cert Id:494136981, Valid from:11/26/14, 3:13 AM, Valid until:12/31/40, 12:59 PM
2026-06-17 21:57:52,892 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5a4bbd5afb4f8a5bfa65e5, Subject:CN=GLOBALTRUST 2020, O=e-commerce monitoring GmbH, C=AT, Issuer:CN=GLOBALTRUST 2020, O=e-commerce monitoring GmbH, C=AT, Key type:RSA, Length:4096, Cert Id:-522246883, Valid from:2/9/20, 9:00 PM, Valid until:6/9/40, 9:00 PM
2026-06-17 21:57:52,892 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5936f31b01349886ba217, Subject:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R1, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:657172038, Valid from:6/21/16, 9:00 PM, Valid until:6/21/36, 9:00 PM
2026-06-17 21:57:52,893 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:203e5aec58d04251aab1125aa, Subject:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R2, O=Google Trust Services LLC, C=US, Key type:RSA, Length:4096, Cert Id:948387669, Valid from:6/21/16, 9:00 PM, Valid until:6/21/36, 9:00 PM
2026-06-17 21:57:52,893 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5b882eb20f825276d3d66, Subject:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R3, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1163081155, Valid from:6/21/16, 9:00 PM, Valid until:6/21/36, 9:00 PM
2026-06-17 21:57:52,894 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:203e5c068ef631a9c72905052, Subject:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Issuer:CN=GTS Root R4, O=Google Trust Services LLC, C=US, Key type:EC, Length:384, Cert Id:1326433111, Valid from:6/21/16, 9:00 PM, Valid until:6/21/36, 9:00 PM
2026-06-17 21:57:52,894 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:605949e0262ebb55f90a778a71f94ad86c, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign ECC Root CA - R5, Key type:EC, Length:384, Cert Id:1997048439, Valid from:11/12/12, 10:00 PM, Valid until:1/19/38, 12:14 AM
2026-06-17 21:57:52,894 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00 AM, Valid until:1/28/28, 9:00 AM
2026-06-17 21:57:52,895 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:4000000000121585308a2, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3, Key type:RSA, Length:2048, Cert Id:733875591, Valid from:3/18/09, 7:00 AM, Valid until:3/18/29, 7:00 AM
2026-06-17 21:57:52,895 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:45e6bb038333c3856548e6ff4551, Subject:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Issuer:CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R6, Key type:RSA, Length:4096, Cert Id:-506627753, Valid from:12/9/14, 10:00 PM, Valid until:12/9/34, 9:00 PM
2026-06-17 21:57:52,895 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:11d2bbba336ed4bce62468c50d841d98e843, Subject:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root E46, O=GlobalSign nv-sa, C=BE, Key type:EC, Length:384, Cert Id:-889363391, Valid from:3/19/19, 9:00 PM, Valid until:3/19/46, 9:00 PM
2026-06-17 21:57:52,896 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:11d2bbb9d723189e405f0a9d2dd0df2567d1, Subject:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root R46, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:4096, Cert Id:1275948927, Valid from:3/19/19, 9:00 PM, Valid until:3/19/46, 9:00 PM
2026-06-17 21:57:52,896 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Issuer:OU=Go Daddy Class 2 Certification Authority, O="The Go Daddy Group, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:-271444299, Valid from:6/29/04, 2:06 PM, Valid until:6/29/34, 2:06 PM
2026-06-17 21:57:52,896 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Go Daddy Root Certificate Authority - G2, O="GoDaddy.com, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:439600313, Valid from:8/31/09, 9:00 PM, Valid until:12/31/37, 8:59 PM
2026-06-17 21:57:52,897 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:67749d8d77d83b6adb22f4ff59e2bfce, Subject:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS ECC Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:EC, Length:384, Cert Id:-693932344, Valid from:2/19/21, 8:01 AM, Valid until:2/13/45, 8:01 AM
2026-06-17 21:57:52,897 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:39ca931cef43f3c68e93c7f46489387e, Subject:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Issuer:CN=HARICA TLS RSA Root CA 2021, O=Hellenic Academic and Research Institutions CA, C=GR, Key type:RSA, Length:4096, Cert Id:1709624614, Valid from:2/19/21, 7:55 AM, Valid until:2/13/45, 7:55 AM
2026-06-17 21:57:52,898 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions ECC RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:EC, Length:384, Cert Id:513613456, Valid from:7/7/15, 7:37 AM, Valid until:6/30/40, 7:37 AM
2026-06-17 21:57:52,962 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2011, O=Hellenic Academic and Research Institutions Cert. Authority, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2011, O=Hellenic Academic and Research Institutions Cert. Authority, C=GR, Key type:RSA, Length:2048, Cert Id:-1841489473, Valid from:12/6/11, 11:49 AM, Valid until:12/1/31, 10:49 AM
2026-06-17 21:57:52,963 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Issuer:CN=Hellenic Academic and Research Institutions RootCA 2015, O=Hellenic Academic and Research Institutions Cert. Authority, L=Athens, C=GR, Key type:RSA, Length:4096, Cert Id:-802976731, Valid from:7/7/15, 7:11 AM, Valid until:6/30/40, 7:11 AM
2026-06-17 21:57:52,963 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2dddacce629794a143e8b0cd766a5e60, Subject:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:CN=HiPKI Root CA - G1, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:-2016358144, Valid from:2/22/19, 6:46 AM, Valid until:12/31/37, 12:59 PM
2026-06-17 21:57:52,964 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:3e8, Subject:CN=Hongkong Post Root CA 1, O=Hongkong Post, C=HK, Issuer:CN=Hongkong Post Root CA 1, O=Hongkong Post, C=HK, Key type:RSA, Length:2048, Cert Id:-1426826250, Valid from:5/15/03, 2:13 AM, Valid until:5/15/23, 1:52 AM
2026-06-17 21:57:52,964 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:8165f8a4ca5ec00c99340dfc4c6ae23b81c5aa4, Subject:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Issuer:CN=Hongkong Post Root CA 3, O=Hongkong Post, L=Hong Kong, ST=Hong Kong, C=HK, Key type:RSA, Length:4096, Cert Id:-901951080, Valid from:6/2/17, 11:29 PM, Valid until:6/2/42, 11:29 PM
2026-06-17 21:57:52,965 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:8210cfb0d240e3594463e0bb63828b00, Subject:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X1, O=Internet Security Research Group, C=US, Key type:RSA, Length:4096, Cert Id:1521974916, Valid from:6/4/15, 8:04 AM, Valid until:6/4/35, 8:04 AM
2026-06-17 21:57:52,965 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:41d29dd172eaeea780c12c6ce92f8752, Subject:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Issuer:CN=ISRG Root X2, O=Internet Security Research Group, C=US, Key type:EC, Length:384, Cert Id:-896325052, Valid from:9/3/20, 9:00 PM, Valid until:9/17/40, 1:00 PM
2026-06-17 21:57:52,966 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523c844b500000002, Subject:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Commercial Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:1232565210, Valid from:1/16/14, 4:12 PM, Valid until:1/16/34, 3:12 PM
2026-06-17 21:57:52,966 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:a0142800000014523cf467c00000002, Subject:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Issuer:CN=IdenTrust Public Sector Root CA 1, O=IdenTrust, C=US, Key type:RSA, Length:4096, Cert Id:2123370772, Valid from:1/16/14, 3:53 PM, Valid until:1/16/34, 2:53 PM
2026-06-17 21:57:52,966 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:b0b75a16485fbfe1cbf58bd719e67d, Subject:CN=Izenpe.com, O=IZENPE S.A., C=ES, Issuer:CN=Izenpe.com, O=IZENPE S.A., C=ES, Key type:RSA, Length:4096, Cert Id:-1845580984, Valid from:12/13/07, 11:08 AM, Valid until:12/13/37, 5:27 AM
2026-06-17 21:57:52,967 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:c27e43044e473f19, Subject:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Issuer:EMAILADDRESS=info@e-szigno.hu, CN=Microsec e-Szigno Root CA 2009, O=Microsec Ltd., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:-1903950012, Valid from:6/16/09, 8:30 AM, Valid until:12/30/29, 8:30 AM
2026-06-17 21:57:52,967 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:66f23daf87de8bb14aea0c573101c2ec, Subject:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft ECC Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:EC, Length:384, Cert Id:-1054206011, Valid from:12/18/19, 8:06 PM, Valid until:7/18/42, 8:16 PM
2026-06-17 21:57:52,967 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1ed397095fd8b4b347701eaabe7f45b3, Subject:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Issuer:CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US, Key type:RSA, Length:4096, Cert Id:-1446618248, Valid from:12/18/19, 7:51 PM, Valid until:7/18/42, 8:00 PM
2026-06-17 21:57:52,968 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:194301ea20bddf5c5332ab1434471f8d6504d0d, Subject:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Issuer:CN=NAVER Global Root Certification Authority, O=NAVER BUSINESS PLATFORM Corp., C=KR, Key type:RSA, Length:4096, Cert Id:1777546867, Valid from:8/18/17, 5:58 AM, Valid until:8/18/37, 8:59 PM
2026-06-17 21:57:52,968 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:49412ce40010, Subject:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Issuer:CN=NetLock Arany (Class Gold) Főtanúsítvány, OU=Tanúsítványkiadók (Certification Services), O=NetLock Kft., L=Budapest, C=HU, Key type:RSA, Length:2048, Cert Id:58541246, Valid from:12/11/08, 1:08 PM, Valid until:12/6/28, 12:08 PM
2026-06-17 21:57:52,969 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:57cb336fc25c16e6471617e3903168e0, Subject:CN=Network Solutions Certificate Authority, O=Network Solutions L.L.C., C=US, Issuer:CN=Network Solutions Certificate Authority, O=Network Solutions L.L.C., C=US, Key type:RSA, Length:2048, Cert Id:1751576863, Valid from:11/30/06, 10:00 PM, Valid until:12/31/29, 8:59 PM
2026-06-17 21:57:52,969 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:76b1205274f0858746b3f8231af6c2c0, Subject:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GB CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:RSA, Length:2048, Cert Id:-613481516, Valid from:12/1/14, 1:00 PM, Valid until:12/1/39, 12:10 PM
2026-06-17 21:57:52,970 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:212a560caeda0cab4045bf2ba22d3aea, Subject:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Issuer:CN=OISTE WISeKey Global Root GC CA, OU=OISTE Foundation Endorsed, O=WISeKey, C=CH, Key type:EC, Length:384, Cert Id:-1513165457, Valid from:5/9/17, 6:48 AM, Valid until:5/9/42, 6:58 AM
2026-06-17 21:57:52,970 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:78585f2ead2c194be3370735341328b596d46593, Subject:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 1 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:-762436034, Valid from:1/12/12, 3:27 PM, Valid until:1/12/42, 2:27 PM
2026-06-17 21:57:52,971 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:509, Subject:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:338250116, Valid from:11/24/06, 4:27 PM, Valid until:11/24/31, 3:23 PM
2026-06-17 21:57:52,976 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:445734245b81899b35f2ceb82b3b5ba726f07528, Subject:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 2 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:696763521, Valid from:1/12/12, 4:59 PM, Valid until:1/12/42, 3:59 PM
2026-06-17 21:57:52,976 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:5c6, Subject:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:1470392860, Valid from:11/24/06, 5:11 PM, Valid until:11/24/31, 4:06 PM
2026-06-17 21:57:52,977 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:2ef59b0228a7db7affd5a3a9eebd03a0cf126a1d, Subject:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Issuer:CN=QuoVadis Root CA 3 G3, O=QuoVadis Limited, C=BM, Key type:RSA, Length:4096, Cert Id:-705622991, Valid from:1/12/12, 6:26 PM, Valid until:1/12/42, 5:26 PM
2026-06-17 21:57:52,977 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:2c299c5b16ed0595, Subject:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:1789254518, Valid from:2/12/16, 4:15 PM, Valid until:2/12/41, 3:15 PM
2026-06-17 21:57:52,977 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:56b629cd34bc78f6, Subject:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com EV Root Certification Authority RSA R2, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:1381862403, Valid from:5/31/17, 3:14 PM, Valid until:5/30/42, 3:14 PM
2026-06-17 21:57:52,978 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:75e6dfcbc1685ba8, Subject:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority ECC, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:EC, Length:384, Cert Id:-1368293613, Valid from:2/12/16, 4:14 PM, Valid until:2/12/41, 3:14 PM
2026-06-17 21:57:52,978 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:7b2c9bd316803299, Subject:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Issuer:CN=SSL.com Root Certification Authority RSA, O=SSL Corporation, L=Houston, ST=Texas, C=US, Key type:RSA, Length:4096, Cert Id:156725711, Valid from:2/12/16, 3:39 PM, Valid until:2/12/41, 2:39 PM
2026-06-17 21:57:52,979 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:3e8a5d07ec55d232d5b7e3b65f01eb2ddce4d6e4, Subject:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Issuer:CN=SZAFIR ROOT CA2, O=Krajowa Izba Rozliczeniowa S.A., C=PL, Key type:RSA, Length:2048, Cert Id:381279303, Valid from:10/19/15, 5:43 AM, Valid until:10/19/35, 4:43 AM
2026-06-17 21:57:52,979 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=SecureSign RootCA11, O="Japan Certification Services, Inc.", C=JP, Issuer:CN=SecureSign RootCA11, O="Japan Certification Services, Inc.", C=JP, Key type:RSA, Length:2048, Cert Id:2079057034, Valid from:4/8/09, 1:56 AM, Valid until:4/8/29, 1:56 AM
2026-06-17 21:57:52,979 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:cf08e5c0816a5ad427ff0eb271859d0, Subject:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Issuer:CN=SecureTrust CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:2034155325, Valid from:11/7/06, 5:31 PM, Valid until:12/31/29, 4:40 PM
2026-06-17 21:57:52,980 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:75622a4e8d48a894df413c8f0f8eaa5, Subject:CN=Secure Global CA, O=SecureTrust Corporation, C=US, Issuer:CN=Secure Global CA, O=SecureTrust Corporation, C=US, Key type:RSA, Length:2048, Cert Id:-1476772975, Valid from:11/7/06, 5:42 PM, Valid until:12/31/29, 4:52 PM
2026-06-17 21:57:52,980 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Issuer:OU=Security Communication RootCA2, O="SECOM Trust Systems CO.,LTD.", C=JP, Key type:RSA, Length:2048, Cert Id:1521072570, Valid from:5/29/09, 2:00 AM, Valid until:5/29/29, 2:00 AM
2026-06-17 21:57:52,980 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Security Communication RootCA1, O=SECOM Trust.net, C=JP, Issuer:OU=Security Communication RootCA1, O=SECOM Trust.net, C=JP, Key type:RSA, Length:2048, Cert Id:1802358121, Valid from:9/30/03, 1:20 AM, Valid until:9/30/23, 1:20 AM
2026-06-17 21:57:52,981 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:98968d, Subject:CN=Staat der Nederlanden EV Root CA, O=Staat der Nederlanden, C=NL, Issuer:CN=Staat der Nederlanden EV Root CA, O=Staat der Nederlanden, C=NL, Key type:RSA, Length:4096, Cert Id:1444801426, Valid from:12/8/10, 9:19 AM, Valid until:12/8/22, 8:10 AM
2026-06-17 21:57:52,981 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:0, Subject:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Issuer:OU=Starfield Class 2 Certification Authority, O="Starfield Technologies, Inc.", C=US, Key type:RSA, Length:2048, Cert Id:1825617644, Valid from:6/29/04, 2:39 PM, Valid until:6/29/34, 2:39 PM
2026-06-17 21:57:52,981 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:-1026641587, Valid from:8/31/09, 9:00 PM, Valid until:12/31/37, 8:59 PM
2026-06-17 21:57:52,981 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:0, Subject:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Issuer:CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US, Key type:RSA, Length:2048, Cert Id:1964785574, Valid from:8/31/09, 9:00 PM, Valid until:12/31/37, 8:59 PM
2026-06-17 21:57:52,982 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:bb401c43f55e4fb0, Subject:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Gold CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:1516221943, Valid from:10/25/06, 5:30 AM, Valid until:10/25/36, 5:30 AM
2026-06-17 21:57:52,982 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:4f1bd42f54bb2f4b, Subject:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Issuer:CN=SwissSign Silver CA - G2, O=SwissSign AG, C=CH, Key type:RSA, Length:4096, Cert Id:126726124, Valid from:10/25/06, 5:32 AM, Valid until:10/25/36, 5:32 AM
2026-06-17 21:57:52,982 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 2, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:-1238464039, Valid from:10/1/08, 7:40 AM, Valid until:10/1/33, 8:59 PM
2026-06-17 21:57:52,983 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Issuer:CN=T-TeleSec GlobalRoot Class 3, OU=T-Systems Trust Center, O=T-Systems Enterprise Services GmbH, C=DE, Key type:RSA, Length:2048, Cert Id:1894096264, Valid from:10/1/08, 7:29 AM, Valid until:10/1/33, 8:59 PM
2026-06-17 21:57:52,983 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1, Subject:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Issuer:CN=TUBITAK Kamu SM SSL Kok Sertifikasi - Surum 1, OU=Kamu Sertifikasyon Merkezi - Kamu SM, O=Turkiye Bilimsel ve Teknolojik Arastirma Kurumu - TUBITAK, L=Gebze - Kocaeli, C=TR, Key type:RSA, Length:2048, Cert Id:1093603654, Valid from:11/25/13, 6:25 AM, Valid until:10/25/43, 5:25 AM
2026-06-17 21:57:52,984 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:cbe, Subject:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Global Root CA, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:4096, Cert Id:861175838, Valid from:6/27/12, 3:28 AM, Valid until:12/31/30, 12:59 PM
2026-06-17 21:57:52,984 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:1, Subject:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Issuer:CN=TWCA Root Certification Authority, OU=Root CA, O=TAIWAN-CA, C=TW, Key type:RSA, Length:2048, Cert Id:-1642094263, Valid from:8/28/08, 4:24 AM, Valid until:12/31/30, 12:59 PM
2026-06-17 21:57:52,984 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:95be16a0f72e46f17b398272fa8bcd96, Subject:CN=TeliaSonera Root CA v1, O=TeliaSonera, Issuer:CN=TeliaSonera Root CA v1, O=TeliaSonera, Key type:RSA, Length:4096, Cert Id:1495358374, Valid from:10/18/07, 10:00 AM, Valid until:10/18/32, 9:00 AM
2026-06-17 21:57:52,985 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1675f27d6fe7ae3e4acbe095b059e, Subject:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Issuer:CN=Telia Root CA v2, O=Telia Finland Oyj, C=FI, Key type:RSA, Length:4096, Cert Id:-821903320, Valid from:11/29/18, 9:55 AM, Valid until:11/29/43, 8:55 AM
2026-06-17 21:57:52,985 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:84822c5f1c62d040, Subject:CN=TrustCor ECA-1, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Issuer:CN=TrustCor ECA-1, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Key type:RSA, Length:2048, Cert Id:1382581529, Valid from:2/4/16, 10:32 AM, Valid until:12/31/29, 2:28 PM
2026-06-17 21:57:52,985 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:da9bec71f303b019, Subject:CN=TrustCor RootCert CA-1, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Issuer:CN=TrustCor RootCert CA-1, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Key type:RSA, Length:2048, Cert Id:1332877130, Valid from:2/4/16, 10:32 AM, Valid until:12/31/29, 2:23 PM
2026-06-17 21:57:52,986 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:25a1dfca33cb5902, Subject:CN=TrustCor RootCert CA-2, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Issuer:CN=TrustCor RootCert CA-2, OU=TrustCor Certificate Authority, O=TrustCor Systems S. de R.L., L=Panama City, ST=Panama, C=PA, Key type:RSA, Length:4096, Cert Id:1646661199, Valid from:2/4/16, 10:32 AM, Valid until:12/31/34, 2:26 PM
2026-06-17 21:57:52,986 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5f70e86da49f346352ebab2, Subject:CN=Trustwave Global Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Issuer:CN=Trustwave Global Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Key type:RSA, Length:4096, Cert Id:416366836, Valid from:8/23/17, 4:34 PM, Valid until:8/23/42, 4:34 PM
2026-06-17 21:57:52,986 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:d6a5f083f285c3e5195df5d, Subject:CN=Trustwave Global ECC P256 Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Issuer:CN=Trustwave Global ECC P256 Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Key type:EC, Length:256, Cert Id:948272517, Valid from:8/23/17, 4:35 PM, Valid until:8/23/42, 4:35 PM
2026-06-17 21:57:52,987 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:8bd85976c9927a48068473b, Subject:CN=Trustwave Global ECC P384 Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Issuer:CN=Trustwave Global ECC P384 Certification Authority, O="Trustwave Holdings, Inc.", L=Chicago, ST=Illinois, C=US, Key type:EC, Length:384, Cert Id:-1993924923, Valid from:8/23/17, 4:36 PM, Valid until:8/23/42, 4:36 PM
2026-06-17 21:57:52,987 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:1302d5e2404c92468616675db4bbbbb26b3efc13, Subject:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Issuer:CN=TunTrust Root CA, O=Agence Nationale de Certification Electronique, C=TN, Key type:RSA, Length:4096, Cert Id:1973181427, Valid from:4/26/19, 5:57 AM, Valid until:4/26/44, 5:57 AM
2026-06-17 21:57:52,987 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:4fd22b8ff564c8339e4f345866237060, Subject:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Issuer:CN=UCA Extended Validation Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:649181271, Valid from:3/12/15, 9:00 PM, Valid until:12/30/38, 9:00 PM
2026-06-17 21:57:52,988 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:5ddfb1da5aa3ed5dbe5a6520650390ef, Subject:CN=UCA Global G2 Root, O=UniTrust, C=CN, Issuer:CN=UCA Global G2 Root, O=UniTrust, C=CN, Key type:RSA, Length:4096, Cert Id:1844967193, Valid from:3/10/16, 9:00 PM, Valid until:12/30/40, 9:00 PM
2026-06-17 21:57:52,988 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:5c8b99c55a94c5d27156decd8980cc26, Subject:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:EC, Length:384, Cert Id:-965679910, Valid from:1/31/10, 10:00 PM, Valid until:1/18/38, 8:59 PM
2026-06-17 21:57:52,988 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withRSA, Serial:1fd6d30fca3ca51a81bbc640e35032d, Subject:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Issuer:CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US, Key type:RSA, Length:4096, Cert Id:-347365895, Valid from:1/31/10, 10:00 PM, Valid until:1/18/38, 8:59 PM
2026-06-17 21:57:52,988 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:50946cec18ead59c4dd597ef758fa0ad, Subject:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Issuer:CN=XRamp Global Certification Authority, O=XRamp Security Services Inc, OU=www.xrampsecurity.com, C=US, Key type:RSA, Length:2048, Cert Id:-952474086, Valid from:11/1/04, 2:14 PM, Valid until:1/1/35, 2:37 AM
2026-06-17 21:57:52,989 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:200605167002, Subject:OU=certSIGN ROOT CA, O=certSIGN, C=RO, Issuer:OU=certSIGN ROOT CA, O=certSIGN, C=RO, Key type:RSA, Length:2048, Cert Id:-289960676, Valid from:7/4/06, 2:20 PM, Valid until:7/4/31, 2:20 PM
2026-06-17 21:57:52,989 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:110034b64ec6362d36, Subject:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Issuer:OU=certSIGN ROOT CA G2, O=CERTSIGN SA, C=RO, Key type:RSA, Length:4096, Cert Id:-2113880430, Valid from:2/6/17, 7:27 AM, Valid until:2/6/42, 6:27 AM
2026-06-17 21:57:52,989 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withECDSA, Serial:15448ef21fd97590df5040a, Subject:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Issuer:CN=e-Szigno Root CA 2017, OID.2.5.4.97=VATHU-23584497, O=Microsec Ltd., L=Budapest, C=HU, Key type:EC, Length:256, Cert Id:-991173715, Valid from:8/22/17, 9:07 AM, Valid until:8/22/42, 9:07 AM
2026-06-17 21:57:52,990 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:15c8bd65475cafb897005ee406d2bc9d, Subject:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Issuer:OU=ePKI Root Certification Authority, O="Chunghwa Telecom Co., Ltd.", C=TW, Key type:RSA, Length:4096, Cert Id:-662636137, Valid from:12/20/04, 12:31 AM, Valid until:12/19/34, 11:31 PM
2026-06-17 21:57:52,990 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:7b71b68256b8127c9ca8, Subject:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign ECC Root CA - C3, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:EC, Length:384, Cert Id:-948456756, Valid from:2/18/18, 3:30 PM, Valid until:2/18/43, 3:30 PM
2026-06-17 21:57:52,990 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:3cf607a968700eda8b84, Subject:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign ECC Root CA - G3, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:EC, Length:384, Cert Id:-462931589, Valid from:2/18/18, 3:30 PM, Valid until:2/18/43, 3:30 PM
2026-06-17 21:57:52,991 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:aecf00bac4cf32f843b2, Subject:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Issuer:CN=emSign Root CA - C1, O=eMudhra Inc, OU=emSign PKI, C=US, Key type:RSA, Length:2048, Cert Id:-1268863356, Valid from:2/18/18, 3:30 PM, Valid until:2/18/43, 3:30 PM
2026-06-17 21:57:52,991 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:31f5e4620c6c58edd6d8, Subject:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Issuer:CN=emSign Root CA - G1, O=eMudhra Technologies Limited, OU=emSign PKI, C=IN, Key type:RSA, Length:2048, Cert Id:392709196, Valid from:2/18/18, 3:30 PM, Valid until:2/18/43, 3:30 PM
2026-06-17 21:57:52,991 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA384withECDSA, Serial:6e6abc59aa53be983967a2d26ba43be66d1cd6da, Subject:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus ECC Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:EC, Length:384, Cert Id:268503342, Valid from:7/31/18, 4:26 AM, Valid until:7/31/43, 4:26 AM
2026-06-17 21:57:52,992 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:43e37113d8b359145db7ce8cfd35fd6fbc058d45, Subject:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Issuer:CN=vTrus Root CA, O="iTrusChina Co.,Ltd.", C=CN, Key type:RSA, Length:4096, Cert Id:-1825883750, Valid from:7/31/18, 4:24 AM, Valid until:7/31/43, 4:24 AM
2026-06-17 21:57:53,068 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1)  TLSHandshake: logindes.caixa.gov.br:443, TLSv1.2, TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 771739022
2026-06-17 21:57:53,072 DEBUG [io.net.han.ssl.SslHandler] (vert.x-eventloop-thread-1) [id: 0x26902d9f, L:/25.129.17.110:57418 - R:logindes.caixa.gov.br/240.240.109.27:443] HANDSHAKEN: protocol:TLSv1.2 cipher suite:TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
2026-06-17 21:57:53,283 DEBUG [io.qua.agr.run.DataSources] (main) Started datasource <default> connected to jdbc:db2://10.192.224.102:5031/CSD4
2026-06-17 21:57:53,288 FINE  [jak.jso.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-06-17 21:57:53,288 FINE  [jak.jso.spi.JsonProvider] (main) Checking ServiceLoader
2026-06-17 21:57:53,290 FINE  [jak.jso.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-06-17 21:57:53,292 FINE  [jak.jso.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-06-17 21:57:53,292 FINE  [jak.jso.spi.JsonProvider] (main) Checking ServiceLoader
2026-06-17 21:57:53,292 FINE  [jak.jso.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-06-17 21:57:53,366 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Located 1 persistence units; checking each
2026-06-17 21:57:53,366 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) Checking persistence-unit [name=<default>, explicit-provider=null] against incoming persistence unit name [<default>]
2026-06-17 21:57:53,366 DEBUG [io.qua.hib.orm.run.FastBootHibernatePersistenceProvider] (JPA Startup Thread) No PersistenceProvider explicitly requested, assuming Hibernate
2026-06-17 21:57:53,376 DEBUG [org.hib.res.jdb.int.LogicalConnectionManagedImpl] (JPA Startup Thread) `hibernate.connection.provider_disables_autocommit` was enabled.  This setting should only be enabled when you are certain that the Connections given to Hibernate by the ConnectionProvider have auto-commit disabled.  Enabling this setting when the Connections do not have auto-commit disabled will lead to Hibernate executing SQL operations outside of any JDBC/SQL transaction.
2026-06-17 21:57:53,673 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Database ->
	   name : DB2
	version : DSN13018
	  major : 13
	  minor : 1
2026-06-17 21:57:53,673 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) Driver ->
	   name : IBM Data Server Driver for JDBC and SQLJ
	version : 4.32.28
	  major : 4
	  minor : 32
2026-06-17 21:57:53,673 DEBUG [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) JDBC version : 4.1
2026-06-17 21:57:53,674 DEBUG [org.hib.eng.jdb.env.spi.IdentifierHelperBuilder] (JPA Startup Thread) JDBC driver metadata reported database stores quoted identifiers in neither upper, lower nor mixed case
2026-06-17 21:57:53,688 DEBUG [org.hib.orm.jdb.lob] (JPA Startup Thread) HHH10010006: Disabling contextual NCLOB creation as createNClob() method threw error : com.ibm.db2.jcc.am.SqlFeatureNotSupportedException: [jcc][t4][10181][12051][4.32.28] Method createNClob is not supported. ERRORCODE=-4450, SQLSTATE=0A504
2026-06-17 21:57:53,693 DEBUG [org.hib.orm.con.pooling] (JPA Startup Thread) HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database version: 12.1
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-06-17 21:57:53,710 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Building session factory
2026-06-17 21:57:53,774 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-06-17 21:57:53,774 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiating SessionFactory with settings: {jakarta.persistence.validation.mode=CALLBACK, hibernate.hbm2ddl.schema-generation.script.append=false, hibernate.connection.handling_mode=DELAYED_ACQUISITION_AND_RELEASE_BEFORE_TRANSACTION_COMPLETION, hibernate.dialect=org.hibernate.dialect.DB2zDialect, hibernate.cache.use_query_cache=true, hibernate.hbm2ddl.charset_name=UTF-8, hibernate.xml_mapping_enabled=false, hibernate.query.plan_cache_max_size=2048, hibernate.id.sequence.increment_size_mismatch_strategy=NONE, hibernate.hbm2ddl.skip_default_import_file=true, jakarta.persistence.sharedCache.mode=ENABLE_SELECTIVE, hibernate.id.optimizer.pooled.preferred=pooled-lo, org.hibernate.flushMode=AUTO, jakarta.persistence.create-database-schemas=false, hibernate.order_updates=true, hibernate.order_by.default_null_ordering=none, jakarta.persistence.schema-generation.scripts.action=none, hibernate.allow_update_outside_transaction=false, javax.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@29289d82, hibernate.boot.allow_jdbc_metadata_access=true, hibernate.cache.use_reference_entries=true, hibernate.persistenceUnitName=<default>, hibernate.cache.use_second_level_cache=true, hibernate.query.in_clause_parameter_padding=true, jakarta.persistence.validation.factory=org.hibernate.validator.internal.engine.PredefinedScopeValidatorFactoryImpl@29289d82, hibernate.discriminator.ignore_explicit_for_joined=false, hibernate.transaction.coordinator_class=class org.hibernate.resource.transaction.backend.jta.internal.JtaTransactionCoordinatorBuilderImpl, hibernate.type.json_format_mapper=org.hibernate.type.format.jackson.JacksonJsonFormatMapper@640e069, hibernate.connection.provider_disables_autocommit=true, hibernate.connection.datasource=io.agroal.pool.DataSource@7ad65bc8, hibernate.cache.region.factory_class=org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory, hibernate.hbm2ddl.import_files=, jakarta.persistence.schema-generation.database.action=none, hibernate.default_batch_fetch_size=16, hibernate.batch_fetch_style=PADDED}
2026-06-17 21:57:53,776 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Starting Infinispan region factory
2026-06-17 21:57:53,777 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building timestamps cache region [default-update-timestamps-region]
2026-06-17 21:57:53,786 DEBUG [org.inf.qua.hib.cac.QuarkusInfinispanRegionFactory] (JPA Startup Thread) Building query results cache region [default-query-results-region]
2026-06-17 21:57:53,796 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Session factory constructed with filter configurations : {}
2026-06-17 21:57:53,798 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-06-17 21:57:53,801 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-06-17 21:57:53,872 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(max)] under max; prior registration was null
2026-06-17 21:57:53,873 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(min)] under min; prior registration was null
2026-06-17 21:57:53,873 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sum)] under sum; prior registration was null
2026-06-17 21:57:53,873 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(avg)] under avg; prior registration was null
2026-06-17 21:57:53,874 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@9c061b3] under count; prior registration was null
2026-06-17 21:57:53,875 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@12a52c01] under every; prior registration was null
2026-06-17 21:57:53,875 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.EveryAnyEmulation@1f3217e2] under any; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(floor)] under floor; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ceiling)] under ceiling; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(mod)] under mod; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(abs)] under abs; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sign)] under sign; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sqrt)] under sqrt; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ln)] under ln; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(exp)] under exp; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(power)] under power; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(round)] under round; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sin)] under sin; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cos)] under cos; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(tan)] under tan; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(asin)] under asin; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(acos)] under acos; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan)] under atan; prior registration was null
2026-06-17 21:57:53,876 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(atan2)] under atan2; prior registration was null
2026-06-17 21:57:53,877 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1bb8ed10] under sinh; prior registration was null
2026-06-17 21:57:53,877 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@11de0361] under cosh; prior registration was null
2026-06-17 21:57:53,877 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@29d08ef9] under tanh; prior registration was null
2026-06-17 21:57:53,877 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@3ef946a3] under pi; prior registration was null
2026-06-17 21:57:53,877 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@6275ec01] under log; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(coalesce)] under coalesce; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nullif)] under nullif; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(left)] under left; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(right)] under right; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(replace)] under replace; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(concat)] under concat; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lower)] under lower; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(upper)] under upper; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(substring)] under substring; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(locate)] under locate; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(character_length)] under character_length; prior registration was null
2026-06-17 21:57:53,878 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-06-17 21:57:53,879 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LocatePositionEmulation@3401cb9a] under position; prior registration was null
2026-06-17 21:57:53,879 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InsertSubstringOverlayEmulation@5a12b969] under overlay; prior registration was null
2026-06-17 21:57:53,880 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TrimFunction@3d490c40] under trim; prior registration was null
2026-06-17 21:57:53,880 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastFunction@20c2b465] under cast; prior registration was null
2026-06-17 21:57:53,880 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1bf8e056] under collate; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.ExtractFunction@53393a52] under extract; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(least)] under least; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(greatest)] under greatest; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CoalesceIfnullEmulation@3044846b] under ifnull; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lpad)] under lpad; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rpad)] under rpad; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.LpadRpadPadEmulation@53bf6e42] under pad; prior registration was null
2026-06-17 21:57:53,881 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastStrEmulation@4d043961] under str; prior registration was null
2026-06-17 21:57:53,882 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.FormatFunction@68dc2bf] under format; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampaddFunction@63201fb0] under timestampadd; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TimestampdiffFunction@757e7505] under timestampdiff; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : dateadd -> timestampadd
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : datediff -> timestampdiff
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@71b474bc] under current_date; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@27efa92] under current_time; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@1d01936a] under current_timestamp; prior registration was null
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current date -> current_date
2026-06-17 21:57:53,883 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current time -> current_time
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current timestamp -> current_timestamp
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@4dbd4d63] under local_date; prior registration was null
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@1ffec1fc] under local_time; prior registration was null
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@6aa102fb] under local_datetime; prior registration was null
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@7baa4606] under offset_datetime; prior registration was null
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local date -> local_date
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local time -> local_time
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : local datetime -> local_datetime
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : offset datetime -> offset_datetime
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CurrentFunction@5cdbca45] under instant; prior registration was null
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : current_instant -> instant
2026-06-17 21:57:53,884 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.SqlFunction@7cafe97b] under sql; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.AvgFunction@649f11b1] under avg; prior registration was NamedSqmFunctionTemplate(avg)
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cot)] under cot; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(sinh)] under sinh; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1bb8ed10
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(cosh)] under cosh; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@11de0361
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(tanh)] under tanh; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@29d08ef9
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(degrees)] under degrees; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(log10)] under log10; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(radians)] under radians; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rand)] under rand; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(soundex)] under soundex; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ltrim)] under ltrim; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(rtrim)] under rtrim; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(space)] under space; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(repeat)] under repeat; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(substr)] under substr; prior registration was null
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.DB2SubstringFunction@e28106a] under substring; prior registration was NamedSqmFunctionTemplate(substring)
2026-06-17 21:57:53,885 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(translate)] under translate; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(bitand)] under bitand; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(bitor)] under bitor; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(bitxor)] under bitxor; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(bitnot)] under bitnot; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(day)] under day; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(month)] under month; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(year)] under year; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(hour)] under hour; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(minute)] under minute; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(second)] under second; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(microsecond)] under microsecond; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(dayofweek)] under dayofweek; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(dayofmonth)] under dayofmonth; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : day -> dayofmonth
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(dayofyear)] under dayofyear; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(week)] under week; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(quarter)] under quarter; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(monthname)] under monthname; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(dayname)] under dayname; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(last_day)] under last_day; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(to_number)] under to_number; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(to_char)] under to_char; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(to_date)] under to_date; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(to_timestamp)] under to_timestamp; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(date)] under date; prior registration was null
2026-06-17 21:57:53,886 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(time)] under time; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(timestamp)] under timestamp; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@3d48358a] under concat; prior registration was NamedSqmFunctionTemplate(concat)
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(octet_length)] under octet_length; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(ascii)] under ascii; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(chr)] under chr; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : char -> chr
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(insert)] under insert; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(length)] under character_length; prior registration was NamedSqmFunctionTemplate(character_length)
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : length -> character_length
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(stddev)] under stddev; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_avgx)] under regr_avgx; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_avgy)] under regr_avgy; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_count)] under regr_count; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_intercept)] under regr_intercept; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_r2)] under regr_r2; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_slope)] under regr_slope; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_sxx)] under regr_sxx; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_sxy)] under regr_sxy; prior registration was null
2026-06-17 21:57:53,887 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(regr_syy)] under regr_syy; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(variance)] under variance; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@363ed336] under rank; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@132e1f38] under dense_rank; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@732f084] under percent_rank; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@6e211284] under cume_dist; prior registration was null
2026-06-17 21:57:53,888 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.DB2PositionFunction@3b0725cc] under position; prior registration was org.hibernate.dialect.function.LocatePositionEmulation@3401cb9a
2026-06-17 21:57:53,889 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.MultipatternSqmFunctionDescriptor@250cefa] under overlay; prior registration was org.hibernate.dialect.function.InsertSubstringOverlayEmulation@5a12b969
2026-06-17 21:57:53,889 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : stddev_pop -> stddev
2026-06-17 21:57:53,889 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@2b862ef5] under stddev_samp; prior registration was null
2026-06-17 21:57:53,889 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : var_pop -> variance
2026-06-17 21:57:53,889 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@1f5f682d] under var_samp; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TruncFunction@3ce5b741] under trunc; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registering alternate key : truncate -> trunc
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_years)] under add_years; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_months)] under add_months; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_days)] under add_days; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_hours)] under add_hours; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_minutes)] under add_minutes; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(add_seconds)] under add_seconds; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(years_between)] under years_between; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(months_between)] under months_between; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(days_between)] under days_between; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(hours_between)] under hours_between; prior registration was null
2026-06-17 21:57:53,890 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(minutes_between)] under minutes_between; prior registration was null
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(seconds_between)] under seconds_between; prior registration was null
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@6bd66630] under bit_length; prior registration was null
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CastingConcatFunction@49936f97] under concat; prior registration was org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@3d48358a
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.CountFunction@330ea591] under count; prior registration was org.hibernate.dialect.function.CountFunction@9c061b3
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.DB2FormatEmulation@41f8233a] under format; prior registration was org.hibernate.dialect.function.FormatFunction@68dc2bf
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.query.sqm.function.PatternBasedSqmFunctionDescriptor@2eda406] under atan2; prior registration was NamedSqmFunctionTemplate(atan2)
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(posstr)] under posstr; prior registration was null
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.TrimFunction@5f65775c] under trim; prior registration was org.hibernate.dialect.function.TrimFunction@3d490c40
2026-06-17 21:57:53,891 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(row_number)] under row_number; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lag)] under lag; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(lead)] under lead; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(first_value)] under first_value; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(last_value)] under last_value; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [NamedSqmFunctionTemplate(nth_value)] under nth_value; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.ListaggFunction@7f8b5796] under listagg; prior registration was null
2026-06-17 21:57:53,892 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.ListaggFunction@2a52fe6a] under listagg; prior registration was org.hibernate.dialect.function.ListaggFunction@7f8b5796
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionFunction@2f6c10fa] under mode; prior registration was null
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionFunction@27206b8e] under percentile_cont; prior registration was null
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.InverseDistributionFunction@7272b966] under percentile_disc; prior registration was null
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@55dfcc4b] under rank; prior registration was org.hibernate.dialect.function.HypotheticalSetWindowEmulation@363ed336
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@1afbedca] under dense_rank; prior registration was org.hibernate.dialect.function.HypotheticalSetWindowEmulation@132e1f38
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@3ea39900] under percent_rank; prior registration was org.hibernate.dialect.function.HypotheticalSetWindowEmulation@732f084
2026-06-17 21:57:53,893 DEBUG [org.hib.que.sqm.fun.SqmFunctionRegistry] (JPA Startup Thread) Registered SqmFunctionTemplate [org.hibernate.dialect.function.HypotheticalSetWindowEmulation@59fdbe3b] under cume_dist; prior registration was org.hibernate.dialect.function.HypotheticalSetWindowEmulation@6e211284
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) abs(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double acos(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_days(DATE datetime, INTEGER days)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_hours(TIME datetime, INTEGER hours)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_minutes(TIME datetime, INTEGER minutes)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_months(DATE datetime, INTEGER months)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_seconds(TIME datetime, INTEGER seconds)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) add_years(DATE datetime, INTEGER years)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean any(BOOLEAN arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer ascii(STRING arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double asin(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double atan2(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) avg(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer bit_length(STRING_OR_CLOB arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitand(arg0, arg1)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitnot(arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitor(arg0, arg1)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) bitxor(arg0, arg1)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) cast(arg as Type)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ceiling(NUMERIC arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character char(INTEGER arg)
2026-06-17 21:57:53,894 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer character_length(STRING_OR_CLOB arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Character chr(INTEGER arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) coalesce(arg0[, arg1[, ...]])
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String collate(STRING string as COLLATION collation)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String concat(arg0[, arg1[, ...]])
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cos(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cosh(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cot(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long count([distinct ]{arg|*})
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double cume_dist([arg0[, ...]])
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current date
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current time
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current timestamp
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date current_date
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant current_instant
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time current_time
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp current_timestamp
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date date(arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) dateadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double datediff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer day(DATE arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String dayname(DATE arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer dayofmonth(DATE arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer dayofweek(DATE arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer dayofyear(DATE arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer days_between(DATE end, DATE start)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double degrees(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long dense_rank([arg0[, ...]])
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Boolean every(BOOLEAN arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double exp(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) extract(TEMPORAL_UNIT field from TEMPORAL arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) first_valueANY value
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) floor(NUMERIC arg)
2026-06-17 21:57:53,895 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String format(TEMPORAL datetime as STRING pattern)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) greatest(COMPARABLE arg0, COMPARABLE arg1[, arg2[, ...]])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer hour(TIME arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long hours_between(TIME end, TIME start)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) ifnull(arg0, arg1)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String insert(STRING string, INTEGER start, INTEGER length, STRING replacement)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Instant instant
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) lagANY value[, INTEGER offset[, ANY default]]
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date last_day(DATE arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) last_valueANY value
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) leadANY value[, INTEGER offset[, ANY default]]
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) least(COMPARABLE arg0, COMPARABLE arg1[, arg2[, ...]])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String left(STRING string, INTEGER length)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer length(STRING_OR_CLOB arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String listagg(STRING arg0, STRING arg1)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double ln(NUMERIC arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local date
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local datetime
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local time
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDate local_date
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalDateTime local_datetime
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) LocalTime local_time
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer locate(STRING pattern, STRING string[, INTEGER start])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log(NUMERIC base, NUMERIC arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double log10(NUMERIC arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lower(STRING string)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String lpad(STRING string, INTEGER length[, STRING padding])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String ltrim(STRING string[, STRING characters])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) max(COMPARABLE arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer microsecond(TIME arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) min(COMPARABLE arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer minute(TIME arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long minutes_between(TIME end, TIME start)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer mod(INTEGER arg0, INTEGER arg1)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) mode()
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer month(DATE arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String monthname(DATE arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer months_between(DATE end, DATE start)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nth_valueANY value, INTEGER nth
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) nullif(arg0, arg1)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer octet_length(STRING_OR_CLOB arg)
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset datetime
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) OffsetDateTime offset_datetime
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String overlay(string placing replacement from start[ for length])
2026-06-17 21:57:53,896 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String pad(STRING string with INTEGER length {leading|trailing}[ STRING character])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double percent_rank([arg0[, ...]])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_cont(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) percentile_disc(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double pi
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) (STRING pattern in STRING string[, units]])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer posstr(STRING string, STRING pattern)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double power(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer quarter(DATE arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double radians(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double rand([INTEGER seed])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long rank([arg0[, ...]])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_avgx(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_avgy(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_count(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_intercept(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_r2(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_slope(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_sxx(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_sxy(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double regr_syy(NUMERIC arg0, NUMERIC arg1)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String repeat(STRING string, INTEGER times)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String replace(STRING string, STRING pattern, STRING replacement)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String right(STRING string, INTEGER length)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) round(NUMERIC number[, INTEGER places])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long row_number()
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rpad(STRING string, INTEGER length[, STRING padding])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String rtrim(STRING string[, STRING characters])
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer second(TIME arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long seconds_between(TIME end, TIME start)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer sign(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sin(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sinh(NUMERIC arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String soundex(arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String space(INTEGER arg)
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Object sql
2026-06-17 21:57:53,897 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double sqrt(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_pop(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double stddev_samp(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String str(arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String substr(STRING string, INTEGER start[, INTEGER length])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) (STRING string, INTEGER start[, INTEGER length[, units]])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) sum(arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tan(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double tanh(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Time time(arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp timestamp(arg0[, arg1])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) timestampadd(TEMPORAL_UNIT field, INTEGER magnitude, TEMPORAL datetime)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Long|Double timestampdiff(TEMPORAL_UNIT field, TEMPORAL start, TEMPORAL end)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String to_char(ANY arg0[, STRING arg1, STRING arg2])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Date to_date(STRING arg0[, STRING arg1, STRING arg2])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double to_number(STRING arg0[, STRING arg1, STRING arg2])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Timestamp to_timestamp(STRING arg0[, STRING arg1, STRING arg2])
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String translate(STRING arg0, STRING arg1, STRING arg2)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String trim([[{leading|trailing|both} ][STRING arg0 ]from] STRING arg1)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) trunc( ... )
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) truncate( ... )
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) String upper(STRING string)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_pop(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double var_samp(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Double variance(NUMERIC arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer week(DATE arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer year(DATE arg)
2026-06-17 21:57:53,898 DEBUG [org.hib.HQL_FUNCTIONS] (JPA Startup Thread) Integer years_between(DATE end, DATE start)
2026-06-17 21:57:53,963 DEBUG [org.hib.orm.que.pla.cache] (JPA Startup Thread) Starting QueryInterpretationCache(2048)
2026-06-17 21:57:54,006 DEBUG [org.hib.ser.int.SessionFactoryServiceRegistryImpl] (JPA Startup Thread) EventListenerRegistry access via ServiceRegistry is deprecated.  Use `sessionFactory.getEventEngine().getListenerRegistry()` instead
2026-06-17 21:57:54,007 DEBUG [org.hib.eve.int.EntityCopyObserverFactoryInitiator] (JPA Startup Thread) Configured EntityCopyObserver strategy: disallow
2026-06-17 21:57:54,217 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting post-init callbacks
2026-06-17 21:57:54,217 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.gov.caixa.loterias.consultatransacao.domain.Transacao909) `staticFetchableList` generator
2026-06-17 21:57:54,217 DEBUG [org.hib.orm.mod.map.creation] (JPA Startup Thread) Starting PostInitCallbackEntry : Entity(br.gov.caixa.loterias.consultatransacao.domain.Transacao906) `staticFetchableList` generator
2026-06-17 21:57:54,306 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : t1_0
2026-06-17 21:57:54,307 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.gov.caixa.loterias.consultatransacao.domain.Transacao909)] with identifierForTableGroup [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] for NavigablePath [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] 
2026-06-17 21:57:54,367 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.gov.caixa.loterias.consultatransacao.domain.Transacao909]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.codigoLoterica]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.nsu]
 |  \-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.situacao]

2026-06-17 21:57:54,368 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (t1 : br.gov.caixa.loterias.consultatransacao.domain.Transacao909) {
          primaryTableReference : SPL.SPLTB909_HTCO_LOG as t1_0
        }
      }
    }

2026-06-17 21:57:54,372 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.gov.caixa.loterias.consultatransacao.domain.Transacao909` entity using padded IN-list : 16 (16)
2026-06-17 21:57:54,372 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : t1_0
2026-06-17 21:57:54,373 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.gov.caixa.loterias.consultatransacao.domain.Transacao909)] with identifierForTableGroup [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] for NavigablePath [br.gov.caixa.loterias.consultatransacao.domain.Transacao909] 
2026-06-17 21:57:54,373 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.gov.caixa.loterias.consultatransacao.domain.Transacao909]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.codigoLoterica]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.nsu]
 |  \-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao909.situacao]

2026-06-17 21:57:54,373 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (t1 : br.gov.caixa.loterias.consultatransacao.domain.Transacao909) {
          primaryTableReference : SPL.SPLTB909_HTCO_LOG as t1_0
        }
      }
    }

2026-06-17 21:57:54,375 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.gov.caixa.loterias.consultatransacao.domain.Transacao909
2026-06-17 21:57:54,375 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select DT_REFERENCIA from SPL.SPLTB909_HTCO_LOG where DT_REFERENCIA=?
2026-06-17 21:57:54,375 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into SPL.SPLTB909_HTCO_LOG (NU_CD,NU_TRANSACAO,NU_SITUACAO_LINHA,DT_REFERENCIA) values (?,?,?,?)
2026-06-17 21:57:54,375 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update SPL.SPLTB909_HTCO_LOG set NU_CD=?,NU_TRANSACAO=?,NU_SITUACAO_LINHA=? where DT_REFERENCIA=?
2026-06-17 21:57:54,375 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from SPL.SPLTB909_HTCO_LOG where DT_REFERENCIA=?
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : t1_0
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.gov.caixa.loterias.consultatransacao.domain.Transacao906)] with identifierForTableGroup [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] for NavigablePath [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] 
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.gov.caixa.loterias.consultatransacao.domain.Transacao906]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.codigoLoterica]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.nsu]
 |  \-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.situacao]

2026-06-17 21:57:54,375 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (t1 : br.gov.caixa.loterias.consultatransacao.domain.Transacao906) {
          primaryTableReference : SPL.SPLTB906_HTCO_MVTO as t1_0
        }
      }
    }

2026-06-17 21:57:54,375 DEBUG [org.hib.orm.loa.multi] (JPA Startup Thread) Batch fetching `br.gov.caixa.loterias.consultatransacao.domain.Transacao906` entity using padded IN-list : 16 (16)
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Created new SQL alias : t1_0
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.sql.ast.create] (JPA Startup Thread) Registration of TableGroup [StandardTableGroup(br.gov.caixa.loterias.consultatransacao.domain.Transacao906)] with identifierForTableGroup [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] for NavigablePath [br.gov.caixa.loterias.consultatransacao.domain.Transacao906] 
2026-06-17 21:57:54,375 DEBUG [org.hib.orm.res.gra.AST] (JPA Startup Thread) DomainResult Graph:
 \-EntityResultImpl [br.gov.caixa.loterias.consultatransacao.domain.Transacao906]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.codigoLoterica]
 |  +-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.nsu]
 |  \-BasicFetch [br.gov.caixa.loterias.consultatransacao.domain.Transacao906.situacao]

2026-06-17 21:57:54,376 DEBUG [org.hib.orm.sql.ast.tree] (JPA Startup Thread) SQL AST Tree:
    SelectStatement {
      FromClause {
        StandardTableGroup (t1 : br.gov.caixa.loterias.consultatransacao.domain.Transacao906) {
          primaryTableReference : SPL.SPLTB906_HTCO_MVTO as t1_0
        }
      }
    }

2026-06-17 21:57:54,376 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread) Static SQL for entity: br.gov.caixa.loterias.consultatransacao.domain.Transacao906
2026-06-17 21:57:54,376 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Version select: select DT_REFERENCIA from SPL.SPLTB906_HTCO_MVTO where DT_REFERENCIA=?
2026-06-17 21:57:54,376 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Insert (0): insert into SPL.SPLTB906_HTCO_MVTO (NU_CD,NU_TRANSACAO,NU_SITUACAO_LINHA,DT_REFERENCIA) values (?,?,?,?)
2026-06-17 21:57:54,376 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Update (0): update SPL.SPLTB906_HTCO_MVTO set NU_CD=?,NU_TRANSACAO=?,NU_SITUACAO_LINHA=? where DT_REFERENCIA=?
2026-06-17 21:57:54,376 DEBUG [org.hib.per.ent.AbstractEntityPersister] (JPA Startup Thread)  Delete (0): delete from SPL.SPLTB906_HTCO_MVTO where DT_REFERENCIA=?
2026-06-17 21:57:54,390 DEBUG [org.hib.typ.spi.TypeConfiguration$Scope] (JPA Startup Thread) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@6c742b84] to SessionFactoryImplementor [org.hibernate.internal.SessionFactoryImpl@79b945bd]
2026-06-17 21:57:54,391 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named HQL queries
2026-06-17 21:57:54,391 DEBUG [org.hib.que.nam.NamedObjectRepository] (JPA Startup Thread) Checking 0 named SQL queries
2026-06-17 21:57:54,391 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No schema actions specified for contributor `orm`; doing nothing
2026-06-17 21:57:54,391 DEBUG [org.hib.too.sch.spi.SchemaManagementToolCoordinator] (JPA Startup Thread) No actions found; doing nothing
2026-06-17 21:57:54,392 DEBUG [io.qua.hib.orm.run.ser.QuarkusRuntimeInitDialectFactory] (JPA Startup Thread) Persistence unit <default>: Skipping database version check; expecting database version to be at least 12.1.0
2026-06-17 21:57:54,392 DEBUG [org.hib.int.SessionFactoryImpl] (JPA Startup Thread) Instantiated SessionFactory
2026-06-17 21:57:54,464 INFO  [br.gov.cai.lot.con.StartupCheck] (main) Datasource password resolvida (tamanho=7)
2026-06-17 21:57:54,489 INFO  [io.quarkus] (main) sispl-consulta-transacao 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.5) started in 4.879s. Listening on: http://0.0.0.0:8080
2026-06-17 21:57:54,489 INFO  [io.quarkus] (main) Profile prod activated. 
2026-06-17 21:57:54,489 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-orm-rest-data-panache, hibernate-validator, jdbc-db2, loterias-api-commons, narayana-jta, oidc, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-metrics, smallrye-openapi, vertx]
2026-06-17 21:58:05,534 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:05,534 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:05,534 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:05,534 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:05,539 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:05,539 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:05,539 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:58:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:15,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:15,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:58:15,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:58:25,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:25,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:58:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:58:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:58:35,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:35,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:58:45,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:45,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:58:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:58:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:58:55,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:58:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:58:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:58:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:58:55,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:05,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:05,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:05,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:05,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:05,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:05,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:15,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:15,498 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:15,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:15,498 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:15,498 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:15,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:15,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:25,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:25,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:25,498 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:25,498 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:25,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:25,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:25,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:35,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:35,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:35,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:35,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:45,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:45,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:45,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:45,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:55,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 21:59:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 21:59:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 21:59:55,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 21:59:55,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 21:59:55,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:05,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 22:00:05,498 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:05,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:05,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:05,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 22:00:05,498 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 22:00:05,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:05,498 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:15,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:15,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:15,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:15,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 22:00:15,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 22:00:15,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:15,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 22:00:25,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 22:00:25,497 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 22:00:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 22:00:25,497 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 22:00:25,497 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
