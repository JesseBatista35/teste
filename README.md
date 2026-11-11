Marcio, os endereços *.esteiras.des.caixa e *.esteiras.tqs.caixa apontam para o OpenShift, e o SIGSJ roda em VM, por isso não funcionam. Foi justamente por isso que pedimos a URL customizada (sigsj-intranet.des.caixa e sigsj-internet.des.caixa).

Status do intranet DES: o VIP já foi criado e está apontando para a VM; falta a Segurança instalar o certificado no VIP (WO0000082200842) e depois abrir o DNS. Assim que isso for concluído, ajustamos a release e a URL passa a funcionar. O internet está no mesmo ponto, e o TQS vamos pedir na sequência.

Enquanto isso, para testar, vocês conseguem acessar direto pelo servidor: http://caddeapllx955.agil.nprd.caixa.gov.br/sigsj_intranet/
