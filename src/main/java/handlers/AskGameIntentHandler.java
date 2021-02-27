package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class AskGameIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("AskGameIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //TODO Colocar texto
        String speechText = "<p>Que tal experimentar <lang xml:lang=\"en-US\">Assassin's Creed Valhalla</lang>?</p>" +
                "<p><lang xml:lang=\"en-US\">Assassin's Creed Valhalla</lang> é um jogo eletrônico de RPG de ação desenvolvido pela <lang xml:lang=\"en-US\">Ubisoft</lang> Montreal e publicado pela Ubisoft.</p> " +
                "<p>O sucessor de <lang xml:lang=\"en-US\">Assassin's Creed Odyssey</lang>, é o décimo segundo título principal e o vigésimo segundo " +
                "lançamento da série <lang xml:lang=\"en-US\">Assassin's Creed</lang> foi lançado dia 10 de novembro de 2020 para Google Stadia, " +
                "Microsoft Windows, PlayStation 4, PlayStation 5, Xbox One e Xbox Series X.</p>" +
                "<p>Usando uma história alternativa, em Valhalla o jogador controla Eivor, um guerreiro Viking durante " +
                "as Invasoes da Grã Bretanha no século IX.</p>" +
                "<p>Foi bem recebido pelos criticos; o site <lang xml:lang=\"en-US\">OpenCritic</lang> dá a Valhala a pontuacao de 84/100 com base em 127 analises.</p>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Assassin's Creed Valhalla", speechText)
                .withShouldEndSession(false)
                .build();
    }
}