package Supermarket;


public class Article {


    public String nom;
    public int qty;
    public double prix, reduction;


    public double getPrixTotal() {
        return prix * qty;
    }

    public double getPrixTotalAvecReduc() {
        return getPrixTotal() * reduction;
    }
}




