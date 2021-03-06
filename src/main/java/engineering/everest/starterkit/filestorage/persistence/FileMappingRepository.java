package engineering.everest.starterkit.filestorage.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FileMappingRepository extends JpaRepository<PersistableFileMapping, UUID> {
}
