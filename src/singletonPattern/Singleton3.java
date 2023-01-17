package singletonPattern;
/*
只需要對getUniqueInstance()方法加鎖，那麼在一個時間裡只能有一個執行緒能進入該方法，
從而避免了實例化多次  uniqueInstance，但是當一執行緒進入該方法後，其他試圖進入該方法
的執行緒都必須等待，即使uniqueInstance已經被實例化了，這會執行緒阻塞，因此該方法有性能
問題，不推薦使用
 */
public class Singleton3 {
    private static Singleton3 uniqueInstance;
    private Singleton3(){

    }
    public static synchronized Singleton3 getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton3();
        }
       return uniqueInstance;
    }

}
