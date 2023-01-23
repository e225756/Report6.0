package jp.ac.uryukyu.ie.e225756;

public class Uranai3 {
    public static void seinengapi(){
        System.out.println("ここは生年月日を使って占うことができます。あなたの生年月日を8桁で入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        String str = Integer.toString(input); 
        String[] resultArray = new String[8];
        resultArray = str.split("");  //文字列を分割して配列化する
        int[] numbers = new int[8];
        for(int i = 0; i < resultArray.length; i++){
         numbers[i] = Integer.parseInt(resultArray[i]);  //文字列int型配列に代入
        }
        int result = calc(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7]);
        System.out.println("あなたの番号は"+result+"です。");
        if (result == 1){
            System.out.println("番号が１のあなたは、、アイデアマン　タイプです");
            System.out.println("アイデアマンタイプのあなたは、簡単に、新しいアイデアが浮かぶアイデアマン。そのため、他人に対し大きな態度をとってしまいがち。また、他人のアイデアを受け入れることが難しく、トラブルになってしまうことも");
            Uranaifin.Fin();
        }else if (result == 2){
            System.out.println("番号が２のあなたは、、平和主義者　タイプです");
            System.out.println("平和主義タイプのあなたは、社交的で、人と付き合うことが上手。他人が何を欲しているかを察することが上手く、自分よりも他人を優先します。ひとりぼっちになるのが嫌いで、友達関係を大切にします。またシャイな一面も。この数字を持つ人は、もっと自分を大切にすることを意識してみてください");
            Uranaifin.Fin();
        }else if (result == 3){
            System.out.println("番号が３のあなたは、、お祭り好き　タイプです");
            System.out.println("お祭り好きなあなたは、クリエイティブで社交的、誰とでも仲良くできるのが特徴。最後まで何かを成し遂げることが難しい傾向にありますが、他人を幸せにするために努力を惜しまない性格の持ち主。人気者になる傾向が高いですが、現実的なものの見方ができないこともあるため、注意が必要");
            Uranaifin.Fin();
        }else if (result == 4){
            System.out.println("番号が４のあなたは、、保守的　タイプです");
            System.out.println("保守的なあなたは、伝統や習慣、そして秩序を大切にする保守的な性格です。また、勤勉で、自然やアウトドアでの活動を好みます。この数字を持つ人は、頑固な一面があるので、他人に対して臨機応変に対応する努力が必要かも");
            Uranaifin.Fin();
        }else if (result == 5){
            System.out.println("番号が５のあなたは、、パイオニア　タイプです");
            System.out.println("既存の概念に縛られず、新しいことを追求します。自分のスタイルを貫く傾向があるため、他人とトラブルを起こすことも。人との付き合い方を学ぶ必要があるでしょう");
            Uranaifin.Fin();
        }else if (result == 6){
            System.out.println("番号が６のあなたは、、ロマンチスト　タイプです");
            System.out.println("ロマンチストタイプのあなたは、誰かに必要とされ、いつも幸せな気持ちでいたいロマンチスト。家族の絆を大切にし、いつも彼らを気にかけます。誠実で、教師などの職に向いています。ただし、真面目すぎるのにも注意が必要。変えられないことではなく、変えることができるものを探しましょう");
            Uranaifin.Fin();
        }else if (result == 7){
            System.out.println("番号が７のあなたは、、インテリ　タイプです");
            System.out.println("インテリタイプのあなたは、未だ発見されていない、新たな知識を探る研究者です。何か新しいことを見つけた時は、世界中に広めようとします。感情に左右されることなく、論理的に決断します。ゆっくりと、着実に進むことが大切だと考えています。とても冷静で、あまり自分のことを明かそうとしません。世の中の人が、自分と同じようなことに興味を持っていないことを忘れないように！");
            Uranaifin.Fin();
        }else if (result == 8){
            System.out.println("番号が８のあなたは、、大物　タイプです");
            System.out.println("大物タイプのあなたは、問題を解決することが得意な人。専門家として問題を高いレベルで解決します。プライドを持って仕事をするのはよいことですが、権力に捉われないように注意を");
            Uranaifin.Fin();
        }else if (result == 9){
            System.out.println("番号が９のあなたは、、エンターテイナー　タイプです");
            System.out.println("エンターテイナータイプのあなたは、人々を楽しませることが大好き。他の人々のことを気にかけ、自分を犠牲にしても、彼らを助けようとします。人に好かれる性格ですが、他人からの影響を受けやすい一面も。人の意見を大切にすることは大事ですが、自立することを学ぶことも必要です");
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
