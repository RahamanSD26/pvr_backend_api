package pvr.backend.api.service;

import pvr.backend.api.dto.ProblemSubmissionDTO;

public interface ProblemSubmissionService {
    public ProblemSubmissionDTO createEntity(ProblemSubmissionDTO problemSubmissionDTO) throws Exception;
}
