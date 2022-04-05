package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {
	//method from TestTool interface
	public void selenium() {
		System.out.println("Selenium in TestTool - Interface");
		
	}
	//method from Language interface
	public void java() {
		System.out.println("Java in Language - Interface");
		
	}
	//method from Multiple Language Abstract Class
	public void ruby() {
		System.out.println("Ruby in Multiple Language - Abstract Class");
		
	}
	
	public static void main(String[] args) {
		//create an object for child
		Automation automation = new Automation();
		//Call all the methods from both interface and abstract class
		automation.java();
		automation.selenium();
		automation.python();
		automation.ruby();

	}
	

}
