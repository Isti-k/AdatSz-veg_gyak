package hu.szamalk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Adat {
    private String szoveg;
    private char[] tomb;
    private ArrayList<Character> lista;

    public Adat(String szoveg) {
        this.szoveg = szoveg;
        this.lista = new ArrayList<Character>();
        this.tomb = szoveg.toCharArray();
    }

    public void bekero(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Kérek egy tetszőleges szöveget! ");
            szoveg = scanner.nextLine();

            if (szoveg.length() >= 15 && kulonbozoBetuk(szoveg) >= 5 ){
                break;
            }else {
                System.out.println("A szöveg legalább 15 karekterből álljon, és legalább 5 különbező betűből! ");
            }
        }
    }

    public int kulonbozoBetuk(String szoveg){
        Set<Character> betuHalmaz = new HashSet<>();
        for (char c : szoveg.toCharArray()){
            if (Character.isLetter(c)){
                betuHalmaz.add(c);
            }
        }
        return betuHalmaz.size();
    }


    public void tarolas(){
        for (char c : tomb)
            lista.add(c);
    }

    public void megjelenit(){
        System.out.print("tömb: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]);
            if (i < tomb.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.print("lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }




}
