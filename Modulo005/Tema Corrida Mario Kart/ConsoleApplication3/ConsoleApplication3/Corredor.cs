﻿using Corrida.Enums;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Corrida
{
    public class Corredor
    {
        
        public Corredor(String nome, NivelHabilidade nivel){
           this.Nome = nome;
           this.Nivel = nivel;
            
        }

        private String Nome{ get; }

        public  NivelHabilidade Nivel;

    }
}
