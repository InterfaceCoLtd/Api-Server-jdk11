package xyz.interfacesejong.interfaceapi.domain.file.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<UploadFile, Long> {
}
