package pvr.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/{contact}")
    public ResponseEntity<ProblemSubmissionDTO> getEntityByContact(@PathVariable(name = "contact")String contact)throws Exception{
        return new ResponseEntity<>(problemSubmissionService.getEntityByContact(contact), HttpStatus.OK);
    }
    @GetMapping("/get-by-problem-statement/{problemStatement}")
    public ResponseEntity<ProblemSubmissionDTO> getEntityByProblemStatement(@PathVariable(name = "problemStatement")String problemStatement)throws Exception{
        return new ResponseEntity<>(problemSubmissionService.getEntityByProblemStatement(problemStatement), HttpStatus.OK);
    }

    @GetMapping("/joinGroup")
    public ResponseEntity<String> joinGroup(@RequestBody ProblemSubmissionDTO problemSubmissionDTO)throws Exception {
        return new ResponseEntity<>(problemSubmissionService.joinGroupByContactNo(problemSubmissionDTO), HttpStatus.OK);
    }
}
