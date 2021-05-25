package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CodeReviewRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CodeReviewIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "<p>Isso aí é para matar gente!</p>";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                //.withSimpleCard("Hello", speechText)
                .withReprompt(speechText)
                .build();
    }
}
