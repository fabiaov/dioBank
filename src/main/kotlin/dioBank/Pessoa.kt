package dioBank

class Pessoa {
    var nome = "Fabio Vinicius"
    var cpf = "123.123.123-11"
    private set // nesse caso os metodos set são private

    constructor()// construtor secundario
//    inner class Endereco {
//        var rua: String = "Rua teste"
//    }
//    inner class é uma classe interna
    /*nesse caso vc usa a inner class pra integrar a uma API por exemplo deve ser usada com discernimento*/
    /*private deixa a propriedade visivel e passivel de alteração somente dentro do escopo da classe */

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val fabio = Pessoa()
//    println(fabio.nome)
//    println(fabio.cpf)
    println(fabio.pessoaInfo())

//    println(fabio.Endereco().rua)
}