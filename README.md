
-sh-4.2$
-sh-4.2$ oc debug pod/sigfa-api-extratos-des-16-m75ws -n sigfa-des -c sigfa-api-extratos-des
Debugging with pod/sigfa-api-extratos-des-16-m75ws-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ cat /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
sh: xxd: command not found
sh-4.4$ env | grep -iE "SMALLRYE|CLISERGFA|OIDC_CLIENT_CREDENTIALS"
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET=${CLISERGFA_SSO_INTRA}
TOKEN_CLIENT_SECRET=${CLISERGFA_SSO_INTRA}
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/SIGFA_DES/
sh-4.4$ ls -la /usr/src/app/secrets_files/SIGFA_DES/
total 24
drwxr-xr-x. 2 1337 root 160 Aug 18 16:02 .
drwxrwxrwt. 3 root root  60 Aug 18 16:02 ..
-rw-r--r--. 1 1337 root  36 Aug 18 16:02 CLISERGFA_SSO_INTRA
-rw-r--r--. 1 1337 root 673 Aug 18 16:02 CLISERGFA_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root   8 Aug 18 16:02 SGFADS01_ORACLE
-rw-r--r--. 1 1337 root 670 Aug 18 16:02 SGFADS01_ORACLE_Metadata
-rw-r--r--. 1 1337 root  34 Aug 18 16:02 SIGFA_APIKEY
-rw-r--r--. 1 1337 root 697 Aug 18 16:02 SIGFA_APIKEY_Metadata
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ cat -A /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA
d5e5a6f6-6cfd-4785-ae2b-2c4cb8332083sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ od -c /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA
0000000   d   5   e   5   a   6   f   6   -   6   c   f   d   -   4   7
0000020   8   5   -   a   e   2   b   -   2   c   4   c   b   8   3   3
0000040   2   0   8   3
0000044
sh-4.4$
sh-4.4$
sh-4.4$ exit
exit

