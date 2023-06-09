package daniel.quiz.repository;

import daniel.quiz.server.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class InMemoryQuestionRepository implements QuestionRepository {

    private final List<Question> questions = new ArrayList<>();

    public void add(Question question) {
        questions.add(question);
    }

    public Optional<Question> findQuestionBy(int number) {
        return questions.stream()
                .filter(question -> question.getId() == number)
                .findFirst();
    }




}
