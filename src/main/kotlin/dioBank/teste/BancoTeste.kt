package dioBank.teste

import dioBank.Banco

fun main() {
    val dOneBank = Banco("FVBank", 12)
/*se ao instanciarmos colocarmos o nome da variavel a qual vamos atribuir o valores instanciados
* nao precisamos nos atentar para a ordem dos argumento, ex: se colocassemos numero = 12 podiamos colocar ele como primeiro
* argumento pois estamos especificando*/

    println(dOneBank.nome)
    println(dOneBank.numero)

    val banco2 = dOneBank.copy(nome = "BancoFV2")
    /*vc ta jogando pro banco2 a copia do dOneBank como argumento o atributo a ser mudado*/

    println(banco2.info())
}