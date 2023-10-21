package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import contact.Contact;
import contact.ContactService;
class ContactServiceTest {
	
	private static ArrayList<Contact> testList = ContactService.Contact();

	
	// Testing add contact method
	@Test
	void testAddContact() throws Exception 
	{	
		ContactService.addContact("Test", "Add", "5559993333", "234 Test Lane");
		
		// test ID contact ID call
		Contact testContact = ContactService.findContact("5559993333");
		String ID = testContact.getContactId();
		
		assertEquals(testContact.getContactId(), ID);
		
	}

	@Test
	void testDeleteContact() throws Exception
	{
		
		// ADD test contact for deletion
		ContactService.addContact("10", "sdfv", "2229992222", "234 kjndf sdfjn");
		
		// retrieve the test contact
		Contact testID = ContactService.findContact("2229992222");
		
		// delete the contact
		ContactService.deleteContact(testID.getContactId());
		
		// Test that the contact was deleted using null return from find contact
		Contact nullReturn = ContactService.findContact("2229992222");
		
		assertEquals(null, nullReturn.getContactId());
	}
	
	@Test
	void testUpdateContact() throws Exception
	{
		// Adding contact to update
		ContactService.addContact("Update", "Test", "5559993333", "234 Test Road");
		
		// Edit contact info
		String contactId = "88";
		String firstName = "Ed";
		String lastName = "Wardo";
		String phone = "3332221111";
		String address = "123 Success Lane";
		
		ContactService.updateContact(contactId, firstName, lastName, phone, address);
		
		// Test contact updated
		assertEquals(ContactService.findContact(contactId), "88");
		
		
	}
}
