Starting: Checkout repository@3.10.0.6 to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: repository (ExternalGit)
git version
git version 2.47.3
git init "/opt/ads-agent/_work/30/s"
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
Initialized empty Git repository in /opt/ads-agent/_work/30/s/.git/
git remote add origin https://github.com/caixagithub/SIMPF-backend.git
git config gc.auto 0
git config --get-all http.https://github.com/caixagithub/SIMPF-backend.git.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git remote set-url origin https://emptyusername:***@github.com/caixagithub/SIMPF-backend.git
git remote set-url --push origin https://emptyusername:***@github.com/caixagithub/SIMPF-backend.git
git -c http.sslVerify=false fetch --force --no-tags --prune --prune-tags --progress --no-recurse-submodules origin
remote: Enumerating objects: 20105, done.        
remote: Counting objects:   0% (1/622)        
remote: Counting objects:   1% (7/622)        
remote: Counting objects:   2% (13/622)     
* [new tag]           3.8.0.35          -> 3.8.0.35
 * [new tag]           3.8.0.36          -> 3.8.0.36
 * [new tag]           3.8.0.37          -> 3.8.0.37
 * [new tag]           3.8.0.38          -> 3.8.0.38
 * [new tag]           3.8.0.6           -> 3.8.0.6
 * [new tag]           3.8.0.7           -> 3.8.0.7
 * [new tag]           3.8.0.8           -> 3.8.0.8
 * [new tag]           3.8.0.9           -> 3.8.0.9
 * [new tag]           3.8.1.0           -> 3.8.1.0
 * [new tag]           3.8.1.1           -> 3.8.1.1
 * [new tag]           3.9.0.0           -> 3.9.0.0
 * [new tag]           3.9.0.1           -> 3.9.0.1
 * [new tag]           3.9.0.2           -> 3.9.0.2
 * [new tag]           3.9.0.3           -> 3.9.0.3
 * [new tag]           3.9.0.4           -> 3.9.0.4
 * [new tag]           3.9.1.1           -> 3.9.1.1
 * [new tag]           3.9.1.2           -> 3.9.1.2
 * [new tag]           3.9.1.3           -> 3.9.1.3
 * [new tag]           3.9.2.1           -> 3.9.2.1
 * [new tag]           3.9.3.1           -> 3.9.3.1
 * [new tag]           tag-from-7467a55e -> tag-from-7467a55e
 * [new tag]           tag-from-774139ee -> tag-from-774139ee
git checkout --progress --force refs/remotes/origin/3.10.0.6
error: pathspec 'refs/remotes/origin/3.10.0.6' did not match any file(s) known to git
##[error]Git checkout failed with exit code: 1
Finishing: Checkout repository@3.10.0.6 to s
