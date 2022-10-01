public class Busca {
    
    public static void main(String[] args) {
        
         
        Cursos javaColecoes = new Cursos("Domininado as Colecoes do java", "Paulo silveira");

  
         javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 21)); 

         javaColecoes.adiciona(new Aula("Criando uma aula", 20));
  
         javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

         Aluno a1 = new Aluno("davi", 1);
         Aluno a2  = new Aluno("rada", 4352);
         Aluno a3 = new Aluno("minos", 6);

         javaColecoes.matricula(a1);
         javaColecoes.matricula(a2);
         javaColecoes.matricula(a3);


         System.out.println("quem é o aluno com a matricula 4352 ? ");

         Aluno aluno= javaColecoes.buscaMatricula(4357);

         System.out.println("aluno: " + aluno );
    }
}
