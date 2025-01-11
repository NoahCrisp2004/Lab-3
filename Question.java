package Lab3;

public class Question {

private String questionText;
private String questionAnswer;
private int difficulty;

public Question(String QuestionText, String QuestionAnswer, int Difficulty){
    questionText = QuestionText;
    questionAnswer= QuestionAnswer;
    difficulty = Difficulty;
}

//getters
public int getDifficulty() {
    return difficulty;
}
public String getQuestionAnswer() {
    return questionAnswer;
}
public String getQuestionText() {
    return questionText;
}
//setters


}
