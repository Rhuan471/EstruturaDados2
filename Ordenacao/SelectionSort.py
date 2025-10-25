vetor = [25,20,22,11,8,18]
selectionaux = 0

print(vetor)
for selectionaux in range (0, len(vetor) - 1):
    auxindice = selectionaux + 1
    menorindice = selectionaux

    while auxindice < len(vetor):
        if vetor[auxindice] < vetor[menorindice]:
            menorindice = auxindice
        auxindice = auxindice+1
    
    valoraux = vetor[selectionaux]
    vetor [selectionaux] = vetor [menorindice]
    vetor [menorindice] = valoraux

    print(vetor)

print(vetor)

