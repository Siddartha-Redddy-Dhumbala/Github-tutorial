
import java.io.*;

class Bhanu {

	public void identity(String name, int id) {

		System.out.println("Name :" + name + " " + "Id :" + id);
	}

	public void identity(int id, String name) {

		System.out.println("Id :" + id + " " + "Name :" + name);
	}
}

class GFC {
	public static void main(String[] args) {

		Bhanu bt = new Bhanu();

		bt.identity("Bhanu", 1);
		bt.identity("Teja", 2);
	}
}