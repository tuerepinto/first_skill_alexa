package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class EtanosdrinksIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("PodcastIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //TODO Colocar texto
        String speechText = "<p>Que tal pedir aquela cerveja no, Eta nois drinks?</p>" +
                "<p>Eta nois drinks é especializada em bebidas destiladas e cervejas.</p>" +
                "<p>E o melhor, você pode pedir pelo whatsapp. As entregas são agendadas, " +
                "seguem os protocolos contra COVID-19 </p>" +
                "<p>Quer saber mais? Faz aquele zap zap para o número (31) 9 9 1 5 8-3 4 0 4</p>";

        String screenText = "Instagran: @etanoisdrinks\r\nWhatsapp: (31) 99158-3404";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("PodProgramar", screenText)
                .withShouldEndSession(false)
                .build();
    }
}
