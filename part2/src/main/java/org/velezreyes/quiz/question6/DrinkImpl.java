package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{
    private String name;
    private boolean fizzyness;
    private Double price;

    private DrinkImpl(String name){
        this.name = name;
        switch (name) {
            case "ScottCola":
                this.fizzyness = true;
                this.price = 0.75; 
                break;

            case "KarenTea":
                this.fizzyness = false;
                this.price = 1.00; 
                break;
        
            default:
                this.name = "UnknownDrink";
                break;
        }
    }

    public static DrinkImpl getDrinkInstance(String name){
        return new DrinkImpl(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFizzy() {
        return this.fizzyness;
    }

    public double getPrice(){
        return this.price;
    }
    
}
