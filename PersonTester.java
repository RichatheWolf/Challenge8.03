import java.util.ArrayList;
import java.util.List;

public class PersonTester{
	public static void main(String[] args) {
		// Define array of Person
		Person[] person = new Person[10];
		
		// Initialize array of Person
		person[0] = new Person("Alice", "Friend", "9876543210", "..e@gmail.com", "Jan 09");
		person[1] = new Person("Bob", "Friend", "9876543211", "..b@gmail.com", "Feb 10");
		person[2] = new Person("Yana Rod", "Friend", "9876543219", "..d@gmail.com", "Nov 02");
		person[3] = new Person("Dirk Smith", "Uncle", "9876543213", "..h@gmail.com", "Mar 30");
		person[4] = new Person("Giselle Rose", "Friend", "9876543216", "..e@gmail.com", "Mar 02");
		person[5] = new Person("Fred Corner", "Uncle", "9876543215", "..r@gmail.com", "Mar 09");
		person[6] = new Person("Emily", "Aunt", "9876543214", "..y@gmail.com", "Apr 14");
		person[7] = new Person("Mathew Taylor", "Brother", "9876543210", "..r@gmail.com", "Dec 27");
		person[8] = new Person("Isaac", "Friend", "9876543218", "..c@gmail.com", "Nov 15");
		person[9] = new Person("Catherine", "Friend", "9876543210", "..y@gmail.com", "Feb 25");
		
		System.out.println("The Contact List Contains Person: \n");
		printContactList(person);
		
		
		sortByName(person);
		String name = "Diana Prince";
		System.out.println("\nSearch person with name: \"" + name + "\"");
		Person p = getByName(person, name);
		if (p == null) {
			System.out.println("No person found with name \"" + name + "\"");
		} else {
			System.out.println(p);
		}
		
		name = "Emily";
		System.out.println("\nSearch person with name: \"" + name + "\"");
		p = getByName(person, name);
		if (p == null) {
			System.out.println("Search person with name \"" + name + "\"");
		} else {
			System.out.println(p);
		}
		
		sortByRelation(person);
		
		String relation = "Sister";
		System.out.println("\nSearch person with relation: " + relation);
		List<Person> listPeople = getByRelation(person, relation);
		if (listPeople.size() == 0) {
			System.out.println("No person found with relation" + relation);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		relation = "Aunt";
		System.out.println("\nSearch person with relation: " + relation);
		listPeople = getByRelation(person, relation);
		if (listPeople.size() == 0) {
			System.out.println("No person found with relation" + relation);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		relation = "Friend";
		System.out.println("\nSearch person with relation: " + relation);
		listPeople = getByRelation(person, relation);
		if (listPeople.size() == 0) {
			System.out.println("No person found with relation " + relation);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		String month = "Jun";
		System.out.println("\nSearch person with birth month : " + month);
		listPeople = getByBirthdayMonth(person, month);
		if (listPeople.size() == 0) {
			System.out.println("No person found with birth month " + month);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		
		month = "Jan";
		System.out.println("\nSearch person with birth month : " + month);
		listPeople = getByBirthdayMonth(person, month);
		if (listPeople.size() == 0) {
			System.out.println("No person found with birth month " + month);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		month = "Mar";
		System.out.println("\nSearch person with birth month : " + month);
		listPeople = getByBirthdayMonth(person, month);
		if (listPeople.size() == 0) {
			System.out.println("No person found with birth month " + month);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		String phone = "9876543200";
		System.out.println("\nSearch person with phone : " + phone);
		listPeople = getByPhone(person, phone);
		if (listPeople.size() == 0) {
			System.out.println("No person found with phone " + phone);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		phone = "9876543216";
		System.out.println("\nSearch person with phone : " + phone);
		listPeople = getByPhone(person, phone);
		if (listPeople.size() == 0) {
			System.out.println("No person found with phone " + phone);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		phone = "9876543210";
		System.out.println("\nSearch person with phone : " + phone);
		listPeople = getByPhone(person, phone);
		if (listPeople.size() == 0) {
			System.out.println("No person found with phone " + phone);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		String email = "..c@gmail.com";
		System.out.println("\nSearch person with email : " + email);
		listPeople = getByEmail(person, email);
		if (listPeople.size() == 0) {
			System.out.println("No person found with email " + email);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		email = "..e@gmail.com";
		System.out.println("\nSearch person with email : " + email);
		listPeople = getByEmail(person, email);
		if (listPeople.size() == 0) {
			System.out.println("No person found with email " + email);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
		email = "..y@gmail.com";
		System.out.println("\nSearch person with email : " + email);
		listPeople = getByEmail(person, email);
		if (listPeople.size() == 0) {
			System.out.println("No person found with email " + email);
		} else {
			printContactList(listPeople.toArray(new Person[] {}));
		}
		
	}
	
	public static void printContactList(Person[] person) {
		
		for (Person p : person) {
			System.out.println(p);
		}
		
	}
	
	/**
	 * This method sort the contact list of person by their name.
	 *
	 * @param person
	 */
	public static void sortByName(Person[] person) {
		
		// Outer loop start from 0 to length of an array
		for (int index = 0; index < person.length - 1; index++)
		
		{
			
			int minIndex = index;
			
			/*
			 * Inner loop for find out index of the minimum element of the sub array
			 * starting from entire array till last.
			 */
			for (int i = index; i < person.length; i++)
			
			{
				
				if (person[i].getName().compareTo(person[minIndex].getName()) < 0)
				
				{
					
					minIndex = i;
					
				}
				
			}
			
			// swap the value of nth smallest element with the current index element
			Person tempValue = person[index];
			
			person[index] = person[minIndex];
			
			person[minIndex] = tempValue;
			
		}
		
		// System.out.println("Sorted Contact list by name: ");
		// printPlayList(person);
	}
	
	/**
	 * This method sort the contact list of person by their relationship value.
	 *
	 * @param person
	 */
	public static void sortByRelation(Person[] person) {
		
		// Outer loop start from 0 to length of an array
		for (int index = 0; index < person.length - 1; index++)
		
		{
			
			int minIndex = index;
			
			/*
			 * Inner loop for find out index of the minimum element of the sub array
			 * starting from entire array till last.
			 */
			for (int i = index; i < person.length; i++)
			
			{
				
				if (person[i].getRelation().compareTo(person[minIndex].getRelation()) < 0)
				
				{
					
					minIndex = i;
					
				}
				
			}
			
			// swap the value of nth smallest element with the current index element
			Person tempValue = person[index];
			
			person[index] = person[minIndex];
			
			person[minIndex] = tempValue;
			
		}
		
		// System.out.println("Sorted Contact list by relation: ");
		// printPlayList(person);
	}
	
	public static Person getByName(Person[] person, String name) {
		
		int beg = 0;
		
		int end = person.length - 1;
		
		int mid = (beg + end) / 2;
		
		while ((beg <= end) && !person[mid].getName().equalsIgnoreCase(name)) {
			
			if (name.compareTo(person[mid].getName()) < 0)
				
				end = mid - 1;
			
			else
				
				beg = mid + 1;
			
			mid = (beg + end) / 2;
			
		}
		
		if (person[mid].getName().equalsIgnoreCase(name))
			
			return person[mid];
		
		else
			
			return null;
	}
	
	
	public static List<Person> getByRelation(Person[] person, String relation) {
		
		List<Person> list = new ArrayList<Person>();
		
		int beg = 0;
		
		int end = person.length - 1;
		
		int mid = (beg + end) / 2;
		
		while ((beg <= end) && !person[mid].getRelation().equalsIgnoreCase(relation)) {
			
			if (relation.compareTo(person[mid].getRelation()) < 0)
				
				end = mid - 1;
			
			else
				
				beg = mid + 1;
			
			mid = (beg + end) / 2;
			
		}
		
		
		if (person[mid].getRelation().equalsIgnoreCase(relation)) {
			
			list.add(person[mid]);
			
			int i = mid - 1;
			while(i >= 0 && person[i].getRelation().equalsIgnoreCase(relation)) {
				list.add(person[i]);
				i--;
			}
			
			i = mid + 1;
			while(i < person.length && person[i].getRelation().equalsIgnoreCase(relation)) {
				list.add(person[i]);
				i++;
			}
			
		}
		
		return list;
	}
	
	public static List<Person> getByBirthdayMonth(Person[] person, String month){
		
		List<Person> list = new ArrayList<Person>();
		
		for(Person p : person) {
			if(p.getBirthday().substring(0, 3).equalsIgnoreCase(month)) {
				list.add(p);
			}
		}
		
		return list;
	}
	
	public static List<Person> getByPhone(Person[] person, String phone){
		
		List<Person> list = new ArrayList<Person>();
		
		for(Person p : person) {
			if(p.getPhone().equalsIgnoreCase(phone)) {
				list.add(p);
			}
		}
		
		return list;
	}
	
	public static List<Person> getByEmail(Person[] person, String email){
		
		List<Person> list = new ArrayList<Person>();
		
		for(Person p : person) {
			if(p.getEmail().equalsIgnoreCase(email)) {
				list.add(p);
			}
		}
		
		return list;
	}
}