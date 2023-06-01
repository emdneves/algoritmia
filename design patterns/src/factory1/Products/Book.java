package factory1.Products;

import factory1.*;

public class Book extends Product {
    @Override
    public void display() {
        System.out.println("Este é um livro.");
    }
}