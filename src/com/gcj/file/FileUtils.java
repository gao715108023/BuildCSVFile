package com.gcj.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    public void writeFile(String filePath, List<String> userNameList) {
        BufferedWriter bufferedWriter = null;
        File file = new File(filePath);

        try {
            if (file.exists()) {
                bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            } else {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
            }
            for (String userName : userNameList) {
                bufferedWriter.write(userName + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
