package contact;

import java.util.UUID;

public class Contact {

	// initializing variables
	String contactId;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	// generate contact ID
	@SuppressWarnings("unused")
	private static String generateContactId()
	{
		UUID contactId = UUID.randomUUID();
		String ID = "";
			
		return String.valueOf(contactId);			
	}
	
	// constructor 
	public Contact (String firstName, String lastName, String phone, String address)
	{
		/*
		if (contactId.length() > 10 || contactId == null || contactId.length() <= 0)
		{
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if (firstName.length() > 10 || firstName == null || firstName.length() <= 0)
		{
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if (lastName.length() > 10 || lastName == null ||  lastName.length() <= 0)
		{
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if (phone.length() != 10 || phone == null || phone.length() <= 0)
		{
			throw new IllegalArgumentException("Invalid first phone number");
		}
		
		if (address.length() >30 || address == null || address.length() <= 0)
		{
			throw new IllegalArgumentException("Invalid address");
		}
		*/
		
		// create contactId
		
		String contactId = generateContactId().substring(0, 10);
				
		
		// checking requirements
		validateContactId(contactId);
		validateFirstName(firstName);
		validateLastName(lastName);
		validatePhone(phone);
		validateAddress(address);
		
		// setting attributes 
		setContactId(contactId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	// Get methods
	public String getContactId()
	{
		return contactId;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	//set methods
	public void setContactId(String contactId)
	{
		this.contactId = contactId;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	
	// requirement verification methods
	public boolean validateContactId(String contactId)
	{
		if (contactId.length() <= 10 && contactId != null || contactId.length() <= 0)
		{
			return true;
		}
		else
		{
			System.out.println("Contact ID length must be 10 characters or less and cannot be null");
			return false;
		}
	}
	
	public boolean validateFirstName(String firstName)
	{
		if (firstName.length() <= 10 && firstName != null || firstName.length() <= 0) 
		{
			return true;
		}
		else
		{
			System.out.println("First Name length must be 10 characters or less and cannot be null");
			return false;
		}
	}
	
	public boolean validateLastName(String lastName)
	{
		if (lastName.length() <= 10 && lastName != null || lastName.length() <= 0) 
		{
			return true;
		}
		else
		{
			System.out.println("Last Name length must be 10 characters or less and cannot be null");
			return false;
		}
	}
	
	public boolean validatePhone(String phone)
	{
		if (phone.length() == 10 && phone != null || phone.length() <= 0) 
		{
			return true;
		}
		else
		{
			System.out.println("Phone number must be 10 digits in length and cannot be null");
			return false;
		}
	}
	
	public boolean validateAddress(String address)
	{
		if (address.length() <= 30 && address != null || address.length() <= 0) 
		{
			return true;
		}
		else
		{
			System.out.println("Address must be 30 characters or less and cannot be null");
			return false;
		}
	}
	
}
