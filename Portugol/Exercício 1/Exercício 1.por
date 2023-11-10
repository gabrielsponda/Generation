programa {
  funcao inicio() {
    inteiro vetor[10], aux

    // Preenche o vetor com 10 valores informados pelo usuário
    para (inteiro i = 0; i < 10; i++) {
      escreva("Informe o valor da posição ", i+1, ": ")
      leia(vetor[i])
    }

    // Aplica o algoritmo de ordenação Bubble Sort
    para (i = 0; i < 9; i++) {
      para (inteiro j = 0; j < 9 - i; j++) {
        se (vetor[j] < vetor[j + 1]) {
          // Troca os elementos se estiverem fora de ordem
          aux = vetor[j]
          vetor[j] = vetor[j + 1]
          vetor[j + 1] = aux
        }
      }
    }

    // Imprime o vetor ordenado
    escreva("\nResultado: ", vetor, "\n")
  }
}