/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo.domain;

/**
 *
 * @author raminorujov
 */
public class ExamResult {
    private String student;
    private String studentNo;
    private String lesson;
    private String lessonNo;
    private double result;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLessonNo() {
        return lessonNo;
    }

    public void setLessonNo(String lessonNo) {
        this.lessonNo = lessonNo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }          
    
}
