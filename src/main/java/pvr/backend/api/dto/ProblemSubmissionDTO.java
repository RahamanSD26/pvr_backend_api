package pvr.backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProblemSubmissionDTO {
    String userName;
    String email;
    String contactNumber;
    String problemStatement;
    Boolean isUpdate;
    String updatedProblemStatement;
    Date createdAt;
    Boolean isSolved;
    String currentGroup;
    Boolean isAdmin;
    String adminCount;
    String alternativeEmail;
    String AlternativeMobile;
}
