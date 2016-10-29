function gerarPiramide(nivel){
	var piramide=[];
	for(i=0; i<nivel;i++){
		piramide[i]='';
	}
	for(i=0; i<=nivel;i++){
		for(j=i;j<=nivel;j++){
			piramide[j]+= 'R$';
		}
  }
console.log(piramide);
}

function gerarPiramide2(niveis){
	for(var i=1; i<=niveis;i++){
		Array(i+1).join("R$");
	}	
	console.log(Array);
}
