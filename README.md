Oi Luciana, tudo certo!

Ajustei o mountPath no DES e já validei: agora está montando direto em /siorf (raiz), com o storage /fs_siorf por trás. Testei criação de arquivo lá dentro e funcionou sem restrição — a aplicação consegue criar as subpastas normalmente (convenio/resultado, convenio/processar, etc).

Pode seguir com o desenvolvimento usando essa estrutura. Assim que o storage finalizar a REQ do TQS, faço o mesmo ajuste lá.
