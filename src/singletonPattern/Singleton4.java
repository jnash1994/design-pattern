package singletonPattern;
/*
雙重教驗所-執行緒安全
 uniqueInstance 只需要被實例化一次，之後就可以直接使用了，加鎖操作只需要對
 實例化那部分的代碼進行，只有當uniqueInstance沒有被實例化時，才需要進行加鎖
 雙重教驗所先判斷 uniqueInstance是否已經被實例化，如果沒有被實例化，那麼才對
 實例化語句進行加鎖。
 uniqueInstance採用volatile關鍵字修飾也是很有必要的，
 uniqueInstance=new Singleton4()，這段代碼其實是分為三部執行:
 1.為uniqueInstance分配內存空間
 2.初始化uniqueInstance
 3.將uniqueInstance指向分配的內存地址
但是由於JVM具有指令重排的特性，執行順序有可能變成1>3>2，指令重排在單執行緒
環境下不會出現問題，但是在多執行緒環境下會導致一個執行緒獲得位有初始化的實例
例如:執行緒T1執行了1和3，此時T2 uniqueInstance還沒被初始化
使用volatile 可以禁止JVM的指令重排，保證在多執行緒環境下也能正常運行

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
