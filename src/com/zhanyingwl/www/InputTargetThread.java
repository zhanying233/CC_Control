package com.zhanyingwl.www;

import java.util.Scanner;

public class InputTargetThread extends Thread {
    static String URL = Runner.URL;

    @Override
    public void run() {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            URL = scanner.next();
            if (URL.equals("none")) {
                System.out.println("[-] 战鹰网络 - CC 控制端：已停止攻击！（若之前有攻击，则可能会有缓冲！）");
            } else {
                System.out.println("[+] 战鹰网络 - CC 控制端：您输入的目标URL - " + URL);
            }

        }

    }
}