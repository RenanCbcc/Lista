package double_list;
import data.Car;

public class DoublyLinkedApp {
  private static DoublyLinkedList<Car> list;
  
  public static void main(String[] args){
    list = new DoublyLinkedList<Car>();
   
    list.insertFirst(new Car("Demon", 100000));
	list.insertFirst(new Car("Apollo", 100000));
	list.insertFirst(new Car("Blackhawk", 106000));

	list.insertLast(new Car("Mirage", 180000));
	list.insertLast(new Car("Conquest", 280000));
	list.insertLast(new Car("Ranger", 345000));
	
  }
}
