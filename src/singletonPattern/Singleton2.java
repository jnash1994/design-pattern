package singletonPattern;
/*
這個是執行緒安全的，因為實例再被調用之前已經生成，而且不可變，缺點是浪費資源，因為被調用
時已經佔用內存
 */
public class Singleton2 {
     //直接實例化
    private static final Singleton2 UNIQUEINSTANCE=new Singleton2();
     private Singleton2(){

     }
     public static Singleton2 getInstance() {
        return UNIQUEINSTANCE;
    }

}
