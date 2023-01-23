package jp.ac.uryukyu.ie.e225756;

public class Uranai{
/*
 * 占いを始める、名前入力、占い選択
 */
    public static void main(String[]args){
        System.out.println("占いの館へようこそ");
        System.out.println("あなたのお名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println(name + "さんですね");
        System.out.println("ここでは以下の占いができます");
        System.out.println ("1:おみくじ,2:繭気属性占い,3:生年月日占い");
        System.out.println("やりたいものの数字をご入力ください");
        int number = new java.util.Scanner(System.in).nextInt();
        if (number == 1){
            System.out.println("おみくじですね、かしこまりました");
            System.out.println("それではお楽しみください");
            System.out.println("…");
            Uranai1.omikuji();
        } else if (number == 2){
            System.out.println("繭気属性占いですね、かしこまりました");
            System.out.println("それではお楽しみください");
            System.out.println("…");
            Uranai2.Kenki();
        } else if (number == 3){
            System.out.println("生年月日占いですね、かしこまりました");
            System.out.println("それではお楽しみください");
            System.out.println("…");
            Uranai3.seinengapi();
        } 
    }

    public static void start(){
        System.out.println("開始します");
        Uranai.main(null);
    }

}