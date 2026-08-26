 [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] Caused by: org.apache.maven.plugin.compiler.CompilationFailureException: Compilation failure
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute (AbstractCompilerMojo.java:1309)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.plugin.compiler.CompilerMojo.execute (CompilerMojo.java:225)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:103)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at java.lang.reflect.Method.invoke (Method.java:580)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:255)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:201)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:361)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild]     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:314)
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] [ERROR] 
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] [ERROR] Re-run Maven using the -X switch to enable full debug logging.
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] [ERROR] 
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] [ERROR] For more information about the errors and possible solutions, please read the following articles:
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [autobuild] [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
  [2026-08-26 14:39:31] [build-stdout] [2026-08-26 14:39:31] [ERROR] Spawned process exited abnormally (code 1; tried to run: [/home/runner/_work/siaci-api-administracao-contratual/siaci-api-administracao-contratual/./mvnw, clean, package, -f, pom.xml, -B, -V, -e, -Dfindbugs.skip, -Dcheckstyle.skip, -Dpmd.skip=true, -Dspotbugs.skip, -Denforcer.skip, -Dmaven.javadoc.skip, -DskipTests, -Dmaven.test.skip.exec, -Dlicense.skip=true, -Drat.skip=true, -Dspotless.check.skip=true, -s, /home/runner/.m2/settings.xml, -t, /home/runner/.m2/toolchains.xml])
  [2026-08-26 14:39:31] [ERROR] Spawned process exited abnormally (code 1; tried to run: [/home/runner/_work/_tool/CodeQL/2.26.3/x64/codeql/tools/linux64/preload_tracer, /home/runner/_work/_tool/CodeQL/2.26.3/x64/codeql/java/tools/autobuild.sh])
  A fatal error occurred: Exit status 1 from command: [/home/runner/_work/_tool/CodeQL/2.26.3/x64/codeql/java/tools/autobuild.sh]
  Error: We were unable to automatically build your code. Please change the build mode for this language to manual and specify build steps for your project. See https://docs.github.com/en/code-security/code-scanning/troubleshooting-code-scanning/automatic-build-failed for more information. Encountered a fatal error while running "/home/runner/_work/_tool/CodeQL/2.26.3/x64/codeql/codeql database trace-command --use-build-mode --working-dir /home/runner/_work/siaci-api-administracao-contratual/siaci-api-administracao-contratual /home/runner/_work/_temp/codeql_databases/java". Exit code was 2 and error was: A fatal error occurred: Exit status 1 from command: [/home/runner/_work/_tool/CodeQL/2.26.3/x64/codeql/java/tools/autobuild.sh]. See the logs for more details.


0s
42s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
Set up QEMU
9s
Set up Docker Buildx
7s
Connecting on Registry
3s
Login to Docker
1s
Docker meta
1s
Build and push
22s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/build-push-action@v6
  (node:3432) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
GitHub Actions runtime token ACs
Docker info
Proxy configuration
Buildx version
Builder info
  /usr/bin/docker buildx build --cache-from type=registry,ref=acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:buildcache --cache-to type=registry,ref=acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:cache,mode=max --file ./Dockerfile --iidfile /home/runner/_work/_temp/docker-actions-toolkit-uyVu2T/build-iidfile-4564fbdb53.txt --label org.opencontainers.image.created=2026-08-24T16:50:15.247Z --label org.opencontainers.image.description=Adicionando aplicação: siaci-api-administracao-contratual --label org.opencontainers.image.licenses= --label org.opencontainers.image.revision=bef8094697ab7bd18e12e6fce66a8287bcc006cb --label org.opencontainers.image.source=https://github.com/caixagithub/siaci-api-administracao-contratual --label org.opencontainers.image.title=siaci-api-administracao-contratual --label org.opencontainers.image.url=https://github.com/caixagithub/siaci-api-administracao-contratual --label org.opencontainers.image.version=32752876514 --platform linux/amd64 --attest type=provenance,mode=min,inline-only=true,builder-id=https://github.com/caixagithub/siaci-api-administracao-contratual/actions/runs/32752876514/attempts/1 --tag acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:32752876514 --metadata-file /home/runner/_work/_temp/docker-actions-toolkit-uyVu2T/build-metadata-54c3eb8cc5.json --push .
  #0 building with "builder-0b15b355-73fc-4bf6-9c4b-c662ddf97812" instance using docker-container driver
  
  #1 [internal] load build definition from Dockerfile
  #1 transferring dockerfile: 757B done
  #1 DONE 0.0s
  
  #2 [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-jammy
  #2 ...
  
  #3 [internal] load metadata for registry.access.redhat.com/ubi8/openjdk-21:1.21
  #3 DONE 1.2s
  
  #2 [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-jammy
  #2 DONE 1.3s
  
  #4 [internal] load .dockerignore
  #4 transferring context:
  #4 transferring context: 97B done
  #4 DONE 0.1s
  
  #5 [internal] load build context
  #5 DONE 0.0s
  
  #6 [auth] siaci/api-administracao-contratual/siaci-api-administracao-contratual:pull token for acrcentralcaixanprd.azurecr.io
  #6 DONE 0.0s

  .....

  >>>
>  >>


0s
42s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
Set up QEMU
9s
Set up Docker Buildx
7s
Connecting on Registry
3s
Login to Docker
1s
Docker meta
1s
Build and push
22s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/build-push-action@v6
  (node:3432) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
GitHub Actions runtime token ACs
Docker info
Proxy configuration
Buildx version
Builder info
  /usr/bin/docker buildx build --cache-from type=registry,ref=acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:buildcache --cache-to type=registry,ref=acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:cache,mode=max --file ./Dockerfile --iidfile /home/runner/_work/_temp/docker-actions-toolkit-uyVu2T/build-iidfile-4564fbdb53.txt --label org.opencontainers.image.created=2026-08-24T16:50:15.247Z --label org.opencontainers.image.description=Adicionando aplicação: siaci-api-administracao-contratual --label org.opencontainers.image.licenses= --label org.opencontainers.image.revision=bef8094697ab7bd18e12e6fce66a8287bcc006cb --label org.opencontainers.image.source=https://github.com/caixagithub/siaci-api-administracao-contratual --label org.opencontainers.image.title=siaci-api-administracao-contratual --label org.opencontainers.image.url=https://github.com/caixagithub/siaci-api-administracao-contratual --label org.opencontainers.image.version=32752876514 --platform linux/amd64 --attest type=provenance,mode=min,inline-only=true,builder-id=https://github.com/caixagithub/siaci-api-administracao-contratual/actions/runs/32752876514/attempts/1 --tag acrcentralcaixanprd.azurecr.io/siaci/api-administracao-contratual/siaci-api-administracao-contratual:32752876514 --metadata-file /home/runner/_work/_temp/docker-actions-toolkit-uyVu2T/build-metadata-54c3eb8cc5.json --push .
  #0 building with "builder-0b15b355-73fc-4bf6-9c4b-c662ddf97812" instance using docker-container driver
  
  #1 [internal] load build definition from Dockerfile
  #1 transferring dockerfile: 757B done
  #1 DONE 0.0s
  
  #2 [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-jammy
  #2 ...
  
  #3 [internal] load metadata for registry.access.redhat.com/ubi8/openjdk-21:1.21
  #3 DONE 1.2s
  
  #2 [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-jammy
  #2 DONE 1.3s
  
  #4 [internal] load .dockerignore
  #4 transferring context:
  #4 transferring context: 97B done
  #4 DONE 0.1s
  
  #5 [internal] load build context
  #5 DONE 0.0s
  
  #6 [auth] siaci/api-administracao-contratual/siaci-api-administracao-contratual:pull token for acrcentralcaixanprd.azurecr.io
  #6 DONE 0.0s

  
