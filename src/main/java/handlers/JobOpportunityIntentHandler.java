package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class JobOpportunityIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        //TODO Criar Intet dentro console developer Amazon
        return input.matches(Predicates.intentName("JobOpportunityIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        //TODO Colocar texto
        String speechText = "<p>Achei um desafios na Squadra que bate com o seu perfil criado no linkedin.</p>" +
                "<p>A oportunidade é para Analista desenvolvedor <lang xml:lang=\"en-US\">dot net core</lang> remoto.</p>" +
                "<p>Vou te falar os detalhes da oportunidade.</p>" +
                "<p>Ei você que curte:</p>" +
                "<p>Participar no desenvolvimento de soluções para nossos clientes utilizando metodologias ágeis.</p>" +
                "<p>Dar suporte ao planejamento do projeto.</p>" +
                "<p>Dar suporte ao processo de implantação no cliente.</p>" +
                "<p>Participar de reuniões com o cliente.</p>" +
                "<p>O time da Squadra quer conhecer seu momento profissional, " +
                "e quem sabe atuar com inovação e transformação digital aqui na www.squadra.com.br</p>";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Vagas Squadra", speechText)
                .withShouldEndSession(false)
                .build();
    }
}
