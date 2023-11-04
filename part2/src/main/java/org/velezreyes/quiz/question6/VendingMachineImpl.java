package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{
  
  public Double balance = 0.00;

  public static VendingMachine getInstance() {  
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    this.balance += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    DrinkImpl desiredDrink = DrinkImpl.getDrinkInstance(name);

    if (desiredDrink.getName() == "UnknownDrink"){
      throw new UnknownDrinkException();
    }
    else if (this.balance < desiredDrink.getPrice()){
      throw new NotEnoughMoneyException();
    }

    this.balance -= desiredDrink.getPrice();

    return desiredDrink;
  }
}
