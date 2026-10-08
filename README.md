
-sh-4.2$
-sh-4.2$ oc get netnamespace -o custom-columns=NAME:.metadata.name,EGRESS:.egressIPs | grep -E "10.116.209.59|10.116.222.206|10.116.222.190|10.116.222.6|10.116.222.5|10.116.222.164|10.116.220.210|10.116.220.180|10.116.221.183"
siara-hmp                                          [10.116.209.59]
siaud-hmp                                          [10.116.222.164]
sicgb-hmp                                          [10.116.222.6]
sicgb-tqs                                          [10.116.222.5]
sid02-hmp                                          [10.116.222.54]
sid02-tqs                                          [10.116.222.53]
sid03-hmp                                          [10.116.222.63]
sid08-hmp                                          [10.116.222.52]
sid09-hmp                                          [10.116.222.50]
sideo-hmp                                          [10.116.222.56]
sidmf-hmp                                          [10.116.222.66]
sidon-tqs                                          [10.116.222.58]
sigms-des                                          [10.116.220.180]
sigts-des                                          [10.116.220.210]
sigts-hmp                                          [10.116.222.206]
sipdm-des                                          [10.116.221.183]
sirfo-hmp                                          [10.116.222.190]
sispb-tqs                                          [10.116.222.67]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug node/ceadecldlx084.nprd.caixa -- chroot /host ip -4 addr | grep -B2 10.116.221.46
error: cannot debug ceadecldlx084.nprd.caixa: unable to extract pod template from type *v1.Node
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
