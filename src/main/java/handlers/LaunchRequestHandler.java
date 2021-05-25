package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static constant.WordingConstant.TEXT_FIST_HELLO;

//Start request action
public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        return input.getResponseBuilder()
                .withSpeech(TEXT_FIST_HELLO)
                .withSimpleCard("HelloWorld", TEXT_FIST_HELLO)
                .withReprompt(TEXT_FIST_HELLO)
                .build();
    }

}
