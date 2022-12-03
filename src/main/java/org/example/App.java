package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Objekte Länder
 *Martin Atanasov
 */
public class App 
{
    public static void main( String[] args )
    {
        Land land1 = new Land("Schweiz", "Nein", 500.00);
        Land land2 = new Land();
        System.out.println(land1);
        System.out.print(land2);

        List<Land> Laender = new ArrayList<>();
        Laender.add(land1);
        Laender.add(land2);

        System.out.println(Laender);

    }
}
