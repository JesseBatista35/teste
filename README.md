
[INFO] Building jar: /opt/ads-agent/_work/12099/s/sisgf-backend/target/sisgf-backend-11.01.01.01.jar
[INFO] 
[INFO] --- quarkus-maven-plugin:3.13.0:build (default) @ sisgf-backend ---
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.token-path" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource."siico".jdbc.xa-datasource-class" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc.token.auto-refresh-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm.transaction.coordinator-strategy" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource.xa" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.client-id" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm.transaction.jta-data-source" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.transaction-manager.recovery-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.transaction-manager.default-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.http.encoding.default-charset" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm."siico".log.bind-parameters" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.credentials.secret" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource."siico".xa" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.auth-server-url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.http.encoding.force" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource.jdbc.xa-datasource-class" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.hibernate.orm.deployment.HibernateOrmProcessor] Could not find a suitable persistence unit for model classes:
	- io.quarkus.hibernate.orm.panache.PanacheEntity
	- io.quarkus.hibernate.orm.panache.PanacheEntityBase
[WARNING] [io.quarkus.hibernate.orm.deployment.HibernateOrmProcessor] Could not find any entities affected to the persistence unit 'siico'.
[WARNING] [io.quarkus.arc.processor.BeanArchives] Failed to index javax.annotation.Nonnull: Class does not exist in ClassLoader QuarkusClassLoader:Deployment Class Loader: PROD for sisgf-backend-11.01.01.01@122b5f95
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diaUtilCorrido(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diaUtilEspecifico(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diasUteisCorridos(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diasUteisEspecificos(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> ultimoDiaUtil(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 4978ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  30.590 s
[INFO] Finished at: 2026-05-28T13:57:05-03:00
[INFO] ------------------------------------------------------------------------
Finishing: Maven
