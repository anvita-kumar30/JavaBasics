package testa;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name="Anvita";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);   //6

        String lstring=name.toLowerCase();
        System.out.println(lstring);   //anvita
        String ustring=name.toUpperCase();
        System.out.println(ustring);   //ANVITA

        String nonTrimmedString="      Hieeee      ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));   //nvita
        System.out.println(name.substring(1,5));          //nvit

        System.out.println(name.replace('n', 'p'));    //Apvita
        System.out.println(name.replace("a", "ier"));  //Anvitier

        System.out.println(name.startsWith("Har"));  //false
        System.out.println(name.endsWith("ita"));    //true

        System.out.println(name.charAt(4));   //t

        String modifiedName = "Anvitata";
        System.out.println(modifiedName.indexOf("ta"));   //4
        System.out.println(modifiedName.indexOf("ta", 5));   //6
        System.out.println(modifiedName.lastIndexOf("ta", 5));    //4
        System.out.println(modifiedName.lastIndexOf("ta", 6));    //6
        System.out.println(modifiedName.lastIndexOf("ta", 7));    //6

        System.out.println(name.equals("Anvita"));
        System.out.println(name.equalsIgnoreCase("anVIta"));

        System.out.println("I am escape sequence\tdouble quote");

    }
}
