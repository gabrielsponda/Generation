programa {
  funcao inicio() {
    inteiro vetor[10], aux

    // Preenche o vetor com 10 valores informados pelo usu�rio
    para (inteiro i = 0; i < 10; i++) {
      escreva("Informe o valor do �ndice ", i, ": ")
      leia(vetor[i])
    }

    escreva("\nElementos nos �ndices �mpares:")
    para (i = 0; i < 10; i++) {
      se (i % 2 != 0) {
        escreva(vetor[i], " ")
      }
    }

    escreva("\nElementos pares:")
    para (i = 0; i < 10; i++) {
      se (vetor[i] % 2 == 0) {
        escreva(vetor[i], " ")
      }
    }

    escreva("\nSoma:")
    inteiro soma = 0
    para (i = 0; i < 10; i++) {
      soma += vetor[i]
    }
    escreva(soma)

    escreva("\nM�dia:")
    real mean = soma/10
    escreva(mean, "\n")

  }
}
