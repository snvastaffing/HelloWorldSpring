package org.snva.hws.designpatterns.creational;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUtils {

    private static ReadUtils readUtils=null;

    private BufferedReader bufferedReader;
    // no developer can create the instance of this
    private  ReadUtils(){
//        readUtils = new ReadUtils();
    }


    public static ReadUtils getInstance(){
        if (readUtils==null){
            readUtils= new ReadUtils();
        }
        return readUtils;
    }

    public String readString(String userMgs, String errMsg){
        String line ="";
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(userMgs);
            line=bufferedReader.readLine();
            if (StringUtils.isEmpty(line.trim())){
                System.out.println(errMsg+" The line entered is empty");
                readString(userMgs,errMsg);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}
