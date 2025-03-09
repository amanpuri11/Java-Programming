package javacourse;

public class operator {
    public static void main(String[] args) {
        
        int marks = 80;
        char gender = 'm';
        
        if (marks > 75 && gender == 'm') {
            System.out.println("You are in marketing");
        } 
        else if (marks > 75 && gender == 'f') {
            System.out.println("You are in operating task");
        }
        else {
            System.out.println("Not selected");
        }
    }
}
