﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.web.Models
{
    public class FichaTecnicaModel
    {
        public string Imagem { get; set; }
        public string Nome { get; set; }
        public DateTime Nascimento { get; set; }
        public int Altura { get; set; }
        public int Peso { get; set; }
        public string Medidas { get; set; }
        public string Origem { get; set; }
        public string GolpesEspeciais { get; set; }
        public bool PersonagemOculto { get; set; }

    }
}