package chapter4;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: MailBuilder
 * Date: 2016-06-09
 * Time: 오전 12:23
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MailBuilder {
    public MailBuilder from(final String address) { /*... */; return this; }
    public MailBuilder to(final String address) { /*... */; return this; }
    public MailBuilder subject(final String line) { /*... */; return this; }
    public MailBuilder body(final String message) { /*... */; return this; }
    public void send() { System.out.println("sending..."); }
//...
}
