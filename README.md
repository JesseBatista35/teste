Sobre o path no JBoss: melhor não criar um path por pasta. Como serão vários tipos (convenio, empenho, etc.), o ideal é montar só um path raiz, tipo /siorf, e em tempo de execução a aplicação completa com o restante (/convenio/resultado, /empenho/processar, etc).

Assim fica mais fácil de manter, sem precisar mexer no JBoss toda vez que surgir um tipo novo. Só precisamos garantir que as subpastas existam dentro do NFS.

Vamos seguir acompanhando essa REQ que você abriu e quando o armazenamento finalizar, a gente configura o path.
