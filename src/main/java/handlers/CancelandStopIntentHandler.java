package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CancelandStopIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        return input.getResponseBuilder()
                .withSpeech("<p>Tchau!</p>" +
                        "Se dirigir não beba. Se for beber chame o Eta Nos Drinks!")
                .withSimpleCard("Goodbye", "Se dirigir não beba.\r\n" +
                        "Se for beber chame o Eta Nois Drinks.")
                .withShouldEndSession(true)
                .build();
    }
}
