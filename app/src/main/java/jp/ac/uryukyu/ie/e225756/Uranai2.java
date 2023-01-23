package jp.ac.uryukyu.ie.e225756;

public class Uranai2 {
    
    public static void Kenki(){
        System.out.println("…");
        System.out.println("ようこそ！ここは、あなたの属性を占うことができます");
        System.out.println("それでは、あなたの生年月日を８桁で入力をおねがします");
        System.out.println("例:20030711");
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println(input + "ですね！少々お待ちください…");
        String str = Integer.toString(input); 
        String[] resultArray = new String[8];
        resultArray = str.split("");  //文字列を分割して配列化する
        int[] numbers = new int[8];
        for(int i = 0; i < resultArray.length; i++){
         numbers[i] = Integer.parseInt(resultArray[i]);  //文字列int型配列に代入
        }
        int result = calc(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7]);
        System.out.println("あなたの番号は"+result+"です。");

        if (result == 1 || result == 6){
            System.out.println("番号が"+result+"のあなたは、、");
            System.out.println("【地】属性の人です");
            System.out.println("【地】のあなたは、真面目で物事に一生懸命向き合うタイプ。とても落ち着いた性格をしています。誰に対しても誠実に接していくので、周囲の人から信頼されやすいでしょう。真面目過ぎて融通が利かない一面もあります");
            System.out.println("相性が良い属性は、地・火・風の人になります。相性が悪い属性は、水と空の人になります");
            Uranaifin.Fin();
        }else if(result == 2 || result == 8){
            System.out.println("番号が"+result+"のあなたは、、");
            System.out.println("【水】属性の人です");
            System.out.println("【水】のあなたは、愛情深く思いやりがあるタイプ。その場の空気を瞬時に読み取り、他人に対して優しく接していくことができる人です。相手の立場に立って物事を考えることができ、柔軟な人が多いでしょう。誰かのためになることをするのが好きで、面倒見がよい人です");
            System.out.println("相性が良い属性は、水・空・風の人になります。相性が悪い属性は、地と火の人になります");
            Uranaifin.Fin();
        }else if(result == 3 || result == 7){
            System.out.println("番号が"+result+"のあなたは、、");
            System.out.println("【火】属性の人です");
            System.out.println("【火】のあなたは、明るくエネルギーに満ち溢れた情熱的なタイプ。いつも気持ちは前向きで、周囲の人を引っ張っていくリーダー気質な人が多いでしょう。自分を突き動かす原動力でもある情熱に従って、思いついたら行動します。熱い気持ちを持っていますが、感情の起伏が激しいところがあります。");
            System.out.println("相性が良い属性は、火・地・空の人になります。相性が悪い属性は、水と風の人になります");
            Uranaifin.Fin();
        }else if(result == 4 || result == 9){
            System.out.println("番号が"+result+"のあなたは、、");
            System.out.println("【風】属性の人です");
            System.out.println("【風】のあなたは、何者にも束縛されない自由を愛する人です。自分が興味を持ったこと、好きなことに対して集中して取り組んでいきたいタイプです。周りから憧れられることを嫌い、自分で責任を負った上で好きな生き方を選択していきたいという思いが強いでしょう");
            System.out.println("相性が良い属性は、風・地・水の人になります。相性が悪い属性は、火と空の人になります");
            Uranaifin.Fin();
        }else if(result == 5){
            System.out.println("番号が"+result+"のあなたは、、");
            System.out.println("【空】属性の人です");
            System.out.println("【空】のあなたは、、世話好きで思いやりに溢れるタイプ。無意識に周りの状況を見て行動していくことができます。不思議と周囲の人を惹きつける魅力を持っています。何を考えているかわからないミステリアスな人もいるでしょう");
            System.out.println("相性が良い属性は、空・水・火の人になります。相性が悪い属性は、風と地の人になります");
            Uranaifin.Fin();
          }
        }


    public static int calc(int a, int b, int c, int d, int e, int f, int g, int i) {
        int result1 = a + b + c + d + e + f + g + i;
        if (result1 < 10){  //初回の結果が１桁の場合はここで終了
         return result1;
       } else {   //初回の計算結果が2桁になった場合は、もう一度計算する
         String str2 = Integer.toString(result1);
         String[] resultArray2 = new String[2];
         resultArray2 = str2.split("");
         int j = Integer.parseInt(resultArray2[0]);
         int k = Integer.parseInt(resultArray2[1]);
         int result2 = j + k;
         if ( result2 <= 9 ){ //2回目の結果が1桁ならここで終了
           return result2;
       }else {  //そうでない場合は、もう一度計算
           int result3 = 0;
           switch(result2){
               case 10:
               result3= 1;
               break;
               case 11:
               result3 = 2;
               break;
               case 12:
               result3 = 3;
               break;
           }
           return result3;
       }
   }
 }
}
