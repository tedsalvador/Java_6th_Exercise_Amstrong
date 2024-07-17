package com.example.amstrong;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AmstrongCheckerTest {

    private AmstrongChecker checker = new AmstrongChecker();

    @Test
    public void testIsAmstrong() {
        assertThat(checker.isAmstrong(371), is(true));
        assertThat(checker.isAmstrong(9474), is(true));
        assertThat(checker.isAmstrong(1634), is(true));
        assertThat(checker.isAmstrong(8208), is(true));
        assertThat(checker.isAmstrong(123), is(false));
        assertThat(checker.isAmstrong(153), is(true));
    }
}

