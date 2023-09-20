package xyz.interfacesejong.interfaceapi.domain.file.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.interfacesejong.interfaceapi.domain.file.domain.UploadFile;
import xyz.interfacesejong.interfaceapi.domain.file.service.FileService;

import java.util.List;

@RestController
@RequestMapping("/api/file")
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/findByBoardId")
    public ResponseEntity<List<UploadFile>> getAllUploadFiles(@RequestParam("boardId")Long id) throws Exception {
        return ResponseEntity.ok(fileService.getAllUploadFiles(id));
    }
}
