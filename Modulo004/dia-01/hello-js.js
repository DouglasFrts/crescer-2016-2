console.log('olá JS');

var elfo = {nome: 'Legolas', experiencia: 1};
console.log("Nome: ", elfo.nome);

elfo.flechas = 42;
console.log(elfo.flechas);

delete elfo.nome;
console.log(elfo);

elfo["Nome Completo"] = "Legolas da Silva";

elfo.atirarFlecha = function(dwarf){
  dwarf.vida-=10;
  elfo.experiencia++;
};
var dwarf = {vida: 110};
elfo.atirarFlecha(dwarf);

console.log(elfo, dwarf);

elfo.nome = "Fingolfin";
exibirElfoNaTela(elfo);
