package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutGranadaHolmes() throws Exception {
      assertThat(queryProcessor.process("granada holmes"), containsString("Watson"));
    }

    @Test
    public void knowsAboutName() throws Exception {
      assertThat(queryProcessor.process("your name"), containsString("Rigel"));
    }

    @Test
    public void knowsAboutLargestNumber() throws Exception {
      assertThat(queryProcessor.process("which of the following numbers is the largest: 35, 933, 72"), containsString("933"));
    }

    @Test
    public void knowsAboutPlus() throws Exception {
      assertThat(queryProcessor.process("what is 7 plus 3"), containsString("10"));
    }

    @Test
    public void knowsAboutMinus() throws Exception {
      assertThat(queryProcessor.process("what is 7 minus 3"), containsString("4"));
    }

    @Test
    public void knowsAboutMultiply() throws Exception {
      assertThat(queryProcessor.process("what is 7 multiplied by 3"), containsString("21"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
