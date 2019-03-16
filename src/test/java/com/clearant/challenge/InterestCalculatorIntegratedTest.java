package com.clearant.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class InterestCalculatorIntegratedTest
{

    @Test
    public void testFirstChallenge()
    {
        final Person person = new Person(new Wallet(CardBrand.VISA),
                                         new Wallet(CardBrand.MC),
                                         new Wallet(CardBrand.DISCOVER));
        Assertions.assertEquals(16, person.calculateInterest());
    }

    @Test
    public void testSecondChallenge()
    {
        final Person person = new Person(new Wallet(CardBrand.VISA, CardBrand.DISCOVER),
                                         new Wallet(CardBrand.MC));
        Assertions.assertEquals(16, person.calculateInterest());
    }

    @Test
    public void testThirdChallenge()
    {
        final Person person = new Person(new Wallet(CardBrand.VISA),
                                         new Wallet(CardBrand.MC));
        final Person person2 = new Person(new Wallet(CardBrand.MC),
                                          new Wallet(CardBrand.VISA));
        Assertions.assertEquals(30, person.calculateInterest() + person2.calculateInterest());
    }
}
