package gradle.csw.proyecto;

public class HolaMundo {

	public String sayHola() {
		return "Hola Mundo";
	}
	
	public static void main(String[] args) {
		HolaMundo app = new HolaMundo();
		System.out.println(app.sayHola());
	}

}
