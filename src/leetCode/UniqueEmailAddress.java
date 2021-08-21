package leetCode;

import java.util.HashSet;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		numUniqueEmails(emails);
		System.out.println(numUniqueEmails(emails));
	}
	
	public static int numUniqueEmails(String[] emails) {
		HashSet<String> uniqueEmailsSet = new HashSet<>();
		for(String email: emails) {
			String[] arrOfString = (email.split("@", 2));
			/*
			 * More efficient method of splitting string
			 * 
			 * int splitPosition = email.indexOf("@");
			 * String localName = email.substring(0, splitPosition);
			 * String domainName = email.substring(splitPosition);
			 */
			String localName = arrOfString[0].replaceAll("\\.", "");
			if(localName.contains("+")) {
				localName = localName.substring(0, localName.indexOf("+"));
			}
			String uniqueEmail = localName + "@" + arrOfString[1];
			//String uniqueEmail = localName + domainName;
			uniqueEmailsSet.add(uniqueEmail);
		}
		
		return uniqueEmailsSet.size();
    }

}
