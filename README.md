
[root@crjtqapllx003 p585600]# sed -n '1250,1428p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n -i "exception|error|caused by|singleton"
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# sed -n '1100,1428p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n -i "exception|caused by"
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# grep -n "AbstractEJBRequestScopeActivationInterceptor" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log
297:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
364:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
431:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
737:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
804:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
871:    at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
1245:   at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
1312:   at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
1379:   at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
[root@crjtqapllx003 p585600]#
