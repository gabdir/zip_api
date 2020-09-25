public interface IArchive {

    // ## Archivation ##
    public int archive(String path) throws ArchiveException;
    public int archive(String path, String outputName);
    public int archive(String path, String outputName, Algorithm algo);

    public int archiveMany(String[] paths);
    public int archiveMany(String[] paths, Algorithm algo);

    // ## Unarchivation ##
    public int unarchive(String archivePath);
    public int unarchive(String archivePath, String outputPath);
    public int unarchive(String archivePath, String outputPath, Algorithm algo);

    public int unarchiveMany(String[] paths);
    public int unarchiveMany(String[] paths, Algorithm algo);

    // ## Unarchivation by chunks ##
    public int unarchiveChunk(String archivePath, int chunkSize);
    public int unarchiveChunk(String archivePath, String outputPath, int chunkSize);
    public int unarchiveChunk(String archivePath, String outputPath, Algorithm algo, int chunkSize);

    //check Algorithm
    public Algorithm checkAlgo(String archivePath);

    public enum Algorithm {
        TAR,
        GZ,
        BZ2,
        ZIP,
        _7Z,
        RAR
    }

}
