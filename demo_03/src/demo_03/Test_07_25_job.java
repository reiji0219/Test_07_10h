package demo_03;

public class Test_07_25_job 
{
	public static void main( String[] args )
	{
		Calc25 calc = new Calc25( "Poly-morphism" );
			calc.process( () -> {
				System.out.println( "関心事を記述" );
	
				Interface save = Calc25.create();
					save.execute();
	
					
		});
	}
}