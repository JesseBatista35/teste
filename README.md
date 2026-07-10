
-sh-4.2$ oc project
Using project "sisam-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami
p585600@corp.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret vault-sisam-internet-keystore -n sisam-tqs
NAME                            TYPE      DATA      AGE
vault-sisam-internet-keystore   Opaque    1         110s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret vault-sisam-internet-keystore -n sisam-tqs -o yaml | grep -A5 "^data:"
data:
  vault-sisam-internet-tqs.keystore: zs7OzgAAAAIAAAABAAAAAwAFamJvc3MAAAGdR1O7iqztAAVzcgAzY29tLnN1bi5jcnlwdG8ucHJvdmlkZXIuU2VhbGVkT2JqZWN0Rm9yS2V5UHJvdGVjdG9yzVfKWecwu1MCAAB4cgAZamF2YXguY3J5cHRvLlNlYWxlZE9iamVjdD42PabDt1RwAgAEWwANZW5jb2RlZFBhcmFtc3QAAltCWwAQZW5jcnlwdGVkQ29udGVudHEAfgACTAAJcGFyYW1zQWxndAASTGphdmEvbGFuZy9TdHJpbmc7TAAHc2VhbEFsZ3EAfgADeHB1cgACW0Ks8xf4BghU4AIAAHhwAAAAETAPBAjUkwtFgIqkHwIDAw1AdXEAfgAFAAAAkODNo6hvhnvpeSROl4KcBR2Aammq64bY5ZQg4rkh9LSwRtft1saPswAuLi64J+VktAvrLE//HEUgiZmc1wvdXB0aAGtYqakjydFtJjTOtBZXrxOOh3tqAWEXtMbkYcL/JV2uien1gd0D4o1+RQL5NsQJ3WuRQi0F0xWurdbBu66UZlOkM7qVP27cfCM5i1w2QXQAFlBCRVdpdGhNRDVBbmRUcmlwbGVERVN0ABZQQkVXaXRoTUQ1QW5kVHJpcGxlREVTaXh6uRUbJCWuhNlwAt7GzzBsWbc=
kind: Secret
metadata:
  creationTimestamp: 2026-07-10T18:28:37Z
  managedFields:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
