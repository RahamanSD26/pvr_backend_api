package pvr.backend.api.mapper;

import org.springframework.stereotype.Component;
import pvr.backend.api.domain.ProblemSubmission;
import pvr.backend.api.dto.ProblemSubmissionDTO;

@Component
public class ProblemSubmissionMapper {

    public static ProblemSubmission toEntity(ProblemSubmissionDTO dto){
        ProblemSubmission entity = new ProblemSubmission();
        entity.setId(dto.getId());
        entity.setUserName(dto.getUserName());
        entity.setEmail(dto.getEmail());
        entity.setContactNumber(dto.getContactNumber());
        entity.setProblemStatement(dto.getProblemStatement());
        entity.setIsUpdate(dto.getIsUpdate());
        entity.setUpdatedProblemStatement(dto.getUpdatedProblemStatement());
        entity.setCreatedAt(dto.getCreatedAt());
        entity.setIsSolved(dto.getIsSolved());
        entity.setCurrentGroup(dto.getCurrentGroup());
        entity.setIsAdmin(dto.getIsAdmin());
        entity.setAdminCount(dto.getAdminCount());
        entity.setAlternativeEmail(dto.getAlternativeEmail());
        entity.setAlternativeMobile(dto.getAlternativeMobile());
        entity.setMemberContactNumberList(dto.getMemberContactNumberList());

         return entity;
    }
    public static ProblemSubmissionDTO toDTO(ProblemSubmission entity){
        ProblemSubmissionDTO dto = new ProblemSubmissionDTO();
        dto.setId(entity.getId());
        dto.setUserName(entity.getUserName());
        dto.setEmail(entity.getEmail());
        dto.setContactNumber(entity.getContactNumber());
        dto.setProblemStatement(entity.getProblemStatement());
        dto.setIsUpdate(entity.getIsUpdate());
        dto.setUpdatedProblemStatement(entity.getUpdatedProblemStatement());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setIsSolved(entity.getIsSolved());
        dto.setCurrentGroup(entity.getCurrentGroup());
        dto.setIsAdmin(entity.getIsAdmin());
        dto.setAdminCount(entity.getAdminCount());
        dto.setAlternativeEmail(entity.getAlternativeEmail());
        dto.setAlternativeMobile(entity.getAlternativeMobile());
        dto.setMemberContactNumberList(entity.getMemberContactNumberList());
        return dto;
    }

    public static ProblemSubmissionDTO toUpdateDTO(ProblemSubmissionDTO currDto, ProblemSubmissionDTO newDto){
        if(newDto.getId()!=null){
            currDto.setId(newDto.getId());
        }
        if(newDto.getUserName()!=null){
            currDto.setUserName(newDto.getUserName());
        }
        if(newDto.getEmail()!=null){
            currDto.setEmail(newDto.getEmail());
        }
        if(newDto.getContactNumber()!=null){
            currDto.setContactNumber(newDto.getContactNumber());
        }
        if(newDto.getProblemStatement()!=null){
            currDto.setProblemStatement(newDto.getProblemStatement());
        }
        if(newDto.getIsUpdate()!=null){
            currDto.setIsUpdate(newDto.getIsUpdate());
        }
        if(newDto.getUpdatedProblemStatement()!=null){
            currDto.setUpdatedProblemStatement(newDto.getUpdatedProblemStatement());
        }
        if(newDto.getCreatedAt()!=null){
            currDto.setCreatedAt(newDto.getCreatedAt());
        }
        if(newDto.getIsSolved()!=null){
            currDto.setIsSolved(newDto.getIsSolved());
        }
        if(newDto.getCurrentGroup()!=null){
            currDto.setCurrentGroup(newDto.getCurrentGroup());
        }
        if(newDto.getIsAdmin()!=null){
            currDto.setIsAdmin(newDto.getIsAdmin());
        }
        if(newDto.getAdminCount()!=null){
            currDto.setAdminCount(newDto.getAdminCount());
        }
        if(newDto.getAlternativeEmail()!=null){
            currDto.setAlternativeEmail(newDto.getAlternativeEmail());
        }
        if(newDto.getAlternativeMobile()!=null){
            currDto.setAlternativeMobile(newDto.getAlternativeMobile());
        }
        if(newDto.getMemberContactNumberList()!=null){
            currDto.setMemberContactNumberList(newDto.getMemberContactNumberList());
        }
        return currDto;
    }

}
