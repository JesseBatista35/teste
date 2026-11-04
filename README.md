ssh p585600@10.116.97.59
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990



batch
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec:add(cache-type=default)
/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec/authentication=classic:add(login-modules=[{code=Remoting,flag=optional,module-options={password-stacking=useFirstPass}},{code=RealmDirect,flag=required,module-options={password-stacking=useFirstPass}}])
run-batch

/socket-binding-group=caixa-full-ha-sockets/remote-destination-outbound-socket-binding=mail-smtp:read-resource

/profile=full-ha-sifec-intranet/subsystem=mail/mail-session=FECMail:add(jndi-name=java:jboss/mail/FECMail)
/profile=full-ha-sifec-intranet/subsystem=mail/mail-session=FECMail/server=smtp:add(outbound-socket-binding-ref=mail-smtp)



/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
