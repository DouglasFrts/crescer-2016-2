using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace StreetFighter.web.Models
{
    public class CadastroModel
    {
        [DisplayName("URL da imagem")]
        public string Imagem { get; set; }

        [Required]
        public string Nome { get; set; }

        [Required]
        public DateTime Nascimento { get; set; }

        [Required]
        public int Altura { get; set; }

        [Required]
        public  decimal Peso { get; set; }

        [Required]
        public string Medidas { get; set; }

        [Required]
        public string Origem { get; set; }

        [Required]
        public string GolpesEspeciais { get; set; }

        [DisplayName("Personagem Oculto")]
        public bool PersonagemOculto { get; set; }
    }
}