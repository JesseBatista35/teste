ublish Quality Gate Result

View raw log
Starting: Publish Quality Gate Result
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/e27639b3-97b4-4137-8be3-6cb8109efc2e.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaHBclUPPmqzl3Vc643X
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaHBcr0JFkwt0Lh6k-sP
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result



Skip to main content
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIAVO-ms-spa


develop
Last analysis of this Branch had 1 warning
November 9, 2026 at 2:54 PM
Version 1.0.0-snapshot

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
To benefit from more of SonarQube's features, ask a project administrator to set up DevOps platform integration.

Quality Gate Status
Failed
1 conditions failed
The quality gate used by this project does not comply with Clean as You Code.
Fixing this quality gate will help you achieve a Clean Code state.

Learn why
1 condition(s) failed on new code
4.4%
Coverage on New Codeis less than 80.0%
Measures

New Code
From last 421 days

Overall Code
0
New Bugs
Reliability
A
0
New Vulnerabilities
Security
A
0
New Security Hotspots
Reviewed
Security Review
A
3min
Added Debt
3
New Code Smells
Maintainability
A
4.4%
Coverage on 4.2k New Lines to cover
0.0%
Duplications on 16k New Lines
Activity
Choose graph type
Issues
Bugs
Code Smells
Vulnerabilities
new code
0
2
4
6
8
Sep 20
Sep 27
Oct 04
Oct 11
Oct 18
Oct 25
November
Activity
November 9, 2026 at 2:54 PM
1.0.0-snapshot
November 6, 2026 at 11:49 AM
1.0.102.0
November 6, 2026 at 10:51 AM
Quality Gate: Failed
Quality Profile: Use 'Sonar way' (JavaScript)
November 5, 2026 at 6:33 PM
1.0.101.1
November 5, 2026 at 1:56 PM
1.0.101.0
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API

Skip to main contentSkip to issue filters
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIAVO-ms-spa


develop
Last analysis of this Branch had 1 warning
November 9, 2026 at 2:54 PM
Version 1.0.0-snapshot

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
Issues
My Issues
All
Clear All Filters
Filters

Issues in new code
Type
Code Smell
Clear

Bug
0

Vulnerability
0

Code Smell
3
Press Ctrl to add to selection
Severity
Major
Clear

Blocker
0

Minor
0

Critical
0

Info
0

Major
3
Press Ctrl to add to selection
Scope
Resolution
Status
Security Category
Creation Date
Language
Rule
Tag
Directory
File
Assignee
Author
Bulk Change
↑
←↓→
1 / 3issues
3min effort
List of issues
src/.../entidade-cop/pages/cadastro/cadastro.component.scss
Unexpected duplicate selector ".legacy-grid-values", first used at line 178

4 days ago
L207

Code Smell

Major

Open

Not assigned
1min effort

Comment

No tags
src/styles/_alto-contraste.scss
Unexpected duplicate selector "html.alto-contraste *, html.alto-contraste *::before, html.alto-contraste *::after", first used at line 52 (no-duplicate-selectors)

12 days ago
L136

Code Smell

Major

Open

Not assigned
1min effort

Comment

No tags
src/styles/_typography.scss
Unexpected duplicate selector ".mat-mdc-slide-toggle .mdc-label, .mat-mdc-slide-toggle label", first used at line 23 (no-duplicate-selectors)

12 days ago
L28

Code Smell

Major

Open

Not assigned
1min effort

Comment

No tags
3 of 3 shown
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API
