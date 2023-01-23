package jp.ac.uryukyu.ie.e225756;

public class Uranaifin {
    public static void Fin(){
        System.out.println("…");
        System.out.println("…");
        System.out.println("結果はどうでしたか？楽しめましたか？");
        System.out.println("ホームに戻りますか？終了しますか？");
        System.out.println("１：続ける　２：終了する");
        int input = new java.util.Scanner(System.in).nextInt();
        if (input == 1){
            System.out.println("ホームに戻ります");
            System.out.println("…");
            System.out.println("…");
            Uranai.main(null);
        }else if (input == 2){
            System.out.println("終了します");
        }else if(input != 1 && input != 2){
            System.out.println("エラーです。もう一度入力してください");
            Uranaifin.Fin();
        }
        }
    }