Removing debug pod ...
-sh-4.2$ oc get pods -n sigfa-des | grep extratos
sigfa-api-extratos-des-15-deploy            0/1       Error       0              25m
sigfa-api-extratos-des-16-deploy            1/1       Running     0              4m41s
sigfa-api-extratos-des-16-m75ws             0/1       Running     5 (103s ago)   4m38s
-sh-4.2$ oc logs -n sigfa-des sigfa-api-extratos-des-16-m75ws -c sigfa-api-extratos-des --tail=60
        at io.smallrye.mutiny.operators.uni.UniOnItemOrFailureFlatMap$UniOnItemOrFailureFlatMapProcessor.performInnerSubscription(UniOnItemOrFailureFlatMap.java:99)
        at io.smallrye.mutiny.operators.uni.UniOnItemOrFailureFlatMap$UniOnItemOrFailureFlatMapProcessor.onItem(UniOnItemOrFailureFlatMap.java:54)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransform$UniOnItemTransformProcessor.onItem(UniOnItemTransform.java:43)
        at io.smallrye.mutiny.operators.uni.UniOperatorProcessor.onItem(UniOperatorProcessor.java:47)
        at io.smallrye.mutiny.operators.uni.UniOperatorProcessor.onItem(UniOperatorProcessor.java:47)
        at io.smallrye.mutiny.operators.uni.builders.UniCreateFromPublisher$PublisherSubscriber.onNext(UniCreateFromPublisher.java:76)
        at io.smallrye.mutiny.subscription.MultiSubscriberAdapter.onItem(MultiSubscriberAdapter.java:27)
        at io.smallrye.mutiny.subscription.MultiSubscriber.onNext(MultiSubscriber.java:61)
        at io.smallrye.mutiny.subscription.SerializedSubscriber.onItem(SerializedSubscriber.java:74)
        at io.smallrye.mutiny.operators.multi.MultiRetryWhenOp$RetryWhenOperator.onItem(MultiRetryWhenOp.java:118)
        at io.smallrye.mutiny.subscription.MultiSubscriber.onNext(MultiSubscriber.java:61)
        at io.smallrye.mutiny.converters.uni.UniToMultiPublisher$UniToMultiSubscription.onItem(UniToMultiPublisher.java:94)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransformToUni$UniOnItemTransformToUniProcessor.onItem(UniOnItemTransformToUni.java:60)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransform$UniOnItemTransformProcessor.onItem(UniOnItemTransform.java:43)
        at io.smallrye.mutiny.operators.uni.builders.UniCreateFromKnownItem$KnownItemSubscription.forward(UniCreateFromKnownItem.java:42)
        at io.smallrye.mutiny.operators.uni.builders.UniCreateFromKnownItem.subscribe(UniCreateFromKnownItem.java:23)
        at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransform.subscribe(UniOnItemTransform.java:22)
        at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransformToUni$UniOnItemTransformToUniProcessor.performInnerSubscription(UniOnItemTransformToUni.java:81)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransformToUni$UniOnItemTransformToUniProcessor.onItem(UniOnItemTransformToUni.java:57)
        at io.smallrye.mutiny.operators.uni.UniOnItemTransformToUni$UniOnItemTransformToUniProcessor.onItem(UniOnItemTransformToUni.java:60)
        at io.smallrye.mutiny.vertx.AsyncResultUni.lambda$subscribe$1(AsyncResultUni.java:35)
        at io.smallrye.mutiny.vertx.DelegatingHandler.handle(DelegatingHandler.java:25)
        at io.vertx.ext.web.client.impl.HttpContext.handleDispatchResponse(HttpContext.java:403)
        at io.vertx.ext.web.client.impl.HttpContext.execute(HttpContext.java:385)
        at io.vertx.ext.web.client.impl.HttpContext.next(HttpContext.java:363)
        at io.vertx.ext.web.client.impl.HttpContext.fire(HttpContext.java:330)
        at io.vertx.ext.web.client.impl.HttpContext.dispatchResponse(HttpContext.java:292)
        at io.vertx.ext.web.client.impl.HttpContext.lambda$null$6(HttpContext.java:510)
        at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:270)
        at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:252)
        at io.vertx.core.impl.ContextInternal.lambda$runOnContext$0(ContextInternal.java:50)
        at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
        at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
        at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:566)
        at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
        at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
        at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        Suppressed: io.quarkus.oidc.OIDCException
                at io.quarkus.oidc.runtime.TenantContextFactory$2.apply(TenantContextFactory.java:130)
                at io.quarkus.oidc.runtime.TenantContextFactory$2.apply(TenantContextFactory.java:111)
                at io.smallrye.context.impl.wrappers.SlowContextualFunction.apply(SlowContextualFunction.java:21)
                at io.smallrye.mutiny.groups.UniOnFailure.lambda$recoverWithItem$8(UniOnFailure.java:193)
                at io.smallrye.mutiny.operators.uni.UniOnFailureFlatMap$UniOnFailureFlatMapProcessor.performInnerSubscription(UniOnFailureFlatMap.java:95)
                ... 61 more
        Caused by: java.util.NoSuchElementException: No value present
                at java.base/java.util.Optional.get(Optional.java:143)
                at io.quarkus.oidc.common.runtime.OidcCommonUtils.initClientSecretBasicAuth(OidcCommonUtils.java:533)
                at io.quarkus.oidc.runtime.OidcProviderClientImpl.lambda$of$20(OidcProviderClientImpl.java:635)
                at io.smallrye.context.impl.wrappers.SlowContextualFunction.apply(SlowContextualFunction.java:21)
                at io.smallrye.mutiny.groups.UniOnNotNull.lambda$transform$4(UniOnNotNull.java:116)
                at io.smallrye.context.impl.wrappers.SlowContextualFunction.apply(SlowContextualFunction.java:21)
                at io.smallrye.mutiny.operators.uni.UniOnItemTransform$UniOnItemTransformProcessor.onItem(UniOnItemTransform.java:36)
                ... 52 more
Caused by: [CIRCULAR REFERENCE: java.util.NoSuchElementException: No value present]

-sh-4.2$
