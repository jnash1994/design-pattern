package singletonPattern;
/*
lazy instantiation
執行緒不安全寫法
這種寫法在多執行緒是不安全的，如果多個執行緒同時注入  if(uniqueInstance==null)，
且此時uniqueInstance為null，那麼會有多個執行緒執行uniqueInstance=new Singleton();，
這將導致實例化多次uniqueInstance。
 */
public class Singleton {
private static Singleton uniqueInstance;

    private Singleton() {
    }
    public static Singleton getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
            System.out.println("實例化成功!!");
        }else{
            System.out.println("已有物件!!實例化失敗");
        }
        return uniqueInstance;
    }



}
