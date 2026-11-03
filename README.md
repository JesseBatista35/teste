grep -RniE 'ProxyPass|UseAlias|CreateBalancers' /opt/httpd/conf.d/   # (ou o path equivalente no Apache antigo)



diff /opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007 /opt/httpd/conf.d/httpd-sigec.des.conf
diff /opt/httpd/conf.d/httpd-sigecpor2.conf_20261007    /opt/httpd/conf.d/httpd-sigecpor2.conf



/server-group=sigec-portabilidade2:read-attribute(name=profile)
/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)
/profile=<perfil do sigec-portabilidade2>/subsystem=modcluster:read-resource(recursive=true)


   curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/
   curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/
