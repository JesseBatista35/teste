using BaseMVVM.Data.Menu.Model;
using Microsoft.EntityFrameworkCore;

namespace BaseMVVM.Data.Base;

public class DataBaseSqlServerConnection(DbContextOptions<DataBaseSqlServerConnection> options): DbContext(options), IDataBaseConnection
{
    public DbContext GetDbContext()
    {
        return this;
    }

    public DbSet<MenuDataModel> Menu { get; set; }
}
