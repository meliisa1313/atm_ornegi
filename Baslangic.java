package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int select;
        int yatanPara,cekilenPara;
        int balance=1000;
        int deneme=3;
    while(deneme<=3){
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.println("adiniz nedir");
        userName = input.nextLine();
        System.out.println("sifreniz nedir");
        password = input.nextLine();

        if (userName.equals("tash sultana") && (password.equals("tash123"))) {
            System.out.println("bankamiza hosgeldiniz");
            System.out.println("yapmak istediginiz islem nedir");
            System.out.println("1-para yatirm\n"+
                    "2-para cekme\n"+
                    "3-sorgulama\n"+
                    "4-cikis\n");
            select=input.nextInt();
            switch(select){
                case 1:System.out.println("ne kadar para yatiricakiniz");
            yatanPara= input.nextInt();
            balance=balance+yatanPara;
            System.out.println(balance);
            break;
            case 2:
                System.out.println("ne kadar para cekiceksiniz");
                cekilenPara=input.nextInt();
                balance=balance-cekilenPara;
                System.out.println(balance);
            break;
            case 3:
                    System.out.println("hesap bakiyeniz:"+balance);
                    break;
            case 4:
                System.out.println("sistemden ciktiniz...Iyi gunler!");
                break;
                default:
                    break;}
                    break;

        } else {
            System.out.println("hatali giris yaptiniz");
            System.out.println("kalan dogru bilme hakkiniz" + deneme--);
            if(deneme==0){
                System.out.println("kart bloke oldu lutfen bankayla iletisime geciniz");
            }

        }
    }








    }


    }




