package pvr.backend.api.service;

import pvr.backend.api.domain.ProblemSubmission;
import pvr.backend.api.dto.ProblemSubmissionDTO;

public interface ProblemSubmissionService {
    ProblemSubmissionDTO createEntity(ProblemSubmissionDTO problemSubmissionDTO) throws Exception;
    ProblemSubmissionDTO getEntityByContact(String contact) throws Exception;
    ProblemSubmissionDTO getEntityByProblemStatement(String problemStatement)throws Exception;
    String joinGroupByContactNo(ProblemSubmissionDTO problemSubmissionDTO) throws Exception;
}
