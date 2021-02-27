package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class StoreGamersHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("AskGameIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //TODO Colocar texto
        String speechText = "<p>Conhece a Zeus <lang xml:lang=\"en-US\">Games</lang>?</p>" +
                "<p>É uma ótima loja de games, localizada na AV. CRISTIANO MACHADO, número 1682, LOJA 12, BAIRRO CIDADE NOVA, Belo Horizonte</p>" +
                "<p>LOJA ESPECIALIZADA EM JOGOS, CONSOLES E ACESSÓRIOS DE PLAYSTATION, XBOX E NINTENDO!</p>" +
                "<p>Na Zeus <lang xml:lang=\"en-US\">Games</lang> sempre temos o melhor preço e ótimas promoções.</p>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Zeus Games", speechText)
                .withShouldEndSession(false)
                .build();
    }
}
