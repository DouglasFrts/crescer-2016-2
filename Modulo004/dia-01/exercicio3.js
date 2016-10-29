find([1,3,2],function(elemento){
	return elemento >2;
});


function find(array, funcao){
	let resultado = [];
	
	if(typeof funcao === 'function'){
		for (let i=0; i<array.length;i++){
			let encontrou = funcao(array[i]);
			if(encontrou){
				resultado.push(array[i]);
			}
		}
	}
	return resultado;

}
