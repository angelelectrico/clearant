package com.clearant.challenge;

/**
 * Brand for a {@link Card}.
 *
 * @author <a href="mailto:AngelElectrico@PsiqueWare.com">&Aacute;ngel El&eacute;ctrico</a>
 * @version Revision: 1.1 3/16/2019 4:13 PM
 */
public enum CardBrand
{
    VISA(10),
    MC(5),
    DISCOVER(1);


    /**
     * Interest for the card.
     */
    private final double m_interest;

    CardBrand(final double percentInterest)
    {
        m_interest = percentInterest / 100;
    }

    public double calculte1MonthInterest(final double balance)
    {
        return balance * m_interest;
    }
}
