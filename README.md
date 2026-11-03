<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.2">
  <deployment>
    <exclusions>
      <module name="org.jboss.resteasy.resteasy-jackson2-provider"/>
    </exclusions>
    <dependencies>
      <module name="org.jboss.resteasy.resteasy-jackson-provider" services="import"/>
    </dependencies>
  </deployment>
  <sub-deployment name="fec-web.war">
    <exclusions>
      <module name="org.jboss.resteasy.resteasy-jackson2-provider"/>
    </exclusions>
    <dependencies>
      <module name="org.jboss.resteasy.resteasy-jackson-provider" services="import"/>
    </dependencies>
  </sub-deployment>
</jboss-deployment-structure>
