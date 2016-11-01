using StreetFighter.web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.web.Controllers
{
    public class StreetFighterController : Controller
    {
        // GET: StreetFighter
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult FichaTecnica()
        {
            var model = new FichaTecnicaModel();

            model.PrimeiraAparicao = "Street Fighter II The World Warrior (1991)";
            model.Nascimento = Convert.ToDateTime("12/02/1966");
            model.Altura = 192;
            model.Peso = 96;
            model.Medidas = "B198, C120, Q172.";
            model.TipoSanguineo = "B.";
            model.HabilidadesEspeciais = "Caçar, Eletricidade.";
            model.Gosta = "Frutas tropicais, Pirarucu, Sua mãe.";
            model.Desgosta = "Army ants (espécie de formiga).";
            model.EstiloDeLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira.";
            model.Origem = "Brasil (lugar de nascença é provável como sendo Tailândia).";
            model.FalaDeVitoria = "Ver você em ação é uma piada!";
            model.SSF2Nickname = "A selvagem criança da natureza";
            model.SFA3Nickname = "A animal pessoa amazônica";
            model.SF4Nickname = "Guerreiro da selva";
            model.SFA3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?).";
            model.SF2Stage = "Bacia do rio Amazonas (Brasil).";
            model.GolpesEspeciaisFamosos = "Electric Thunder, Rolling Attack.";

            return View(model);
        }

        public ActionResult Sobre()
        {
            var model = new SobreModel();

            model.PrimeiraAparicao = "Hospital Santa Casa de Misericordia - Porto Alegre (1991)";
            model.Nascimento = Convert.ToDateTime("02/02/1991");
            model.Altura = 170;
            model.Peso = 74;
            model.Medidas = "B198, C120, Q172.";
            model.TipoSanguineo = "O+";
            model.HabilidadesEspeciais = "Comer, Dormir.";
            model.Gosta = "Lasanha, torta de bolacha, jogar futebol, Internacional";
            model.Desgosta = "Sei lá!";
            model.EstiloDeLuta = "Nenhum, sou deboista, pra que tretas?";
            model.Origem = "PortoAlegre";
            model.FalaDeVitoria = "Eu falei que ia dar certo!!!";
            model.GolpesEspeciaisFamosos = " ";

            return View(model);
        }
    }
}