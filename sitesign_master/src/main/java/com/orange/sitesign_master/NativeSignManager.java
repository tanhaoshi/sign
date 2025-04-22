package com.orange.sitesign_master;

/**
 * create by ths on 2020/10/21
 */
public class NativeSignManager {

    public static NativeSignManager sNativeSignManager;

    public static NativeSignManager getInstance(){
        if(sNativeSignManager == null){
            sNativeSignManager = new NativeSignManager();
        }
        return sNativeSignManager;
    }

    static {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();

//    public String stringFromJNI(){
//        return "MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAorRVJ10fYG2M/cYMXCzqPJ7g35EMZhoBjcEiXZ4+R8jsLQ6LLFyM/5s8yBPzwZfEq/KKPz+Ka3mYJKbDeVCo/wIDAQABAkB2Itvlbf8XQ9Poe0GEN/SHuZBro+TNyboxE/eA5CIyeem8Sp4OFzXo1jCKfitekA765ThsvGnT4csVdRbV8wEJAiEA+CaTwx7viFxpaD+nCk5N7wKxCF7z2Qk3IphHAfpSExMCIQCn2di00jE7XGwXh6Q7znVYCV8DmcLpo6i4L+jhlM4j5QIhAOiJFexBgAsTNf9nrntc13EC36xNdkpKdW0or1muHd0bAiBRt2sbTSGOxsYRBoZcX30daSKKvDb6TCT91sVH3YwmSQIgDretKnU2Y6rLqlUxQNnBYZIau/ksGBy4aYbfkFZvnC4=";
//    }
}
