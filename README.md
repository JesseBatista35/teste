using BaseMVVM.Data.Base;
using BaseMVVM.Data.Example.DI;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;

namespace BaseMVVM.Data.Common;

public static class ServiceCollectionExtensions
{
    public static void AddDataModules(this IServiceCollection services, IConfiguration configuration)
    {
        services.AddDbContext<DataBaseSqlServerConnection>(options =>
        {
            options.UseSqlServer(configuration.GetConnectionString("SIPGC3"));
        });
        services.AddExampleData();
    }
}
