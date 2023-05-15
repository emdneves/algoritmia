package Ficha_11.poo_fp11.poo_fp11_02;

import java.util.ArrayList;
//import java.util.List;


class Farm {
    /**
     * Atributos da classe Farm
     */
    private ArrayList<Animal> listaDeAnimais;


    /**
     * Construtor Farm que instancia um ArrayList
     */
    public Farm() {
        listaDeAnimais = new ArrayList<>();
    }


    public Farm(ArrayList<Animal> animais) {
        this.listaDeAnimais = listaDeAnimais;
    }


    /**
     * Adicionar animal
     *
     * @param animal
     */
    public void adicionarAnimal(Animal animal) {
        listaDeAnimais.add(animal);
    }

    /**
     * Método makeNoise que chama o método fazerBarulho para cada item do ArrayList
     */
    public void makeNoise() {
        for (Animal animal : listaDeAnimais) {
            animal.fazerBarulho();
        }
    }
}


