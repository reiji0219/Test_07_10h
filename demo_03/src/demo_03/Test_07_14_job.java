package demo_03;

public class Test_07_14_job 
{
	public static void main( String[] args )
	{
	Calc14 calc = new Calc14( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc14.create();
			save.execute();


		});
	}
}