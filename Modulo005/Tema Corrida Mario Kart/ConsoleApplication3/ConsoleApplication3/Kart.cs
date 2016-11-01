using Corrida.Equipamentos;
using Corrida.Enums;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Corrida
{
    public abstract class Kart
    {
        public Kart(Corredor corredor)
        {
            this.corredor = corredor;
            this.Equipamentos = new List<IEquipamento>();
        }

        protected Corredor corredor { get; set; }
        protected List<IEquipamento> Equipamentos { get; set; }
        private int velocidade = 3;
        
        public virtual int Velocidade
        {
            get
            {
                int velocidadePiloto = (int)corredor.Nivel;
                bool ehProfissional = corredor.Nivel == NivelHabilidade.Profissional;
                if (ehProfissional)
                {
                    velocidadePiloto += Equipamentos.Count;
                }
                int bonusDosEquipamentos = 0;

                foreach (IEquipamento equipamento in this.Equipamentos)
                {
                    bonusDosEquipamentos += equipamento.BonusVelocidade;
                }

                return this.velocidade + bonusDosEquipamentos + velocidadePiloto;
            }

            protected set
            {
                this.velocidade = value;
            }
        }
        public void EquiparKart(IEquipamento equipamento)
        {
            this.Equipamentos.Add(equipamento);
        }
    }
}
