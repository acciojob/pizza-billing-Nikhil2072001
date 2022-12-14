package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
private int extracheese;
private int extratopping;
private int bag;
boolean ischeeseadded;
 boolean istoppingadded;
 boolean istakeaway;
 boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extracheese=80;
        this.bag=20;
        if(isVeg){
            this.price=300;
            this.extratopping=70;
        }else{
            this.price=400;
            this.extratopping=120;
        }
        this.ischeeseadded=false;
        this.istoppingadded=false;
        this.istakeaway=false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!ischeeseadded){
            this.price+=this.extracheese;
            ischeeseadded=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingadded){
            this.price+=this.extratopping;
            istoppingadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakeaway){
            this.price=this.price+this.bag;
            istakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated){
            if(ischeeseadded){
            this.bill+="Extra Cheese Added: "+this.extracheese+"\n";
            }
            if(istoppingadded){
                this.bill = this.bill+ "Extra Toppings Added: "+this.extratopping+"\n";
            }
            if(istakeaway){
                bill = bill + "Paperbag Added: "+this.bag+"\n";
            }
            this.bill = this.bill + "Total Price: "+this.price+"\n";
            isbillgenerated=true;
        }

        return this.bill;
    }
}

