find /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP -maxdepth 2 -type d
du -sh /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP
du -sh /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP

# comparar com o tamanho de um overlay 6.4.x que sabemos que está completo, como referência
du -sh /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.24.CP
