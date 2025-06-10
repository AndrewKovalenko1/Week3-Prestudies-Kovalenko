package persons;

import java.util.Random;

public class Student extends Person{

    private final String joke;


    public Student() {
        Random random = new Random();
        String[] jokes = {
                "Exams are like girlfriends — too many questions and difficult to understand.",
                "Studying is like folding a fitted sheet — no one really knows how to do it.",
                "I have a degree in caffeine consumption.",
                "I'm not procrastinating. I'm giving my tasks time to realize how important they are.",
                "Why do Java developers wear glasses? Because they don’t C#.",
                "Why was the math book sad? Because it had too many problems.",
                "Dear math, I’m not a therapist. Solve your own problems."
        };
        int index = random.nextInt(jokes.length);
        joke = jokes[index];
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(joke);
    }

    public void tellJoke() {
        System.out.println(joke);
    }
}
