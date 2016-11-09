using Loja.Dominio;
using Loja.Infraestrutura;
using Loja.Repositorio;
using Loja.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Loja.Web.Servicos
{
    public class ServicoDeDependencias
    {

        private const string USUARIO_LOGADO_CHAVE = "USUARIO_LOGADO_CHAVE";

        public static UsuarioServico MontarUsuarioServico()
        {
            UsuarioServico usuarioServico =
                new UsuarioServico(
                    new UsuarioRepositorio(), 
                    new ServicoDeCriptografia());

            return usuarioServico;
        }
        public static void Autenticar(UsuarioLogadoModel model)
        {
            HttpContext.Current.Session[USUARIO_LOGADO_CHAVE] = model;
        }

        public static UsuarioLogadoModel UsuarioLogado
        {
            get
            {
                return (UsuarioLogadoModel)HttpContext.Current.Session[USUARIO_LOGADO_CHAVE];
            }
        }
    }
}