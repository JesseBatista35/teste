
Exception Message: Exception: Microsoft.TeamFoundation.DistributedTask.Pipelines.PipelineValidationException (type ReleaseManagementHandledException)
Exception Stack Trace:    at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseOrchestrator.FailOrchestrationImplementation(Int32 releaseId, Int32 releaseStepId, Nullable`1 releaseDeployPhaseId, Action`3 rejectStep, Exception ex)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseOrchestrator.FailOrchestration(Int32 releaseId, Int32 releaseStepId, Nullable`1 releaseDeployPhaseId, Exception ex)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseOrchestrator.InvokeRunner(Release release, ReleaseEnvironmentStep deployStep, ReleaseEnvironment releaseEnvironment, DeployPhaseSnapshot snapshotToProcess, Func`5 runDeployPhase, Action`4 acceptStep, Action`3 rejectStep, Action`4 handleException)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseOrchestrator.ProcessDeployPhasesImplementation(Release release, ReleaseEnvironmentStep deployStep, Func`5 runDeployPhase, Action`4 acceptStep, Action`3 rejectStep, Action`4 handleException)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseOrchestrator.ProcessDeployPhases(Release release, ReleaseEnvironmentStep deployStep)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.OrchestratorServiceProcessorV2.ExecuteDeployStep(Release release, ReleaseEnvironmentStep releaseEnvironmentStep)
Inner Exception Details:
Exception Message: The pipeline is not valid. Job Phase_1: Step DownloadSecureFile input secureFile references secure file b1d0c47f-fc73-4011-9294-16b1668e5b4c which could not be found. The secure file does not exist or has not been authorized for use. For authorization details, refer to https://aka.ms/yamlauthz. (type PipelineValidationException)
Exception Stack Trace:    at Microsoft.TeamFoundation.DistributedTask.Orchestration.Server.TaskHub.ValidatePipelineProcess(IVssRequestContext requestContext, Guid scopeIdentifier, Int32 definitionId, Guid planId, PipelineEnvironment environment, PipelineProcess pipeline, BuildOptions options)
   at Microsoft.TeamFoundation.DistributedTask.Orchestration.Server.TaskHub.ValidateProcess(IVssRequestContext requestContext, Guid scopeIdentifier, TaskOrchestrationOwner definition, Guid planId, IOrchestrationEnvironment environment, IOrchestrationProcess process, BuildOptions options)
   at Microsoft.TeamFoundation.DistributedTask.Orchestration.Server.TaskHub.CreatePlan(IVssRequestContext requestContext, Guid scopeIdentifier, Guid planId, String planGroup, PlanTemplateType templateType, Uri artifactUri, IOrchestrationEnvironment environment, IOrchestrationProcess process, BuildOptions validationOptions, Guid requestedForId, TaskOrchestrationOwner definitionReference, TaskOrchestrationOwner ownerReference, String pipelineInitializationLog, String pipelineExpandedYaml)
   at Microsoft.TeamFoundation.DistributedTask.Orchestration.Server.TaskHub.RunPlan(IVssRequestContext requestContext, TaskAgentPoolReference pool, Guid scopeIdentifier, Guid planId, String planGroup, PlanTemplateType templateType, Uri artifactUri, IOrchestrationEnvironment environment, IOrchestrationProcess process, BuildOptions validationOptions, Guid requestedForId, TaskOrchestrationOwner definitionReference, TaskOrchestrationOwner ownerReference, String pipelineInitializationLog, String pipelineExpandedYaml)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.DistributedTask.PipelineOrchestrator.StartDeployment(AutomationEngineInput input)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Processors.DeployPhaseRunner.Run(Release release, ReleaseEnvironment releaseEnvironment, ReleaseEnvironmentStep deployStep, DeployPhaseSnapshot snapshotToProcess)
   at Microsoft.VisualStudio.Services.ReleaseManagement.Server.Pro
Exception: Microsoft.TeamFoundation.DistributedTask.Pipelines.PipelineValidationException


<img width="1898" height="1012" alt="image" src="https://github.com/user-attachments/assets/1c5f7f5d-de35-4c66-bc2d-7380488a1d21" />


