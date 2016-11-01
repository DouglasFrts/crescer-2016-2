function diglettDig(){
	var numeros=[];
	for(i=1; i<=100; i++){
		numeros[i] = i;
		if(i%3===0 && i===0){
			numeros[i-1]= 'Diglett dig';
		}
		if(i%5 ===0 && i%3!=0){
			numeros[i-1] =  'trio trio trio';
		}
		if(i%5 ===0 && i%3===0){
			numeros[i-1] =  'Diglett dig, trio trio trio';
		}
	}
	
	console.log(numeros);
}
