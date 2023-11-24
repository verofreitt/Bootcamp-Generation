programa {
  funcao inicio() {
    inteiro numero[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
    inteiro n, i, j, temp

    n=10

    para (i = 0; i <= n - 2; i = i + 1) {
        para (j = 0; j <= n - 2; j = j + 1) {
            se (numero[j] < numero[j + 1]) {
                temp = numero[j]
                numero[j] = numero[j + 1]
                numero[j + 1] = temp
            }
        }
    }
    escreva(numero)
  }
}
