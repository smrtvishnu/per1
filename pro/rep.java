package SkillRack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Descending
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	LinkedList<Integer>l=new LinkedList<Integer>();
	for(int l=0;l<n;l++)
	{
		l.add(s.nextInt());
	}
	l.sort(null);
	Iterator itr=l.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
