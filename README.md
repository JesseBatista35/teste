[p585600@sspdeapllx0040 ~]$ grep -n -A 20 '"sisag"' /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml | head -60
2503:        <profile name="sisag">
2504-            <subsystem xmlns="urn:jboss:domain:logging:3.0">
2505-                <console-handler name="CONSOLE">
2506-                    <level name="WARN"/>
2507-                    <formatter>
2508-                        <pattern-formatter pattern="%d{dd-MM-yyyy HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n"/>
2509-                    </formatter>
2510-                    <target name="System.out"/>
2511-                </console-handler>
2512-                <periodic-rotating-file-handler name="FILE" autoflush="true">
2513-                    <level name="INFO"/>
2514-                    <formatter>
2515-                        <pattern-formatter pattern="%d{dd-MM-yyyy HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n"/>
2516-                    </formatter>
2517-                    <file relative-to="jboss.server.log.dir" path="server.log"/>
2518-                    <suffix value=".yyyy-MM-dd"/>
2519-                    <append value="true"/>
2520-                </periodic-rotating-file-handler>
2521-                <periodic-rotating-file-handler name="sisag-prov">
2522-                    <level name="DEBUG"/>
2523-                    <formatter>
--
2862:                <mod-cluster-config advertise-socket="modcluster" proxies="proxysisag" balancer="sisagbalancer" advertise="true" excluded-contexts="ROOT,invoker,jbossws,juddi,console" load-balancing-group="sisag" connector="default">
2863-                    <dynamic-load-provider>
2864-                        <load-metric type="busyness"/>
2865-                    </dynamic-load-provider>
2866-                </mod-cluster-config>
2867-            </subsystem>
2868-            <subsystem xmlns="urn:jboss:domain:naming:2.0">
2869-                <remote-naming/>
2870-            </subsystem>
2871-            <subsystem xmlns="urn:jboss:domain:pojo:1.0"/>
2872-            <subsystem xmlns="urn:jboss:domain:remoting:3.0">
2873-                <http-connector name="http-remoting-connector" connector-ref="default" security-realm="ApplicationRealm"/>
2874-            </subsystem>
2875-            <subsystem xmlns="urn:jboss:domain:resource-adapters:4.0">
2876-                <resource-adapters>
2877-                    <resource-adapter id="wmq.jmsra.rar">
2878-                        <archive>
2879-                            wmq.jmsra.rar
2880-                        </archive>
2881-                        <transaction-support>NoTransaction</transaction-support>
2882-                    </resource-adapter>
--
7461:        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">
7462:            <jvm name="sisag">
7463-                <heap size="256m" max-size="256m"/>
7464-            </jvm>
7465-            <socket-binding-group ref="cef-full-ha-sockets" port-offset="0"/>
7466-            <deployments>
7467-                <deployment name="wmq.jmsra.rar" runtime-name="wmq.jmsra.rar"/>
7468-                <deployment name="provisionamento-service-ear-V004C004R003.ear" runtime-name="provisionamento-service-ear-V004C004R003.ear"/>
7469-            </deployments>
7470-            <system-properties>
7471-                <property name="instancias.list" value="nodelx0041[7606],nodelx0076[7606]" boot-time="true"/>
7472-                <property name="br.com.bry.debug" value="assinador ws all" boot-time="true"/>
7473-            </system-properties>
7474-        </server-group>
7475-        <server-group name="siagt" profile="siagt">
7476-            <jvm name="siagt">
[p585600@sspdeapllx0040 ~]$

