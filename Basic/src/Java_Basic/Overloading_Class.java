package Java_Basic;

public class Overloading_Class {

	public static void main(String[] args) {
    	Demo_Overloading a = new Demo_Overloading(40);
    }

}

class Demo_Overloading {
	Demo_Overloading(){
        System.out.println("Hello Laks");
    }
	Demo_Overloading(int x){
        this();
        System.out.println(x);
    }
}

