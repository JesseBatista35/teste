
-sh-4.2$ grep -i "GMS\|new view\|joined\|left\|suspected\|JGRP0" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "ISPN0000\|topology\|rebalance\|cluster" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager.findSession(ConcurrentSessionManager.java:71)
                at org.wildfly.clustering.web.undertow.session.DistributableSessionManager.getSession(DistributableSessionManager.java:229)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.getValue(InfinispanSessionMetaDataFactory.java:103)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:93)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:54)
        at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:63)
        at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:40)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionManager.findSession(InfinispanSessionManager.java:160)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:66)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:63)
        at org.wildfly.clustering.ee.cache.SimpleManager.apply(SimpleManager.java:52)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager.findSession(ConcurrentSessionManager.java:71)
        at org.wildfly.clustering.web.undertow.session.DistributableSessionManager.getSession(DistributableSessionManager.java:229)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.getValue(InfinispanSessionMetaDataFactory.java:103)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:93)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:54)
                at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:63)
                at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:40)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionManager.findSession(InfinispanSessionManager.java:160)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:66)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:63)
                at org.wildfly.clustering.ee.cache.SimpleManager.apply(SimpleManager.java:52)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager.findSession(ConcurrentSessionManager.java:71)
                at org.wildfly.clustering.web.undertow.session.DistributableSessionManager.getSession(DistributableSessionManager.java:229)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "ISPN000299" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | awk '{print $1, $2}' | sort | uniq -c | tail -30
      1 2026-08-24 11:28:17,776
      2 2026-08-24 11:28:19,728
      2 2026-08-24 11:28:20,174
      2 2026-08-24 11:28:20,246
      1 2026-08-24 11:28:20,263
      2 2026-08-24 11:28:20,264
      2 2026-08-24 11:28:20,265
      3 2026-08-24 11:28:20,266
      1 2026-08-24 11:28:20,483
      1 2026-08-24 11:28:22,492
      1 2026-08-24 11:28:24,416
      1 2026-08-24 11:28:26,291
      1 2026-08-24 11:28:26,292
      1 2026-08-24 11:28:29,817
      2 2026-08-24 11:28:32,778
      2 2026-08-24 11:28:35,484
      2 2026-08-24 11:28:37,493
      2 2026-08-24 11:28:39,418
      2 2026-08-24 11:28:44,819
      1 2026-08-24 11:32:09,248
      2 2026-08-24 11:32:09,249
      2 2026-08-24 11:32:24,250
      1 2026-08-24 11:32:29,809
      2 2026-08-24 11:32:29,810
      1 2026-08-24 11:32:39,251
      2 2026-08-24 11:32:44,811
      2 2026-08-24 11:32:54,253
      1 2026-08-24 11:32:59,812
      2 2026-08-24 11:33:14,814
    150 Caused by:
-sh-4.2$
