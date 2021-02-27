package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class EasterEggsIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("EasterEggsIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "é um professor <lang xml:lang=\"en-US\">Home at teacher.</lang>" +
                "<audio src=\"soundbank://soundlibrary/voices/human/human_09\"/>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }
}
