/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdomain.service;

import java.util.ArrayList;
import java.util.List;
import mvcdemo.domain.ExamResult;

/**
 *
 * @author raminorujov
 */
public class ExamService {
    
    public List<ExamResult> getExamResult(int lessonId) {
        
//        Java 6
//        List<ExamResult> result = new ArrayList<ExamResult>();
        
        // Java 7 diamond operator
        List<ExamResult> result = new ArrayList<>();
        
        ExamResult e1 = new ExamResult();
        e1.setStudentNo("100105019");
        e1.setStudent("Elmar Aliyev");
        e1.setLessonNo("COMP 351.01");
        e1.setLesson("Java Web Programming");
        e1.setResult(92.00);
        result.add(e1);
        
        ExamResult e2 = new ExamResult();
        e2.setStudentNo("110105015");
        e2.setStudent("Huseyn Mammadov");
        e2.setLessonNo("COMP 351.01");
        e2.setLesson("Java Web Programming");
        e2.setResult(100.00);
        result.add(e2);
        
        ExamResult e3 = new ExamResult();
        e3.setStudentNo("100105030");
        e3.setStudent("Shahin Atakishiyev");
        e3.setLessonNo("COMP 351.01");
        e3.setLesson("Java Web Programming");
        e3.setResult(84.00);
        result.add(e3);
        
        return result;
    }
}
