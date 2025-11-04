public class MidTask2 {
    public static void main(String[] args){
        String firstName = "Lamya";
        String lastName = "Tihi";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        
        String productName = "phone";
        String productID = "12345";
        String productCode = productName + "-" + productID;
        System.out.println("Product Code: " + productCode);

        
        String email = "tihi@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Username: " + username);

        
        String userMessage = "nice to meet you";

    
        int totalChars = userMessage.length();
        System.out.println("Total characters: " + totalChars);

        
        String upperCaseMessage = userMessage.toUpperCase();
        System.out.println("Uppercase: " + upperCaseMessage);

    
        String lowerCaseMessage = userMessage.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseMessage);
    


        
        String sentence = "i like animals";
        String replacedSentence = sentence.replace("animals", "dinosaurs");
        System.out.println("After replacement: " + replacedSentence);
    }
}