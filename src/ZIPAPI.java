import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZIPAPI implements IArchive {
	
	@Override
	public int archive(String path) throws ArchiveException {
		try {
			FileInputStream f = new FileInputStream(path);
			// Archivation...
            f.close();
		}
		catch (FileNotFoundException err) {
			throw new ArchiveException("File \"" + path + "\" was not found", err);
		}
		catch (IOException err) {
			throw new ArchiveException("File \"" + path + "\" cannot be accessed", err);
		}

		return 0;
	}

	@Override
	public int archive(String path, String outputName) {
		checkAlgo(outputName);
		return 0;
	}

	@Override
	public int archive(String path, String outputName, Algorithm algo) {
		return 0;
	}

	@Override
	public int archiveMany(String[] paths) {
		return 0;
	}

	@Override
	public int archiveMany(String[] paths, Algorithm algo) {
		return 0;
	}

	@Override
	public int unarchive(String archivePath) {
		checkAlgo(archivePath);
		return 0;
	}

	@Override
	public int unarchive(String archivePath, String outputPath) {
		checkAlgo(archivePath);
		return 0;
	}

	@Override
	public int unarchive(String archivePath, String outputPath, Algorithm algo) {
		return 0;
	}

	@Override
	public int unarchiveMany(String[] paths) {
		return 0;
	}

	@Override
	public int unarchiveMany(String[] paths, Algorithm algo) {
		return 0;
	}

	@Override
	public int unarchiveChunk(String archivePath, int chunkSize) {
		checkAlgo(archivePath);
		return 0;
	}

	@Override
	public int unarchiveChunk(String archivePath, String outputPath, int chunkSize) {
		checkAlgo(archivePath);
		return 0;
	}

	@Override
	public int unarchiveChunk(String archivePath, String outputPath, Algorithm algo, int chunkSize) {
		return 0;
	}

	@Override
	public Algorithm checkAlgo(String archivePath) {return null;}

}
