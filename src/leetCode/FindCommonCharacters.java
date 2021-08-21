class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet<String> uniqueEmailsSet = new HashSet<>();
		for(String email: emails) {
			String[] arrOfString = (email.split("@", 2));
			String localName = arrOfString[0].replaceAll("\\.", "");
			if(localName.contains("+")) {
				localName = localName.substring(0, localName.indexOf("+"));
			}
			String uniqueEmail = localName + "@" + arrOfString[1];
			uniqueEmailsSet.add(uniqueEmail);
		}
		
		return uniqueEmailsSet.size(); 
    }
}