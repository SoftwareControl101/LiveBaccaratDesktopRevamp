package utilities.objects;

import io.cucumber.java.Scenario;

import java.net.URI;
import java.nio.file.Paths;

/*********************************************************************************************************************
 ** This object class is customized to override the 'getName' method of the 'Scenario' class and
 **      add the 'getFeature' method.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class CustomScenario {

    @SuppressWarnings("unused")
    private final Scenario delegate;

    @SuppressWarnings("unused")
    public CustomScenario(Scenario delegate) {
        this.delegate = delegate;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return this.delegate.getName().replace(":", "");
    }

    @SuppressWarnings("unused")
    public String getFeature() {
        return Paths.get(URI.create(String.valueOf(this.delegate.getUri()))).getFileName().toString().replace(".feature", "");
    }

    @SuppressWarnings("unused")
    public boolean isFailed() { return this.delegate.isFailed(); }

    @SuppressWarnings("unused")
    public void attach(byte[] data, String mediaType, String name) {
        this.delegate.attach(data, mediaType, name);
    }

}