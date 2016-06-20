package chapter4;

import java.util.function.Consumer;

/**
 * Created by redfo on 2016-06-10.
 */
public class FluentMailer {
    private FluentMailer() {}

    public static void send(final Consumer<FluentMailer> block) {
        final FluentMailer mailer = new FluentMailer();
        block.accept(mailer);
        System.out.println("sending...");
    }

    //...
    public static void main(final String[] args) {
        FluentMailer.send(mailer ->
                mailer.from("build@agiledeveloper.com")
                        .to("venkats@agiledeveloper.com")
                        .subject("build notification")
                        .body("...much better..."));
    }

    public FluentMailer from(final String address) { /*... */; return this; }

    public FluentMailer to(final String address)   { /*... */; return this; }

    public FluentMailer subject(final String line) { /*... */; return this; }

    public FluentMailer body(final String message) { /*... */; return this; }
}
