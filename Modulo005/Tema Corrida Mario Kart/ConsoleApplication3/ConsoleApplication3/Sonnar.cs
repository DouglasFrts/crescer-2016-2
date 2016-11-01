using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Corrida.Enums;

namespace Corrida
{
    class Sonnar : Kart
    {
        public Sonnar(Corredor corredor) : base(corredor)
        {

        }

        public override int Velocidade
        {
            get
            {
                int quantidadeEquipamentos = Equipamentos.Count;
                if(quantidadeEquipamentos>0)
                {
                    Velocidade += 2;
                }
                return Velocidade;
            }

            protected set
            {
                base.Velocidade = value;
            }
        }
    }
}
