package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Contact {
	public final String value;
	private boolean isPrivate;

	public Contact(String contact, boolean isPrivate, String errorMessage, String regex) throws IllegalValueException {
		String trimmedContact = contact.trim();
        this.isPrivate = isPrivate;
        if (!isValidContact(trimmedContact,regex)) {
            throw new IllegalValueException(errorMessage);
        }
        this.value = trimmedContact;
		
	}
	
	public static boolean isValidContact(String contact, String regex){
		return contact.matches(regex);
	}
	
	@Override
    public String toString() {
        return value;
    }
	
	 @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

	    public boolean isPrivate() {
	        return isPrivate;
	    }
}
