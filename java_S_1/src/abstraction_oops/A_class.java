package abstraction_oops;

public abstract class A_class extends B_class {

	public abstract void Login();

	public abstract void Credentials();

	public void failed() {
		System.out.println("check failed account ");
	}
	public static void passed() {
		System.out.println("check passed details");
	}
	public A_class(int a, int b) {
		System.out.println("parameterized constructor from parent calss A");
	}

	public static void main(String[] args) {

	}

}
