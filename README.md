
Starting: Checkout repository@3.10.0 to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: repository (ExternalGit)
git version
git version 2.43.5
git config --get remote.origin.url
git clean -ffdx
git reset --hard HEAD
fatal: ambiguous argument 'HEAD': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
##[warning]Unable to run "git clean -ffdx" and "git reset --hard HEAD" successfully, delete source folder instead.
git init "/opt/ads-agent/_work/164/s"
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint: 	git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint: 	git branch -m <name>
Initialized empty Git repository in /opt/ads-agent/_work/164/s/.git/
git remote add origin https://github.com/caixagithub/SIMPF-frontend.git
git config gc.auto 0
git config --get-all http.https://github.com/caixagithub/SIMPF-frontend.git.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git remote set-url origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git remote set-url --push origin https://emptyusername:***@github.com/caixagithub/SIMPF-frontend.git
git -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
