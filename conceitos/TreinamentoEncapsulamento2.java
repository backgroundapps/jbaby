// Aula de hoje encapsulamento
//exemplo online:  http://tpcg.io/TU27j1 
/**
 * Acessando atributos através dos métodos publicos
 * 
 * Como visto no exemplo anterior, não é possível de fora da classe acessar atributos privados. Logo, para que isso sejá possível (se necessário - pois em alguns casos o atributo so deve ser usado dentro da classe), temos que
 * criar um método publico dentro da classe. Onde, com isso esse método pode acessar as informações dos atributos.
 * 
 * Importante:
 * Conforme descrito acima, muitos acham que é uma regra criar atributos privados e um método publico para acessar cada um desses atributos, mas isso vai de acordo com a lógica do projeto.
 * 
 */
 

public class TreinamentoEncapsulamento2{

     public static void main(String []args){
        System.out.println("Encapsulamento - Métodos publicos e atributos privados;)");
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "jose"; //Caso queira testar descomente essa linha. Dará erro pois este atributo agora é private.
        pessoa.setNome("Amarildo");
        System.out.println("Nome do cara: " + pessoa.getNome());
        
        pessoa.setSobreNome("Biribinha");
        
        System.out.println("Nome completo: " + pessoa.getCompleteName());


     }
}

class Pessoa{
    
    //Neste exemplo, decidimos inserir todos os atributos como privados, para controlar como os objetos externos teram acesso a estes recursos.
    private String nome; 
    private String sobreNome;
    
    //Neste caso, para que qualquer objeto exterior precise recuperar o nome de pessoa. Terá que chamar o método "getPessoa()".
    //OBS: Existe um padrão para nome de método (que não é uma regra, mas assim fica mais claro para outros leitores do seu código). Este padrão quando um método recupera um valor usamos "get" + "<o valor que esta sendo recuperado>". Ex: getNome() - get = pois é um método que recupera algo; Nome = pois este método recupera o nome da pessoa. Outro padrão é a cada adição de palavra alterar para maiúsculo. getPessoa setPessoa abreConta fechaContaCorrente. em cada junção de palavra no nome do método a primeira letra da palavra é alterada para maiúscula.
    public String getNome() { //Funcionalidade desse método é retornar para classes externas o valor do nome
        
        //Esset "this." significa que o que vem depois pertence a pripria classe. this. significa a propria classe.
        //este recurso é para diminuir a confusão caso tenhamos um parametro externa com o nome de um atributo interno.
        return this.nome;
    }
    
     
    public void setNome(String nome) {//Este método é para setar [inserir ou alterar] o valor do nome da pessoa.
        //Este é um bom exemplo para ententer para que funciona o "this". o this.nome é referente ao atributo da classe em questão (ou seja, o atributo nome declarado no topo da classe). Já o sem "this" é referente ao parametro de entrada do método rs.
        this.nome = nome;
    }
    
    
    //Se você reparar neste case só tera o setSobreNome. Não teremos o getSobreNome como o exemplo para o nome, para poder exemplificar a manipulação dos atributos internos.
    public void setSobreNome(String sobreNome) {
        this.sobreNome = " " + sobreNome; //Dessa forma, posso manipular como o atributo será gravado. Neste caso incluimos ele com um espaço em branco na frente, para poder juntar com o nome sem ficar colado.
    }
    
    //Não foi criado o getSobreNome pois no nosso exemplo, returnar apenas o sobre nome nunca será necessário. Já o nome e  nome completo sim.
    public String getCompleteName() {
        return this.nome + this.sobreNome; //Aqui estou juntando diretamente o nome com o sobre-nome. Como anteriormente o sobre nome foi gravado com ums espaço na frente. Aqui podemos apenas junta-los
    }
    
    
    //Conclusão:
    /*
    Conforme visto nos exemplos anteriores. quando queremos ter total controle sobre os atributos de uma
    classe, declaramos esta como private e criamos um método que recebe o valor do usuário e grava da maneira
    que estiver de acordo com a lógica do projeto.
    */
}
