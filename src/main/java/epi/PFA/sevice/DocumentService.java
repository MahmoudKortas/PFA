package epi.PFA.sevice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import epi.PFA.entities.Document;
import epi.PFA.repository.DocumentRepository;

@Service

public class DocumentService {
	@Autowired
	DocumentRepository documentRepository;

	public List<Document> getAllDocuments() {

		return documentRepository.findAll();
	}

	public Document persistDocument(Document p, MultipartFile mf) {
		if (mf != null) {
			String nomPhoto = uploadImage(mf);
			p.setPhoto(nomPhoto);
		}
		return documentRepository.save(p);
	}

	public void deleteDocument(Long id) {
		documentRepository.deleteById(id);

	}

	public Document findDocumentById(Long id) {
		return documentRepository.findById(id).get();
	}

	public String uploadImage(MultipartFile mf) {
		String nomPhoto = mf.getOriginalFilename();
		String tab[] = nomPhoto.split("\\.");
		String newName = tab[0] + System.currentTimeMillis() + "." + tab[1];
		Path p = Paths.get(System.getProperty("user.home") + "/Images/pfe/", newName);

		try {
			Files.write(p, mf.getBytes());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return newName;

	}

	public void saveDocument(Document p, MultipartFile mf) {
		if (mf != null) {
			String nomPhoto = uploadImage(mf);
			p.setPhoto(nomPhoto);
		}
		documentRepository.save(p);
	}
	

	public byte[] getImage(Long id) {
		String path = System.getProperty("user.home") + "/Images/pfe/";
		Path p = Paths.get(path, findDocumentById(id).getPhoto());
		try {
			return Files.readAllBytes(p);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
