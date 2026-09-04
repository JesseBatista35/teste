Boa tarde, a taask Login OpenShift está apresentando erro:

2026-09-04T15:35:31.5892146Z Não encontrei o cluster para logar
2026-09-04T15:35:31.5905444Z ##[error]Bash exited with code '1'.

link: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=525506&environmentId=2440849

podem verificar por favor?

Obrigado



<img width="1665" height="874" alt="image" src="https://github.com/user-attachments/assets/f060572e-3f51-40d8-aaf8-eaee77f53314" />


<img width="1675" height="926" alt="image" src="https://github.com/user-attachments/assets/18f7d4d3-870f-411c-b24a-ef506c1210b0" />

<img width="1371" height="939" alt="image" src="https://github.com/user-attachments/assets/0880c356-965f-42ef-bd6b-9fd3216b7362" />


<img width="1803" height="888" alt="image" src="https://github.com/user-attachments/assets/c02be426-629e-4e6e-9ae9-abe91c84a45b" />


foi realziado os ajustes, porem queroui com novo erro.



---> Running application ...
Unhandled exception. System.ArgumentException: Startup hook assembly '/opt/app-root/apm_agent/ElasticApmAgentStartupHook.dll' failed to load. See inner exception for details.
---> System.IO.FileNotFoundException: Could not load file or assembly '/opt/app-root/apm_agent/ElasticApmAgentStartupHook.dll'. The system cannot find the file specified.
File name: '/opt/app-root/apm_agent/ElasticApmAgentStartupHook.dll'
at System.Runtime.Loader.AssemblyLoadContext.LoadFromPath(IntPtr ptrNativeAssemblyBinder, String ilPath, String niPath, ObjectHandleOnStack retAssembly)
at System.Runtime.Loader.AssemblyLoadContext.LoadFromAssemblyPath(String assemblyPath)
at System.StartupHookProvider.CallStartupHook(StartupHookNameOrPath startupHook)
--- End of inner exception stack trace ---
at System.StartupHookProvider.CallStartupHook(StartupHookNameOrPath startupHook)
at System.StartupHookProvider.ProcessStartupHooks(String diagnosticStartupHooks)
