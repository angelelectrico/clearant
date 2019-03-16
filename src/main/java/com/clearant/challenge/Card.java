package com.clearant.challenge;

/**
 * Card to be used to do a payment.
 *
 * @author <a href="mailto:AngelElectrico@PsiqueWare.com">&Aacute;ngel El&eacute;ctrico</a>
 * @version Revision: 1.1 3/16/2019 4:13 PM
 */
public final class Card
{
    private double balance = 100;

    private CardBrand m_cardBrand;

    /**
     * Constructor for a Card.
     *
     * @param cardBrand Brand of the Card.
     */
    public Card(final CardBrand cardBrand)
    {
        m_cardBrand = cardBrand;
    }

    public double calculateInterest()
    {
        return m_cardBrand.calculte1MonthInterest(balance);
    }
}

