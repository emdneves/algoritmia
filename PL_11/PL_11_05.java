/* 5. (Parte 2) Considere que cada ingrediente de uma pizza é identificado pelo seu código, nome, unidade de medida (por exemplo: Gramas, Litros ou Unidades) e o número de calorias associadas. 
No entanto, é necessário que uma pizza possua (pelo menos) dois tipos de ingredientes:
    a. Base, que descreve o tipo de massa utilizada (Massa alta ou massa fina);
    b. Cobertura da pizza que engloba alguns tipos de ingredientes e os seus tipos:
        i. Queijo (Mozzarela, Serra, etc);
        ii. Carne (Porco, Vaca, Salame, etc);
        iii. Vegetal (Tomate, Cebola, Cogumelos, etc);
        iv. Frutos do mar(Camarão, Lagosta, etc).
    c. Como os clientes da pizzaria são muito exigentes em relações aos produtos que são utilizados para confecionar a pizza, 
    qualquer tipo de ingrediente que faça parte da cobertura da Pizza possui um atributo que permite identificar a sua origem (nacional ou importado).
    d. Implemente as alterações necessárias de modo que possa refletir no exercício anterior todos os requisitos apresentados. 
    Tenha por base o seguinte diagrama para o auxiliar na resolução do exercício:
    e. Realize as alterações necessárias para que a unidade de medida por defeito dos ingredientes do tipo PizzaBase seja obrigatoriamente gramas.
    f. Altere a classe PizzaDemo de forma a testar as alterações realizadas. Crie pelo menos um ingrediente de cada tipo.
    g. Na classe Pizza, adicione/altere métodos que permitam:
        i. Que apenas seja possível adicionar ingredientes do tipo Topping quando a pizza já possuir um ingrediente do tipo Base;
        ii. Não deverá ser possível ter mais do que um ingrediente do tipo Base;
        iii. No máximo, a pizza deverá possuir 5 ingredientes do tipo Topping ;
        iv. Defina um tipo da pizza tendo por base dos ingredientes que esta possui, considerando a seguinte classificação:
            1. Pizza de carne: Contém apenas ingredientes do tipo Meat.
            2. Pizza do mar: Apenas ingredientes do tipo Seadfood;
            3. Pizza vegetariana: Apenas ingredientes do tipo Vegetable;
    h. Teste as alterações na classe PizzaDemo. Crie um método para imprimir o conteúdo (todos os atributos) de todos os ingredientes de uma pizza. */

package PL_11;

public class PL_11_05 {
    
}
