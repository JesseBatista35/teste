Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigos-processamento-arquivos
Repository navigation
Code
Issues
6
 (6)
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
4
 (4)
Insights
Settings
Update call-generic-pipelines.yaml- #38
#38
Welcome to the upgraded Files Changed experience
It's faster, more accessible, and includes new features like commenting anywhere in changed files and file tree indicators.

Open
Jesse Mouta Pereira Batista (p585600_caixa)
wants to merge 1 commit into
main
from
p585600_caixa-patch-6
+10
-4
Lines changed: 10 additions & 4 deletions
Conversation0 (0)
Commits1 (1)
Checks0 (0)
Files changed1 (1)
Pull request toolbar
0 / 1 viewed
0 of 1 file viewed
Filter files…
File tree
.github/workflows
call-generic-pipelines.yaml
‎.github/workflows/call-generic-pipelines.yaml‎
+10
-4
Lines changed: 10 additions & 4 deletions


Original file line number	Diff line number	Diff line change
    paths-ignore:
    - '.github/**'
    - 'catalog-info.yaml'
  pull_request:
    branches:
    - main
    - develop
    paths-ignore:
    - '.github/**'
    - 'catalog-info.yaml'
    
# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #

jobs:
  Generic-Solution:
    name: CI_DES
    name: CI_DES_TQS
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      DEPLOY_ENVIRONMENTS: '["DES", "TQS"]'








    Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigos-processamento-arquivos
Repository navigation
Code
Issues
6
 (6)
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
4
 (4)
Insights
Settings
Update call-generic-pipelines.yaml- #38
#38
Open
Jesse Mouta Pereira Batista (p585600_caixa)
wants to merge 1 commit into
main
from
p585600_caixa-patch-6
+10
-4
Lines changed: 10 additions & 4 deletions
Conversation0 (0)
Commits1 (1)
Checks0 (0)
Files changed1 (1)
Open
Update call-generic-pipelines.yaml#38
Jesse Mouta Pereira Batista (p585600_caixa)
wants to merge 1 commit into
main
from
p585600_caixa-patch-6
Conversation
@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa)
commented
3 minutes ago
No description provided.

@p585600_caixa
Update call-generic-pipelines.yaml
ec85a61
@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa) requested a review from Margareth Moscardini de Oliveira (c101476_caixa) 3 minutes ago
c101476_caixa
Margareth Moscardini de Oliveira (c101476_caixa) approved these changes 1 minute ago
This branch has not been deployed
No deployments
Merge info
Changes approved
1 approving review by reviewers with write access.


Some checks haven't completed yet
1 expected check


pending checks
QA / Quality AssuranceExpected — Waiting for status to be reported
Required
Merging is blocked
Code scanning is waiting for results from CodeQL for the commits 9e6e2fd or ec85a61.
You can also merge this with the command line. 
Still in progress?
@p585600_caixa


Add a comment
Comment
 
Add your comment here...
Remember, contributions to this repository should follow our GitHub Community Guidelines.
 ProTip! Add comments to specific lines under Files changed.
Reviewers
@c101476_caixa
Margareth Moscardini de Oliveira (c101476_caixa)
Still in progress?
Assignees
No one—
Labels
None yet
Projects
None yet
Milestone
No milestone
Development
Successfully merging this pull request may close these issues.

None yet


Notifications
Customize
You’re receiving notifications because you authored the thread.
2 participants
@p585600_caixa
@c101476_caixa
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

