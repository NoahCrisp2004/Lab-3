package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
Scanner scanner = new Scanner(System.in);
ArrayList<Question> questionList = new ArrayList<>();


public void add_question(){
    questionList.add(create_question());
}

private Question create_question(){
    System.out.println("What is the question Text?");
        String QuestionText = scanner.next();
    System.out.println("What is the Answer?");
        String AnswerText = scanner.next();
    System.out.println("How difficult?");
        int difficulty = scanner.nextInt();
    return new Question(QuestionText, AnswerText, difficulty);
}
}
