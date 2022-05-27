using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(Auth_CRUD_Application.Startup))]
namespace Auth_CRUD_Application
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
