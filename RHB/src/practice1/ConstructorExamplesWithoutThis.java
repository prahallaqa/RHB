package practice1;


class Person {
	String name;
	int age;

	// ----------------------
	// **1. Default Constructor**
	// ----------------------
	public Person() {
		name = "Unknown";
		age = 0;
		System.out.println("Default constructor called");
	}

	// ----------------------
	// **2. Parameterized Constructor**
	// ----------------------
	public Person(String n, int a) {
		name = n; // Direct assignment without 'this'
		age = a;
		System.out.println("Parameterized constructor called");
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

// ----------------------
// **3. Constructor Overloading**
// ----------------------
class Employee {
	String name;
	int id;

	public Employee() {
		name = "Unknown";
		id = 0;
		System.out.println("Default constructor called");
	}

	public Employee(String n) {
		name = n;
		id = 0;
		System.out.println("Constructor with one parameter called");
	}

	public Employee(String n, int i) {
		name = n;
		id = i;
		System.out.println("Constructor with two parameters called");
	}

	public void display() {
		System.out.println("Name: " + name + ", ID: " + id);
	}
}

// ----------------------
// **4. Copy Constructor**
// ----------------------
class Book {
	String title;
	String author;

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	// **Copy constructor without using 'this'**
	public Book(Book b) {
		title = b.title;
		author = b.author;
		System.out.println("Copy constructor called");
	}

	public void display() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

// ----------------------
// **Main Class to Run Examples**
// ----------------------
public class ConstructorExamplesWithoutThis {
	public static void main(String[] args) {
		System.out.println("=== Default and Parameterized Constructors ===");
		Person person1 = new Person(); // Default constructor
		Person person2 = new Person("Alice", 25); // Parameterized constructor

		person1.display();
		person2.display();

		System.out.println("\n=== Constructor Overloading ===");
		Employee e1 = new Employee(); // Default
		Employee e2 = new Employee("Bob"); // One parameter
		Employee e3 = new Employee("Charlie", 101);// Two parameters

		e1.display();
		e2.display();
		e3.display();

		System.out.println("\n=== Copy Constructor ===");
		Book book1 = new Book("Java Basics", "John Doe");
		Book book2 = new Book(book1); // Copy constructor called

		book1.display();
		book2.display();
	}
}
