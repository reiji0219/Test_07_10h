package demo_03;

public class Test_07_30_h 
{
	public static void main( String[] args )
	{
		Calc30h calc = new Calc30h( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc30h.create();
				save.execute();
		});
	}
}
