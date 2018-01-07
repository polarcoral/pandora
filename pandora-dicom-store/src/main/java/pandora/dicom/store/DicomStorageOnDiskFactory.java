package pandora.dicom.store;

import monica.framework.Storage;
import monica.framework.storage.AbstractStorageFactory;

public class DicomStorageOnDiskFactory extends AbstractStorageFactory{
	private static Storage diskStorage = new DicomStorageOnDisk();
	
	
	@Override
	public Storage newStorageInstance() {
		if(null == diskStorage){
			diskStorage = new DicomStorageOnDisk();
		}
		return diskStorage;
	}

}
