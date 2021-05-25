package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class FeedbackRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("FeedbackIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "<p>Você programa sem tompero!</p>";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                //.withSimpleCard("Hello", speechText)
                .withReprompt(speechText)
                .build();
    }
}
