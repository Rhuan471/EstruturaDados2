40, 20, 60, 10, 30, 25

adicionar(valor) {
	raiz = adicionar(valor, raiz, null)
}

// 
adicionar(valor, noAtual, noPai) {
	se (noAtual == null) {
		No novoNo = new No(valor)
		novoNo.pai = noPai
		return novoNo
	}

	se (valor > noAtual.valor) {

	}

	se (valor < noAtual.valor){
		No novoNo = adicionar(valor, noAtual.filhoEsquerdo, noAtual)

		noAtual.filhoEsquerdo = novoNo
		noAtual.calcularAltura()
	}

	return balancear(noAtual, valor)
}

// No(40), 25
balancear(noAtual, valor) {
	int fatorBalanceamento = noAtual.calcularFatorBalanceamento()

	se (fatorBalanceamento > 1) {
		
	}
	se (fatorBalanceamento < -1) {

	}

	return noAtual
}

rotacaoDireita(noDesbalanceado) { // 30
	No filhoEsquerdo = noDesbalanceado.filhoEsquerdo // 20

	filhoEsquerdo.pai = noDesbalanceado.pai
	noDesbalanceado.pai = filhoEsquerdo

	filhoEsquerdo.filhoDireito.pai = noDesbalanceado
	noDesbalanceado.filhoEsquerdo = filhoEsquerdo.filhoDireito

	filhoEsquerdo.filhoDireito = noDesbalanceado
}

// na classe No
calcularAltura() {
	altura = 1 + Math.max(filhoEsquerdo.altura, filhoDireito.altura)
}

calcularFatorBalanceamento() {
	return filhoEsquerdo.altura - filhoDireito.altura
}

