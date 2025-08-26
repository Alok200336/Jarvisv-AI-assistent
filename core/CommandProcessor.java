package jarvis.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommandProcessor {

    public void process(String command) {
        command = command.toLowerCase();

        try {
            if (command.contains("open calculator")) {
                System.out.println("Opening Calculator...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "Calculator"});
            } 
            else if (command.contains("open chrome")) {
                System.out.println("Opening Google Chrome...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "Google Chrome"});
            } 
            else if (command.contains("open youtube")) {
                System.out.println("Opening YouTube...");
                Runtime.getRuntime().exec(new String[]{"open", "https://www.youtube.com"});
            } 
            else if (command.contains("open spotify")) {
                System.out.println("Opening Spotify...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "Spotify"});
            } 
            else if (command.contains("open vs code")) {
                System.out.println("Opening Visual Studio Code...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "Visual Studio Code"});
            } 
            else if (command.contains("open telegram")) {
                System.out.println("Opening Telegram...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "Telegram"});
            } 
            else if (command.contains("open whatsapp")) {
                System.out.println("Opening WhatsApp...");
                Runtime.getRuntime().exec(new String[]{"open", "-a", "WhatsApp"});
            }else  if (command.contains("open intellij")) {
                System.out.println("Opening Intellij..");
                Runtime.getRuntime().exec(new String[] {"open", "-a" , "intellij idea ce"});
            
            }else if (command.contains("open Github")) {
                System.out.println("Opening Github");
                Runtime.getRuntime().exec(new String[] {"open", "-a" , "Github"}));
                
            }else if (command.startsWith("calculate") || command.startsWith("solve")) {
                String expression = command.replace("calculate", "");
                                            .replace("solve", "")
                                             .trim();
                
                solveMath(expression);
            }
            else if (command.contains("open Notes")) {
                System.out.println("Opening Notes");
                Runtime.getRuntime().exec(new String[] {"open", "-a", "Notes"});
                
            }else if (command.contains("open Microsoft Word")) {
                System.out.println("Opening microsot word");
                Runtime.getRuntime().exec(new String[] {"open" ,"-a" , "Microsoft Word"});
            }
            

            else {
                System.out.println("Sorry, I don’t recognize that command.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
