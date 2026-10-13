-4.2$
-sh-4.2$
-sh-4.2$ JAVA=/usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/java
-sh-4.2$
-sh-4.2$
-sh-4.2$ $JAVA --list-modules | grep -E "jdk.jdeps|jdk.compiler"
jdk.compiler@11.0.8
jdk.jdeps@11.0.8
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp/simkt-cls
-sh-4.2$ $JAVA --module jdk.jdeps/com.sun.tools.javap.Main -c -l -p \
>   WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class \
>   > /tmp/simkt-cls/privrepo.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n "findByUriAndHttpMethod" /tmp/simkt-cls/privrepo.txt
57:  public java.util.List<br.gov.caixa.pedes.sistemas.simkt.integration.sso.domain.Privilege> findByUriAndHttpMethod(java.lang.String, org.springframework.http.HttpMethod);
281:  private static boolean lambda$findByUriAndHttpMethod$1(java.lang.String, org.springframework.http.HttpMethod, br.gov.caixa.pedes.sistemas.simkt.integration.sso.domain.Privilege);
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -n '/findByUriAndHttpMethod/,/LocalVariableTable/p' /tmp/simkt-cls/privrepo.txt | head -120
  public java.util.List<br.gov.caixa.pedes.sistemas.simkt.integration.sso.domain.Privilege> findByUriAndHttpMethod(java.lang.String, org.springframework.http.HttpMethod);
    Code:
       0: aload_0
       1: getfield      #7                  // Field privileges:Ljava/util/List;
       4: invokeinterface #13,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       9: aload_1
      10: aload_2
      11: invokedynamic #14,  0             // InvokeDynamic #1:test:(Ljava/lang/String;Lorg/springframework/http/HttpMethod;)Ljava/util/function/Predicate;
      16: invokeinterface #15,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      21: invokestatic  #16                 // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
      24: invokeinterface #17,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
      29: checkcast     #6                  // class java/util/List
      32: areturn
    LineNumberTable:
      line 47: 0
      line 48: 16
      line 47: 32
    LocalVariableTable:
  private static boolean lambda$findByUriAndHttpMethod$1(java.lang.String, org.springframework.http.HttpMethod, br.gov.caixa.pedes.sistemas.simkt.integration.sso.domain.Privilege);
    Code:
       0: aload_2
       1: aload_0
       2: aload_1
       3: invokestatic  #49                 // Method br/gov/caixa/pedes/sistemas/simkt/integration/sso/util/PrivilegeMatcher.matchResource:(Lbr/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/Privilege;Ljava/lang/String;Lorg/springframework/http/HttpMethod;)Z
       6: ireturn
    LineNumberTable:
      line 48: 0
    LocalVariableTable:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
