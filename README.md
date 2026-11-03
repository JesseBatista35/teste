As URLs afetadas pelo problema do Apache novo (caddeapllx2794) são estas:

URL	Aplicação	Server-group / balancer	Situação
https://sigec.des.caixa/gec-web/por/	SIGEC Portabilidade Batch	sigec-portabilidade-batch / mycluster_sigec	Caía no Online. Hoje dá 404 no novo porque o Batch está em STARTING
https://sigecpor2.des.caixa/gec-web/por/	SIGEC Portabilidade Online	sigec-portabilidade2 / mycluster_sigec2	Funcionava, mas misturado com o Batch. Hoje dá 503 no novo (balancer sem membros)



<img width="1876" height="973" alt="image" src="https://github.com/user-attachments/assets/f9c940fd-e9c3-4898-8d0c-d09f25d53fa1" />


mas i sigecpor2  ta funfando

<img width="1875" height="963" alt="image" src="https://github.com/user-attachments/assets/8e4ba3dd-0cc8-41a8-b497-02e1585e680f" />


