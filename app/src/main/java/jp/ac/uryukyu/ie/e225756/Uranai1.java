package jp.ac.uryukyu.ie.e225756;

import java.util.Random;
/*
 * おみくじランダム生成
 */
public class Uranai1 {
    public static void omikuji(){
        System.out.println("ようこそ！それでは、引いてください！");
        System.out.println("…");
        int  r = new java.util.Random().nextInt(4);
        if (r == 0){
            System.out.println("…");
            System.out.println("あなたの運勢は…");
            System.out.println("大吉:心静かに過ごすべし　流れに身を任せれば全て吉報へ向かう");
            System.out.println("願望 多く望まなければ、叶う");
            System.out.println("恋愛 迷うことなかれ 心に決めた人が最上");
            System.out.println("学問 努力しただけ 力になる");
            System.out.println("病気 気になる箇所は早めに医師に診せろ");
            System.out.println("…");
            System.out.println("…");
            Uranaifin.Fin();
        }else if (r == 1){
            System.out.println("…");
            System.out.println("あなたの運勢は…");
            System.out.println("吉:明るい光が射し何かが芽生える兆しあり");
            System.out.println("願望 焦ることなかれ 機は来る");
            System.out.println("恋愛 年齢などにとらわれる必要なし");
            System.out.println("学問 伸びる時期 努力せよ");
            System.out.println("病気 異変を感じたら迷わず休め");
            System.out.println("…");
            System.out.println("…");
            Uranaifin.Fin();

        }else if (r == 2){
            System.out.println("…");
            System.out.println("あなたも運勢は…");
            System.out.println("末吉:今ひとつ納得いかない時　平穏を守る方はいいでしょう");
            System.out.println("願望 叶うまで時間がかかる");
            System.out.println("恋愛 告白は しばらく待て");
            System.out.println("学問 歩みは遅いが 着実に実る");
            System.out.println("病気 体を休ませる時間をきちんととるべし");
            System.out.println("…");
            System.out.println("…");
            Uranaifin.Fin();
        }else if (r == 3){
            System.out.println("…");
            System.out.println("あなたの運勢は…");
            System.out.println("凶:焦るべからす　じっくり力を蓄えるべき");
            System.out.println("願望 膨らませるは自由 叶うはあなた次第");
            System.out.println("恋愛 今叶わなくとも、いつか縁あり");
            System.out.println("学問 今回は諦め、次回に切り替えるべし");
            System.out.println("病気 医師はしっかり選べ");
            System.out.println("…");
            System.out.println("…");
            Uranaifin.Fin();
    }
    
}
}