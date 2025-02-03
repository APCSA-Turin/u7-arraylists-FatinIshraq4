import java.util.ArrayList;

public class UsedCarLot {
    
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {return inventory;}

    public void addCar(Car car) {inventory.add(car);}

    public boolean swap(int idx1, int idx2) {
        if(idx1>=0 && idx2>=0 && idx1<inventory.size() && idx2<inventory.size()) {
            Car c1 = inventory.get(idx1);
            Car c2 = inventory.get(idx2);
            inventory.set(idx1, c2);
            inventory.set(idx2, c1);
            return true; 
        } else {return false;}
    }


  public void addCar(int indexToAdd, Car carToAdd) {
    inventory.add(indexToAdd, carToAdd);
  }


  public Car sellCarShift(int indexOfCarToSell) {
    Car sold = inventory.remove(indexOfCarToSell);
    return sold;
  }


  public Car sellCarNoShift(int indexOfCarToSell) {
    Car sold = inventory.get(indexOfCarToSell);
    inventory.set(indexOfCarToSell, null);
    return sold;
  }


  public void moveCar(int indexOfCarToMove, int destinationIndex) {
    Car move = inventory.remove(indexOfCarToMove);
    inventory.add(destinationIndex, move);
  }


}
