// package javapgms.innerclasstypes;

 class Directory {
    String directory = "mainFolder-subFolder-fileName";

    class AboutDirectory {
        String os="windows";
        String fileName() {
            return directory.split("-")[2];
        }
        String subFolderName() {
            return directory.split("-")[1];
        }
        String folderName() {
            return directory.split("-")[0];
        }
        String OsName() {
            return this.os;
        }

    }
}

public class Driver {
    public static void main(String[] args) {

        Directory d1 = new Directory();
        System.out.println(d1.new AboutDirectory().fileName());
        System.out.println(d1.new AboutDirectory().subFolderName());
        System.out.println(d1.new AboutDirectory().folderName());
System.out.println(d1.new AboutDirectory().OsName());


    }
}