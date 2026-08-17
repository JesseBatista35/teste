using BaseMVVM.Data.Common;
using BaseMVVM.Domain.Common;
using BaseMVVM.UI.Common;

var builder = WebApplication.CreateBuilder(args);

//Cross
builder.Services.AddCors(option =>
{
    option.AddPolicy("AllowAngularLocalhost",
        policy => policy
        .WithOrigins("http://localhost:4200")
        .AllowAnyHeader()
        .AllowAnyMethod()
        .AllowCredentials());
});

// Add services to the container.
builder.Services.AddDataModules(builder.Configuration);
builder.Services.AddDomainModules();
builder.Services.AddUIModules();
builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();
app.UseCors("AllowAngularLocalhost");

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseDeveloperExceptionPage();
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();
