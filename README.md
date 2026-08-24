[root@caddeapllx2484 p585600]# sed - '33,80' /tmp/dump_completo.txt
sed: -e expressão #1, caractere 1: Comando desconhecido: `-'
[root@caddeapllx2484 p585600]# sed - '33,80p' /tmp/dump_completo.txt
sed: -e expressão #1, caractere 1: Comando desconhecido: `-'
[root@caddeapllx2484 p585600]# sed -n '33,80p' /tmp/dump_completo.txt
"default task-50" #13832 prio=5 os_prio=0 tid=0x00005613c548b800 nid=0x65a9 waiting on condition [0x00002afa00ee2000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000081ecb028> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:748)

"default task-39" #13819 prio=5 os_prio=0 tid=0x00005613c9d7c800 nid=0x6565 waiting on condition [0x00002af9f1a63000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000081ecb028> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:748)

"blocking-thread--p12-t19" #13816 daemon prio=5 os_prio=0 tid=0x00005613c45c6000 nid=0x6562 waiting on condition [0x00002af9f2871000]
   java.lang.Thread.State: TIMED_WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x000000009179bd68> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1421)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        at java.lang.Thread.run(Thread.java:748)

"Thread-4 (ActiveMQ-server-org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl$6@44ccf4ff)" #1028 prio=5 os_prio=0 tid=0x00005613c9537000 nid=0x523d waiting on condition [0x00002afa00ce0000]
   java.lang.Thread.State: TIMED_WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x000000008e0800b0> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
        at java.util.concurrent.LinkedBlockingQueue.poll(LinkedBlockingQueue.java:467)
        at org.apache.activemq.artemis.utils.ActiveMQThreadPoolExecutor$ThreadPoolQueue.poll(ActiveMQThreadPoolExecutor.java:112)
        at org.apache.activemq.artemis.utils.ActiveMQThreadPoolExecutor$ThreadPoolQueue.poll(ActiveMQThreadPoolExecutor.java:45)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1073)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at org.apache.activemq.artemis.utils.ActiveMQThreadFactory$1.run(ActiveMQThreadFactory.java:118)

"ServerService Thread Pool -- 125" #226 prio=5 os_prio=0 tid=0x00005613c3aeb000 nid=0x27e4 waiting on condition [0x00002afa01de7000]
   java.lang.Thread.State: TIMED_WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x00000000827000d8> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
[root@caddeapllx2484 p585600]#
