package es.studium.Example1;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		int a,b;
		a = 7;
		b = 0;

		System.out.println("Calculating.. \n");
		Thread.sleep(2*1000); 
		try {
			System.out.println(a/b);
			System.out.println("Task finished succesfully.");
			// Se pueden poner varias excepciones juntas. 
			// Lo normal es separarlas para un tipo de mensaje u otro dependiendo del error.
		} catch (ArithmeticException | ArrayStoreException aee) {
			System.out.println("An Error ocurred.\n"+aee.getMessage());
		}
		/* Con este cogeríamos cualquier tipo de error, sería como un else.
		 
		catch (Exception e) {
		System.out.println(e);
		}
		
		*/
	}
}
