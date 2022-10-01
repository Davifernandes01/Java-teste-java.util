public class Aluno {
    
    private String nome;
    private int numeroMatricula;


    public Aluno(String nome, int numeroMatricula){

        if(nome.isEmpty()){
            throw new NullPointerException(" nome nao pode ser nulo!");
        }
        this.nome =nome;
        if(numeroMatricula ==0 ){
            throw new NullPointerException(" numero da matricula  nao pode ser nulo!");
        }
        this.numeroMatricula = numeroMatricula;
    }

    
    public String getNome() {
        return nome;
    }

   
            public int getNumeroMatricula() {
                return numeroMatricula;
            }
        
    @Override
    public String toString() {
        
        return "Aluno: " + this.nome + " ,matricula: " + this.numeroMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        
        Aluno outro = (Aluno) obj;


        return this.nome.equals((outro.nome));
    }

    @Override
    public int hashCode() {
        
        return this.nome.hashCode();
    }
        

}
