package uninter;

//Subclasse
public class Cachorro  extends Animal{

	// Quando a classe filha (subclasse) precisa de um comportamento diferente do método genérico que herdou da classe mãe (superclasse), é utilizada a anotação @Override para sobrescrever esse método.
	
	 @Override
	    public void fazerSom() {
	        System.out.println("O cachorro late: Au au!");
	    }
	
}
