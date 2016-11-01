using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.web.Models
{
    public class SobreModel
    {
        public string PrimeiraAparicao { get; set; }
        public DateTime Nascimento { get; set; }
        public int Altura { get; set; }
        public int Peso { get; set; }
        public string Medidas { get; set; }
        public string TipoSanguineo { get; set; }
        public string HabilidadesEspeciais { get; set; }
        public string Gosta { get; set; }
        public string Desgosta { get; set; }
        public string EstiloDeLuta { get; set; }
        public string Origem { get; set; }
        public string FalaDeVitoria { get; set; }
        public string GolpesEspeciaisFamosos { get; set; }
    }
}