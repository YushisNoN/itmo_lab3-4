package record;

import enums.Emotion;
import exception.EmptyStatementException;

public record Mind(Emotion emotion, String statement){
    public Mind(Emotion emotion, String statement){
        if(statement.length() <= 0){
            try {
                throw new EmptyStatementException();
            } catch (EmptyStatementException e) {
                e.printStackTrace();
            }
        }
        this.emotion = emotion;
        this.statement = statement;
    }
}
