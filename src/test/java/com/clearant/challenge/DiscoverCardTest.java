package com.clearant.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.clearant.challenge.CardBrand.DISCOVER;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DiscoverCardTest
{

    private Card m_card;

    @BeforeAll
    void setup()
    {
        m_card = new Card(DISCOVER);
    }

    @Test
    void calculateInterest()
    {
        assertEquals(1, m_card.calculateInterest());
    }
}