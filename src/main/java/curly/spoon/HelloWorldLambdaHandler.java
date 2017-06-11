package curly.spoon;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Optional;


/**
 * @author Serhii Solohub
 *         created on: 11.06.17
 */
public class HelloWorldLambdaHandler {

    public String handle(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        String result = String.format("Hello, %s", Optional.of(input).orElse("World"));
        logger.log(result);
        return result;
    }
}
