package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class PodcastIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("PodcastIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //TODO Colocar texto
        String speechText = "<p>Que tal experimentar <lang xml:lang=\"en-US\">o podcast</lang> PodProgramar?</p>" +
                "<p>É um <lang xml:lang=\"en-US\">podcast</lang> apresentado por desenvolvedoras focado em programação, " +
                "notícias e histórias, tudo com o toque feminino, e com bastante diversidade.</p>" +
                "<p>Tente dizer Alexa, abra o <lang xml:lang=\"en-US\">Spotify</lang> podprogramar.</p>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("PodProgramar", speechText)
                .withShouldEndSession(false)
                .build();
    }
}
