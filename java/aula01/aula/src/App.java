class Simple {

    int data = 50; //variável global

    static int est = 100; //variável estática

    void metodo() {
        int n = 90; //Variável local
    }
    public static void main(String args[]) {
        //Para testar calculos
        int a = 130;
        int b = 20;
        //testando tipos diferentes
        //Ao tentar somar int + float irá retornar um erro de conversão
        float c = 5;
        int c2 = (int) c;
        //Ainda não entendo byte
        byte d = (byte) a;
        int soma = a + b;
        System.out.println(a);
        //Retorna um número com ponto, diferente dos inteiros
        //Também irei tentar a forma certa de conversão
        System.out.println(c);
        System.out.println(c2);
        System.out.println(d);
        //soma
        System.out.println("Iai, mundão! soma:" + soma);
    }
} //Fim da classe

//class - palavra reservada que é usada para declarar uma classe em java
//public  Modificador de acesso que representa visibilidade.
//static - Método estático. Não é necessário criar um objeto para invocar um método estático.
//void - é um tipo de retorno de método. Significa que não retorna nenhum valor.
//main - Representa  ponto de início de um programa.
//String args[] - Usado para argumento de linha de comando.
//out.println() - é usado para imprimir declarações 

//TIPOS DE DADOS
//byte - 
