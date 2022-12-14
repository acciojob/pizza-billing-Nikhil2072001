package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
private int extracheese;
private int extratopping;
private int bag;
private boolean ischeeseadded;
private boolean istoppingadded;
 boolean istakeaway;
 boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extracheese=80;
        this.bag=20;
        if(isVeg==true){
            this.price=300;
            this.extratopping=80;
        }else{
            this.price=400;
            this.extratopping=120;
        }
        this.ischeeseadded=false;
        this.istoppingadded=false;
        this.istakeaway=false;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(ischeeseadded==false){
            this.price+=this.extracheese;
            ischeeseadded=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingadded==false){
            this.price+=this.extratopping;
            istoppingadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeaway==false){
            this.price=this.price+this.bag;
            istakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isbillgenerated==false){
            if(ischeeseadded==true){
            this.bill+="Extra Cheese Added: "+this.extracheese+"\n";
            }
            if(istoppingadded==true){
                this.bill = this.bill+ "Extra Toppings Added: "+this.extratopping+"\n";
            }
            if(istakeaway==true){
                bill = bill + "Paperbag Added: "+this.bag+"\n";
            }
            isbillgenerated=true;
        }
        this.bill = this.bill + "Total Price: "+this.price+"\n";
        return this.bill;
    }
}

