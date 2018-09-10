package example.create;

import java.util.LinkedList;

import io.reactivex.Observable;

public class CreatebyIterable {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("mango");

		Observable.fromIterable(fruits).subscribe(data -> System.out.print(data + " "));

		LinkedList<Person> people = new LinkedList<>();
		people.add(new Person("a", 10));
		people.add(new Person("b", 12));
		people.add(new Person("c", 13));
		people.add(new Person("d", 15));
		people.add(new Person("e", 18));

		Observable.fromIterable(people).subscribe(System.out::println);

	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}