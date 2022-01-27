/**
 * Sintaxe kt:
 *
 *     Declaração de variáveis: var, val e const val;
 *
 */

// const val só pode ser declarada em global scope;
const val SNAKE_CASE_HERE:String = "Test";         // Escopo global;
const val SNAKE_INT:Byte         = 15;             // Escopo global;

fun main(args: Array<String>) {
    println("Hello World!");
    // Try adding program arguments via Run/Debug configuration.
    println("Program arguments: ${args.joinToString()}");

    // Declaração da variável:
    var name:String?; // Null só é permitido pelo sinal ? no type;
    val sobrenome:String = "Tank";
    // Atribuição de valor:
    name = null;
    name = "Samuel";
    // Amostragem de valor:
    println(name + " " + sobrenome); // or :
    println("${name} ${sobrenome}");

    // Invocação de funções:
    calc();
    tester();
    notaTester();
    clientOpc();
    calcularTabuada(1,100,17, 3);
}

const val NOTA_CORTE: Int = 5; // Escopo global;

fun calc() {
    val a:Byte = 14;
    val b:Byte = 7;
    val numbers = 1..5;

    println(a % b);
    println(a.plus(b));
    println(a.minus(b));
    println(a.div(b));
    println(a.mod(b));
    println(a.compareTo(b));
    println(a.equals(b));
    println(25 in numbers);
}

fun tester() {
    val fName: String = "  ";
    val lName: String = "Souza";
    println(fName.isBlank());
    println(lName.isBlank());
}

fun notaTester() {
    val nota: Int = 8;
    val name: String = "Um cara ae";


    when {
        nota < NOTA_CORTE -> println("Reprovado");
        else -> println("Aprovado");
    }
}

fun clientOpc() {
    val client: String = "Samuel";
    val opt: Int = 1;
    val numbers = 1..25;
    when {
        opt == 1 -> println("Cadastrar Cliente");
        opt == 2 -> println("Deletar Cliente");
        else     -> println("Opção incorreta");
    }

    for (i in 0 until 15) {
        print(i.toString() + "-");
    }

    println("");

    for (i in 15 downTo 5){
        print(i);
    }

    println("");

    for (i in 0 until 10 step 2) {
        print(i);
    }

    println("");

    for (i in client) {
        print(i);
    }
}

// exercícios:

fun calcularTabuada(start: Int, end: Int, nubTab: Int, impPar: Int) {
    println("");
    val inicio: Int = start;
    val fim:    Int = end;
    val tabNum: Int = nubTab;
    val imparPar: Int = impPar;

    if (imparPar % 2 == 0) {
        for (i in start-1..end step 2) {
            println("${tabNum} * ${i} = ${tabNum * i}");
        }
    } else {
        for (i in start..end step 2) {
            println("${tabNum} * ${i} = ${tabNum * i}");
        }
    }
 }
