using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Corrida.Enums;

namespace Corrida
{
    public class Light : Kart
    {
        public Light(Corredor corredor) : base(corredor)
        {

        }

        public override int Velocidade
        {
            get
            {
                if (corredor.Nivel == NivelHabilidade.Noob)// se o nive
                {
                    Velocidade += 6;
                }

                if (corredor.Nivel == NivelHabilidade.Profissional)
                {
                    int velocidadePiloto = 6 + Equipamentos.Count;
                     Velocidade += velocidadePiloto - 1;
                }

                return Velocidade
            }

            protected set
            {
                base.Velocidade = value;
            }
        }
    }
}
