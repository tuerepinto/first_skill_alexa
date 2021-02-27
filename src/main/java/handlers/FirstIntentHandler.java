package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static utilitys.TextSpeech.TextStartHello;

public class FirstIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("FirstIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        //TODO Colocar texto
        String speechText = "Tuerê vai beber amanhã com os amigos!?";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Recado do Geovani Morais", speechText)
                .withShouldEndSession(false)
                .build();
    }
}
