using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Corrida.Equipamentos
{
    class FogueteDePlutonio : IEquipamento
    {
        public FogueteDePlutonio(int nivel)
        {
            this.Nivel = nivel;
        }
        private int Nivel { get; set; }

        public int BonusVelocidade
        {
            get
            {
                bool ehValido = Nivel >= 1 && Nivel <= 5;
                if (!ehValido)
                {
                    Nivel = 2;
                }
                return Nivel;
            }
        }
    }
}
