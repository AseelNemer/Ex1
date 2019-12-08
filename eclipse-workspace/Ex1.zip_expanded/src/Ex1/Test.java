package Ex1;
import java.util.LinkedList;
public class Test {
	public static void main(String[] args) 
	{   
		System.out.println("******test 1*****");
		Polynom p=new Polynom();
		String[] monoms= {"2","25x","5x^2"};
		for(int i=0;i<monoms.length;i++)
		{
			p.add(new Monom(monoms[i]));
		}
		System.out.println(p);
		
		System.out.println("********test 2******");
		Polynom p1=new Polynom();
		String[] Monoms1= {"5x^3","2","2x"};
		for(int i=0;i<Monoms1.length;i++)
		{
			p1.add(new Monom(Monoms1[i]));
		}
		System.out.println(p1);
		p1.substract(p);
		System.out.println(p1);
		
		
		
		System.out.println("**********test 3********");
		p.derivative();
		System.out.println(p.derivative());
		
		
		System.out.println("********test 4*******");
		p1.multiply(p);
		System.out.println(p1);
		
		
		System.out.println("*********test 5*******");
		Polynom p2=new Polynom();
		String[] Monoms2= {"1"};
		for(int i=0;i<Monoms2.length;i++)
		{
			p2.add(new Monom(Monoms2[i]));
		}
		System.out.println(p2.root(-2, 1, 0.0001));
	}
}
