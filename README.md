[root@caddeapllx2484 p585600]# tail -300 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log
"Timer-0" #102 prio=5 os_prio=0 tid=0x00005613c6d09000 nid=0x2753 in Object.wait() [0x00002af9f7a4a000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x0000000081882540> (a java.util.TaskQueue)
        at java.lang.Object.wait(Object.java:502)
        at java.util.TimerThread.mainLoop(Timer.java:526)
        - locked <0x0000000081882540> (a java.util.TaskQueue)
        at java.util.TimerThread.run(Timer.java:505)

"default I/O-4" #99 prio=5 os_prio=0 tid=0x00005613c6d04800 nid=0x2751 runnable [0x00002af9f7848000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000081882b08> (a sun.nio.ch.Util$3)
        - locked <0x0000000081882b18> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081882ac0> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"default I/O-3" #98 prio=5 os_prio=0 tid=0x00005613c6d02800 nid=0x2750 runnable [0x00002af9f7747000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000081882dd8> (a sun.nio.ch.Util$3)
        - locked <0x0000000081882de8> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081882d90> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"default I/O-2" #97 prio=5 os_prio=0 tid=0x00005613c6d29800 nid=0x274f runnable [0x00002af9f7646000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x00000000818830a8> (a sun.nio.ch.Util$3)
        - locked <0x00000000818830b8> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081883060> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"default I/O-1" #96 prio=5 os_prio=0 tid=0x00005613c6d28000 nid=0x274e runnable [0x00002af9f7545000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000081883378> (a sun.nio.ch.Util$3)
        - locked <0x0000000081883388> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081883330> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"management Accept" #78 prio=5 os_prio=0 tid=0x00005613c6bb8800 nid=0x2745 runnable [0x00002af9f6e17000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x00000000818849c8> (a sun.nio.ch.Util$3)
        - locked <0x00000000818849d8> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081884980> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"management I/O-2" #71 prio=5 os_prio=0 tid=0x00005613c6a3a000 nid=0x2744 runnable [0x00002af9f6b16000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000081884c98> (a sun.nio.ch.Util$3)
        - locked <0x0000000081884ca8> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081884c50> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"management I/O-1" #69 prio=5 os_prio=0 tid=0x00005613c6a36000 nid=0x2743 runnable [0x00002af9f6a15000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000081884f68> (a sun.nio.ch.Util$3)
        - locked <0x0000000081884f78> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000081884f20> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:101)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:532)

"ServerService Thread Pool -- 37" #61 prio=5 os_prio=0 tid=0x00005613c698d000 nid=0x2729 waiting on condition [0x00002af9f4bb0000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x00000000827000d8> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1088)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"DeploymentScanner-threads - 2" #59 prio=5 os_prio=0 tid=0x00005613c66a3000 nid=0x2726 waiting on condition [0x00002af9f49ae000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000087816888> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1088)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"DeploymentScanner-threads - 1" #58 prio=5 os_prio=0 tid=0x00005613c669f000 nid=0x2725 waiting on condition [0x00002af9f48ad000]
   java.lang.Thread.State: TIMED_WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000087816888> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"ServerService Thread Pool -- 33" #55 prio=5 os_prio=0 tid=0x00005613c573d800 nid=0x271f waiting on condition [0x00002af9f2d76000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082700020> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"DestroyJavaVM" #23 prio=5 os_prio=0 tid=0x00005613c2cfe000 nid=0x26e1 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"ServerService Thread Pool -- 1" #22 prio=5 os_prio=0 tid=0x00005613c44a8000 nid=0x26ff waiting on condition [0x00002af9f0c84000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x00000000827000d8> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1088)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"ServerDeploymentRepository-temp-threads - 1" #20 daemon prio=5 os_prio=0 tid=0x00005613c4a0b000 nid=0x26fd waiting on condition [0x00002af9f0577000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082710078> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1081)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

"MSC service thread 1-4" #19 prio=5 os_prio=0 tid=0x00005613c4633000 nid=0x26fc waiting on condition [0x00002af9f046b000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082710348> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at java.lang.Thread.run(Thread.java:748)

"MSC service thread 1-3" #18 prio=5 os_prio=0 tid=0x00005613c455d800 nid=0x26fa waiting on condition [0x00002af9f036a000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082710348> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at java.lang.Thread.run(Thread.java:748)

"MSC service thread 1-2" #17 prio=5 os_prio=0 tid=0x00005613c4607000 nid=0x26f8 waiting on condition [0x00002af9f0069000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082710348> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at java.lang.Thread.run(Thread.java:748)

