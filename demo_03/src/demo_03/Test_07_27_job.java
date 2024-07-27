package demo_03;

public class Test_07_27_job 
{
	public static void main( String[] args )
	{
		Calc27 calc = new Calc27( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc27.create();
				save.execute();

		});
	}
}
