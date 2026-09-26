package com.projetos.backend.controllers;

import com.projetos.backend.services.FileService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("files")
@CrossOrigin
@RequiredArgsConstructor
public class FilesController {
    private final FileService fileService;
    @GetMapping("/download/{username}/{fileName:.+}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable String username,@PathVariable String fileName, HttpServletRequest request) throws IOException {
        InputStream arquivo = fileService.obterArquivo(username + "/" + fileName);
        return ResponseEntity.ok()
                .header(
                        HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + fileName + "\""
                )
                .body(IOUtils.toByteArray(arquivo));
    }
}
