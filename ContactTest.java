package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {
	
	Contact nullContact = null;

	@Test
	void testContactClass() 
	{
		// Testing get methods
		Contact contact = new Contact("Dev", "Top", "2119929992", "234 north Rest street");
		
		assertTrue(contact.getFirstName().equals("Dev"));
		assertTrue(contact.getLastName().equals("Top"));
		assertTrue(contact.getPhone().equals("2119929992"));
		assertTrue(contact.getAddress().equals("234 north Rest street"));
	}
	
	
	// Testing Setter Methods
	@Test
	void testSetContactId()
	{
		Contact contact1 = new Contact("Test", "Method", "7082274459", "234 Test drive");
		
		contact1.setContactId("6");
		assertEquals(contact1.getContactId(), "6");
	}
	
	@Test
	void testSetFirstName()
	{
		Contact contact1 = new Contact("Test", "Method", "7082274459", "234 Test drive");
		
		contact1.setFirstName("Tested");
		assertEquals(contact1.getFirstName(), "Tested");
	}
	
	@Test
	void testSetLastName()
	{
		Contact contact1 = new Contact("Test", "MethodMan", "7082274459", "234 Test drive");
		
		contact1.setLastName("Tested");
		assertEquals(contact1.getLastName(), "MethodMan");
	}
	
	@Test
	void testSetPhone()
	{
		Contact contact1 = new Contact("Test", "Method", "7082274459", "234 Test drive");
		
		contact1.setPhone("Tested");
		assertEquals(contact1.getPhone(), "5558675309");
	}
	
	@Test
	void testSetAddress()
	{
		Contact contact1 = new Contact("Test", "Method", "7082274459", "234 Test drive");
		
		contact1.setAddress("456 Test Avenue");
		assertEquals(contact1.getAddress(), "456 Test Avenue");
	}

	//Testing parameters for each attribute
	@Test
	void testContactIdTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "Top", "2119929992", "234 north Rest street");});
	}
	
	@Test
	void testFirstNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("12345678910", "Top", "2119929992", "234 north Rest street");});
	}
	
	@Test
	void testLastNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678910", "2119929992", "234 north Rest street");});
	}
	
	@Test
	void testPhoneTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", "211992999222", "234 north Rest street");});
	}
	
	@Test
	void testPhoneTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", "2119", "234 north Rest street");});
	}
	
	@Test
	void testAddressTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", "2119929992", "234 north Rest street222222222222222");});
	}
	
	@Test
	void testLastNameIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", null, "2119929992", "234 north Rest street");});
	}
	
	
	@Test
	void testPhoneIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", null, "234 north Rest street");});
	}
	
	@Test
	void testAddressIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", "2119929999", null);});
	}
	
	@Test
	void testFirstNameIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact(null, "12345678", "2119929992", "234 north Rest street");});
	}
	
	@Test
	void testContactIDIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("123456789", "12345678", "2119929992", "234 north Rest street");});
	}
}
