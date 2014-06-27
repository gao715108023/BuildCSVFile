package com.gcj.main;

import com.gcj.file.FileUtils;
import com.gcj.rand.BuildRandUserName;

import java.util.List;

public class BuildTXTMain {

    public void startRunning(String basic, int numbers, String fileName) {
        BuildRandUserName buildRandUserName = new BuildRandUserName(basic, numbers);
        System.out.println("正在生成随机用户名，请等待......");
        List<String> userNameList = buildRandUserName.buildUserName();
        System.out.println("随机用户名生成OK！");
        System.out.println("正在将生成的用户名写入文件，请等待......");
        writeToFile(fileName, userNameList);
        System.out.println("写入完成OK！");
    }

    private void writeToFile(String fileName, List<String> userNameList) {
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile(fileName, userNameList);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BuildTXTMain buildTXTMain = new BuildTXTMain();
        buildTXTMain.startRunning("dzhdv116_", 2000, "userIdList5.txt");
    }
}
