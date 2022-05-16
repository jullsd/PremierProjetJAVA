package Supermarket;

public class Article {


    private String nom;
    private int qty;
    private double prix, reduction;




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public Article(String nom, int qty, double prix, double reduction) {
        this.nom = nom;
        this.qty = qty;
        this.prix = prix;
        this.reduction = reduction;
    }

    public double getPrixTotal() {return prix * qty ;
    }
    public double getPrixtotalreduction(){return  prix * qty * reduction;

    }

}





