
[root@srjtqapllx0021 p585600]# grep -i "keystore password was incorrect\|erro ao carregar reposit" /infra_app/logs/sifug/server-srjtqapllx0021_sifug_inter_8080.log | tail -5
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]#
[root@srjtqapllx0021 p585600]# tail -30 /infra_app/logs/sifug/server-srjtqapllx0021_sifug_inter_8080.log
2026-09-22 14:27:02,570 INFO  [stdout] (reactor-http-epoll-1) 0000: 6A B2 BA 66 D1 C4 C4 23   79 ED 5B C1 EB E0 8F 3C  j..f...#y.[....<
2026-09-22 14:27:02,571 INFO  [stdout] (reactor-http-epoll-1) 0010: A6 54 DE 5F 1B 78 7A F4   44 4F 57 4E 47 52 44 01  .T._.xz.DOWNGRD.
2026-09-22 14:27:02,571 INFO  [stdout] (reactor-http-epoll-1) Master Secret:
2026-09-22 14:27:02,571 INFO  [stdout] (reactor-http-epoll-1) 0000: DC 42 1B F7 39 E1 6D 86   75 5C C8 88 CC E4 C2 48  .B..9.m.u\.....H
2026-09-22 14:27:02,571 INFO  [stdout] (reactor-http-epoll-1) 0010: 1F BD 86 21 02 07 12 D6   6A D0 90 00 04 1E DA 54  ...!....j......T
2026-09-22 14:27:02,572 INFO  [stdout] (reactor-http-epoll-1) 0020: 87 6C 5A C1 A7 9C 16 AC   B8 BF EF C0 6C 3E D3 C1  .lZ.........l>..
2026-09-22 14:27:02,572 INFO  [stdout] (reactor-http-epoll-1) ... no MAC keys used for this cipher
2026-09-22 14:27:02,572 INFO  [stdout] (reactor-http-epoll-1) Client write key:
2026-09-22 14:27:02,572 INFO  [stdout] (reactor-http-epoll-1) 0000: 07 32 02 24 51 3E F9 FA   27 AF C2 7E 77 D7 96 36  .2.$Q>..'...w..6
2026-09-22 14:27:02,572 INFO  [stdout] (reactor-http-epoll-1) Server write key:
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) 0000: 9F 43 BD CD D3 B5 7D 93   F7 DD C8 7B 94 B2 09 6E  .C.............n
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) Client write IV:
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) 0000: 7B D1 1B 36                                        ...6
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) Server write IV:
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) 0000: 41 47 E6 6B                                        AG.k
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Change Cipher Spec, length = 1
2026-09-22 14:27:02,573 INFO  [stdout] (reactor-http-epoll-1) *** Finished
2026-09-22 14:27:02,574 INFO  [stdout] (reactor-http-epoll-1) verify_data:  { 34, 91, 250, 57, 17, 8, 166, 59, 205, 185, 2, 185 }
2026-09-22 14:27:02,574 INFO  [stdout] (reactor-http-epoll-1) ***
2026-09-22 14:27:02,574 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Handshake, length = 40
2026-09-22 14:27:02,590 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Application Data, length = 160
2026-09-22 14:27:02,591 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Application Data, length = 15717
2026-09-22 14:27:02,761 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, READ: TLSv1.2 Change Cipher Spec, length = 1
2026-09-22 14:27:02,761 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, READ: TLSv1.2 Handshake, length = 40
2026-09-22 14:27:02,762 INFO  [stdout] (reactor-http-epoll-1) *** Finished
2026-09-22 14:27:02,762 INFO  [stdout] (reactor-http-epoll-1) verify_data:  { 97, 63, 252, 49, 43, 51, 107, 141, 223, 149, 232, 89 }
2026-09-22 14:27:02,762 INFO  [stdout] (reactor-http-epoll-1) ***
2026-09-22 14:27:02,762 INFO  [stdout] (reactor-http-epoll-1) %% Cached client session: [Session-21, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256]
2026-09-22 14:27:02,763 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Application Data, length = 150
2026-09-22 14:27:02,763 INFO  [stdout] (reactor-http-epoll-1) reactor-http-epoll-1, WRITE: TLSv1.2 Application Data, length = 356
[root@srjtqapllx0021 p585600]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990 --command="/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:read-attribute(name=status)"
{
    "outcome" => "success",
    "result" => "STARTED"
}
[root@srjtqapllx0021 p585600]#