"MSC service thread 1-1" #16 prio=5 os_prio=0 tid=0x00005613c4657800 nid=0x26f7 waiting on condition [0x00002af9eff68000]
   java.lang.Thread.State: WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x0000000082710348> (a org.jboss.threads.EnhancedQueueExecutor)
        at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1409)
        at java.lang.Thread.run(Thread.java:748)

"Reference Reaper" #13 daemon prio=5 os_prio=0 tid=0x00005613c3707800 nid=0x26f6 in Object.wait() [0x00002af9ef1d6000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x0000000080696648> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
        - locked <0x0000000080696648> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
        at org.jboss.modules.ref.References$ReaperThread.run(References.java:64)

"Service Thread" #12 daemon prio=9 os_prio=0 tid=0x00005613c34a2000 nid=0x26f4 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread1" #11 daemon prio=9 os_prio=0 tid=0x00005613c3453800 nid=0x26f3 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #10 daemon prio=9 os_prio=0 tid=0x00005613c3452800 nid=0x26f2 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Thread-2" #9 daemon prio=5 os_prio=0 tid=0x00005613c3450800 nid=0x26f1 runnable [0x00002af9eedd2000]
   java.lang.Thread.State: RUNNABLE
        at sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
        at sun.nio.ch.EPollArrayWrapper.poll(EPollArrayWrapper.java:269)
        at sun.nio.ch.EPollSelectorImpl.doSelect(EPollSelectorImpl.java:93)
        at sun.nio.ch.SelectorImpl.lockAndDoSelect(SelectorImpl.java:86)
        - locked <0x0000000080696d28> (a sun.nio.ch.Util$3)
        - locked <0x0000000080696d38> (a java.util.Collections$UnmodifiableSet)
        - locked <0x0000000080696ce0> (a sun.nio.ch.EPollSelectorImpl)
        at sun.nio.ch.SelectorImpl.select(SelectorImpl.java:97)
        at sun.net.httpserver.ServerImpl$Dispatcher.run(ServerImpl.java:352)
        at java.lang.Thread.run(Thread.java:748)

"server-timer" #7 daemon prio=5 os_prio=0 tid=0x00005613c3440800 nid=0x26ef in Object.wait() [0x00002af9eebd0000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        at java.util.TimerThread.mainLoop(Timer.java:552)
        - locked <0x0000000080763958> (a java.util.TaskQueue)
        at java.util.TimerThread.run(Timer.java:505)

"Signal Dispatcher" #5 daemon prio=9 os_prio=0 tid=0x00005613c31c7000 nid=0x26ed waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Surrogate Locker Thread (Concurrent GC)" #4 daemon prio=9 os_prio=0 tid=0x00005613c31c5000 nid=0x26ec waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=0 tid=0x00005613c3197800 nid=0x26eb in Object.wait() [0x00002af9e7b0c000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
        - locked <0x0000000080763e18> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:216)

"Reference Handler" #2 daemon prio=10 os_prio=0 tid=0x00005613c318d800 nid=0x26ea in Object.wait() [0x00002af9e7a0b000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x0000000080686e58> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"VM Thread" os_prio=0 tid=0x00005613c3183800 nid=0x26e9 runnable

"Gang worker#0 (Parallel GC Threads)" os_prio=0 tid=0x00005613c2d10800 nid=0x26e2 runnable

"Gang worker#1 (Parallel GC Threads)" os_prio=0 tid=0x00005613c2d12800 nid=0x26e3 runnable

"G1 Main Concurrent Mark GC Thread" os_prio=0 tid=0x00005613c2d37000 nid=0x26e7 runnable

"Gang worker#0 (G1 Parallel Marking Threads)" os_prio=0 tid=0x00005613c2d39000 nid=0x26e8 runnable

"G1 Concurrent Refinement Thread#0" os_prio=0 tid=0x00005613c2d19000 nid=0x26e6 runnable

"G1 Concurrent Refinement Thread#1" os_prio=0 tid=0x00005613c2d17000 nid=0x26e5 runnable

"G1 Concurrent Refinement Thread#2" os_prio=0 tid=0x00005613c2d15000 nid=0x26e4 runnable

"VM Periodic Task Thread" os_prio=0 tid=0x00005613c34a5800 nid=0x26f5 waiting on condition

JNI global references: 2633

Heap
 garbage-first heap   total 1048576K, used 694623K [0x0000000080000000, 0x0000000080102000, 0x0000000100000000)
  region size 1024K, 357 young (365568K), 7 survivors (7168K)
 Metaspace       used 170946K, capacity 185540K, committed 185728K, reserved 1208320K
  class space    used 22069K, capacity 26125K, committed 26240K, reserved 1048576K

[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep -n "Full thread dump" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log
14:Full thread dump OpenJDK 64-Bit Server VM (25.262-b10 mixed mode):
[root@caddeapllx2484 p585600]#
