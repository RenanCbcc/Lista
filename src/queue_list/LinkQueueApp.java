package queue_list;

import data.Car;

public class LinkQueueApp {
	
	public static void main(String[] args){
		
		LinkQueue<Car> queue = new LinkQueue<Car>();
		
		queue.insert(new Car("Demon", 100000));
		queue.insert(new Car("Apollo", 100000));
		queue.insert(new Car("Blackhawk", 106000));

		queue.displayQueue();
		
		queue.insert(new Car("Mirage", 180000));
		queue.insert(new Car("Conquest", 280000));
		queue.insert(new Car("Ranger", 345000));
		
		queue.displayQueue();
		
		System.out.println(queue.remove()+ " removed");
		System.out.println(queue.remove()+ " removed");
		
		queue.displayQueue();
	}
}
