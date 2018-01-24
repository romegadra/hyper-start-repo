package hyperion.com.training.basic;

/**
 * Created by ro on 1/22/2018.
 */
public class TrainingBasic {

	public String testRo() {
        return "Hey Ro!";
    }

    public static void main(String...args) {
    	TrainingBasic tb = new TrainingBasic();
    	tb.testTerminal();
        System.out.println(tb.testTerminal());
    }

    private String testTerminal() {
    	String s = "HolaMundo";
        System.out.println("Start here!!");
        return s;
    }

    private String modLuis() {
        String s = "Hola";
        return s;
    }
    private String nameDaniel()
    {
    	return "Daniel Nev";
    }

		private String metodoHiram(){
			String mensaje = "Ola ke ase, this  is my message and method";
			return mensaje;
		}
}
