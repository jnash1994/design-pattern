package singletonPattern;
/*
靜態內部類實現
當Singleton5類被加載時，靜態內部類SingletonHolder沒有被加載進內存，只有當調用
getUniqueInstance()方法從而觸發 SingletonHolder.INSTANCE 時 SingletonHolder 才會
被加載，此時初始化INSTANCE 實例，並且JVM能確保INSTANCE只被實例化一次
這種方式不僅具有延遲初始化的好處，而且由JVM提供了對執行緒安全的支持
 */
public class Singleton5 {
private Singleton5(){

}
private static class SingletonHolder{
    private static final Singleton5 INSTANCE = new Singleton5();
}
public static Singleton5 getUniqueInstance(){
    return SingletonHolder.INSTANCE;
}


}
