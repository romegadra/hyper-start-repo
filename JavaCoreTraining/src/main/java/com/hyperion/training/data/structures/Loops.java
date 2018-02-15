package com.hyperion.training.data.structures;

public class Loops {

	public Loops() {
		
	}
	
	public void printYes() {
		System.out.println("Yes");
	}
	public void printNo() {
		System.out.println("No");
	}
	public void printMaybe() {
		System.out.println("Maybe");
	}
	
	public static void main(String...args) {
		
		
		
		String opt = "AA";
		
		int count = 3;
		//for
		//forEach
		//while
		int j = 0;
		j = j+1;
		j += 1;
		j++;
		
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				System.out.println("par:" + i);
			} else {
				System.out.println("Me brinco todo" + i);
				continue;
			}
			System.out.println("Despues de validar ");
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Lo encontre!" + i);break;
			} else {
				System.out.println("Aun no..." + i);
				continue;
			}
		}
			
		j = 99; boolean cond = true;
		while(cond) {
			System.out.println("not yet...");
			j--;
			if ( j == 5) cond = false;
		}	
			
		System.out.println("After loop !" );
		
		Loops loops = new Loops();
		
		 String result = (count > 10 ) ? "A" : ( (count > 12) ? "B" : "C" );
		 System.out.println("Result->"  + result);
		 
		
		if ( count > 10 ) {
			//loops.printYes();
		} else if (count > 12) {
			//loops.printMaybe();
		} else {
			//loops.printNo();
		}
		
<<<<<<< HEAD

=======
		
		
		
		
		
>>>>>>> development
	}

}
