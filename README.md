
-sh-4.2$ oc logs sicow-penhor-okd-des-64-c7wx4 -n sicow-des --since=5m | grep -E "ERROR|SEVERE|Exception|scowdb01"
2026-10-23 11:14:12,343 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/jboss/datasources/sicow-ds: javax.resource.ResourceException: IJ031084: Unable to create connection
Caused by: org.postgresql.util.PSQLException: FATAL: password authentication failed for user "scowdb01"
-sh-4.2$
