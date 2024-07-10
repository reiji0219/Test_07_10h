package demo_03;

public class Test_07_10h 
{
	public static void main( String[] args )
	{
		Calc10h calc = new Calc10h( "Poly-morphism" );
			calc.process( () -> {
				System.out.println( "関心事を記述" );
				
				Interface save = Calc10h.create();
					save.execute();
					
					
			});
			
				
			
		
		
		
	
		
			
	}
	
}
