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
        String speechText = "<p>Olá, que tal experimentar Assassin's Creed Valhalla?</p>" +
                "<p>Assassin's Creed Valhalla é um jogo eletrônico de RPG de ação desenvolvido pela Ubisoft Montreal e publicado pela Ubisoft.</p> " +
                "<p>O sucessor de Assassin's Creed Odyssey, é o décimo segundo título principal e o vigésimo segundo " +
                "lançamento da série Assassin's Creed foi lançado dia 10 de novembro de 2020 para Google Stadia, " +
                "Microsoft Windows, PlayStation 4, PlayStation 5, Xbox One e Xbox Series X.</p>" +
                "<p>Usando uma história alternativa, em Valhalla o jogador controla Eivor, um guerreiro Viking durante " +
                "as Invasoes da Grã Bretanha no século IX.</p>" +
                "<p>Foi bem recebido pelos criticos; o site OpenCritic dá a Valhala a pontuacao de 84/100 com base em 127 analises.</p>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Assassin's Creed Valhalla", speechText)
                .withShouldEndSession(false)
                .build();
    }
}