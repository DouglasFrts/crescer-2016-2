using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Corrida.Enums;
using Corrida.Equipamentos;

namespace Corrida
{
    class SkyFusion : Kart, IEquipamento
    {
        public SkyFusion(Corredor corredor) : base(corredor)
        {

        }

        public int BonusVelocidade
        {
            
            
            get
            {
                int bonus = Equipamentos.Count;
               
                if(corredor.Nivel == NivelHabilidade.Noob)
                {
                    bonus++;
                }else if (corredor.Nivel == NivelHabilidade.Mediano)
                {
                    bonus += 2;
                }
                else if((corredor.Nivel == NivelHabilidade.Profissional))
                {
                    bonus += 3;
                }


                if (Velocidade > 12)
                {
                    bonus += 5;
                }

                return bonus;
            }
        }
    }
}
