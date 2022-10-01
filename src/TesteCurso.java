import java.util.List;

public class TesteCurso {
    
    public static void main(String[] args) {
        
        Cursos javaColecoes = new Cursos("Domininado as Colecoes do java", "Paulo silveira");


      //javaColecoes.getAulas().add(new Aula("trabalhando com array list", "21"));


       javaColecoes.adiciona(new Aula(      "Trabalhando com arrayList", 21)); 

       javaColecoes.adiciona(new Aula("Criando uma aula", 20));

       javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

       System.out.println(javaColecoes.getAulas());

   
    }
}
