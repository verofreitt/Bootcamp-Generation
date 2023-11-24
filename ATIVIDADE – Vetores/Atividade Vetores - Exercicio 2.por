programa {
    funcao inicio() {
        inteiro vetor[10]
        inteiro i, soma, qtdPares
        real media

        para (i = 0; i < 10; i = i + 1) {
            escreva("Digite o ", i + 1, "º número: ")
            leia(vetor[i])
        }

        escreva("Elementos nos índices ímpares:\n")
        para (i = 1; i < 10; i = i + 2) {
            escreva(vetor[i], " ")
        }
        escreva("\n\n")

        escreva("Elementos pares:\n")
        para (i = 0; i < 10; i = i + 1) {
            se (vetor[i] % 2 == 0) {
                escreva(vetor[i], " ")
            }
        }
        escreva("\n\n")

        soma = 0
        para (i = 0; i < 10; i = i + 1) {
            soma = soma + vetor[i]
        }

        media = soma / 10.0

        escreva("Soma: ", soma, "\n")
        escreva("Média: ", media, "\n")
    }
}

