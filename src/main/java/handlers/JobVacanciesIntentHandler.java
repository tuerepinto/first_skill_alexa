package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static utilitys.TextSpeech.TextJobVacancies;

public class JobVacanciesIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("JobVacanciesIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = TextJobVacancies;

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("JobVacancies", speechText)
                .build();
    }
}
