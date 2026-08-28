<Project Sdk="Microsoft.NET.Sdk.Web">

  <PropertyGroup>
    <TargetFramework>net8.0</TargetFramework>
    <Nullable>enable</Nullable>
    <ImplicitUsings>enable</ImplicitUsings>
    <InvariantGlobalization>false</InvariantGlobalization>
    <UserSecretsId>52bf55ee-50bc-498b-9947-5b7cad9c3512</UserSecretsId>
    <DockerDefaultTargetOS>Linux</DockerDefaultTargetOS>

    <PublishTrimmed>false</PublishTrimmed>
    <PublishReadyToRun>false</PublishReadyToRun>
    <AnalysisMode>Recommended</AnalysisMode>
    <EnforceCodeStyleInBuild>true</EnforceCodeStyleInBuild>
    <RootNamespace>SIBKO</RootNamespace>
    <NoWarn>CS7022,CS8604,CA2201,CA1310,CA1305,CA1309,CA1707,CA1848,CA1711</NoWarn>
    <GenerateDocumentationFile>true</GenerateDocumentationFile>
    <NoWarn>$(NoWarn);1591</NoWarn>
  </PropertyGroup>

  <ItemGroup>
    <CompilerVisibleProperty Include="RootNamespace" />
    <CompilerVisibleProperty Include="ProjectDir" />
    <PackageReference Include="Bogus" Version="35.6.0" />

    <PackageReference Include="Microsoft.NET.Test.Sdk" Version="17.11.0" />

    <PackageReference Include="Moq" Version="4.20.70" />
    <PackageReference Include="Stubble.Core" Version="1.10.8" />

    <PackageReference Include="Swashbuckle.AspNetCore.Annotations" Version="7.0.0" />
    <PackageReference Include="xunit" Version="2.9.0" />
    <PackageReference Include="xunit.runner.visualstudio" Version="2.8.2">
      <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
      <PrivateAssets>all</PrivateAssets>
    </PackageReference>
    <PackageReference Include="coverlet.collector" Version="6.0.2">
      <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
      <PrivateAssets>all</PrivateAssets>
    </PackageReference>

    <PackageReference Include="Microsoft.ApplicationInsights.AspNetCore" Version="2.22.0" />

    <PackageReference Include="AspNetCore.HealthChecks.SqlServer" Version="8.0.2" />
    <PackageReference Include="AspNetCore.HealthChecks.UI" Version="8.0.2" />
    <PackageReference Include="AspNetCore.HealthChecks.UI.Client" Version="8.0.1" />
    <PackageReference Include="AspNetCore.HealthChecks.UI.InMemory.Storage" Version="8.0.1" />

    <PackageReference Include="AutoMapper" Version="13.0.1" />
    <PackageReference Include="Dapper" Version="2.1.35" />
    <PackageReference Include="Microsoft.Extensions.Configuration.Binder" Version="8.0.2" />
    <PackageReference Include="Microsoft.AspNetCore.Authentication.JwtBearer" Version="8.0.8" />
    <PackageReference Include="Microsoft.EntityFrameworkCore" Version="8.0.8" />
    <PackageReference Include="Microsoft.EntityFrameworkCore.Design" Version="8.0.8">
      <PrivateAssets>all</PrivateAssets>
      <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
    </PackageReference>
    <PackageReference Include="Microsoft.EntityFrameworkCore.Proxies" Version="8.0.8" />
    <PackageReference Include="Microsoft.EntityFrameworkCore.SqlServer" Version="8.0.8" />
    <PackageReference Include="Microsoft.EntityFrameworkCore.Tools" Version="8.0.8">
      <PrivateAssets>all</PrivateAssets>
      <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
    </PackageReference>
    <PackageReference Include="Microsoft.Extensions.Logging.ApplicationInsights" Version="2.22.0" />
    <PackageReference Include="Microsoft.VisualStudio.Azure.Containers.Tools.Targets"
      Version="1.21.0" />
    <PackageReference Include="Newtonsoft.Json" Version="13.0.3" />
    <PackageReference Include="RestSharp" Version="112.0.0" />
    <PackageReference Include="Swashbuckle.AspNetCore" Version="6.9.0" />
  </ItemGroup>

  <ItemGroup>
    <Folder Include="assets\" />
  </ItemGroup>
</Project>
