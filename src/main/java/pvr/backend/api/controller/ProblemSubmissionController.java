package pvr.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pvr.backend.api.config.RestEndPoints;
import pvr.backend.api.dto.ProblemSubmissionDTO;
import pvr.backend.api.service.ProblemSubmissionService;

@RestController
@RequestMapping(RestEndPoints.PROBLEM_SUBMISSION)
public class ProblemSubmissionController {
    @Autowired
    private ProblemSubmissionService problemSubmissionService;
    @PostMapping("/")
    public ResponseEntity<ProblemSubmissionDTO> createEntity(@RequestBody ProblemSubmissionDTO problemSubmissionDTO)throws Exception{
        return new ResponseEntity<>(problemSubmissionService.createEntity(problemSubmissionDTO), HttpStatus.CREATED);
    }
}
