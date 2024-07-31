package pvr.backend.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pvr.backend.api.dto.ProblemSubmissionDTO;
import pvr.backend.api.mapper.ProblemSubmissionMapper;
import pvr.backend.api.repository.ProblemSubmissionRepository;
@Service
public class ProblemSubmissionServiceImpl implements ProblemSubmissionService {
    @Autowired
    private ProblemSubmissionRepository problemStatementRepository;
    @Override
    public ProblemSubmissionDTO createEntity(ProblemSubmissionDTO problemSubmissionDTO) throws Exception {
       if(problemStatementRepository.findByEmail(problemSubmissionDTO.getEmail()).isPresent()|| problemStatementRepository.findByContactNumber(problemSubmissionDTO.getContactNumber()).isPresent()){
            throw new Exception("Entity already present with given contact number or Email");
       }
       return ProblemSubmissionMapper.toDTO(problemStatementRepository.save(ProblemSubmissionMapper.toEntity(problemSubmissionDTO)));
    }
}
