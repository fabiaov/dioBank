package dioBank

import java.math.BigDecimal

class Conta(val agencia: String,
            val numero: String,
            val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal) {

    }

    fun saque(valor: BigDecimal) {

    }

    /*Conceito principal de Data Class armazenar dados q uma vez inicializado não podemos mais muda-lo, um estado imutavel
    * em que eu não possa mudar ao longo da aplicação */

}