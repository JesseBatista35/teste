
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] batch
[domain@localhost:9443 / #] /profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec":add(cache-type=default)
[domain@localhost:9443 / #] /profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec"/authentication=classic:add(login-modules=[{code=Remoting,flag=optional,module-options={password-stacking=useFirstPass}},{code=RealmDirect,flag=required,module-options={password-stacking=useFirstPass}}])
[domain@localhost:9443 / #] run-batch
The batch executed successfully

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
'host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)' is not a valid operation name.

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
