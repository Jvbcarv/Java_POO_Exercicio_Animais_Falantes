package uninter;

//Superclasse/classe mãe: fornece comportamentos e atributos básicos para outras classes (as subclasses) herdarem 
public class Animal {

	public void fazerSom() {  // método fazerSom() como um comportamento genérico. Todas as outras classes vão herdar esse método.
        System.out.println("O animal faz um som.");
    }
	
}
