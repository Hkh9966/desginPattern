package simpleFactory;

import java.io.*;

public class Factory {

    /**
     * 获取BufferedReader
     * @param path
     * @param bytes
     * @return
     */
    public static BufferedReader getBufferedReader(String path,String bytes){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader =  new BufferedReader(new InputStreamReader(new FileInputStream(path),bytes));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }

    public static Util getUtil(String name){
        if(name.equals("gun")){
            return new Gun();
        }else if(name.equals("knife")){
            return new Knife();
        }else {
         return null;
        }
    }
}
