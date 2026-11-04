
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="deployment-info --server-group=sifec-intranet" | grep -E "^(SIFEC |SIFEC-CCR |SICCR-PJ|SIAPX|SIFEC-EMP|SIEMP|SIFEC-RURAL|SIFES|SIARC|SIFEC-CONSTRUCARD|SIEMP-EMPRESAS|SIFEC-BNDES|SICDT)"
SIAPX_JavaWeb                      sifec-apx-1.7.9.4-b40.ear                     not added
SIARC                              siarc_EAP6.ear                                not added
SICCR-PJ                           sifec-ccr-pj-8.38.0.1-b5720.ear               not added
SICCR-PJ-INTERNET                  sifec-ccr-pj-5.8.0.1-b72.ear                  not added
SICCR-PJ2                          sifec-ccr-pj-8.40.0.3-b5717.ear               not added
SICCR-PJ3                          sifec-ccr-pj-8.40.0.3-b5719.ear               not added
SICCR-PJ4                          sifec-ccr-pj-8.40.0.3-b5718.ear               not added
SICCR-PJ5                          sifec-ccr-pj-8.39.0.1-b5681.ear               not added
SICDT-FEC                          sifec-cdt-3.23.5.4-b2448.ear                  not added
SICDT-FEC2                         sifec-cdt-3.22.1-b2421.ear                    not added
SICDT-FEC3                         sifec-cdt-3.21.0-b2394.ear                    not added
SICDT-FEC4                         sifec-cdt-3.23.5.5-b2449.ear                  not added
SICDT-FEC5                         sifec-cdt-3.23.5.6-b2454.ear                  not added
SIEMP                              siemp-ear-14.37.0.6.ear                       not added
SIEMP-EMPRESAS                     empresas-1.2.3-b15.ear                        not added
SIFEC                              sifec-2.160.3.0.ear                           enabled
SIFEC-BNDES-ONLINE                 sifec-bndes-1.1.0-b8.ear                      not added
SIFEC-CCR                          SIFEC-CCR-6.3.0-b4587.ear                     enabled
SIFEC-CONSTRUCARD                  construcard-1.23.1.2-b64.ear                  not added
SIFEC-EMP                          emp-3.95.0.1-b1437.ear                        not added
SIFEC-EMP-MGE                      mge-1.0.0-b14.ear                             not added
SIFEC-EMP2                         emp-3.92.1.1-b1459.ear                        not added
SIFEC-EMP3                         emp-3.95.0.1-b1436.ear                        not added
SIFEC-EMP4                         emp-3.95.0.1-b1458.ear                        not added
SIFEC-EMP5                         emp-3.92.1.1-b1408.ear                        not added
SIFEC-RURAL                        rural-2.115.0.1-b2446.ear                     not added
SIFEC-RURAL2                       rural-2.114.0.0-b2422.ear                     not added
SIFEC-RURAL3                       rural-2.115.0.1-b2420.ear                     not added
SIFEC-RURAL4                       rural-2.115.1.1-b2421.ear                     not added
SIFEC-RURAL5                       rural-2.112.0.0-b2317.ear                     not added
SIFES                              fes-3.110.0.0-b97.ear                         not added
SIFES-INTERNET                     fes-3.109.3.0-b1051.ear                       not added
SIFES2                             fes-3.108.5.0-b69.ear                         not added
SIFES3                             fes-3.108.3.0-b85.ear                         not added
SIFES4                             fes-3.111.0.0-b71.ear                         not added
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="deployment-info --server-group=siemp" | grep enabled
SIEMP                              siemp-ear-14.37.0.6.ear                       enabled
framework-2.0.1-des.jar            framework.jar                                 enabled
framework_sisgd-1.0.0              framework_sisgd.jar                           enabled
jconn4.jar                         jconn4.jar                                    enabled
wmq.jmsra.rar                      wmq.jmsra.rar                                 enabled
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ deployment-info --server-group=sifec-intranet
-sh: deployment-info: command not found
[p585600@cbrdeapllx471 ~]$



estao esse pacotes ja estao aqui e so subir confomer eles solicitarem?
