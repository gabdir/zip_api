public class Main {
    public static void main(String[] args) throws ArchiveException {

        ZIPAPI api = new ZIPAPI();

        String filePath1 = "path1";
        String filePath2 = "path2";

        // ## Basics ##
        api.archive(filePath1);
        api.unarchive(filePath1);


    }
}
