package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// Rechner um verschiedene Mathematik Aufgaben zu lösen #YOLO

        String Name;
        boolean a = true;

        System.out.println("Hallo und Wilkommen bei unserem Rechner, schön dass Sie da sind.");
        System.out.print("Wie lautet Ihr Name? ");

       Name = scan.nextLine();
        while (a == true) {

            System.out.println("Hallo " + Name + ", womit kann ich Ihnen helfen?");
            System.out.println("Tippen Sie den jeweiligen Buchstabe ein und bestätigen mit Eingabe.");
            System.out.println("a : Grundrechenarten");
            System.out.println("b : Flächeninhalte berechnen");
            System.out.println("c : Umfang berechnen");
            System.out.println("d : Rauminhalte berechnen");
            System.out.println("e : Prozentrechnen");
            System.out.println("x : Beendet das Programm");

            char Aktion = scan.next().charAt(0);
            char Rechnung;
            char Grundflaeche;
            boolean b = true;
            double c, d, x, y, z; //Variablen zum Rechnen
            double pi = Math.PI;
            double Drittel = 0.333333333333333;

            switch(Aktion) {
                case 'a' : //Grundrechenarten

                    while (b == true) {
                        System.out.println("Welche Rechenoperation soll ausgeführt werden?");
                        System.out.println("a : Plusrechnen (Addition)");
                        System.out.println("b : Minusrechnen (Subtraktion)");
                        System.out.println("c : Malrechnen (Multiplikation)");
                        System.out.println("d : Geteiltrechnen (Division)");
                        System.out.println("x : Zurück in das vorherige Menü");
                        Rechnung = scan.next().charAt(0);

                        switch (Rechnung) {
                            case 'a':   //Addition
                                System.out.println("Geben Sie eine Zahl ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie eine weitere Zahl ein, die zur ersten addiert werden soll.");
                                y = scan.nextDouble();
                                z = x + y;
                                System.out.println("Das Ergebnis lautet: " + z);
                                break;

                            case 'b':   //Subtraktion
                                System.out.println("Geben Sie eine Zahl ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie eine weitere Zahl ein, die von der ersten subtrahiert werden soll.");
                                y = scan.nextDouble();
                                z = x - y;
                                System.out.println("Das Ergebnis lautet: " + z);
                                break;

                            case  'c':  //Multiplikation
                                System.out.println("Geben Sie eine Zahl ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie eine weitere Zahl ein, welche mit der vorherigen multipliziert werden soll.");
                                y = scan.nextDouble();
                                z = x * y;
                                System.out.println("Das Ergebnis lautet: " + z);
                                break;

                            case 'd':   //Division
                                System.out.println("Geben Sie eine Zahl ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie eine weitere Zahl ein, welche die vorherige Zahl dividieren soll.");
                                y = scan.nextDouble();
                                z = x / y;
                                System.out.println("Das Ergebnis lautet: " + z);
                                break;

                            case 'x':
                                b = false;
                                break;

                            default:
                                System.out.println("Eingabe '" + Rechnung + "' nicht bekannt.");
                                break;
                        }
                    }
                    break;
                case  'b':  //Flächeninhalte Berechnen

                    while (b == true) {
                        System.out.println("Welche Fläche soll berechnet werden?");
                        System.out.println("a : Quadrat");
                        System.out.println("b : Rechteck");
                        System.out.println("c : Dreieck");
                        System.out.println("d : Parallelogramm");
                        System.out.println("e : Trapez");
                        System.out.println("f : Raute");
                        System.out.println("g : Deltoid (Drachenviereck)");
                        System.out.println("h : Kreis");
                        System.out.println("x : Zurück in das vorherige Menü");
                        Rechnung = scan.next().charAt(0);
                        String  Einheit;

                        switch (Rechnung) {
                            case 'a':   //Quadrat
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                z = x * x;
                                System.out.println("Der Flächeninhalt des Quadrats beträgt: " + z + " " + Einheit);
                                break;

                            case 'b':   //Rechteck
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = x * y;
                                System.out.println("Der Flächeninhalt des Rechtecks beträgt: " + z + " " + Einheit);
                                break;

                            case 'c':   //Dreieck
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = (x * y) / 2;
                                System.out.println("Der Flächerninhalt des Dreiecks beträgt: " + z + " " + Einheit);
                                break;

                            case 'd':   //Parallelogramm
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = x * y;
                                System.out.println("Der Flächeninhalt des Parallelogramms beträgt: " + z + " " + Einheit);
                                break;

                            case 'e': //Trapez
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'c' ein.");
                                c = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = (x + c) / 2 * y;
                                System.out.println("Der Flächeninhalt des Trapezes beträgt: " + z + " " + Einheit);
                                break;

                            case 'f': //Raute
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'e' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'f' ein.");
                                y = scan.nextDouble();
                                z = x * y / 2 ;
                                System.out.println("Der Flächeninhalt der Raute beträgt: " + z + " " + Einheit);
                                break;

                            case 'g':   //Deltoid
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'e' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'f' ein.");
                                y = scan.nextDouble();
                                z = x * y / 2 ;
                                System.out.println("Der Flächeninhalt des Deltoids beträgt: " + z + " " + Einheit);
                                break;

                            case 'h':   //Kreis
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm², dm², m²).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie den Radius ein.");
                                x = scan.nextDouble();
                                z = pi * ( x * x );
                                System.out.println("Der Flächeninhalt des Kreises beträgt: " + z + " " + Einheit);
                                break;

                            case 'x':

                                b = false;
                                break;

                            default:
                                System.out.println("Eingabe '" + Rechnung + "' nicht bekannt.");
                                break;
                        }

                    }

                    break;

                case 'c':   //Umfang berechnen

                    while (b == true) {
                        System.out.println("Welcher Umfang soll berechnet werden?");
                        System.out.println("a : Quadrat");
                        System.out.println("b : Rechteck");
                        System.out.println("c : Dreieck");
                        System.out.println("d : Parallelogramm");
                        System.out.println("e : Trapez");
                        System.out.println("f : Raute");
                        System.out.println("g : Deltoid (Drachenviereck)");
                        System.out.println("h : Kreis");
                        System.out.println("x : Zurück in das vorherige Menü");
                        Rechnung = scan.next().charAt(0);
                        String  Einheit;

                        switch (Rechnung) {
                            case 'a':   //Quadrat
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. mm, cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                z = 4 * x;
                                System.out.println("Der Umfang des Quadrats beträgt: " + z + " " + Einheit);
                                break;

                            case 'b':   //Rechteck
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = 2 * x + 2 * y;
                                System.out.println("Der Umfang des Rechtecks beträgt: " + z + " " + Einheit);
                                break;

                            case 'c':   //Dreieck
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. mm, cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                y = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'c' ein.");
                                c = scan.nextDouble();
                                z = x + y + c;
                                System.out.println("Der Umfang des Dreiecks beträgt: " + z + " " + Einheit);
                                break;

                            case 'd':   //Parallelogramm
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. mm, cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                y = scan.nextDouble();
                                z = 2 * x + 2 * y;
                                System.out.println("Der Umfang des Parallelogramms beträgt: " + z + " " + Einheit);
                                break;

                            case 'e':   //Trapez
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. mm, cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                y = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'c' ein.");
                                c = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'd' ein.");
                                d = scan.nextDouble();
                                z = x + y + c + d;
                                System.out.println("Der Umfang des Trapezes beträgt: " + z + " " + Einheit);
                                break;

                            case 'f':   //Raute
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. mm, cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                z = 4 * x;
                                System.out.println("Der Umfang der Raute beträgt: " + z + " " + Einheit);
                                break;

                            case 'g':   //Deltoid
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                y = scan.nextDouble();
                                z = 2 * ( x + y);
                                System.out.println("Der Umfang des Deltoids beträgt: " + z + " " + Einheit);
                                break;

                            case 'h':   //Kreis
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm, dm, m).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge des Durchmessers ein.");
                                x = scan.nextDouble();
                                z = pi * x ;
                                System.out.println("Der Umfang des Kreises beträgt: " + z + " " + Einheit);
                                break;

                            case 'x':

                                b = false;
                                break;

                            default:
                                System.out.println("Eingabe '" + Rechnung + "' nicht bekannt.");
                                break;
                        }
                    }

                    break;

                case 'd':   //Rauminhalt Berechnen

                    while (b == true) {
                        System.out.println("Welcher Rauminhalt soll berechnet werden?");
                        System.out.println("a : Würfel");
                        System.out.println("b : Quader");
                        System.out.println("c : Kegel");
                        System.out.println("d : Pyramide");
                        System.out.println("e : Kugel");
                        System.out.println("x : Zurück in das vorherige Menü");
                        String Einheit;
                        Rechnung = scan.next().charAt(0);

                        switch (Rechnung){
                            case 'a':   //Würfel

                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm³, dm³, m³).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Grundseite ein.");
                                x = scan.nextDouble();
                                z = x * x * x;
                                System.out.println("Der Rauminhalt des Würfels beträgt: " + z + " " + Einheit);
                                break;

                            case 'b':   //Quader
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm³, dm³, m³).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                y = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Seite 'c' ein.");
                                c = scan.nextDouble();
                                z = x * y * c;
                                System.out.println("Der Rauminhalt des Quaders beträgt: " + z + " " + Einheit);
                                break;

                            case 'c':   //Kegel
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm³, dm³, m³).");
                                Einheit = scan.next();
                                System.out.println("Geben Sie die Länge des Radius ein.");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie die Länge der Höhe ein.");
                                y = scan.nextDouble();
                                z = Drittel * pi * (x * x) * y;
                                System.out.println("Der Rauminhalt des Kegels beträgt: " + z + " " + Einheit);
                                break;

                            case 'd':   //Pyramide
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm³, dm³, m³).");
                                Einheit = scan.next();
                                int i = 0;
                                while (i == 0) {
                                    System.out.println("Ist die Grundfläche ein Quadrat (a), ein Rechteck (b) oder ein Dreieck (c)?");
                                    Grundflaeche = scan.next().charAt(0);
                                    switch (Grundflaeche) {
                                        case 'a':   //Quadrat
                                            System.out.println("Geben Sie die Länge der Grundseite ein.");
                                            x = scan.nextDouble();
                                            System.out.println("Geben Sie die Länge der Höhe ein.");
                                            y = scan.nextDouble();
                                            z = Drittel * (x*x) * y;
                                            System.out.println("Der Rauminhalt der quadratischen Pyramide beträgt: " + z + " " + Einheit);
                                            i = 1;
                                            break;

                                        case 'b':   //Rechteck
                                            System.out.println("Geben Sie die Länge der Seite 'a' ein.");
                                            x = scan.nextDouble();
                                            System.out.println("Geben Sie die Länge der Seite 'b' ein.");
                                            y = scan.nextDouble();
                                            System.out.println("Geben Sie die Länge der Höhe ein.");
                                            c = scan.nextDouble();
                                            z = Drittel * (x * y) * c;
                                            System.out.println("Der Rauminhalt der rechteckigen Pyramide beträgt: " + z + " " + Einheit);
                                            i = 1;
                                            break;

                                        case 'c':   //Kreis
                                            System.out.println("Geben Sie die Länge des Radius ein.");
                                            x = scan.nextDouble();
                                            System.out.println("Geben Sie die Länge der Höhe ein.");
                                            y = scan.nextDouble();
                                            z = Drittel * pi * (x * x) * y;
                                            System.out.println("Der Rauminhalt der kreisförmigen Pyramide beträgt: " + z + " " + Einheit);
                                            i = 1;
                                            break;

                                        case 'x':
                                            i = 1;
                                            break;

                                        default:
                                            System.out.println("'" + Grundflaeche + "' ist keine gültige Eingabe.");
                                            break;
                                }
                                }
                                break;

                            case 'e':   //Kugel
                                System.out.println("Geben Sie die Einheit ein, welche das Ergebnis haben soll (z.B. cm³, dm³, m³).");
                                Einheit = scan.next();
                                double VD = 1.3333333333333333333; // VD steht für Vier Drittel
                                System.out.println("Geben Sie die Länge des Radius ein.");
                                x = scan.nextDouble();
                                z = VD * pi * (x * x * x);
                                System.out.println("Der Rauminhalt der Kugel beträgt: " + z + " " + Einheit);
                                break;

                            case 'x':

                                b = false;
                                break;

                            default:
                                System.out.println("Eingabe '" + Rechnung + "' nicht bekannt.");
                                break;
                        }
                    }
                    break;

                case 'e':   //Prozentrechnen

                    while (b == true) {
                        System.out.println("a : Wie viel sind X von 100% ?");
                        System.out.println("b : 100% von X");
                        System.out.println("c : X% von X");
                        System.out.println("d : Bruttobetrag berechnen");
                        System.out.println("e : Nettobetrag berechnen");
                        System.out.println("f : Mehrwertssteuer berechnen");
                        System.out.println("x : Zurück in das vorherige Menü");
                        String Einheit;
                        Rechnung = scan.next().charAt(0);

                        switch (Rechnung) {
                            case 'a':
                                System.out.println("Welcher Betrag sind 100% ?");
                                x = scan.nextDouble();
                                System.out.println("Geben Sie ein, wie viel Prozent Sie von diesem Betrag wollen.");
                                y = scan.nextDouble();
                                z = x / 100 * y;
                                System.out.println(y + "% von " + x + " sind " + z);
                                break;

                            case 'b':
                                System.out.println("Geben Sie den Betrag ein, von dem Sie 100% wissen möchten");
                                x = scan.nextDouble();
                                System.out.println(x + " sind wie viel Prozent?");
                                y = scan.nextDouble();
                                z = x / y * 100;
                                System.out.println("100% von " + x + " sind " + z);
                                break;

                            case 'c':
                                System.out.println("Geben Sie einen Betrag ein.");
                                x = scan.nextDouble();
                                System.out.println("Wie viel Prozent entspricht der Betrag.");
                                y = scan.nextDouble();
                                System.out.println("Welcher Prozentbetrag soll daraus errechnet werden?");
                                c = scan.nextDouble();
                                z = x / y * c;
                                System.out.println(c + "% von " + x + " sind " + z);
                                break;

                            case 'd':   //Bruttobetrag
                                System.out.println("Geben Sie die Währung ein (€, $, etc.....)");
                                Einheit = scan.next();
                                System.out.println("Geben Sie den Nettobetrag ein.");
                                x = scan.nextDouble();
                                System.out.println("Wie viel Prozent Mehrwertsteuer gibt es?");
                                y = scan.nextDouble();
                                z = x * 119 / 100;
                                System.out.println("Der Bruttobetrag beträgt: " + z  + " " + Einheit);
                                break;

                            case 'e': //Nettobetrag
                                System.out.println("Geben Sie die Währung ein (€, $, etc.....)");
                                Einheit = scan.next();
                                System.out.println("Geben Sie den Bruttobetrag ein.");
                                x = scan.nextDouble();
                                System.out.println("Wie viel Prozent Mehrwertssteuer sind darin enthalten?");
                                y = scan.nextDouble();
                                z = x * 100 / (y + 100);
                                System.out.println("Der Nettobetrag beträgt: " + z + " " + Einheit);
                                break;

                            case 'f':   //Mehrwertssteuer
                                System.out.println("Geben Sie die Währung ein (€, $, etc.....)");
                                Einheit = scan.next();
                                System.out.println("Geben Sie einen Nettobetrag ein.");
                                x = scan.nextDouble();
                                System.out.println("Wie viel Prozent Mehrwertssteuer soll berechnet werden?");
                                y = scan.nextDouble();
                                z = x / 100 * y;
                                System.out.println(y + "% Mehrwertssteuer von " + x + " " + Einheit + " sind " + z + "%");
                                break;

                            case 'x':
                                b = false;
                                break;

                            default:
                                System.out.println("Eingabe '" + Rechnung + "' nicht bekannt.");
                                break;
                        }
                    }
                    break;

                case 'x' :
                    a = false;
                    break;

                default:
                    System.out.println("Eingabe '" + Aktion + "' nicht bekannt.");
                    break;
            }
            }
        }
    }