var elfo = {nome: 'Legolas', experiencia: 1};
function exibirElfoNaTela(elfo){

  alert(maiusculo(elfo.nome));

  if(elfo === undefined){
    var minusculo = elfo.nome.toLowerCase();
  }
  minusculo+='oi';
  function maiusculo(texto){
    return texto.toUpperCase();
  }


}
