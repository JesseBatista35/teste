
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep -a -i "recebid\|descida\|resposta\|retorno" "$LOG" | tail -5
2026-11-27 10:11:41,288 INFO  [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-7) [ID=1795785101278 32610] Mensagem ISO recebida (antes do empacotamento): 0215A0000000820000040300000010000100041099040104009640809                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                00080000049616200                    
2026-11-27 10:11:41,288 INFO  [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-7) [ID=1795785101278 32610] Mensagem ISO recebida (antes do empacotamento): 0215A0000000820000040300000010000100041099040104009640909                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                00099999049616200Consuta Realizada com Sucesso!
2026-11-27 10:11:41,288 DEBUG [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-7) [ID=1795785101278 32610] temos uma posicao nula na rajada recebida em 0
2026-11-27 10:11:41,288 DEBUG [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-7) [ID=1795785101278 32610] Terminada a leitura da resposta do SIROT2, retorna para client.
2026-11-27 10:11:41,288 DEBUG [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-7) [ID=1795785101278 32610] Resposta recebida!
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep -a -i "sito\|lculo\|metros\|nios" "$LOG" | tail -1 | hexdump -C | head -40
00000000  32 30 32 36 2d 31 31 2d  32 37 20 31 30 3a 31 31  |2026-11-27 10:11|
00000010  3a 30 39 2c 39 37 34 20  49 4e 46 4f 20 20 5b 62  |:09,974 INFO  [b|
00000020  72 2e 67 6f 76 2e 63 61  69 78 61 2e 73 69 72 6f  |r.gov.caixa.siro|
00000030  74 2e 65 6a 62 2e 53 49  52 4f 54 43 6f 6e 49 6d  |t.ejb.SIROTConIm|
00000040  70 6c 5d 20 28 64 65 66  61 75 6c 74 20 74 61 73  |pl] (default tas|
00000050  6b 2d 36 29 20 5b 49 44  3d 31 37 39 35 37 38 35  |k-6) [ID=1795785|
00000060  30 36 39 39 34 35 20 34  36 36 37 30 5d 20 4d 65  |069945 46670] Me|
00000070  6e 73 61 67 65 6d 20 49  53 4f 20 72 65 63 65 62  |nsagem ISO receb|
00000080  69 64 61 20 28 61 6e 74  65 73 20 64 6f 20 65 6d  |ida (antes do em|
00000090  70 61 63 6f 74 61 6d 65  6e 74 6f 29 3a 20 30 32  |pacotamento): 02|
000000a0  31 35 41 30 30 30 30 30  30 30 38 32 30 30 30 30  |15A0000000820000|
000000b0  30 34 30 33 30 30 30 30  30 30 31 30 30 30 30 31  |0403000000100001|
000000c0  30 30 30 34 31 30 39 38  30 34 30 31 30 34 30 30  |0004109804010400|
000000d0  38 39 38 30 38 30 31 31  35 32 31 35 31 45 73 66  |8980801152151Esf|
000000e0  65 72 61 73 20 4a 75 73  74 69 c8 61 20 20 20 20  |eras Justi.a    |
000000f0  20 20 20 20 20 20 20 20  20 20 20 53 6c 69 73 74  |           Slist|
00000100  61 72 5f 65 73 66 65 72  61 73 20 20 20 20 20 20  |ar_esferas      |
00000110  20 20 20 20 20 20 20 20  20 20 20 20 20 20 20 20  |                |
*
00000130  20 20 20 20 20 20 20 20  30 30 30 30 36 36 30 31  |        00006601|
00000140  30 30 30 30 30 31 34 31  35 31 30 30 30 54 72 69  |0000014151000Tri|
00000150  62 75 6e 61 6c 20 43 4e  4a 20 20 20 20 20 20 20  |bunal CNJ       |
00000160  20 20 20 20 20 20 20 20  20 20 20 53 20 20 20 20  |           S    |
00000170  20 20 20 20 20 20 20 20  20 20 20 20 20 20 20 20  |                |
*
000001a0  20 20 20 20 20 20 20 20  30 30 30 30 30 30 30 30  |        00000000|
000001b0  30 30 30 30 30 30 32 31  35 33 31 35 31 54 72 69  |0000002153151Tri|
000001c0  62 75 6e 61 6c 20 43 4e  4a 20 20 20 20 20 20 20  |bunal CNJ       |
000001d0  20 20 20 20 20 20 20 20  20 20 20 53 75 72 6c 5f  |           Surl_|
000001e0  74 72 69 62 75 6e 61 6c  5f 63 6e 6a 20 20 20 20  |tribunal_cnj    |
000001f0  20 20 20 20 20 20 20 20  20 20 20 20 20 20 20 20  |                |
*
00000210  20 20 20 20 20 20 20 20  30 30 30 30 36 36 30 32  |        00006602|
00000220  30 30 30 30 30 30 33 31  35 34 31 35 31 54 72 69  |0000003154151Tri|
00000230  62 75 6e 61 6c 20 43 4e  4a 20 78 20 4d 75 6e 69  |bunal CNJ x Muni|
00000240  63 d5 70 69 6f 20 20 20  20 20 20 53 72 65 6c 61  |c.pio      Srela|
00000250  63 69 6f 6e 61 6d 65 6e  74 6f 5f 74 72 69 62 75  |cionamento_tribu|
00000260  6e 61 6c 5f 75 6e 69 64  61 64 65 20 20 20 20 20  |nal_unidade     |
00000270  20 20 20 20 20 20 20 20  20 20 20 20 20 20 20 20  |                |
00000280  20 20 20 20 20 20 20 20  30 30 30 30 36 36 30 33  |        00006603|
[root@caddeapllx955 p585600]#
