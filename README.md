
sh-4.4$
sh-4.4$
sh-4.4$ java -Dquarkus.log.level=DEBUG -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caix-truststore-acteste-nprd.jks -cp . -jar /deployments/quarkus-run.jar 2>&1 | tee /tmp/debug.log
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-12 11:42:24,122 DEBUG [org.jboss.logging] (main) Logging Provider: org.jboss.logging.JBossLogManagerProvider found via system property
2026-08-12 11:42:24,130 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-12 11:42:24,130 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/resolve-pendencia-api-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource FileSystemConfigSource[dir=/usr/src/app/secrets_files/SIINT_DES] with ordinal 100
2026-08-12 11:42:24,230 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource Runtime Values with ordinal 0
2026-08-12 11:42:24,231 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-12 11:42:24,324 DEBUG [org.hibernate.quarkus.feature] (main) Hibernate Features Enabled
2026-08-12 11:42:24,324 DEBUG [io.quarkus.hibernate.orm] (main) List of entities found by Quarkus deployment:
[br.gov.caixa.siint.entity.Pendencia]
2026-08-12 11:42:24,472 DEBUG [io.quarkus.arc.impl] (main) ArC DI container initialized [beans=106, observers=18]
2026-08-12 11:42:24,477 DEBUG [org.hibernate.orm.jpa] (main) HHH008541: PersistenceUnitInfo [
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
                br.gov.caixa.siint.entity.Pendencia
                io.quarkus.hibernate.orm.panache.PanacheEntity
                io.quarkus.hibernate.orm.panache.PanacheEntityBase]
        Mapping files names []
        Properties [
                hibernate.hbm2ddl.skip_default_import_file: true
                hibernate.query.plan_cache_max_size: 2048
                hibernate.default_batch_fetch_size: 16
                hibernate.query.fail_on_pagination_over_collection_fetch: false
                hibernate.discriminator.ignore_explicit_for_joined: false
                hibernate.hbm2ddl.charset_name: UTF-8
                hibernate.cache.use_reference_entries: null
                hibernate.cache.use_query_cache: null
                hibernate.query.in_clause_parameter_padding: true
                hibernate.cache.use_second_level_cache: null
                jakarta.persistence.sharedCache.mode: null
                jakarta.persistence.database-product-name: DB2
                hibernate.id.sequence.increment_size_mismatch_strategy: null
                hibernate.id.optimizer.pooled.preferred: pooled-lo
                hibernate.order_by.default_null_ordering: none
                jakarta.persistence.validation.mode: AUTO]
2026-08-12 11:42:24,672 DEBUG [org.hibernate.orm.core] (main) HHH000001: Hibernate ORM core version 7.2.6.Final
2026-08-12 11:42:24,673 DEBUG [org.hibernate.orm.core] (main) HHH000206: 'hibernate.properties' not found
2026-08-12 11:42:24,938 DEBUG [org.hibernate.orm.boot] (main) HHH160188: Ignoring 0 XML mappings due to 'hibernate.xml_mapping_enabled'
2026-08-12 11:42:25,014 DEBUG [org.hibernate.orm.dialect] (main) HHH035001: Using dialect: org.hibernate.dialect.DB2Dialect, version: 11.1
2026-08-12 11:42:25,019 DEBUG [org.hibernate.orm.jdbc.lob] (main) HHH10010002: Disabling contextual LOB creation as connection was null
2026-08-12 11:42:25,020 DEBUG [org.hibernate.orm.jdbc] (main) HHH100122: Using default JDBC fetch size: -1
2026-08-12 11:42:25,022 DEBUG [org.hibernate.orm.connections.pooling] (main) HHH10001005: Database info:
        Database JDBC URL [undefined/unknown]
        Database driver: undefined/unknown
        Database dialect: DB2Dialect
        Database version: 11.1
        Default catalog/schema: unknown/unknown
        Autocommit mode: undefined/unknown
        Isolation level: <unknown>
        JDBC fetch size: undefined/unknown
        Pool: undefined/unknown
        Minimum pool size: undefined/unknown
        Maximum pool size: undefined/unknown
