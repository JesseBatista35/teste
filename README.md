Rafael (ajusta o nome do dev), sobre a tela de login errada: o problema é que o environment.prod.ts no seu código tem a URL de SSO de PRD fixa, e o build de vocês usa --configuration production sempre. Isso é ajuste que precisa ser feito no código da aplicação (environments/config), não é algo que dá pra resolver via pipeline. Pode ver com seu time como estruturar isso pra não depender de qual ambiente o build está rodando?


Pessoal, sobre a branch principal: vou verificar se dá pra configurar direto pelas configurações do repositório (Branch Policies), sem precisar de REQ. Se não tiver essa permissão liberada, aí sim abro REQ. De qualquer forma, o objetivo é: commit direto bloqueado, só entra via Pull Request com aprovação do Matheus (tech lead) antes do merge.
Assim que estiver configurado, aviso vocês. O fluxo de trabalho de vocês continua o mesmo (branch de feature, push, PR).
