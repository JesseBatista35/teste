C:\Users\p585600>curl -k -s -o NUL -w "antigo /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp/
antigo /siemp       404

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>curl -k -s -o NUL -w "antigo /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp/
antigo /siemp       404

C:\Users\p585600>curl -k -s -o NUL -w "novo   /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.180.9 https://siemp.des.caixa/siemp/
novo   /siemp       200

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>curl -k -s -o NUL -w "antigo /siemp_java  %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp_java/
antigo /siemp_java  404

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>
