using Loja.Dominio;
using Loja.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    class ProdutoRepositorio : IProdutoRepositorio
    {
        public Produto BuscarPorNome(string nome)
        {
            using (var context = new ContextoDeDados())
            {
                return context.Produto.FirstOrDefault(p => p.Nome.Equals(nome));
            }
        }
    }

    //public IList<Produto> ListarProdutos(string nome)
    //{
    //    using (var context = new ContextoDeDados())
    //    {
    //        IQueryable<Produto> query = context.Produto.Where(p => p.Nome.Contains(name));

    //        return query.ToList();
    //    }
    //}
}
