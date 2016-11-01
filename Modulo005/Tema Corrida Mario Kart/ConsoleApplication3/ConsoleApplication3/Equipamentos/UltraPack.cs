using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Corrida.Equipamentos
{
    class UltraPack : IEquipamento
    {

        public UltraPack(IEquipamento equipamento)
        {
            this.Equipamento = equipamento;
        }

        private IEquipamento Equipamento { get; }
        public int BonusVelocidade
        {
            get
            {
                int VelocidadeUltraPack = Equipamento.BonusVelocidade + (int)Math.Ceiling(Equipamento.BonusVelocidade * 0.2);
                return VelocidadeUltraPack;
            }
        }
    }
}
