package pvr.backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProblemSubmissionDTO {
    @Id
    String id;
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
    List<String> memberContactNumberList;
}
