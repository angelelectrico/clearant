package com.clearant.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.clearant.challenge.CardBrand.VISA;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VisaCardTest
{

    private Card m_card;

    @BeforeAll
    void setup()
    {
        m_card = new Card(VISA);
    }

    @Test
    void calculateInterest()
    {
        assertEquals(10, m_card.calculateInterest());
    }
}