using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Corrida.Enums;

namespace Corrida
{
    public class Dinam : Kart
    {
        public Dinam(Corredor corredor) : base(corredor)
        {
                
        }

        public override int Velocidade
        {
            get
            {
                if (corredor.Nivel == NivelHabilidade.Noob)// se o nive
                {
                    Velocidade += 6;
                }else
                if (corredor.Nivel == NivelHabilidade.Mediano)
                {
                    Velocidade += 10;
                }else
                if (corredor.Nivel == NivelHabilidade.Profissional)
                {
                    int velocidadePiloto = 6 + Equipamentos.Count;
                    Velocidade += (velocidadePiloto * 2);
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
