package pvr.backend.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pvr.backend.api.domain.ProblemSubmission;
import pvr.backend.api.dto.ProblemSubmissionDTO;

import java.util.Optional;

@Repository
public interface ProblemSubmissionRepository extends MongoRepository<ProblemSubmission,String> {
   Optional<ProblemSubmissionDTO> findByEmail(String email);
   Optional<ProblemSubmissionDTO> findByContactNumber(String email);
}
