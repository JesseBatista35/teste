{
  "name": "simpf-frontend-root",
  "private": true,
  "dependencies": {
    "simpf-frontend": "file:web"
  },
  "scripts": {
    "install:web": "cd web && npm install",
    "test": "cd web && npm run test:ci",
    "test:ci": "cd web && npm run test:ci",
    "start": "cd web && npm start",
    "start:dev": "cd web && npm run start:dev",
    "build": "cd web && npm run build"
  }
}


caixagithub
SIMPF-frontend
Repository navigation
Code
Issues
Pull requests
35
 (35)
Actions
Projects
Wiki
Security and quality
251
 (251)
Insights
Settings
Files
Go to file
t
T
.s2i/bin content loaded
.claude
.github
.s2i/bin
assemble
run
.vscode
web
.angulardoc.json
.editorconfig
.gitignore
.npmrc
AGENTS.md
CLAUDE.md
README.md
SIMPF-frontend.iml
package-lock.json
package.json
testes-cobertura-codigo.md
SIMPF-frontend
/package.json
author
Luiz Gustavo Santos Amarante
IB-00000000 - removido dependencia circular
3cc74bd
 · 
5 months ago

Code

Blame
15 lines (15 loc) · 385 Bytes
{
  "name": "simpf-frontend-root",
  "private": true,
  "dependencies": {
    "simpf-frontend": "file:web"
  },
  "scripts": {
    "install:web": "cd web && npm install",
    "test": "cd web && npm run test:ci",
    "test:ci": "cd web && npm run test:ci",
    "start": "cd web && npm start",
    "start:dev": "cd web && npm run start:dev",
    "build": "cd web && npm run build"
  }
}
