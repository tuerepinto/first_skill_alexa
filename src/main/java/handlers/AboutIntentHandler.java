package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import static utilitys.TextSpeech.TextAboutTypeLanguage;

public class AboutIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AboutIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = TextAboutTypeLanguage;
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("About Me!", speechText)
                .withReprompt(speechText)
                .withShouldEndSession(false)
                .build();
    }
}
