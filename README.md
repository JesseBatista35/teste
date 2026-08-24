<sub-deployment name="SICMU-ejb.jar">
    <dependencies>
        <module name="br.gov.caixa.psc.jconnector" />
        <module name="br.gov.caixa.sisgr" />
        <module name="javax.jms.api" />
    </dependencies>
</sub-deployment>
<sub-deployment name="SICMU-web.war">
    <dependencies>
        ...
        <module name="br.gov.caixa.sisgr" />
        <module name="br.gov.caixa.psc.jconnector" />
        ...
    </dependencies>
</sub-deployment>
