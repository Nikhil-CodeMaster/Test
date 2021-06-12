package com.sort;

import java.util.*;


public class Sort
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<String> ll=new ArrayList<String>();
        System.out.println("number of users:");
		int users = in.nextInt();
		
        String id[] = new String[users];
        String name[] = new String[users];
        String[] age = new String[users];
      
        
        for (int i = 0; i < users; i++) {
            
            System.out.println("\nEnter information for user " + (i+1) + ":");
            System.out.print("Name: ");
            name[i] = in.next();
            in.nextLine();
            System.out.print("Email id: ");
            id[i] = in.next();
            System.out.print("Age: ");
            age[i] = in.next();
            ll.add(name[i]);
            ll.add(id[i]);
            ll.add(age[i]);
            System.out.println();
        }

        for (int i = 0; i < users; i++) {
            System.out.println("user"+(i+1)+":\n"+name[i] + "\t" +  id[i] + "\t"+ age[i]);
           
        }
        System.out.println();
        
		ListIterator lit = ll.listIterator();
		
		while(true) {
			System.out.println("1.Ascending");
			System.out.println("2.Decending");
			System.out.println("Enter choice:");
			int ch = in.nextInt();
			System.out.println();
			switch (ch) {
			case 1:
				System.out.println("Ascending order: ");
				while (lit.hasNext())
					System.out.println(lit.next()+" ");
				System.out.println();
				break;

			case 2:
				System.out.println("decending order: ");
				while (lit.hasPrevious())
					System.out.println(lit.previous() + " ");
				System.out.println();
				break;
				
				default:break;
			}

		}
    }
}
