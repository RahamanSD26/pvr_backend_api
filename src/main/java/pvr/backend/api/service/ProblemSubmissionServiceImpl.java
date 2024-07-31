package pvr.backend.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pvr.backend.api.domain.ProblemSubmission;
import pvr.backend.api.dto.ProblemSubmissionDTO;
import pvr.backend.api.mapper.ProblemSubmissionMapper;
import pvr.backend.api.repository.ProblemSubmissionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProblemSubmissionServiceImpl implements ProblemSubmissionService {
    @Autowired
    private ProblemSubmissionRepository problemSubmissionRepository;
    @Override
    public ProblemSubmissionDTO createEntity(ProblemSubmissionDTO problemSubmissionDTO) throws Exception {
           if (problemSubmissionRepository.findByEmail(problemSubmissionDTO.getEmail()).isPresent() || problemSubmissionRepository.findByContactNumber(problemSubmissionDTO.getContactNumber()).isPresent()||problemSubmissionRepository.findByProblemStatement(problemSubmissionDTO.getProblemStatement()).isPresent()) {
               throw new Exception("Entity already present with given contact number or Email or ProblemStatement");
           }
        List<String> contact= new ArrayList<>();
        contact.add(problemSubmissionDTO.getContactNumber());
        problemSubmissionDTO.setMemberContactNumberList(contact);
       return ProblemSubmissionMapper.toDTO(problemSubmissionRepository.save(ProblemSubmissionMapper.toEntity(problemSubmissionDTO)));
    }

    @Override
    public ProblemSubmissionDTO getEntityByContact(String contact) throws Exception {
        Optional<ProblemSubmissionDTO> problemSubmissionDTOOpt=problemSubmissionRepository.findByContactNumber(contact);

        if(problemSubmissionDTOOpt.isEmpty()){
            throw new Exception("Can not find entity with given contact");
        }
        return problemSubmissionDTOOpt.get();
    }

    @Override
    public ProblemSubmissionDTO getEntityByProblemStatement(String problemStatement)throws Exception{
        Optional<ProblemSubmissionDTO> problemSubmissionDTOOpt=problemSubmissionRepository.findByProblemStatement(problemStatement);
        if(problemSubmissionDTOOpt.isEmpty()){
            throw new Exception("Group does not exists please create new");
        }else{
            return problemSubmissionDTOOpt.get();
        }
    }

    @Override
    public String joinGroupByContactNo(ProblemSubmissionDTO problemSubmissionDTO) throws Exception {
        // Retrieve the existing entity by a unique identifier (e.g., problem statement)
        Optional<ProblemSubmissionDTO> existingEntityOpt = problemSubmissionRepository.findByProblemStatement(problemSubmissionDTO.getProblemStatement());

        ProblemSubmissionDTO available = existingEntityOpt.get();

        // Check if the contact number is already in the group
        if (available.getMemberContactNumberList().contains(problemSubmissionDTO.getContactNumber())) {
            throw new Exception("You have already been added to the Group");
        }

        // Add the contact number to the group
        available.getMemberContactNumberList().add(problemSubmissionDTO.getContactNumber());

        // Convert the DTO back to the entity and save the updated entity
        ProblemSubmission updatedEntity = ProblemSubmissionMapper.toEntity(available);
        updatedEntity.setId(available.getId());  // Ensure the ID is set to the existing entity's ID
        problemSubmissionRepository.save(updatedEntity);

        return "Added to group successfully";
    }


}