// Aula de hoje encapsulamento
// Documentation: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
// Exemplo para executar online:  http://tpcg.io/Twer4x

/**
 *   Para que serve? = Criar modos diferentes de visualização dos componentes/objetos dentro do sistema de
 *   acordo com a situação/contexto
 * 
 *   1. Temos 4 tipos public, private, protected e default (não escrevemos)
 *   1.1. public - Tudo que for criado como public pode ser acessado por todos os objetos/classes de outras
 *   classes do projeto.
 *   1.2. private - Apenas os componentes dentro da classe que possui o elemento privado pode ter acesso a este
 *   1.3. protected - Apenas os elementos da propria classe e da classe filha podem ter acesso. OBS: Veremos
 *   com mais detalhes no exemplo de heranças de classes
 *   1.4. default - caso a classe não tenha nenhuma definição explicita, ela ter visualização default, ou seja
 *   só poderá ser acessada por objetos/classes de dentro do mesmo pacote. OBS: Veremos em detalhes no exemplo
 *   de "package" 
 * 
 * 
 */
 

//Esta é a classe referente ao arquivo TreinamentoEncapsulamento.java. Repare que o nome é o mesmo. Ao
//contrário da classe Pessoa.
public class TreinamentoEncapsulamento1{

     public static void main(String []args){
        System.out.println("Encapsulamento ;)");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "jose"; //podemos atribuir valor por se tratar de um atributo "public"
        System.out.println("Nome: " + pessoa.nome); //podemos ler tambem por ser "public"
        
        //OBS: Se tentarmos atribuir ou ler valor ao atributo "sobreNome" será relatado um erro de compilação
        //Segue abaixo exemplo: descomente para ver o erro de acesso
        //pessoa.sobreNome = "Silva";
        //System.out.println("Sobre nome: " + pessoa.sobreNome);

     }
}

class Pessoa{
    
    // Este atributo está publico para efetudo de treinamento. Geralmente os atributos de uma classe são 
    // privados e seus acessos são feitos apartir de métodos publicos. Será visto nos proximos exemplos
    public String nome; 
    private String sobreNome;
}
