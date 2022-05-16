package Supermarket;

import java.util.ArrayList;
import java.util.List;


public class Panier {


     private  ArrayList<Article> articles ;





    public Panier() {
        this.articles = new ArrayList<>();

    }

    public List<Article> getArticles() {
        return articles;}

    public double valeurCadie(){


        double prixTotal=0;

        for(int x=0;x<articles.size();x++){

          Article a = articles.get(x);
          if(a.getPrixtotalreduction()==0) {
              prixTotal = prixTotal + a.getPrixTotal();
          }else {
              prixTotal = prixTotal + a.getPrixtotalreduction();
          }

          //prixTotal += a.getPrixTotal();(même chose)

        }
        return prixTotal;


        }

    }


