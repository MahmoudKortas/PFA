package epi.PFA.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import epi.PFA.entities.Document;
import epi.PFA.sevice.DocumentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/document/")
public class RestDocumentController {

	@Autowired
	DocumentService documentService;

	@GetMapping("all")
	public List<Document> all() {
		return documentService.getAllDocuments();

	}

	@GetMapping("{id}")
	public Document getDocument(@PathVariable Long id) {
		return documentService.findDocumentById(id);
	}
	
	@GetMapping(path = "/image/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@PathVariable long id) {
		return documentService.getImage(id);
	}

	@PostMapping("add")
	public void ajouterDocument(@RequestParam("Document") String document,
			@RequestParam(value = "file", required = false) MultipartFile file) {
		try {
			Document p = new ObjectMapper().readValue(document, Document.class);
			documentService.saveDocument(p, file);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PutMapping("update")
	public void modifierDocument(@RequestParam("Document") String document,
			@RequestParam(value = "file", required = false) MultipartFile file) {
		try {
			Document p = new ObjectMapper().readValue(document, Document.class);
			documentService.persistDocument(p, file);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@DeleteMapping("{id}")
	public void deleteDocument(@PathVariable Long id) {
		documentService.deleteDocument(id); 
		//return "Suppression réussite";

	}

	/*@PutMapping("update")
	public Document updateDocument(@RequestBody Document p) {
		return documentService.persistDocument(p);
	}*/

}
