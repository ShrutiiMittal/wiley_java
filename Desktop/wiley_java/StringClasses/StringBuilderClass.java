package StringClasses;

import java.util.logging.LogManager;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder logMessage= new StringBuilder();
        long timestamp = System.currentTimeMillis();
        logMessage 
            .append("[")
            .append(timestamp)
            .append("]");
        int userId=123456;

        logMessage.append("User ").append(userId).append(": ");

        String message="Login Succesful";
        logMessage.append(message);
        System.out.println(logMessage);

    }
    
}
