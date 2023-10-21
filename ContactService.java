package contact;

import java.util.ArrayList;
import java.util.UUID;

public class ContactService {
	
	private static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	
	// Contact contact = new Contact("c0", "John", "Smith", "2222222222", "1111 north Day street");
	// contactIDs[0] = 0;
	
	
	// generate contact ID
	@SuppressWarnings("unused")
	private static String generateContactId()
	{
		UUID contactId = UUID.randomUUID();
		String ID = "";
		
		return String.valueOf(contactId);
		
	}
	
	// add contact method
	public static void addContact(String first_Name, String last_Name, String Phone, String Address) throws Exception
	{
		// update contact information	
		String firstName = first_Name;
		String lastName = last_Name;
		String phone = Phone;
		String address = Address;
		
		// create the entry
		Contact contact = new Contact(firstName, lastName, phone, address);
		
		// create variable to verify in loop
		String loopId = contact.getContactId();
		
		// check if contact ID is in list
		for (Contact contacts: contactList)
		{
			if (contacts.getContactId().equalsIgnoreCase(loopId))
			{
				System.out.println("Contact ID already in use.");
				throw new Exception("ID in use");
			}
		}
		
		
		// add contact to the list
		contactList.add(contact);
		
		
	}
	
	
	// update contact method
	public static void updateContact(String contactId, String first_Name, String last_Name, String Phone, String Address)
	{
		
		// find contact in the list
		for (Contact contact: contactList)
		{
			if (contact.getContactId().equalsIgnoreCase(contactId))
			{
				// update the existing information with the new input
				contact.setFirstName(first_Name);
				contact.setLastName(last_Name);
				contact.setPhone(Phone);
				contact.setAddress(Address);
				return;
			}
		}	
	}
	
	
	// delete contact method
	public static void deleteContact(String contactId)
	{
		// loop through the contact list
		for (Contact contact: contactList)
		{
			// find specific contact ID
			if (contact.getContactId().equalsIgnoreCase(contactId))
			{
				// delete the entry
				contactList.remove(contact);
			}
		}
	}
	
	public static ArrayList<Contact> Contact()
	{
		return contactList;
	}
	
	
	public static Contact findContact(String phone)
	 
	{
		
		Contact foundContact = null;
		Contact notFound = null;
		for (Contact contact: contactList)
		{
			if (contact.getPhone().equalsIgnoreCase(phone))
			{
				foundContact = contact;
				return foundContact;
			}
			
		}
		return notFound;
	}
	
}
