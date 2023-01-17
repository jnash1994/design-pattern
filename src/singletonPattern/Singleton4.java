package singletonPattern;
/*
雙重教驗所-執行緒安全
 uniqueInstance 只需要被實例化一次，之後就可以直接使用了，加鎖操作只需要對
 實例化那部分的代碼進行，只有當uniqueInstance沒有被實例化時，才需要進行加鎖
 雙重教驗所先判斷 uniqueInstance是否已經被實例化，如果沒有被實例化，那麼才對
 實例化語句進行加鎖。
 */
public class Singleton4 {
private volatile static Singleton4 uniqueInstance;
private Singleton4(){

}
public static Singleton4 getUniqueInstance(){
    if(uniqueInstance==null){
        synchronized (Singleton4.class){
             if(uniqueInstance==null){
                 uniqueInstance=new Singleton4();
             }
        }
    }
    return uniqueInstance;
}


}
