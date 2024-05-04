package coms.Phase3_Practiceproject6.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.Phase3_Practiceproject6.entities.FilesInfo;



@Repository
public interface FilesRepo extends JpaRepository<FilesInfo, String> {

}
