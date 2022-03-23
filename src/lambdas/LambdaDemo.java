package lambdas;

import java.lang.constant.Constable;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void show(){
        //
        //greet(message-> System.out.println(message));
        //var list= List.of(1,2,3,4,5,7,8,9,10,11,12);
//
        //// to print all the elements of the list that greater than 5 ?
//
//
        ////// HOW ?
        ////for(var number : list){
        ////    System.out.println(number);
        ////}
////
        ////// WHAT?
        ////list.forEach(numb-> System.out.println(numb));
        //
        //for(var n : list){
        //    if(n>5)
        //        System.out.println(n);
        //}
//
        //list.forEach((nu)-> {if(nu>5)System.out.println(nu);});
        //var names = List.of("gery","Liran","shAi","nAamA");
        //Consumer<String> printConsumer=name-> System.out.println(name);
        //Consumer<String> lowerCasePrint=name-> System.out.println(name.toLowerCase());
        //Consumer<String> upperCasePrint=name-> System.out.println(name.toUpperCase());
//
        //names.forEach(printConsumer.andThen(
        //        hodi-> System.out.println(hodi.length())
        //));\
        //RandomGenerator r= new RandomGenerator();
        //r.get();

        //int double long char boolean
        //Integer Double Long Character Boolean

       // System.out.println(Integer.MIN_VALUE);
//
//
       // Supplier<Double> getRandom= () -> Math.random();
       // System.out.println(getRandom.get());
//
        //Function <String,Integer> lenMap = text -> text.length();
        //var ans=lenMap.apply("sky");
        //System.out.println(ans);
        // "key:value"
        //  first : "key:value" ->  "key=value"
        //  second "key:value" ->  "{key:value}"
        //  "{key = value}"

        Function<String,String> replacecolon= str -> str.replace(":","=");
        Function<String,String> addCurlyBraces= str-> "{"+str+"}";

        var res=replacecolon.andThen(addCurlyBraces).apply("name:hodi");
        var res1= addCurlyBraces.compose(replacecolon).apply("hodi:id");
        System.out.println(res);
    }
    public static void greet (Printer printer){
        printer.print("boker tooov");
    }
}
