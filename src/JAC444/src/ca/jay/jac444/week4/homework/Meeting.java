package ca.jay.jac444.week4.homework;

public class Meeting {

	public static void main(String[] args)
	{
		Student s1 = new Student("John", "Smith", "J@gamil.com", "CPD");
		Student s2 = new Student("John", "Smith Jr", "J@gamil.com", "CPD");
		
		Person[] working = new Person[2];
		
		working[0] = s1;
		working[1] = s2;
		
		for(int i = 0; i < working.length; i++)
		{
			System.out.println(working[i].toString());
			working[i].doing();
			System.out.println();
			
			Talkable[] meeting = new Talkable[2];
			
			for(Talkable meeting1: meeting)
			{
				meeting1.say();
			}
		}
	}
}
