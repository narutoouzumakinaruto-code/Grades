import java.util.*;

class MarksException extends Exception
{
    MarksException(String message){
        super(message);
    }
}
public class Grader {
    String grade(int mark) throws MarksException
    {
        String[] grades = {"F","P","C","D","HD"};
        String grade="F";

        if(mark < 0){
            throw new MarksException("Marks cannot be negative!");
        }else if(mark > 100){
            throw new MarksException("Marks must not be more than 100!");
        }else if(mark < 50)
        {
            grade = grades[0];
        }else if(mark < 65)
        {
            grade = grades[1];
        }else if(mark < 75){
            grade = grades[1];
            
        }else if(mark < 85){
            grade = grades[1];
            
        }else{
            grade = grades[1];   
        }
        return grade;
    }
}
