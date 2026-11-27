Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIDSC
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIDSC

.github
.s2i
bin
assemble
run
docs
projects
scripts
.editorconfig
.gitignore
.hintrc
.npmrc
.prettierignore
.prettierrc
angular.json
package-lock.json
package.json
README.md
tsconfig.json
vitest.config.ts

develop-v21

/
package.json
package.json

Edit

Contents
History
Compare
Blame

You updated develop-v22 7h ago
Create a pull request

123456789101112131415161718192021222324252627282930313233343536373839
{
  "name": "sdsc-library",
  "version": "1.0.0",
  "scripts": {
    "ng": "ng",
    "build:lib": "ng build sdsc",
    "build:iconoir": "npm run iconoir:build && ng build sdsc",
    "watch": "ng build sdsc --watch",
    "test": "ng test sdsc",
    "package": "cd dist/sdsc && npm pack",
…    "jsdom": "^28.1.0",
    "ng-packagr": "^21.2.0",
    "prettier": "^3.8.1",
    "storybook": "^10.4.6",
    "ts-node": "^10.9.2",
    "typescript": "~5.9.2",
    "vitest": "^4.0.8"
  }
}






ja tem 

e ja fiz


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIDSC-storybook-v21-config
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIDSC-storybook-v21-config

README.md
sidsc-nginx.conf

master

/
sidsc-nginx.conf
sidsc-nginx.conf

Edit

Contents
History
Compare
Blame

Committed 2a408023: Updated sidsc-nginx.conf
Create a pull request

123456789
location /api/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    rewrite ^/sidsc-api/?(.*) /$1 break;
    proxy_pass __HTTP_SERVICE_API__/; 
    proxy_redirect off;
}
Expanded

Collapsed

location /api/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    rewrite ^/sidsc-api/?(.*) /$1 break;
    proxy_pass __HTTP_SERVICE_API__/; 
    proxy_redirect off;
}
