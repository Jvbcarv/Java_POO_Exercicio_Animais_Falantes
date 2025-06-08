package uninter;

//Classe principal: Esse é o ponto de entrada da aplicação. Ao rodar o programa, o Java começa a execução por aqui.
public class Zoologico {

	public static void main(String[] args) {

		Animal[] animais = new Animal[3]; //Criei um array de 3 posições que aceita objetos do tipo Animal.

        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        System.out.println("Som dos animais do zoologico:");
        for (Animal animal : animais) {
            animal.fazerSom(); // Polimorfismo: Quando o método animal.fazerSom() é chamado, o Java descobre automaticamente qual versão do método deve ser executada, baseado no tipo real do objeto.
        }
	}

}
