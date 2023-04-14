package org.example;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        aesEncryption test = new aesEncryption();
        SecretKey secretKey = aesEncryption.generateKey(128);
        IvParameterSpec iv= aesEncryption.generateIv();
        String last= aesEncryption.encrypt("AES/CBC/PKCS5Padding","esteds",secretKey,iv);
        System.out.println(last);




       //String end =  aesEncryption.decrypt("AES/CBC/PKCS5Padding",last,secretKey,iv);
        //System.out.println(end);


    }
}