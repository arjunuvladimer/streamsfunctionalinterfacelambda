package com.lambda;

public class WellWisher {

    public static void sayHello(Language language){
        language.wish();
    }

//    public static int someFunction(){
//        int a = 10;
//        int b = 11;
//
//
//        return 10;
//    }





    public static void main(String args[]){
        sayHello( () -> System.out.println("Namashkar"));
        sayHello( () -> System.out.println("Hello how are you?"));
        sayHello( () -> System.out.println("Namastey?"));
    }

}


// Object Oriented Approach

//        Language englishObj = new English();
//        sayHello(englishObj);
//
//        Language hindiObj = new Hindi();
//        sayHello(hindiObj);
//
//        Language maratiObj = new Marati();
//        sayHello(maratiObj);

// Anonymous Class Objects

//        sayHello(new Language() {
//            @Override
//            public void wish() {
//                System.out.println("Namashkar");
//            }
//        });
//
//        sayHello(new Language() {
//            @Override
//            public void wish() {
//                System.out.println("Hello how are you?");
//            }
//        });
