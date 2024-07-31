package pvr.backend.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProblemSubmission {
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
