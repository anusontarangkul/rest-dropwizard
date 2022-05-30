package io.dropwizard;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class davidApplication extends Application<davidConfiguration> {

    public static void main(final String[] args) throws Exception {
        new davidApplication().run(args);
    }

    @Override
    public String getName() {
        return "david";
    }

    @Override
    public void initialize(final Bootstrap<davidConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final davidConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
