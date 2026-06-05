// Phase 0 · Item 0.3 — Conditional Statements  [TODAY]
// Concept: if / else if / else, comparison & logical operators, switch.
//          Java gotcha: numbers/char/boolean use ==, Strings use .equals().
// Run:  cd src/phase0-java-basics && javac T03_Conditionals.java && java T03_Conditionals

public class T03_Conditionals {
    public static void main(String[] args) {
        String name = "Thowfik";
        int marks = 85;
        String day = "Monday";
        
        if(name.equals("Thowfik")){
            System.out.println("Welcome, " + name + "!" );
        }
         if(!name.equals("Juhair")){
            System.out.println("This user is not Thowfik" );
        }
        if(marks >= 90){
            System.out.println("Grade: A");
        } else if(marks >= 80){
            System.out.println("Grade: B");
        } else if(marks >= 70){
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        switch(day){
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":    
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            default:
                System.out.println("It's the weekend!");
        }
    }
}
