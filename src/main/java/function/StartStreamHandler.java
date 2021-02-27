package function;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import handlers.*;

public class StartStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new MarketingIntentHandler(),
                        new EasterEggsIntentHandler(),
                        new JobVacanciesIntentHandler(),
                        new AboutIntentHandler(),
                        new FirstIntentHandler(),
                        new AskGameIntentHandler(),
                        new StoreGamersHandler())
                .build();
    }

    public StartStreamHandler() {
        super(getSkill());
    }
}
