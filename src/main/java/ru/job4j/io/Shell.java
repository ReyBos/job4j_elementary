package ru.job4j.io;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    private List<String> rsl;

    public Shell() {
        this.rsl = new ArrayList<>();
        rsl.add("/");
    }

    public void cd(String path) {
        switch (path) {
            case "/":
                rsl.clear();
                rsl.add("/");
                break;
            case "..":
                if (rsl.size() > 1) {
                    rsl.remove(rsl.size() - 1);
                }
                break;
            default:
                String[] dirs = path.split("/");
                if (dirs.length > 1) {
                    for (int i = 0; i < dirs.length; i++) {
                        if (dirs[i].equals("")) {
                            continue;
                        }
                        cd(dirs[i]);
                    }
                } else {
                    if (!rsl.get(rsl.size() - 1).equals("/")) {
                        rsl.add("/");
                    }
                    rsl.add(path);
                }
        }

        String[] pathArr = path.split("/");
        for (int i = 0; i < pathArr.length; i++) {
            System.out.print(pathArr[i] + " ");
        }
        System.out.println(pathArr.length);
    }

    public String pwd() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < rsl.size(); i++) {
            str.append(rsl.get(i));
        }
        return str.toString();
    }
}
