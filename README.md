Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIRTA

SIRTA-frontend

Tasks

Variables

Triggers

Options

History
Bash
Task version
3.*
Display name
npm install
Type


Script
cd $(PACKAGE_JSON_PATH)
npm install --legacy-peer-deps

Advanced
Control Options
Environment Variables
Output Variables
Showing 24 filtered items.

Showing 23 filtered items.

Showing 22 filtered items.

Showing 21 filtered items.

Showing 20 filtered items.

Expanded

Row 3. Clickable

Collapsed

Showing 19 filtered items.

Expanded

Row 3. Clickable

Collapsed

Showing 18 filtered items.

Showing 18 filtered items.

Expanded

Collapsed

Row 2. Clickable

Row 2. Clickable

Showing 18 filtered items.

Get started and run this pipeline for the first time!





coloquei colo bash scirpt



npm install

View raw log

Starting: npm install
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/30d98276-417d-4ca9-ab1f-2f284f2b27c1.sh
/opt/ads-agent/_work/_temp/30d98276-417d-4ca9-ab1f-2f284f2b27c1.sh: line 1: PACKAGE_JSON_PATH: command not found
npm WARN saveError ENOENT: no such file or directory, open '/opt/ads-agent/package.json'
npm notice created a lockfile as package-lock.json. You should commit this file.
npm WARN enoent ENOENT: no such file or directory, open '/opt/ads-agent/package.json'
npm WARN ads-agent No description
npm WARN ads-agent No repository field.
npm WARN ads-agent No README data
npm WARN ads-agent No license field.

up to date in 0.067s
Finishing: npm install

