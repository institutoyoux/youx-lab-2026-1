package com.projetos.backend.services;

import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileService {
    private final MinioClient minioClient;
    public String salvarArquivo(String pasta, MultipartFile arquivo) {
        String id = UUID.randomUUID().toString();
        String ext = StringUtils.getFilenameExtension(arquivo.getOriginalFilename());
        String nome = pasta + "/" + id + "." + ext;
        try {
            InputStream conteudo = arquivo.getInputStream();
            minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket("usuarios").object(nome).stream(conteudo, arquivo.getSize(), -1)
                            .contentType(arquivo.getContentType())
                            .build()
            );
            return nome;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar arquivo: " + e);
        }
    }
    public InputStream obterArquivo(String diretorio) {
        try {
           return minioClient.getObject(
                    GetObjectArgs.builder()
                            .bucket("usuarios")
                            .object(diretorio)
                            .build());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter arquivo: " + e);
        }
    }
}
