using System;
using Corrida.Enums;
using Corrida;
using Corrida.Equipamentos;

using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace CorridaTests
{
    [TestClass]
    public class KartTests
    {
        [TestMethod]
        public void CriandoKartComVelocidadeX()
        {
            var corredor = new Corredor("Yoshi", NivelHabilidade.Noob);
            var kart = new Kart(corredor);
            kart.EquiparKart(new PneusDeCouroDeDragao());
            Assert.AreEqual(8, kart.Velocidade);
        }
    }
}
