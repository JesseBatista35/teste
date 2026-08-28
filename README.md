Segue o passo a passo em texto corrido, pronto pra copiar:

PASSO 1 - Criar branch de backup da develop atual
Na tela de Branches, clique em New branch. Nome: develop-backup-20260828. Em "Based on", selecione a branch develop atual. Isso preserva o histórico completo da develop de hoje antes de qualquer alteração.

PASSO 2 - Trocar o branch padrão do repositório
Vá em Project Settings, depois Repositories, selecione SIFAP-backend, aba Branches. Defina temporariamente develop-backup-20260828 (ou master) como branch padrão. O Azure DevOps não deixa excluir uma branch marcada como padrão.

PASSO 3 - Excluir a branch develop atual
Volte em Branches, localize develop, clique nos três pontinhos ao lado dela e escolha Delete branch. Se aparecer aviso de política de proteção, remova ou desabilite temporariamente a policy em Project Settings, Repositories, develop, Branch Policies, antes de conseguir excluir.

PASSO 4 - Criar a nova develop a partir da tag em HMP
Clique em New branch novamente. Nome: develop. Em "Based on", selecione a tag GT2.25.1.2, ou a branch 2.25.1.2_branch que já existe na lista (commit 3667dfeb, criada em 30 de julho, provavelmente a origem dessa mesma tag). Confirme que esse commit corresponde ao release 507961 antes de usar como base.

PASSO 5 - Baixar as pastas DML e doc da branch de backup
Em Files, selecione develop-backup-20260828 no seletor de branch. Navegue até a pasta DML, clique nos três pontinhos e escolha Download as zip. Repita para a pasta doc. Extraia os dois zips localmente.

PASSO 6 - Subir as pastas DML e doc na nova develop
Troque o seletor de branch para develop (a nova). Use New, depois Upload file(s), e arraste as pastas DML e doc extraídas, mantendo a estrutura de subpastas. Confirme o commit direto na develop, ou via Pull Request se houver política de revisão obrigatória ativa.

PASSO 7 - Restaurar configurações e avisar o Emanuel
Reative as branch policies desabilitadas, restaure develop como branch padrão do repositório, e confirme com Emanuel de Souza Alves, por Teams ou telefone, que a develop está pronta para validação.



<img width="1865" height="680" alt="image" src="https://github.com/user-attachments/assets/54218a2d-c86d-455a-9048-f3c75de5dc82" />


foi realizado conforme solicitado me ajdua com o texto




