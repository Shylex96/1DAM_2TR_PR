package es.studium.Example2;

public class Example2 {

	public static void main(String[] args)
	{
		final int SIZE = 5;
		int array[] = new int [SIZE];
		
		System.out.println("Calculating.. \n");
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Result: \n-------");
		for (int i = 0; i <= SIZE; i++) 
		{
			try 
			{
				array[i] = i*2;
			}
			catch (IndexOutOfBoundsException ioobe) 
			{
				// Instrucciones de la excepción.
				// Si hacemos un throw lanzamos la excepción al sistema operativo.
				// Si el S.O. es capaz de resolverlo bien.
				// throw (ioobe);
			}
			finally {
				// Instrucciones que siempre se ejecutan
				// tras el try sin error o tras el try
				// con error y el catch correspondiente.
			}
		}
		for (int element: array) 
		{
			System.out.println(element);
		}
	}

}
