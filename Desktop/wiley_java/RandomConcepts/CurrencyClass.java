package RandomConcepts;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Currency;
public class CurrencyClass {
    public static void main(String[] args) {
        Currency usd=Currency.getInstance("USD");
        NumberFormat format=NumberFormat.getCurrencyInstance(Locale.US);
        String formattedVal=format.format(108.5);
        System.out.println(formattedVal);


        // Currency rupee=Currency.getInstance("INR");
        // NumberFormat format2=NumberFormat.getCurrencyInstance(Locale.getDefault());
        // String formattedVal2=format.format(108.5);
        // System.out.println(formattedVal2);

        NumberFormat format3=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String formattedVal3= format3.format(102);
        System.out.println(formattedVal3);

        // Custom Format
        int price=102;
        DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
        decimalFormatter. setPositivePrefix("$");
        String resval=decimalFormatter.format(price);
        System.out.println("custom format: -"+resval);

        Currency cur=Currency.getInstance("USD");
        String symbol=cur.getSymbol();
        String code=cur.getCurrencyCode();

        System.out.println(symbol);
        System.out.println(code);

        
       }
}
