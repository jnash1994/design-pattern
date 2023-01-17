package singletonPattern;

public class Test {
    public static void main(String[] args) {
        Singleton S1=Singleton.getUniqueInstance();
        Singleton S2=Singleton.getUniqueInstance();
        Singleton S3=Singleton.getUniqueInstance();
        Singleton S4=Singleton.getUniqueInstance();

    }


}
