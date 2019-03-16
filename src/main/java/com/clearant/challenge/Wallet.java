package com.clearant.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Wallet, where cards are carried.
 *
 * @author <a href="mailto:AngelElectrico@PsiqueWare.com">&Aacute;ngel El&eacute;ctrico</a>
 * @version Revision: 1.1 3/16/2019 4:12 PM
 */
public final class Wallet
{

    private final List<Card> m_cards;

    /**
     * Constructor de Wallet.
     *
     * @param brands Brands for the cards That are contained by the wallet.
     */
    public Wallet(final CardBrand... brands)
    {
        m_cards = Arrays.stream(brands).map(Card::new).collect(Collectors.toList());
    }


    public double calculateInterest()
    {
        return m_cards.stream().mapToDouble(Card::calculateInterest).sum();
    }
}

