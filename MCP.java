public class MCP {
    private static String test = "test";//***Added the keyword static so the statement in line 17 would run.
    
    public static void main(String[] args) {
        
        // The phrase "You have no args" should display on the console
        
        
        if (args.length >= 0){  //*** I added an equal sign because of the arguments were equal to 0 the
            //*** if statement would be false.
            System.out.println("You have no args");
        }
        
        // The phrase "they are equal" should display on the console
        
        
        if (test == "test"){//*** Initially this statement had '=' which was a declaration and not
            //*** comparing the the statement so I changed it to '=='
            System.out.println("they are equal");
        }
        
        // 0 through 9 should display on the console
        for (int i = 0; i<10; i++){
            //break;
            System.out.println(i);//*** There was no semicolon to end the statement.
        }
    }
}