2026-08-12 11:42:25,212 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (main) Stop region factory
2026-08-12 11:42:25,212 DEBUG [org.infinispan.quarkus.hibernate.cache.QuarkusInfinispanRegionFactory] (main) Clear region references
2026-08-12 11:42:25,215 DEBUG [io.quarkus.arc.runtime.ArcRecorder] (main) Bean container listener io.quarkus.hibernate.orm.runtime.HibernateOrmRecorder$1 finished in 742 ms
2026-08-12 11:42:25,230 DEBUG [io.quarkus.arc.impl] (main) Loaded 78 removed beans lazily
2026-08-12 11:42:25,230 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,231 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyBufferMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,231 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerVertxAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,232 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.vertx.serializers.ServerMutinyAsyncFileMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,233 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,233 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,234 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,234 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonArrayMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,234 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.serialisers.vertx.VertxJsonObjectMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,234 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,234 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFormUrlEncodedProvider and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.StreamingOutputMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerFilePartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.core.multipart.MultipartMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerPathPartBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerStringMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerBooleanMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerCharacterMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,235 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerNumberMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerInputStreamMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerReaderBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.QuarkusServerFileBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerByteArrayMessageBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class org.jboss.resteasy.reactive.server.providers.serialisers.ServerDefaultTextPlainBodyHandler and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,236 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.ForbiddenExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,237 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.runtime.mappers.BuiltinMismatchedInputExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,237 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationRedirectExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,237 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.server.runtime.exceptionmappers.AuthenticationCompletionExceptionMapper and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,237 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.rest.runtime.__QuarkusInit and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,314 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,314 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyWriter and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,315 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonArrayBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,315 DEBUG [io.quarkus.arc.runtime.BeanContainerImpl] (main) No matching bean found for type class io.quarkus.resteasy.reactive.jackson.common.runtime.serialisers.vertx.VertxJsonObjectBasicMessageBodyReader and qualifiers []. The bean might have been marked as unused and removed during build.
2026-08-12 11:42:25,324 DEBUG [io.netty.util.internal.logging.InternalLoggerFactory] (main) Using SLF4J as the default logging framework
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource BuildTime RunTime Fixed with ordinal 2147483647
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource ValueRegistryConfigSource with ordinal 2147483637
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DevServicesOverrideConfigSource with ordinal 2147483147
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource SysPropConfigSource with ordinal 400
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource EnvConfigSource with ordinal 300
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource PropertiesConfigSource[source=jar:file:///deployments/app/resolve-pendencia-api-1.0.0-SNAPSHOT.jar!/application.properties] with ordinal 250
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DevServicesConfigSource with ordinal 240
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource FileSystemConfigSource[dir=/usr/src/app/secrets_files/SIINT_DES] with ordinal 100
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource Runtime Values with ordinal 0
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource QuarkusUUIDConfigSource with ordinal -2147483648
2026-08-12 11:42:25,332 DEBUG [io.smallrye.config] (main) SRCFG01006: Loaded ConfigSource DefaultValuesConfigSource with ordinal -2147483648
2026-08-12 11:42:25,625 DEBUG [com.arjuna.ats.jta] (main) Setting up node identifiers '[quarkus]' for which recovery will be performed
2026-08-12 11:42:25,717 DEBUG [io.vertx.core.logging.LoggerFactory] (main) Using io.quarkus.vertx.core.runtime.VertxLogDelegateFactory
2026-08-12 11:42:25,734 DEBUG [io.quarkus.vertx.core.runtime.VertxCoreRecorder] (main) Vert.x Cache configured to: /tmp/vertx-cache/5708498180922760235
2026-08-12 11:42:25,747 DEBUG [io.netty.util.internal.PlatformDependent0] (main) Java version: 17
2026-08-12 11:42:25,748 DEBUG [io.netty.util.internal.PlatformDependent0] (main) -Dio.netty.noUnsafe: false
2026-08-12 11:42:25,748 DEBUG [io.netty.util.internal.PlatformDependent0] (main) Thread.isVirtual() is not available:
2026-08-12 11:42:25,748 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.lang.BaseVirtualThread is not available:
2026-08-12 11:42:25,749 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.Buffer.address: available
2026-08-12 11:42:25,750 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.Bits.unaligned: available, true
2026-08-12 11:42:25,751 DEBUG [io.netty.util.internal.PlatformDependent0] (main) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
2026-08-12 11:42:25,751 DEBUG [io.netty.util.internal.PlatformDependent] (main) sun.misc.Unsafe: available
2026-08-12 11:42:25,751 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
2026-08-12 11:42:25,751 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.bitMode: 64 (sun.arch.data.model)
2026-08-12 11:42:25,751 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.maxDirectMemory: -1 bytes
2026-08-12 11:42:25,752 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.uninitializedArrayAllocationThreshold: -1
2026-08-12 11:42:25,752 DEBUG [io.netty.util.internal.CleanerJava9] (main) java.nio.ByteBuffer.cleaner(): available
2026-08-12 11:42:25,752 DEBUG [io.netty.util.internal.PlatformDependent] (main) -Dio.netty.noPreferDirect: false
2026-08-12 11:42:25,760 DEBUG [io.netty.util.ResourceLeakDetector] (main) -Dio.netty.leakDetection.level: simple
2026-08-12 11:42:25,760 DEBUG [io.netty.util.ResourceLeakDetector] (main) -Dio.netty.leakDetection.targetRecords: 4
2026-08-12 11:42:25,804 DEBUG [io.netty.channel.MultithreadEventLoopGroup] (main) -Dio.netty.eventLoopThreads: 2
2026-08-12 11:42:25,809 DEBUG [io.netty.util.concurrent.GlobalEventExecutor] (main) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
2026-08-12 11:42:25,812 DEBUG [io.netty.util.internal.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
2026-08-12 11:42:25,812 DEBUG [io.netty.util.internal.InternalThreadLocalMap] (main) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
2026-08-12 11:42:25,815 DEBUG [io.netty.channel.nio.NioEventLoop] (main) -Dio.netty.noKeySetOptimization: false
2026-08-12 11:42:25,816 DEBUG [io.netty.channel.nio.NioEventLoop] (main) -Dio.netty.selectorAutoRebuildThreshold: 512
2026-08-12 11:42:25,818 DEBUG [io.netty.util.internal.PlatformDependent] (main) org.jctools-core.MpscChunkedArrayQueue: available
2026-08-12 11:42:25,829 DEBUG [io.quarkus.vertx.core.runtime.VertxCoreRecorder] (main) Vertx has Native Transport Enabled: false
2026-08-12 11:42:25,837 WARN  [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
2026-08-12 11:42:25,846 FINE  [jakarta.json.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-08-12 11:42:25,847 FINE  [jakarta.json.spi.JsonProvider] (main) Checking ServiceLoader
2026-08-12 11:42:25,849 FINE  [jakarta.json.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-08-12 11:42:25,853 FINE  [jakarta.json.spi.JsonProvider] (main) Checking system property jakarta.json.provider
2026-08-12 11:42:25,853 FINE  [jakarta.json.spi.JsonProvider] (main) Checking ServiceLoader
2026-08-12 11:42:25,854 FINE  [jakarta.json.spi.JsonProvider] (main) ServiceLoader loading Facility used; returning object [org.eclipse.parsson.JsonProviderImpl]
2026-08-12 11:42:25,902 DEBUG [org.hibernate.orm.beans] (main) HHH10005004: Stopping BeanContainer: io.quarkus.hibernate.orm.runtime.cdi.QuarkusArcBeanContainer@47df5041
2026-08-12 11:42:25,903 DEBUG [io.quarkus.arc.impl] (main) ArC DI container shut down
2026-08-12 11:42:25,914 DEBUG [io.quarkus.runtime.util.NoopShutdownScheduledExecutorService] (vert.x-eventloop-thread-0) shutdownNow() not allowed on managed executor service
2026-08-12 11:42:25,917 DEBUG [io.quarkus.thread-pool] (main) loop: 1, remaining: 60000000000, intervalRemaining: 5000000000, interruptRemaining: 10000000000
Failed to load config value of type class java.lang.String for: api.confirmacao.siint-api-key
Failed to load config value of type class java.lang.String for: api.confirmacao.client-secret

2026-08-12 11:42:25,920 DEBUG [io.quarkus.runtime.Application] (main) Stopping application
2026-08-12 11:42:25,920 DEBUG [io.quarkus.runtime.Application] (main) Shutting down with exit code 1
sh-4.4$
