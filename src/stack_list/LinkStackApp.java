package stack_list;

import data.Car;

public class LinkStackApp {

	public static void main(String[] args) {
		LinkStack<Car> stack = new LinkStack<Car>();

		stack.push(new Car("Demon", 100000));
		stack.push(new Car("Apollo", 100000));

		stack.displayStack();

		stack.push(new Car("Blackhawk", 106000));
		stack.push(new Car("Mirage", 180000));

		stack.displayStack();

		System.out.println(stack.pop() + " withdrawn");
		System.out.println(stack.pop() + " withdrawn");

		stack.displayStack();

	}
}
