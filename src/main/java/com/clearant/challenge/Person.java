package com.clearant.challenge;

import java.util.Arrays;
import java.util.List;

/**
 * Owner of the wallet.
 *
 * @author <a href="mailto:AngelElectrico@PsiqueWare.com">&Aacute;ngel El&eacute;ctrico</a>
 * @version Revision: 1.1 3/16/2019 4:12 PM
 */
public final class Person
{
    private final List<Wallet> m_wallets;

    /**
     * Constructor de Person.
     */
    public Person(final Wallet... wallets)
    {
        m_wallets = Arrays.asList(wallets);
    }


    public double calculateInterest()
    {
        return m_wallets.stream().mapToDouble(Wallet::calculateInterest).sum();
    }
}

