package pandora.dicom.store;

import monica.framework.transport.TransportFile;
import monica.storage.filesystem.StorageOnDisk;

public class DicomStorageOnDisk extends StorageOnDisk {
	@Override
	public void storage(TransportFile receivedFile) {
		System.out.println("here is dicomStorageOnDisk");
	}
	
}
