
[jboss@caddeapllx2484 log]$ grep -n "cache-container|invalidation-cache|distributed-cache|transport|local-cache" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[jboss@caddeapllx2484 log]$
[jboss@caddeapllx2484 log]$
[jboss@caddeapllx2484 log]$
[jboss@caddeapllx2484 log]$ grep -n "infinispan\|cache" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head -30
5:        <extension module="org.jboss.as.clustering.infinispan"/>
242:                <!-- CORRIGIDO: cache-ref alterado de "distributable" para "simple" (sem cluster) -->
243:                <stateful default-access-timeout="5000" cache-ref="simple" passivation-disabled-cache-ref="simple"/>
256:            <caches>
257:                <cache name="simple"/>
258:                <cache name="distributable" passivation-store-ref="infinispan" aliases="passivating clustered"/>
259:            </caches>
261:                <passivation-store name="infinispan" cache-container="ejb" max-size="10000"/>
285:        <!-- CORRIGIDO: infinispan alterado para local-cache (sem cluster/transporte) -->
286:        <subsystem xmlns="urn:jboss:domain:infinispan:4.0">
287:            <cache-container name="server" aliases="singleton cluster" default-cache="default" module="org.wildfly.clustering.server">
288:                <local-cache name="default">
290:                </local-cache>
291:            </cache-container>
292:            <cache-container name="web" default-cache="passivation" module="org.wildfly.clustering.web.infinispan">
293:                <local-cache name="passivation">
297:                </local-cache>
298:            </cache-container>
299:            <cache-container name="ejb" aliases="sfsb" default-cache="passivation" module="org.wildfly.clustering.ejb.infinispan">
300:                <local-cache name="passivation">
304:                </local-cache>
305:            </cache-container>
306:            <cache-container name="hibernate" default-cache="local-query" module="org.hibernate.infinispan">
307:                <local-cache name="local-query">
310:                </local-cache>
311:                <invalidation-cache name="entity" mode="SYNC">
315:                </invalidation-cache>
316:                <local-cache name="timestamps"/>
317:            </cache-container>
341:            <cached-connection-manager/>
[jboss@caddeapllx2484 log]$ hwc -l /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
bash: hwc: comando não encontrado
[jboss@caddeapllx2484 log]$ hls -lah /opt/jboss-eap/standalone/configuration/
bash: hls: comando não encontrado
[jboss@caddeapllx2484 log]$
